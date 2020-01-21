package typings.reduxDevtoolsExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var date: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var function: js.UndefOr[Boolean | js.Function] = js.undefined
  var map: js.UndefOr[Boolean] = js.undefined
  var regex: js.UndefOr[Boolean] = js.undefined
  var set: js.UndefOr[Boolean] = js.undefined
  var symbol: js.UndefOr[Boolean] = js.undefined
  var undefined: js.UndefOr[Boolean] = js.undefined
}

object AnonDate {
  @scala.inline
  def apply(
    date: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    function: Boolean | js.Function = null,
    map: js.UndefOr[Boolean] = js.undefined,
    regex: js.UndefOr[Boolean] = js.undefined,
    set: js.UndefOr[Boolean] = js.undefined,
    symbol: js.UndefOr[Boolean] = js.undefined,
    undefined: js.UndefOr[Boolean] = js.undefined
  ): AnonDate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (!js.isUndefined(map)) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (!js.isUndefined(set)) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (!js.isUndefined(symbol)) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(undefined)) __obj.updateDynamic("undefined")(undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDate]
  }
}

