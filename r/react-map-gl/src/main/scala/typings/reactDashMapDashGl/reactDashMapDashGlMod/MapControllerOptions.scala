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
    onViewportChange: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Unit = null,
    scrollZoom: js.UndefOr[Boolean] = js.undefined,
    touchRotate: js.UndefOr[Boolean] = js.undefined,
    touchZoom: js.UndefOr[Boolean] = js.undefined
  ): MapControllerOptions = {
    val __obj = js.Dynamic.literal(isInteractive = isInteractive.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleClickZoom)) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(dragPan)) __obj.updateDynamic("dragPan")(dragPan.asInstanceOf[js.Any])
    if (!js.isUndefined(dragRotate)) __obj.updateDynamic("dragRotate")(dragRotate.asInstanceOf[js.Any])
    if (eventManager != null) __obj.updateDynamic("eventManager")(eventManager.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(js.Any.fromFunction3(onViewportChange))
    if (!js.isUndefined(scrollZoom)) __obj.updateDynamic("scrollZoom")(scrollZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(touchRotate)) __obj.updateDynamic("touchRotate")(touchRotate.asInstanceOf[js.Any])
    if (!js.isUndefined(touchZoom)) __obj.updateDynamic("touchZoom")(touchZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapControllerOptions]
  }
}

