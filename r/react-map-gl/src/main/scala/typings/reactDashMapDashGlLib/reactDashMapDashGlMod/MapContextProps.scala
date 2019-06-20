package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapContextProps extends js.Object {
  var eventManager: js.UndefOr[EventManager] = js.undefined
  var isDragging: scala.Boolean
  var map: js.UndefOr[mapboxDashGlLib.mapboxDashGlMod.Map] = js.undefined
  var mapContainer: stdLib.HTMLElement | scala.Null
  var onViewStateChange: js.UndefOr[ViewStateChangeHandler] = js.undefined
  var onViewportChange: js.UndefOr[ViewportChangeHandler] = js.undefined
  var viewport: js.UndefOr[viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.default] = js.undefined
}

object MapContextProps {
  @scala.inline
  def apply(
    isDragging: scala.Boolean,
    eventManager: EventManager = null,
    map: mapboxDashGlLib.mapboxDashGlMod.Map = null,
    mapContainer: stdLib.HTMLElement = null,
    onViewStateChange: ViewStateChangeHandler = null,
    onViewportChange: ViewportChangeHandler = null,
    viewport: viewportDashMercatorDashProjectLib.viewportDashMercatorDashProjectMod.default = null
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

