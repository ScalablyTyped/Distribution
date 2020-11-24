package typings.sharepoint.global.SP.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Utilities.HttpUtility")
@js.native
class HttpUtility ()
  extends typings.sharepoint.SP.Utilities.HttpUtility
/* static members */
@JSGlobal("SP.Utilities.HttpUtility")
@js.native
object HttpUtility extends js.Object {
  
  /** Appends correct "Source" parameter to the specified url, and then navigates to this url.
    "Source" parameter is recognized in many places in SharePoint, usually to determine "Cancel" behavior. */
  def appendSourceAndNavigateTo(url: String): Unit = js.native
  
  def ecmaScriptStringLiteralEncode(scriptLiteralToEncode: String): String = js.native
  
  def escapeXmlText(stringToEscape: String): String = js.native
  
  /** Official version of STSHtmlEncode. Calls it internally. */
  def htmlEncode(stringToEncode: String): String = js.native
  
  def navigateHttpFolder(urlSrc: String, frameTarget: String): Unit = js.native
  
  def navigateTo(url: String): Unit = js.native
  
  def urlKeyValueEncode(keyOrValueToEncode: String): String = js.native
  
  def urlPathEncode(stringToEncode: String): String = js.native
}
