package typings.reactMapGl.mod

import typings.mapboxGl.mod.Map
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapContextProps extends js.Object {
  var eventManager: js.UndefOr[EventManager] = js.native
  var isDragging: Boolean = js.native
  var map: js.UndefOr[Map] = js.native
  var mapContainer: HTMLElement | Null = js.native
  var onViewStateChange: js.UndefOr[ContextViewStateChangeHandler] = js.native
  var onViewportChange: js.UndefOr[ContextViewportChangeHandler] = js.native
  var viewport: js.UndefOr[typings.viewportMercatorProject.mod.default] = js.native
}

object MapContextProps {
  @scala.inline
  def apply(isDragging: Boolean): MapContextProps = {
    val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapContextProps]
  }
  @scala.inline
  implicit class MapContextPropsOps[Self <: MapContextProps] (val x: Self) extends AnyVal {
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
    def setIsDragging(value: Boolean): Self = this.set("isDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventManager(value: EventManager): Self = this.set("eventManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventManager: Self = this.set("eventManager", js.undefined)
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMapContainer(value: HTMLElement): Self = this.set("mapContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapContainerNull: Self = this.set("mapContainer", null)
    @scala.inline
    def setOnViewStateChange(value: /* info */ ContextViewStateChangeInfo => Unit): Self = this.set("onViewStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnViewStateChange: Self = this.set("onViewStateChange", js.undefined)
    @scala.inline
    def setOnViewportChange(
      value: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Unit
    ): Self = this.set("onViewportChange", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnViewportChange: Self = this.set("onViewportChange", js.undefined)
    @scala.inline
    def setViewport(value: typings.viewportMercatorProject.mod.default): Self = this.set("viewport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
  }
  
}

