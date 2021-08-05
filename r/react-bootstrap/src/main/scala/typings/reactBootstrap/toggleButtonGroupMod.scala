package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactBootstrap.buttonGroupMod.ButtonGroupProps
import typings.reactBootstrap.mod.Omit
import typings.reactBootstrap.reactBootstrapStrings.`type`
import typings.reactBootstrap.reactBootstrapStrings.checkbox
import typings.reactBootstrap.reactBootstrapStrings.defaultValue
import typings.reactBootstrap.reactBootstrapStrings.onChange
import typings.reactBootstrap.reactBootstrapStrings.radio
import typings.reactBootstrap.reactBootstrapStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonGroupMod {
  
  @JSImport("react-bootstrap/lib/ToggleButtonGroup", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[ToggleButtonGroupProps, js.Object, js.Any]
  
  trait BaseProps extends StObject {
    
    /**
      * You'll usually want to use string|number|string[]|number[] here,
      * but you can technically use any|any[].
      */
    var defaultValue: js.UndefOr[js.Any] = js.undefined
    
    /**
      * You'll usually want to use string|number|string[]|number[] here,
      * but you can technically use any|any[].
      */
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object BaseProps {
    
    inline def apply(): BaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseProps]
    }
    
    extension [Self <: BaseProps](x: Self) {
      
      inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CheckboxProps extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* values */ js.Array[js.Any], Unit]] = js.undefined
    
    var `type`: checkbox
  }
  object CheckboxProps {
    
    inline def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("checkbox")
      __obj.asInstanceOf[CheckboxProps]
    }
    
    extension [Self <: CheckboxProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* values */ js.Array[js.Any] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setType(value: checkbox): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadioProps extends StObject {
    
    /** Required if `type` is set to "radio" */
    var name: String
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
    
    var `type`: radio
  }
  object RadioProps {
    
    inline def apply(name: String): RadioProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("radio")
      __obj.asInstanceOf[RadioProps]
    }
    
    extension [Self <: RadioProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setType(value: radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToggleButtonGroup
    extends Component[ToggleButtonGroupProps, js.Object, js.Any]
  
  type ToggleButtonGroupProps = BaseProps & (RadioProps | CheckboxProps) & (Omit[ButtonGroupProps, onChange]) & (Omit[HTMLProps[ToggleButtonGroup], defaultValue | `type` | value | onChange])
}
