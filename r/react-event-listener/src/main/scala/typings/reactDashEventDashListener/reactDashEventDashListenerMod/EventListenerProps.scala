package typings.reactDashEventDashListener.reactDashEventDashListenerMod

import typings.std.BeforeUnloadEvent
import typings.std.DeviceMotionEvent
import typings.std.DeviceOrientationEvent
import typings.std.Document
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
import typings.std.UIEvent
import typings.std.WheelEvent
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListenerProps extends js.Object {
  var oNmsPointerUp: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.undefined
  var oNmsPointerUpCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.undefined
  var onAbort: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onAbortCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onAfterPrint: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onAfterPrintCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onBeforePrint: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onBeforePrintCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onBeforeUnload: js.UndefOr[js.Function1[/* ev */ BeforeUnloadEvent, _]] = js.undefined
  var onBeforeUnloadCapture: js.UndefOr[js.Function1[/* ev */ BeforeUnloadEvent, _]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* ev */ FocusEvent, _]] = js.undefined
  var onBlurCapture: js.UndefOr[js.Function1[/* ev */ FocusEvent, _]] = js.undefined
  var onCanPlay: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onCanPlayCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onCanPlayThrough: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onCanPlayThroughCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onChangeCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onClickCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onCompassNeedsCalibration: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onCompassNeedsCalibrationCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onContextMenuCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onDblClick: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onDblClickCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onDeviceMotion: js.UndefOr[js.Function1[/* ev */ DeviceMotionEvent, _]] = js.undefined
  var onDeviceMotionCapture: js.UndefOr[js.Function1[/* ev */ DeviceMotionEvent, _]] = js.undefined
  var onDeviceOrientation: js.UndefOr[js.Function1[/* ev */ DeviceOrientationEvent, _]] = js.undefined
  var onDeviceOrientationCapture: js.UndefOr[js.Function1[/* ev */ DeviceOrientationEvent, _]] = js.undefined
  var onDrag: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.undefined
  var onDragCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.undefined
  var onDragEndCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.undefined
  var onDragEnter: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.undefined
  var onDragEnterCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.undefined
  var onDragLeave: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.undefined
  var onDragLeaveCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.undefined
  var onDragOver: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.undefined
  var onDragOverCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.undefined
  var onDragStartCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.undefined
  var onDrop: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.undefined
  var onDropCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.undefined
  var onDurationChange: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onDurationChangeCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onEmptied: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onEmptiedCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onEnded: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onEndedCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onError: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any
  ] = js.undefined
  var onErrorCapture: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any
  ] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* ev */ FocusEvent, _]] = js.undefined
  var onFocusCapture: js.UndefOr[js.Function1[/* ev */ FocusEvent, _]] = js.undefined
  var onHashChange: js.UndefOr[js.Function1[/* ev */ HashChangeEvent, _]] = js.undefined
  var onHashChangeCapture: js.UndefOr[js.Function1[/* ev */ HashChangeEvent, _]] = js.undefined
  var onInput: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onInputCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.undefined
  var onKeyDownCapture: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.undefined
  var onKeyPress: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.undefined
  var onKeyPressCapture: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.undefined
  var onKeyUp: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.undefined
  var onKeyUpCapture: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onLoadCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onLoadStart: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onLoadStartCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onLoadedData: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onLoadedDataCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onLoadedMetadata: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onLoadedMetadataCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onMessage: js.UndefOr[js.Function1[/* ev */ MessageEvent, _]] = js.undefined
  var onMessageCapture: js.UndefOr[js.Function1[/* ev */ MessageEvent, _]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onMouseDownCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onMouseEnterCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onMouseLeaveCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onMouseMoveCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onMouseOut: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onMouseOutCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onMouseOver: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onMouseOverCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onMouseUp: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onMouseUpCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.undefined
  var onMouseWheel: js.UndefOr[js.Function1[/* ev */ WheelEvent, _]] = js.undefined
  var onMouseWheelCapture: js.UndefOr[js.Function1[/* ev */ WheelEvent, _]] = js.undefined
  var onMsGestureChange: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.undefined
  var onMsGestureChangeCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.undefined
  var onMsGestureDoubleTap: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.undefined
  var onMsGestureDoubleTapCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.undefined
  var onMsGestureEnd: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.undefined
  var onMsGestureEndCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.undefined
  var onMsGestureHold: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.undefined
  var onMsGestureHoldCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.undefined
  var onMsGestureStart: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.undefined
  var onMsGestureStartCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.undefined
  var onMsGestureTap: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.undefined
  var onMsGestureTapCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.undefined
  var onMsInertiaStart: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.undefined
  var onMsInertiaStartCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.undefined
  var onMsPointerCancel: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.undefined
  var onMsPointerCancelCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.undefined
  var onMsPointerDown: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.undefined
  var onMsPointerDownCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.undefined
  var onMsPointerEnter: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.undefined
  var onMsPointerEnterCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.undefined
  var onMsPointerLeave: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.undefined
  var onMsPointerLeaveCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.undefined
  var onMsPointerMove: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.undefined
  var onMsPointerMoveCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.undefined
  var onMsPointerOut: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.undefined
  var onMsPointerOutCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.undefined
  var onMsPointerOver: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.undefined
  var onMsPointerOverCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.undefined
  var onOffline: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onOfflineCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onOnline: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onOnlineCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onOrientationChange: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onOrientationChangeCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onPageHide: js.UndefOr[js.Function1[/* ev */ PageTransitionEvent, _]] = js.undefined
  var onPageHideCapture: js.UndefOr[js.Function1[/* ev */ PageTransitionEvent, _]] = js.undefined
  var onPageShow: js.UndefOr[js.Function1[/* ev */ PageTransitionEvent, _]] = js.undefined
  var onPageShowCapture: js.UndefOr[js.Function1[/* ev */ PageTransitionEvent, _]] = js.undefined
  var onPause: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onPauseCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onPlay: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onPlayCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onPlaying: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onPlayingCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  // Global events
  var onPointerCancel: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onPointerCancelCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onPointerDown: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onPointerDownCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onPointerEnter: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onPointerEnterCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onPointerLeave: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onPointerLeaveCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onPointerMove: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onPointerMoveCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onPointerOut: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onPointerOutCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onPointerOver: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onPointerOverCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onPointerUp: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onPointerUpCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.undefined
  var onPopState: js.UndefOr[js.Function1[/* ev */ PopStateEvent, _]] = js.undefined
  var onPopStateCapture: js.UndefOr[js.Function1[/* ev */ PopStateEvent, _]] = js.undefined
  var onProgress: js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], _]] = js.undefined
  var onProgressCapture: js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], _]] = js.undefined
  var onRateChange: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onRateChangeCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onReadyStateChange: js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], _]] = js.undefined
  var onReadyStateChangeCapture: js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], _]] = js.undefined
  var onReset: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onResetCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onResize: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.undefined
  var onResizeCapture: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.undefined
  var onScroll: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.undefined
  var onScrollCapture: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.undefined
  var onSeeked: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onSeekedCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onSeeking: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onSeekingCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.undefined
  var onSelectCapture: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onSelectionChangeCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onStalled: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onStalledCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onStorage: js.UndefOr[js.Function1[/* ev */ StorageEvent, _]] = js.undefined
  var onStorageCapture: js.UndefOr[js.Function1[/* ev */ StorageEvent, _]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onSubmitCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onSuspend: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onSuspendCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onTimeUpdate: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onTimeUpdateCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onTouchCancel: js.UndefOr[js.Any] = js.undefined
  var onTouchCancelCapture: js.UndefOr[js.Any] = js.undefined
  var onTouchEnd: js.UndefOr[js.Any] = js.undefined
  var onTouchEndCapture: js.UndefOr[js.Any] = js.undefined
  var onTouchMove: js.UndefOr[js.Any] = js.undefined
  var onTouchMoveCapture: js.UndefOr[js.Any] = js.undefined
  var onTouchStart: js.UndefOr[js.Any] = js.undefined
  var onTouchStartCapture: js.UndefOr[js.Any] = js.undefined
  var onUnload: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onUnloadCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onVolumeChange: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onVolumeChangeCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onWaiting: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onWaitingCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.undefined
  var onWheel: js.UndefOr[js.Function1[/* ev */ WheelEvent, _]] = js.undefined
  var onWheelCapture: js.UndefOr[js.Function1[/* ev */ WheelEvent, _]] = js.undefined
  /**
    * Target (window or document)
    */
  var target: Window | Document | String
}

object EventListenerProps {
  @scala.inline
  def apply(
    target: Window | Document | String,
    oNmsPointerUp: /* ev */ MSPointerEvent => _ = null,
    oNmsPointerUpCapture: /* ev */ MSPointerEvent => _ = null,
    onAbort: /* ev */ Event => _ = null,
    onAbortCapture: /* ev */ Event => _ = null,
    onAfterPrint: /* ev */ Event => _ = null,
    onAfterPrintCapture: /* ev */ Event => _ = null,
    onBeforePrint: /* ev */ Event => _ = null,
    onBeforePrintCapture: /* ev */ Event => _ = null,
    onBeforeUnload: /* ev */ BeforeUnloadEvent => _ = null,
    onBeforeUnloadCapture: /* ev */ BeforeUnloadEvent => _ = null,
    onBlur: /* ev */ FocusEvent => _ = null,
    onBlurCapture: /* ev */ FocusEvent => _ = null,
    onCanPlay: /* ev */ Event => _ = null,
    onCanPlayCapture: /* ev */ Event => _ = null,
    onCanPlayThrough: /* ev */ Event => _ = null,
    onCanPlayThroughCapture: /* ev */ Event => _ = null,
    onChange: /* ev */ Event => _ = null,
    onChangeCapture: /* ev */ Event => _ = null,
    onClick: /* ev */ MouseEvent => _ = null,
    onClickCapture: /* ev */ MouseEvent => _ = null,
    onCompassNeedsCalibration: /* ev */ Event => _ = null,
    onCompassNeedsCalibrationCapture: /* ev */ Event => _ = null,
    onContextMenu: /* ev */ PointerEvent => _ = null,
    onContextMenuCapture: /* ev */ PointerEvent => _ = null,
    onDblClick: /* ev */ MouseEvent => _ = null,
    onDblClickCapture: /* ev */ MouseEvent => _ = null,
    onDeviceMotion: /* ev */ DeviceMotionEvent => _ = null,
    onDeviceMotionCapture: /* ev */ DeviceMotionEvent => _ = null,
    onDeviceOrientation: /* ev */ DeviceOrientationEvent => _ = null,
    onDeviceOrientationCapture: /* ev */ DeviceOrientationEvent => _ = null,
    onDrag: /* ev */ DragEvent => _ = null,
    onDragCapture: /* ev */ DragEvent => _ = null,
    onDragEnd: /* ev */ DragEvent => _ = null,
    onDragEndCapture: /* ev */ DragEvent => _ = null,
    onDragEnter: /* ev */ DragEvent => _ = null,
    onDragEnterCapture: /* ev */ DragEvent => _ = null,
    onDragLeave: /* ev */ DragEvent => _ = null,
    onDragLeaveCapture: /* ev */ DragEvent => _ = null,
    onDragOver: /* ev */ DragEvent => _ = null,
    onDragOverCapture: /* ev */ DragEvent => _ = null,
    onDragStart: /* ev */ DragEvent => _ = null,
    onDragStartCapture: /* ev */ DragEvent => _ = null,
    onDrop: /* ev */ DragEvent => _ = null,
    onDropCapture: /* ev */ DragEvent => _ = null,
    onDurationChange: /* ev */ Event => _ = null,
    onDurationChangeCapture: /* ev */ Event => _ = null,
    onEmptied: /* ev */ Event => _ = null,
    onEmptiedCapture: /* ev */ Event => _ = null,
    onEnded: /* ev */ Event => _ = null,
    onEndedCapture: /* ev */ Event => _ = null,
    onError: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any = null,
    onErrorCapture: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any = null,
    onFocus: /* ev */ FocusEvent => _ = null,
    onFocusCapture: /* ev */ FocusEvent => _ = null,
    onHashChange: /* ev */ HashChangeEvent => _ = null,
    onHashChangeCapture: /* ev */ HashChangeEvent => _ = null,
    onInput: /* ev */ Event => _ = null,
    onInputCapture: /* ev */ Event => _ = null,
    onKeyDown: /* ev */ KeyboardEvent => _ = null,
    onKeyDownCapture: /* ev */ KeyboardEvent => _ = null,
    onKeyPress: /* ev */ KeyboardEvent => _ = null,
    onKeyPressCapture: /* ev */ KeyboardEvent => _ = null,
    onKeyUp: /* ev */ KeyboardEvent => _ = null,
    onKeyUpCapture: /* ev */ KeyboardEvent => _ = null,
    onLoad: /* ev */ Event => _ = null,
    onLoadCapture: /* ev */ Event => _ = null,
    onLoadStart: /* ev */ Event => _ = null,
    onLoadStartCapture: /* ev */ Event => _ = null,
    onLoadedData: /* ev */ Event => _ = null,
    onLoadedDataCapture: /* ev */ Event => _ = null,
    onLoadedMetadata: /* ev */ Event => _ = null,
    onLoadedMetadataCapture: /* ev */ Event => _ = null,
    onMessage: /* ev */ MessageEvent => _ = null,
    onMessageCapture: /* ev */ MessageEvent => _ = null,
    onMouseDown: /* ev */ MouseEvent => _ = null,
    onMouseDownCapture: /* ev */ MouseEvent => _ = null,
    onMouseEnter: /* ev */ MouseEvent => _ = null,
    onMouseEnterCapture: /* ev */ MouseEvent => _ = null,
    onMouseLeave: /* ev */ MouseEvent => _ = null,
    onMouseLeaveCapture: /* ev */ MouseEvent => _ = null,
    onMouseMove: /* ev */ MouseEvent => _ = null,
    onMouseMoveCapture: /* ev */ MouseEvent => _ = null,
    onMouseOut: /* ev */ MouseEvent => _ = null,
    onMouseOutCapture: /* ev */ MouseEvent => _ = null,
    onMouseOver: /* ev */ MouseEvent => _ = null,
    onMouseOverCapture: /* ev */ MouseEvent => _ = null,
    onMouseUp: /* ev */ MouseEvent => _ = null,
    onMouseUpCapture: /* ev */ MouseEvent => _ = null,
    onMouseWheel: /* ev */ WheelEvent => _ = null,
    onMouseWheelCapture: /* ev */ WheelEvent => _ = null,
    onMsGestureChange: /* ev */ MSGestureEvent => _ = null,
    onMsGestureChangeCapture: /* ev */ MSGestureEvent => _ = null,
    onMsGestureDoubleTap: /* ev */ MSGestureEvent => _ = null,
    onMsGestureDoubleTapCapture: /* ev */ MSGestureEvent => _ = null,
    onMsGestureEnd: /* ev */ MSGestureEvent => _ = null,
    onMsGestureEndCapture: /* ev */ MSGestureEvent => _ = null,
    onMsGestureHold: /* ev */ MSGestureEvent => _ = null,
    onMsGestureHoldCapture: /* ev */ MSGestureEvent => _ = null,
    onMsGestureStart: /* ev */ MSGestureEvent => _ = null,
    onMsGestureStartCapture: /* ev */ MSGestureEvent => _ = null,
    onMsGestureTap: /* ev */ MSGestureEvent => _ = null,
    onMsGestureTapCapture: /* ev */ MSGestureEvent => _ = null,
    onMsInertiaStart: /* ev */ MSGestureEvent => _ = null,
    onMsInertiaStartCapture: /* ev */ MSGestureEvent => _ = null,
    onMsPointerCancel: /* ev */ MSPointerEvent => _ = null,
    onMsPointerCancelCapture: /* ev */ MSPointerEvent => _ = null,
    onMsPointerDown: /* ev */ MSPointerEvent => _ = null,
    onMsPointerDownCapture: /* ev */ MSPointerEvent => _ = null,
    onMsPointerEnter: /* ev */ MSPointerEvent => _ = null,
    onMsPointerEnterCapture: /* ev */ MSPointerEvent => _ = null,
    onMsPointerLeave: /* ev */ MSPointerEvent => _ = null,
    onMsPointerLeaveCapture: /* ev */ MSPointerEvent => _ = null,
    onMsPointerMove: /* ev */ MSPointerEvent => _ = null,
    onMsPointerMoveCapture: /* ev */ MSPointerEvent => _ = null,
    onMsPointerOut: /* ev */ MSPointerEvent => _ = null,
    onMsPointerOutCapture: /* ev */ MSPointerEvent => _ = null,
    onMsPointerOver: /* ev */ MSPointerEvent => _ = null,
    onMsPointerOverCapture: /* ev */ MSPointerEvent => _ = null,
    onOffline: /* ev */ Event => _ = null,
    onOfflineCapture: /* ev */ Event => _ = null,
    onOnline: /* ev */ Event => _ = null,
    onOnlineCapture: /* ev */ Event => _ = null,
    onOrientationChange: /* ev */ Event => _ = null,
    onOrientationChangeCapture: /* ev */ Event => _ = null,
    onPageHide: /* ev */ PageTransitionEvent => _ = null,
    onPageHideCapture: /* ev */ PageTransitionEvent => _ = null,
    onPageShow: /* ev */ PageTransitionEvent => _ = null,
    onPageShowCapture: /* ev */ PageTransitionEvent => _ = null,
    onPause: /* ev */ Event => _ = null,
    onPauseCapture: /* ev */ Event => _ = null,
    onPlay: /* ev */ Event => _ = null,
    onPlayCapture: /* ev */ Event => _ = null,
    onPlaying: /* ev */ Event => _ = null,
    onPlayingCapture: /* ev */ Event => _ = null,
    onPointerCancel: /* ev */ PointerEvent => _ = null,
    onPointerCancelCapture: /* ev */ PointerEvent => _ = null,
    onPointerDown: /* ev */ PointerEvent => _ = null,
    onPointerDownCapture: /* ev */ PointerEvent => _ = null,
    onPointerEnter: /* ev */ PointerEvent => _ = null,
    onPointerEnterCapture: /* ev */ PointerEvent => _ = null,
    onPointerLeave: /* ev */ PointerEvent => _ = null,
    onPointerLeaveCapture: /* ev */ PointerEvent => _ = null,
    onPointerMove: /* ev */ PointerEvent => _ = null,
    onPointerMoveCapture: /* ev */ PointerEvent => _ = null,
    onPointerOut: /* ev */ PointerEvent => _ = null,
    onPointerOutCapture: /* ev */ PointerEvent => _ = null,
    onPointerOver: /* ev */ PointerEvent => _ = null,
    onPointerOverCapture: /* ev */ PointerEvent => _ = null,
    onPointerUp: /* ev */ PointerEvent => _ = null,
    onPointerUpCapture: /* ev */ PointerEvent => _ = null,
    onPopState: /* ev */ PopStateEvent => _ = null,
    onPopStateCapture: /* ev */ PopStateEvent => _ = null,
    onProgress: /* ev */ ProgressEvent[EventTarget] => _ = null,
    onProgressCapture: /* ev */ ProgressEvent[EventTarget] => _ = null,
    onRateChange: /* ev */ Event => _ = null,
    onRateChangeCapture: /* ev */ Event => _ = null,
    onReadyStateChange: /* ev */ ProgressEvent[EventTarget] => _ = null,
    onReadyStateChangeCapture: /* ev */ ProgressEvent[EventTarget] => _ = null,
    onReset: /* ev */ Event => _ = null,
    onResetCapture: /* ev */ Event => _ = null,
    onResize: /* ev */ UIEvent => _ = null,
    onResizeCapture: /* ev */ UIEvent => _ = null,
    onScroll: /* ev */ UIEvent => _ = null,
    onScrollCapture: /* ev */ UIEvent => _ = null,
    onSeeked: /* ev */ Event => _ = null,
    onSeekedCapture: /* ev */ Event => _ = null,
    onSeeking: /* ev */ Event => _ = null,
    onSeekingCapture: /* ev */ Event => _ = null,
    onSelect: /* ev */ UIEvent => _ = null,
    onSelectCapture: /* ev */ UIEvent => _ = null,
    onSelectionChange: /* ev */ Event => _ = null,
    onSelectionChangeCapture: /* ev */ Event => _ = null,
    onStalled: /* ev */ Event => _ = null,
    onStalledCapture: /* ev */ Event => _ = null,
    onStorage: /* ev */ StorageEvent => _ = null,
    onStorageCapture: /* ev */ StorageEvent => _ = null,
    onSubmit: /* ev */ Event => _ = null,
    onSubmitCapture: /* ev */ Event => _ = null,
    onSuspend: /* ev */ Event => _ = null,
    onSuspendCapture: /* ev */ Event => _ = null,
    onTimeUpdate: /* ev */ Event => _ = null,
    onTimeUpdateCapture: /* ev */ Event => _ = null,
    onTouchCancel: js.Any = null,
    onTouchCancelCapture: js.Any = null,
    onTouchEnd: js.Any = null,
    onTouchEndCapture: js.Any = null,
    onTouchMove: js.Any = null,
    onTouchMoveCapture: js.Any = null,
    onTouchStart: js.Any = null,
    onTouchStartCapture: js.Any = null,
    onUnload: /* ev */ Event => _ = null,
    onUnloadCapture: /* ev */ Event => _ = null,
    onVolumeChange: /* ev */ Event => _ = null,
    onVolumeChangeCapture: /* ev */ Event => _ = null,
    onWaiting: /* ev */ Event => _ = null,
    onWaitingCapture: /* ev */ Event => _ = null,
    onWheel: /* ev */ WheelEvent => _ = null,
    onWheelCapture: /* ev */ WheelEvent => _ = null
  ): EventListenerProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (oNmsPointerUp != null) __obj.updateDynamic("oNmsPointerUp")(js.Any.fromFunction1(oNmsPointerUp))
    if (oNmsPointerUpCapture != null) __obj.updateDynamic("oNmsPointerUpCapture")(js.Any.fromFunction1(oNmsPointerUpCapture))
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAbortCapture != null) __obj.updateDynamic("onAbortCapture")(js.Any.fromFunction1(onAbortCapture))
    if (onAfterPrint != null) __obj.updateDynamic("onAfterPrint")(js.Any.fromFunction1(onAfterPrint))
    if (onAfterPrintCapture != null) __obj.updateDynamic("onAfterPrintCapture")(js.Any.fromFunction1(onAfterPrintCapture))
    if (onBeforePrint != null) __obj.updateDynamic("onBeforePrint")(js.Any.fromFunction1(onBeforePrint))
    if (onBeforePrintCapture != null) __obj.updateDynamic("onBeforePrintCapture")(js.Any.fromFunction1(onBeforePrintCapture))
    if (onBeforeUnload != null) __obj.updateDynamic("onBeforeUnload")(js.Any.fromFunction1(onBeforeUnload))
    if (onBeforeUnloadCapture != null) __obj.updateDynamic("onBeforeUnloadCapture")(js.Any.fromFunction1(onBeforeUnloadCapture))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(js.Any.fromFunction1(onBlurCapture))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayCapture != null) __obj.updateDynamic("onCanPlayCapture")(js.Any.fromFunction1(onCanPlayCapture))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onCanPlayThroughCapture != null) __obj.updateDynamic("onCanPlayThroughCapture")(js.Any.fromFunction1(onCanPlayThroughCapture))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeCapture != null) __obj.updateDynamic("onChangeCapture")(js.Any.fromFunction1(onChangeCapture))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClickCapture != null) __obj.updateDynamic("onClickCapture")(js.Any.fromFunction1(onClickCapture))
    if (onCompassNeedsCalibration != null) __obj.updateDynamic("onCompassNeedsCalibration")(js.Any.fromFunction1(onCompassNeedsCalibration))
    if (onCompassNeedsCalibrationCapture != null) __obj.updateDynamic("onCompassNeedsCalibrationCapture")(js.Any.fromFunction1(onCompassNeedsCalibrationCapture))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onContextMenuCapture != null) __obj.updateDynamic("onContextMenuCapture")(js.Any.fromFunction1(onContextMenuCapture))
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1(onDblClick))
    if (onDblClickCapture != null) __obj.updateDynamic("onDblClickCapture")(js.Any.fromFunction1(onDblClickCapture))
    if (onDeviceMotion != null) __obj.updateDynamic("onDeviceMotion")(js.Any.fromFunction1(onDeviceMotion))
    if (onDeviceMotionCapture != null) __obj.updateDynamic("onDeviceMotionCapture")(js.Any.fromFunction1(onDeviceMotionCapture))
    if (onDeviceOrientation != null) __obj.updateDynamic("onDeviceOrientation")(js.Any.fromFunction1(onDeviceOrientation))
    if (onDeviceOrientationCapture != null) __obj.updateDynamic("onDeviceOrientationCapture")(js.Any.fromFunction1(onDeviceOrientationCapture))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragCapture != null) __obj.updateDynamic("onDragCapture")(js.Any.fromFunction1(onDragCapture))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEndCapture != null) __obj.updateDynamic("onDragEndCapture")(js.Any.fromFunction1(onDragEndCapture))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragEnterCapture != null) __obj.updateDynamic("onDragEnterCapture")(js.Any.fromFunction1(onDragEnterCapture))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragLeaveCapture != null) __obj.updateDynamic("onDragLeaveCapture")(js.Any.fromFunction1(onDragLeaveCapture))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragOverCapture != null) __obj.updateDynamic("onDragOverCapture")(js.Any.fromFunction1(onDragOverCapture))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDragStartCapture != null) __obj.updateDynamic("onDragStartCapture")(js.Any.fromFunction1(onDragStartCapture))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDropCapture != null) __obj.updateDynamic("onDropCapture")(js.Any.fromFunction1(onDropCapture))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onDurationChangeCapture != null) __obj.updateDynamic("onDurationChangeCapture")(js.Any.fromFunction1(onDurationChangeCapture))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEmptiedCapture != null) __obj.updateDynamic("onEmptiedCapture")(js.Any.fromFunction1(onEmptiedCapture))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onEndedCapture != null) __obj.updateDynamic("onEndedCapture")(js.Any.fromFunction1(onEndedCapture))
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(onErrorCapture)
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(js.Any.fromFunction1(onFocusCapture))
    if (onHashChange != null) __obj.updateDynamic("onHashChange")(js.Any.fromFunction1(onHashChange))
    if (onHashChangeCapture != null) __obj.updateDynamic("onHashChangeCapture")(js.Any.fromFunction1(onHashChangeCapture))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(js.Any.fromFunction1(onInputCapture))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyDownCapture != null) __obj.updateDynamic("onKeyDownCapture")(js.Any.fromFunction1(onKeyDownCapture))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyPressCapture != null) __obj.updateDynamic("onKeyPressCapture")(js.Any.fromFunction1(onKeyPressCapture))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onKeyUpCapture != null) __obj.updateDynamic("onKeyUpCapture")(js.Any.fromFunction1(onKeyUpCapture))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadCapture != null) __obj.updateDynamic("onLoadCapture")(js.Any.fromFunction1(onLoadCapture))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadStartCapture != null) __obj.updateDynamic("onLoadStartCapture")(js.Any.fromFunction1(onLoadStartCapture))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedDataCapture != null) __obj.updateDynamic("onLoadedDataCapture")(js.Any.fromFunction1(onLoadedDataCapture))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onLoadedMetadataCapture != null) __obj.updateDynamic("onLoadedMetadataCapture")(js.Any.fromFunction1(onLoadedMetadataCapture))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    if (onMessageCapture != null) __obj.updateDynamic("onMessageCapture")(js.Any.fromFunction1(onMessageCapture))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseDownCapture != null) __obj.updateDynamic("onMouseDownCapture")(js.Any.fromFunction1(onMouseDownCapture))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseEnterCapture != null) __obj.updateDynamic("onMouseEnterCapture")(js.Any.fromFunction1(onMouseEnterCapture))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseLeaveCapture != null) __obj.updateDynamic("onMouseLeaveCapture")(js.Any.fromFunction1(onMouseLeaveCapture))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseMoveCapture != null) __obj.updateDynamic("onMouseMoveCapture")(js.Any.fromFunction1(onMouseMoveCapture))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOutCapture != null) __obj.updateDynamic("onMouseOutCapture")(js.Any.fromFunction1(onMouseOutCapture))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseOverCapture != null) __obj.updateDynamic("onMouseOverCapture")(js.Any.fromFunction1(onMouseOverCapture))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onMouseUpCapture != null) __obj.updateDynamic("onMouseUpCapture")(js.Any.fromFunction1(onMouseUpCapture))
    if (onMouseWheel != null) __obj.updateDynamic("onMouseWheel")(js.Any.fromFunction1(onMouseWheel))
    if (onMouseWheelCapture != null) __obj.updateDynamic("onMouseWheelCapture")(js.Any.fromFunction1(onMouseWheelCapture))
    if (onMsGestureChange != null) __obj.updateDynamic("onMsGestureChange")(js.Any.fromFunction1(onMsGestureChange))
    if (onMsGestureChangeCapture != null) __obj.updateDynamic("onMsGestureChangeCapture")(js.Any.fromFunction1(onMsGestureChangeCapture))
    if (onMsGestureDoubleTap != null) __obj.updateDynamic("onMsGestureDoubleTap")(js.Any.fromFunction1(onMsGestureDoubleTap))
    if (onMsGestureDoubleTapCapture != null) __obj.updateDynamic("onMsGestureDoubleTapCapture")(js.Any.fromFunction1(onMsGestureDoubleTapCapture))
    if (onMsGestureEnd != null) __obj.updateDynamic("onMsGestureEnd")(js.Any.fromFunction1(onMsGestureEnd))
    if (onMsGestureEndCapture != null) __obj.updateDynamic("onMsGestureEndCapture")(js.Any.fromFunction1(onMsGestureEndCapture))
    if (onMsGestureHold != null) __obj.updateDynamic("onMsGestureHold")(js.Any.fromFunction1(onMsGestureHold))
    if (onMsGestureHoldCapture != null) __obj.updateDynamic("onMsGestureHoldCapture")(js.Any.fromFunction1(onMsGestureHoldCapture))
    if (onMsGestureStart != null) __obj.updateDynamic("onMsGestureStart")(js.Any.fromFunction1(onMsGestureStart))
    if (onMsGestureStartCapture != null) __obj.updateDynamic("onMsGestureStartCapture")(js.Any.fromFunction1(onMsGestureStartCapture))
    if (onMsGestureTap != null) __obj.updateDynamic("onMsGestureTap")(js.Any.fromFunction1(onMsGestureTap))
    if (onMsGestureTapCapture != null) __obj.updateDynamic("onMsGestureTapCapture")(js.Any.fromFunction1(onMsGestureTapCapture))
    if (onMsInertiaStart != null) __obj.updateDynamic("onMsInertiaStart")(js.Any.fromFunction1(onMsInertiaStart))
    if (onMsInertiaStartCapture != null) __obj.updateDynamic("onMsInertiaStartCapture")(js.Any.fromFunction1(onMsInertiaStartCapture))
    if (onMsPointerCancel != null) __obj.updateDynamic("onMsPointerCancel")(js.Any.fromFunction1(onMsPointerCancel))
    if (onMsPointerCancelCapture != null) __obj.updateDynamic("onMsPointerCancelCapture")(js.Any.fromFunction1(onMsPointerCancelCapture))
    if (onMsPointerDown != null) __obj.updateDynamic("onMsPointerDown")(js.Any.fromFunction1(onMsPointerDown))
    if (onMsPointerDownCapture != null) __obj.updateDynamic("onMsPointerDownCapture")(js.Any.fromFunction1(onMsPointerDownCapture))
    if (onMsPointerEnter != null) __obj.updateDynamic("onMsPointerEnter")(js.Any.fromFunction1(onMsPointerEnter))
    if (onMsPointerEnterCapture != null) __obj.updateDynamic("onMsPointerEnterCapture")(js.Any.fromFunction1(onMsPointerEnterCapture))
    if (onMsPointerLeave != null) __obj.updateDynamic("onMsPointerLeave")(js.Any.fromFunction1(onMsPointerLeave))
    if (onMsPointerLeaveCapture != null) __obj.updateDynamic("onMsPointerLeaveCapture")(js.Any.fromFunction1(onMsPointerLeaveCapture))
    if (onMsPointerMove != null) __obj.updateDynamic("onMsPointerMove")(js.Any.fromFunction1(onMsPointerMove))
    if (onMsPointerMoveCapture != null) __obj.updateDynamic("onMsPointerMoveCapture")(js.Any.fromFunction1(onMsPointerMoveCapture))
    if (onMsPointerOut != null) __obj.updateDynamic("onMsPointerOut")(js.Any.fromFunction1(onMsPointerOut))
    if (onMsPointerOutCapture != null) __obj.updateDynamic("onMsPointerOutCapture")(js.Any.fromFunction1(onMsPointerOutCapture))
    if (onMsPointerOver != null) __obj.updateDynamic("onMsPointerOver")(js.Any.fromFunction1(onMsPointerOver))
    if (onMsPointerOverCapture != null) __obj.updateDynamic("onMsPointerOverCapture")(js.Any.fromFunction1(onMsPointerOverCapture))
    if (onOffline != null) __obj.updateDynamic("onOffline")(js.Any.fromFunction1(onOffline))
    if (onOfflineCapture != null) __obj.updateDynamic("onOfflineCapture")(js.Any.fromFunction1(onOfflineCapture))
    if (onOnline != null) __obj.updateDynamic("onOnline")(js.Any.fromFunction1(onOnline))
    if (onOnlineCapture != null) __obj.updateDynamic("onOnlineCapture")(js.Any.fromFunction1(onOnlineCapture))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1(onOrientationChange))
    if (onOrientationChangeCapture != null) __obj.updateDynamic("onOrientationChangeCapture")(js.Any.fromFunction1(onOrientationChangeCapture))
    if (onPageHide != null) __obj.updateDynamic("onPageHide")(js.Any.fromFunction1(onPageHide))
    if (onPageHideCapture != null) __obj.updateDynamic("onPageHideCapture")(js.Any.fromFunction1(onPageHideCapture))
    if (onPageShow != null) __obj.updateDynamic("onPageShow")(js.Any.fromFunction1(onPageShow))
    if (onPageShowCapture != null) __obj.updateDynamic("onPageShowCapture")(js.Any.fromFunction1(onPageShowCapture))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPauseCapture != null) __obj.updateDynamic("onPauseCapture")(js.Any.fromFunction1(onPauseCapture))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlayCapture != null) __obj.updateDynamic("onPlayCapture")(js.Any.fromFunction1(onPlayCapture))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPlayingCapture != null) __obj.updateDynamic("onPlayingCapture")(js.Any.fromFunction1(onPlayingCapture))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerCancelCapture != null) __obj.updateDynamic("onPointerCancelCapture")(js.Any.fromFunction1(onPointerCancelCapture))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerDownCapture != null) __obj.updateDynamic("onPointerDownCapture")(js.Any.fromFunction1(onPointerDownCapture))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerEnterCapture != null) __obj.updateDynamic("onPointerEnterCapture")(js.Any.fromFunction1(onPointerEnterCapture))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerLeaveCapture != null) __obj.updateDynamic("onPointerLeaveCapture")(js.Any.fromFunction1(onPointerLeaveCapture))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerMoveCapture != null) __obj.updateDynamic("onPointerMoveCapture")(js.Any.fromFunction1(onPointerMoveCapture))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOutCapture != null) __obj.updateDynamic("onPointerOutCapture")(js.Any.fromFunction1(onPointerOutCapture))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerOverCapture != null) __obj.updateDynamic("onPointerOverCapture")(js.Any.fromFunction1(onPointerOverCapture))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onPointerUpCapture != null) __obj.updateDynamic("onPointerUpCapture")(js.Any.fromFunction1(onPointerUpCapture))
    if (onPopState != null) __obj.updateDynamic("onPopState")(js.Any.fromFunction1(onPopState))
    if (onPopStateCapture != null) __obj.updateDynamic("onPopStateCapture")(js.Any.fromFunction1(onPopStateCapture))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onProgressCapture != null) __obj.updateDynamic("onProgressCapture")(js.Any.fromFunction1(onProgressCapture))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onRateChangeCapture != null) __obj.updateDynamic("onRateChangeCapture")(js.Any.fromFunction1(onRateChangeCapture))
    if (onReadyStateChange != null) __obj.updateDynamic("onReadyStateChange")(js.Any.fromFunction1(onReadyStateChange))
    if (onReadyStateChangeCapture != null) __obj.updateDynamic("onReadyStateChangeCapture")(js.Any.fromFunction1(onReadyStateChangeCapture))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onResetCapture != null) __obj.updateDynamic("onResetCapture")(js.Any.fromFunction1(onResetCapture))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onResizeCapture != null) __obj.updateDynamic("onResizeCapture")(js.Any.fromFunction1(onResizeCapture))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollCapture != null) __obj.updateDynamic("onScrollCapture")(js.Any.fromFunction1(onScrollCapture))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeekedCapture != null) __obj.updateDynamic("onSeekedCapture")(js.Any.fromFunction1(onSeekedCapture))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSeekingCapture != null) __obj.updateDynamic("onSeekingCapture")(js.Any.fromFunction1(onSeekingCapture))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSelectCapture != null) __obj.updateDynamic("onSelectCapture")(js.Any.fromFunction1(onSelectCapture))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onSelectionChangeCapture != null) __obj.updateDynamic("onSelectionChangeCapture")(js.Any.fromFunction1(onSelectionChangeCapture))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onStalledCapture != null) __obj.updateDynamic("onStalledCapture")(js.Any.fromFunction1(onStalledCapture))
    if (onStorage != null) __obj.updateDynamic("onStorage")(js.Any.fromFunction1(onStorage))
    if (onStorageCapture != null) __obj.updateDynamic("onStorageCapture")(js.Any.fromFunction1(onStorageCapture))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSubmitCapture != null) __obj.updateDynamic("onSubmitCapture")(js.Any.fromFunction1(onSubmitCapture))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onSuspendCapture != null) __obj.updateDynamic("onSuspendCapture")(js.Any.fromFunction1(onSuspendCapture))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTimeUpdateCapture != null) __obj.updateDynamic("onTimeUpdateCapture")(js.Any.fromFunction1(onTimeUpdateCapture))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchCancelCapture != null) __obj.updateDynamic("onTouchCancelCapture")(onTouchCancelCapture)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchMoveCapture != null) __obj.updateDynamic("onTouchMoveCapture")(onTouchMoveCapture)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (onTouchStartCapture != null) __obj.updateDynamic("onTouchStartCapture")(onTouchStartCapture)
    if (onUnload != null) __obj.updateDynamic("onUnload")(js.Any.fromFunction1(onUnload))
    if (onUnloadCapture != null) __obj.updateDynamic("onUnloadCapture")(js.Any.fromFunction1(onUnloadCapture))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onVolumeChangeCapture != null) __obj.updateDynamic("onVolumeChangeCapture")(js.Any.fromFunction1(onVolumeChangeCapture))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWaitingCapture != null) __obj.updateDynamic("onWaitingCapture")(js.Any.fromFunction1(onWaitingCapture))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (onWheelCapture != null) __obj.updateDynamic("onWheelCapture")(js.Any.fromFunction1(onWheelCapture))
    __obj.asInstanceOf[EventListenerProps]
  }
}

