package typings.sharepoint.CUI.Controls

import typings.sharepoint.CUI.Control
import typings.sharepoint.CUI.ISelectableControl
import typings.sharepoint.CUI.Root
import typings.std.Event
import typings.std.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button
  extends Control
     with ISelectableControl {
  def createComponentForDisplayModeInternal(displayMode: String): js.Any
  def createDOMElementForDisplayMode(displayMode: String): js.Any
  def deselect(): Unit
  def focusOnDisplayedComponent(): Unit
  def getCommandValueId(): String
  def getDropDownDOMElementForDisplayMode(displayMode: String): Unit
  def getLabel(): String
  def getMenuItemId(): String
  def getTextValue(): String
  def handleMouseBlur(e: FocusEvent): js.Any
  def handleMouseFocus(e: FocusEvent): js.Any
  def handleTabBlur(e: FocusEvent): js.Any
  def handleTabFocus(e: FocusEvent): js.Any
  def onClick(e: Event): Unit
  def onEnabledChanged(enabled: Boolean): js.Any
  def onMenuClosed(): Unit
  def receiveFocus(): Unit
}

object Button {
  @scala.inline
  def apply(
    createComponentForDisplayMode: String => js.Any,
    createComponentForDisplayModeInternal: String => js.Any,
    createDOMElementForDisplayMode: String => js.Any,
    deselect: () => Unit,
    dispose: () => Unit,
    focusOnDisplayedComponent: () => Unit,
    getCommandValueId: () => String,
    getDropDownDOMElementForDisplayMode: String => Unit,
    getLabel: () => String,
    getMenuItemId: () => String,
    getTextValue: () => String,
    get_enabled: () => Boolean,
    get_id: () => String,
    get_root: () => Root,
    handleMouseBlur: FocusEvent => js.Any,
    handleMouseFocus: FocusEvent => js.Any,
    handleTabBlur: FocusEvent => js.Any,
    handleTabFocus: FocusEvent => js.Any,
    onClick: Event => Unit,
    onEnabledChanged: Boolean => js.Any,
    onMenuClosed: () => Unit,
    receiveFocus: () => Unit,
    set_enabled: Boolean => Boolean
  ): Button = {
    val __obj = js.Dynamic.literal(createComponentForDisplayMode = js.Any.fromFunction1(createComponentForDisplayMode), createComponentForDisplayModeInternal = js.Any.fromFunction1(createComponentForDisplayModeInternal), createDOMElementForDisplayMode = js.Any.fromFunction1(createDOMElementForDisplayMode), deselect = js.Any.fromFunction0(deselect), dispose = js.Any.fromFunction0(dispose), focusOnDisplayedComponent = js.Any.fromFunction0(focusOnDisplayedComponent), getCommandValueId = js.Any.fromFunction0(getCommandValueId), getDropDownDOMElementForDisplayMode = js.Any.fromFunction1(getDropDownDOMElementForDisplayMode), getLabel = js.Any.fromFunction0(getLabel), getMenuItemId = js.Any.fromFunction0(getMenuItemId), getTextValue = js.Any.fromFunction0(getTextValue), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_root = js.Any.fromFunction0(get_root), handleMouseBlur = js.Any.fromFunction1(handleMouseBlur), handleMouseFocus = js.Any.fromFunction1(handleMouseFocus), handleTabBlur = js.Any.fromFunction1(handleTabBlur), handleTabFocus = js.Any.fromFunction1(handleTabFocus), onClick = js.Any.fromFunction1(onClick), onEnabledChanged = js.Any.fromFunction1(onEnabledChanged), onMenuClosed = js.Any.fromFunction0(onMenuClosed), receiveFocus = js.Any.fromFunction0(receiveFocus), set_enabled = js.Any.fromFunction1(set_enabled))
    __obj.asInstanceOf[Button]
  }
}

