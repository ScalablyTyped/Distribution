package typings.sharepoint.Microsoft.SharePoint.Client.Search

import org.scalablytyped.runtime.TopLevel
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MessageLevel with Double] = js.native
    /* 2 */ @js.native
    object error extends TopLevel[error with Double]
    
    /* 0 */ @js.native
    object information extends TopLevel[information with Double]
    
    /* 1 */ @js.native
    object warning extends TopLevel[warning with Double]
    
  }
  
}

