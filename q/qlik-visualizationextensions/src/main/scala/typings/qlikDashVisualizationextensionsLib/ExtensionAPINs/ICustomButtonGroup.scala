package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomButtonGroup extends ICustomControl {
  var component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.buttongroup
  var defaultValue: java.lang.String
  var options: valueOrfunc[ICustomControlOption]
}

object ICustomButtonGroup {
  @scala.inline
  def apply(
    component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.buttongroup,
    defaultValue: java.lang.String,
    label: java.lang.String,
    options: valueOrfunc[ICustomControlOption],
    ref: java.lang.String,
    `type`: java.lang.String
  ): ICustomButtonGroup = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ICustomButtonGroup]
  }
}

