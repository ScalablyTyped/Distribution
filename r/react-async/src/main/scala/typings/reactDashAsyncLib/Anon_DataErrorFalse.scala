package typings
package reactDashAsyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataErrorFalse[T] extends js.Object {
  var data: T
  var error: js.UndefOr[scala.Nothing]
  var finishedAt: stdLib.Date
  var isFulfilled: reactDashAsyncLib.reactDashAsyncLibNumbers.`true`
  var isInitial: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isLoading: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isPending: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isRejected: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isResolved: reactDashAsyncLib.reactDashAsyncLibNumbers.`true`
  var isSettled: reactDashAsyncLib.reactDashAsyncLibNumbers.`true`
  var startedAt: stdLib.Date
  var status: reactDashAsyncLib.reactDashAsyncLibStrings.fulfilled
  var value: T
}

object Anon_DataErrorFalse {
  @scala.inline
  def apply[T](
    data: T,
    finishedAt: stdLib.Date,
    isFulfilled: reactDashAsyncLib.reactDashAsyncLibNumbers.`true`,
    isInitial: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isLoading: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isPending: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isRejected: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isResolved: reactDashAsyncLib.reactDashAsyncLibNumbers.`true`,
    isSettled: reactDashAsyncLib.reactDashAsyncLibNumbers.`true`,
    startedAt: stdLib.Date,
    status: reactDashAsyncLib.reactDashAsyncLibStrings.fulfilled,
    value: T,
    error: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_DataErrorFalse[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], finishedAt = finishedAt, isFulfilled = isFulfilled, isInitial = isInitial, isLoading = isLoading, isPending = isPending, isRejected = isRejected, isResolved = isResolved, isSettled = isSettled, startedAt = startedAt, status = status, value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Anon_DataErrorFalse[T]]
  }
}

