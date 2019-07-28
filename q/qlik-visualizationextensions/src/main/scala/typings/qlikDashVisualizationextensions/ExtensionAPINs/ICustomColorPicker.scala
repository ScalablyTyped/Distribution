package typings.qlikDashVisualizationextensions.ExtensionAPINs

import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.`color-picker`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomColorPicker extends ICustomControl {
  var component: `color-picker`
  var defaultValue: Double
}

object ICustomColorPicker {
  @scala.inline
  def apply(component: `color-picker`, defaultValue: Double, label: String, ref: String, `type`: String): ICustomColorPicker = {
    val __obj = js.Dynamic.literal(component = component, defaultValue = defaultValue, label = label, ref = ref)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomColorPicker]
  }
}

