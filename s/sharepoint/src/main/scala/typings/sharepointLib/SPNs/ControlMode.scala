package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ControlMode extends js.Object

/** Represents display mode for a control or form */
@JSGlobal("SP.ControlMode")
@js.native
object ControlMode extends js.Object {
  @js.native
  sealed trait displayMode
    extends sharepointLib.SPNs.ControlMode
  
  @js.native
  sealed trait editMode
    extends sharepointLib.SPNs.ControlMode
  
  @js.native
  sealed trait invalid
    extends sharepointLib.SPNs.ControlMode
  
  @js.native
  sealed trait newMode
    extends sharepointLib.SPNs.ControlMode
  
  val displayMode: displayMode with java.lang.String = js.native
  val editMode: editMode with java.lang.String = js.native
  val invalid: invalid with java.lang.String = js.native
  val newMode: newMode with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.ControlMode with java.lang.String] = js.native
}

