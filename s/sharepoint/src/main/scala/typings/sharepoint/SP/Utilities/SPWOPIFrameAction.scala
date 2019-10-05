package typings.sharepoint.SP.Utilities

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
  
  /* 1 */ val edit: typings.sharepoint.SP.Utilities.SPWOPIFrameAction.edit with Double = js.native
  /* 3 */ val interactivePreview: typings.sharepoint.SP.Utilities.SPWOPIFrameAction.interactivePreview with Double = js.native
  /* 2 */ val mobileView: typings.sharepoint.SP.Utilities.SPWOPIFrameAction.mobileView with Double = js.native
  /* 0 */ val view: typings.sharepoint.SP.Utilities.SPWOPIFrameAction.view with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SPWOPIFrameAction with Double] = js.native
}

