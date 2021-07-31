package typings.reactNativeWindows

import typings.reactNative.mod.ViewProps
import typings.reactNativeWindows.anon.ItemIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerPropsMod {
  
  trait IPickerChangeEvent extends StObject {
    
    var nativeEvent: ItemIndex
  }
  object IPickerChangeEvent {
    
    @scala.inline
    def apply(nativeEvent: ItemIndex): IPickerChangeEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPickerChangeEvent]
    }
    
    @scala.inline
    implicit class IPickerChangeEventMutableBuilder[Self <: IPickerChangeEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNativeEvent(value: ItemIndex): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPickerItemProps
    extends StObject
       with ViewProps {
    
    var color: js.UndefOr[String] = js.undefined
    
    var label: String
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object IPickerItemProps {
    
    @scala.inline
    def apply(label: String): IPickerItemProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPickerItemProps]
    }
    
    @scala.inline
    implicit class IPickerItemPropsMutableBuilder[Self <: IPickerItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait IPickerProps
    extends StObject
       with ViewProps {
    
    var editable: js.UndefOr[Boolean] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* event */ IPickerChangeEvent, Unit]] = js.undefined
    
    var onValueChange: js.UndefOr[
        js.Function3[/* value */ js.Any, /* itemIndex */ Double, /* text */ String, Unit]
      ] = js.undefined
    
    var prompt: js.UndefOr[String] = js.undefined
    
    var selectedValue: js.UndefOr[js.Any] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object IPickerProps {
    
    @scala.inline
    def apply(): IPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPickerProps]
    }
    
    @scala.inline
    implicit class IPickerPropsMutableBuilder[Self <: IPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* event */ IPickerChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: (/* value */ js.Any, /* itemIndex */ Double, /* text */ String) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setSelectedValue(value: js.Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
