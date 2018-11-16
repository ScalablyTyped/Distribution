package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NumberFilter extends js.Object {
  /**
  	 * Default value for the filter.
  	 */
  var defaultValue: js.UndefOr[reactDashBootstrapDashTableLib.Anon_ComparatorNumber] = js.undefined
  /**
  	 * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
  	 */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Number filter comparators
  	 */
  var numberComparators: js.UndefOr[js.Array[FilterComparator]] = js.undefined
  /**
  	 * List of number options that can be selected, if the number field is a select dropdown instead of a text edit.
  	 */
  var options: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
  	 * Placeholder text to show in the filter.
  	 */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * CSS Style to use for the select filter.
  	 */
  var style: js.UndefOr[reactDashBootstrapDashTableLib.Anon_Comparator] = js.undefined
  /**
  	 * Filter type must be 'NumberFilter'
  	 */
  var `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.NumberFilter
  /**
  	 * Specify that the comparator field MUST have a comparator selected.
  	 */
  var withoutEmptyComparatorOption: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Specify that the value field MUST have a number value specified.
  	 */
  var withoutEmptyNumberOption: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If this is a select number field, disable the empty option in the dropdown.
  	 */
  var withoutEmptyOption: js.UndefOr[scala.Boolean] = js.undefined
}

