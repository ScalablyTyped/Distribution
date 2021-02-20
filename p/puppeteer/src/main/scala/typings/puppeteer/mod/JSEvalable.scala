package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSEvalable[A] extends StObject {
  
  /**
    * Evaluates a function in the browser context.
    * If the function, passed to the frame.evaluate, returns a Promise, then frame.evaluate would wait for the promise to resolve and return its value.
    * If the function passed into frame.evaluate returns a non-Serializable value, then frame.evaluate resolves to undefined.
    * @param fn Function to be evaluated in browser context
    * @param args Arguments to pass to `fn`
    */
  def evaluate[T /* <: EvaluateFn[A] */](pageFunction: T, args: SerializableOrJSHandle*): js.Promise[EvaluateFnReturnType[T]] = js.native
  
  /**
    * The only difference between `evaluate` and `evaluateHandle` is that `evaluateHandle` returns in-page object (`JSHandle`).
    * If the function, passed to the `evaluateHandle`, returns a `Promise`, then `evaluateHandle` would wait for the
    * promise to resolve and return its value.
    * @param fn Function to be evaluated in browser context
    * @param args Arguments to pass to `fn`
    */
  def evaluateHandle(pageFunction: String, args: SerializableOrJSHandle*): js.Promise[JSHandle[_]] = js.native
  def evaluateHandle(pageFunction: js.Function2[/* arg1 */ A, /* repeated */ js.Any, _], args: SerializableOrJSHandle*): js.Promise[JSHandle[_]] = js.native
}
