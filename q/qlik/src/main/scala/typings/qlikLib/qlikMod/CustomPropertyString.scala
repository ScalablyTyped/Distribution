package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyString
  extends CustomPropertyCommon
     with CustomProperty {
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var expression: js.UndefOr[
    qlikLib.qlikLibStrings.always | qlikLib.qlikLibStrings.optional | qlikLib.qlikLibStrings.Empty
  ] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  @JSName("type")
  var type_CustomPropertyString: qlikLib.qlikLibStrings.string
}

object CustomPropertyString {
  @scala.inline
  def apply(
    `type`: qlikLib.qlikLibStrings.string,
    defaultValue: java.lang.String = null,
    expression: qlikLib.qlikLibStrings.always | qlikLib.qlikLibStrings.optional | qlikLib.qlikLibStrings.Empty = null,
    label: java.lang.String = null,
    maxLength: scala.Int | scala.Double = null,
    ref: java.lang.String = null,
    show: scala.Boolean | ShowFunction = null
  ): CustomPropertyString = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyString]
  }
}

