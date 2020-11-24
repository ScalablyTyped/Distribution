package typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
