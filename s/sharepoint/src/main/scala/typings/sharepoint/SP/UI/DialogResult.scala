package typings.sharepoint.SP.UI

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.UI.DialogResult.OK
import typings.sharepoint.SP.UI.DialogResult.cancel
import typings.sharepoint.SP.UI.DialogResult.invalid
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialogResult with Double] = js.native
  /* 2 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  /* 1 */ @js.native
  object cancel extends TopLevel[cancel with Double]
  
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
}

