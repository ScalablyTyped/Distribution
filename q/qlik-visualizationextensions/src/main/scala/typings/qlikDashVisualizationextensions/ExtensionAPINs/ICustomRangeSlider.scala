package typings.qlikDashVisualizationextensions.ExtensionAPINs

import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.slider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomRangeSlider extends ICustomControl {
  var component: slider
  var defaultValue: js.Array[Double]
  var max: Double
  var min: Double
  var step: Double
}

object ICustomRangeSlider {
  @scala.inline
  def apply(
    component: slider,
    defaultValue: js.Array[Double],
    label: String,
    max: Double,
    min: Double,
    ref: String,
    step: Double,
    `type`: String
  ): ICustomRangeSlider = {
    val __obj = js.Dynamic.literal(component = component, defaultValue = defaultValue, label = label, max = max, min = min, ref = ref, step = step)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomRangeSlider]
  }
}

