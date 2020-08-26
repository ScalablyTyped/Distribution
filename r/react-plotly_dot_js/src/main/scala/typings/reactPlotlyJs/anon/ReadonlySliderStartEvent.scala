package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.Slider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.SliderStartEvent> */
@js.native
trait ReadonlySliderStartEvent extends js.Object {
  val slider: Slider = js.native
}

object ReadonlySliderStartEvent {
  @scala.inline
  def apply(slider: Slider): ReadonlySliderStartEvent = {
    val __obj = js.Dynamic.literal(slider = slider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySliderStartEvent]
  }
  @scala.inline
  implicit class ReadonlySliderStartEventOps[Self <: ReadonlySliderStartEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSlider(value: Slider): Self = this.set("slider", value.asInstanceOf[js.Any])
  }
  
}

