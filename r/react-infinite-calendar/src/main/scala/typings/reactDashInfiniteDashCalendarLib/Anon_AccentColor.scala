package typings
package reactDashInfiniteDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccentColor extends js.Object {
  var accentColor: js.UndefOr[java.lang.String] = js.undefined
  var floatingNav: js.UndefOr[Anon_Background] = js.undefined
  var headerColor: js.UndefOr[java.lang.String] = js.undefined
  var selectionColor: js.UndefOr[java.lang.String] = js.undefined
  var textColor: js.UndefOr[Anon_Active] = js.undefined
  var todayColor: js.UndefOr[java.lang.String] = js.undefined
  var weekdayColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AccentColor {
  @scala.inline
  def apply(
    accentColor: java.lang.String = null,
    floatingNav: Anon_Background = null,
    headerColor: java.lang.String = null,
    selectionColor: java.lang.String = null,
    textColor: Anon_Active = null,
    todayColor: java.lang.String = null,
    weekdayColor: java.lang.String = null
  ): Anon_AccentColor = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor)
    if (floatingNav != null) __obj.updateDynamic("floatingNav")(floatingNav)
    if (headerColor != null) __obj.updateDynamic("headerColor")(headerColor)
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor)
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (todayColor != null) __obj.updateDynamic("todayColor")(todayColor)
    if (weekdayColor != null) __obj.updateDynamic("weekdayColor")(weekdayColor)
    __obj.asInstanceOf[Anon_AccentColor]
  }
}

