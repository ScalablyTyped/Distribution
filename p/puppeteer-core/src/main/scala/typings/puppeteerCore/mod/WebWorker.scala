package typings.puppeteerCore.mod

import typings.std.Awaited
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core", "WebWorker")
@js.native
open class WebWorker () extends EventEmitter {
  
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
  def evaluate[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
    pageFunction: Func,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
  ): js.Promise[Awaited[ReturnType[Func]]] = js.native
  def evaluate[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
    pageFunction: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
  ): js.Promise[Awaited[ReturnType[Func]]] = js.native
  
  /**
    * The only difference between `worker.evaluate` and `worker.evaluateHandle`
    * is that `worker.evaluateHandle` returns in-page object (JSHandle). If the
    * function passed to the `worker.evaluateHandle` returns a `Promise`, then
    * `worker.evaluateHandle` would wait for the promise to resolve and return
    * its value. Shortcut for
    * `await worker.executionContext()).evaluateHandle(pageFunction, ...args)`
    *
    * @param pageFunction - Function to be evaluated in the page context.
    * @param args - Arguments to pass to `pageFunction`.
    * @returns Promise which resolves to the return value of `pageFunction`.
    */
  def evaluateHandle[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
    pageFunction: Func,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
  ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
  def evaluateHandle[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
    pageFunction: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
  ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
  
  /* private */ var `private`: Any = js.native
  
  /* Excluded from this release type: __constructor */
  /* Excluded from this release type: executionContext */
  /**
    * @returns The URL of this web worker.
    */
  def url(): String = js.native
}
