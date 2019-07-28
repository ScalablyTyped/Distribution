package typings.qlikDashVisualizationextensions.ExtensionAPINs

import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.link
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
    val __obj = js.Dynamic.literal(component = component, label = label, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICustomLink]
  }
}

