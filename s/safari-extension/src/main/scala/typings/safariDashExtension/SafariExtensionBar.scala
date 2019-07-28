package typings.safariDashExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariExtensionBar extends SafariEventTarget {
  var browserWindow: SafariBrowserWindow = js.native
  var contentWindow: Window = js.native
  var identifier: String = js.native
  var label: String = js.native
  var visible: Boolean = js.native
  def hide(): Unit = js.native
  def hide(doNotRemember: Boolean): Unit = js.native
  def show(): Unit = js.native
  def show(doNotRemember: Boolean): Unit = js.native
}

