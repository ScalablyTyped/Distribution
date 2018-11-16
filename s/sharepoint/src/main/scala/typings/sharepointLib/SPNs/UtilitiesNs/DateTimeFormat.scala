package typings
package sharepointLib.SPNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeFormat extends js.Object

@JSGlobal("SP.Utilities.DateTimeFormat")
@js.native
object DateTimeFormat extends js.Object {
  @js.native
  sealed trait dateOnly
    extends sharepointLib.SPNs.UtilitiesNs.DateTimeFormat
  
  @js.native
  sealed trait dateTime
    extends sharepointLib.SPNs.UtilitiesNs.DateTimeFormat
  
  @js.native
  sealed trait iSO8601
    extends sharepointLib.SPNs.UtilitiesNs.DateTimeFormat
  
  @js.native
  sealed trait longDate
    extends sharepointLib.SPNs.UtilitiesNs.DateTimeFormat
  
  @js.native
  sealed trait monthDayOnly
    extends sharepointLib.SPNs.UtilitiesNs.DateTimeFormat
  
  @js.native
  sealed trait monthYearOnly
    extends sharepointLib.SPNs.UtilitiesNs.DateTimeFormat
  
  @js.native
  sealed trait timeOnly
    extends sharepointLib.SPNs.UtilitiesNs.DateTimeFormat
  
  @js.native
  sealed trait unknownFormat
    extends sharepointLib.SPNs.UtilitiesNs.DateTimeFormat
  
  val dateOnly: dateOnly with java.lang.String = js.native
  val dateTime: dateTime with java.lang.String = js.native
  val iSO8601: iSO8601 with java.lang.String = js.native
  val longDate: longDate with java.lang.String = js.native
  val monthDayOnly: monthDayOnly with java.lang.String = js.native
  val monthYearOnly: monthYearOnly with java.lang.String = js.native
  val timeOnly: timeOnly with java.lang.String = js.native
  val unknownFormat: unknownFormat with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.UtilitiesNs.DateTimeFormat with java.lang.String] = js.native
}

