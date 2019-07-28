package typings.qlik.qlikMod

import typings.qlik.qlikStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyCheckbox
  extends CustomPropertyCommon
     with CustomProperty {
  var defaultValue: js.UndefOr[Boolean] = js.undefined
  @JSName("type")
  var type_CustomPropertyCheckbox: boolean
}

object CustomPropertyCheckbox {
  @scala.inline
  def apply(
    `type`: boolean,
    defaultValue: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
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

