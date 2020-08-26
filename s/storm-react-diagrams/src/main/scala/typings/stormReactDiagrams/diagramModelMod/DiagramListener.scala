package typings.stormReactDiagrams.diagramModelMod

import typings.stormReactDiagrams.anon.BaseEventDiagramModeloffs
import typings.stormReactDiagrams.anon.BaseEventDiagramModelsize
import typings.stormReactDiagrams.anon.BaseEventDiagramModelzoom
import typings.stormReactDiagrams.anon.BaseEventanylinkLinkModel
import typings.stormReactDiagrams.anon.BaseEventanynodeNodeModel
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramListener
  extends BaseListener[js.Any] {
  var gridUpdated: js.UndefOr[js.Function1[/* event */ BaseEventDiagramModelsize, Unit]] = js.native
  var linksUpdated: js.UndefOr[js.Function1[/* event */ BaseEventanylinkLinkModel, Unit]] = js.native
  var nodesUpdated: js.UndefOr[js.Function1[/* event */ BaseEventanynodeNodeModel, Unit]] = js.native
  var offsetUpdated: js.UndefOr[js.Function1[/* event */ BaseEventDiagramModeloffs, Unit]] = js.native
  var zoomUpdated: js.UndefOr[js.Function1[/* event */ BaseEventDiagramModelzoom, Unit]] = js.native
}

object DiagramListener {
  @scala.inline
  def apply(): DiagramListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramListener]
  }
  @scala.inline
  implicit class DiagramListenerOps[Self <: DiagramListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGridUpdated(value: /* event */ BaseEventDiagramModelsize => Unit): Self = this.set("gridUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGridUpdated: Self = this.set("gridUpdated", js.undefined)
    @scala.inline
    def setLinksUpdated(value: /* event */ BaseEventanylinkLinkModel => Unit): Self = this.set("linksUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLinksUpdated: Self = this.set("linksUpdated", js.undefined)
    @scala.inline
    def setNodesUpdated(value: /* event */ BaseEventanynodeNodeModel => Unit): Self = this.set("nodesUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNodesUpdated: Self = this.set("nodesUpdated", js.undefined)
    @scala.inline
    def setOffsetUpdated(value: /* event */ BaseEventDiagramModeloffs => Unit): Self = this.set("offsetUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOffsetUpdated: Self = this.set("offsetUpdated", js.undefined)
    @scala.inline
    def setZoomUpdated(value: /* event */ BaseEventDiagramModelzoom => Unit): Self = this.set("zoomUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoomUpdated: Self = this.set("zoomUpdated", js.undefined)
  }
  
}

