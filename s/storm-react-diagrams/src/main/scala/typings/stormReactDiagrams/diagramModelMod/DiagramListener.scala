package typings.stormReactDiagrams.diagramModelMod

import typings.stormReactDiagrams.anon.BaseEventDiagramModeloffs
import typings.stormReactDiagrams.anon.BaseEventDiagramModelsize
import typings.stormReactDiagrams.anon.BaseEventDiagramModelzoom
import typings.stormReactDiagrams.anon.BaseEventanylinkLinkModel
import typings.stormReactDiagrams.anon.BaseEventanynodeNodeModel
import typings.stormReactDiagrams.anon.Locked
import typings.stormReactDiagrams.baseEntityMod.BaseEvent
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramListener
  extends BaseListener[js.Any] {
  var gridUpdated: js.UndefOr[js.Function1[/* event */ BaseEventDiagramModelsize, Unit]] = js.undefined
  var linksUpdated: js.UndefOr[js.Function1[/* event */ BaseEventanylinkLinkModel, Unit]] = js.undefined
  var nodesUpdated: js.UndefOr[js.Function1[/* event */ BaseEventanynodeNodeModel, Unit]] = js.undefined
  var offsetUpdated: js.UndefOr[js.Function1[/* event */ BaseEventDiagramModeloffs, Unit]] = js.undefined
  var zoomUpdated: js.UndefOr[js.Function1[/* event */ BaseEventDiagramModelzoom, Unit]] = js.undefined
}

object DiagramListener {
  @scala.inline
  def apply(
    gridUpdated: /* event */ BaseEventDiagramModelsize => Unit = null,
    linksUpdated: /* event */ BaseEventanylinkLinkModel => Unit = null,
    lockChanged: /* event */ BaseEvent[js.Any] with Locked => Unit = null,
    nodesUpdated: /* event */ BaseEventanynodeNodeModel => Unit = null,
    offsetUpdated: /* event */ BaseEventDiagramModeloffs => Unit = null,
    zoomUpdated: /* event */ BaseEventDiagramModelzoom => Unit = null
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

