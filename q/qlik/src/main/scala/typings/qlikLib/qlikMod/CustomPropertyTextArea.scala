package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyTextArea
  extends CustomPropertyCommon
     with CustomProperty {
  var component: qlikLib.qlikLibStrings.textarea
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var maxlength: js.UndefOr[scala.Double] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  @JSName("type")
  var type_CustomPropertyTextArea: qlikLib.qlikLibStrings.string
}

object CustomPropertyTextArea {
  @scala.inline
  def apply(
    component: qlikLib.qlikLibStrings.textarea,
    `type`: qlikLib.qlikLibStrings.string,
    defaultValue: java.lang.String = null,
    label: java.lang.String = null,
    maxlength: scala.Int | scala.Double = null,
    ref: java.lang.String = null,
    rows: scala.Int | scala.Double = null,
    show: scala.Boolean | ShowFunction = null
  ): CustomPropertyTextArea = {
    val __obj = js.Dynamic.literal(component = component)
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyTextArea]
  }
}

