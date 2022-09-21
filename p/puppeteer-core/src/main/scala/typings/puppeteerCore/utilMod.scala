package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExceptionDetails
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.puppeteerCore.anon.Emitter
import typings.puppeteerCore.anon.TypeofimportedFs
import typings.puppeteerCore.commonConnectionMod.CDPSession
import typings.puppeteerCore.elementHandleMod.ElementHandle
import typings.puppeteerCore.eventEmitterMod.CommonEventEmitter
import typings.puppeteerCore.executionContextMod.ExecutionContext
import typings.puppeteerCore.jshandleMod.JSHandle
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEventListener(emitter: CommonEventEmitter, eventName: String, handler: js.Function1[/* repeated */ Any, Unit]): PuppeteerEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[PuppeteerEventListener]
  inline def addEventListener(emitter: CommonEventEmitter, eventName: js.Symbol, handler: js.Function1[/* repeated */ Any, Unit]): PuppeteerEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[PuppeteerEventListener]
  
  inline def createJSHandle(context: ExecutionContext, remoteObject: RemoteObject): JSHandle[Any] | ElementHandle[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("createJSHandle")(context.asInstanceOf[js.Any], remoteObject.asInstanceOf[js.Any])).asInstanceOf[JSHandle[Any] | ElementHandle[Node]]
  
  inline def debugError(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debugError")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def evaluationString(fun: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluationString")(List(fun.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  inline def evaluationString(fun: js.Function, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluationString")(List(fun.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def getExceptionMessage(exceptionDetails: ExceptionDetails): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExceptionMessage")(exceptionDetails.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getReadableAsBuffer(readable: Readable): js.Promise[Buffer | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReadableAsBuffer")(readable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer | Null]]
  inline def getReadableAsBuffer(readable: Readable, path: String): js.Promise[Buffer | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReadableAsBuffer")(readable.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | Null]]
  
  inline def getReadableFromProtocolStream(client: CDPSession, handle: String): js.Promise[Readable] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReadableFromProtocolStream")(client.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Readable]]
  
  inline def importFS(): js.Promise[TypeofimportedFs] = ^.asInstanceOf[js.Dynamic].applyDynamic("importFS")().asInstanceOf[js.Promise[TypeofimportedFs]]
  
  inline def isNumber(obj: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isString(obj: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def pageBindingDeliverErrorString(name: String, seq: Double, message: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pageBindingDeliverErrorString")(name.asInstanceOf[js.Any], seq.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pageBindingDeliverErrorString(name: String, seq: Double, message: String, stack: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pageBindingDeliverErrorString")(name.asInstanceOf[js.Any], seq.asInstanceOf[js.Any], message.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pageBindingDeliverErrorValueString(name: String, seq: Double, value: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pageBindingDeliverErrorValueString")(name.asInstanceOf[js.Any], seq.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pageBindingDeliverResultString(name: String, seq: Double, result: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pageBindingDeliverResultString")(name.asInstanceOf[js.Any], seq.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pageBindingInitString(`type`: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pageBindingInitString")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def releaseObject(client: CDPSession, remoteObject: RemoteObject): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("releaseObject")(client.asInstanceOf[js.Any], remoteObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def removeEventListeners(listeners: js.Array[Emitter]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListeners")(listeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def valueFromRemoteObject(remoteObject: RemoteObject): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueFromRemoteObject")(remoteObject.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def waitForEvent[T](
    emitter: CommonEventEmitter,
    eventName: String,
    predicate: js.Function1[/* event */ T, js.Promise[Boolean] | Boolean],
    timeout: Double,
    abortPromise: js.Promise[js.Error]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForEvent")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], abortPromise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def waitForEvent[T](
    emitter: CommonEventEmitter,
    eventName: js.Symbol,
    predicate: js.Function1[/* event */ T, js.Promise[Boolean] | Boolean],
    timeout: Double,
    abortPromise: js.Promise[js.Error]
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForEvent")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], abortPromise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def waitWithTimeout[T](promise: js.Promise[T], taskName: String, timeout: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitWithTimeout")(promise.asInstanceOf[js.Any], taskName.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  trait PuppeteerEventListener extends StObject {
    
    var emitter: CommonEventEmitter
    
    var eventName: String | js.Symbol
    
    def handler(args: Any*): Unit
  }
  object PuppeteerEventListener {
    
    inline def apply(emitter: CommonEventEmitter, eventName: String | js.Symbol, handler: /* repeated */ Any => Unit): PuppeteerEventListener = {
      val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], handler = js.Any.fromFunction1(handler))
      __obj.asInstanceOf[PuppeteerEventListener]
    }
    
    extension [Self <: PuppeteerEventListener](x: Self) {
      
      inline def setEmitter(value: CommonEventEmitter): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setEventName(value: String | js.Symbol): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setHandler(value: /* repeated */ Any => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    }
  }
}
