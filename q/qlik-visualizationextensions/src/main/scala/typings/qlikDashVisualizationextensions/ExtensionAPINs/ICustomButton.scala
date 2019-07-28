package typings.qlikDashVisualizationextensions.ExtensionAPINs

import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomButton extends ICustomControl {
  var action: valueOrfunc[Unit]
  var component: button
}

object ICustomButton {
  @scala.inline
  def apply(action: valueOrfunc[Unit], component: button, label: String, ref: String, `type`: String): ICustomButton = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], component = component, label = label, ref = ref)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomButton]
  }
}

