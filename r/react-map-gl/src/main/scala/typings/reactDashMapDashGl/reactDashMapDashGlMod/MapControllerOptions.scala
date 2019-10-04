package typings.reactDashMapDashGl.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapControllerOptions extends js.Object {
  var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
  var dragPan: js.UndefOr[Boolean] = js.undefined
  var dragRotate: js.UndefOr[Boolean] = js.undefined
  var eventManager: js.UndefOr[js.Any] = js.undefined
  var isInteractive: Boolean
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var onStateChange: js.UndefOr[js.Function1[/* state */ MapState, Unit]] = js.undefined
  var onViewportChange: js.UndefOr[ContextViewportChangeHandler] = js.undefined
  var scrollZoom: js.UndefOr[Boolean] = js.undefined
  var touchRotate: js.UndefOr[Boolean] = js.undefined
  var touchZoom: js.UndefOr[Boolean] = js.undefined
}

object MapControllerOptions {
  @scala.inline
  def apply(
    isInteractive: Boolean,
    doubleClickZoom: js.UndefOr[Boolean] = js.undefined,
    dragPan: js.UndefOr[Boolean] = js.undefined,
    dragRotate: js.UndefOr[Boolean] = js.undefined,
    eventManager: js.Any = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    onStateChange: /* state */ MapState => Unit = null,
    onViewportChange: ContextViewportChangeHandler = null,
    scrollZoom: js.UndefOr[Boolean] = js.undefined,
    touchRotate: js.UndefOr[Boolean] = js.undefined,
    touchZoom: js.UndefOr[Boolean] = js.undefined
  ): MapControllerOptions = {
    val __obj = js.Dynamic.literal(isInteractive = isInteractive)
    if (!js.isUndefined(doubleClickZoom)) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom)
    if (!js.isUndefined(dragPan)) __obj.updateDynamic("dragPan")(dragPan)
    if (!js.isUndefined(dragRotate)) __obj.updateDynamic("dragRotate")(dragRotate)
    if (eventManager != null) __obj.updateDynamic("eventManager")(eventManager)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(onViewportChange)
    if (!js.isUndefined(scrollZoom)) __obj.updateDynamic("scrollZoom")(scrollZoom)
    if (!js.isUndefined(touchRotate)) __obj.updateDynamic("touchRotate")(touchRotate)
    if (!js.isUndefined(touchZoom)) __obj.updateDynamic("touchZoom")(touchZoom)
    __obj.asInstanceOf[MapControllerOptions]
  }
}

