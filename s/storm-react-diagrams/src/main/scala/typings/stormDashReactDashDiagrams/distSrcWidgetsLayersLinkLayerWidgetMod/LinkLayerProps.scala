package typings.stormDashReactDashDiagrams.distSrcWidgetsLayersLinkLayerWidgetMod

import typings.std.MouseEvent
import typings.stormDashReactDashDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typings.stormDashReactDashDiagrams.distSrcModelsPointModelMod.PointModel
import typings.stormDashReactDashDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidgetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkLayerProps extends BaseWidgetProps {
  var diagramEngine: DiagramEngine
  def pointAdded(point: PointModel, event: MouseEvent): js.Any
}

object LinkLayerProps {
  @scala.inline
  def apply(
    diagramEngine: DiagramEngine,
    pointAdded: (PointModel, MouseEvent) => js.Any,
    baseClass: String = null,
    className: String = null,
    extraProps: js.Any = null
  ): LinkLayerProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine, pointAdded = js.Any.fromFunction2(pointAdded))
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    __obj.asInstanceOf[LinkLayerProps]
  }
}

