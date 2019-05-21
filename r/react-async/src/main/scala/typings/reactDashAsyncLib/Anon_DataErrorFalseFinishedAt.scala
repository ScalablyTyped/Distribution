package typings
package reactDashAsyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataErrorFalseFinishedAt[T] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var error: stdLib.Error
  var finishedAt: stdLib.Date
  var isFulfilled: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isInitial: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isLoading: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isPending: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isRejected: reactDashAsyncLib.reactDashAsyncLibNumbers.`true`
  var isResolved: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isSettled: reactDashAsyncLib.reactDashAsyncLibNumbers.`true`
  var startedAt: stdLib.Date
  var status: reactDashAsyncLib.reactDashAsyncLibStrings.rejected
  var value: stdLib.Error
}

object Anon_DataErrorFalseFinishedAt {
  @scala.inline
  def apply[T](
    error: stdLib.Error,
    finishedAt: stdLib.Date,
    isFulfilled: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isInitial: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isLoading: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isPending: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isRejected: reactDashAsyncLib.reactDashAsyncLibNumbers.`true`,
    isResolved: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isSettled: reactDashAsyncLib.reactDashAsyncLibNumbers.`true`,
    startedAt: stdLib.Date,
    status: reactDashAsyncLib.reactDashAsyncLibStrings.rejected,
    value: stdLib.Error,
    data: T = null
  ): Anon_DataErrorFalseFinishedAt[T] = {
    val __obj = js.Dynamic.literal(error = error, finishedAt = finishedAt, isFulfilled = isFulfilled, isInitial = isInitial, isLoading = isLoading, isPending = isPending, isRejected = isRejected, isResolved = isResolved, isSettled = isSettled, startedAt = startedAt, status = status, value = value)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataErrorFalseFinishedAt[T]]
  }
}

