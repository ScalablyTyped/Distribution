package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomCheckBox extends ICustomControl {
  var component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.checkbox
  var defaultValue: scala.Boolean
}

object ICustomCheckBox {
  @scala.inline
  def apply(
    component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.checkbox,
    defaultValue: scala.Boolean,
    label: java.lang.String,
    ref: java.lang.String,
    `type`: java.lang.String
  ): ICustomCheckBox = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ICustomCheckBox]
  }
}

