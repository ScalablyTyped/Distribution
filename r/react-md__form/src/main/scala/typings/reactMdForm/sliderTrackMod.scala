package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdForm.typesMod.SliderPresentation
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderTrackMod {
  
  @JSImport("@react-md/form/types/slider/SliderTrack", "SliderTrack")
  @js.native
  val SliderTrack: ForwardRefExoticComponent[SliderTrackProps & RefAttributes[HTMLSpanElement]] = js.native
  
  trait SliderTrackProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement]
       with SliderPresentation {
    
    /**
      * Boolean if the track should animate the value position whenever the
      * value changes. This should normally be set to `true` only when the track
      * is "idle" and not being dragged.
      */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This should be the current value as a percentage for the first thumb that
      * appears within the slider.
      */
    var thumb1Percentage: String
    
    /**
      * This should be the current value as a percentage for the second thumb that
      * appears within the slider, but only when behaving as a range slider.
      */
    var thumb2Percentage: js.UndefOr[String] = js.undefined
  }
  object SliderTrackProps {
    
    inline def apply(thumb1Percentage: String): SliderTrackProps = {
      val __obj = js.Dynamic.literal(thumb1Percentage = thumb1Percentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderTrackProps]
    }
    
    extension [Self <: SliderTrackProps](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setThumb1Percentage(value: String): Self = StObject.set(x, "thumb1Percentage", value.asInstanceOf[js.Any])
      
      inline def setThumb2Percentage(value: String): Self = StObject.set(x, "thumb2Percentage", value.asInstanceOf[js.Any])
      
      inline def setThumb2PercentageUndefined: Self = StObject.set(x, "thumb2Percentage", js.undefined)
    }
  }
}
