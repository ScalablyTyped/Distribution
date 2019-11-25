package typings.qlik.qlikMod

import typings.qlik.qlikStrings.boolean
import typings.qlik.qlikStrings.switch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertySwitch
  extends CustomPropertyCommon
     with CustomProperty {
  var component: switch
  var defaultValue: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[CustomPropertyOptions] = js.undefined
  @JSName("type")
  var type_CustomPropertySwitch: boolean
}

object CustomPropertySwitch {
  @scala.inline
  def apply(
    component: switch,
    `type`: boolean,
    defaultValue: String = null,
    label: String = null,
    options: CustomPropertyOptions = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomPropertySwitch = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertySwitch]
  }
}

