package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.DateTimeFieldFriendlyFormatType.disabled
import typings.sharepoint.SP.DateTimeFieldFriendlyFormatType.relative
import typings.sharepoint.SP.DateTimeFieldFriendlyFormatType.unspecified
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateTimeFieldFriendlyFormatType with Double] = js.native
  /* 1 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /* 2 */ @js.native
  object relative extends TopLevel[relative with Double]
  
  /* 0 */ @js.native
  object unspecified extends TopLevel[unspecified with Double]
  
}

