package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.Slider
import typings.plotlyJs.mod.SliderStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.SliderChangeEvent> */
trait ReadonlySliderChangeEvent extends StObject {
  
  val interaction: Boolean
  
  val previousActive: Double
  
  val slider: Slider
  
  val step: SliderStep
}
object ReadonlySliderChangeEvent {
  
  inline def apply(interaction: Boolean, previousActive: Double, slider: Slider, step: SliderStep): ReadonlySliderChangeEvent = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], previousActive = previousActive.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySliderChangeEvent]
  }
  
  extension [Self <: ReadonlySliderChangeEvent](x: Self) {
    
    inline def setInteraction(value: Boolean): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPreviousActive(value: Double): Self = StObject.set(x, "previousActive", value.asInstanceOf[js.Any])
    
    inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    inline def setStep(value: SliderStep): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
