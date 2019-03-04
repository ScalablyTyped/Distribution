package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFilter extends _Filter {
  /**
  	 * Condition. Can be 'eq' (exactly equal) or 'like' (contains the given string). Defaults to 'like'.
  	 */
  var condition: js.UndefOr[FilterCondition] = js.undefined
  /**
  	 * Default value for the text filter. Defaults to ''
  	 */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
  	 */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Placeholder text to show in the filter.
  	 */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * CSS Style to use for the select filter.
  	 */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
  	 * Filter type must be 'TextFilter'.
  	 */
  var `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.TextFilter
}

object TextFilter {
  @scala.inline
  def apply(
    `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.TextFilter,
    condition: FilterCondition = null,
    defaultValue: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    placeholder: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TextFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TextFilter]
  }
}

