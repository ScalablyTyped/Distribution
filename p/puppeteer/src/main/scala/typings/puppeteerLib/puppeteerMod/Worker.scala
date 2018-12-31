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
  def evaluate[T](pageFunction: js.Function1[/* repeated */ js.Any, T | js.Promise[T]], args: js.Any*): js.Promise[T]
  /**
    * The only difference between `worker.evaluate` and `worker.evaluateHandle` is
    * that `worker.evaluateHandle` returns in-page object (JSHandle).
    */
  def evaluateHandle[T](pageFunction: js.Function1[/* repeated */ js.Any, T | js.Promise[T]], args: js.Any*): js.Promise[T]
  def executionContext(): js.Promise[ExecutionContext]
  def url(): java.lang.String
}

