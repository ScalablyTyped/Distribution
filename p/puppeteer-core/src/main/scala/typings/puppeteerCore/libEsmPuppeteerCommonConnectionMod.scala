package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typings.puppeteerCore.anon.Code
import typings.puppeteerCore.libEsmPuppeteerCommonConnectionTransportMod.ConnectionTransport
import typings.puppeteerCore.libEsmPuppeteerCommonErrorsMod.ProtocolError
import typings.puppeteerCore.libEsmPuppeteerCommonEventEmitterMod.EventEmitter
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerCommonConnectionMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/Connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/Connection", "CDPSession")
  @js.native
  /**
    * @internal
    */
  open class CDPSession () extends EventEmitter {
    
    def connection(): js.UndefOr[Connection] = js.native
    
    /**
      * Detaches the cdpSession from the target. Once detached, the cdpSession object
      * won't emit any events and can't be used to send messages.
      */
    def detach(): js.Promise[Unit] = js.native
    
    /**
      * Returns the session's id.
      */
    def id(): String = js.native
    
    @JSName("send")
    def send_paramsType[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 538, starting with typings.puppeteerCore.puppeteerCoreStrings.ConsoleDotclearMessages, typings.puppeteerCore.puppeteerCoreStrings.ConsoleDotdisable, typings.puppeteerCore.puppeteerCoreStrings.ConsoleDotenable */ Any */](
      method: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param paramArgs because its type ProtocolMapping.Commands[T]['paramsType'] is not an array type */ paramArgs: /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['paramsType'] */ js.Any
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['returnType'] */ js.Any
      ] = js.native
  }
  
  object CDPSessionEmittedEvents {
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/Connection", "CDPSessionEmittedEvents.Disconnected")
    @js.native
    val Disconnected: js.Symbol = js.native
  }
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/Connection", "CDPSessionImpl")
  @js.native
  open class CDPSessionImpl protected () extends CDPSession {
    /**
      * @internal
      */
    def this(connection: Connection, targetType: String, sessionId: String) = this()
    
    /**
      * @internal
      */
    def _onClosed(): Unit = js.native
    
    /**
      * @internal
      */
    def _onMessage(`object`: CDPSessionOnMessageObject): Unit = js.native
    
    /* private */ var `private`: Any = js.native
  }
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/Connection", "Connection")
  @js.native
  open class Connection protected () extends EventEmitter {
    def this(url: String, transport: ConnectionTransport) = this()
    def this(url: String, transport: ConnectionTransport, delay: Double) = this()
    
    /**
      * @internal
      */
    def _closed: Boolean = js.native
    
    /**
      * @internal
      */
    def _createSession(targetInfo: TargetInfo): js.Promise[CDPSession] = js.native
    def _createSession(targetInfo: TargetInfo, isAutoAttachEmulated: Boolean): js.Promise[CDPSession] = js.native
    
    /**
      * @internal
      */
    def _rawSend(message: Record[String, Any]): Double = js.native
    
    /**
      * @internal
      */
    def _sessions: Map[String, CDPSession] = js.native
    
    /**
      * @param targetInfo - The target info
      * @returns The CDP session that is created
      */
    def createSession(targetInfo: TargetInfo): js.Promise[CDPSession] = js.native
    
    def dispose(): Unit = js.native
    
    /**
      * @internal
      */
    def isAutoAttached(targetId: String): Boolean = js.native
    
    /**
      * @internal
      */
    /* protected */ def onMessage(message: String): js.Promise[Unit] = js.native
    
    /* private */ var `private`: Any = js.native
    
    @JSName("send")
    def send_paramsType[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 538, starting with typings.puppeteerCore.puppeteerCoreStrings.ConsoleDotclearMessages, typings.puppeteerCore.puppeteerCoreStrings.ConsoleDotdisable, typings.puppeteerCore.puppeteerCoreStrings.ConsoleDotenable */ Any */](
      method: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param paramArgs because its type ProtocolMapping.Commands[T]['paramsType'] is not an array type */ paramArgs: /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['paramsType'] */ js.Any
    ): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['returnType'] */ js.Any
      ] = js.native
    
    /**
      * @param sessionId - The session id
      * @returns The current CDP session if it exists
      */
    def session(sessionId: String): CDPSession | Null = js.native
    
    def url(): String = js.native
  }
  /* static members */
  object Connection {
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/Connection", "Connection")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromSession(session: CDPSession): js.UndefOr[Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSession")(session.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Connection]]
  }
  
  object ConnectionEmittedEvents {
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/Connection", "ConnectionEmittedEvents.Disconnected")
    @js.native
    val Disconnected: js.Symbol = js.native
  }
  
  inline def isTargetClosedError(err: js.Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTargetClosedError")(err.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait CDPSessionOnMessageObject extends StObject {
    
    var error: Code
    
    var id: js.UndefOr[Double] = js.undefined
    
    var method: String
    
    var params: Record[String, Any]
    
    var result: js.UndefOr[Any] = js.undefined
  }
  object CDPSessionOnMessageObject {
    
    inline def apply(error: Code, method: String, params: Record[String, Any]): CDPSessionOnMessageObject = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[CDPSessionOnMessageObject]
    }
    
    extension [Self <: CDPSessionOnMessageObject](x: Self) {
      
      inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  trait ConnectionCallback extends StObject {
    
    var error: ProtocolError
    
    var method: String
    
    def reject(args: Any): Unit
    
    def resolve(args: Any): Unit
  }
  object ConnectionCallback {
    
    inline def apply(error: ProtocolError, method: String, reject: Any => Unit, resolve: Any => Unit): ConnectionCallback = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[ConnectionCallback]
    }
    
    extension [Self <: ConnectionCallback](x: Self) {
      
      inline def setError(value: ProtocolError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setReject(value: Any => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setResolve(value: Any => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
