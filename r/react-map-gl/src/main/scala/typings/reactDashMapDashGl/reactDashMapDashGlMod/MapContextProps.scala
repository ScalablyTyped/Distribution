package typings.reactDashMapDashGl.reactDashMapDashGlMod

import typings.mapboxDashGl.mapboxDashGlMod.Map
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
  var viewport: js.UndefOr[
    typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod.default
  ] = js.undefined
}

object MapContextProps {
  @scala.inline
  def apply(
    isDragging: Boolean,
    eventManager: EventManager = null,
    map: Map = null,
    mapContainer: HTMLElement = null,
    onViewStateChange: ContextViewStateChangeHandler = null,
    onViewportChange: ContextViewportChangeHandler = null,
    viewport: typings.viewportDashMercatorDashProject.viewportDashMercatorDashProjectMod.default = null
  ): MapContextProps = {
    val __obj = js.Dynamic.literal(isDragging = isDragging)
    if (eventManager != null) __obj.updateDynamic("eventManager")(eventManager)
    if (map != null) __obj.updateDynamic("map")(map)
    if (mapContainer != null) __obj.updateDynamic("mapContainer")(mapContainer)
    if (onViewStateChange != null) __obj.updateDynamic("onViewStateChange")(onViewStateChange)
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(onViewportChange)
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[MapContextProps]
  }
}

