package typings.sharepoint.global.Microsoft.SharePoint.Client.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.SharePoint.Client.Search.WebControls")
@js.native
object WebControls extends js.Object {
  
  @js.native
  class ControlMessage ()
    extends typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.ControlMessage
  
  @js.native
  object MessageLevel extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel with Double
      ] = js.native
    
    /* 2 */ val error: typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel.error with Double = js.native
    
    /* 0 */ val information: typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel.information with Double = js.native
    
    /* 1 */ val warning: typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel.warning with Double = js.native
  }
}
