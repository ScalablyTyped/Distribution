package typings.safariExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariExtensionToolbarItem extends SafariEventTarget {
  
  /**
    * The current badge number.
    */
  var badge: Double = js.native
  
  var browserWindow: SafariBrowserWindow = js.native
  
  var command: String = js.native
  
  var disabled: Boolean = js.native
  
  var identifier: String = js.native
  
  /**
    * The URL of the current image.
    */
  var image: String = js.native
  
  /**
    * The label of the toolbar item, as shown in the toolbar’s overflow menu.
    */
  var label: String = js.native
  
  var menu: SafariExtensionMenu = js.native
  
  /**
    * The label of the toolbar item, as shown in the Customize palette.
    * This attribute is optional; its value defaults to the value of label.
    */
  var paletteLabel: String = js.native
  
  var popover: SafariExtensionPopover = js.native
  
  def showMenu(): Unit = js.native
  
  def showPopover(): Unit = js.native
  
  /**
    * The tooltip (help tag) of the toolbar item.
    * This attribute is optional; its value defaults to the value of label.
    */
  var toolTip: String = js.native
  
  def validate(): Unit = js.native
}
