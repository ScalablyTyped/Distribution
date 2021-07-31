package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariExtensionMenu extends StObject {
  
  def appendMenuItem(identifier: String, title: String): SafariExtensionMenuItem = js.native
  def appendMenuItem(identifier: String, title: String, command: String): SafariExtensionMenuItem = js.native
  
  def appendSeparator(identifier: String): SafariExtensionMenuItem = js.native
  
  var identifier: String = js.native
  
  def insertMenuItem(index: Double, identifier: String, title: String): SafariExtensionMenuItem = js.native
  def insertMenuItem(index: Double, identifier: String, title: String, command: String): SafariExtensionMenuItem = js.native
  
  def insertSeparator(index: Double, identifier: String): SafariExtensionMenuItem = js.native
  
  var menuItems: js.Array[SafariExtensionMenuItem] = js.native
  
  def removeMenuItem(index: Double): Unit = js.native
  
  var visible: Boolean = js.native
}
