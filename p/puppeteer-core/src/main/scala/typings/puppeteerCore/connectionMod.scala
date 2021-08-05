package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteerCore.anon.Data
import typings.puppeteerCore.connectionTransportMod.ConnectionTransport
import typings.puppeteerCore.eventEmitterMod.EventEmitter
import typings.std.Error
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Connection", "CDPSession")
  @js.native
  class CDPSession protected () extends EventEmitter {
    /**
      * @internal
      */
    def this(connection: Connection, targetType: String, sessionId: String) = this()
    
    /* private */ var _callbacks: js.Any = js.native
    
    /**
      * @internal
      */
    var _connection: Connection = js.native
    
    /**
      * @internal
      */
    def _onClosed(): Unit = js.native
    
    /**
      * @internal
      */
    def _onMessage(`object`: CDPSessionOnMessageObject): Unit = js.native
    
    /* private */ var _sessionId: js.Any = js.native
    
    /* private */ var _targetType: js.Any = js.native
    
    /**
      * Detaches the cdpSession from the target. Once detached, the cdpSession object
      * won't emit any events and can't be used to send messages.
      */
    def detach(): js.Promise[Unit] = js.native
    
    @JSName("send")
    def send_paramsType[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 498 */ js.Any */](
      method: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param paramArgs because its type ProtocolMapping.Commands[T]['paramsType'] is not an array type */ paramArgs: /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['paramsType'] */ js.Any
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['returnType'] */ js.Any
      ] = js.native
  }
  
  object CDPSessionEmittedEvents {
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Connection", "CDPSessionEmittedEvents.Disconnected")
    @js.native
    val Disconnected: js.Symbol = js.native
  }
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Connection", "Connection")
  @js.native
  class Connection protected () extends EventEmitter {
    def this(url: String, transport: ConnectionTransport) = this()
    def this(url: String, transport: ConnectionTransport, delay: Double) = this()
    
    var _callbacks: Map[Double, ConnectionCallback] = js.native
    
    var _closed: Boolean = js.native
    
    var _delay: Double = js.native
    
    var _lastId: Double = js.native
    
    def _onClose(): Unit = js.native
    
    def _onMessage(message: String): js.Promise[Unit] = js.native
    
    def _rawSend(message: Record[String, js.Any]): Double = js.native
    
    var _sessions: Map[String, CDPSession] = js.native
    
    var _transport: ConnectionTransport = js.native
    
    var _url: String = js.native
    
    /**
      * @param {Protocol.Target.TargetInfo} targetInfo
      * @returns {!Promise<!CDPSession>}
      */
    def createSession(targetInfo: TargetInfo): js.Promise[CDPSession] = js.native
    
    def dispose(): Unit = js.native
    
    @JSName("send")
    def send_paramsType[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 498 */ js.Any */](
      method: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param paramArgs because its type ProtocolMapping.Commands[T]['paramsType'] is not an array type */ paramArgs: /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['paramsType'] */ js.Any
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['returnType'] */ js.Any
      ] = js.native
    
    /**
      * @param {string} sessionId
      * @returns {?CDPSession}
      */
    def session(sessionId: String): CDPSession | Null = js.native
    
    def url(): String = js.native
  }
  /* static members */
  object Connection {
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Connection", "Connection")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromSession(session: CDPSession): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSession")(session.asInstanceOf[js.Any]).asInstanceOf[Connection]
  }
  
  object ConnectionEmittedEvents {
    
    @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Connection", "ConnectionEmittedEvents.Disconnected")
    @js.native
    val Disconnected: js.Symbol = js.native
  }
  
  trait CDPSessionOnMessageObject extends StObject {
    
    var error: Data
    
    var id: js.UndefOr[Double] = js.undefined
    
    var method: String
    
    var params: Record[String, js.Any]
    
    var result: js.UndefOr[js.Any] = js.undefined
  }
  object CDPSessionOnMessageObject {
    
    inline def apply(error: Data, method: String, params: Record[String, js.Any]): CDPSessionOnMessageObject = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[CDPSessionOnMessageObject]
    }
    
    extension [Self <: CDPSessionOnMessageObject](x: Self) {
      
      inline def setError(value: Data): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Record[String, js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  trait ConnectionCallback extends StObject {
    
    var error: Error
    
    var method: String
    
    var reject: js.Function
    
    var resolve: js.Function
  }
  object ConnectionCallback {
    
    inline def apply(error: Error, method: String, reject: js.Function, resolve: js.Function): ConnectionCallback = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionCallback]
    }
    
    extension [Self <: ConnectionCallback](x: Self) {
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setReject(value: js.Function): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: js.Function): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
  }
}
