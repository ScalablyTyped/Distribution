package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomRangeSlider extends ICustomControl {
  var component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.slider
  var defaultValue: js.Array[scala.Double]
  var max: scala.Double
  var min: scala.Double
  var step: scala.Double
}

object ICustomRangeSlider {
  @scala.inline
  def apply(
    component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.slider,
    defaultValue: js.Array[scala.Double],
    label: java.lang.String,
    max: scala.Double,
    min: scala.Double,
    ref: java.lang.String,
    step: scala.Double,
    `type`: java.lang.String
  ): ICustomRangeSlider = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("ref")(ref)
    __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[ICustomRangeSlider]
  }
}

