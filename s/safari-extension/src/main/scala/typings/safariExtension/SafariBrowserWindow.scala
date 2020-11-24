package typings.safariExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariBrowserWindow extends SafariEventTarget {
  
  def activate(): Unit = js.native
  
  var activeTab: SafariBrowserTab = js.native
  
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
  def openTab(visibility: js.UndefOr[scala.Nothing], index: Double): SafariBrowserTab = js.native
  def openTab(visibility: String): SafariBrowserTab = js.native
  def openTab(visibility: String, index: Double): SafariBrowserTab = js.native
  
  var tabs: js.Array[SafariBrowserTab] = js.native
  
  var visible: Boolean = js.native
}
