package typings.safariExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariApplication extends SafariEventTarget {
  var activeBrowserWindow: SafariBrowserWindow = js.native
  var browserWindows: js.Array[SafariBrowserWindow] = js.native
  var privateBrowsing: SafariPrivateBrowsing = js.native
  def openBrowserWindow(): SafariBrowserWindow = js.native
}

