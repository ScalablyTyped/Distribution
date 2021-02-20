package typings.reactRadioGroup

import typings.react.mod.HTMLProps
import typings.react.mod.ReactType
import typings.reactRadioGroup.mod.Omit
import typings.reactRadioGroup.reactRadioGroupStrings.onChange
import typings.reactRadioGroup.reactRadioGroupStrings.role
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Component extends StObject {
    
    var Component: js.UndefOr[ReactType[Omit[HTMLProps[_], onChange | role]]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
    
    var selectedValue: js.UndefOr[js.Any] = js.native
  }
  object Component {
    
    @scala.inline
    def apply(): Component = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Component]
    }
    
    @scala.inline
    implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ReactType[Omit[HTMLProps[_], onChange | role]]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setSelectedValue(value: js.Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var value: js.Any = js.native
  }
  object Value {
    
    @scala.inline
    def apply(value: js.Any): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
