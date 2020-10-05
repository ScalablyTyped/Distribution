package typings.rcPicker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format[DateType] extends js.Object {
  /** A proxy for getting locale with moment or other locale library */
  var getShortMonths: js.UndefOr[js.Function1[/* locale */ String, js.Array[String]]] = js.native
  /** A proxy for getting locale with moment or other locale library */
  var getShortWeekDays: js.UndefOr[js.Function1[/* locale */ String, js.Array[String]]] = js.native
  def format(locale: String, date: DateType, format: String): String = js.native
  def getWeek(locale: String, value: DateType): Double = js.native
  def getWeekFirstDay(locale: String): Double = js.native
  /** Should only return validate date instance */
  def parse(locale: String, text: String, formats: js.Array[String]): DateType | Null = js.native
}

object Format {
  @scala.inline
  def apply[DateType](
    format: (String, DateType, String) => String,
    getWeek: (String, DateType) => Double,
    getWeekFirstDay: String => Double,
    parse: (String, String, js.Array[String]) => DateType | Null
  ): Format[DateType] = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction3(format), getWeek = js.Any.fromFunction2(getWeek), getWeekFirstDay = js.Any.fromFunction1(getWeekFirstDay), parse = js.Any.fromFunction3(parse))
    __obj.asInstanceOf[Format[DateType]]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format[_], DateType] (val x: Self with Format[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormat(value: (String, DateType, String) => String): Self = this.set("format", js.Any.fromFunction3(value))
    @scala.inline
    def setGetWeek(value: (String, DateType) => Double): Self = this.set("getWeek", js.Any.fromFunction2(value))
    @scala.inline
    def setGetWeekFirstDay(value: String => Double): Self = this.set("getWeekFirstDay", js.Any.fromFunction1(value))
    @scala.inline
    def setParse(value: (String, String, js.Array[String]) => DateType | Null): Self = this.set("parse", js.Any.fromFunction3(value))
    @scala.inline
    def setGetShortMonths(value: /* locale */ String => js.Array[String]): Self = this.set("getShortMonths", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetShortMonths: Self = this.set("getShortMonths", js.undefined)
    @scala.inline
    def setGetShortWeekDays(value: /* locale */ String => js.Array[String]): Self = this.set("getShortWeekDays", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetShortWeekDays: Self = this.set("getShortWeekDays", js.undefined)
  }
  
}

