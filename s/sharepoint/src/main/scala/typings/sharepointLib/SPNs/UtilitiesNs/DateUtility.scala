package typings
package sharepointLib.SPNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Utilities.DateUtility")
@js.native
class DateUtility () extends js.Object

/* static members */
@JSGlobal("SP.Utilities.DateUtility")
@js.native
object DateUtility extends js.Object {
  def dateToJulianDay(year: scala.Double, month: scala.Double, day: scala.Double): scala.Double = js.native
  def daysInMonth(year: scala.Double, month: scala.Double): scala.Double = js.native
  def isLeapYear(year: scala.Double): scala.Boolean = js.native
  def julianDayToDate(julianDay: scala.Double): sharepointLib.SPNs.DateTimeUtilNs.SimpleDate = js.native
}

