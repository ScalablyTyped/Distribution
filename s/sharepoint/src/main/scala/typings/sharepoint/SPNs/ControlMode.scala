package typings.sharepoint.SPNs

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
  sealed trait displayMode extends ControlMode
  
  @js.native
  sealed trait editMode extends ControlMode
  
  @js.native
  sealed trait invalid extends ControlMode
  
  @js.native
  sealed trait newMode extends ControlMode
  
  /* 1 */ val displayMode: typings.sharepoint.SPNs.ControlMode.displayMode with Double = js.native
  /* 2 */ val editMode: typings.sharepoint.SPNs.ControlMode.editMode with Double = js.native
  /* 0 */ val invalid: typings.sharepoint.SPNs.ControlMode.invalid with Double = js.native
  /* 3 */ val newMode: typings.sharepoint.SPNs.ControlMode.newMode with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControlMode with Double] = js.native
}

