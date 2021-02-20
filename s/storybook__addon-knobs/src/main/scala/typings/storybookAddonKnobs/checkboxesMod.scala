package typings.storybookAddonKnobs

import typings.react.mod.Component
import typings.std.Record
import typings.storybookAddonKnobs.anon.IsInline
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxesMod {
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Checkboxes", JSImport.Default)
  @js.native
  class default protected () extends CheckboxesType {
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
    @scala.inline
    def defaultProps_=(x: CheckboxesTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Checkboxes", "default.deserialize")
    @js.native
    def deserialize(value: CheckboxesTypeKnobValue): CheckboxesTypeKnobValue = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Checkboxes", "default.propTypes")
    @js.native
    def propTypes: IsInline = js.native
    @scala.inline
    def propTypes_=(x: IsInline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Checkboxes", "default.serialize")
    @js.native
    def serialize(value: CheckboxesTypeKnobValue): CheckboxesTypeKnobValue = js.native
  }
  
  @js.native
  trait CheckboxesType
    extends Component[CheckboxesTypeProps, CheckboxesTypeState, js.Any] {
    
    var handleChange: js.Any = js.native
    
    var renderCheckbox: js.Any = js.native
    
    var renderCheckboxList: js.Any = js.native
  }
  
  @js.native
  trait CheckboxesTypeKnob extends KnobControlConfig[CheckboxesTypeKnobValue] {
    
    var options: Record[String, String] = js.native
  }
  object CheckboxesTypeKnob {
    
    @scala.inline
    def apply(name: String, options: Record[String, String], value: CheckboxesTypeKnobValue): CheckboxesTypeKnob = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxesTypeKnob]
    }
    
    @scala.inline
    implicit class CheckboxesTypeKnobMutableBuilder[Self <: CheckboxesTypeKnob] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: Record[String, String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type CheckboxesTypeKnobValue = js.Array[String]
  
  @js.native
  trait CheckboxesTypeProps
    extends KnobControlProps[CheckboxesTypeKnobValue]
       with CheckboxesWrapperProps {
    
    @JSName("knob")
    var knob_CheckboxesTypeProps: CheckboxesTypeKnob = js.native
  }
  object CheckboxesTypeProps {
    
    @scala.inline
    def apply(
      isInline: Boolean,
      knob: CheckboxesTypeKnob,
      onChange: CheckboxesTypeKnobValue => CheckboxesTypeKnobValue
    ): CheckboxesTypeProps = {
      val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[CheckboxesTypeProps]
    }
    
    @scala.inline
    implicit class CheckboxesTypePropsMutableBuilder[Self <: CheckboxesTypeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKnob(value: CheckboxesTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CheckboxesTypeState extends StObject {
    
    var values: CheckboxesTypeKnobValue = js.native
  }
  object CheckboxesTypeState {
    
    @scala.inline
    def apply(values: CheckboxesTypeKnobValue): CheckboxesTypeState = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxesTypeState]
    }
    
    @scala.inline
    implicit class CheckboxesTypeStateMutableBuilder[Self <: CheckboxesTypeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValues(value: CheckboxesTypeKnobValue): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CheckboxesWrapperProps extends StObject {
    
    var isInline: Boolean = js.native
  }
  object CheckboxesWrapperProps {
    
    @scala.inline
    def apply(isInline: Boolean): CheckboxesWrapperProps = {
      val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxesWrapperProps]
    }
    
    @scala.inline
    implicit class CheckboxesWrapperPropsMutableBuilder[Self <: CheckboxesWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    }
  }
}
