package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyCommon extends js.Object {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var ref: js.UndefOr[java.lang.String] = js.undefined
  var show: js.UndefOr[scala.Boolean | ShowFunction] = js.undefined
  var `type`: js.UndefOr[
    qlikLib.qlikLibStrings.string | qlikLib.qlikLibStrings.integer | qlikLib.qlikLibStrings.number | qlikLib.qlikLibStrings.array | qlikLib.qlikLibStrings.boolean | qlikLib.qlikLibStrings.items
  ] = js.undefined
}

object CustomPropertyCommon {
  @scala.inline
  def apply(
    label: java.lang.String = null,
    ref: java.lang.String = null,
    show: scala.Boolean | ShowFunction = null,
    `type`: qlikLib.qlikLibStrings.string | qlikLib.qlikLibStrings.integer | qlikLib.qlikLibStrings.number | qlikLib.qlikLibStrings.array | qlikLib.qlikLibStrings.boolean | qlikLib.qlikLibStrings.items = null
  ): CustomPropertyCommon = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyCommon]
  }
}

