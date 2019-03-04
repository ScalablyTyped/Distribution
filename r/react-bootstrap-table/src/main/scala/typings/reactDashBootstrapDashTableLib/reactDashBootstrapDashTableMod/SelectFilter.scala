package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectFilter extends _Filter {
  /**
  	 * Condition. Can be 'eq' (exactly equal) or 'like' (contains the given string). Defaults to 'like'.
  	 */
  var condition: js.UndefOr[FilterCondition] = js.undefined
  /**
  	 * Default value for the select filter.
  	 */
  var defaultValue: js.UndefOr[java.lang.String | scala.Double | scala.Boolean] = js.undefined
  /**
  	 * Options for the filter select.
  	 */
  var options: SelectFilterOptionsType
  /**
  	 * Placeholder text to show in the filter.
  	 */
  var selectText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * CSS Style to use for the select filter.
  	 */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
  	 * Filter type must be 'SelectFilter'
  	 */
  var `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.SelectFilter
  /**
  	 * Disable the empty option in the dropdown filter.
  	 */
  var withoutEmptyOption: js.UndefOr[scala.Boolean] = js.undefined
}

object SelectFilter {
  @scala.inline
  def apply(
    options: SelectFilterOptionsType,
    `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.SelectFilter,
    condition: FilterCondition = null,
    defaultValue: java.lang.String | scala.Double | scala.Boolean = null,
    selectText: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    withoutEmptyOption: js.UndefOr[scala.Boolean] = js.undefined
  ): SelectFilter = {
    val __obj = js.Dynamic.literal(options = options)
    __obj.updateDynamic("type")(`type`)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (selectText != null) __obj.updateDynamic("selectText")(selectText)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(withoutEmptyOption)) __obj.updateDynamic("withoutEmptyOption")(withoutEmptyOption)
    __obj.asInstanceOf[SelectFilter]
  }
}

