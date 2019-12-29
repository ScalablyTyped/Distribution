package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeFieldFormatType extends js.Object

@JSGlobal("SP.DateTimeFieldFormatType")
@js.native
object DateTimeFieldFormatType extends js.Object {
  @js.native
  sealed trait dateOnly extends DateTimeFieldFormatType
  
  @js.native
  sealed trait dateTime extends DateTimeFieldFormatType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeFieldFormatType with Double] = js.native
  /* 0 */ @js.native
  object dateOnly extends TopLevel[dateOnly with Double]
  
  /* 1 */ @js.native
  object dateTime extends TopLevel[dateTime with Double]
  
}

