package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomButton extends ICustomControl {
  var action: valueOrfunc[scala.Unit]
  var component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.button
}

object ICustomButton {
  @scala.inline
  def apply(
    action: valueOrfunc[scala.Unit],
    component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.button,
    label: java.lang.String,
    ref: java.lang.String,
    `type`: java.lang.String
  ): ICustomButton = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[ICustomButton]
  }
}

