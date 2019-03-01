package typings
package stormDashReactDashDiagramsLib.distSrcWidgetsNodeWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeProps
  extends stormDashReactDashDiagramsLib.distSrcWidgetsBaseWidgetMod.BaseWidgetProps {
  var children: js.UndefOr[js.Any] = js.undefined
  var diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine
  var node: stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel
}

object NodeProps {
  @scala.inline
  def apply(
    diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine,
    node: stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel,
    baseClass: java.lang.String = null,
    children: js.Any = null,
    className: java.lang.String = null,
    extraProps: js.Any = null
  ): NodeProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("diagramEngine")(diagramEngine)
    __obj.updateDynamic("node")(node)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    __obj.asInstanceOf[NodeProps]
  }
}

