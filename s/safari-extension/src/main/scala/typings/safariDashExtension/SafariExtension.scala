package typings.safariDashExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariExtension extends js.Object {
  var bars: js.Array[SafariExtensionBar] = js.native
  var baseURI: String = js.native
  var bundleVersion: String = js.native
  var displayVersion: String = js.native
  var globalPage: SafariExtensionGlobalPage = js.native
  var menus: js.Array[SafariExtensionMenu] = js.native
  var popovers: js.Array[SafariExtensionPopover] = js.native
  var secureSettings: SafariExtensionSecureSettings = js.native
  var settings: SafariExtensionSettings = js.native
  var toolbarItems: js.Array[SafariExtensionToolbarItem] = js.native
  def addContentScript(source: String, whitelist: js.Array[String], blacklist: js.Array[String], runAtEnd: Boolean): String = js.native
  def addContentScriptFromURL(url: String, whitelist: js.Array[String], blacklist: js.Array[String], runAtEnd: Boolean): String = js.native
  def addContentStyleSheet(source: String, whitelist: js.Array[String], blacklist: js.Array[String]): String = js.native
  def addContentStyleSheetFromURL(url: String, whitelist: js.Array[String], blacklist: js.Array[String]): String = js.native
  def createMenu(identifier: String): SafariExtensionMenu = js.native
  def createPopover(identifier: String, url: String): SafariExtensionPopover = js.native
  def createPopover(identifier: String, url: String, width: Double): SafariExtensionPopover = js.native
  def createPopover(identifier: String, url: String, width: Double, height: Double): SafariExtensionPopover = js.native
  def removeContentScript(url: String): Unit = js.native
  def removeContentScripts(): Unit = js.native
  def removeContentStyleSheet(url: String): Unit = js.native
  def removeContentStyleSheets(): Unit = js.native
  def removeMenu(identifier: String): Unit = js.native
  def removePopover(identifier: String): Unit = js.native
}

