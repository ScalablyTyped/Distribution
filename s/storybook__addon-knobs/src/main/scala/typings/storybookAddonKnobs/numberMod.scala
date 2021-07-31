package typings.storybookAddonKnobs

import typings.react.mod.Component
import typings.storybookAddonKnobs.anon.KnobValidator
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberMod {
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Number", JSImport.Default)
  @js.native
  class default () extends NumberType
  /* static members */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Number", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Number", "default.defaultProps")
    @js.native
    def defaultProps: NumberTypeProps = js.native
    @scala.inline
    def defaultProps_=(x: NumberTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def deserialize(value: String): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(value.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Number", "default.propTypes")
    @js.native
    def propTypes: KnobValidator = js.native
    @scala.inline
    def propTypes_=(x: KnobValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def serialize(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[String]
    @scala.inline
    def serialize(value: NumberTypeKnobValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @js.native
  trait NumberType
    extends Component[NumberTypeProps, js.Object, js.Any] {
    
    var handleChange: js.Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MNumberType(nextProps: NumberTypeProps): Boolean = js.native
  }
  
  trait NumberTypeKnob
    extends StObject
       with KnobControlConfig[NumberTypeKnobValue]
       with NumberTypeKnobOptions {
    
    @JSName("value")
    var value_NumberTypeKnob: js.UndefOr[NumberTypeKnobValue] = js.undefined
  }
  object NumberTypeKnob {
    
    @scala.inline
    def apply(name: String): NumberTypeKnob = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberTypeKnob]
    }
    
    @scala.inline
    implicit class NumberTypeKnobMutableBuilder[Self <: NumberTypeKnob] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: NumberTypeKnobValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait NumberTypeKnobOptions extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var range: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object NumberTypeKnobOptions {
    
    @scala.inline
    def apply(): NumberTypeKnobOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberTypeKnobOptions]
    }
    
    @scala.inline
    implicit class NumberTypeKnobOptionsMutableBuilder[Self <: NumberTypeKnobOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  type NumberTypeKnobValue = Double
  
  trait NumberTypeProps
    extends StObject
       with KnobControlProps[NumberTypeKnobValue | Null] {
    
    @JSName("knob")
    var knob_NumberTypeProps: NumberTypeKnob
  }
  object NumberTypeProps {
    
    @scala.inline
    def apply(knob: NumberTypeKnob, onChange: NumberTypeKnobValue | Null => NumberTypeKnobValue | Null): NumberTypeProps = {
      val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[NumberTypeProps]
    }
    
    @scala.inline
    implicit class NumberTypePropsMutableBuilder[Self <: NumberTypeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKnob(value: NumberTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    }
  }
}
