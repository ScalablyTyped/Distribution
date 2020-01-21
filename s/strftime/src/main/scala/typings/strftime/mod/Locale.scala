package typings.strftime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var AM: js.UndefOr[String] = js.undefined
  var PM: js.UndefOr[String] = js.undefined
  var am: js.UndefOr[String] = js.undefined
  var days: js.UndefOr[js.Array[String]] = js.undefined
  var formats: LocaleFormats
  var months: js.UndefOr[js.Array[String]] = js.undefined
  var pm: js.UndefOr[String] = js.undefined
  var shortDays: js.UndefOr[js.Array[String]] = js.undefined
  var shortMonths: js.UndefOr[js.Array[String]] = js.undefined
}

object Locale {
  @scala.inline
  def apply(
    formats: LocaleFormats,
    AM: String = null,
    PM: String = null,
    am: String = null,
    days: js.Array[String] = null,
    months: js.Array[String] = null,
    pm: String = null,
    shortDays: js.Array[String] = null,
    shortMonths: js.Array[String] = null
  ): Locale = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    if (AM != null) __obj.updateDynamic("AM")(AM.asInstanceOf[js.Any])
    if (PM != null) __obj.updateDynamic("PM")(PM.asInstanceOf[js.Any])
    if (am != null) __obj.updateDynamic("am")(am.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (pm != null) __obj.updateDynamic("pm")(pm.asInstanceOf[js.Any])
    if (shortDays != null) __obj.updateDynamic("shortDays")(shortDays.asInstanceOf[js.Any])
    if (shortMonths != null) __obj.updateDynamic("shortMonths")(shortMonths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

