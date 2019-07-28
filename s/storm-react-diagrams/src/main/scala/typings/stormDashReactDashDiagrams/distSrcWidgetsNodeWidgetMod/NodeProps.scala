package typings.stormDashReactDashDiagrams.distSrcWidgetsNodeWidgetMod

import typings.stormDashReactDashDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typings.stormDashReactDashDiagrams.distSrcModelsNodeModelMod.NodeModel
import typings.stormDashReactDashDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidgetProps
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
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine, node = node)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    __obj.asInstanceOf[NodeProps]
  }
}

