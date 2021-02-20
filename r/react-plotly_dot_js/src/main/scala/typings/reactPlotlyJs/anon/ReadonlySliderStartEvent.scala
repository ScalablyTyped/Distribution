package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.Slider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.SliderStartEvent> */
@js.native
trait ReadonlySliderStartEvent extends StObject {
  
  val slider: Slider = js.native
}
object ReadonlySliderStartEvent {
  
  @scala.inline
  def apply(slider: Slider): ReadonlySliderStartEvent = {
    val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySliderStartEvent]
  }
  
  @scala.inline
  implicit class ReadonlySliderStartEventMutableBuilder[Self <: ReadonlySliderStartEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
  }
}
