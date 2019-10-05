package typings.qlikDashVisualizationextensions.ExtensionAPI

import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.addons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddOns extends js.Object {
  var uses: addons
}

object IAddOns {
  @scala.inline
  def apply(uses: addons): IAddOns = {
    val __obj = js.Dynamic.literal(uses = uses)
  
    __obj.asInstanceOf[IAddOns]
  }
}

