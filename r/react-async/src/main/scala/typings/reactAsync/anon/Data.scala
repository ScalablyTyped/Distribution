package typings.reactAsync.anon

import typings.reactAsync.reactAsyncBooleans.`false`
import typings.reactAsync.reactAsyncBooleans.`true`
import typings.reactAsync.reactAsyncStrings.fulfilled
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[T] extends js.Object {
  var data: T
  var error: js.UndefOr[scala.Nothing] = js.undefined
  var finishedAt: Date
  var isFulfilled: `true`
  var isInitial: `false`
  var isLoading: `false`
  var isPending: `false`
  var isRejected: `false`
  var isResolved: `true`
  var isSettled: `true`
  var startedAt: Date
  var status: fulfilled
  var value: T
}

object Data {
  @scala.inline
  def apply[T](
    data: T,
    finishedAt: Date,
    isFulfilled: `true`,
    isInitial: `false`,
    isLoading: `false`,
    isPending: `false`,
    isRejected: `false`,
    isResolved: `true`,
    isSettled: `true`,
    startedAt: Date,
    status: fulfilled,
    value: T
  ): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], finishedAt = finishedAt.asInstanceOf[js.Any], isFulfilled = isFulfilled.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isPending = isPending.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], isResolved = isResolved.asInstanceOf[js.Any], isSettled = isSettled.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
}

