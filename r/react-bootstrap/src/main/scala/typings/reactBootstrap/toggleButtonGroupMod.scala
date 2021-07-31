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
    
    @scala.inline
    def apply(): BaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseProps]
    }
    
    @scala.inline
    implicit class BasePropsMutableBuilder[Self <: BaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CheckboxProps extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* values */ js.Array[js.Any], Unit]] = js.undefined
    
    var `type`: checkbox
  }
  object CheckboxProps {
    
    @scala.inline
    def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("checkbox")
      __obj.asInstanceOf[CheckboxProps]
    }
    
    @scala.inline
    implicit class CheckboxPropsMutableBuilder[Self <: CheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* values */ js.Array[js.Any] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setType(value: checkbox): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadioProps extends StObject {
    
    /** Required if `type` is set to "radio" */
    var name: String
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
    
    var `type`: radio
  }
  object RadioProps {
    
    @scala.inline
    def apply(name: String): RadioProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("radio")
      __obj.asInstanceOf[RadioProps]
    }
    
    @scala.inline
    implicit class RadioPropsMutableBuilder[Self <: RadioProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setType(value: radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToggleButtonGroup
    extends Component[ToggleButtonGroupProps, js.Object, js.Any]
  
  type ToggleButtonGroupProps = BaseProps & (RadioProps | CheckboxProps) & (Omit[ButtonGroupProps, onChange]) & (Omit[HTMLProps[ToggleButtonGroup], defaultValue | `type` | value | onChange])
}
