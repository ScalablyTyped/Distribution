package typings.qlikDashVisualizationextensions.ExtensionAPI

import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.checkbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomCheckBox extends ICustomControl {
  var component: checkbox
  var defaultValue: Boolean
}

object ICustomCheckBox {
  @scala.inline
  def apply(component: checkbox, defaultValue: Boolean, label: String, ref: String, `type`: String): ICustomCheckBox = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomCheckBox]
  }
}

