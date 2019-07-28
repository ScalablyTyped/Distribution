package typings.stormDashReactDashDiagrams.distSrcDefaultsWidgetsDefaultNodeWidgetMod

import typings.stormDashReactDashDiagrams.distSrcDefaultsModelsDefaultNodeModelMod.DefaultNodeModel
import typings.stormDashReactDashDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typings.stormDashReactDashDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidgetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultNodeProps extends BaseWidgetProps {
  var diagramEngine: DiagramEngine
  var node: DefaultNodeModel
}

object DefaultNodeProps {
  @scala.inline
  def apply(
    diagramEngine: DiagramEngine,
    node: DefaultNodeModel,
    baseClass: String = null,
    className: String = null,
    extraProps: js.Any = null
  ): DefaultNodeProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine, node = node)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    __obj.asInstanceOf[DefaultNodeProps]
  }
}

