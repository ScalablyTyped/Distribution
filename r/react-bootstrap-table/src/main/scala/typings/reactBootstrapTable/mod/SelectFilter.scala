package typings.reactBootstrapTable.mod

import typings.react.mod.CSSProperties
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
  var defaultValue: js.UndefOr[String | Double | Boolean] = js.undefined
  /**
  	 * Options for the filter select.
  	 */
  var options: SelectFilterOptionsType
  /**
  	 * Placeholder text to show in the filter.
  	 */
  var selectText: js.UndefOr[String] = js.undefined
  /**
  	 * CSS Style to use for the select filter.
  	 */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
  	 * Filter type must be 'SelectFilter'
  	 */
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter
  /**
  	 * Disable the empty option in the dropdown filter.
  	 */
  var withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
}

object SelectFilter {
  @scala.inline
  def apply(
    options: SelectFilterOptionsType,
    `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.SelectFilter,
    condition: FilterCondition = null,
    defaultValue: String | Double | Boolean = null,
    selectText: String = null,
    style: CSSProperties = null,
    withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
  ): SelectFilter = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (selectText != null) __obj.updateDynamic("selectText")(selectText.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutEmptyOption)) __obj.updateDynamic("withoutEmptyOption")(withoutEmptyOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectFilter]
  }
}

