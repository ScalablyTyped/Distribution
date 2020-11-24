package typings.reactEventListener.mod

import typings.std.BeforeUnloadEvent
import typings.std.DeviceMotionEvent
import typings.std.DeviceOrientationEvent
import typings.std.DragEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.HashChangeEvent
import typings.std.KeyboardEvent
import typings.std.MSGestureEvent
import typings.std.MSPointerEvent
import typings.std.MessageEvent
import typings.std.MouseEvent
import typings.std.PageTransitionEvent
import typings.std.PointerEvent
import typings.std.PopStateEvent
import typings.std.ProgressEvent
import typings.std.StorageEvent
import typings.std.TouchEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventListenerProps[T /* <: EventTarget | WindowEventTargets */] extends js.Object {
  
  var oNmsPointerUp: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]
  ] = js.native
  
  var oNmsPointerUpCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]
  ] = js.native
  
  var onAbort: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onAbortCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onAfterPrint: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onAfterPrintCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onBeforePrint: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onBeforePrintCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onBeforeUnload: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ BeforeUnloadEvent, _]
  ] = js.native
  
  var onBeforeUnloadCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ BeforeUnloadEvent, _]
  ] = js.native
  
  var onBlur: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, _]] = js.native
  
  var onBlurCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, _]] = js.native
  
  var onCanPlay: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onCanPlayCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onCanPlayThrough: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onCanPlayThroughCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onClick: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onClickCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onCompassNeedsCalibration: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onCompassNeedsCalibrationCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onContextMenu: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onContextMenuCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onDblClick: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onDblClickCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onDeviceMotion: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceMotionEvent, _]
  ] = js.native
  
  var onDeviceMotionCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceMotionEvent, _]
  ] = js.native
  
  var onDeviceOrientation: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceOrientationEvent, _]
  ] = js.native
  
  var onDeviceOrientationCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceOrientationEvent, _]
  ] = js.native
  
  var onDrag: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]] = js.native
  
  var onDragCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]] = js.native
  
  var onDragEnd: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]] = js.native
  
  var onDragEndCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]] = js.native
  
  var onDragEnter: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]] = js.native
  
  var onDragEnterCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]] = js.native
  
  var onDragLeave: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]] = js.native
  
  var onDragLeaveCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]] = js.native
  
  var onDragOver: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]] = js.native
  
  var onDragOverCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]] = js.native
  
  var onDragStart: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]] = js.native
  
  var onDragStartCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]] = js.native
  
  var onDrop: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]] = js.native
  
  var onDropCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]] = js.native
  
  var onDurationChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onDurationChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onEmptied: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onEmptiedCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onEnded: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onEndedCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onError: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* args */ OnErrorEventHandlerArgs, _]
  ] = js.native
  
  var onErrorCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* args */ OnErrorEventHandlerArgs, _]
  ] = js.native
  
  var onFocus: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, _]] = js.native
  
  var onFocusCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, _]] = js.native
  
  var onHashChange: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ HashChangeEvent, _]
  ] = js.native
  
  var onHashChangeCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ HashChangeEvent, _]
  ] = js.native
  
  var onInput: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onInputCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onKeyDown: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]] = js.native
  
  var onKeyDownCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]] = js.native
  
  var onKeyPress: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]] = js.native
  
  var onKeyPressCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]] = js.native
  
  var onKeyUp: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]] = js.native
  
  var onKeyUpCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]] = js.native
  
  var onLoad: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onLoadCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onLoadStart: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onLoadStartCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onLoadedData: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onLoadedDataCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onLoadedMetadata: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onLoadedMetadataCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onMessage: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MessageEvent[_], _]
  ] = js.native
  
  var onMessageCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MessageEvent[_], _]
  ] = js.native
  
  var onMouseDown: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onMouseDownCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onMouseEnter: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onMouseEnterCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onMouseLeave: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onMouseLeaveCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onMouseMove: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onMouseMoveCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onMouseOut: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onMouseOutCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onMouseOver: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onMouseOverCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onMouseUp: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onMouseUpCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]] = js.native
  
  var onMouseWheel: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, _]] = js.native
  
  var onMouseWheelCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, _]] = js.native
  
  var onMsGestureChange: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]
  ] = js.native
  
  var onMsGestureChangeCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]
  ] = js.native
  
  var onMsGestureDoubleTap: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]
  ] = js.native
  
  var onMsGestureDoubleTapCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]
  ] = js.native
  
  var onMsGestureEnd: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]
  ] = js.native
  
  var onMsGestureEndCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]
  ] = js.native
  
  var onMsGestureHold: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]
  ] = js.native
  
  var onMsGestureHoldCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]
  ] = js.native
  
  var onMsGestureStart: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]
  ] = js.native
  
  var onMsGestureStartCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]
  ] = js.native
  
  var onMsGestureTap: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]
  ] = js.native
  
  var onMsGestureTapCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]
  ] = js.native
  
  var onMsInertiaStart: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]
  ] = js.native
  
  var onMsInertiaStartCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]
  ] = js.native
  
  var onMsPointerCancel: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]
  ] = js.native
  
  var onMsPointerCancelCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]
  ] = js.native
  
  var onMsPointerDown: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]
  ] = js.native
  
  var onMsPointerDownCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]
  ] = js.native
  
  var onMsPointerEnter: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]
  ] = js.native
  
  var onMsPointerEnterCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]
  ] = js.native
  
  var onMsPointerLeave: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]
  ] = js.native
  
  var onMsPointerLeaveCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]
  ] = js.native
  
  var onMsPointerMove: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]
  ] = js.native
  
  var onMsPointerMoveCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]
  ] = js.native
  
  var onMsPointerOut: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]
  ] = js.native
  
  var onMsPointerOutCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]
  ] = js.native
  
  var onMsPointerOver: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]
  ] = js.native
  
  var onMsPointerOverCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]
  ] = js.native
  
  var onOffline: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onOfflineCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onOnline: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onOnlineCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onOrientationChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onOrientationChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onPageHide: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, _]
  ] = js.native
  
  var onPageHideCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, _]
  ] = js.native
  
  var onPageShow: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, _]
  ] = js.native
  
  var onPageShowCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, _]
  ] = js.native
  
  var onPause: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onPauseCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onPlay: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onPlayCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onPlaying: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onPlayingCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  // Global events
  var onPointerCancel: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onPointerCancelCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onPointerDown: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onPointerDownCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onPointerEnter: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onPointerEnterCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onPointerLeave: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onPointerLeaveCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onPointerMove: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onPointerMoveCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onPointerOut: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onPointerOutCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onPointerOver: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onPointerOverCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onPointerUp: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onPointerUpCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]] = js.native
  
  var onPopState: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PopStateEvent, _]] = js.native
  
  var onPopStateCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PopStateEvent, _]] = js.native
  
  var onProgress: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], _]
  ] = js.native
  
  var onProgressCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], _]
  ] = js.native
  
  var onRateChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onRateChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onReadyStateChange: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], _]
  ] = js.native
  
  var onReadyStateChangeCapture: js.UndefOr[
    js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], _]
  ] = js.native
  
  var onReset: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onResetCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onResize: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]] = js.native
  
  var onResizeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]] = js.native
  
  var onScroll: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]] = js.native
  
  var onScrollCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]] = js.native
  
  var onSeeked: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onSeekedCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onSeeking: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onSeekingCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onSelect: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]] = js.native
  
  var onSelectCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]] = js.native
  
  var onSelectionChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onSelectionChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onStalled: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onStalledCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onStorage: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ StorageEvent, _]] = js.native
  
  var onStorageCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ StorageEvent, _]] = js.native
  
  var onSubmit: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onSubmitCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onSuspend: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onSuspendCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onTimeUpdate: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onTimeUpdateCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onTouchCancel: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]] = js.native
  
  var onTouchCancelCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]] = js.native
  
  var onTouchEnd: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]] = js.native
  
  var onTouchEndCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]] = js.native
  
  var onTouchMove: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]] = js.native
  
  var onTouchMoveCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]] = js.native
  
  var onTouchStart: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]] = js.native
  
  var onTouchStartCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]] = js.native
  
  var onUnload: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onUnloadCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onVolumeChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onVolumeChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onWaiting: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onWaitingCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]] = js.native
  
  var onWheel: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, _]] = js.native
  
  var onWheelCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, _]] = js.native
  
  /**
    * Target (window or document)
    */
  var target: T = js.native
}
object EventListenerProps {
  
  @scala.inline
  def apply[T /* <: EventTarget | WindowEventTargets */](target: T): EventListenerProps[T] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListenerProps[T]]
  }
  
  @scala.inline
  implicit class EventListenerPropsOps[Self <: EventListenerProps[_], T /* <: EventTarget | WindowEventTargets */] (val x: Self with EventListenerProps[T]) extends AnyVal {
    
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
    def setTarget(value: T): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setONmsPointerUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): Self = this.set("oNmsPointerUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteONmsPointerUp: Self = this.set("oNmsPointerUp", js.undefined)
    
    @scala.inline
    def setONmsPointerUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): Self = this.set("oNmsPointerUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteONmsPointerUpCapture: Self = this.set("oNmsPointerUpCapture", js.undefined)
    
    @scala.inline
    def setOnAbort(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    
    @scala.inline
    def setOnAbortCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onAbortCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAbortCapture: Self = this.set("onAbortCapture", js.undefined)
    
    @scala.inline
    def setOnAfterPrint(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onAfterPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAfterPrint: Self = this.set("onAfterPrint", js.undefined)
    
    @scala.inline
    def setOnAfterPrintCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onAfterPrintCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAfterPrintCapture: Self = this.set("onAfterPrintCapture", js.undefined)
    
    @scala.inline
    def setOnBeforePrint(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onBeforePrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBeforePrint: Self = this.set("onBeforePrint", js.undefined)
    
    @scala.inline
    def setOnBeforePrintCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onBeforePrintCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBeforePrintCapture: Self = this.set("onBeforePrintCapture", js.undefined)
    
    @scala.inline
    def setOnBeforeUnload(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ BeforeUnloadEvent, _]): Self = this.set("onBeforeUnload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBeforeUnload: Self = this.set("onBeforeUnload", js.undefined)
    
    @scala.inline
    def setOnBeforeUnloadCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ BeforeUnloadEvent, _]): Self = this.set("onBeforeUnloadCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBeforeUnloadCapture: Self = this.set("onBeforeUnloadCapture", js.undefined)
    
    @scala.inline
    def setOnBlur(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, _]): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnBlurCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, _]): Self = this.set("onBlurCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlurCapture: Self = this.set("onBlurCapture", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onCanPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    
    @scala.inline
    def setOnCanPlayCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onCanPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCanPlayCapture: Self = this.set("onCanPlayCapture", js.undefined)
    
    @scala.inline
    def setOnCanPlayThrough(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onCanPlayThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnCanPlayThroughCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCanPlayThroughCapture: Self = this.set("onCanPlayThroughCapture", js.undefined)
    
    @scala.inline
    def setOnChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChangeCapture: Self = this.set("onChangeCapture", js.undefined)
    
    @scala.inline
    def setOnClick(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnClickCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClickCapture: Self = this.set("onClickCapture", js.undefined)
    
    @scala.inline
    def setOnCompassNeedsCalibration(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onCompassNeedsCalibration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompassNeedsCalibration: Self = this.set("onCompassNeedsCalibration", js.undefined)
    
    @scala.inline
    def setOnCompassNeedsCalibrationCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onCompassNeedsCalibrationCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCompassNeedsCalibrationCapture: Self = this.set("onCompassNeedsCalibrationCapture", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnContextMenuCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onContextMenuCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnContextMenuCapture: Self = this.set("onContextMenuCapture", js.undefined)
    
    @scala.inline
    def setOnDblClick(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onDblClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDblClick: Self = this.set("onDblClick", js.undefined)
    
    @scala.inline
    def setOnDblClickCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onDblClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDblClickCapture: Self = this.set("onDblClickCapture", js.undefined)
    
    @scala.inline
    def setOnDeviceMotion(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceMotionEvent, _]): Self = this.set("onDeviceMotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDeviceMotion: Self = this.set("onDeviceMotion", js.undefined)
    
    @scala.inline
    def setOnDeviceMotionCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceMotionEvent, _]): Self = this.set("onDeviceMotionCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDeviceMotionCapture: Self = this.set("onDeviceMotionCapture", js.undefined)
    
    @scala.inline
    def setOnDeviceOrientation(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceOrientationEvent, _]): Self = this.set("onDeviceOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDeviceOrientation: Self = this.set("onDeviceOrientation", js.undefined)
    
    @scala.inline
    def setOnDeviceOrientationCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceOrientationEvent, _]): Self = this.set("onDeviceOrientationCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDeviceOrientationCapture: Self = this.set("onDeviceOrientationCapture", js.undefined)
    
    @scala.inline
    def setOnDrag(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): Self = this.set("onDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    
    @scala.inline
    def setOnDragCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): Self = this.set("onDragCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragCapture: Self = this.set("onDragCapture", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): Self = this.set("onDragEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEndCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): Self = this.set("onDragEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEndCapture: Self = this.set("onDragEndCapture", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): Self = this.set("onDragEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): Self = this.set("onDragEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragEnterCapture: Self = this.set("onDragEnterCapture", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): Self = this.set("onDragLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): Self = this.set("onDragLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragLeaveCapture: Self = this.set("onDragLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): Self = this.set("onDragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): Self = this.set("onDragOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragOverCapture: Self = this.set("onDragOverCapture", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): Self = this.set("onDragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): Self = this.set("onDragStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDragStartCapture: Self = this.set("onDragStartCapture", js.undefined)
    
    @scala.inline
    def setOnDrop(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): Self = this.set("onDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    
    @scala.inline
    def setOnDropCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): Self = this.set("onDropCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDropCapture: Self = this.set("onDropCapture", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onDurationChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    
    @scala.inline
    def setOnDurationChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onDurationChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDurationChangeCapture: Self = this.set("onDurationChangeCapture", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onEmptied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    
    @scala.inline
    def setOnEmptiedCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onEmptiedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEmptiedCapture: Self = this.set("onEmptiedCapture", js.undefined)
    
    @scala.inline
    def setOnEnded(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    
    @scala.inline
    def setOnEndedCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onEndedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEndedCapture: Self = this.set("onEndedCapture", js.undefined)
    
    @scala.inline
    def setOnError(
      value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* args */ OnErrorEventHandlerArgs, _]
    ): Self = this.set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnErrorCapture(
      value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* args */ OnErrorEventHandlerArgs, _]
    ): Self = this.set("onErrorCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnErrorCapture: Self = this.set("onErrorCapture", js.undefined)
    
    @scala.inline
    def setOnFocus(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, _]): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnFocusCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, _]): Self = this.set("onFocusCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFocusCapture: Self = this.set("onFocusCapture", js.undefined)
    
    @scala.inline
    def setOnHashChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ HashChangeEvent, _]): Self = this.set("onHashChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHashChange: Self = this.set("onHashChange", js.undefined)
    
    @scala.inline
    def setOnHashChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ HashChangeEvent, _]): Self = this.set("onHashChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHashChangeCapture: Self = this.set("onHashChangeCapture", js.undefined)
    
    @scala.inline
    def setOnInput(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    
    @scala.inline
    def setOnInputCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onInputCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnInputCapture: Self = this.set("onInputCapture", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]): Self = this.set("onKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]): Self = this.set("onKeyDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyDownCapture: Self = this.set("onKeyDownCapture", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]): Self = this.set("onKeyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyPressCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]): Self = this.set("onKeyPressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyPressCapture: Self = this.set("onKeyPressCapture", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]): Self = this.set("onKeyUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setOnKeyUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]): Self = this.set("onKeyUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyUpCapture: Self = this.set("onKeyUpCapture", js.undefined)
    
    @scala.inline
    def setOnLoad(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onLoadCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadCapture: Self = this.set("onLoadCapture", js.undefined)
    
    @scala.inline
    def setOnLoadStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onLoadStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onLoadStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadStartCapture: Self = this.set("onLoadStartCapture", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onLoadedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedDataCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onLoadedDataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadedDataCapture: Self = this.set("onLoadedDataCapture", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onLoadedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadataCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoadedMetadataCapture: Self = this.set("onLoadedMetadataCapture", js.undefined)
    
    @scala.inline
    def setOnMessage(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MessageEvent[_], _]): Self = this.set("onMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMessage: Self = this.set("onMessage", js.undefined)
    
    @scala.inline
    def setOnMessageCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MessageEvent[_], _]): Self = this.set("onMessageCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMessageCapture: Self = this.set("onMessageCapture", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onMouseDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseDownCapture: Self = this.set("onMouseDownCapture", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onMouseEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseEnterCapture: Self = this.set("onMouseEnterCapture", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onMouseLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseLeaveCapture: Self = this.set("onMouseLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onMouseMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseMoveCapture: Self = this.set("onMouseMoveCapture", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOutCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onMouseOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseOutCapture: Self = this.set("onMouseOutCapture", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onMouseOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseOverCapture: Self = this.set("onMouseOverCapture", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onMouseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setOnMouseUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): Self = this.set("onMouseUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseUpCapture: Self = this.set("onMouseUpCapture", js.undefined)
    
    @scala.inline
    def setOnMouseWheel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, _]): Self = this.set("onMouseWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseWheel: Self = this.set("onMouseWheel", js.undefined)
    
    @scala.inline
    def setOnMouseWheelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, _]): Self = this.set("onMouseWheelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMouseWheelCapture: Self = this.set("onMouseWheelCapture", js.undefined)
    
    @scala.inline
    def setOnMsGestureChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): Self = this.set("onMsGestureChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsGestureChange: Self = this.set("onMsGestureChange", js.undefined)
    
    @scala.inline
    def setOnMsGestureChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): Self = this.set("onMsGestureChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsGestureChangeCapture: Self = this.set("onMsGestureChangeCapture", js.undefined)
    
    @scala.inline
    def setOnMsGestureDoubleTap(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): Self = this.set("onMsGestureDoubleTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsGestureDoubleTap: Self = this.set("onMsGestureDoubleTap", js.undefined)
    
    @scala.inline
    def setOnMsGestureDoubleTapCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): Self = this.set("onMsGestureDoubleTapCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsGestureDoubleTapCapture: Self = this.set("onMsGestureDoubleTapCapture", js.undefined)
    
    @scala.inline
    def setOnMsGestureEnd(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): Self = this.set("onMsGestureEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsGestureEnd: Self = this.set("onMsGestureEnd", js.undefined)
    
    @scala.inline
    def setOnMsGestureEndCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): Self = this.set("onMsGestureEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsGestureEndCapture: Self = this.set("onMsGestureEndCapture", js.undefined)
    
    @scala.inline
    def setOnMsGestureHold(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): Self = this.set("onMsGestureHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsGestureHold: Self = this.set("onMsGestureHold", js.undefined)
    
    @scala.inline
    def setOnMsGestureHoldCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): Self = this.set("onMsGestureHoldCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsGestureHoldCapture: Self = this.set("onMsGestureHoldCapture", js.undefined)
    
    @scala.inline
    def setOnMsGestureStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): Self = this.set("onMsGestureStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsGestureStart: Self = this.set("onMsGestureStart", js.undefined)
    
    @scala.inline
    def setOnMsGestureStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): Self = this.set("onMsGestureStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsGestureStartCapture: Self = this.set("onMsGestureStartCapture", js.undefined)
    
    @scala.inline
    def setOnMsGestureTap(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): Self = this.set("onMsGestureTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsGestureTap: Self = this.set("onMsGestureTap", js.undefined)
    
    @scala.inline
    def setOnMsGestureTapCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): Self = this.set("onMsGestureTapCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsGestureTapCapture: Self = this.set("onMsGestureTapCapture", js.undefined)
    
    @scala.inline
    def setOnMsInertiaStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): Self = this.set("onMsInertiaStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsInertiaStart: Self = this.set("onMsInertiaStart", js.undefined)
    
    @scala.inline
    def setOnMsInertiaStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): Self = this.set("onMsInertiaStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsInertiaStartCapture: Self = this.set("onMsInertiaStartCapture", js.undefined)
    
    @scala.inline
    def setOnMsPointerCancel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): Self = this.set("onMsPointerCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsPointerCancel: Self = this.set("onMsPointerCancel", js.undefined)
    
    @scala.inline
    def setOnMsPointerCancelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): Self = this.set("onMsPointerCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsPointerCancelCapture: Self = this.set("onMsPointerCancelCapture", js.undefined)
    
    @scala.inline
    def setOnMsPointerDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): Self = this.set("onMsPointerDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsPointerDown: Self = this.set("onMsPointerDown", js.undefined)
    
    @scala.inline
    def setOnMsPointerDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): Self = this.set("onMsPointerDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsPointerDownCapture: Self = this.set("onMsPointerDownCapture", js.undefined)
    
    @scala.inline
    def setOnMsPointerEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): Self = this.set("onMsPointerEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsPointerEnter: Self = this.set("onMsPointerEnter", js.undefined)
    
    @scala.inline
    def setOnMsPointerEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): Self = this.set("onMsPointerEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsPointerEnterCapture: Self = this.set("onMsPointerEnterCapture", js.undefined)
    
    @scala.inline
    def setOnMsPointerLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): Self = this.set("onMsPointerLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsPointerLeave: Self = this.set("onMsPointerLeave", js.undefined)
    
    @scala.inline
    def setOnMsPointerLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): Self = this.set("onMsPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsPointerLeaveCapture: Self = this.set("onMsPointerLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnMsPointerMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): Self = this.set("onMsPointerMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsPointerMove: Self = this.set("onMsPointerMove", js.undefined)
    
    @scala.inline
    def setOnMsPointerMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): Self = this.set("onMsPointerMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsPointerMoveCapture: Self = this.set("onMsPointerMoveCapture", js.undefined)
    
    @scala.inline
    def setOnMsPointerOut(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): Self = this.set("onMsPointerOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsPointerOut: Self = this.set("onMsPointerOut", js.undefined)
    
    @scala.inline
    def setOnMsPointerOutCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): Self = this.set("onMsPointerOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsPointerOutCapture: Self = this.set("onMsPointerOutCapture", js.undefined)
    
    @scala.inline
    def setOnMsPointerOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): Self = this.set("onMsPointerOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsPointerOver: Self = this.set("onMsPointerOver", js.undefined)
    
    @scala.inline
    def setOnMsPointerOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): Self = this.set("onMsPointerOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMsPointerOverCapture: Self = this.set("onMsPointerOverCapture", js.undefined)
    
    @scala.inline
    def setOnOffline(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onOffline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOffline: Self = this.set("onOffline", js.undefined)
    
    @scala.inline
    def setOnOfflineCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onOfflineCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOfflineCapture: Self = this.set("onOfflineCapture", js.undefined)
    
    @scala.inline
    def setOnOnline(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOnline: Self = this.set("onOnline", js.undefined)
    
    @scala.inline
    def setOnOnlineCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onOnlineCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOnlineCapture: Self = this.set("onOnlineCapture", js.undefined)
    
    @scala.inline
    def setOnOrientationChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onOrientationChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOrientationChange: Self = this.set("onOrientationChange", js.undefined)
    
    @scala.inline
    def setOnOrientationChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onOrientationChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnOrientationChangeCapture: Self = this.set("onOrientationChangeCapture", js.undefined)
    
    @scala.inline
    def setOnPageHide(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, _]): Self = this.set("onPageHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPageHide: Self = this.set("onPageHide", js.undefined)
    
    @scala.inline
    def setOnPageHideCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, _]): Self = this.set("onPageHideCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPageHideCapture: Self = this.set("onPageHideCapture", js.undefined)
    
    @scala.inline
    def setOnPageShow(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, _]): Self = this.set("onPageShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPageShow: Self = this.set("onPageShow", js.undefined)
    
    @scala.inline
    def setOnPageShowCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, _]): Self = this.set("onPageShowCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPageShowCapture: Self = this.set("onPageShowCapture", js.undefined)
    
    @scala.inline
    def setOnPause(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    
    @scala.inline
    def setOnPauseCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onPauseCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPauseCapture: Self = this.set("onPauseCapture", js.undefined)
    
    @scala.inline
    def setOnPlay(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    
    @scala.inline
    def setOnPlayCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPlayCapture: Self = this.set("onPlayCapture", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onPlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    
    @scala.inline
    def setOnPlayingCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onPlayingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPlayingCapture: Self = this.set("onPlayingCapture", js.undefined)
    
    @scala.inline
    def setOnPointerCancel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onPointerCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    
    @scala.inline
    def setOnPointerCancelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerCancelCapture: Self = this.set("onPointerCancelCapture", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onPointerDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onPointerDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerDownCapture: Self = this.set("onPointerDownCapture", js.undefined)
    
    @scala.inline
    def setOnPointerEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onPointerEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    
    @scala.inline
    def setOnPointerEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerEnterCapture: Self = this.set("onPointerEnterCapture", js.undefined)
    
    @scala.inline
    def setOnPointerLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onPointerLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    
    @scala.inline
    def setOnPointerLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerLeaveCapture: Self = this.set("onPointerLeaveCapture", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onPointerMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerMoveCapture: Self = this.set("onPointerMoveCapture", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onPointerOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOutCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onPointerOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerOutCapture: Self = this.set("onPointerOutCapture", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onPointerOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onPointerOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerOverCapture: Self = this.set("onPointerOverCapture", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onPointerUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    
    @scala.inline
    def setOnPointerUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): Self = this.set("onPointerUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPointerUpCapture: Self = this.set("onPointerUpCapture", js.undefined)
    
    @scala.inline
    def setOnPopState(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PopStateEvent, _]): Self = this.set("onPopState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPopState: Self = this.set("onPopState", js.undefined)
    
    @scala.inline
    def setOnPopStateCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PopStateEvent, _]): Self = this.set("onPopStateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPopStateCapture: Self = this.set("onPopStateCapture", js.undefined)
    
    @scala.inline
    def setOnProgress(
      value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], _]
    ): Self = this.set("onProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnProgressCapture(
      value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], _]
    ): Self = this.set("onProgressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnProgressCapture: Self = this.set("onProgressCapture", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onRateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    
    @scala.inline
    def setOnRateChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onRateChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRateChangeCapture: Self = this.set("onRateChangeCapture", js.undefined)
    
    @scala.inline
    def setOnReadyStateChange(
      value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], _]
    ): Self = this.set("onReadyStateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnReadyStateChange: Self = this.set("onReadyStateChange", js.undefined)
    
    @scala.inline
    def setOnReadyStateChangeCapture(
      value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], _]
    ): Self = this.set("onReadyStateChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnReadyStateChangeCapture: Self = this.set("onReadyStateChangeCapture", js.undefined)
    
    @scala.inline
    def setOnReset(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    
    @scala.inline
    def setOnResetCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onResetCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResetCapture: Self = this.set("onResetCapture", js.undefined)
    
    @scala.inline
    def setOnResize(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]): Self = this.set("onResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setOnResizeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]): Self = this.set("onResizeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResizeCapture: Self = this.set("onResizeCapture", js.undefined)
    
    @scala.inline
    def setOnScroll(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]): Self = this.set("onScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnScrollCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]): Self = this.set("onScrollCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScrollCapture: Self = this.set("onScrollCapture", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onSeeked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeekedCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onSeekedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeekedCapture: Self = this.set("onSeekedCapture", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onSeeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    
    @scala.inline
    def setOnSeekingCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onSeekingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeekingCapture: Self = this.set("onSeekingCapture", js.undefined)
    
    @scala.inline
    def setOnSelect(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnSelectCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]): Self = this.set("onSelectCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelectCapture: Self = this.set("onSelectCapture", js.undefined)
    
    @scala.inline
    def setOnSelectionChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onSelectionChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    
    @scala.inline
    def setOnSelectionChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onSelectionChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelectionChangeCapture: Self = this.set("onSelectionChangeCapture", js.undefined)
    
    @scala.inline
    def setOnStalled(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onStalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    
    @scala.inline
    def setOnStalledCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onStalledCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStalledCapture: Self = this.set("onStalledCapture", js.undefined)
    
    @scala.inline
    def setOnStorage(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ StorageEvent, _]): Self = this.set("onStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStorage: Self = this.set("onStorage", js.undefined)
    
    @scala.inline
    def setOnStorageCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ StorageEvent, _]): Self = this.set("onStorageCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStorageCapture: Self = this.set("onStorageCapture", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setOnSubmitCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onSubmitCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSubmitCapture: Self = this.set("onSubmitCapture", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onSuspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    
    @scala.inline
    def setOnSuspendCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onSuspendCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSuspendCapture: Self = this.set("onSuspendCapture", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onTimeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTimeUpdateCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTimeUpdateCapture: Self = this.set("onTimeUpdateCapture", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]): Self = this.set("onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchCancelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]): Self = this.set("onTouchCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchCancelCapture: Self = this.set("onTouchCancelCapture", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]): Self = this.set("onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchEndCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]): Self = this.set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchEndCapture: Self = this.set("onTouchEndCapture", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]): Self = this.set("onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]): Self = this.set("onTouchMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchMoveCapture: Self = this.set("onTouchMoveCapture", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]): Self = this.set("onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTouchStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]): Self = this.set("onTouchStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchStartCapture: Self = this.set("onTouchStartCapture", js.undefined)
    
    @scala.inline
    def setOnUnload(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onUnload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUnload: Self = this.set("onUnload", js.undefined)
    
    @scala.inline
    def setOnUnloadCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onUnloadCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUnloadCapture: Self = this.set("onUnloadCapture", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onVolumeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnVolumeChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnVolumeChangeCapture: Self = this.set("onVolumeChangeCapture", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onWaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    
    @scala.inline
    def setOnWaitingCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): Self = this.set("onWaitingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWaitingCapture: Self = this.set("onWaitingCapture", js.undefined)
    
    @scala.inline
    def setOnWheel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, _]): Self = this.set("onWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    
    @scala.inline
    def setOnWheelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, _]): Self = this.set("onWheelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnWheelCapture: Self = this.set("onWheelCapture", js.undefined)
  }
}
