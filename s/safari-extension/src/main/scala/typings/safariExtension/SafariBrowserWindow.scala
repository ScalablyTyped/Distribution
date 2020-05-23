package typings.safariExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariBrowserWindow extends SafariEventTarget {
  var activeTab: SafariBrowserTab = js.native
  var tabs: js.Array[SafariBrowserTab] = js.native
  var visible: Boolean = js.native
  def activate(): Unit = js.native
  def close(): Unit = js.native
  def insertTab(tab: SafariBrowserTab, index: Double): SafariBrowserTab = js.native
  /**
    * Opens a new tab in the window.
    * Available in Safari 5.0 and later.
    * @param visibility Either foreground if the tab should be opened in the foreground, or background if it should be opened in the background.
    * @param index The desired location of the new tab.
    * @returns A new tab.
    */
  def openTab(): SafariBrowserTab = js.native
  def openTab(visibility: String): SafariBrowserTab = js.native
  def openTab(visibility: String, index: Double): SafariBrowserTab = js.native
}

