package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyColorPicker
  extends CustomPropertyCommon
     with CustomProperty {
  var component: qlikLib.qlikLibStrings.`color-picker`
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  @JSName("type")
  var type_CustomPropertyColorPicker: qlikLib.qlikLibStrings.integer
}

object CustomPropertyColorPicker {
  @scala.inline
  def apply(
    component: qlikLib.qlikLibStrings.`color-picker`,
    `type`: qlikLib.qlikLibStrings.integer,
    defaultValue: scala.Int | scala.Double = null,
    label: java.lang.String = null,
    ref: java.lang.String = null,
    show: scala.Boolean | ShowFunction = null
  ): CustomPropertyColorPicker = {
    val __obj = js.Dynamic.literal(component = component)
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyColorPicker]
  }
}

