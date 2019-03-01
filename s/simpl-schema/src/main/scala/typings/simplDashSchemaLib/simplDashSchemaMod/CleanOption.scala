package typings
package simplDashSchemaLib.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CleanOption extends js.Object {
  var autoConvert: js.UndefOr[scala.Boolean] = js.undefined
  var extendAutoValueContext: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  var getAutoValues: js.UndefOr[scala.Boolean] = js.undefined
  var isModifier: js.UndefOr[scala.Boolean] = js.undefined
  var removeEmptyStrings: js.UndefOr[scala.Boolean] = js.undefined
  var removeNullsFromArrays: js.UndefOr[scala.Boolean] = js.undefined
  var trimStrings: js.UndefOr[scala.Boolean] = js.undefined
}

object CleanOption {
  @scala.inline
  def apply(
    autoConvert: js.UndefOr[scala.Boolean] = js.undefined,
    extendAutoValueContext: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    getAutoValues: js.UndefOr[scala.Boolean] = js.undefined,
    isModifier: js.UndefOr[scala.Boolean] = js.undefined,
    removeEmptyStrings: js.UndefOr[scala.Boolean] = js.undefined,
    removeNullsFromArrays: js.UndefOr[scala.Boolean] = js.undefined,
    trimStrings: js.UndefOr[scala.Boolean] = js.undefined
  ): CleanOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoConvert)) __obj.updateDynamic("autoConvert")(autoConvert)
    if (!js.isUndefined(extendAutoValueContext)) __obj.updateDynamic("extendAutoValueContext")(extendAutoValueContext)
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(getAutoValues)) __obj.updateDynamic("getAutoValues")(getAutoValues)
    if (!js.isUndefined(isModifier)) __obj.updateDynamic("isModifier")(isModifier)
    if (!js.isUndefined(removeEmptyStrings)) __obj.updateDynamic("removeEmptyStrings")(removeEmptyStrings)
    if (!js.isUndefined(removeNullsFromArrays)) __obj.updateDynamic("removeNullsFromArrays")(removeNullsFromArrays)
    if (!js.isUndefined(trimStrings)) __obj.updateDynamic("trimStrings")(trimStrings)
    __obj.asInstanceOf[CleanOption]
  }
}

