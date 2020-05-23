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
  
}

