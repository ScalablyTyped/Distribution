package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariExtensionPopover extends SafariEventTarget {
  var contentWindow: Window = js.native
  var height: scala.Double = js.native
  var identifier: java.lang.String = js.native
  var visible: scala.Boolean = js.native
  var width: scala.Double = js.native
  def hide(): scala.Unit = js.native
}

