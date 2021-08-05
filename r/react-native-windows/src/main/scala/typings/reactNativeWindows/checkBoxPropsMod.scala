package typings.reactNativeWindows

import typings.reactNative.mod.ViewProps
import typings.reactNativeWindows.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkBoxPropsMod {
  
  trait ICheckBoxChangeEvent extends StObject {
    
    var nativeEvent: Value
  }
  object ICheckBoxChangeEvent {
    
    inline def apply(nativeEvent: Value): ICheckBoxChangeEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICheckBoxChangeEvent]
    }
    
    extension [Self <: ICheckBoxChangeEvent](x: Self) {
      
      inline def setNativeEvent(value: Value): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICheckBoxProps
    extends StObject
       with ViewProps {
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* event */ ICheckBoxChangeEvent, Unit]] = js.undefined
    
    var onValueChange: js.UndefOr[js.Function1[/* value */ Boolean, Unit]] = js.undefined
    
    var value: js.UndefOr[Boolean] = js.undefined
  }
  object ICheckBoxProps {
    
    inline def apply(): ICheckBoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckBoxProps]
    }
    
    extension [Self <: ICheckBoxProps](x: Self) {
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnChange(value: /* event */ ICheckBoxChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnValueChange(value: /* value */ Boolean => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
