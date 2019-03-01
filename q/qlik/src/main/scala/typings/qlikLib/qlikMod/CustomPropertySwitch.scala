package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertySwitch
  extends CustomPropertyCommon
     with CustomProperty {
  var component: qlikLib.qlikLibStrings.switch
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[CustomPropertyOptions] = js.undefined
  @JSName("type")
  var type_CustomPropertySwitch: qlikLib.qlikLibStrings.boolean
}

object CustomPropertySwitch {
  @scala.inline
  def apply(
    component: qlikLib.qlikLibStrings.switch,
    `type`: qlikLib.qlikLibStrings.boolean,
    defaultValue: java.lang.String = null,
    label: java.lang.String = null,
    options: CustomPropertyOptions = null,
    ref: java.lang.String = null,
    show: scala.Boolean | ShowFunction = null
  ): CustomPropertySwitch = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("component")(component)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (label != null) __obj.updateDynamic("label")(label)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertySwitch]
  }
}

