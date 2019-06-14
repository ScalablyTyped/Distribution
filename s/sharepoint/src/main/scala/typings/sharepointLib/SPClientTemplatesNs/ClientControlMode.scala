package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClientControlMode extends js.Object

@JSGlobal("SPClientTemplates.ClientControlMode")
@js.native
object ClientControlMode extends js.Object {
  @js.native
  sealed trait DisplayForm
    extends sharepointLib.SPClientTemplatesNs.ClientControlMode
  
  @js.native
  sealed trait EditForm
    extends sharepointLib.SPClientTemplatesNs.ClientControlMode
  
  @js.native
  sealed trait Invalid
    extends sharepointLib.SPClientTemplatesNs.ClientControlMode
  
  @js.native
  sealed trait NewForm
    extends sharepointLib.SPClientTemplatesNs.ClientControlMode
  
  @js.native
  sealed trait View
    extends sharepointLib.SPClientTemplatesNs.ClientControlMode
  
  /* 1 */ val DisplayForm: DisplayForm with scala.Double = js.native
  /* 2 */ val EditForm: EditForm with scala.Double = js.native
  /* 0 */ val Invalid: Invalid with scala.Double = js.native
  /* 3 */ val NewForm: NewForm with scala.Double = js.native
  /* 4 */ val View: View with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPClientTemplatesNs.ClientControlMode with scala.Double] = js.native
}

