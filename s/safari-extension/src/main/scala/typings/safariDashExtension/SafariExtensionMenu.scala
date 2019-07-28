package typings.safariDashExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariExtensionMenu extends js.Object {
  var identifier: String = js.native
  var menuItems: js.Array[SafariExtensionMenuItem] = js.native
  var visible: Boolean = js.native
  def appendMenuItem(identifier: String, title: String): SafariExtensionMenuItem = js.native
  def appendMenuItem(identifier: String, title: String, command: String): SafariExtensionMenuItem = js.native
  def appendSeparator(identifier: String): SafariExtensionMenuItem = js.native
  def insertMenuItem(index: Double, identifier: String, title: String): SafariExtensionMenuItem = js.native
  def insertMenuItem(index: Double, identifier: String, title: String, command: String): SafariExtensionMenuItem = js.native
  def insertSeparator(index: Double, identifier: String): SafariExtensionMenuItem = js.native
  def removeMenuItem(index: Double): Unit = js.native
}

