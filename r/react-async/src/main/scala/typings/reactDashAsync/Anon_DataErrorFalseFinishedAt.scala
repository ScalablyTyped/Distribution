package typings.reactDashAsync

import typings.reactDashAsync.reactDashAsyncNumbers.`false`
import typings.reactDashAsync.reactDashAsyncNumbers.`true`
import typings.reactDashAsync.reactDashAsyncStrings.rejected
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataErrorFalseFinishedAt[T] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var error: Error
  var finishedAt: Date
  var isFulfilled: `false`
  var isInitial: `false`
  var isLoading: `false`
  var isPending: `false`
  var isRejected: `true`
  var isResolved: `false`
  var isSettled: `true`
  var startedAt: Date
  var status: rejected
  var value: Error
}

object Anon_DataErrorFalseFinishedAt {
  @scala.inline
  def apply[T](
    error: Error,
    finishedAt: Date,
    isFulfilled: `false`,
    isInitial: `false`,
    isLoading: `false`,
    isPending: `false`,
    isRejected: `true`,
    isResolved: `false`,
    isSettled: `true`,
    startedAt: Date,
    status: rejected,
    value: Error,
    data: T = null
  ): Anon_DataErrorFalseFinishedAt[T] = {
    val __obj = js.Dynamic.literal(error = error, finishedAt = finishedAt, isFulfilled = isFulfilled, isInitial = isInitial, isLoading = isLoading, isPending = isPending, isRejected = isRejected, isResolved = isResolved, isSettled = isSettled, startedAt = startedAt, status = status, value = value)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataErrorFalseFinishedAt[T]]
  }
}

