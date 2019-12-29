package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import typings.react.reactMod.CSSProperties
import typings.reactDashBootstrapDashTable.Anon_Comparator
import typings.reactDashBootstrapDashTable.Anon_ComparatorDate
import typings.reactDashBootstrapDashTable.Anon_ComparatorDateCSSProperties
import typings.reactDashBootstrapDashTable.Anon_ComparatorNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Filter extends js.Object

object _Filter {
  @scala.inline
  def SelectFilter(
    options: SelectFilterOptionsType,
    `type`: typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.SelectFilter,
    condition: FilterCondition = null,
    defaultValue: String | Double | Boolean = null,
    selectText: String = null,
    style: CSSProperties = null,
    withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
  ): _Filter = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (selectText != null) __obj.updateDynamic("selectText")(selectText.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutEmptyOption)) __obj.updateDynamic("withoutEmptyOption")(withoutEmptyOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Filter]
  }
  @scala.inline
  def DateFilter(
    `type`: typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.DateFilter,
    dateComparators: js.Array[FilterComparator] = null,
    defaultValue: Anon_ComparatorDate = null,
    delay: Int | Double = null,
    style: Anon_ComparatorDateCSSProperties = null
  ): _Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dateComparators != null) __obj.updateDynamic("dateComparators")(dateComparators.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Filter]
  }
  @scala.inline
  def NumberFilter(
    `type`: typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.NumberFilter,
    defaultValue: Anon_Comparator = null,
    delay: Int | Double = null,
    numberComparators: js.Array[FilterComparator] = null,
    options: js.Array[Double] = null,
    placeholder: String = null,
    style: Anon_ComparatorNumber = null,
    withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.undefined,
    withoutEmptyNumberOption: js.UndefOr[Boolean] = js.undefined,
    withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
  ): _Filter = {
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
    __obj.asInstanceOf[_Filter]
  }
  @scala.inline
  def TextFilter(
    `type`: typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.TextFilter,
    condition: FilterCondition = null,
    defaultValue: String = null,
    delay: Int | Double = null,
    placeholder: String = null,
    style: CSSProperties = null
  ): _Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Filter]
  }
  @scala.inline
  def RegexFilter(
    `type`: typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.RegexFilter,
    defaultValue: String = null,
    delay: Int | Double = null,
    placeholder: String = null,
    style: CSSProperties = null
  ): _Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Filter]
  }
}

