package typings.qlikDashVisualizationextensions.ExtensionAPI

import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.slider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomSlider extends ICustomControl {
  var component: slider
  var defaultValue: Double
  var max: Double
  var min: Double
  var step: Double
}

object ICustomSlider {
  @scala.inline
  def apply(
    component: slider,
    defaultValue: Double,
    label: String,
    max: Double,
    min: Double,
    ref: String,
    step: Double,
    `type`: String
  ): ICustomSlider = {
    val __obj = js.Dynamic.literal(component = component, defaultValue = defaultValue, label = label, max = max, min = min, ref = ref, step = step)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomSlider]
  }
}

