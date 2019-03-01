package typings
package stormDashReactDashDiagramsLib.distSrcDefaultsWidgetsDefaultNodeWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultNodeProps
  extends stormDashReactDashDiagramsLib.distSrcWidgetsBaseWidgetMod.BaseWidgetProps {
  var diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine
  var node: stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultNodeModelMod.DefaultNodeModel
}

object DefaultNodeProps {
  @scala.inline
  def apply(
    diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine,
    node: stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultNodeModelMod.DefaultNodeModel,
    baseClass: java.lang.String = null,
    className: java.lang.String = null,
    extraProps: js.Any = null
  ): DefaultNodeProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("diagramEngine")(diagramEngine)
    __obj.updateDynamic("node")(node)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    __obj.asInstanceOf[DefaultNodeProps]
  }
}

