package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyButtonGroup
  extends CustomPropertyCommon
     with CustomProperty {
  var component: qlikLib.qlikLibStrings.buttongroup
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[js.Array[ButtonGroupOption] | js.Function0[js.Array[ButtonGroupOption]]] = js.undefined
  @JSName("type")
  var type_CustomPropertyButtonGroup: qlikLib.qlikLibStrings.string
}

object CustomPropertyButtonGroup {
  @scala.inline
  def apply(
    component: qlikLib.qlikLibStrings.buttongroup,
    `type`: qlikLib.qlikLibStrings.string,
    defaultValue: java.lang.String = null,
    label: java.lang.String = null,
    options: js.Array[ButtonGroupOption] | js.Function0[js.Array[ButtonGroupOption]] = null,
    ref: java.lang.String = null,
    show: scala.Boolean | ShowFunction = null
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

