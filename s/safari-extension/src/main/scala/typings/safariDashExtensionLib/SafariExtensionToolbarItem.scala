package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariExtensionToolbarItem extends SafariEventTarget {
  /**
  		* The current badge number.
  		*/
  var badge: scala.Double = js.native
  var browserWindow: SafariBrowserWindow = js.native
  var command: java.lang.String = js.native
  var disabled: scala.Boolean = js.native
  var identifier: java.lang.String = js.native
  /**
  		* The URL of the current image.
  		*/
  var image: java.lang.String = js.native
  /**
  		* The label of the toolbar item, as shown in the toolbar’s overflow menu.
  		*/
  var label: java.lang.String = js.native
  var menu: SafariExtensionMenu = js.native
  /**
  		* The label of the toolbar item, as shown in the Customize palette.
  		* This attribute is optional; its value defaults to the value of label.
  		*/
  var paletteLabel: java.lang.String = js.native
  var popover: SafariExtensionPopover = js.native
  /**
  		* The tooltip (help tag) of the toolbar item.
  		* This attribute is optional; its value defaults to the value of label.
  		*/
  var toolTip: java.lang.String = js.native
  def showMenu(): scala.Unit = js.native
  def showPopover(): scala.Unit = js.native
  def validate(): scala.Unit = js.native
}

