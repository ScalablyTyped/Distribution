package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.AnonComparator
import typings.reactBootstrapTable.AnonComparatorNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFilter extends _Filter {
  /**
  	 * Default value for the filter.
  	 */
  var defaultValue: js.UndefOr[AnonComparator] = js.undefined
  /**
  	 * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
  	 */
  var delay: js.UndefOr[Double] = js.undefined
  /**
  	 * Number filter comparators
  	 */
  var numberComparators: js.UndefOr[js.Array[FilterComparator]] = js.undefined
  /**
  	 * List of number options that can be selected, if the number field is a select dropdown instead of a text edit.
  	 */
  var options: js.UndefOr[js.Array[Double]] = js.undefined
  /**
  	 * Placeholder text to show in the filter.
  	 */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
  	 * CSS Style to use for the select filter.
  	 */
  var style: js.UndefOr[AnonComparatorNumber] = js.undefined
  /**
  	 * Filter type must be 'NumberFilter'
  	 */
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter
  /**
  	 * Specify that the comparator field MUST have a comparator selected.
  	 */
  var withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Specify that the value field MUST have a number value specified.
  	 */
  var withoutEmptyNumberOption: js.UndefOr[Boolean] = js.undefined
  /**
  	 * If this is a select number field, disable the empty option in the dropdown.
  	 */
  var withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
}

object NumberFilter {
  @scala.inline
  def apply(
    `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.NumberFilter,
    defaultValue: AnonComparator = null,
    delay: Int | Double = null,
    numberComparators: js.Array[FilterComparator] = null,
    options: js.Array[Double] = null,
    placeholder: String = null,
    style: AnonComparatorNumber = null,
    withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.undefined,
    withoutEmptyNumberOption: js.UndefOr[Boolean] = js.undefined,
    withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
  ): NumberFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (numberComparators != null) __obj.updateDynamic("numberComparators")(numberComparators.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutEmptyComparatorOption)) __obj.updateDynamic("withoutEmptyComparatorOption")(withoutEmptyComparatorOption.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutEmptyNumberOption)) __obj.updateDynamic("withoutEmptyNumberOption")(withoutEmptyNumberOption.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutEmptyOption)) __obj.updateDynamic("withoutEmptyOption")(withoutEmptyOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFilter]
  }
}

