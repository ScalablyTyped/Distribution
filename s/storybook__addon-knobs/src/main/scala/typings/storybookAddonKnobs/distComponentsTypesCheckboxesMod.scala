package typings.storybookAddonKnobs

import typings.react.mod.Component
import typings.std.Record
import typings.storybookAddonKnobs.anon.IsInline
import typings.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typings.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsTypesCheckboxesMod {
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Checkboxes", JSImport.Default)
  @js.native
  open class default protected () extends CheckboxesType {
    def this(props: CheckboxesTypeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Checkboxes", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Checkboxes", "default.defaultProps")
    @js.native
    def defaultProps: CheckboxesTypeProps = js.native
    inline def defaultProps_=(x: CheckboxesTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def deserialize(value: CheckboxesTypeKnobValue): CheckboxesTypeKnobValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(value.asInstanceOf[js.Any]).asInstanceOf[CheckboxesTypeKnobValue]
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Checkboxes", "default.propTypes")
    @js.native
    def propTypes: IsInline = js.native
    inline def propTypes_=(x: IsInline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    inline def serialize(value: CheckboxesTypeKnobValue): CheckboxesTypeKnobValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[CheckboxesTypeKnobValue]
  }
  
  @js.native
  trait CheckboxesType extends Component[CheckboxesTypeProps, CheckboxesTypeState, Any] {
    
    /* private */ var handleChange: Any = js.native
    
    /* private */ var renderCheckbox: Any = js.native
    
    /* private */ var renderCheckboxList: Any = js.native
  }
  
  trait CheckboxesTypeKnob
    extends StObject
       with KnobControlConfig[CheckboxesTypeKnobValue] {
    
    var options: Record[String, String]
  }
  object CheckboxesTypeKnob {
    
    inline def apply(name: String, options: Record[String, String], value: CheckboxesTypeKnobValue): CheckboxesTypeKnob = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxesTypeKnob]
    }
    
    extension [Self <: CheckboxesTypeKnob](x: Self) {
      
      inline def setOptions(value: Record[String, String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type CheckboxesTypeKnobValue = js.Array[String]
  
  trait CheckboxesTypeProps
    extends StObject
       with KnobControlProps[CheckboxesTypeKnobValue]
       with CheckboxesWrapperProps {
    
    @JSName("knob")
    var knob_CheckboxesTypeProps: CheckboxesTypeKnob
  }
  object CheckboxesTypeProps {
    
    inline def apply(
      isInline: Boolean,
      knob: CheckboxesTypeKnob,
      onChange: CheckboxesTypeKnobValue => CheckboxesTypeKnobValue
    ): CheckboxesTypeProps = {
      val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[CheckboxesTypeProps]
    }
    
    extension [Self <: CheckboxesTypeProps](x: Self) {
      
      inline def setKnob(value: CheckboxesTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    }
  }
  
  trait CheckboxesTypeState extends StObject {
    
    var values: CheckboxesTypeKnobValue
  }
  object CheckboxesTypeState {
    
    inline def apply(values: CheckboxesTypeKnobValue): CheckboxesTypeState = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxesTypeState]
    }
    
    extension [Self <: CheckboxesTypeState](x: Self) {
      
      inline def setValues(value: CheckboxesTypeKnobValue): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait CheckboxesWrapperProps extends StObject {
    
    var isInline: Boolean
  }
  object CheckboxesWrapperProps {
    
    inline def apply(isInline: Boolean): CheckboxesWrapperProps = {
      val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxesWrapperProps]
    }
    
    extension [Self <: CheckboxesWrapperProps](x: Self) {
      
      inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    }
  }
}
