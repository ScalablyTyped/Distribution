package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariExtension extends js.Object {
  var bars: js.Array[SafariExtensionBar] = js.native
  var baseURI: java.lang.String = js.native
  var bundleVersion: java.lang.String = js.native
  var displayVersion: java.lang.String = js.native
  var globalPage: SafariExtensionGlobalPage = js.native
  var menus: js.Array[SafariExtensionMenu] = js.native
  var popovers: js.Array[SafariExtensionPopover] = js.native
  var secureSettings: SafariExtensionSecureSettings = js.native
  var settings: SafariExtensionSettings = js.native
  var toolbarItems: js.Array[SafariExtensionToolbarItem] = js.native
  def addContentScript(
    source: java.lang.String,
    whitelist: js.Array[java.lang.String],
    blacklist: js.Array[java.lang.String],
    runAtEnd: scala.Boolean
  ): java.lang.String = js.native
  def addContentScriptFromURL(
    url: java.lang.String,
    whitelist: js.Array[java.lang.String],
    blacklist: js.Array[java.lang.String],
    runAtEnd: scala.Boolean
  ): java.lang.String = js.native
  def addContentStyleSheet(
    source: java.lang.String,
    whitelist: js.Array[java.lang.String],
    blacklist: js.Array[java.lang.String]
  ): java.lang.String = js.native
  def addContentStyleSheetFromURL(
    url: java.lang.String,
    whitelist: js.Array[java.lang.String],
    blacklist: js.Array[java.lang.String]
  ): java.lang.String = js.native
  def createMenu(identifier: java.lang.String): SafariExtensionMenu = js.native
  def createPopover(identifier: java.lang.String, url: java.lang.String): SafariExtensionPopover = js.native
  def createPopover(identifier: java.lang.String, url: java.lang.String, width: scala.Double): SafariExtensionPopover = js.native
  def createPopover(identifier: java.lang.String, url: java.lang.String, width: scala.Double, height: scala.Double): SafariExtensionPopover = js.native
  def removeContentScript(url: java.lang.String): scala.Unit = js.native
  def removeContentScripts(): scala.Unit = js.native
  def removeContentStyleSheet(url: java.lang.String): scala.Unit = js.native
  def removeContentStyleSheets(): scala.Unit = js.native
  def removeMenu(identifier: java.lang.String): scala.Unit = js.native
  def removePopover(identifier: java.lang.String): scala.Unit = js.native
}

