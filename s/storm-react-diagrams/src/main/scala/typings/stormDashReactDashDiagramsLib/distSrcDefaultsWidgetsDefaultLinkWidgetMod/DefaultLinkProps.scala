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
      /* event */ reactLib.MouseEvent, 
      _
    ]
  ] = js.undefined
  var smooth: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

