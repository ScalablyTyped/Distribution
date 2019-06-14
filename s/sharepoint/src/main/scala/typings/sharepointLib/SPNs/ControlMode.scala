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
  
  /* 1 */ val displayMode: displayMode with scala.Double = js.native
  /* 2 */ val editMode: editMode with scala.Double = js.native
  /* 0 */ val invalid: invalid with scala.Double = js.native
  /* 3 */ val newMode: newMode with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.ControlMode with scala.Double] = js.native
}

