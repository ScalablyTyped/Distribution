package typings
package stormDashReactDashDiagramsLib.distSrcModelsDiagramModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramListener
  extends stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[js.Any] {
  var gridUpdated: js.UndefOr[
    js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[DiagramModel] with stormDashReactDashDiagramsLib.Anon_Size, 
      scala.Unit
    ]
  ] = js.undefined
  var linksUpdated: js.UndefOr[
    js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[_] with stormDashReactDashDiagramsLib.Anon_IsCreatedLink, 
      scala.Unit
    ]
  ] = js.undefined
  var nodesUpdated: js.UndefOr[
    js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[_] with stormDashReactDashDiagramsLib.Anon_IsCreated, 
      scala.Unit
    ]
  ] = js.undefined
  var offsetUpdated: js.UndefOr[
    js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[DiagramModel] with stormDashReactDashDiagramsLib.Anon_OffsetX, 
      scala.Unit
    ]
  ] = js.undefined
  var zoomUpdated: js.UndefOr[
    js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[DiagramModel] with stormDashReactDashDiagramsLib.Anon_Zoom, 
      scala.Unit
    ]
  ] = js.undefined
}

