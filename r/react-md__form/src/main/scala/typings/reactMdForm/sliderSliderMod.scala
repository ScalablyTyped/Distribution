package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.react.mod.SetStateAction
import typings.reactMdForm.typesMod.BaseSliderProps
import typings.reactMdForm.typesMod.SliderValue
import typings.reactMdForm.useSliderMod.SliderRequiredProps
import typings.reactMdUtils.typesTypesMod.PropsWithRef
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderSliderMod {
  
  @JSImport("@react-md/form/types/slider/Slider", "Slider")
  @js.native
  val Slider: ForwardRefExoticComponent[SliderProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait SliderProps
    extends StObject
       with SliderRequiredProps
       with BaseSliderProps {
    
    /**
      * An optional label to apply to the slider's thumb. This should normally be a
      * short (1-4 word) description for this slider.
      *
      * @see {@link SliderLabelProps.label}
      * @see {@link thumbLabelledBy}
      */
    var thumbLabel: js.UndefOr[String] = js.undefined
    
    /**
      * An optional id point to a label describing the slider's thumb. This should
      * normally be a short (1-4 word) description for this slider.
      *
      * @see {@link SliderLabelProps.label}
      * @see {@link thumbLabel}
      */
    var thumbLabelledBy: js.UndefOr[String] = js.undefined
    
    /**
      * Any additional props you'd like to pass to the thumb element as well as an
      * optional `ref` if you need access to the track element for some reason.
      */
    var thumbProps: js.UndefOr[PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]] = js.undefined
    
    /**
      * Any additional props you'd like to pass to the track element as well as an
      * optional `ref` if you need access to the track element for some reason.
      */
    var trackProps: js.UndefOr[PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]] = js.undefined
  }
  object SliderProps {
    
    inline def apply(
      baseId: String,
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
    ): SliderProps = {
      val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any], decrement = js.Any.fromFunction0(decrement), decrementJump = js.Any.fromFunction0(decrementJump), increment = js.Any.fromFunction0(increment), incrementJump = js.Any.fromFunction0(incrementJump), max = max.asInstanceOf[js.Any], maximum = js.Any.fromFunction0(maximum), min = min.asInstanceOf[js.Any], minimum = js.Any.fromFunction0(minimum), persist = js.Any.fromFunction0(persist), setValue = js.Any.fromFunction1(setValue), step = step.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderProps]
    }
    
    extension [Self <: SliderProps](x: Self) {
      
      inline def setThumbLabel(value: String): Self = StObject.set(x, "thumbLabel", value.asInstanceOf[js.Any])
      
      inline def setThumbLabelUndefined: Self = StObject.set(x, "thumbLabel", js.undefined)
      
      inline def setThumbLabelledBy(value: String): Self = StObject.set(x, "thumbLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setThumbLabelledByUndefined: Self = StObject.set(x, "thumbLabelledBy", js.undefined)
      
      inline def setThumbProps(value: PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]): Self = StObject.set(x, "thumbProps", value.asInstanceOf[js.Any])
      
      inline def setThumbPropsUndefined: Self = StObject.set(x, "thumbProps", js.undefined)
      
      inline def setTrackProps(value: PropsWithRef[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]): Self = StObject.set(x, "trackProps", value.asInstanceOf[js.Any])
      
      inline def setTrackPropsUndefined: Self = StObject.set(x, "trackProps", js.undefined)
    }
  }
}
