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

object DiagramListener {
  @scala.inline
  def apply(
    gridUpdated: js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[DiagramModel] with stormDashReactDashDiagramsLib.Anon_Size, 
      scala.Unit
    ] = null,
    linksUpdated: js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[_] with stormDashReactDashDiagramsLib.Anon_IsCreatedLink, 
      scala.Unit
    ] = null,
    lockChanged: js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[js.Any] with stormDashReactDashDiagramsLib.Anon_Locked, 
      scala.Unit
    ] = null,
    nodesUpdated: js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[_] with stormDashReactDashDiagramsLib.Anon_IsCreated, 
      scala.Unit
    ] = null,
    offsetUpdated: js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[DiagramModel] with stormDashReactDashDiagramsLib.Anon_OffsetX, 
      scala.Unit
    ] = null,
    zoomUpdated: js.Function1[
      /* event */ stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEvent[DiagramModel] with stormDashReactDashDiagramsLib.Anon_Zoom, 
      scala.Unit
    ] = null
  ): DiagramListener = {
    val __obj = js.Dynamic.literal()
    if (gridUpdated != null) __obj.updateDynamic("gridUpdated")(gridUpdated)
    if (linksUpdated != null) __obj.updateDynamic("linksUpdated")(linksUpdated)
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(lockChanged)
    if (nodesUpdated != null) __obj.updateDynamic("nodesUpdated")(nodesUpdated)
    if (offsetUpdated != null) __obj.updateDynamic("offsetUpdated")(offsetUpdated)
    if (zoomUpdated != null) __obj.updateDynamic("zoomUpdated")(zoomUpdated)
    __obj.asInstanceOf[DiagramListener]
  }
}

