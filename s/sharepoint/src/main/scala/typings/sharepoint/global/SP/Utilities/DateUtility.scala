package typings.sharepoint.global.SP.Utilities

import typings.sharepoint.SP.DateTimeUtil.SimpleDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Utilities.DateUtility")
@js.native
class DateUtility ()
  extends typings.sharepoint.SP.Utilities.DateUtility
/* static members */
@JSGlobal("SP.Utilities.DateUtility")
@js.native
object DateUtility extends js.Object {
  
  def dateToJulianDay(year: Double, month: Double, day: Double): Double = js.native
  
  def daysInMonth(year: Double, month: Double): Double = js.native
  
  def isLeapYear(year: Double): Boolean = js.native
  
  def julianDayToDate(julianDay: Double): SimpleDate = js.native
}
