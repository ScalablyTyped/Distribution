package typings.qlik.qlikMod

import typings.qlik.qlikStrings.`color-picker`
import typings.qlik.qlikStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyColorPicker
  extends CustomPropertyCommon
     with CustomProperty {
  var component: `color-picker`
  var defaultValue: js.UndefOr[Double] = js.undefined
  @JSName("type")
  var type_CustomPropertyColorPicker: integer
}

object CustomPropertyColorPicker {
  @scala.inline
  def apply(
    component: `color-picker`,
    `type`: integer,
    defaultValue: Int | Double = null,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomPropertyColorPicker = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyColorPicker]
  }
}

