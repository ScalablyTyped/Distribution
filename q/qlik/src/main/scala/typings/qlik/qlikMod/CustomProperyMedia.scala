package typings.qlik.qlikMod

import typings.qlik.qlikStrings.media
import typings.qlik.qlikStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomProperyMedia
  extends CustomPropertyCommon
     with CustomProperty {
  var component: media
  var layoutRef: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_CustomProperyMedia: string
}

object CustomProperyMedia {
  @scala.inline
  def apply(
    component: media,
    `type`: string,
    label: String = null,
    layoutRef: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperyMedia = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layoutRef != null) __obj.updateDynamic("layoutRef")(layoutRef.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperyMedia]
  }
}

