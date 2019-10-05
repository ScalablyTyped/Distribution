package typings.qlikDashVisualizationextensions.ExtensionAPI

import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.buttongroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomButtonGroup extends ICustomControl {
  var component: buttongroup
  var defaultValue: String
  var options: valueOrfunc[ICustomControlOption]
}

object ICustomButtonGroup {
  @scala.inline
  def apply(
    component: buttongroup,
    defaultValue: String,
    label: String,
    options: valueOrfunc[ICustomControlOption],
    ref: String,
    `type`: String
  ): ICustomButtonGroup = {
    val __obj = js.Dynamic.literal(component = component, defaultValue = defaultValue, label = label, options = options.asInstanceOf[js.Any], ref = ref)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomButtonGroup]
  }
}

