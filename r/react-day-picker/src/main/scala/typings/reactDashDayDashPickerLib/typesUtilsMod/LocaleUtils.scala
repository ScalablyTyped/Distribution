package typings
package reactDashDayDashPickerLib.typesUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LocaleUtils extends js.Object {
  def formatDay(day: stdLib.Date, locale: java.lang.String): java.lang.String
  def formatMonthTitle(month: stdLib.Date, locale: java.lang.String): java.lang.String
  def formatWeekdayLong(weekday: scala.Double, locale: java.lang.String): java.lang.String
  def formatWeekdayShort(weekday: scala.Double, locale: java.lang.String): java.lang.String
  def getFirstDayOfWeek(locale: java.lang.String): scala.Double
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
  ]
}

