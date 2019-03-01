package typings
package qLib.qMod.QNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseState[T] extends js.Object {
  var reason: js.UndefOr[js.Any] = js.undefined
  var state: qLib.qLibStrings.fulfilled | qLib.qLibStrings.rejected | qLib.qLibStrings.pending
  var value: js.UndefOr[T] = js.undefined
}

object PromiseState {
  @scala.inline
  def apply[T](
    state: qLib.qLibStrings.fulfilled | qLib.qLibStrings.rejected | qLib.qLibStrings.pending,
    reason: js.Any = null,
    value: T = null
  ): PromiseState[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseState[T]]
  }
}

