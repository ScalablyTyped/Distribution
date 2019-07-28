package typings.qlikDashVisualizationextensions.ExtensionAPINs

import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.text
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
    val __obj = js.Dynamic.literal(component = component, label = label)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomText]
  }
}

