package typings.stormDashReactDashDiagrams.distSrcModelsDiagramModelMod

import typings.stormDashReactDashDiagrams.Anon_IsCreated
import typings.stormDashReactDashDiagrams.Anon_IsCreatedLink
import typings.stormDashReactDashDiagrams.Anon_Locked
import typings.stormDashReactDashDiagrams.Anon_OffsetX
import typings.stormDashReactDashDiagrams.Anon_Size
import typings.stormDashReactDashDiagrams.Anon_Zoom
import typings.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseEvent
import typings.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramListener
  extends BaseListener[js.Any] {
  var gridUpdated: js.UndefOr[js.Function1[/* event */ BaseEvent[DiagramModel] with Anon_Size, Unit]] = js.undefined
  var linksUpdated: js.UndefOr[js.Function1[/* event */ BaseEvent[_] with Anon_IsCreatedLink, Unit]] = js.undefined
  var nodesUpdated: js.UndefOr[js.Function1[/* event */ BaseEvent[_] with Anon_IsCreated, Unit]] = js.undefined
  var offsetUpdated: js.UndefOr[js.Function1[/* event */ BaseEvent[DiagramModel] with Anon_OffsetX, Unit]] = js.undefined
  var zoomUpdated: js.UndefOr[js.Function1[/* event */ BaseEvent[DiagramModel] with Anon_Zoom, Unit]] = js.undefined
}

object DiagramListener {
  @scala.inline
  def apply(
    gridUpdated: /* event */ BaseEvent[DiagramModel] with Anon_Size => Unit = null,
    linksUpdated: /* event */ BaseEvent[_] with Anon_IsCreatedLink => Unit = null,
    lockChanged: /* event */ BaseEvent[js.Any] with Anon_Locked => Unit = null,
    nodesUpdated: /* event */ BaseEvent[_] with Anon_IsCreated => Unit = null,
    offsetUpdated: /* event */ BaseEvent[DiagramModel] with Anon_OffsetX => Unit = null,
    zoomUpdated: /* event */ BaseEvent[DiagramModel] with Anon_Zoom => Unit = null
  ): DiagramListener = {
    val __obj = js.Dynamic.literal()
    if (gridUpdated != null) __obj.updateDynamic("gridUpdated")(js.Any.fromFunction1(gridUpdated))
    if (linksUpdated != null) __obj.updateDynamic("linksUpdated")(js.Any.fromFunction1(linksUpdated))
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(js.Any.fromFunction1(lockChanged))
    if (nodesUpdated != null) __obj.updateDynamic("nodesUpdated")(js.Any.fromFunction1(nodesUpdated))
    if (offsetUpdated != null) __obj.updateDynamic("offsetUpdated")(js.Any.fromFunction1(offsetUpdated))
    if (zoomUpdated != null) __obj.updateDynamic("zoomUpdated")(js.Any.fromFunction1(zoomUpdated))
    __obj.asInstanceOf[DiagramListener]
  }
}

