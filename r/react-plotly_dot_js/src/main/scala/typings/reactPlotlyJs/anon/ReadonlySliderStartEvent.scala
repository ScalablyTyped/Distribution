package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.Slider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.SliderStartEvent> */
trait ReadonlySliderStartEvent extends js.Object {
  val slider: Slider
}

object ReadonlySliderStartEvent {
  @scala.inline
  def apply(slider: Slider): ReadonlySliderStartEvent = {
    val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySliderStartEvent]
  }
}

