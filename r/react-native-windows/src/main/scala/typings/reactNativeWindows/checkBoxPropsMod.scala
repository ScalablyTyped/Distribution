package typings.reactNativeWindows

import typings.reactNative.mod.ViewProps
import typings.reactNativeWindows.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkBoxPropsMod {
  
  @js.native
  trait ICheckBoxChangeEvent extends StObject {
    
    var nativeEvent: Value = js.native
  }
  object ICheckBoxChangeEvent {
    
    @scala.inline
    def apply(nativeEvent: Value): ICheckBoxChangeEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICheckBoxChangeEvent]
    }
    
    @scala.inline
    implicit class ICheckBoxChangeEventMutableBuilder[Self <: ICheckBoxChangeEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNativeEvent(value: Value): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICheckBoxProps extends ViewProps {
    
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* event */ ICheckBoxChangeEvent, Unit]] = js.native
    
    var onValueChange: js.UndefOr[js.Function1[/* value */ Boolean, Unit]] = js.native
    
    var value: js.UndefOr[Boolean] = js.native
  }
  object ICheckBoxProps {
    
    @scala.inline
    def apply(): ICheckBoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckBoxProps]
    }
    
    @scala.inline
    implicit class ICheckBoxPropsMutableBuilder[Self <: ICheckBoxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* event */ ICheckBoxChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnValueChange(value: /* value */ Boolean => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      @scala.inline
      def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
