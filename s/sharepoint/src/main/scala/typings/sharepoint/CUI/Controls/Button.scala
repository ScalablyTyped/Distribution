package typings.sharepoint.CUI.Controls

import typings.sharepoint.CUI.Control
import typings.sharepoint.CUI.ControlProperties
import typings.sharepoint.CUI.ISelectableControl
import typings.sharepoint.CUI.Root
import typings.std.Event_
import typings.std.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Controls.Button")
@js.native
class Button protected ()
  extends Control
     with ISelectableControl {
  def this(root: Root, id: String, properties: ControlProperties) = this()
  def createComponentForDisplayModeInternal(displayMode: String): js.Any = js.native
  def createDOMElementForDisplayMode(displayMode: String): js.Any = js.native
  def deselect(): Unit = js.native
  def focusOnDisplayedComponent(): Unit = js.native
  def getCommandValueId(): String = js.native
  def getDropDownDOMElementForDisplayMode(displayMode: String): Unit = js.native
  def getLabel(): String = js.native
  def getMenuItemId(): String = js.native
  def getTextValue(): String = js.native
  def handleMouseBlur(e: FocusEvent): js.Any = js.native
  def handleMouseFocus(e: FocusEvent): js.Any = js.native
  def handleTabBlur(e: FocusEvent): js.Any = js.native
  def handleTabFocus(e: FocusEvent): js.Any = js.native
  def onClick(e: Event_): Unit = js.native
  def onEnabledChanged(enabled: Boolean): js.Any = js.native
  def onMenuClosed(): Unit = js.native
  def receiveFocus(): Unit = js.native
}

