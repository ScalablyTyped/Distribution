package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomSlider extends ICustomControl {
  var component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.slider
  var defaultValue: scala.Double
  var max: scala.Double
  var min: scala.Double
  var step: scala.Double
}

object ICustomSlider {
  @scala.inline
  def apply(
    component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.slider,
    defaultValue: scala.Double,
    label: java.lang.String,
    max: scala.Double,
    min: scala.Double,
    ref: java.lang.String,
    step: scala.Double,
    `type`: java.lang.String
  ): ICustomSlider = {
    val __obj = js.Dynamic.literal(component = component, defaultValue = defaultValue, label = label, max = max, min = min, ref = ref, step = step)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomSlider]
  }
}

