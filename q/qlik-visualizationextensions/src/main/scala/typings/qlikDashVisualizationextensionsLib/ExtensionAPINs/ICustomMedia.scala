package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomMedia extends ICustomControl {
  var component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.media
  var layoutRef: java.lang.String
}

object ICustomMedia {
  @scala.inline
  def apply(
    component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.media,
    label: java.lang.String,
    layoutRef: java.lang.String,
    ref: java.lang.String,
    `type`: java.lang.String
  ): ICustomMedia = {
    val __obj = js.Dynamic.literal(component = component, label = label, layoutRef = layoutRef, ref = ref)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomMedia]
  }
}

