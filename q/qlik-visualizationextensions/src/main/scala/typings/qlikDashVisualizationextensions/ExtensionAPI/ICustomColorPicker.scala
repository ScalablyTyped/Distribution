package typings.qlikDashVisualizationextensions.ExtensionAPI

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
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomColorPicker]
  }
}

