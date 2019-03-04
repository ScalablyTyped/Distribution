package typings
package stormDashReactDashDiagramsLib.distSrcWidgetsLayersNodeLayerWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeLayerProps
  extends stormDashReactDashDiagramsLib.distSrcWidgetsBaseWidgetMod.BaseWidgetProps {
  var diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine
}

object NodeLayerProps {
  @scala.inline
  def apply(
    diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine,
    baseClass: java.lang.String = null,
    className: java.lang.String = null,
    extraProps: js.Any = null
  ): NodeLayerProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    __obj.asInstanceOf[NodeLayerProps]
  }
}

