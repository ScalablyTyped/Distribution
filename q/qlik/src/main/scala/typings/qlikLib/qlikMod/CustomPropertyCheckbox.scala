package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyCheckbox
  extends CustomPropertyCommon
     with CustomProperty {
  var defaultValue: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("type")
  var type_CustomPropertyCheckbox: qlikLib.qlikLibStrings.boolean
}

object CustomPropertyCheckbox {
  @scala.inline
  def apply(
    `type`: qlikLib.qlikLibStrings.boolean,
    defaultValue: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    ref: java.lang.String = null,
    show: scala.Boolean | ShowFunction = null
  ): CustomPropertyCheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue)
    if (label != null) __obj.updateDynamic("label")(label)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyCheckbox]
  }
}

