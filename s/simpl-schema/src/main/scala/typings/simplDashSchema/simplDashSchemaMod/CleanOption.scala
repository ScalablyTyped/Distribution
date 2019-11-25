package typings.simplDashSchema.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CleanOption extends js.Object {
  var autoConvert: js.UndefOr[Boolean] = js.undefined
  var extendAutoValueContext: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[Boolean] = js.undefined
  var getAutoValues: js.UndefOr[Boolean] = js.undefined
  var isModifier: js.UndefOr[Boolean] = js.undefined
  var removeEmptyStrings: js.UndefOr[Boolean] = js.undefined
  var removeNullsFromArrays: js.UndefOr[Boolean] = js.undefined
  var trimStrings: js.UndefOr[Boolean] = js.undefined
}

object CleanOption {
  @scala.inline
  def apply(
    autoConvert: js.UndefOr[Boolean] = js.undefined,
    extendAutoValueContext: js.UndefOr[Boolean] = js.undefined,
    filter: js.UndefOr[Boolean] = js.undefined,
    getAutoValues: js.UndefOr[Boolean] = js.undefined,
    isModifier: js.UndefOr[Boolean] = js.undefined,
    removeEmptyStrings: js.UndefOr[Boolean] = js.undefined,
    removeNullsFromArrays: js.UndefOr[Boolean] = js.undefined,
    trimStrings: js.UndefOr[Boolean] = js.undefined
  ): CleanOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoConvert)) __obj.updateDynamic("autoConvert")(autoConvert.asInstanceOf[js.Any])
    if (!js.isUndefined(extendAutoValueContext)) __obj.updateDynamic("extendAutoValueContext")(extendAutoValueContext.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(getAutoValues)) __obj.updateDynamic("getAutoValues")(getAutoValues.asInstanceOf[js.Any])
    if (!js.isUndefined(isModifier)) __obj.updateDynamic("isModifier")(isModifier.asInstanceOf[js.Any])
    if (!js.isUndefined(removeEmptyStrings)) __obj.updateDynamic("removeEmptyStrings")(removeEmptyStrings.asInstanceOf[js.Any])
    if (!js.isUndefined(removeNullsFromArrays)) __obj.updateDynamic("removeNullsFromArrays")(removeNullsFromArrays.asInstanceOf[js.Any])
    if (!js.isUndefined(trimStrings)) __obj.updateDynamic("trimStrings")(trimStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CleanOption]
  }
}

