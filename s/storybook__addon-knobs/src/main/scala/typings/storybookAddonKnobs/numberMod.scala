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
  open class default () extends NumberType
  /* static members */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Number", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Number", "default.defaultProps")
    @js.native
    def defaultProps: NumberTypeProps = js.native
    inline def defaultProps_=(x: NumberTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def deserialize(value: String): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(value.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Number", "default.propTypes")
    @js.native
    def propTypes: KnobValidator = js.native
    inline def propTypes_=(x: KnobValidator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    inline def serialize(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[String]
    inline def serialize(value: NumberTypeKnobValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @js.native
  trait NumberType
    extends Component[NumberTypeProps, js.Object, Any] {
    
    /* private */ var handleChange: Any = js.native
    
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
    
    inline def apply(name: String): NumberTypeKnob = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberTypeKnob]
    }
    
    extension [Self <: NumberTypeKnob](x: Self) {
      
      inline def setValue(value: NumberTypeKnobValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait NumberTypeKnobOptions extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var range: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object NumberTypeKnobOptions {
    
    inline def apply(): NumberTypeKnobOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberTypeKnobOptions]
    }
    
    extension [Self <: NumberTypeKnobOptions](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
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
    
    inline def apply(knob: NumberTypeKnob, onChange: NumberTypeKnobValue | Null => NumberTypeKnobValue | Null): NumberTypeProps = {
      val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[NumberTypeProps]
    }
    
    extension [Self <: NumberTypeProps](x: Self) {
      
      inline def setKnob(value: NumberTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    }
  }
}
