package typings.qlikDashVisualizationextensions.ExtensionAPI

import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.accordion
import typings.qlikDashVisualizationextensions.qlikDashVisualizationextensionsStrings.items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
trait IDefinition extends js.Object {
  var component: accordion
  var items: IItems
  var `type`: items
}

object IDefinition {
  @scala.inline
  def apply(component: accordion, items: IItems, `type`: items): IDefinition = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDefinition]
  }
}

