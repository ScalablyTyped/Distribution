package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSEvalable extends js.Object {
  /**
    * Evaluates a function in the browser context.
    * If the function, passed to the frame.evaluate, returns a Promise, then frame.evaluate would wait for the promise to resolve and return its value.
    * If the function passed into frame.evaluate returns a non-Serializable value, then frame.evaluate resolves to undefined.
    * @param fn Function to be evaluated in browser context
    * @param args Arguments to pass to `fn`
    */
  def evaluate[T /* <: EvaluateFn */](pageFunction: T, args: SerializableOrJSHandle*): js.Promise[EvaluateFnReturnType[T]]
  /**
    * The only difference between `evaluate` and `evaluateHandle` is that `evaluateHandle` returns in-page object (`JSHandle`).
    * If the function, passed to the `evaluateHandle`, returns a `Promise`, then `evaluateHandle` would wait for the
    * promise to resolve and return its value.
    * @param fn Function to be evaluated in browser context
    * @param args Arguments to pass to `fn`
    */
  def evaluateHandle(pageFunction: js.Function1[/* repeated */ js.Any, _], args: SerializableOrJSHandle*): js.Promise[JSHandle]
}

object JSEvalable {
  @scala.inline
  def apply(
    evaluate: (js.Any, /* repeated */ SerializableOrJSHandle) => js.Promise[EvaluateFnReturnType[js.Any]],
    evaluateHandle: (js.Function1[/* repeated */ js.Any, _], /* repeated */ SerializableOrJSHandle) => js.Promise[JSHandle]
  ): JSEvalable = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction2(evaluate), evaluateHandle = js.Any.fromFunction2(evaluateHandle))
  
    __obj.asInstanceOf[JSEvalable]
  }
}

