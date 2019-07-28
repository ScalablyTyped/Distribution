package typings.qlik.qlikMod

import typings.qlik.qlikStrings.array
import typings.qlik.qlikStrings.boolean
import typings.qlik.qlikStrings.integer
import typings.qlik.qlikStrings.items
import typings.qlik.qlikStrings.number
import typings.qlik.qlikStrings.string
import typings.qlik.qlikStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyText
  extends CustomPropertyCommon
     with CustomProperty {
  var component: text
}

object CustomPropertyText {
  @scala.inline
  def apply(
    component: text,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: string | integer | number | array | boolean | items = null
  ): CustomPropertyText = {
    val __obj = js.Dynamic.literal(component = component)
    if (label != null) __obj.updateDynamic("label")(label)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyText]
  }
}

