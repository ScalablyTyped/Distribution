package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SPClientTemplates.ChoiceFormatType.Dropdown
import typings.sharepoint.SPClientTemplates.ChoiceFormatType.Radio
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChoiceFormatType with Double] = js.native
  /* 0 */ @js.native
  object Dropdown extends TopLevel[Dropdown with Double]
  
  /* 1 */ @js.native
  object Radio extends TopLevel[Radio with Double]
  
}

