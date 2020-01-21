package typings.safariExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariExtensionPopover extends SafariEventTarget {
  var contentWindow: Window = js.native
  var height: Double = js.native
  var identifier: String = js.native
  var visible: Boolean = js.native
  var width: Double = js.native
  def hide(): Unit = js.native
}

