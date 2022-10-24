package typings.reactMdForm

import typings.react.mod.SetStateAction
import typings.reactMdForm.typesSliderTypesMod.DefinedSliderValueOptions
import typings.reactMdForm.typesSliderTypesMod.SliderControls
import typings.reactMdForm.typesSliderTypesMod.SliderDefaultValue
import typings.reactMdForm.typesSliderTypesMod.SliderStepOptions
import typings.reactMdForm.typesSliderTypesMod.SliderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSliderUseSliderMod {
  
  @JSImport("@react-md/form/types/slider/useSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSlider(): SliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")().asInstanceOf[SliderValueReturnType]
  inline def useSlider(defaultValue: Unit, param1: UseSliderOptions): SliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")(defaultValue.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[SliderValueReturnType]
  inline def useSlider(defaultValue: SliderDefaultValue): SliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[SliderValueReturnType]
  inline def useSlider(defaultValue: SliderDefaultValue, param1: UseSliderOptions): SliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")(defaultValue.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[SliderValueReturnType]
  
  trait SliderRequiredProps
    extends StObject
       with SliderControls
       with DefinedSliderValueOptions {
    
    /**
      * The current value of the slider.
      */
    var value: SliderValue
  }
  object SliderRequiredProps {
    
    inline def apply(
      decrement: () => Unit,
      decrementJump: () => Unit,
      increment: () => Unit,
      incrementJump: () => Unit,
      max: Double,
      maximum: () => Unit,
      min: Double,
      minimum: () => Unit,
      persist: () => Unit,
      setValue: SetStateAction[SliderValue] => Unit,
      step: Double,
      value: SliderValue
    ): SliderRequiredProps = {
      val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction0(decrement), decrementJump = js.Any.fromFunction0(decrementJump), increment = js.Any.fromFunction0(increment), incrementJump = js.Any.fromFunction0(incrementJump), max = max.asInstanceOf[js.Any], maximum = js.Any.fromFunction0(maximum), min = min.asInstanceOf[js.Any], minimum = js.Any.fromFunction0(minimum), persist = js.Any.fromFunction0(persist), setValue = js.Any.fromFunction1(setValue), step = step.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderRequiredProps]
    }
    
    extension [Self <: SliderRequiredProps](x: Self) {
      
      inline def setValue(value: SliderValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SliderValueReturnType = js.Tuple2[SliderValue, SliderRequiredProps]
  
  trait UseSliderOptions
    extends StObject
       with SliderStepOptions {
    
    /**
      * An optional callback that will be triggered when the value has changed when
      * the `updateOn` behavior is set to `"blur"`. When the `updateOn` behavior is
      * set to `"change"` (default), this will do nothing since the return value
      * from the hook will always be the latest value.
      */
    var onChange: js.UndefOr[js.Function1[/* value */ SliderValue, Unit]] = js.undefined
  }
  object UseSliderOptions {
    
    inline def apply(): UseSliderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseSliderOptions]
    }
    
    extension [Self <: UseSliderOptions](x: Self) {
      
      inline def setOnChange(value: /* value */ SliderValue => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
