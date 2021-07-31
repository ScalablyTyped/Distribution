package typings.sharepoint.CUI

import typings.std.Event
import typings.std.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Controls {
  
  trait Button
    extends StObject
       with Control
       with ISelectableControl {
    
    def createComponentForDisplayModeInternal(displayMode: String): js.Any
    
    def createDOMElementForDisplayMode(displayMode: String): js.Any
    
    def deselect(): scala.Unit
    
    def focusOnDisplayedComponent(): scala.Unit
    
    def getCommandValueId(): String
    
    def getDropDownDOMElementForDisplayMode(displayMode: String): scala.Unit
    
    def getLabel(): String
    
    def getMenuItemId(): String
    
    def getTextValue(): String
    
    def handleMouseBlur(e: FocusEvent): js.Any
    
    def handleMouseFocus(e: FocusEvent): js.Any
    
    def handleTabBlur(e: FocusEvent): js.Any
    
    def handleTabFocus(e: FocusEvent): js.Any
    
    def onClick(e: Event): scala.Unit
    
    def onEnabledChanged(enabled: Boolean): js.Any
    
    def onMenuClosed(): scala.Unit
    
    def receiveFocus(): scala.Unit
  }
  object Button {
    
    @scala.inline
    def apply(
      createComponentForDisplayMode: String => js.Any,
      createComponentForDisplayModeInternal: String => js.Any,
      createDOMElementForDisplayMode: String => js.Any,
      deselect: () => scala.Unit,
      dispose: () => scala.Unit,
      focusOnDisplayedComponent: () => scala.Unit,
      getCommandValueId: () => String,
      getDropDownDOMElementForDisplayMode: String => scala.Unit,
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
      onClick: Event => scala.Unit,
      onEnabledChanged: Boolean => js.Any,
      onMenuClosed: () => scala.Unit,
      receiveFocus: () => scala.Unit,
      set_enabled: Boolean => Boolean
    ): Button = {
      val __obj = js.Dynamic.literal(createComponentForDisplayMode = js.Any.fromFunction1(createComponentForDisplayMode), createComponentForDisplayModeInternal = js.Any.fromFunction1(createComponentForDisplayModeInternal), createDOMElementForDisplayMode = js.Any.fromFunction1(createDOMElementForDisplayMode), deselect = js.Any.fromFunction0(deselect), dispose = js.Any.fromFunction0(dispose), focusOnDisplayedComponent = js.Any.fromFunction0(focusOnDisplayedComponent), getCommandValueId = js.Any.fromFunction0(getCommandValueId), getDropDownDOMElementForDisplayMode = js.Any.fromFunction1(getDropDownDOMElementForDisplayMode), getLabel = js.Any.fromFunction0(getLabel), getMenuItemId = js.Any.fromFunction0(getMenuItemId), getTextValue = js.Any.fromFunction0(getTextValue), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_root = js.Any.fromFunction0(get_root), handleMouseBlur = js.Any.fromFunction1(handleMouseBlur), handleMouseFocus = js.Any.fromFunction1(handleMouseFocus), handleTabBlur = js.Any.fromFunction1(handleTabBlur), handleTabFocus = js.Any.fromFunction1(handleTabFocus), onClick = js.Any.fromFunction1(onClick), onEnabledChanged = js.Any.fromFunction1(onEnabledChanged), onMenuClosed = js.Any.fromFunction0(onMenuClosed), receiveFocus = js.Any.fromFunction0(receiveFocus), set_enabled = js.Any.fromFunction1(set_enabled))
      __obj.asInstanceOf[Button]
    }
    
    @scala.inline
    implicit class ButtonMutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateComponentForDisplayModeInternal(value: String => js.Any): Self = StObject.set(x, "createComponentForDisplayModeInternal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateDOMElementForDisplayMode(value: String => js.Any): Self = StObject.set(x, "createDOMElementForDisplayMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeselect(value: () => scala.Unit): Self = StObject.set(x, "deselect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocusOnDisplayedComponent(value: () => scala.Unit): Self = StObject.set(x, "focusOnDisplayedComponent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCommandValueId(value: () => String): Self = StObject.set(x, "getCommandValueId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDropDownDOMElementForDisplayMode(value: String => scala.Unit): Self = StObject.set(x, "getDropDownDOMElementForDisplayMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLabel(value: () => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMenuItemId(value: () => String): Self = StObject.set(x, "getMenuItemId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTextValue(value: () => String): Self = StObject.set(x, "getTextValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandleMouseBlur(value: FocusEvent => js.Any): Self = StObject.set(x, "handleMouseBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleMouseFocus(value: FocusEvent => js.Any): Self = StObject.set(x, "handleMouseFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleTabBlur(value: FocusEvent => js.Any): Self = StObject.set(x, "handleTabBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleTabFocus(value: FocusEvent => js.Any): Self = StObject.set(x, "handleTabFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClick(value: Event => scala.Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEnabledChanged(value: Boolean => js.Any): Self = StObject.set(x, "onEnabledChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMenuClosed(value: () => scala.Unit): Self = StObject.set(x, "onMenuClosed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReceiveFocus(value: () => scala.Unit): Self = StObject.set(x, "receiveFocus", js.Any.fromFunction0(value))
    }
  }
  
  type CheckBox = ToggleButton
  
  trait CheckBoxCommandProperties extends StObject
  
  trait ColorPicker
    extends StObject
       with Control
  object ColorPicker {
    
    @scala.inline
    def apply(
      createComponentForDisplayMode: String => js.Any,
      dispose: () => scala.Unit,
      get_enabled: () => Boolean,
      get_id: () => String,
      get_root: () => Root,
      set_enabled: Boolean => Boolean
    ): ColorPicker = {
      val __obj = js.Dynamic.literal(createComponentForDisplayMode = js.Any.fromFunction1(createComponentForDisplayMode), dispose = js.Any.fromFunction0(dispose), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_root = js.Any.fromFunction0(get_root), set_enabled = js.Any.fromFunction1(set_enabled))
      __obj.asInstanceOf[ColorPicker]
    }
  }
  
  trait ColorPickerCommandProperties extends StObject
  
  type ComboBox = DropDown
  
  type ContextMenuControlProperties = MenuLauncherControlProperties
  
  type DropDown = MenuLauncher
  
  trait DropDownCommandProperties extends StObject {
    
    var SelectedItemId: String
    
    var Value: String
  }
  object DropDownCommandProperties {
    
    @scala.inline
    def apply(SelectedItemId: String, Value: String): DropDownCommandProperties = {
      val __obj = js.Dynamic.literal(SelectedItemId = SelectedItemId.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropDownCommandProperties]
    }
    
    @scala.inline
    implicit class DropDownCommandPropertiesMutableBuilder[Self <: DropDownCommandProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectedItemId(value: String): Self = StObject.set(x, "SelectedItemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  type FlyoutAnchor = MenuLauncher
  
  trait GalleryButton
    extends StObject
       with Control
       with ISelectableControl
  object GalleryButton {
    
    @scala.inline
    def apply(
      createComponentForDisplayMode: String => js.Any,
      dispose: () => scala.Unit,
      get_enabled: () => Boolean,
      get_id: () => String,
      get_root: () => Root,
      set_enabled: Boolean => Boolean
    ): GalleryButton = {
      val __obj = js.Dynamic.literal(createComponentForDisplayMode = js.Any.fromFunction1(createComponentForDisplayMode), dispose = js.Any.fromFunction0(dispose), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_root = js.Any.fromFunction0(get_root), set_enabled = js.Any.fromFunction1(set_enabled))
      __obj.asInstanceOf[GalleryButton]
    }
  }
  
  trait GalleryButtonCommandProperties extends StObject
  
  type InsertTable = Control
  
  trait InsertTableCommandProperties extends StObject
  
  type JewelMenuLauncher = MenuLauncher
  
  type Label = Control
  
  trait LabelCommandProperties extends StObject
  
  type MRUSplitButton = DropDown
  
  type Separator = Control
  
  type Spinner = Control
  
  trait SpinnerCommandProperties extends StObject
  
  type SplitButton = MenuLauncher
  
  type TextBox = Control
  
  trait TextBoxCommandProperties extends StObject
  
  trait ToggleButton
    extends StObject
       with Control
       with ISelectableControl
  object ToggleButton {
    
    @scala.inline
    def apply(
      createComponentForDisplayMode: String => js.Any,
      dispose: () => scala.Unit,
      get_enabled: () => Boolean,
      get_id: () => String,
      get_root: () => Root,
      set_enabled: Boolean => Boolean
    ): ToggleButton = {
      val __obj = js.Dynamic.literal(createComponentForDisplayMode = js.Any.fromFunction1(createComponentForDisplayMode), dispose = js.Any.fromFunction0(dispose), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_root = js.Any.fromFunction0(get_root), set_enabled = js.Any.fromFunction1(set_enabled))
      __obj.asInstanceOf[ToggleButton]
    }
  }
  
  trait ToggleButtonCommandProperties extends StObject
}
