package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyButton
  extends CustomPropertyCommon
     with CustomProperty {
  var component: qlikLib.qlikLibStrings.button
  def action(data: VisualizationOptions): scala.Unit
}

object CustomPropertyButton {
  @scala.inline
  def apply(
    action: js.Function1[VisualizationOptions, scala.Unit],
    component: qlikLib.qlikLibStrings.button,
    label: java.lang.String = null,
    ref: java.lang.String = null,
    show: scala.Boolean | ShowFunction = null,
    `type`: qlikLib.qlikLibStrings.string | qlikLib.qlikLibStrings.integer | qlikLib.qlikLibStrings.number | qlikLib.qlikLibStrings.array | qlikLib.qlikLibStrings.boolean | qlikLib.qlikLibStrings.items = null
  ): CustomPropertyButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("component")(component)
    if (label != null) __obj.updateDynamic("label")(label)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyButton]
  }
}

