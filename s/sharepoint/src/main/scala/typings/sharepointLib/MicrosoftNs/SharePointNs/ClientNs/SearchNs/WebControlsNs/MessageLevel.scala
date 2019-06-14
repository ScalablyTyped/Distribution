package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.WebControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageLevel extends js.Object

@JSGlobal("Microsoft.SharePoint.Client.Search.WebControls.MessageLevel")
@js.native
object MessageLevel extends js.Object {
  @js.native
  sealed trait error
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.WebControlsNs.MessageLevel
  
  @js.native
  sealed trait information
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.WebControlsNs.MessageLevel
  
  @js.native
  sealed trait warning
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.WebControlsNs.MessageLevel
  
  /* 2 */ val error: error with scala.Double = js.native
  /* 0 */ val information: information with scala.Double = js.native
  /* 1 */ val warning: warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.WebControlsNs.MessageLevel with scala.Double
  ] = js.native
}

