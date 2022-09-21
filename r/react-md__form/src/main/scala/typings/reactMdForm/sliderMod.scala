package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdForm.rangeSliderMod.RangeSliderProps
import typings.reactMdForm.sliderContainerMod.SliderContainerProps
import typings.reactMdForm.sliderSliderMod.SliderProps
import typings.reactMdForm.sliderThumbMod.SliderThumbProps
import typings.reactMdForm.sliderTrackMod.SliderTrackProps
import typings.reactMdForm.typesMod.RangeSliderDefaultValue
import typings.reactMdForm.typesMod.SliderDefaultValue
import typings.reactMdForm.useRangeSliderMod.RangeSliderValueReturnType
import typings.reactMdForm.useRangeSliderMod.UseRangeSliderOptions
import typings.reactMdForm.useSliderMod.SliderValueReturnType
import typings.reactMdForm.useSliderMod.UseSliderOptions
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod {
  
  @JSImport("@react-md/form/types/slider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/form/types/slider", "DEFAULT_SLIDER_ANIMATION_TIME")
  @js.native
  val DEFAULT_SLIDER_ANIMATION_TIME: /* 150 */ Double = js.native
  
  inline def DEFAULT_SLIDER_GET_VALUE_TEXT(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_SLIDER_GET_VALUE_TEXT")().asInstanceOf[String]
  
  @JSImport("@react-md/form/types/slider", "DEFAULT_SLIDER_MAX")
  @js.native
  val DEFAULT_SLIDER_MAX: /* 100 */ Double = js.native
  
  @JSImport("@react-md/form/types/slider", "DEFAULT_SLIDER_MIN")
  @js.native
  val DEFAULT_SLIDER_MIN: /* 0 */ Double = js.native
  
  @JSImport("@react-md/form/types/slider", "DEFAULT_SLIDER_STEP")
  @js.native
  val DEFAULT_SLIDER_STEP: /* 1 */ Double = js.native
  
  @JSImport("@react-md/form/types/slider", "RangeSlider")
  @js.native
  val RangeSlider: ForwardRefExoticComponent[RangeSliderProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form/types/slider", "Slider")
  @js.native
  val Slider: ForwardRefExoticComponent[SliderProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form/types/slider", "SliderContainer")
  @js.native
  val SliderContainer: ForwardRefExoticComponent[SliderContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form/types/slider", "SliderThumb")
  @js.native
  val SliderThumb: ForwardRefExoticComponent[SliderThumbProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/form/types/slider", "SliderTrack")
  @js.native
  val SliderTrack: ForwardRefExoticComponent[SliderTrackProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/form/types/slider", "THUMB_1_VAR")
  @js.native
  val THUMB_1_VAR: /* "--offset1" */ String = js.native
  
  @JSImport("@react-md/form/types/slider", "THUMB_2_VAR")
  @js.native
  val THUMB_2_VAR: /* "--offset2" */ String = js.native
  
  inline def useRangeSlider(): RangeSliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")().asInstanceOf[RangeSliderValueReturnType]
  inline def useRangeSlider(defaultValue: Unit, hasMinMaxStepPropJumpUpdateOnOnChange: UseRangeSliderOptions): RangeSliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")(defaultValue.asInstanceOf[js.Any], hasMinMaxStepPropJumpUpdateOnOnChange.asInstanceOf[js.Any])).asInstanceOf[RangeSliderValueReturnType]
  inline def useRangeSlider(defaultValue: RangeSliderDefaultValue): RangeSliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[RangeSliderValueReturnType]
  inline def useRangeSlider(
    defaultValue: RangeSliderDefaultValue,
    hasMinMaxStepPropJumpUpdateOnOnChange: UseRangeSliderOptions
  ): RangeSliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")(defaultValue.asInstanceOf[js.Any], hasMinMaxStepPropJumpUpdateOnOnChange.asInstanceOf[js.Any])).asInstanceOf[RangeSliderValueReturnType]
  
  inline def useSlider(): SliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")().asInstanceOf[SliderValueReturnType]
  inline def useSlider(defaultValue: Unit, hasMinMaxStepPropJumpUpdateOnOnChange: UseSliderOptions): SliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")(defaultValue.asInstanceOf[js.Any], hasMinMaxStepPropJumpUpdateOnOnChange.asInstanceOf[js.Any])).asInstanceOf[SliderValueReturnType]
  inline def useSlider(defaultValue: SliderDefaultValue): SliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[SliderValueReturnType]
  inline def useSlider(defaultValue: SliderDefaultValue, hasMinMaxStepPropJumpUpdateOnOnChange: UseSliderOptions): SliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")(defaultValue.asInstanceOf[js.Any], hasMinMaxStepPropJumpUpdateOnOnChange.asInstanceOf[js.Any])).asInstanceOf[SliderValueReturnType]
}
