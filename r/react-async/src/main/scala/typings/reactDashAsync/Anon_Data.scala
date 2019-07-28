package typings.reactDashAsync

import typings.reactDashAsync.reactDashAsyncNumbers.`false`
import typings.reactDashAsync.reactDashAsyncStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.UndefOr[scala.Nothing] = js.undefined
  var error: js.UndefOr[scala.Nothing] = js.undefined
  var finishedAt: js.UndefOr[scala.Nothing] = js.undefined
  var initialValue: js.UndefOr[scala.Nothing] = js.undefined
  var isFulfilled: `false`
  var isInitial: `false`
  var isLoading: `false`
  var isPending: `false`
  var isRejected: `false`
  var isResolved: `false`
  var isSettled: `false`
  var startedAt: js.UndefOr[scala.Nothing] = js.undefined
  var status: initial
  var value: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(
    isFulfilled: `false`,
    isInitial: `false`,
    isLoading: `false`,
    isPending: `false`,
    isRejected: `false`,
    isResolved: `false`,
    isSettled: `false`,
    status: initial,
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

