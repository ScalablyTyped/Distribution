package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyText
  extends CustomPropertyCommon
     with CustomProperty {
  var component: qlikLib.qlikLibStrings.text
}

object CustomPropertyText {
  @scala.inline
  def apply(
    component: qlikLib.qlikLibStrings.text,
    label: java.lang.String = null,
    ref: java.lang.String = null,
    show: scala.Boolean | ShowFunction = null,
    `type`: qlikLib.qlikLibStrings.string | qlikLib.qlikLibStrings.integer | qlikLib.qlikLibStrings.number | qlikLib.qlikLibStrings.array | qlikLib.qlikLibStrings.boolean | qlikLib.qlikLibStrings.items = null
  ): CustomPropertyText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("component")(component)
    if (label != null) __obj.updateDynamic("label")(label)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyText]
  }
}

