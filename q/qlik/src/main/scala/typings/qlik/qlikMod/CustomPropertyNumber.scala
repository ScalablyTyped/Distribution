package typings.qlik.qlikMod

import typings.qlik.qlikStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyNumber
  extends CustomPropertyCommon
     with CustomProperty {
  var component: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_CustomPropertyNumber: number
}

object CustomPropertyNumber {
  @scala.inline
  def apply(
    `type`: number,
    component: String = null,
    defaultValue: Int | Double = null,
    label: String = null,
    max: String = null,
    min: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomPropertyNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (component != null) __obj.updateDynamic("component")(component)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyNumber]
  }
}

