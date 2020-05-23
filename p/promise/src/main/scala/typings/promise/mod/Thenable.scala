package typings.promise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Thenable[T] extends js.Object {
  /**
    * Attaches callbacks for the resolution and/or rejection of the ThenPromise.
    * @param onfulfilled The callback to execute when the ThenPromise is resolved.
    * @param onrejected The callback to execute when the ThenPromise is rejected.
    * @returns A ThenPromise for the completion of which ever callback is executed.
    */
  def `then`[TResult1, TResult2](): Thenable[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | Thenable[TResult1]]): Thenable[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | Thenable[TResult2]]
  ): Thenable[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | Thenable[TResult2]]): Thenable[TResult1 | TResult2] = js.native
}

