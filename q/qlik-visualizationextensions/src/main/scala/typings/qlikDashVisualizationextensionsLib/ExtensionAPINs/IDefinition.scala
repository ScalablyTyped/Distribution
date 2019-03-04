package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
trait IDefinition extends js.Object {
  var component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.accordion
  var items: IItems
  var `type`: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.items
}

object IDefinition {
  @scala.inline
  def apply(
    component: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.accordion,
    items: IItems,
    `type`: qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.items
  ): IDefinition = {
    val __obj = js.Dynamic.literal(component = component, items = items)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IDefinition]
  }
}

