package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyRadio
  extends CustomPropertyCommon
     with CustomProperty {
  var component: qlikLib.qlikLibStrings.radiobuttons
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[CustomPropertyOptions] = js.undefined
  @JSName("type")
  var type_CustomPropertyRadio: qlikLib.qlikLibStrings.string
}

object CustomPropertyRadio {
  @scala.inline
  def apply(
    component: qlikLib.qlikLibStrings.radiobuttons,
    `type`: qlikLib.qlikLibStrings.string,
    defaultValue: java.lang.String = null,
    label: java.lang.String = null,
    options: CustomPropertyOptions = null,
    ref: java.lang.String = null,
    show: scala.Boolean | ShowFunction = null
  ): CustomPropertyRadio = {
    val __obj = js.Dynamic.literal(component = component)
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (label != null) __obj.updateDynamic("label")(label)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyRadio]
  }
}

