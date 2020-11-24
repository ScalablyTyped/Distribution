package typings.safariExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariExtensionContextMenu extends js.Object {
  
  /**
    * Appends a menu item to the contextual menu.
    * If another menu item with the same identifier already exists, it is removed before appending the menu item. If command is not supplied, identifier is used as the command identifier.
    * @param identifier The unique identifier of the menu item.
    * @param title The title of the menu item.
    * @param command The command identifier that the context menu item sends when activated.
    * @returns The context menu item that was appended.
    */
  def appendContextMenuItem(identifier: String, title: String): SafariExtensionContextMenuItem = js.native
  def appendContextMenuItem(identifier: String, title: String, command: String): SafariExtensionContextMenuItem = js.native
  
  /**
    * Returns a list of the context menu items from this extension.
    * Only menu items from your extension are returned.
    */
  var contextMenuItems: js.Array[_] = js.native
  
  /**
    * Inserts a menu item at a specific index in the contextual menu.
    * If another menu item with the same identifier already exists, it is removed before appending the menu item. If command is not supplied, identifier is used as the command identifier.
    * @param index The index where the menu item is being inserted.
    * @param identifier The unique identifier of the menu item.
    * @param title The title of the menu item.
    * @param command The command identifier that the context menu item sends when activated.
    * @returns The context menu item that was inserted.
    */
  def insertContextMenuItem(index: Double, identifier: String, title: String): SafariExtensionContextMenuItem = js.native
  def insertContextMenuItem(index: Double, identifier: String, title: String, command: String): SafariExtensionContextMenuItem = js.native
}
