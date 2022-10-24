package typings.reactMdForm

import typings.react.mod.SetStateAction
import typings.reactMdForm.typesSliderTypesMod.DefinedSliderValueOptions
import typings.reactMdForm.typesSliderTypesMod.RangeSliderControls
import typings.reactMdForm.typesSliderTypesMod.RangeSliderDefaultValue
import typings.reactMdForm.typesSliderTypesMod.RangeSliderValue
import typings.reactMdForm.typesSliderTypesMod.SliderStepOptions
import typings.reactMdForm.typesSliderTypesMod.ThumbIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSliderUseRangeSliderMod {
  
  @JSImport("@react-md/form/types/slider/useRangeSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRangeSlider(): RangeSliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")().asInstanceOf[RangeSliderValueReturnType]
  inline def useRangeSlider(defaultValue: Unit, param1: UseRangeSliderOptions): RangeSliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")(defaultValue.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[RangeSliderValueReturnType]
  inline def useRangeSlider(defaultValue: RangeSliderDefaultValue): RangeSliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[RangeSliderValueReturnType]
  inline def useRangeSlider(defaultValue: RangeSliderDefaultValue, param1: UseRangeSliderOptions): RangeSliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")(defaultValue.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[RangeSliderValueReturnType]
  
  trait RangeSliderRequiredProps
    extends StObject
       with RangeSliderControls
       with DefinedSliderValueOptions {
    
    /**
      * The current value of the slider.
      */
    var value: RangeSliderValue
  }
  object RangeSliderRequiredProps {
    
    inline def apply(
      decrement: ThumbIndex => Unit,
      decrementJump: ThumbIndex => Unit,
      increment: ThumbIndex => Unit,
      incrementJump: ThumbIndex => Unit,
      max: Double,
      maximum: ThumbIndex => Unit,
      min: Double,
      minimum: ThumbIndex => Unit,
      persist: () => Unit,
      setValue: SetStateAction[RangeSliderValue] => Unit,
      step: Double,
      value: RangeSliderValue
    ): RangeSliderRequiredProps = {
      val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1(decrement), decrementJump = js.Any.fromFunction1(decrementJump), increment = js.Any.fromFunction1(increment), incrementJump = js.Any.fromFunction1(incrementJump), max = max.asInstanceOf[js.Any], maximum = js.Any.fromFunction1(maximum), min = min.asInstanceOf[js.Any], minimum = js.Any.fromFunction1(minimum), persist = js.Any.fromFunction0(persist), setValue = js.Any.fromFunction1(setValue), step = step.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeSliderRequiredProps]
    }
    
    extension [Self <: RangeSliderRequiredProps](x: Self) {
      
      inline def setValue(value: RangeSliderValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RangeSliderValueReturnType = js.Tuple2[RangeSliderValue, RangeSliderRequiredProps]
  
  trait UseRangeSliderOptions
    extends StObject
       with SliderStepOptions {
    
    /**
      * An optional callback that will be triggered when the value has changed when
      * the `updateOn` behavior is set to `"blur"`. When the `updateOn` behavior is
      * set to `"change"` (default), this will do nothing since the return value
      * from the hook will always be the latest value.
      */
    var onChange: js.UndefOr[js.Function1[/* value */ RangeSliderValue, Unit]] = js.undefined
  }
  object UseRangeSliderOptions {
    
    inline def apply(): UseRangeSliderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseRangeSliderOptions]
    }
    
    extension [Self <: UseRangeSliderOptions](x: Self) {
      
      inline def setOnChange(value: /* value */ RangeSliderValue => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
