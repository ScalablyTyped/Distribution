package typings.safariDashExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariReader extends SafariEventTarget {
  var available: Boolean = js.native
  var tab: SafariBrowserTab = js.native
  var visible: Boolean = js.native
  def dispatchMessage(name: String): Unit = js.native
  def dispatchMessage(name: String, message: js.Any): Unit = js.native
  def enter(): Unit = js.native
  def exit(): Unit = js.native
}

