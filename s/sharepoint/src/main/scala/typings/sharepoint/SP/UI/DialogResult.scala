package typings.sharepoint.SP.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DialogResult extends StObject
/** Result of a modal dialog execution */
@JSGlobal("SP.UI.DialogResult")
@js.native
object DialogResult extends StObject {
  
  /** Dialog actions completed successfully */
  @js.native
  sealed trait OK extends DialogResult
  
  /** User closed dialog, cancelling the action */
  @js.native
  sealed trait cancel extends DialogResult
  
  /** Do not use this */
  @js.native
  sealed trait invalid extends DialogResult
}
