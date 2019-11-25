package typings.qlik.qlikMod

import typings.qlik.qlikStrings.array
import typings.qlik.qlikStrings.boolean
import typings.qlik.qlikStrings.integer
import typings.qlik.qlikStrings.items
import typings.qlik.qlikStrings.number
import typings.qlik.qlikStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyCommon extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[Boolean | ShowFunction] = js.undefined
  var `type`: js.UndefOr[string | integer | number | array | boolean | items] = js.undefined
}

object CustomPropertyCommon {
  @scala.inline
  def apply(
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: string | integer | number | array | boolean | items = null
  ): CustomPropertyCommon = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyCommon]
  }
}

