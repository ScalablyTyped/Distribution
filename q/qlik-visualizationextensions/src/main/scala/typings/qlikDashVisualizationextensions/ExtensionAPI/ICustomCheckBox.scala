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
    val __obj = js.Dynamic.literal(component = component, defaultValue = defaultValue, label = label, ref = ref)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomCheckBox]
  }
}

