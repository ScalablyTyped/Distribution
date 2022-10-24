package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdForm.typesSliderRangeSliderMod.RangeSliderProps
import typings.reactMdForm.typesSliderSliderContainerMod.SliderContainerProps
import typings.reactMdForm.typesSliderSliderMod.SliderProps
import typings.reactMdForm.typesSliderSliderThumbMod.SliderThumbProps
import typings.reactMdForm.typesSliderSliderTrackMod.SliderTrackProps
import typings.reactMdForm.typesSliderTypesMod.RangeSliderDefaultValue
import typings.reactMdForm.typesSliderTypesMod.SliderDefaultValue
import typings.reactMdForm.typesSliderUseRangeSliderMod.RangeSliderValueReturnType
import typings.reactMdForm.typesSliderUseRangeSliderMod.UseRangeSliderOptions
import typings.reactMdForm.typesSliderUseSliderMod.SliderValueReturnType
import typings.reactMdForm.typesSliderUseSliderMod.UseSliderOptions
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSliderMod {
  
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
  inline def useRangeSlider(defaultValue: Unit, param1: UseRangeSliderOptions): RangeSliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")(defaultValue.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[RangeSliderValueReturnType]
  inline def useRangeSlider(defaultValue: RangeSliderDefaultValue): RangeSliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[RangeSliderValueReturnType]
  inline def useRangeSlider(defaultValue: RangeSliderDefaultValue, param1: UseRangeSliderOptions): RangeSliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")(defaultValue.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[RangeSliderValueReturnType]
  
  inline def useSlider(): SliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")().asInstanceOf[SliderValueReturnType]
  inline def useSlider(defaultValue: Unit, param1: UseSliderOptions): SliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")(defaultValue.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[SliderValueReturnType]
  inline def useSlider(defaultValue: SliderDefaultValue): SliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[SliderValueReturnType]
  inline def useSlider(defaultValue: SliderDefaultValue, param1: UseSliderOptions): SliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")(defaultValue.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[SliderValueReturnType]
}
