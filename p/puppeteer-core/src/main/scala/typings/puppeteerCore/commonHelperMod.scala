package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExceptionDetails
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typings.node.Buffer
import typings.puppeteerCore.anon.EventName
import typings.puppeteerCore.anon.Fn0
import typings.puppeteerCore.anon.FnCallPromiseTaskNameTimeout
import typings.puppeteerCore.commonConnectionMod.CDPSession
import typings.puppeteerCore.commonEventEmitterMod.CommonEventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonHelperMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debugError(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debugError")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object helper {
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.addEventListener")
    @js.native
    def addEventListener: js.Function3[
        /* emitter */ CommonEventEmitter, 
        /* eventName */ String | js.Symbol, 
        /* handler */ js.Function1[/* repeated */ js.Any, Unit], 
        PuppeteerEventListener
      ] = js.native
    inline def addEventListener(emitter: CommonEventEmitter, eventName: String, handler: js.Function1[/* repeated */ js.Any, Unit]): PuppeteerEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[PuppeteerEventListener]
    inline def addEventListener(
      emitter: CommonEventEmitter,
      eventName: js.Symbol,
      handler: js.Function1[/* repeated */ js.Any, Unit]
    ): PuppeteerEventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[PuppeteerEventListener]
    inline def addEventListener_=(
      x: js.Function3[
          /* emitter */ CommonEventEmitter, 
          /* eventName */ String | js.Symbol, 
          /* handler */ js.Function1[/* repeated */ js.Any, Unit], 
          PuppeteerEventListener
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.evaluationString")
    @js.native
    def evaluationString: js.Function2[/* fun */ js.Function | String, /* repeated */ js.Any, String] = js.native
    inline def evaluationString(fun: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluationString")(fun.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def evaluationString(fun: js.Function, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluationString")(fun.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def evaluationString_=(x: js.Function2[/* fun */ js.Function | String, /* repeated */ js.Any, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("evaluationString")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.getExceptionMessage")
    @js.native
    def getExceptionMessage: js.Function1[/* exceptionDetails */ ExceptionDetails, String] = js.native
    inline def getExceptionMessage(exceptionDetails: ExceptionDetails): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExceptionMessage")(exceptionDetails.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getExceptionMessage_=(x: js.Function1[/* exceptionDetails */ ExceptionDetails, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getExceptionMessage")(x.asInstanceOf[js.Any])
    
    inline def importFSModule(): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_fs */ js.Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("importFSModule")().asInstanceOf[js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_fs */ js.Any
      ]]
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.importFSModule")
    @js.native
    def importFSModule_Fhelper: js.Function0[
        js.Promise[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_fs */ js.Any
        ]
      ] = js.native
    
    inline def importFSModule_Fhelper_=(
      x: js.Function0[
          js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_fs */ js.Any
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("importFSModule")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.isNumber")
    @js.native
    def isNumber: js.Function1[/* obj */ js.Any, /* is number */ Boolean] = js.native
    inline def isNumber(obj: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    inline def isNumber_=(x: js.Function1[/* obj */ js.Any, /* is number */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isNumber")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.isString")
    @js.native
    def isString: js.Function1[/* obj */ js.Any, /* is string */ Boolean] = js.native
    inline def isString(obj: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    inline def isString_=(x: js.Function1[/* obj */ js.Any, /* is string */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isString")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.makePredicateString")
    @js.native
    def makePredicateString: js.Function2[
        /* predicate */ js.Function, 
        /* predicateQueryHandler */ js.UndefOr[js.Function], 
        String
      ] = js.native
    inline def makePredicateString(predicate: js.Function): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makePredicateString")(predicate.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def makePredicateString(predicate: js.Function, predicateQueryHandler: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makePredicateString")(predicate.asInstanceOf[js.Any], predicateQueryHandler.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def makePredicateString_=(
      x: js.Function2[
          /* predicate */ js.Function, 
          /* predicateQueryHandler */ js.UndefOr[js.Function], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makePredicateString")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.pageBindingDeliverErrorString")
    @js.native
    def pageBindingDeliverErrorString: js.Function4[/* name */ String, /* seq */ Double, /* message */ String, /* stack */ String, String] = js.native
    inline def pageBindingDeliverErrorString(name: String, seq: Double, message: String, stack: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pageBindingDeliverErrorString")(name.asInstanceOf[js.Any], seq.asInstanceOf[js.Any], message.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def pageBindingDeliverErrorString_=(
      x: js.Function4[/* name */ String, /* seq */ Double, /* message */ String, /* stack */ String, String]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageBindingDeliverErrorString")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.pageBindingDeliverErrorValueString")
    @js.native
    def pageBindingDeliverErrorValueString: js.Function3[/* name */ String, /* seq */ Double, /* value */ js.Any, String] = js.native
    inline def pageBindingDeliverErrorValueString(name: String, seq: Double, value: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pageBindingDeliverErrorValueString")(name.asInstanceOf[js.Any], seq.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def pageBindingDeliverErrorValueString_=(x: js.Function3[/* name */ String, /* seq */ Double, /* value */ js.Any, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageBindingDeliverErrorValueString")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.pageBindingDeliverResultString")
    @js.native
    def pageBindingDeliverResultString: js.Function3[/* name */ String, /* seq */ Double, /* result */ js.Any, String] = js.native
    inline def pageBindingDeliverResultString(name: String, seq: Double, result: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pageBindingDeliverResultString")(name.asInstanceOf[js.Any], seq.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def pageBindingDeliverResultString_=(x: js.Function3[/* name */ String, /* seq */ Double, /* result */ js.Any, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageBindingDeliverResultString")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.pageBindingInitString")
    @js.native
    def pageBindingInitString: js.Function2[/* type */ String, /* name */ String, String] = js.native
    inline def pageBindingInitString(`type`: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pageBindingInitString")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def pageBindingInitString_=(x: js.Function2[/* type */ String, /* name */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageBindingInitString")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.readProtocolStream")
    @js.native
    def readProtocolStream: js.Function3[
        /* client */ CDPSession, 
        /* handle */ String, 
        /* path */ js.UndefOr[String], 
        js.Promise[Buffer]
      ] = js.native
    inline def readProtocolStream(client: CDPSession, handle: String): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readProtocolStream")(client.asInstanceOf[js.Any], handle.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def readProtocolStream(client: CDPSession, handle: String, path: String): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readProtocolStream")(client.asInstanceOf[js.Any], handle.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def readProtocolStream_=(
      x: js.Function3[
          /* client */ CDPSession, 
          /* handle */ String, 
          /* path */ js.UndefOr[String], 
          js.Promise[Buffer]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readProtocolStream")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.releaseObject")
    @js.native
    def releaseObject: js.Function2[/* client */ CDPSession, /* remoteObject */ RemoteObject, js.Promise[Unit]] = js.native
    inline def releaseObject(client: CDPSession, remoteObject: RemoteObject): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("releaseObject")(client.asInstanceOf[js.Any], remoteObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def releaseObject_=(x: js.Function2[/* client */ CDPSession, /* remoteObject */ RemoteObject, js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("releaseObject")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.removeEventListeners")
    @js.native
    def removeEventListeners: js.Function1[/* listeners */ js.Array[EventName], Unit] = js.native
    inline def removeEventListeners(listeners: js.Array[EventName]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListeners")(listeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeEventListeners_=(x: js.Function1[/* listeners */ js.Array[EventName], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeEventListeners")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.valueFromRemoteObject")
    @js.native
    def valueFromRemoteObject: js.Function1[/* remoteObject */ RemoteObject, js.Any] = js.native
    inline def valueFromRemoteObject(remoteObject: RemoteObject): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueFromRemoteObject")(remoteObject.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def valueFromRemoteObject_=(x: js.Function1[/* remoteObject */ RemoteObject, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueFromRemoteObject")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.waitForEvent")
    @js.native
    def waitForEvent: Fn0 = js.native
    inline def waitForEvent[T /* <: js.Any */](
      emitter: CommonEventEmitter,
      eventName: String,
      predicate: js.Function1[/* event */ T, Boolean],
      timeout: Double,
      abortPromise: js.Promise[Error]
    ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForEvent")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], abortPromise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
    inline def waitForEvent[T /* <: js.Any */](
      emitter: CommonEventEmitter,
      eventName: js.Symbol,
      predicate: js.Function1[/* event */ T, Boolean],
      timeout: Double,
      abortPromise: js.Promise[Error]
    ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForEvent")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], abortPromise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
    inline def waitForEvent_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitForEvent")(x.asInstanceOf[js.Any])
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/helper", "helper.waitWithTimeout")
    @js.native
    def waitWithTimeout: FnCallPromiseTaskNameTimeout = js.native
    inline def waitWithTimeout[T /* <: js.Any */](promise: js.Promise[T], taskName: String, timeout: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitWithTimeout")(promise.asInstanceOf[js.Any], taskName.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
    inline def waitWithTimeout_=(x: FnCallPromiseTaskNameTimeout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitWithTimeout")(x.asInstanceOf[js.Any])
  }
  
  trait PuppeteerEventListener extends StObject {
    
    var emitter: CommonEventEmitter
    
    var eventName: String | js.Symbol
    
    def handler(args: js.Any*): Unit
  }
  object PuppeteerEventListener {
    
    inline def apply(emitter: CommonEventEmitter, eventName: String | js.Symbol, handler: /* repeated */ js.Any => Unit): PuppeteerEventListener = {
      val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], handler = js.Any.fromFunction1(handler))
      __obj.asInstanceOf[PuppeteerEventListener]
    }
    
    extension [Self <: PuppeteerEventListener](x: Self) {
      
      inline def setEmitter(value: CommonEventEmitter): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setEventName(value: String | js.Symbol): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setHandler(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
    }
  }
}
