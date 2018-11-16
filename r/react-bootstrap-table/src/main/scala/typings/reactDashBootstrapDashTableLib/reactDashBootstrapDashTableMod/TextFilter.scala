package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TextFilter extends js.Object {
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

