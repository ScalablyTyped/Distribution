package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExceptionDetails
import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import typings.puppeteerCore.connectionMod.CDPSession
import typings.puppeteerCore.evalTypesMod.EvaluateHandleFn
import typings.puppeteerCore.evalTypesMod.SerializableOrJSHandle
import typings.puppeteerCore.eventEmitterMod.EventEmitter
import typings.puppeteerCore.executionContextMod.ExecutionContext
import typings.puppeteerCore.jshandleMod.JSHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webWorkerMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/WebWorker", "WebWorker")
  @js.native
  class WebWorker protected () extends EventEmitter {
    /**
      *
      * @internal
      */
    def this(
      client: CDPSession,
      url: String,
      consoleAPICalled: ConsoleAPICalledCallback,
      exceptionThrown: ExceptionThrownCallback
    ) = this()
    
    var _client: CDPSession = js.native
    
    def _executionContextCallback(value: ExecutionContext): Unit = js.native
    
    var _executionContextPromise: js.Promise[ExecutionContext] = js.native
    
    var _url: String = js.native
    
    def evaluate[ReturnType /* <: js.Any */](pageFunction: String, args: js.Any*): js.Promise[ReturnType] = js.native
    /**
      * If the function passed to the `worker.evaluate` returns a Promise, then
      * `worker.evaluate` would wait for the promise to resolve and return its
      * value. If the function passed to the `worker.evaluate` returns a
      * non-serializable value, then `worker.evaluate` resolves to `undefined`.
      * DevTools Protocol also supports transferring some additional values that
      * are not serializable by `JSON`: `-0`, `NaN`, `Infinity`, `-Infinity`, and
      * bigint literals.
      * Shortcut for `await worker.executionContext()).evaluate(pageFunction, ...args)`.
      *
      * @param pageFunction - Function to be evaluated in the worker context.
      * @param args - Arguments to pass to `pageFunction`.
      * @returns Promise which resolves to the return value of `pageFunction`.
      */
    def evaluate[ReturnType /* <: js.Any */](pageFunction: js.Function, args: js.Any*): js.Promise[ReturnType] = js.native
    
    /**
      * The only difference between `worker.evaluate` and `worker.evaluateHandle`
      * is that `worker.evaluateHandle` returns in-page object (JSHandle). If the
      * function passed to the `worker.evaluateHandle` returns a [Promise], then
      * `worker.evaluateHandle` would wait for the promise to resolve and return
      * its value. Shortcut for
      * `await worker.executionContext()).evaluateHandle(pageFunction, ...args)`
      *
      * @param pageFunction - Function to be evaluated in the page context.
      * @param args - Arguments to pass to `pageFunction`.
      * @returns Promise which resolves to the return value of `pageFunction`.
      */
    def evaluateHandle[HandlerType /* <: JSHandle */](pageFunction: EvaluateHandleFn, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
    
    /**
      * Returns the ExecutionContext the WebWorker runs in
      * @returns The ExecutionContext the web worker runs in.
      */
    def executionContext(): js.Promise[ExecutionContext] = js.native
    
    /**
      * @returns The URL of this web worker.
      */
    def url(): String = js.native
  }
  
  /**
    * @internal
    */
  type ConsoleAPICalledCallback = js.Function3[/* eventType */ String, /* handles */ js.Array[JSHandle], /* trace */ StackTrace, Unit]
  
  /**
    * @internal
    */
  type ExceptionThrownCallback = js.Function1[/* details */ ExceptionDetails, Unit]
}
