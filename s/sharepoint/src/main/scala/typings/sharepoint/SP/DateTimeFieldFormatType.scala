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
  
}

