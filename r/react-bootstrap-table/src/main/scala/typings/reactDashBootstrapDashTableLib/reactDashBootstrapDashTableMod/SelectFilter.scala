package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SelectFilter extends js.Object {
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

