package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomSwitch extends js.Object {
  var component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.switch
  var defaultValue: scala.Boolean
  var options: valueOrfunc[ICustomControlOption]
}

object ICustomSwitch {
  @scala.inline
  def apply(
    component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.switch,
    defaultValue: scala.Boolean,
    options: valueOrfunc[ICustomControlOption]
  ): ICustomSwitch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomSwitch]
  }
}

