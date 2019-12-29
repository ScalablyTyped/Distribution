package typings.sharepoint.SP.Utilities

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeFormat with Double] = js.native
  /* 1 */ @js.native
  object dateOnly extends TopLevel[dateOnly with Double]
  
  /* 0 */ @js.native
  object dateTime extends TopLevel[dateTime with Double]
  
  /* 3 */ @js.native
  object iSO8601 extends TopLevel[iSO8601 with Double]
  
  /* 6 */ @js.native
  object longDate extends TopLevel[longDate with Double]
  
  /* 4 */ @js.native
  object monthDayOnly extends TopLevel[monthDayOnly with Double]
  
  /* 5 */ @js.native
  object monthYearOnly extends TopLevel[monthYearOnly with Double]
  
  /* 2 */ @js.native
  object timeOnly extends TopLevel[timeOnly with Double]
  
  /* 7 */ @js.native
  object unknownFormat extends TopLevel[unknownFormat with Double]
  
}

