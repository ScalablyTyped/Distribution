package typings
package stormDashReactDashDiagramsLib.distSrcWidgetsPortWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortProps
  extends stormDashReactDashDiagramsLib.distSrcWidgetsBaseWidgetMod.BaseWidgetProps {
  var name: java.lang.String
  var node: stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel
}

object PortProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    node: stormDashReactDashDiagramsLib.distSrcModelsNodeModelMod.NodeModel,
    baseClass: java.lang.String = null,
    className: java.lang.String = null,
    extraProps: js.Any = null
  ): PortProps = {
    val __obj = js.Dynamic.literal(name = name, node = node)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    __obj.asInstanceOf[PortProps]
  }
}

