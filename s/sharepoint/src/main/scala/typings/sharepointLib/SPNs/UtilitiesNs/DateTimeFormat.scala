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
  
  /* 1 */ val dateOnly: dateOnly with scala.Double = js.native
  /* 0 */ val dateTime: dateTime with scala.Double = js.native
  /* 3 */ val iSO8601: iSO8601 with scala.Double = js.native
  /* 6 */ val longDate: longDate with scala.Double = js.native
  /* 4 */ val monthDayOnly: monthDayOnly with scala.Double = js.native
  /* 5 */ val monthYearOnly: monthYearOnly with scala.Double = js.native
  /* 2 */ val timeOnly: timeOnly with scala.Double = js.native
  /* 7 */ val unknownFormat: unknownFormat with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UtilitiesNs.DateTimeFormat with scala.Double] = js.native
}

