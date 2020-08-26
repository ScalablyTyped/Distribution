package typings.sharepoint.CUI.Controls

import typings.sharepoint.CUI.Control
import typings.sharepoint.CUI.ISelectableControl
import typings.sharepoint.CUI.Root
import typings.std.Event
import typings.std.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Button
  extends Control
     with ISelectableControl {
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
  def onClick(e: Event): Unit = js.native
  def onEnabledChanged(enabled: Boolean): js.Any = js.native
  def onMenuClosed(): Unit = js.native
  def receiveFocus(): Unit = js.native
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
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateComponentForDisplayModeInternal(value: String => js.Any): Self = this.set("createComponentForDisplayModeInternal", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateDOMElementForDisplayMode(value: String => js.Any): Self = this.set("createDOMElementForDisplayMode", js.Any.fromFunction1(value))
    @scala.inline
    def setDeselect(value: () => Unit): Self = this.set("deselect", js.Any.fromFunction0(value))
    @scala.inline
    def setFocusOnDisplayedComponent(value: () => Unit): Self = this.set("focusOnDisplayedComponent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCommandValueId(value: () => String): Self = this.set("getCommandValueId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDropDownDOMElementForDisplayMode(value: String => Unit): Self = this.set("getDropDownDOMElementForDisplayMode", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLabel(value: () => String): Self = this.set("getLabel", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMenuItemId(value: () => String): Self = this.set("getMenuItemId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTextValue(value: () => String): Self = this.set("getTextValue", js.Any.fromFunction0(value))
    @scala.inline
    def setHandleMouseBlur(value: FocusEvent => js.Any): Self = this.set("handleMouseBlur", js.Any.fromFunction1(value))
    @scala.inline
    def setHandleMouseFocus(value: FocusEvent => js.Any): Self = this.set("handleMouseFocus", js.Any.fromFunction1(value))
    @scala.inline
    def setHandleTabBlur(value: FocusEvent => js.Any): Self = this.set("handleTabBlur", js.Any.fromFunction1(value))
    @scala.inline
    def setHandleTabFocus(value: FocusEvent => js.Any): Self = this.set("handleTabFocus", js.Any.fromFunction1(value))
    @scala.inline
    def setOnClick(value: Event => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnEnabledChanged(value: Boolean => js.Any): Self = this.set("onEnabledChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMenuClosed(value: () => Unit): Self = this.set("onMenuClosed", js.Any.fromFunction0(value))
    @scala.inline
    def setReceiveFocus(value: () => Unit): Self = this.set("receiveFocus", js.Any.fromFunction0(value))
  }
  
}

