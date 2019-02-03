package typings
package sharepointLib.SPNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Utilities.HttpUtility")
@js.native
class HttpUtility () extends js.Object

/* static members */
@JSGlobal("SP.Utilities.HttpUtility")
@js.native
object HttpUtility extends js.Object {
  /** Appends correct "Source" parameter to the specified url, and then navigates to this url.
    "Source" parameter is recognized in many places in SharePoint, usually to determine "Cancel" behavior. */
  def appendSourceAndNavigateTo(url: java.lang.String): scala.Unit = js.native
  def ecmaScriptStringLiteralEncode(scriptLiteralToEncode: java.lang.String): java.lang.String = js.native
  def escapeXmlText(stringToEscape: java.lang.String): java.lang.String = js.native
  /** Official version of STSHtmlEncode. Calls it internally. */
  def htmlEncode(stringToEncode: java.lang.String): java.lang.String = js.native
  def navigateHttpFolder(urlSrc: java.lang.String, frameTarget: java.lang.String): scala.Unit = js.native
  def navigateTo(url: java.lang.String): scala.Unit = js.native
  def urlKeyValueEncode(keyOrValueToEncode: java.lang.String): java.lang.String = js.native
  def urlPathEncode(stringToEncode: java.lang.String): java.lang.String = js.native
}

