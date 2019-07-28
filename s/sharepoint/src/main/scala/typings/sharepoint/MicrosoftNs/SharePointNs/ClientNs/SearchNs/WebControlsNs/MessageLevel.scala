package typings.sharepoint.MicrosoftNs.SharePointNs.ClientNs.SearchNs.WebControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageLevel extends js.Object

@JSGlobal("Microsoft.SharePoint.Client.Search.WebControls.MessageLevel")
@js.native
object MessageLevel extends js.Object {
  @js.native
  sealed trait error extends MessageLevel
  
  @js.native
  sealed trait information extends MessageLevel
  
  @js.native
  sealed trait warning extends MessageLevel
  
  /* 2 */ val error: typings.sharepoint.MicrosoftNs.SharePointNs.ClientNs.SearchNs.WebControlsNs.MessageLevel.error with Double = js.native
  /* 0 */ val information: typings.sharepoint.MicrosoftNs.SharePointNs.ClientNs.SearchNs.WebControlsNs.MessageLevel.information with Double = js.native
  /* 1 */ val warning: typings.sharepoint.MicrosoftNs.SharePointNs.ClientNs.SearchNs.WebControlsNs.MessageLevel.warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageLevel with Double] = js.native
}

