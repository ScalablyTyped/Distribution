package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomLink extends js.Object {
  var component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.link
  var label: java.lang.String
  var `type`: java.lang.String
  var url: java.lang.String
}

object ICustomLink {
  @scala.inline
  def apply(
    component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.link,
    label: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String
  ): ICustomLink = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ICustomLink]
  }
}

