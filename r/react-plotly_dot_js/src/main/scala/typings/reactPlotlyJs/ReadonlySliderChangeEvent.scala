package typings.reactPlotlyJs

import typings.plotlyJs.mod.Slider
import typings.plotlyJs.mod.SliderStep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.SliderChangeEvent> */
trait ReadonlySliderChangeEvent extends js.Object {
  val interaction: Boolean
  val previousActive: Double
  val slider: Slider
  val step: SliderStep
}

object ReadonlySliderChangeEvent {
  @scala.inline
  def apply(interaction: Boolean, previousActive: Double, slider: Slider, step: SliderStep): ReadonlySliderChangeEvent = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], previousActive = previousActive.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadonlySliderChangeEvent]
  }
}

