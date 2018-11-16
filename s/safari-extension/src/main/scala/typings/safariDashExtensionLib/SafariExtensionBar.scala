package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariExtensionBar extends SafariEventTarget {
  var browserWindow: SafariBrowserWindow = js.native
  var contentWindow: Window = js.native
  var identifier: java.lang.String = js.native
  var label: java.lang.String = js.native
  var visible: scala.Boolean = js.native
  def hide(): scala.Unit = js.native
  def hide(doNotRemember: scala.Boolean): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def show(doNotRemember: scala.Boolean): scala.Unit = js.native
}

