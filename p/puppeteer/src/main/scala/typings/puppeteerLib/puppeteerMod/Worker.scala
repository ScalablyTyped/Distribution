package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Worker extends js.Object {
  /**
    * If the function passed to the `worker.evaluate` returns a Promise,
    * then `worker.evaluate` would wait for the promise to resolve and return its value.
    *
    * If the function passed to the `worker.evaluate` returns a non-Serializable value,
    * then `worker.evaluate` resolves to `undefined`.
    */
  def evaluate[T /* <: EvaluateFn */](pageFunction: T, args: SerializableOrJSHandle*): js.Promise[EvaluateFnReturnType[T]]
  /**
    * The only difference between `worker.evaluate` and `worker.evaluateHandle` is
    * that `worker.evaluateHandle` returns in-page object (JSHandle).
    */
  def evaluateHandle[T](
    pageFunction: js.Function1[/* repeated */ js.Any, T | js.Promise[T]],
    args: SerializableOrJSHandle*
  ): js.Promise[T]
  def executionContext(): js.Promise[ExecutionContext]
  def url(): java.lang.String
}

object Worker {
  @scala.inline
  def apply(
    evaluate: js.Function2[
      js.Any, 
      /* repeated */ SerializableOrJSHandle, 
      js.Promise[EvaluateFnReturnType[js.Any]]
    ],
    evaluateHandle: js.Function2[
      js.Function1[/* repeated */ js.Any, js.Any | js.Promise[js.Any]], 
      /* repeated */ SerializableOrJSHandle, 
      js.Promise[js.Any]
    ],
    executionContext: js.Function0[js.Promise[ExecutionContext]],
    url: js.Function0[java.lang.String]
  ): Worker = {
    val __obj = js.Dynamic.literal(evaluate = evaluate, evaluateHandle = evaluateHandle, executionContext = executionContext, url = url)
  
    __obj.asInstanceOf[Worker]
  }
}

