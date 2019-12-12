package typings.sharepoint.SP.Utilities

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.Utilities.SPWOPIFrameAction.edit
import typings.sharepoint.SP.Utilities.SPWOPIFrameAction.interactivePreview
import typings.sharepoint.SP.Utilities.SPWOPIFrameAction.mobileView
import typings.sharepoint.SP.Utilities.SPWOPIFrameAction.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SPWOPIFrameAction extends js.Object

@JSGlobal("SP.Utilities.SPWOPIFrameAction")
@js.native
object SPWOPIFrameAction extends js.Object {
  @js.native
  sealed trait edit extends SPWOPIFrameAction
  
  @js.native
  sealed trait interactivePreview extends SPWOPIFrameAction
  
  @js.native
  sealed trait mobileView extends SPWOPIFrameAction
  
  @js.native
  sealed trait view extends SPWOPIFrameAction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SPWOPIFrameAction with Double] = js.native
  /* 1 */ @js.native
  object edit extends TopLevel[edit with Double]
  
  /* 3 */ @js.native
  object interactivePreview extends TopLevel[interactivePreview with Double]
  
  /* 2 */ @js.native
  object mobileView extends TopLevel[mobileView with Double]
  
  /* 0 */ @js.native
  object view extends TopLevel[view with Double]
  
}

