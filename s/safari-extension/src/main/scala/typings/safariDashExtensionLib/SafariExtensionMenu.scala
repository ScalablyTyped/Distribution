package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariExtensionMenu extends js.Object {
  var identifier: java.lang.String = js.native
  var menuItems: js.Array[SafariExtensionMenuItem] = js.native
  var visible: scala.Boolean = js.native
  def appendMenuItem(identifier: java.lang.String, title: java.lang.String): SafariExtensionMenuItem = js.native
  def appendMenuItem(identifier: java.lang.String, title: java.lang.String, command: java.lang.String): SafariExtensionMenuItem = js.native
  def appendSeparator(identifier: java.lang.String): SafariExtensionMenuItem = js.native
  def insertMenuItem(index: scala.Double, identifier: java.lang.String, title: java.lang.String): SafariExtensionMenuItem = js.native
  def insertMenuItem(
    index: scala.Double,
    identifier: java.lang.String,
    title: java.lang.String,
    command: java.lang.String
  ): SafariExtensionMenuItem = js.native
  def insertSeparator(index: scala.Double, identifier: java.lang.String): SafariExtensionMenuItem = js.native
  def removeMenuItem(index: scala.Double): scala.Unit = js.native
}

