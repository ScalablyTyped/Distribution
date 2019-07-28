package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import typings.reactDashBootstrapDashTable.Anon_ComparatorDate
import typings.reactDashBootstrapDashTable.Anon_ComparatorDateCSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFilter extends _Filter {
  /**
  	 * Date filter comparators
  	 */
  var dateComparators: js.UndefOr[js.Array[FilterComparator]] = js.undefined
  /**
  	 * Default value for the filter.
  	 */
  var defaultValue: js.UndefOr[Anon_ComparatorDate] = js.undefined
  /**
  	 * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
  	 */
  var delay: js.UndefOr[Double] = js.undefined
  /**
  	 * CSS Style to use for the select filter.
  	 */
  var style: js.UndefOr[Anon_ComparatorDateCSSProperties] = js.undefined
  /**
  	 * Filter type must be 'DateFilter'
  	 */
  var `type`: typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.DateFilter
}

object DateFilter {
  @scala.inline
  def apply(
    `type`: typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableStrings.DateFilter,
    dateComparators: js.Array[FilterComparator] = null,
    defaultValue: Anon_ComparatorDate = null,
    delay: Int | Double = null,
    style: Anon_ComparatorDateCSSProperties = null
  ): DateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (dateComparators != null) __obj.updateDynamic("dateComparators")(dateComparators)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DateFilter]
  }
}

