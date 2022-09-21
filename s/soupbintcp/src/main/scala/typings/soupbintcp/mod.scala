package typings.soupbintcp

import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Socket
import typings.soupbintcp.anon.Address
import typings.soupbintcp.anon.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("soupbintcp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("soupbintcp", "Client")
  @js.native
  open class Client protected () extends EventEmitter {
    def this(options: Host) = this()
    def this(options: Host, callback: js.Function0[Unit]) = this()
    
    def end(): Unit = js.native
    
    def login(payload: LoginRequestPayload): Unit = js.native
    def login(payload: LoginRequestPayload, callback: js.Function1[/* data */ js.UndefOr[Any], Unit]): Unit = js.native
    
    def logout(): Unit = js.native
    def logout(callback: js.Function1[/* data */ js.UndefOr[Any], Unit]): Unit = js.native
    
    def send(payload: Any): Unit = js.native
    def send(payload: Any, callback: js.Function1[/* data */ js.UndefOr[Any], Unit]): Unit = js.native
  }
  
  @JSImport("soupbintcp", "Connection")
  @js.native
  open class Connection protected () extends EventEmitter {
    def this(socket: Socket, options: ConnectionOptions) = this()
    
    def end(): Unit = js.native
    
    def send(packetType: PacketType, payload: Any): Unit = js.native
    def send(packetType: PacketType, payload: Any, callback: js.Function1[/* data */ js.UndefOr[Any], Unit]): Unit = js.native
  }
  
  @js.native
  sealed trait PacketType extends StObject
  @JSImport("soupbintcp", "PacketType")
  @js.native
  object PacketType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PacketType & Double] = js.native
    
    // U
    @js.native
    sealed trait CLIENT_HEARTBEAT
      extends StObject
         with PacketType
    /* 0x52 */ val CLIENT_HEARTBEAT: typings.soupbintcp.mod.PacketType.CLIENT_HEARTBEAT & Double = js.native
    
    @js.native
    sealed trait DEBUG
      extends StObject
         with PacketType
    /* 0x2b */ val DEBUG: typings.soupbintcp.mod.PacketType.DEBUG & Double = js.native
    
    // H
    @js.native
    sealed trait END_OF_SESSION
      extends StObject
         with PacketType
    /* 0x5a */ val END_OF_SESSION: typings.soupbintcp.mod.PacketType.END_OF_SESSION & Double = js.native
    
    // +
    @js.native
    sealed trait LOGIN_ACCEPTED
      extends StObject
         with PacketType
    /* 0x41 */ val LOGIN_ACCEPTED: typings.soupbintcp.mod.PacketType.LOGIN_ACCEPTED & Double = js.native
    
    // A
    @js.native
    sealed trait LOGIN_REJECTED
      extends StObject
         with PacketType
    /* 0x4a */ val LOGIN_REJECTED: typings.soupbintcp.mod.PacketType.LOGIN_REJECTED & Double = js.native
    
    // Z
    @js.native
    sealed trait LOGIN_REQUEST
      extends StObject
         with PacketType
    /* 0x4c */ val LOGIN_REQUEST: typings.soupbintcp.mod.PacketType.LOGIN_REQUEST & Double = js.native
    
    // R
    @js.native
    sealed trait LOGOUT_REQUEST
      extends StObject
         with PacketType
    /* 0x4f */ val LOGOUT_REQUEST: typings.soupbintcp.mod.PacketType.LOGOUT_REQUEST & Double = js.native
    
    // J
    @js.native
    sealed trait SEQUENCED_DATA
      extends StObject
         with PacketType
    /* 0x53 */ val SEQUENCED_DATA: typings.soupbintcp.mod.PacketType.SEQUENCED_DATA & Double = js.native
    
    // S
    @js.native
    sealed trait SERVER_HEARTBEAT
      extends StObject
         with PacketType
    /* 0x48 */ val SERVER_HEARTBEAT: typings.soupbintcp.mod.PacketType.SERVER_HEARTBEAT & Double = js.native
    
    // L
    @js.native
    sealed trait UNSEQUENCED_DATA
      extends StObject
         with PacketType
    /* 0x55 */ val UNSEQUENCED_DATA: typings.soupbintcp.mod.PacketType.UNSEQUENCED_DATA & Double = js.native
  }
  
  @JSImport("soupbintcp", "Parser")
  @js.native
  open class Parser protected () extends StObject {
    def this(callback: js.Function2[/* packetType */ PacketType, /* payload */ Buffer, Unit]) = this()
    
    def parse(data: Buffer): Unit = js.native
  }
  
  @JSImport("soupbintcp", "Server")
  @js.native
  open class Server protected () extends EventEmitter {
    def this(options: Host) = this()
    def this(options: Host, callback: js.Function1[/* data */ js.UndefOr[Any], Unit]) = this()
    
    def address(): Address = js.native
    
    def close(callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("soupbintcp", "Session")
  @js.native
  open class Session protected () extends EventEmitter {
    def this(socket: Socket) = this()
    
    def accept(payload: LoginAcceptedPayload): Unit = js.native
    def accept(payload: LoginAcceptedPayload, callback: js.Function1[/* data */ js.UndefOr[Any], Unit]): Unit = js.native
    
    def end(): Unit = js.native
    
    def ending(): Unit = js.native
    def ending(callback: js.Function1[/* data */ js.UndefOr[Any], Unit]): Unit = js.native
    
    def reject(payload: LoginRejectedPayload): Unit = js.native
    def reject(payload: LoginRejectedPayload, callback: js.Function1[/* data */ js.UndefOr[Any], Unit]): Unit = js.native
    
    def send(payload: Any): Unit = js.native
    def send(payload: Any, callback: js.Function1[/* data */ js.UndefOr[Any], Unit]): Unit = js.native
  }
  
  inline def formatLoginAccepted(payload: LoginAcceptedPayload): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLoginAccepted")(payload.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def formatLoginRejected(payload: LoginRejectedPayload): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLoginRejected")(payload.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def formatLoginRequest(payload: LoginRequestPayload): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLoginRequest")(payload.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def parseLoginAccepted(payload: Buffer): LoginAcceptedPayload = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLoginAccepted")(payload.asInstanceOf[js.Any]).asInstanceOf[LoginAcceptedPayload]
  
  inline def parseLoginRejected(payload: Buffer): LoginRejectedPayload = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLoginRejected")(payload.asInstanceOf[js.Any]).asInstanceOf[LoginRejectedPayload]
  
  inline def parseLoginRequest(payload: Buffer): LoginRequestPayload = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLoginRequest")(payload.asInstanceOf[js.Any]).asInstanceOf[LoginRequestPayload]
  
  trait ConnectionOptions extends StObject {
    
    var heartbeatPacketType: PacketType
    
    var keepAliveMillis: js.UndefOr[Double] = js.undefined
    
    var rxTimeoutMillis: js.UndefOr[Double] = js.undefined
    
    var txIntervalMillis: js.UndefOr[Double] = js.undefined
  }
  object ConnectionOptions {
    
    inline def apply(heartbeatPacketType: PacketType): ConnectionOptions = {
      val __obj = js.Dynamic.literal(heartbeatPacketType = heartbeatPacketType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    extension [Self <: ConnectionOptions](x: Self) {
      
      inline def setHeartbeatPacketType(value: PacketType): Self = StObject.set(x, "heartbeatPacketType", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveMillis(value: Double): Self = StObject.set(x, "keepAliveMillis", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveMillisUndefined: Self = StObject.set(x, "keepAliveMillis", js.undefined)
      
      inline def setRxTimeoutMillis(value: Double): Self = StObject.set(x, "rxTimeoutMillis", value.asInstanceOf[js.Any])
      
      inline def setRxTimeoutMillisUndefined: Self = StObject.set(x, "rxTimeoutMillis", js.undefined)
      
      inline def setTxIntervalMillis(value: Double): Self = StObject.set(x, "txIntervalMillis", value.asInstanceOf[js.Any])
      
      inline def setTxIntervalMillisUndefined: Self = StObject.set(x, "txIntervalMillis", js.undefined)
    }
  }
  
  trait LoginAcceptedPayload extends StObject {
    
    var sequenceNumber: Double
    
    var username: String
  }
  object LoginAcceptedPayload {
    
    inline def apply(sequenceNumber: Double, username: String): LoginAcceptedPayload = {
      val __obj = js.Dynamic.literal(sequenceNumber = sequenceNumber.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginAcceptedPayload]
    }
    
    extension [Self <: LoginAcceptedPayload](x: Self) {
      
      inline def setSequenceNumber(value: Double): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoginRejectedPayload extends StObject {
    
    var rejectReasonCode: String
  }
  object LoginRejectedPayload {
    
    inline def apply(rejectReasonCode: String): LoginRejectedPayload = {
      val __obj = js.Dynamic.literal(rejectReasonCode = rejectReasonCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginRejectedPayload]
    }
    
    extension [Self <: LoginRejectedPayload](x: Self) {
      
      inline def setRejectReasonCode(value: String): Self = StObject.set(x, "rejectReasonCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoginRequestPayload extends StObject {
    
    var password: String
    
    var requestedSequenceNumber: Double
    
    var requestedSession: String
    
    var username: String
  }
  object LoginRequestPayload {
    
    inline def apply(password: String, requestedSequenceNumber: Double, requestedSession: String, username: String): LoginRequestPayload = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], requestedSequenceNumber = requestedSequenceNumber.asInstanceOf[js.Any], requestedSession = requestedSession.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginRequestPayload]
    }
    
    extension [Self <: LoginRequestPayload](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setRequestedSequenceNumber(value: Double): Self = StObject.set(x, "requestedSequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setRequestedSession(value: String): Self = StObject.set(x, "requestedSession", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
