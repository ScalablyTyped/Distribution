package typings
package stormDashReactDashDiagramsLib.distSrcWidgetsDiagramWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramProps
  extends stormDashReactDashDiagramsLib.distSrcWidgetsBaseWidgetMod.BaseWidgetProps {
  var actionStartedFiring: js.UndefOr[
    js.Function1[
      /* action */ stormDashReactDashDiagramsLib.distSrcActionsBaseActionMod.BaseAction, 
      scala.Boolean
    ]
  ] = js.undefined
  var actionStillFiring: js.UndefOr[
    js.Function1[
      /* action */ stormDashReactDashDiagramsLib.distSrcActionsBaseActionMod.BaseAction, 
      scala.Unit
    ]
  ] = js.undefined
  var actionStoppedFiring: js.UndefOr[
    js.Function1[
      /* action */ stormDashReactDashDiagramsLib.distSrcActionsBaseActionMod.BaseAction, 
      scala.Unit
    ]
  ] = js.undefined
  var allowCanvasTranslation: js.UndefOr[scala.Boolean] = js.undefined
  var allowCanvasZoom: js.UndefOr[scala.Boolean] = js.undefined
  var allowLooseLinks: js.UndefOr[scala.Boolean] = js.undefined
  var deleteKeys: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine
  var inverseZoom: js.UndefOr[scala.Boolean] = js.undefined
  var maxNumberPointsPerLink: js.UndefOr[scala.Double] = js.undefined
  var smartRouting: js.UndefOr[scala.Boolean] = js.undefined
}

object DiagramProps {
  @scala.inline
  def apply(
    diagramEngine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine,
    actionStartedFiring: js.Function1[
      /* action */ stormDashReactDashDiagramsLib.distSrcActionsBaseActionMod.BaseAction, 
      scala.Boolean
    ] = null,
    actionStillFiring: js.Function1[
      /* action */ stormDashReactDashDiagramsLib.distSrcActionsBaseActionMod.BaseAction, 
      scala.Unit
    ] = null,
    actionStoppedFiring: js.Function1[
      /* action */ stormDashReactDashDiagramsLib.distSrcActionsBaseActionMod.BaseAction, 
      scala.Unit
    ] = null,
    allowCanvasTranslation: js.UndefOr[scala.Boolean] = js.undefined,
    allowCanvasZoom: js.UndefOr[scala.Boolean] = js.undefined,
    allowLooseLinks: js.UndefOr[scala.Boolean] = js.undefined,
    baseClass: java.lang.String = null,
    className: java.lang.String = null,
    deleteKeys: js.Array[scala.Double] = null,
    extraProps: js.Any = null,
    inverseZoom: js.UndefOr[scala.Boolean] = js.undefined,
    maxNumberPointsPerLink: scala.Int | scala.Double = null,
    smartRouting: js.UndefOr[scala.Boolean] = js.undefined
  ): DiagramProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine)
    if (actionStartedFiring != null) __obj.updateDynamic("actionStartedFiring")(actionStartedFiring)
    if (actionStillFiring != null) __obj.updateDynamic("actionStillFiring")(actionStillFiring)
    if (actionStoppedFiring != null) __obj.updateDynamic("actionStoppedFiring")(actionStoppedFiring)
    if (!js.isUndefined(allowCanvasTranslation)) __obj.updateDynamic("allowCanvasTranslation")(allowCanvasTranslation)
    if (!js.isUndefined(allowCanvasZoom)) __obj.updateDynamic("allowCanvasZoom")(allowCanvasZoom)
    if (!js.isUndefined(allowLooseLinks)) __obj.updateDynamic("allowLooseLinks")(allowLooseLinks)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (className != null) __obj.updateDynamic("className")(className)
    if (deleteKeys != null) __obj.updateDynamic("deleteKeys")(deleteKeys)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    if (!js.isUndefined(inverseZoom)) __obj.updateDynamic("inverseZoom")(inverseZoom)
    if (maxNumberPointsPerLink != null) __obj.updateDynamic("maxNumberPointsPerLink")(maxNumberPointsPerLink.asInstanceOf[js.Any])
    if (!js.isUndefined(smartRouting)) __obj.updateDynamic("smartRouting")(smartRouting)
    __obj.asInstanceOf[DiagramProps]
  }
}

