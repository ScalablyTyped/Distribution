package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomText extends js.Object {
  var component: text
  var label: String
  var `type`: text
}

object ICustomText {
  @scala.inline
  def apply(component: text, label: String, `type`: text): ICustomText = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomText]
  }
}

