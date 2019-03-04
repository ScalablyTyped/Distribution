package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyLink
  extends CustomPropertyCommon
     with CustomProperty {
  var component: qlikLib.qlikLibStrings.link
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object CustomPropertyLink {
  @scala.inline
  def apply(
    component: qlikLib.qlikLibStrings.link,
    label: java.lang.String = null,
    ref: java.lang.String = null,
    show: scala.Boolean | ShowFunction = null,
    `type`: qlikLib.qlikLibStrings.string | qlikLib.qlikLibStrings.integer | qlikLib.qlikLibStrings.number | qlikLib.qlikLibStrings.array | qlikLib.qlikLibStrings.boolean | qlikLib.qlikLibStrings.items = null,
    url: java.lang.String = null
  ): CustomPropertyLink = {
    val __obj = js.Dynamic.literal(component = component)
    if (label != null) __obj.updateDynamic("label")(label)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CustomPropertyLink]
  }
}

