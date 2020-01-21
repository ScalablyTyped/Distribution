package typings.stormReactDiagrams.portWidgetMod

import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.nodeModelMod.NodeModel
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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortProps]
  }
}

