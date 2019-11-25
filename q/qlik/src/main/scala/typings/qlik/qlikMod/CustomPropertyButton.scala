package typings.qlik.qlikMod

import typings.qlik.qlikStrings.array
import typings.qlik.qlikStrings.boolean
import typings.qlik.qlikStrings.button
import typings.qlik.qlikStrings.integer
import typings.qlik.qlikStrings.items
import typings.qlik.qlikStrings.number
import typings.qlik.qlikStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyButton
  extends CustomPropertyCommon
     with CustomProperty {
  var component: button
  def action(data: VisualizationOptions): Unit
}

object CustomPropertyButton {
  @scala.inline
  def apply(
    action: VisualizationOptions => Unit,
    component: button,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: string | integer | number | array | boolean | items = null
  ): CustomPropertyButton = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), component = component.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyButton]
  }
}

