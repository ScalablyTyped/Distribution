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
    
    inline def apply(nativeEvent: ItemIndex): IPickerChangeEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPickerChangeEvent]
    }
    
    extension [Self <: IPickerChangeEvent](x: Self) {
      
      inline def setNativeEvent(value: ItemIndex): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
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
    
    inline def apply(label: String): IPickerItemProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPickerItemProps]
    }
    
    extension [Self <: IPickerItemProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
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
    
    inline def apply(): IPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPickerProps]
    }
    
    extension [Self <: IPickerProps](x: Self) {
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setOnChange(value: /* event */ IPickerChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnValueChange(value: (/* value */ js.Any, /* itemIndex */ Double, /* text */ String) => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction3(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setSelectedValue(value: js.Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
