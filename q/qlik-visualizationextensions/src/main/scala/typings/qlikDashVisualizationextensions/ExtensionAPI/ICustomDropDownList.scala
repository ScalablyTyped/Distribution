package typings.qlikDashVisualizationextensions.ExtensionAPI

import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.dropdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomDropDownList extends ICustomControl {
  var component: dropdown
  var defaultValue: String
  var options: valueOrfunc[ICustomControlOption]
}

object ICustomDropDownList {
  @scala.inline
  def apply(
    component: dropdown,
    defaultValue: String,
    label: String,
    options: valueOrfunc[ICustomControlOption],
    ref: String,
    `type`: String
  ): ICustomDropDownList = {
    val __obj = js.Dynamic.literal(component = component, defaultValue = defaultValue, label = label, options = options.asInstanceOf[js.Any], ref = ref)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomDropDownList]
  }
}

