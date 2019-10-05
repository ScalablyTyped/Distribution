package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChoiceFormatType extends js.Object

@JSGlobal("SPClientTemplates.ChoiceFormatType")
@js.native
object ChoiceFormatType extends js.Object {
  @js.native
  sealed trait Dropdown extends ChoiceFormatType
  
  @js.native
  sealed trait Radio extends ChoiceFormatType
  
  /* 0 */ val Dropdown: typings.sharepoint.SPClientTemplates.ChoiceFormatType.Dropdown with Double = js.native
  /* 1 */ val Radio: typings.sharepoint.SPClientTemplates.ChoiceFormatType.Radio with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChoiceFormatType with Double] = js.native
}

