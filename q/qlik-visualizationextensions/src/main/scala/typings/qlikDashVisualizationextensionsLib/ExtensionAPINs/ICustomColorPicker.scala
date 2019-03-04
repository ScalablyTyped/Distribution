package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomColorPicker extends ICustomControl {
  var component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.`color-picker`
  var defaultValue: scala.Double
}

object ICustomColorPicker {
  @scala.inline
  def apply(
    component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.`color-picker`,
    defaultValue: scala.Double,
    label: java.lang.String,
    ref: java.lang.String,
    `type`: java.lang.String
  ): ICustomColorPicker = {
    val __obj = js.Dynamic.literal(component = component, defaultValue = defaultValue, label = label, ref = ref)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomColorPicker]
  }
}

