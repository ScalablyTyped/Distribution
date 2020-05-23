package typings.reactAsync.anon

import typings.reactAsync.reactAsyncBooleans.`false`
import typings.reactAsync.reactAsyncBooleans.`true`
import typings.reactAsync.reactAsyncStrings.pending
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinishedAt[T] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var error: js.UndefOr[typings.std.Error] = js.undefined
  var finishedAt: js.UndefOr[scala.Nothing] = js.undefined
  var isFulfilled: `false`
  var isInitial: `false`
  var isLoading: `true`
  var isPending: `true`
  var isRejected: `false`
  var isResolved: `false`
  var isSettled: `false`
  var startedAt: Date
  var status: pending
  var value: js.UndefOr[T | typings.std.Error] = js.undefined
}

object FinishedAt {
  @scala.inline
  def apply[T](
    isFulfilled: `false`,
    isInitial: `false`,
    isLoading: `true`,
    isPending: `true`,
    isRejected: `false`,
    isResolved: `false`,
    isSettled: `false`,
    startedAt: Date,
    status: pending,
    data: T = null,
    error: typings.std.Error = null,
    value: T | typings.std.Error = null
  ): FinishedAt[T] = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isPending = isPending.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], isResolved = isResolved.asInstanceOf[js.Any], isSettled = isSettled.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishedAt[T]]
  }
}

