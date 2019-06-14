package typings
package sharepointLib.SPNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DialogResult extends js.Object

/** Result of a modal dialog execution */
@JSGlobal("SP.UI.DialogResult")
@js.native
object DialogResult extends js.Object {
  /** Dialog actions completed successfully */
  @js.native
  sealed trait OK
    extends sharepointLib.SPNs.UINs.DialogResult
  
  /** User closed dialog, cancelling the action */
  @js.native
  sealed trait cancel
    extends sharepointLib.SPNs.UINs.DialogResult
  
  /** Do not use this */
  @js.native
  sealed trait invalid
    extends sharepointLib.SPNs.UINs.DialogResult
  
  /* 2 */ val OK: OK with scala.Double = js.native
  /* 1 */ val cancel: cancel with scala.Double = js.native
  /* 0 */ val invalid: invalid with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UINs.DialogResult with scala.Double] = js.native
}

