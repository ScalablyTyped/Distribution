package typings.reactAsync

import typings.reactAsync.reactAsyncBooleans.`false`
import typings.reactAsync.reactAsyncStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
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

object AnonError {
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
  ): AnonError = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isPending = isPending.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], isResolved = isResolved.asInstanceOf[js.Any], isSettled = isSettled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(finishedAt)) __obj.updateDynamic("finishedAt")(finishedAt.asInstanceOf[js.Any])
    if (!js.isUndefined(initialValue)) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (!js.isUndefined(startedAt)) __obj.updateDynamic("startedAt")(startedAt.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

