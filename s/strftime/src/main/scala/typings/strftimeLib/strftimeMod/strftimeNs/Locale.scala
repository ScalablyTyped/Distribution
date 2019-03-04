package typings
package strftimeLib.strftimeMod.strftimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var AM: js.UndefOr[java.lang.String] = js.undefined
  var PM: js.UndefOr[java.lang.String] = js.undefined
  var am: js.UndefOr[java.lang.String] = js.undefined
  var days: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var formats: LocaleFormats
  var months: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var pm: js.UndefOr[java.lang.String] = js.undefined
  var shortDays: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var shortMonths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Locale {
  @scala.inline
  def apply(
    formats: LocaleFormats,
    AM: java.lang.String = null,
    PM: java.lang.String = null,
    am: java.lang.String = null,
    days: js.Array[java.lang.String] = null,
    months: js.Array[java.lang.String] = null,
    pm: java.lang.String = null,
    shortDays: js.Array[java.lang.String] = null,
    shortMonths: js.Array[java.lang.String] = null
  ): Locale = {
    val __obj = js.Dynamic.literal(formats = formats)
    if (AM != null) __obj.updateDynamic("AM")(AM)
    if (PM != null) __obj.updateDynamic("PM")(PM)
    if (am != null) __obj.updateDynamic("am")(am)
    if (days != null) __obj.updateDynamic("days")(days)
    if (months != null) __obj.updateDynamic("months")(months)
    if (pm != null) __obj.updateDynamic("pm")(pm)
    if (shortDays != null) __obj.updateDynamic("shortDays")(shortDays)
    if (shortMonths != null) __obj.updateDynamic("shortMonths")(shortMonths)
    __obj.asInstanceOf[Locale]
  }
}

