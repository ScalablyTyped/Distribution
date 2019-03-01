package typings
package reduxDashDevtoolsDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var function: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  var map: js.UndefOr[scala.Boolean] = js.undefined
  var regex: js.UndefOr[scala.Boolean] = js.undefined
  var set: js.UndefOr[scala.Boolean] = js.undefined
  var symbol: js.UndefOr[scala.Boolean] = js.undefined
  var undefined: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Date {
  @scala.inline
  def apply(
    date: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    function: scala.Boolean | js.Function = null,
    map: js.UndefOr[scala.Boolean] = js.undefined,
    regex: js.UndefOr[scala.Boolean] = js.undefined,
    set: js.UndefOr[scala.Boolean] = js.undefined,
    symbol: js.UndefOr[scala.Boolean] = js.undefined,
    undefined: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Date = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (!js.isUndefined(map)) __obj.updateDynamic("map")(map)
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex)
    if (!js.isUndefined(set)) __obj.updateDynamic("set")(set)
    if (!js.isUndefined(symbol)) __obj.updateDynamic("symbol")(symbol)
    if (!js.isUndefined(undefined)) __obj.updateDynamic("undefined")(undefined)
    __obj.asInstanceOf[Anon_Date]
  }
}

