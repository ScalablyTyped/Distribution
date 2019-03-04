package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomRadioButton extends ICustomControl {
  var component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.radiobuttons
  var defaultValue: java.lang.String
  var options: valueOrfunc[ICustomControlOption]
}

object ICustomRadioButton {
  @scala.inline
  def apply(
    component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.radiobuttons,
    defaultValue: java.lang.String,
    label: java.lang.String,
    options: valueOrfunc[ICustomControlOption],
    ref: java.lang.String,
    `type`: java.lang.String
  ): ICustomRadioButton = {
    val __obj = js.Dynamic.literal(component = component, defaultValue = defaultValue, label = label, options = options.asInstanceOf[js.Any], ref = ref)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomRadioButton]
  }
}

