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
  
  val error: error with java.lang.String = js.native
  val information: information with java.lang.String = js.native
  val warning: warning with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.WebControlsNs.MessageLevel with java.lang.String
  ] = js.native
}

