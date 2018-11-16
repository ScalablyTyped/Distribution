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
  
  val DisplayForm: DisplayForm with java.lang.String = js.native
  val EditForm: EditForm with java.lang.String = js.native
  val Invalid: Invalid with java.lang.String = js.native
  val NewForm: NewForm with java.lang.String = js.native
  val View: View with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPClientTemplatesNs.ClientControlMode with java.lang.String] = js.native
}

