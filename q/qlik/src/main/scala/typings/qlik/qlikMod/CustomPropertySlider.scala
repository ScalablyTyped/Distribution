package typings.qlik.qlikMod

import typings.qlik.qlikStrings.number
import typings.qlik.qlikStrings.slider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertySlider
  extends CustomPropertyCommon
     with CustomProperty {
  var component: slider
  var defaultValue: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  @JSName("type")
  var type_CustomPropertySlider: number
}

object CustomPropertySlider {
  @scala.inline
  def apply(
    component: slider,
    `type`: number,
    defaultValue: Int | Double = null,
    label: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    step: Int | Double = null
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

