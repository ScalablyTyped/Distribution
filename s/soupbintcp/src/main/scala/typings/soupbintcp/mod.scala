package typings.soupbintcp

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Socket
import typings.soupbintcp.anon.Address
import typings.soupbintcp.anon.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("soupbintcp", "Client")
  @js.native
  class Client protected () extends EventEmitter {
    def this(options: Host) = this()
    def this(options: Host, callback: js.Function0[Unit]) = this()
    
    def end(): Unit = js.native
    
    def login(payload: LoginRequestPayload): Unit = js.native
    def login(payload: LoginRequestPayload, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    def logout(): Unit = js.native
    def logout(callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    def send(payload: js.Any): Unit = js.native
    def send(payload: js.Any, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): Unit = js.native
  }
  
  @JSImport("soupbintcp", "Connection")
  @js.native
  class Connection protected () extends EventEmitter {
    def this(socket: Socket, options: ConnectionOptions) = this()
    
    def end(): Unit = js.native
    
    def send(packetType: PacketType, payload: js.Any): Unit = js.native
    def send(
      packetType: PacketType,
      payload: js.Any,
      callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]
    ): Unit = js.native
  }
  
  @js.native
  sealed trait PacketType extends StObject
  @JSImport("soupbintcp", "PacketType")
  @js.native
  object PacketType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PacketType with Double] = js.native
    
    // U
    @js.native
    sealed trait CLIENT_HEARTBEAT extends PacketType
    /* 0x52 */ val CLIENT_HEARTBEAT: typings.soupbintcp.mod.PacketType.CLIENT_HEARTBEAT with Double = js.native
    
    @js.native
    sealed trait DEBUG extends PacketType
    /* 0x2b */ val DEBUG: typings.soupbintcp.mod.PacketType.DEBUG with Double = js.native
    
    // H
    @js.native
    sealed trait END_OF_SESSION extends PacketType
    /* 0x5a */ val END_OF_SESSION: typings.soupbintcp.mod.PacketType.END_OF_SESSION with Double = js.native
    
    // +
    @js.native
    sealed trait LOGIN_ACCEPTED extends PacketType
    /* 0x41 */ val LOGIN_ACCEPTED: typings.soupbintcp.mod.PacketType.LOGIN_ACCEPTED with Double = js.native
    
    // A
    @js.native
    sealed trait LOGIN_REJECTED extends PacketType
    /* 0x4a */ val LOGIN_REJECTED: typings.soupbintcp.mod.PacketType.LOGIN_REJECTED with Double = js.native
    
    // Z
    @js.native
    sealed trait LOGIN_REQUEST extends PacketType
    /* 0x4c */ val LOGIN_REQUEST: typings.soupbintcp.mod.PacketType.LOGIN_REQUEST with Double = js.native
    
    // R
    @js.native
    sealed trait LOGOUT_REQUEST extends PacketType
    /* 0x4f */ val LOGOUT_REQUEST: typings.soupbintcp.mod.PacketType.LOGOUT_REQUEST with Double = js.native
    
    // J
    @js.native
    sealed trait SEQUENCED_DATA extends PacketType
    /* 0x53 */ val SEQUENCED_DATA: typings.soupbintcp.mod.PacketType.SEQUENCED_DATA with Double = js.native
    
    // S
    @js.native
    sealed trait SERVER_HEARTBEAT extends PacketType
    /* 0x48 */ val SERVER_HEARTBEAT: typings.soupbintcp.mod.PacketType.SERVER_HEARTBEAT with Double = js.native
    
    // L
    @js.native
    sealed trait UNSEQUENCED_DATA extends PacketType
    /* 0x55 */ val UNSEQUENCED_DATA: typings.soupbintcp.mod.PacketType.UNSEQUENCED_DATA with Double = js.native
  }
  
  @JSImport("soupbintcp", "Parser")
  @js.native
  class Parser protected () extends StObject {
    def this(callback: js.Function2[/* packetType */ PacketType, /* payload */ Buffer, Unit]) = this()
    
    def parse(data: Buffer): Unit = js.native
  }
  
  @JSImport("soupbintcp", "Server")
  @js.native
  class Server protected () extends EventEmitter {
    def this(options: Host) = this()
    def this(options: Host, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]) = this()
    
    def address(): Address = js.native
    
    def close(callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("soupbintcp", "Session")
  @js.native
  class Session protected () extends EventEmitter {
    def this(socket: Socket) = this()
    
    def accept(payload: LoginAcceptedPayload): Unit = js.native
    def accept(payload: LoginAcceptedPayload, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    def end(): Unit = js.native
    
    def ending(): Unit = js.native
    def ending(callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    def reject(payload: LoginRejectedPayload): Unit = js.native
    def reject(payload: LoginRejectedPayload, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    def send(payload: js.Any): Unit = js.native
    def send(payload: js.Any, callback: js.Function1[/* data */ js.UndefOr[js.Any], Unit]): Unit = js.native
  }
  
  @JSImport("soupbintcp", "formatLoginAccepted")
  @js.native
  def formatLoginAccepted(payload: LoginAcceptedPayload): Buffer = js.native
  
  @JSImport("soupbintcp", "formatLoginRejected")
  @js.native
  def formatLoginRejected(payload: LoginRejectedPayload): Buffer = js.native
  
  @JSImport("soupbintcp", "formatLoginRequest")
  @js.native
  def formatLoginRequest(payload: LoginRequestPayload): Buffer = js.native
  
  @JSImport("soupbintcp", "parseLoginAccepted")
  @js.native
  def parseLoginAccepted(payload: Buffer): LoginAcceptedPayload = js.native
  
  @JSImport("soupbintcp", "parseLoginRejected")
  @js.native
  def parseLoginRejected(payload: Buffer): LoginRejectedPayload = js.native
  
  @JSImport("soupbintcp", "parseLoginRequest")
  @js.native
  def parseLoginRequest(payload: Buffer): LoginRequestPayload = js.native
  
  @js.native
  trait ConnectionOptions extends StObject {
    
    var heartbeatPacketType: PacketType = js.native
    
    var keepAliveMillis: js.UndefOr[Double] = js.native
    
    var rxTimeoutMillis: js.UndefOr[Double] = js.native
    
    var txIntervalMillis: js.UndefOr[Double] = js.native
  }
  object ConnectionOptions {
    
    @scala.inline
    def apply(heartbeatPacketType: PacketType): ConnectionOptions = {
      val __obj = js.Dynamic.literal(heartbeatPacketType = heartbeatPacketType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    @scala.inline
    implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeartbeatPacketType(value: PacketType): Self = StObject.set(x, "heartbeatPacketType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveMillis(value: Double): Self = StObject.set(x, "keepAliveMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveMillisUndefined: Self = StObject.set(x, "keepAliveMillis", js.undefined)
      
      @scala.inline
      def setRxTimeoutMillis(value: Double): Self = StObject.set(x, "rxTimeoutMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxTimeoutMillisUndefined: Self = StObject.set(x, "rxTimeoutMillis", js.undefined)
      
      @scala.inline
      def setTxIntervalMillis(value: Double): Self = StObject.set(x, "txIntervalMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxIntervalMillisUndefined: Self = StObject.set(x, "txIntervalMillis", js.undefined)
    }
  }
  
  @js.native
  trait LoginAcceptedPayload extends StObject {
    
    var sequenceNumber: Double = js.native
    
    var username: String = js.native
  }
  object LoginAcceptedPayload {
    
    @scala.inline
    def apply(sequenceNumber: Double, username: String): LoginAcceptedPayload = {
      val __obj = js.Dynamic.literal(sequenceNumber = sequenceNumber.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginAcceptedPayload]
    }
    
    @scala.inline
    implicit class LoginAcceptedPayloadMutableBuilder[Self <: LoginAcceptedPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSequenceNumber(value: Double): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoginRejectedPayload extends StObject {
    
    var rejectReasonCode: String = js.native
  }
  object LoginRejectedPayload {
    
    @scala.inline
    def apply(rejectReasonCode: String): LoginRejectedPayload = {
      val __obj = js.Dynamic.literal(rejectReasonCode = rejectReasonCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginRejectedPayload]
    }
    
    @scala.inline
    implicit class LoginRejectedPayloadMutableBuilder[Self <: LoginRejectedPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRejectReasonCode(value: String): Self = StObject.set(x, "rejectReasonCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoginRequestPayload extends StObject {
    
    var password: String = js.native
    
    var requestedSequenceNumber: Double = js.native
    
    var requestedSession: String = js.native
    
    var username: String = js.native
  }
  object LoginRequestPayload {
    
    @scala.inline
    def apply(password: String, requestedSequenceNumber: Double, requestedSession: String, username: String): LoginRequestPayload = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], requestedSequenceNumber = requestedSequenceNumber.asInstanceOf[js.Any], requestedSession = requestedSession.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginRequestPayload]
    }
    
    @scala.inline
    implicit class LoginRequestPayloadMutableBuilder[Self <: LoginRequestPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestedSequenceNumber(value: Double): Self = StObject.set(x, "requestedSequenceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestedSession(value: String): Self = StObject.set(x, "requestedSession", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
