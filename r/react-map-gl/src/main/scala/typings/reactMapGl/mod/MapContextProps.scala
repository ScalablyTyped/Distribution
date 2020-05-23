package typings.reactMapGl.mod

import typings.mapboxGl.mod.Map
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapContextProps extends js.Object {
  var eventManager: js.UndefOr[EventManager] = js.undefined
  var isDragging: Boolean
  var map: js.UndefOr[Map] = js.undefined
  var mapContainer: HTMLElement | Null
  var onViewStateChange: js.UndefOr[ContextViewStateChangeHandler] = js.undefined
  var onViewportChange: js.UndefOr[ContextViewportChangeHandler] = js.undefined
  var viewport: js.UndefOr[typings.viewportMercatorProject.mod.default] = js.undefined
}

object MapContextProps {
  @scala.inline
  def apply(
    isDragging: Boolean,
    eventManager: EventManager = null,
    map: Map = null,
    mapContainer: HTMLElement = null,
    onViewStateChange: /* info */ ContextViewStateChangeInfo => Unit = null,
    onViewportChange: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Unit = null,
    viewport: typings.viewportMercatorProject.mod.default = null
  ): MapContextProps = {
    val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any], mapContainer = mapContainer.asInstanceOf[js.Any])
    if (eventManager != null) __obj.updateDynamic("eventManager")(eventManager.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (onViewStateChange != null) __obj.updateDynamic("onViewStateChange")(js.Any.fromFunction1(onViewStateChange))
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(js.Any.fromFunction3(onViewportChange))
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapContextProps]
  }
}

