package typings.qlik.qlikMod

import typings.qlik.qlikStrings.buttongroup
import typings.qlik.qlikStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyButtonGroup
  extends CustomPropertyCommon
     with CustomProperty {
  var component: buttongroup
  var defaultValue: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Array[ButtonGroupOption] | js.Function0[js.Array[ButtonGroupOption]]] = js.undefined
  @JSName("type")
  var type_CustomPropertyButtonGroup: string
}

object CustomPropertyButtonGroup {
  @scala.inline
  def apply(
    component: buttongroup,
    `type`: string,
    defaultValue: String = null,
    label: String = null,
    options: js.Array[ButtonGroupOption] | js.Function0[js.Array[ButtonGroupOption]] = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomPropertyButtonGroup = {
    val __obj = js.Dynamic.literal(component = component)
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (label != null) __obj.updateDynamic("label")(label)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyButtonGroup]
  }
}

