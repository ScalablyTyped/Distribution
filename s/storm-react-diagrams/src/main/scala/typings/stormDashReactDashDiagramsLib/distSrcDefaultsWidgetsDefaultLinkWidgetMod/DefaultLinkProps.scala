package typings
package stormDashReactDashDiagramsLib.distSrcDefaultsWidgetsDefaultLinkWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultLinkProps
  extends stormDashReactDashDiagramsLib.distSrcWidgetsBaseWidgetMod.BaseWidgetProps {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine
  var link: stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultLinkModelMod.DefaultLinkModel
  var pointAdded: js.UndefOr[
    js.Function2[
      /* point */ stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel, 
      /* event */ stdLib.MouseEvent, 
      _
    ]
  ] = js.undefined
  var smooth: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object DefaultLinkProps {
  @scala.inline
  def apply(
    diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine,
    link: stormDashReactDashDiagramsLib.distSrcDefaultsModelsDefaultLinkModelMod.DefaultLinkModel,
    baseClass: java.lang.String = null,
    className: java.lang.String = null,
    color: java.lang.String = null,
    extraProps: js.Any = null,
    pointAdded: (/* point */ stormDashReactDashDiagramsLib.distSrcModelsPointModelMod.PointModel, /* event */ stdLib.MouseEvent) => _ = null,
    smooth: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): DefaultLinkProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine, link = link)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    if (pointAdded != null) __obj.updateDynamic("pointAdded")(js.Any.fromFunction2(pointAdded))
    if (!js.isUndefined(smooth)) __obj.updateDynamic("smooth")(smooth)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLinkProps]
  }
}

