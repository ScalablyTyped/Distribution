package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChoiceFormatType extends js.Object

@JSGlobal("SP.ChoiceFormatType")
@js.native
object ChoiceFormatType extends js.Object {
  @js.native
  sealed trait dropdown extends ChoiceFormatType
  
  @js.native
  sealed trait radioButtons extends ChoiceFormatType
  
  /* 0 */ val dropdown: typings.sharepoint.SP.ChoiceFormatType.dropdown with Double = js.native
  /* 1 */ val radioButtons: typings.sharepoint.SP.ChoiceFormatType.radioButtons with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChoiceFormatType with Double] = js.native
}

