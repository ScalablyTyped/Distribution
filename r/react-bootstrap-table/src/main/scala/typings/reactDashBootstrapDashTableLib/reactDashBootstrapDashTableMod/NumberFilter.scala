package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFilter extends _Filter {
  /**
  	 * Default value for the filter.
  	 */
  var defaultValue: js.UndefOr[reactDashBootstrapDashTableLib.Anon_Comparator] = js.undefined
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
  var style: js.UndefOr[reactDashBootstrapDashTableLib.Anon_ComparatorNumber] = js.undefined
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

object NumberFilter {
  @scala.inline
  def apply(
    `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.NumberFilter,
    defaultValue: reactDashBootstrapDashTableLib.Anon_Comparator = null,
    delay: scala.Int | scala.Double = null,
    numberComparators: js.Array[FilterComparator] = null,
    options: js.Array[scala.Double] = null,
    placeholder: java.lang.String = null,
    style: reactDashBootstrapDashTableLib.Anon_ComparatorNumber = null,
    withoutEmptyComparatorOption: js.UndefOr[scala.Boolean] = js.undefined,
    withoutEmptyNumberOption: js.UndefOr[scala.Boolean] = js.undefined,
    withoutEmptyOption: js.UndefOr[scala.Boolean] = js.undefined
  ): NumberFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (numberComparators != null) __obj.updateDynamic("numberComparators")(numberComparators)
    if (options != null) __obj.updateDynamic("options")(options)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(withoutEmptyComparatorOption)) __obj.updateDynamic("withoutEmptyComparatorOption")(withoutEmptyComparatorOption)
    if (!js.isUndefined(withoutEmptyNumberOption)) __obj.updateDynamic("withoutEmptyNumberOption")(withoutEmptyNumberOption)
    if (!js.isUndefined(withoutEmptyOption)) __obj.updateDynamic("withoutEmptyOption")(withoutEmptyOption)
    __obj.asInstanceOf[NumberFilter]
  }
}

