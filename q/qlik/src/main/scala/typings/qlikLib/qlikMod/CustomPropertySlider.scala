package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertySlider
  extends CustomPropertyCommon
     with CustomProperty {
  var component: qlikLib.qlikLibStrings.slider
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  @JSName("type")
  var type_CustomPropertySlider: qlikLib.qlikLibStrings.number
}

object CustomPropertySlider {
  @scala.inline
  def apply(
    component: qlikLib.qlikLibStrings.slider,
    `type`: qlikLib.qlikLibStrings.number,
    defaultValue: scala.Int | scala.Double = null,
    label: java.lang.String = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    ref: java.lang.String = null,
    show: scala.Boolean | ShowFunction = null,
    step: scala.Int | scala.Double = null
  ): CustomPropertySlider = {
    val __obj = js.Dynamic.literal(component = component)
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertySlider]
  }
}

