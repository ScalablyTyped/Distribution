package typings.sharepoint.global.Microsoft.SharePoint.Client.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebControls {
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.WebControls.ControlMessage")
  @js.native
  class ControlMessage ()
    extends typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.ControlMessage
  
  @JSGlobal("Microsoft.SharePoint.Client.Search.WebControls.MessageLevel")
  @js.native
  object MessageLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel with Double
      ] = js.native
    
    /* 2 */ val error: typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel.error with Double = js.native
    
    /* 0 */ val information: typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel.information with Double = js.native
    
    /* 1 */ val warning: typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel.warning with Double = js.native
  }
}
