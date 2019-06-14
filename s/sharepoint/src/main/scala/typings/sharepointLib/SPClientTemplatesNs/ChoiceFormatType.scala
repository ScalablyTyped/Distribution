package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChoiceFormatType extends js.Object

@JSGlobal("SPClientTemplates.ChoiceFormatType")
@js.native
object ChoiceFormatType extends js.Object {
  @js.native
  sealed trait Dropdown
    extends sharepointLib.SPClientTemplatesNs.ChoiceFormatType
  
  @js.native
  sealed trait Radio
    extends sharepointLib.SPClientTemplatesNs.ChoiceFormatType
  
  /* 0 */ val Dropdown: Dropdown with scala.Double = js.native
  /* 1 */ val Radio: Radio with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPClientTemplatesNs.ChoiceFormatType with scala.Double] = js.native
}

