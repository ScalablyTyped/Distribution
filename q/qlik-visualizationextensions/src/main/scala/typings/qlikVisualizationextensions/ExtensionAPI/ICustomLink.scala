package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomLink extends js.Object {
  var component: link
  var label: String
  var `type`: String
  var url: String
}

object ICustomLink {
  @scala.inline
  def apply(component: link, label: String, `type`: String, url: String): ICustomLink = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomLink]
  }
}

