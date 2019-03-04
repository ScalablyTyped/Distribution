package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomProperyMedia
  extends CustomPropertyCommon
     with CustomProperty {
  var component: qlikLib.qlikLibStrings.media
  var layoutRef: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_CustomProperyMedia: qlikLib.qlikLibStrings.string
}

object CustomProperyMedia {
  @scala.inline
  def apply(
    component: qlikLib.qlikLibStrings.media,
    `type`: qlikLib.qlikLibStrings.string,
    label: java.lang.String = null,
    layoutRef: java.lang.String = null,
    ref: java.lang.String = null,
    show: scala.Boolean | ShowFunction = null
  ): CustomProperyMedia = {
    val __obj = js.Dynamic.literal(component = component)
    __obj.updateDynamic("type")(`type`)
    if (label != null) __obj.updateDynamic("label")(label)
    if (layoutRef != null) __obj.updateDynamic("layoutRef")(layoutRef)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperyMedia]
  }
}

