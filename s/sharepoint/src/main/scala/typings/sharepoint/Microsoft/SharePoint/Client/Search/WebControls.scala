package typings.sharepoint.Microsoft.SharePoint.Client.Search

import typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel
import typings.sharepoint.SP.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.SharePoint.Client.Search.WebControls")
@js.native
object WebControls extends js.Object {
  @js.native
  class ControlMessage () extends ClientValueObject {
    def get_code(): Double = js.native
    def get_correlationID(): String = js.native
    def get_encodeDetails(): Boolean = js.native
    def get_header(): String = js.native
    def get_level(): MessageLevel = js.native
    def get_messageDetails(): String = js.native
    def get_messageDetailsForViewers(): String = js.native
    def get_serverTypeId(): String = js.native
    def get_showForViewerUsers(): Boolean = js.native
    def get_showInEditModeOnly(): Boolean = js.native
    def get_stackTrace(): String = js.native
    def get_type(): String = js.native
  }
  
  @js.native
  sealed trait MessageLevel extends js.Object
  
  @js.native
  object MessageLevel extends js.Object {
    @js.native
    sealed trait error extends MessageLevel
    
    @js.native
    sealed trait information extends MessageLevel
    
    @js.native
    sealed trait warning extends MessageLevel
    
    /* 2 */ val error: typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel.error with Double = js.native
    /* 0 */ val information: typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel.information with Double = js.native
    /* 1 */ val warning: typings.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.MessageLevel.warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MessageLevel with Double] = js.native
  }
  
}

