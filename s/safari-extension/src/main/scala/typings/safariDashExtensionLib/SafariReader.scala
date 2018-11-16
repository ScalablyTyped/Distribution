package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariReader extends SafariEventTarget {
  var available: scala.Boolean = js.native
  var tab: SafariBrowserTab = js.native
  var visible: scala.Boolean = js.native
  def dispatchMessage(name: java.lang.String): scala.Unit = js.native
  def dispatchMessage(name: java.lang.String, message: js.Any): scala.Unit = js.native
  def enter(): scala.Unit = js.native
  def exit(): scala.Unit = js.native
}

