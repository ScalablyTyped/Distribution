package typings.qlikDashVisualizationextensions.ExtensionAPINs

import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.media
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomMedia extends ICustomControl {
  var component: media
  var layoutRef: String
}

object ICustomMedia {
  @scala.inline
  def apply(component: media, label: String, layoutRef: String, ref: String, `type`: String): ICustomMedia = {
    val __obj = js.Dynamic.literal(component = component, label = label, layoutRef = layoutRef, ref = ref)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomMedia]
  }
}

