package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.Slider
import typings.plotlyJs.mod.SliderStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.SliderChangeEvent> */
@js.native
trait ReadonlySliderChangeEvent extends StObject {
  
  val interaction: Boolean = js.native
  
  val previousActive: Double = js.native
  
  val slider: Slider = js.native
  
  val step: SliderStep = js.native
}
object ReadonlySliderChangeEvent {
  
  @scala.inline
  def apply(interaction: Boolean, previousActive: Double, slider: Slider, step: SliderStep): ReadonlySliderChangeEvent = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], previousActive = previousActive.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySliderChangeEvent]
  }
  
  @scala.inline
  implicit class ReadonlySliderChangeEventMutableBuilder[Self <: ReadonlySliderChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInteraction(value: Boolean): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousActive(value: Double): Self = StObject.set(x, "previousActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: SliderStep): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
