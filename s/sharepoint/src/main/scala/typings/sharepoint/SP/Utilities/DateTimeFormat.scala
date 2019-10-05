package typings.sharepoint.SP.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeFormat extends js.Object

@JSGlobal("SP.Utilities.DateTimeFormat")
@js.native
object DateTimeFormat extends js.Object {
  @js.native
  sealed trait dateOnly extends DateTimeFormat
  
  @js.native
  sealed trait dateTime extends DateTimeFormat
  
  @js.native
  sealed trait iSO8601 extends DateTimeFormat
  
  @js.native
  sealed trait longDate extends DateTimeFormat
  
  @js.native
  sealed trait monthDayOnly extends DateTimeFormat
  
  @js.native
  sealed trait monthYearOnly extends DateTimeFormat
  
  @js.native
  sealed trait timeOnly extends DateTimeFormat
  
  @js.native
  sealed trait unknownFormat extends DateTimeFormat
  
  /* 1 */ val dateOnly: typings.sharepoint.SP.Utilities.DateTimeFormat.dateOnly with Double = js.native
  /* 0 */ val dateTime: typings.sharepoint.SP.Utilities.DateTimeFormat.dateTime with Double = js.native
  /* 3 */ val iSO8601: typings.sharepoint.SP.Utilities.DateTimeFormat.iSO8601 with Double = js.native
  /* 6 */ val longDate: typings.sharepoint.SP.Utilities.DateTimeFormat.longDate with Double = js.native
  /* 4 */ val monthDayOnly: typings.sharepoint.SP.Utilities.DateTimeFormat.monthDayOnly with Double = js.native
  /* 5 */ val monthYearOnly: typings.sharepoint.SP.Utilities.DateTimeFormat.monthYearOnly with Double = js.native
  /* 2 */ val timeOnly: typings.sharepoint.SP.Utilities.DateTimeFormat.timeOnly with Double = js.native
  /* 7 */ val unknownFormat: typings.sharepoint.SP.Utilities.DateTimeFormat.unknownFormat with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeFormat with Double] = js.native
}

