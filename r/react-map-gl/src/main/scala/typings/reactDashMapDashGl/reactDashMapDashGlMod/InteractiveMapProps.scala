package typings.reactDashMapDashGl.reactDashMapDashGlMod

import typings.reactDashMapDashGl.Anon_Height
import typings.reactDashMapDashGl.Anon_MaxPitch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractiveMapProps extends StaticMapProps {
  var clickRadius: js.UndefOr[Double] = js.undefined
  var controller: js.UndefOr[MapController] = js.undefined
  var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
  var dragPan: js.UndefOr[Boolean] = js.undefined
  var dragRotate: js.UndefOr[Boolean] = js.undefined
  var getCursor: js.UndefOr[js.Function1[/* state */ ExtraState, Unit]] = js.undefined
  var interactiveLayerIds: js.UndefOr[js.Array[String]] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var maxPitch: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minPitch: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onDblClick: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onInteractionStateChange: js.UndefOr[js.Function1[/* state */ ExtraState, Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onMouseOut: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onMouseUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onNativeClick: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onTouchMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitionInterrupt: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onViewStateChange: js.UndefOr[ContextViewStateChangeHandler] = js.undefined
  var onViewportChange: js.UndefOr[ContextViewportChangeHandler] = js.undefined
  var onWheel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var scrollZoom: js.UndefOr[Boolean] = js.undefined
  var touchAction: js.UndefOr[String] = js.undefined
  var touchRotate: js.UndefOr[Boolean] = js.undefined
  var touchZoom: js.UndefOr[Boolean] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
  var transitionEasing: js.UndefOr[EasingFunction] = js.undefined
  var transitionInterpolator: js.UndefOr[TransitionInterpolator] = js.undefined
  var transitionInterruption: js.UndefOr[TRANSITION_EVENTS] = js.undefined
}

object InteractiveMapProps {
  @scala.inline
  def apply(
    height: Double | String,
    width: Double | String,
    attributionControl: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    clickRadius: Int | Double = null,
    container: js.Object = null,
    controller: MapController = null,
    disableTokenWarning: js.UndefOr[Boolean] = js.undefined,
    doubleClickZoom: js.UndefOr[Boolean] = js.undefined,
    dragPan: js.UndefOr[Boolean] = js.undefined,
    dragRotate: js.UndefOr[Boolean] = js.undefined,
    getCursor: /* state */ ExtraState => Unit = null,
    gl: js.Object = null,
    interactiveLayerIds: js.Array[String] = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    mapOptions: js.Object = null,
    mapStyle: String | js.Object = null,
    mapboxApiAccessToken: String = null,
    maxPitch: Int | Double = null,
    maxZoom: Int | Double = null,
    minPitch: Int | Double = null,
    minZoom: Int | Double = null,
    onClick: /* event */ PointerEvent => Unit = null,
    onContextMenu: /* event */ PointerEvent => Unit = null,
    onDblClick: /* event */ PointerEvent => Unit = null,
    onError: /* e */ MapError => Unit = null,
    onHover: /* event */ PointerEvent => Unit = null,
    onInteractionStateChange: /* state */ ExtraState => Unit = null,
    onLoad: /* event */ MapLoadEvent => Unit = null,
    onMouseDown: /* event */ PointerEvent => Unit = null,
    onMouseEnter: /* event */ PointerEvent => Unit = null,
    onMouseLeave: /* event */ PointerEvent => Unit = null,
    onMouseMove: /* event */ PointerEvent => Unit = null,
    onMouseOut: /* event */ PointerEvent => Unit = null,
    onMouseUp: /* event */ PointerEvent => Unit = null,
    onNativeClick: /* event */ PointerEvent => Unit = null,
    onResize: /* dimensions */ Anon_Height => Unit = null,
    onTouchEnd: /* event */ PointerEvent => Unit = null,
    onTouchMove: /* event */ PointerEvent => Unit = null,
    onTouchStart: /* event */ PointerEvent => Unit = null,
    onTransitionEnd: () => Unit = null,
    onTransitionInterrupt: () => Unit = null,
    onTransitionStart: () => Unit = null,
    onViewStateChange: /* info */ ContextViewStateChangeInfo => Unit = null,
    onViewportChange: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Unit = null,
    onWheel: /* event */ PointerEvent => Unit = null,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
    preventStyleDiffing: js.UndefOr[Boolean] = js.undefined,
    reuseMap: js.UndefOr[Boolean] = js.undefined,
    reuseMaps: js.UndefOr[Boolean] = js.undefined,
    scrollZoom: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    touchAction: String = null,
    touchRotate: js.UndefOr[Boolean] = js.undefined,
    touchZoom: js.UndefOr[Boolean] = js.undefined,
    transformRequest: (/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String]) => MapRequest = null,
    transitionDuration: Int | Double = null,
    transitionEasing: /* t */ Double => Double = null,
    transitionInterpolator: TransitionInterpolator = null,
    transitionInterruption: TRANSITION_EVENTS = null,
    viewState: ViewState = null,
    visibilityConstraints: Anon_MaxPitch = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): InteractiveMapProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl)
    if (className != null) __obj.updateDynamic("className")(className)
    if (clickRadius != null) __obj.updateDynamic("clickRadius")(clickRadius.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (!js.isUndefined(disableTokenWarning)) __obj.updateDynamic("disableTokenWarning")(disableTokenWarning)
    if (!js.isUndefined(doubleClickZoom)) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom)
    if (!js.isUndefined(dragPan)) __obj.updateDynamic("dragPan")(dragPan)
    if (!js.isUndefined(dragRotate)) __obj.updateDynamic("dragRotate")(dragRotate)
    if (getCursor != null) __obj.updateDynamic("getCursor")(js.Any.fromFunction1(getCursor))
    if (gl != null) __obj.updateDynamic("gl")(gl)
    if (interactiveLayerIds != null) __obj.updateDynamic("interactiveLayerIds")(interactiveLayerIds)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions)
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle.asInstanceOf[js.Any])
    if (mapboxApiAccessToken != null) __obj.updateDynamic("mapboxApiAccessToken")(mapboxApiAccessToken)
    if (maxPitch != null) __obj.updateDynamic("maxPitch")(maxPitch.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minPitch != null) __obj.updateDynamic("minPitch")(minPitch.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1(onDblClick))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    if (onInteractionStateChange != null) __obj.updateDynamic("onInteractionStateChange")(js.Any.fromFunction1(onInteractionStateChange))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onNativeClick != null) __obj.updateDynamic("onNativeClick")(js.Any.fromFunction1(onNativeClick))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction0(onTransitionEnd))
    if (onTransitionInterrupt != null) __obj.updateDynamic("onTransitionInterrupt")(js.Any.fromFunction0(onTransitionInterrupt))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction0(onTransitionStart))
    if (onViewStateChange != null) __obj.updateDynamic("onViewStateChange")(js.Any.fromFunction1(onViewStateChange))
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(js.Any.fromFunction3(onViewportChange))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer)
    if (!js.isUndefined(preventStyleDiffing)) __obj.updateDynamic("preventStyleDiffing")(preventStyleDiffing)
    if (!js.isUndefined(reuseMap)) __obj.updateDynamic("reuseMap")(reuseMap)
    if (!js.isUndefined(reuseMaps)) __obj.updateDynamic("reuseMaps")(reuseMaps)
    if (!js.isUndefined(scrollZoom)) __obj.updateDynamic("scrollZoom")(scrollZoom)
    if (style != null) __obj.updateDynamic("style")(style)
    if (touchAction != null) __obj.updateDynamic("touchAction")(touchAction)
    if (!js.isUndefined(touchRotate)) __obj.updateDynamic("touchRotate")(touchRotate)
    if (!js.isUndefined(touchZoom)) __obj.updateDynamic("touchZoom")(touchZoom)
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction2(transformRequest))
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEasing != null) __obj.updateDynamic("transitionEasing")(js.Any.fromFunction1(transitionEasing))
    if (transitionInterpolator != null) __obj.updateDynamic("transitionInterpolator")(transitionInterpolator)
    if (transitionInterruption != null) __obj.updateDynamic("transitionInterruption")(transitionInterruption)
    if (viewState != null) __obj.updateDynamic("viewState")(viewState)
    if (visibilityConstraints != null) __obj.updateDynamic("visibilityConstraints")(visibilityConstraints)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[InteractiveMapProps]
  }
}

