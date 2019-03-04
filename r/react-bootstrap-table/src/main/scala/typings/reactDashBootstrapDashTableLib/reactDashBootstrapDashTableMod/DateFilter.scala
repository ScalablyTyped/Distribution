package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

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
  var defaultValue: js.UndefOr[reactDashBootstrapDashTableLib.Anon_ComparatorDate] = js.undefined
  /**
  	 * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
  	 */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * CSS Style to use for the select filter.
  	 */
  var style: js.UndefOr[reactDashBootstrapDashTableLib.Anon_ComparatorDateCSSProperties] = js.undefined
  /**
  	 * Filter type must be 'DateFilter'
  	 */
  var `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.DateFilter
}

object DateFilter {
  @scala.inline
  def apply(
    `type`: reactDashBootstrapDashTableLib.reactDashBootstrapDashTableLibStrings.DateFilter,
    dateComparators: js.Array[FilterComparator] = null,
    defaultValue: reactDashBootstrapDashTableLib.Anon_ComparatorDate = null,
    delay: scala.Int | scala.Double = null,
    style: reactDashBootstrapDashTableLib.Anon_ComparatorDateCSSProperties = null
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

