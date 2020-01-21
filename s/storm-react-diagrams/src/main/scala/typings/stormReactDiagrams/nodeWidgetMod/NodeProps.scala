package typings.stormReactDiagrams.nodeWidgetMod

import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.nodeModelMod.NodeModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeProps extends BaseWidgetProps {
  var children: js.UndefOr[js.Any] = js.undefined
  var diagramEngine: DiagramEngine
  var node: NodeModel
}

object NodeProps {
  @scala.inline
  def apply(
    diagramEngine: DiagramEngine,
    node: NodeModel,
    baseClass: String = null,
    children: js.Any = null,
    className: String = null,
    extraProps: js.Any = null
  ): NodeProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProps]
  }
}

