package typings
package stormDashReactDashDiagramsLib.distSrcWidgetsLinkWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps
  extends stormDashReactDashDiagramsLib.distSrcWidgetsBaseWidgetMod.BaseWidgetProps {
  var children: js.UndefOr[js.Any] = js.undefined
  var diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine
  var link: stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener]
}

object LinkProps {
  @scala.inline
  def apply(
    diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine,
    link: stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModel[stormDashReactDashDiagramsLib.distSrcModelsLinkModelMod.LinkModelListener],
    baseClass: java.lang.String = null,
    children: js.Any = null,
    className: java.lang.String = null,
    extraProps: js.Any = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("diagramEngine")(diagramEngine)
    __obj.updateDynamic("link")(link)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    __obj.asInstanceOf[LinkProps]
  }
}

