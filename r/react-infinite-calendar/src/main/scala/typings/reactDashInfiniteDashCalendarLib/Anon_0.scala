package typings
package reactDashInfiniteDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var blank: js.UndefOr[java.lang.String] = js.undefined
  var headerFormat: js.UndefOr[java.lang.String] = js.undefined
  var todayLabel: js.UndefOr[Anon_Long] = js.undefined
  var weekStartsOn: js.UndefOr[
    reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`0` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`1` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`2` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`3` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`4` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`5` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`6`
  ] = js.undefined
  var weekdays: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_0 {
  @scala.inline
  def apply(
    blank: java.lang.String = null,
    headerFormat: java.lang.String = null,
    todayLabel: Anon_Long = null,
    weekStartsOn: reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`0` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`1` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`2` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`3` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`4` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`5` | reactDashInfiniteDashCalendarLib.reactDashInfiniteDashCalendarLibNumbers.`6` = null,
    weekdays: js.Array[java.lang.String] = null
  ): Anon_0 = {
    val __obj = js.Dynamic.literal()
    if (blank != null) __obj.updateDynamic("blank")(blank)
    if (headerFormat != null) __obj.updateDynamic("headerFormat")(headerFormat)
    if (todayLabel != null) __obj.updateDynamic("todayLabel")(todayLabel)
    if (weekStartsOn != null) __obj.updateDynamic("weekStartsOn")(weekStartsOn.asInstanceOf[js.Any])
    if (weekdays != null) __obj.updateDynamic("weekdays")(weekdays)
    __obj.asInstanceOf[Anon_0]
  }
}

