package typings.sharepoint.SPNs.UINs

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
  sealed trait OK extends DialogResult
  
  /** User closed dialog, cancelling the action */
  @js.native
  sealed trait cancel extends DialogResult
  
  /** Do not use this */
  @js.native
  sealed trait invalid extends DialogResult
  
  /* 2 */ val OK: typings.sharepoint.SPNs.UINs.DialogResult.OK with Double = js.native
  /* 1 */ val cancel: typings.sharepoint.SPNs.UINs.DialogResult.cancel with Double = js.native
  /* 0 */ val invalid: typings.sharepoint.SPNs.UINs.DialogResult.invalid with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialogResult with Double] = js.native
}

