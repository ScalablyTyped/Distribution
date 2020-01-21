package typings.stormReactDiagrams.diagramModelMod

import typings.stormReactDiagrams.AnonIsCreated
import typings.stormReactDiagrams.AnonIsCreatedLink
import typings.stormReactDiagrams.AnonLocked
import typings.stormReactDiagrams.AnonOffsetX
import typings.stormReactDiagrams.AnonSize
import typings.stormReactDiagrams.AnonZoom
import typings.stormReactDiagrams.baseEntityMod.BaseEvent
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramListener
  extends BaseListener[js.Any] {
  var gridUpdated: js.UndefOr[js.Function1[/* event */ BaseEvent[DiagramModel] with AnonSize, Unit]] = js.undefined
  var linksUpdated: js.UndefOr[js.Function1[/* event */ BaseEvent[_] with AnonIsCreatedLink, Unit]] = js.undefined
  var nodesUpdated: js.UndefOr[js.Function1[/* event */ BaseEvent[_] with AnonIsCreated, Unit]] = js.undefined
  var offsetUpdated: js.UndefOr[js.Function1[/* event */ BaseEvent[DiagramModel] with AnonOffsetX, Unit]] = js.undefined
  var zoomUpdated: js.UndefOr[js.Function1[/* event */ BaseEvent[DiagramModel] with AnonZoom, Unit]] = js.undefined
}

object DiagramListener {
  @scala.inline
  def apply(
    gridUpdated: /* event */ BaseEvent[DiagramModel] with AnonSize => Unit = null,
    linksUpdated: /* event */ BaseEvent[_] with AnonIsCreatedLink => Unit = null,
    lockChanged: /* event */ BaseEvent[js.Any] with AnonLocked => Unit = null,
    nodesUpdated: /* event */ BaseEvent[_] with AnonIsCreated => Unit = null,
    offsetUpdated: /* event */ BaseEvent[DiagramModel] with AnonOffsetX => Unit = null,
    zoomUpdated: /* event */ BaseEvent[DiagramModel] with AnonZoom => Unit = null
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

