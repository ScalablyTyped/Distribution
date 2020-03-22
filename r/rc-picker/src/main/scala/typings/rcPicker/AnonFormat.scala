package typings.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat[DateType] extends js.Object {
  /** A proxy for getting locale with moment or other locale library */
  var getShortMonths: js.UndefOr[js.Function1[/* locale */ String, js.Array[String]]] = js.undefined
  /** A proxy for getting locale with moment or other locale library */
  var getShortWeekDays: js.UndefOr[js.Function1[/* locale */ String, js.Array[String]]] = js.undefined
  def format(locale: String, date: DateType, format: String): String
  def getWeek(locale: String, value: DateType): Double
  def getWeekFirstDay(locale: String): Double
  /** Should only return validate date instance */
  def parse(locale: String, text: String, formats: js.Array[String]): DateType | Null
}

object AnonFormat {
  @scala.inline
  def apply[DateType](
    format: (String, DateType, String) => String,
    getWeek: (String, DateType) => Double,
    getWeekFirstDay: String => Double,
    parse: (String, String, js.Array[String]) => DateType | Null,
    getShortMonths: /* locale */ String => js.Array[String] = null,
    getShortWeekDays: /* locale */ String => js.Array[String] = null
  ): AnonFormat[DateType] = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction3(format), getWeek = js.Any.fromFunction2(getWeek), getWeekFirstDay = js.Any.fromFunction1(getWeekFirstDay), parse = js.Any.fromFunction3(parse))
    if (getShortMonths != null) __obj.updateDynamic("getShortMonths")(js.Any.fromFunction1(getShortMonths))
    if (getShortWeekDays != null) __obj.updateDynamic("getShortWeekDays")(js.Any.fromFunction1(getShortWeekDays))
    __obj.asInstanceOf[AnonFormat[DateType]]
  }
}

