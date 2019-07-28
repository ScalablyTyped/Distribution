package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateTimeFieldFriendlyFormatType extends js.Object

@JSGlobal("SP.DateTimeFieldFriendlyFormatType")
@js.native
object DateTimeFieldFriendlyFormatType extends js.Object {
  @js.native
  sealed trait disabled extends DateTimeFieldFriendlyFormatType
  
  @js.native
  sealed trait relative extends DateTimeFieldFriendlyFormatType
  
  @js.native
  sealed trait unspecified extends DateTimeFieldFriendlyFormatType
  
  /* 1 */ val disabled: typings.sharepoint.SPNs.DateTimeFieldFriendlyFormatType.disabled with Double = js.native
  /* 2 */ val relative: typings.sharepoint.SPNs.DateTimeFieldFriendlyFormatType.relative with Double = js.native
  /* 0 */ val unspecified: typings.sharepoint.SPNs.DateTimeFieldFriendlyFormatType.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeFieldFriendlyFormatType with Double] = js.native
}

