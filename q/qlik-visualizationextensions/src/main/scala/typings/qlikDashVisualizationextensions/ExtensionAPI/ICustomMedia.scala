package typings.qlikDashVisualizationextensions.ExtensionAPI

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
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], layoutRef = layoutRef.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomMedia]
  }
}

