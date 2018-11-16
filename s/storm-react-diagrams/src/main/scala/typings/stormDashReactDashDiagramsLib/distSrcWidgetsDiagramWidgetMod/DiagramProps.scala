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

