package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.Slider
import typings.plotlyJs.mod.SliderStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.SliderEndEvent> */
trait ReadonlySliderEndEvent extends StObject {
  
  val slider: Slider
  
  val step: SliderStep
}
object ReadonlySliderEndEvent {
  
  inline def apply(slider: Slider, step: SliderStep): ReadonlySliderEndEvent = {
    val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySliderEndEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlySliderEndEvent] (val x: Self) extends AnyVal {
    
    inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    inline def setStep(value: SliderStep): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
