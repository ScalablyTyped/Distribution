package typings.reactRadioGroup

import typings.react.mod.ElementType
import typings.react.mod.HTMLProps
import typings.reactRadioGroup.mod.Omit
import typings.reactRadioGroup.reactRadioGroupStrings.onChange
import typings.reactRadioGroup.reactRadioGroupStrings.role
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Component extends StObject {
    
    var Component: js.UndefOr[ElementType[Omit[HTMLProps[Any], onChange | role]]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    var selectedValue: js.UndefOr[Any] = js.undefined
  }
  object Component {
    
    inline def apply(): Component = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Component]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
      
      inline def setComponent(value: ElementType[Omit[HTMLProps[Any], onChange | role]]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
      
      inline def setOnChange(value: /* value */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSelectedValue(value: Any): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
    }
  }
  
  trait Value extends StObject {
    
    var value: Any
  }
  object Value {
    
    inline def apply(value: Any): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
