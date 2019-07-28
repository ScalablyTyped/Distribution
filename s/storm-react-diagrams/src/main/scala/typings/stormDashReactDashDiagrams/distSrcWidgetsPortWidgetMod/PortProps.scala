package typings.stormDashReactDashDiagrams.distSrcWidgetsPortWidgetMod

import typings.stormDashReactDashDiagrams.distSrcModelsNodeModelMod.NodeModel
import typings.stormDashReactDashDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidgetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortProps extends BaseWidgetProps {
  var name: String
  var node: NodeModel
}

object PortProps {
  @scala.inline
  def apply(
    name: String,
    node: NodeModel,
    baseClass: String = null,
    className: String = null,
    extraProps: js.Any = null
  ): PortProps = {
    val __obj = js.Dynamic.literal(name = name, node = node)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    __obj.asInstanceOf[PortProps]
  }
}

