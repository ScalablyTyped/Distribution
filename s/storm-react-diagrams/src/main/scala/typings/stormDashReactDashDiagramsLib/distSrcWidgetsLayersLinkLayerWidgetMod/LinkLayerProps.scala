package typings
package stormDashReactDashDiagramsLib.distSrcWidgetsLayersLinkLayerWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkLayerProps
  extends stormDashReactDashDiagramsLib.distSrcWidgetsBaseWidgetMod.BaseWidgetProps {
  var diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine
  def pointAdded(
    point: stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel,
    event: stdLib.MouseEvent
  ): js.Any
}

object LinkLayerProps {
  @scala.inline
  def apply(
    diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine,
    pointAdded: (stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel, stdLib.MouseEvent) => js.Any,
    baseClass: java.lang.String = null,
    className: java.lang.String = null,
    extraProps: js.Any = null
  ): LinkLayerProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine, pointAdded = js.Any.fromFunction2(pointAdded))
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    __obj.asInstanceOf[LinkLayerProps]
  }
}

