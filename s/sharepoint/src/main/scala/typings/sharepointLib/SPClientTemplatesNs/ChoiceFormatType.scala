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
  
  val Dropdown: Dropdown with java.lang.String = js.native
  val Radio: Radio with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPClientTemplatesNs.ChoiceFormatType with java.lang.String] = js.native
}

