package typings.qlik.qlikMod

import typings.qlik.qlikStrings.dropdown
import typings.qlik.qlikStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyDropdown
  extends CustomPropertyCommon
     with CustomProperty {
  var component: dropdown
  var defaultValue: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[CustomPropertyOptions] = js.undefined
  @JSName("ref")
  var ref_CustomPropertyDropdown: String
  @JSName("type")
  var type_CustomPropertyDropdown: string
}

object CustomPropertyDropdown {
  @scala.inline
  def apply(
    component: dropdown,
    ref: String,
    `type`: string,
    defaultValue: String = null,
    label: String = null,
    options: CustomPropertyOptions = null,
    show: Boolean | ShowFunction = null
  ): CustomPropertyDropdown = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyDropdown]
  }
}

