package typings.reactDashAsync

import typings.reactDashAsync.reactDashAsyncBooleans.`false`
import typings.reactDashAsync.reactDashAsyncBooleans.`true`
import typings.reactDashAsync.reactDashAsyncStrings.pending
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataError[T] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var error: js.UndefOr[Error] = js.undefined
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
  var value: js.UndefOr[T | Error] = js.undefined
}

object Anon_DataError {
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
    error: Error = null,
    finishedAt: js.UndefOr[scala.Nothing] = js.undefined,
    value: T | Error = null
  ): Anon_DataError[T] = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isPending = isPending.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], isResolved = isResolved.asInstanceOf[js.Any], isSettled = isSettled.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(finishedAt)) __obj.updateDynamic("finishedAt")(finishedAt.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataError[T]]
  }
}

