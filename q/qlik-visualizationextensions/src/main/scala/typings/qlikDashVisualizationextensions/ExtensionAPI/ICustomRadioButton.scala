package typings.qlikDashVisualizationextensions.ExtensionAPI

import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.radiobuttons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomRadioButton extends ICustomControl {
  var component: radiobuttons
  var defaultValue: String
  var options: valueOrfunc[ICustomControlOption]
}

object ICustomRadioButton {
  @scala.inline
  def apply(
    component: radiobuttons,
    defaultValue: String,
    label: String,
    options: valueOrfunc[ICustomControlOption],
    ref: String,
    `type`: String
  ): ICustomRadioButton = {
    val __obj = js.Dynamic.literal(component = component, defaultValue = defaultValue, label = label, options = options.asInstanceOf[js.Any], ref = ref)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomRadioButton]
  }
}

