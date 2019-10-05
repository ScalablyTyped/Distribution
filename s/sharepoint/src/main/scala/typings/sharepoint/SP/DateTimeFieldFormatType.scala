package typings.sharepoint.SP

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
  
  /* 0 */ val dateOnly: typings.sharepoint.SP.DateTimeFieldFormatType.dateOnly with Double = js.native
  /* 1 */ val dateTime: typings.sharepoint.SP.DateTimeFieldFormatType.dateTime with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeFieldFormatType with Double] = js.native
}

