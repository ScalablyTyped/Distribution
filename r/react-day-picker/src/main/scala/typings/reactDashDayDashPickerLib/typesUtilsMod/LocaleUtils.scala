package typings
package reactDashDayDashPickerLib.typesUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleUtils extends js.Object {
  def formatDay(day: stdLib.Date): java.lang.String = js.native
  def formatDay(day: stdLib.Date, locale: java.lang.String): java.lang.String = js.native
  def formatMonthTitle(month: stdLib.Date): java.lang.String = js.native
  def formatMonthTitle(month: stdLib.Date, locale: java.lang.String): java.lang.String = js.native
  def formatWeekdayLong(weekday: scala.Double): java.lang.String = js.native
  def formatWeekdayLong(weekday: scala.Double, locale: java.lang.String): java.lang.String = js.native
  def formatWeekdayShort(weekday: scala.Double): java.lang.String = js.native
  def formatWeekdayShort(weekday: scala.Double, locale: java.lang.String): java.lang.String = js.native
  def getFirstDayOfWeek(): scala.Double = js.native
  def getFirstDayOfWeek(locale: java.lang.String): scala.Double = js.native
  def getMonths(): js.Tuple12[
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String
  ] = js.native
  def getMonths(locale: java.lang.String): js.Tuple12[
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String
  ] = js.native
}

