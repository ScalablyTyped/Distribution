package typings.reactInfiniteCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccentColor extends js.Object {
  var accentColor: js.UndefOr[String] = js.undefined
  var floatingNav: js.UndefOr[AnonBackground] = js.undefined
  var headerColor: js.UndefOr[String] = js.undefined
  var selectionColor: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[AnonActive] = js.undefined
  var todayColor: js.UndefOr[String] = js.undefined
  var weekdayColor: js.UndefOr[String] = js.undefined
}

object AnonAccentColor {
  @scala.inline
  def apply(
    accentColor: String = null,
    floatingNav: AnonBackground = null,
    headerColor: String = null,
    selectionColor: String = null,
    textColor: AnonActive = null,
    todayColor: String = null,
    weekdayColor: String = null
  ): AnonAccentColor = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor.asInstanceOf[js.Any])
    if (floatingNav != null) __obj.updateDynamic("floatingNav")(floatingNav.asInstanceOf[js.Any])
    if (headerColor != null) __obj.updateDynamic("headerColor")(headerColor.asInstanceOf[js.Any])
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (todayColor != null) __obj.updateDynamic("todayColor")(todayColor.asInstanceOf[js.Any])
    if (weekdayColor != null) __obj.updateDynamic("weekdayColor")(weekdayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccentColor]
  }
}

