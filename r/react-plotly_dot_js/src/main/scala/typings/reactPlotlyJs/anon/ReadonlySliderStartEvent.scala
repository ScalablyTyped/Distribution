package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.Slider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.SliderStartEvent> */
trait ReadonlySliderStartEvent extends StObject {
  
  val slider: Slider
}
object ReadonlySliderStartEvent {
  
  inline def apply(slider: Slider): ReadonlySliderStartEvent = {
    val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySliderStartEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlySliderStartEvent] (val x: Self) extends AnyVal {
    
    inline def setSlider(value: Slider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
  }
}
