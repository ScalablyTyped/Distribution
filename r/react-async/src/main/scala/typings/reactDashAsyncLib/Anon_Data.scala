package typings
package reactDashAsyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.UndefOr[scala.Nothing]
  var error: js.UndefOr[scala.Nothing]
  var finishedAt: js.UndefOr[scala.Nothing]
  var initialValue: js.UndefOr[scala.Nothing] = js.undefined
  var isFulfilled: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isInitial: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isLoading: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isPending: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isRejected: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isResolved: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var isSettled: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`
  var startedAt: js.UndefOr[scala.Nothing]
  var status: reactDashAsyncLib.reactDashAsyncLibStrings.initial
  var value: js.UndefOr[scala.Nothing]
}

object Anon_Data {
  @scala.inline
  def apply(
    isFulfilled: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isInitial: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isLoading: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isPending: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isRejected: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isResolved: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    isSettled: reactDashAsyncLib.reactDashAsyncLibNumbers.`false`,
    status: reactDashAsyncLib.reactDashAsyncLibStrings.initial,
    data: js.UndefOr[scala.Nothing] = js.undefined,
    error: js.UndefOr[scala.Nothing] = js.undefined,
    finishedAt: js.UndefOr[scala.Nothing] = js.undefined,
    initialValue: js.UndefOr[scala.Nothing] = js.undefined,
    startedAt: js.UndefOr[scala.Nothing] = js.undefined,
    value: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_Data = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled, isInitial = isInitial, isLoading = isLoading, isPending = isPending, isRejected = isRejected, isResolved = isResolved, isSettled = isSettled, status = status)
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(finishedAt)) __obj.updateDynamic("finishedAt")(finishedAt)
    if (!js.isUndefined(initialValue)) __obj.updateDynamic("initialValue")(initialValue)
    if (!js.isUndefined(startedAt)) __obj.updateDynamic("startedAt")(startedAt)
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Data]
  }
}

