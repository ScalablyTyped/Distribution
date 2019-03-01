package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomText extends js.Object {
  var component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.text
  var label: java.lang.String
  var `type`: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.text
}

object ICustomText {
  @scala.inline
  def apply(
    component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.text,
    label: java.lang.String,
    `type`: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.text
  ): ICustomText = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[ICustomText]
  }
}

