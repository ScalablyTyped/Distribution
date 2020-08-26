package typings.reactEventListener.mod

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

@js.native
trait EventListenerProps extends js.Object {
  var oNmsPointerUp: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var oNmsPointerUpCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onAbort: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onAbortCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onAfterPrint: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onAfterPrintCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onBeforePrint: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onBeforePrintCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onBeforeUnload: js.UndefOr[js.Function1[/* ev */ BeforeUnloadEvent, _]] = js.native
  var onBeforeUnloadCapture: js.UndefOr[js.Function1[/* ev */ BeforeUnloadEvent, _]] = js.native
  var onBlur: js.UndefOr[js.Function1[/* ev */ FocusEvent, _]] = js.native
  var onBlurCapture: js.UndefOr[js.Function1[/* ev */ FocusEvent, _]] = js.native
  var onCanPlay: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onCanPlayCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onCanPlayThrough: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onCanPlayThroughCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onChange: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onChangeCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onClick: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onClickCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onCompassNeedsCalibration: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onCompassNeedsCalibrationCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onContextMenu: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onContextMenuCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onDblClick: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onDblClickCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onDeviceMotion: js.UndefOr[js.Function1[/* ev */ DeviceMotionEvent, _]] = js.native
  var onDeviceMotionCapture: js.UndefOr[js.Function1[/* ev */ DeviceMotionEvent, _]] = js.native
  var onDeviceOrientation: js.UndefOr[js.Function1[/* ev */ DeviceOrientationEvent, _]] = js.native
  var onDeviceOrientationCapture: js.UndefOr[js.Function1[/* ev */ DeviceOrientationEvent, _]] = js.native
  var onDrag: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragEnd: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragEndCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragEnter: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragEnterCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragLeave: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragLeaveCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragOver: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragOverCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragStart: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragStartCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDrop: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDropCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDurationChange: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onDurationChangeCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onEmptied: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onEmptiedCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onEnded: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onEndedCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onError: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any
  ] = js.native
  var onErrorCapture: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any
  ] = js.native
  var onFocus: js.UndefOr[js.Function1[/* ev */ FocusEvent, _]] = js.native
  var onFocusCapture: js.UndefOr[js.Function1[/* ev */ FocusEvent, _]] = js.native
  var onHashChange: js.UndefOr[js.Function1[/* ev */ HashChangeEvent, _]] = js.native
  var onHashChangeCapture: js.UndefOr[js.Function1[/* ev */ HashChangeEvent, _]] = js.native
  var onInput: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onInputCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.native
  var onKeyDownCapture: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.native
  var onKeyPress: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.native
  var onKeyPressCapture: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.native
  var onKeyUp: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.native
  var onKeyUpCapture: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onLoadCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onLoadStart: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onLoadStartCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onLoadedData: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onLoadedDataCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onLoadedMetadata: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onLoadedMetadataCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onMessage: js.UndefOr[js.Function1[/* ev */ MessageEvent, _]] = js.native
  var onMessageCapture: js.UndefOr[js.Function1[/* ev */ MessageEvent, _]] = js.native
  var onMouseDown: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseDownCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseEnter: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseEnterCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseLeave: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseLeaveCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseMove: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseMoveCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseOut: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseOutCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseOver: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseOverCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseUp: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseUpCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseWheel: js.UndefOr[js.Function1[/* ev */ WheelEvent, _]] = js.native
  var onMouseWheelCapture: js.UndefOr[js.Function1[/* ev */ WheelEvent, _]] = js.native
  var onMsGestureChange: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureChangeCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureDoubleTap: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureDoubleTapCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureEnd: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureEndCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureHold: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureHoldCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureStart: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureStartCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureTap: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureTapCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsInertiaStart: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsInertiaStartCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsPointerCancel: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerCancelCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerDown: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerDownCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerEnter: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerEnterCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerLeave: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerLeaveCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerMove: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerMoveCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerOut: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerOutCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerOver: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerOverCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onOffline: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onOfflineCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onOnline: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onOnlineCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onOrientationChange: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onOrientationChangeCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onPageHide: js.UndefOr[js.Function1[/* ev */ PageTransitionEvent, _]] = js.native
  var onPageHideCapture: js.UndefOr[js.Function1[/* ev */ PageTransitionEvent, _]] = js.native
  var onPageShow: js.UndefOr[js.Function1[/* ev */ PageTransitionEvent, _]] = js.native
  var onPageShowCapture: js.UndefOr[js.Function1[/* ev */ PageTransitionEvent, _]] = js.native
  var onPause: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onPauseCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onPlay: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onPlayCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onPlaying: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onPlayingCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  // Global events
  var onPointerCancel: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerCancelCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerDown: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerDownCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerEnter: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerEnterCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerLeave: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerLeaveCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerMove: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerMoveCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerOut: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerOutCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerOver: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerOverCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerUp: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerUpCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPopState: js.UndefOr[js.Function1[/* ev */ PopStateEvent, _]] = js.native
  var onPopStateCapture: js.UndefOr[js.Function1[/* ev */ PopStateEvent, _]] = js.native
  var onProgress: js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], _]] = js.native
  var onProgressCapture: js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], _]] = js.native
  var onRateChange: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onRateChangeCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onReadyStateChange: js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], _]] = js.native
  var onReadyStateChangeCapture: js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], _]] = js.native
  var onReset: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onResetCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onResize: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.native
  var onResizeCapture: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.native
  var onScroll: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.native
  var onScrollCapture: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.native
  var onSeeked: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onSeekedCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onSeeking: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onSeekingCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.native
  var onSelectCapture: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.native
  var onSelectionChange: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onSelectionChangeCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onStalled: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onStalledCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onStorage: js.UndefOr[js.Function1[/* ev */ StorageEvent, _]] = js.native
  var onStorageCapture: js.UndefOr[js.Function1[/* ev */ StorageEvent, _]] = js.native
  var onSubmit: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onSubmitCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onSuspend: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onSuspendCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onTimeUpdate: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onTimeUpdateCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onTouchCancel: js.UndefOr[js.Any] = js.native
  var onTouchCancelCapture: js.UndefOr[js.Any] = js.native
  var onTouchEnd: js.UndefOr[js.Any] = js.native
  var onTouchEndCapture: js.UndefOr[js.Any] = js.native
  var onTouchMove: js.UndefOr[js.Any] = js.native
  var onTouchMoveCapture: js.UndefOr[js.Any] = js.native
  var onTouchStart: js.UndefOr[js.Any] = js.native
  var onTouchStartCapture: js.UndefOr[js.Any] = js.native
  var onUnload: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onUnloadCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onVolumeChange: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onVolumeChangeCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onWaiting: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onWaitingCapture: js.UndefOr[js.Function1[/* ev */ Event, _]] = js.native
  var onWheel: js.UndefOr[js.Function1[/* ev */ WheelEvent, _]] = js.native
  var onWheelCapture: js.UndefOr[js.Function1[/* ev */ WheelEvent, _]] = js.native
  /**
    * Target (window or document)
    */
  var target: Window | Document | String = js.native
}

object EventListenerProps {
  @scala.inline
  def apply(target: Window | Document | String): EventListenerProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListenerProps]
  }
  @scala.inline
  implicit class EventListenerPropsOps[Self <: EventListenerProps] (val x: Self) extends AnyVal {
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
    def setTarget(value: Window | Document | String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setONmsPointerUp(value: /* ev */ MSPointerEvent => _): Self = this.set("oNmsPointerUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteONmsPointerUp: Self = this.set("oNmsPointerUp", js.undefined)
    @scala.inline
    def setONmsPointerUpCapture(value: /* ev */ MSPointerEvent => _): Self = this.set("oNmsPointerUpCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteONmsPointerUpCapture: Self = this.set("oNmsPointerUpCapture", js.undefined)
    @scala.inline
    def setOnAbort(value: /* ev */ Event => _): Self = this.set("onAbort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    @scala.inline
    def setOnAbortCapture(value: /* ev */ Event => _): Self = this.set("onAbortCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAbortCapture: Self = this.set("onAbortCapture", js.undefined)
    @scala.inline
    def setOnAfterPrint(value: /* ev */ Event => _): Self = this.set("onAfterPrint", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAfterPrint: Self = this.set("onAfterPrint", js.undefined)
    @scala.inline
    def setOnAfterPrintCapture(value: /* ev */ Event => _): Self = this.set("onAfterPrintCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAfterPrintCapture: Self = this.set("onAfterPrintCapture", js.undefined)
    @scala.inline
    def setOnBeforePrint(value: /* ev */ Event => _): Self = this.set("onBeforePrint", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforePrint: Self = this.set("onBeforePrint", js.undefined)
    @scala.inline
    def setOnBeforePrintCapture(value: /* ev */ Event => _): Self = this.set("onBeforePrintCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforePrintCapture: Self = this.set("onBeforePrintCapture", js.undefined)
    @scala.inline
    def setOnBeforeUnload(value: /* ev */ BeforeUnloadEvent => _): Self = this.set("onBeforeUnload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeUnload: Self = this.set("onBeforeUnload", js.undefined)
    @scala.inline
    def setOnBeforeUnloadCapture(value: /* ev */ BeforeUnloadEvent => _): Self = this.set("onBeforeUnloadCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeUnloadCapture: Self = this.set("onBeforeUnloadCapture", js.undefined)
    @scala.inline
    def setOnBlur(value: /* ev */ FocusEvent => _): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnBlurCapture(value: /* ev */ FocusEvent => _): Self = this.set("onBlurCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlurCapture: Self = this.set("onBlurCapture", js.undefined)
    @scala.inline
    def setOnCanPlay(value: /* ev */ Event => _): Self = this.set("onCanPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlay: Self = this.set("onCanPlay", js.undefined)
    @scala.inline
    def setOnCanPlayCapture(value: /* ev */ Event => _): Self = this.set("onCanPlayCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlayCapture: Self = this.set("onCanPlayCapture", js.undefined)
    @scala.inline
    def setOnCanPlayThrough(value: /* ev */ Event => _): Self = this.set("onCanPlayThrough", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlayThrough: Self = this.set("onCanPlayThrough", js.undefined)
    @scala.inline
    def setOnCanPlayThroughCapture(value: /* ev */ Event => _): Self = this.set("onCanPlayThroughCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCanPlayThroughCapture: Self = this.set("onCanPlayThroughCapture", js.undefined)
    @scala.inline
    def setOnChange(value: /* ev */ Event => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnChangeCapture(value: /* ev */ Event => _): Self = this.set("onChangeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChangeCapture: Self = this.set("onChangeCapture", js.undefined)
    @scala.inline
    def setOnClick(value: /* ev */ MouseEvent => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnClickCapture(value: /* ev */ MouseEvent => _): Self = this.set("onClickCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClickCapture: Self = this.set("onClickCapture", js.undefined)
    @scala.inline
    def setOnCompassNeedsCalibration(value: /* ev */ Event => _): Self = this.set("onCompassNeedsCalibration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompassNeedsCalibration: Self = this.set("onCompassNeedsCalibration", js.undefined)
    @scala.inline
    def setOnCompassNeedsCalibrationCapture(value: /* ev */ Event => _): Self = this.set("onCompassNeedsCalibrationCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompassNeedsCalibrationCapture: Self = this.set("onCompassNeedsCalibrationCapture", js.undefined)
    @scala.inline
    def setOnContextMenu(value: /* ev */ PointerEvent => _): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnContextMenuCapture(value: /* ev */ PointerEvent => _): Self = this.set("onContextMenuCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenuCapture: Self = this.set("onContextMenuCapture", js.undefined)
    @scala.inline
    def setOnDblClick(value: /* ev */ MouseEvent => _): Self = this.set("onDblClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDblClick: Self = this.set("onDblClick", js.undefined)
    @scala.inline
    def setOnDblClickCapture(value: /* ev */ MouseEvent => _): Self = this.set("onDblClickCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDblClickCapture: Self = this.set("onDblClickCapture", js.undefined)
    @scala.inline
    def setOnDeviceMotion(value: /* ev */ DeviceMotionEvent => _): Self = this.set("onDeviceMotion", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDeviceMotion: Self = this.set("onDeviceMotion", js.undefined)
    @scala.inline
    def setOnDeviceMotionCapture(value: /* ev */ DeviceMotionEvent => _): Self = this.set("onDeviceMotionCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDeviceMotionCapture: Self = this.set("onDeviceMotionCapture", js.undefined)
    @scala.inline
    def setOnDeviceOrientation(value: /* ev */ DeviceOrientationEvent => _): Self = this.set("onDeviceOrientation", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDeviceOrientation: Self = this.set("onDeviceOrientation", js.undefined)
    @scala.inline
    def setOnDeviceOrientationCapture(value: /* ev */ DeviceOrientationEvent => _): Self = this.set("onDeviceOrientationCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDeviceOrientationCapture: Self = this.set("onDeviceOrientationCapture", js.undefined)
    @scala.inline
    def setOnDrag(value: /* ev */ DragEvent => _): Self = this.set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragCapture(value: /* ev */ DragEvent => _): Self = this.set("onDragCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragCapture: Self = this.set("onDragCapture", js.undefined)
    @scala.inline
    def setOnDragEnd(value: /* ev */ DragEvent => _): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragEndCapture(value: /* ev */ DragEvent => _): Self = this.set("onDragEndCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEndCapture: Self = this.set("onDragEndCapture", js.undefined)
    @scala.inline
    def setOnDragEnter(value: /* ev */ DragEvent => _): Self = this.set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnter: Self = this.set("onDragEnter", js.undefined)
    @scala.inline
    def setOnDragEnterCapture(value: /* ev */ DragEvent => _): Self = this.set("onDragEnterCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnterCapture: Self = this.set("onDragEnterCapture", js.undefined)
    @scala.inline
    def setOnDragLeave(value: /* ev */ DragEvent => _): Self = this.set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragLeave: Self = this.set("onDragLeave", js.undefined)
    @scala.inline
    def setOnDragLeaveCapture(value: /* ev */ DragEvent => _): Self = this.set("onDragLeaveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragLeaveCapture: Self = this.set("onDragLeaveCapture", js.undefined)
    @scala.inline
    def setOnDragOver(value: /* ev */ DragEvent => _): Self = this.set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragOver: Self = this.set("onDragOver", js.undefined)
    @scala.inline
    def setOnDragOverCapture(value: /* ev */ DragEvent => _): Self = this.set("onDragOverCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragOverCapture: Self = this.set("onDragOverCapture", js.undefined)
    @scala.inline
    def setOnDragStart(value: /* ev */ DragEvent => _): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnDragStartCapture(value: /* ev */ DragEvent => _): Self = this.set("onDragStartCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStartCapture: Self = this.set("onDragStartCapture", js.undefined)
    @scala.inline
    def setOnDrop(value: /* ev */ DragEvent => _): Self = this.set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setOnDropCapture(value: /* ev */ DragEvent => _): Self = this.set("onDropCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDropCapture: Self = this.set("onDropCapture", js.undefined)
    @scala.inline
    def setOnDurationChange(value: /* ev */ Event => _): Self = this.set("onDurationChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDurationChange: Self = this.set("onDurationChange", js.undefined)
    @scala.inline
    def setOnDurationChangeCapture(value: /* ev */ Event => _): Self = this.set("onDurationChangeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDurationChangeCapture: Self = this.set("onDurationChangeCapture", js.undefined)
    @scala.inline
    def setOnEmptied(value: /* ev */ Event => _): Self = this.set("onEmptied", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEmptied: Self = this.set("onEmptied", js.undefined)
    @scala.inline
    def setOnEmptiedCapture(value: /* ev */ Event => _): Self = this.set("onEmptiedCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEmptiedCapture: Self = this.set("onEmptiedCapture", js.undefined)
    @scala.inline
    def setOnEnded(value: /* ev */ Event => _): Self = this.set("onEnded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    @scala.inline
    def setOnEndedCapture(value: /* ev */ Event => _): Self = this.set("onEndedCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEndedCapture: Self = this.set("onEndedCapture", js.undefined)
    @scala.inline
    def setOnError(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any
    ): Self = this.set("onError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnErrorCapture(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any
    ): Self = this.set("onErrorCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnErrorCapture: Self = this.set("onErrorCapture", js.undefined)
    @scala.inline
    def setOnFocus(value: /* ev */ FocusEvent => _): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnFocusCapture(value: /* ev */ FocusEvent => _): Self = this.set("onFocusCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocusCapture: Self = this.set("onFocusCapture", js.undefined)
    @scala.inline
    def setOnHashChange(value: /* ev */ HashChangeEvent => _): Self = this.set("onHashChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHashChange: Self = this.set("onHashChange", js.undefined)
    @scala.inline
    def setOnHashChangeCapture(value: /* ev */ HashChangeEvent => _): Self = this.set("onHashChangeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHashChangeCapture: Self = this.set("onHashChangeCapture", js.undefined)
    @scala.inline
    def setOnInput(value: /* ev */ Event => _): Self = this.set("onInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    @scala.inline
    def setOnInputCapture(value: /* ev */ Event => _): Self = this.set("onInputCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInputCapture: Self = this.set("onInputCapture", js.undefined)
    @scala.inline
    def setOnKeyDown(value: /* ev */ KeyboardEvent => _): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyDownCapture(value: /* ev */ KeyboardEvent => _): Self = this.set("onKeyDownCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDownCapture: Self = this.set("onKeyDownCapture", js.undefined)
    @scala.inline
    def setOnKeyPress(value: /* ev */ KeyboardEvent => _): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setOnKeyPressCapture(value: /* ev */ KeyboardEvent => _): Self = this.set("onKeyPressCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyPressCapture: Self = this.set("onKeyPressCapture", js.undefined)
    @scala.inline
    def setOnKeyUp(value: /* ev */ KeyboardEvent => _): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnKeyUpCapture(value: /* ev */ KeyboardEvent => _): Self = this.set("onKeyUpCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUpCapture: Self = this.set("onKeyUpCapture", js.undefined)
    @scala.inline
    def setOnLoad(value: /* ev */ Event => _): Self = this.set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnLoadCapture(value: /* ev */ Event => _): Self = this.set("onLoadCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadCapture: Self = this.set("onLoadCapture", js.undefined)
    @scala.inline
    def setOnLoadStart(value: /* ev */ Event => _): Self = this.set("onLoadStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    @scala.inline
    def setOnLoadStartCapture(value: /* ev */ Event => _): Self = this.set("onLoadStartCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadStartCapture: Self = this.set("onLoadStartCapture", js.undefined)
    @scala.inline
    def setOnLoadedData(value: /* ev */ Event => _): Self = this.set("onLoadedData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    @scala.inline
    def setOnLoadedDataCapture(value: /* ev */ Event => _): Self = this.set("onLoadedDataCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedDataCapture: Self = this.set("onLoadedDataCapture", js.undefined)
    @scala.inline
    def setOnLoadedMetadata(value: /* ev */ Event => _): Self = this.set("onLoadedMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedMetadata: Self = this.set("onLoadedMetadata", js.undefined)
    @scala.inline
    def setOnLoadedMetadataCapture(value: /* ev */ Event => _): Self = this.set("onLoadedMetadataCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoadedMetadataCapture: Self = this.set("onLoadedMetadataCapture", js.undefined)
    @scala.inline
    def setOnMessage(value: /* ev */ MessageEvent => _): Self = this.set("onMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMessage: Self = this.set("onMessage", js.undefined)
    @scala.inline
    def setOnMessageCapture(value: /* ev */ MessageEvent => _): Self = this.set("onMessageCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMessageCapture: Self = this.set("onMessageCapture", js.undefined)
    @scala.inline
    def setOnMouseDown(value: /* ev */ MouseEvent => _): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseDownCapture(value: /* ev */ MouseEvent => _): Self = this.set("onMouseDownCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDownCapture: Self = this.set("onMouseDownCapture", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: /* ev */ MouseEvent => _): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseEnterCapture(value: /* ev */ MouseEvent => _): Self = this.set("onMouseEnterCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnterCapture: Self = this.set("onMouseEnterCapture", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: /* ev */ MouseEvent => _): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseLeaveCapture(value: /* ev */ MouseEvent => _): Self = this.set("onMouseLeaveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeaveCapture: Self = this.set("onMouseLeaveCapture", js.undefined)
    @scala.inline
    def setOnMouseMove(value: /* ev */ MouseEvent => _): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setOnMouseMoveCapture(value: /* ev */ MouseEvent => _): Self = this.set("onMouseMoveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseMoveCapture: Self = this.set("onMouseMoveCapture", js.undefined)
    @scala.inline
    def setOnMouseOut(value: /* ev */ MouseEvent => _): Self = this.set("onMouseOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    @scala.inline
    def setOnMouseOutCapture(value: /* ev */ MouseEvent => _): Self = this.set("onMouseOutCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOutCapture: Self = this.set("onMouseOutCapture", js.undefined)
    @scala.inline
    def setOnMouseOver(value: /* ev */ MouseEvent => _): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    @scala.inline
    def setOnMouseOverCapture(value: /* ev */ MouseEvent => _): Self = this.set("onMouseOverCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseOverCapture: Self = this.set("onMouseOverCapture", js.undefined)
    @scala.inline
    def setOnMouseUp(value: /* ev */ MouseEvent => _): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setOnMouseUpCapture(value: /* ev */ MouseEvent => _): Self = this.set("onMouseUpCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUpCapture: Self = this.set("onMouseUpCapture", js.undefined)
    @scala.inline
    def setOnMouseWheel(value: /* ev */ WheelEvent => _): Self = this.set("onMouseWheel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseWheel: Self = this.set("onMouseWheel", js.undefined)
    @scala.inline
    def setOnMouseWheelCapture(value: /* ev */ WheelEvent => _): Self = this.set("onMouseWheelCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseWheelCapture: Self = this.set("onMouseWheelCapture", js.undefined)
    @scala.inline
    def setOnMsGestureChange(value: /* ev */ MSGestureEvent => _): Self = this.set("onMsGestureChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsGestureChange: Self = this.set("onMsGestureChange", js.undefined)
    @scala.inline
    def setOnMsGestureChangeCapture(value: /* ev */ MSGestureEvent => _): Self = this.set("onMsGestureChangeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsGestureChangeCapture: Self = this.set("onMsGestureChangeCapture", js.undefined)
    @scala.inline
    def setOnMsGestureDoubleTap(value: /* ev */ MSGestureEvent => _): Self = this.set("onMsGestureDoubleTap", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsGestureDoubleTap: Self = this.set("onMsGestureDoubleTap", js.undefined)
    @scala.inline
    def setOnMsGestureDoubleTapCapture(value: /* ev */ MSGestureEvent => _): Self = this.set("onMsGestureDoubleTapCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsGestureDoubleTapCapture: Self = this.set("onMsGestureDoubleTapCapture", js.undefined)
    @scala.inline
    def setOnMsGestureEnd(value: /* ev */ MSGestureEvent => _): Self = this.set("onMsGestureEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsGestureEnd: Self = this.set("onMsGestureEnd", js.undefined)
    @scala.inline
    def setOnMsGestureEndCapture(value: /* ev */ MSGestureEvent => _): Self = this.set("onMsGestureEndCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsGestureEndCapture: Self = this.set("onMsGestureEndCapture", js.undefined)
    @scala.inline
    def setOnMsGestureHold(value: /* ev */ MSGestureEvent => _): Self = this.set("onMsGestureHold", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsGestureHold: Self = this.set("onMsGestureHold", js.undefined)
    @scala.inline
    def setOnMsGestureHoldCapture(value: /* ev */ MSGestureEvent => _): Self = this.set("onMsGestureHoldCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsGestureHoldCapture: Self = this.set("onMsGestureHoldCapture", js.undefined)
    @scala.inline
    def setOnMsGestureStart(value: /* ev */ MSGestureEvent => _): Self = this.set("onMsGestureStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsGestureStart: Self = this.set("onMsGestureStart", js.undefined)
    @scala.inline
    def setOnMsGestureStartCapture(value: /* ev */ MSGestureEvent => _): Self = this.set("onMsGestureStartCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsGestureStartCapture: Self = this.set("onMsGestureStartCapture", js.undefined)
    @scala.inline
    def setOnMsGestureTap(value: /* ev */ MSGestureEvent => _): Self = this.set("onMsGestureTap", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsGestureTap: Self = this.set("onMsGestureTap", js.undefined)
    @scala.inline
    def setOnMsGestureTapCapture(value: /* ev */ MSGestureEvent => _): Self = this.set("onMsGestureTapCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsGestureTapCapture: Self = this.set("onMsGestureTapCapture", js.undefined)
    @scala.inline
    def setOnMsInertiaStart(value: /* ev */ MSGestureEvent => _): Self = this.set("onMsInertiaStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsInertiaStart: Self = this.set("onMsInertiaStart", js.undefined)
    @scala.inline
    def setOnMsInertiaStartCapture(value: /* ev */ MSGestureEvent => _): Self = this.set("onMsInertiaStartCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsInertiaStartCapture: Self = this.set("onMsInertiaStartCapture", js.undefined)
    @scala.inline
    def setOnMsPointerCancel(value: /* ev */ MSPointerEvent => _): Self = this.set("onMsPointerCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsPointerCancel: Self = this.set("onMsPointerCancel", js.undefined)
    @scala.inline
    def setOnMsPointerCancelCapture(value: /* ev */ MSPointerEvent => _): Self = this.set("onMsPointerCancelCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsPointerCancelCapture: Self = this.set("onMsPointerCancelCapture", js.undefined)
    @scala.inline
    def setOnMsPointerDown(value: /* ev */ MSPointerEvent => _): Self = this.set("onMsPointerDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsPointerDown: Self = this.set("onMsPointerDown", js.undefined)
    @scala.inline
    def setOnMsPointerDownCapture(value: /* ev */ MSPointerEvent => _): Self = this.set("onMsPointerDownCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsPointerDownCapture: Self = this.set("onMsPointerDownCapture", js.undefined)
    @scala.inline
    def setOnMsPointerEnter(value: /* ev */ MSPointerEvent => _): Self = this.set("onMsPointerEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsPointerEnter: Self = this.set("onMsPointerEnter", js.undefined)
    @scala.inline
    def setOnMsPointerEnterCapture(value: /* ev */ MSPointerEvent => _): Self = this.set("onMsPointerEnterCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsPointerEnterCapture: Self = this.set("onMsPointerEnterCapture", js.undefined)
    @scala.inline
    def setOnMsPointerLeave(value: /* ev */ MSPointerEvent => _): Self = this.set("onMsPointerLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsPointerLeave: Self = this.set("onMsPointerLeave", js.undefined)
    @scala.inline
    def setOnMsPointerLeaveCapture(value: /* ev */ MSPointerEvent => _): Self = this.set("onMsPointerLeaveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsPointerLeaveCapture: Self = this.set("onMsPointerLeaveCapture", js.undefined)
    @scala.inline
    def setOnMsPointerMove(value: /* ev */ MSPointerEvent => _): Self = this.set("onMsPointerMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsPointerMove: Self = this.set("onMsPointerMove", js.undefined)
    @scala.inline
    def setOnMsPointerMoveCapture(value: /* ev */ MSPointerEvent => _): Self = this.set("onMsPointerMoveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsPointerMoveCapture: Self = this.set("onMsPointerMoveCapture", js.undefined)
    @scala.inline
    def setOnMsPointerOut(value: /* ev */ MSPointerEvent => _): Self = this.set("onMsPointerOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsPointerOut: Self = this.set("onMsPointerOut", js.undefined)
    @scala.inline
    def setOnMsPointerOutCapture(value: /* ev */ MSPointerEvent => _): Self = this.set("onMsPointerOutCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsPointerOutCapture: Self = this.set("onMsPointerOutCapture", js.undefined)
    @scala.inline
    def setOnMsPointerOver(value: /* ev */ MSPointerEvent => _): Self = this.set("onMsPointerOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsPointerOver: Self = this.set("onMsPointerOver", js.undefined)
    @scala.inline
    def setOnMsPointerOverCapture(value: /* ev */ MSPointerEvent => _): Self = this.set("onMsPointerOverCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMsPointerOverCapture: Self = this.set("onMsPointerOverCapture", js.undefined)
    @scala.inline
    def setOnOffline(value: /* ev */ Event => _): Self = this.set("onOffline", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOffline: Self = this.set("onOffline", js.undefined)
    @scala.inline
    def setOnOfflineCapture(value: /* ev */ Event => _): Self = this.set("onOfflineCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOfflineCapture: Self = this.set("onOfflineCapture", js.undefined)
    @scala.inline
    def setOnOnline(value: /* ev */ Event => _): Self = this.set("onOnline", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOnline: Self = this.set("onOnline", js.undefined)
    @scala.inline
    def setOnOnlineCapture(value: /* ev */ Event => _): Self = this.set("onOnlineCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOnlineCapture: Self = this.set("onOnlineCapture", js.undefined)
    @scala.inline
    def setOnOrientationChange(value: /* ev */ Event => _): Self = this.set("onOrientationChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOrientationChange: Self = this.set("onOrientationChange", js.undefined)
    @scala.inline
    def setOnOrientationChangeCapture(value: /* ev */ Event => _): Self = this.set("onOrientationChangeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOrientationChangeCapture: Self = this.set("onOrientationChangeCapture", js.undefined)
    @scala.inline
    def setOnPageHide(value: /* ev */ PageTransitionEvent => _): Self = this.set("onPageHide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageHide: Self = this.set("onPageHide", js.undefined)
    @scala.inline
    def setOnPageHideCapture(value: /* ev */ PageTransitionEvent => _): Self = this.set("onPageHideCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageHideCapture: Self = this.set("onPageHideCapture", js.undefined)
    @scala.inline
    def setOnPageShow(value: /* ev */ PageTransitionEvent => _): Self = this.set("onPageShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageShow: Self = this.set("onPageShow", js.undefined)
    @scala.inline
    def setOnPageShowCapture(value: /* ev */ PageTransitionEvent => _): Self = this.set("onPageShowCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageShowCapture: Self = this.set("onPageShowCapture", js.undefined)
    @scala.inline
    def setOnPause(value: /* ev */ Event => _): Self = this.set("onPause", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    @scala.inline
    def setOnPauseCapture(value: /* ev */ Event => _): Self = this.set("onPauseCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPauseCapture: Self = this.set("onPauseCapture", js.undefined)
    @scala.inline
    def setOnPlay(value: /* ev */ Event => _): Self = this.set("onPlay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    @scala.inline
    def setOnPlayCapture(value: /* ev */ Event => _): Self = this.set("onPlayCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlayCapture: Self = this.set("onPlayCapture", js.undefined)
    @scala.inline
    def setOnPlaying(value: /* ev */ Event => _): Self = this.set("onPlaying", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlaying: Self = this.set("onPlaying", js.undefined)
    @scala.inline
    def setOnPlayingCapture(value: /* ev */ Event => _): Self = this.set("onPlayingCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPlayingCapture: Self = this.set("onPlayingCapture", js.undefined)
    @scala.inline
    def setOnPointerCancel(value: /* ev */ PointerEvent => _): Self = this.set("onPointerCancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerCancel: Self = this.set("onPointerCancel", js.undefined)
    @scala.inline
    def setOnPointerCancelCapture(value: /* ev */ PointerEvent => _): Self = this.set("onPointerCancelCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerCancelCapture: Self = this.set("onPointerCancelCapture", js.undefined)
    @scala.inline
    def setOnPointerDown(value: /* ev */ PointerEvent => _): Self = this.set("onPointerDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    @scala.inline
    def setOnPointerDownCapture(value: /* ev */ PointerEvent => _): Self = this.set("onPointerDownCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerDownCapture: Self = this.set("onPointerDownCapture", js.undefined)
    @scala.inline
    def setOnPointerEnter(value: /* ev */ PointerEvent => _): Self = this.set("onPointerEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerEnter: Self = this.set("onPointerEnter", js.undefined)
    @scala.inline
    def setOnPointerEnterCapture(value: /* ev */ PointerEvent => _): Self = this.set("onPointerEnterCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerEnterCapture: Self = this.set("onPointerEnterCapture", js.undefined)
    @scala.inline
    def setOnPointerLeave(value: /* ev */ PointerEvent => _): Self = this.set("onPointerLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerLeave: Self = this.set("onPointerLeave", js.undefined)
    @scala.inline
    def setOnPointerLeaveCapture(value: /* ev */ PointerEvent => _): Self = this.set("onPointerLeaveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerLeaveCapture: Self = this.set("onPointerLeaveCapture", js.undefined)
    @scala.inline
    def setOnPointerMove(value: /* ev */ PointerEvent => _): Self = this.set("onPointerMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    @scala.inline
    def setOnPointerMoveCapture(value: /* ev */ PointerEvent => _): Self = this.set("onPointerMoveCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerMoveCapture: Self = this.set("onPointerMoveCapture", js.undefined)
    @scala.inline
    def setOnPointerOut(value: /* ev */ PointerEvent => _): Self = this.set("onPointerOut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    @scala.inline
    def setOnPointerOutCapture(value: /* ev */ PointerEvent => _): Self = this.set("onPointerOutCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOutCapture: Self = this.set("onPointerOutCapture", js.undefined)
    @scala.inline
    def setOnPointerOver(value: /* ev */ PointerEvent => _): Self = this.set("onPointerOver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    @scala.inline
    def setOnPointerOverCapture(value: /* ev */ PointerEvent => _): Self = this.set("onPointerOverCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerOverCapture: Self = this.set("onPointerOverCapture", js.undefined)
    @scala.inline
    def setOnPointerUp(value: /* ev */ PointerEvent => _): Self = this.set("onPointerUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    @scala.inline
    def setOnPointerUpCapture(value: /* ev */ PointerEvent => _): Self = this.set("onPointerUpCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPointerUpCapture: Self = this.set("onPointerUpCapture", js.undefined)
    @scala.inline
    def setOnPopState(value: /* ev */ PopStateEvent => _): Self = this.set("onPopState", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPopState: Self = this.set("onPopState", js.undefined)
    @scala.inline
    def setOnPopStateCapture(value: /* ev */ PopStateEvent => _): Self = this.set("onPopStateCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPopStateCapture: Self = this.set("onPopStateCapture", js.undefined)
    @scala.inline
    def setOnProgress(value: /* ev */ ProgressEvent[EventTarget] => _): Self = this.set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    @scala.inline
    def setOnProgressCapture(value: /* ev */ ProgressEvent[EventTarget] => _): Self = this.set("onProgressCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgressCapture: Self = this.set("onProgressCapture", js.undefined)
    @scala.inline
    def setOnRateChange(value: /* ev */ Event => _): Self = this.set("onRateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRateChange: Self = this.set("onRateChange", js.undefined)
    @scala.inline
    def setOnRateChangeCapture(value: /* ev */ Event => _): Self = this.set("onRateChangeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRateChangeCapture: Self = this.set("onRateChangeCapture", js.undefined)
    @scala.inline
    def setOnReadyStateChange(value: /* ev */ ProgressEvent[EventTarget] => _): Self = this.set("onReadyStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReadyStateChange: Self = this.set("onReadyStateChange", js.undefined)
    @scala.inline
    def setOnReadyStateChangeCapture(value: /* ev */ ProgressEvent[EventTarget] => _): Self = this.set("onReadyStateChangeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReadyStateChangeCapture: Self = this.set("onReadyStateChangeCapture", js.undefined)
    @scala.inline
    def setOnReset(value: /* ev */ Event => _): Self = this.set("onReset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    @scala.inline
    def setOnResetCapture(value: /* ev */ Event => _): Self = this.set("onResetCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResetCapture: Self = this.set("onResetCapture", js.undefined)
    @scala.inline
    def setOnResize(value: /* ev */ UIEvent => _): Self = this.set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    @scala.inline
    def setOnResizeCapture(value: /* ev */ UIEvent => _): Self = this.set("onResizeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResizeCapture: Self = this.set("onResizeCapture", js.undefined)
    @scala.inline
    def setOnScroll(value: /* ev */ UIEvent => _): Self = this.set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    @scala.inline
    def setOnScrollCapture(value: /* ev */ UIEvent => _): Self = this.set("onScrollCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScrollCapture: Self = this.set("onScrollCapture", js.undefined)
    @scala.inline
    def setOnSeeked(value: /* ev */ Event => _): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    @scala.inline
    def setOnSeekedCapture(value: /* ev */ Event => _): Self = this.set("onSeekedCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeekedCapture: Self = this.set("onSeekedCapture", js.undefined)
    @scala.inline
    def setOnSeeking(value: /* ev */ Event => _): Self = this.set("onSeeking", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeeking: Self = this.set("onSeeking", js.undefined)
    @scala.inline
    def setOnSeekingCapture(value: /* ev */ Event => _): Self = this.set("onSeekingCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeekingCapture: Self = this.set("onSeekingCapture", js.undefined)
    @scala.inline
    def setOnSelect(value: /* ev */ UIEvent => _): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnSelectCapture(value: /* ev */ UIEvent => _): Self = this.set("onSelectCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectCapture: Self = this.set("onSelectCapture", js.undefined)
    @scala.inline
    def setOnSelectionChange(value: /* ev */ Event => _): Self = this.set("onSelectionChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    @scala.inline
    def setOnSelectionChangeCapture(value: /* ev */ Event => _): Self = this.set("onSelectionChangeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectionChangeCapture: Self = this.set("onSelectionChangeCapture", js.undefined)
    @scala.inline
    def setOnStalled(value: /* ev */ Event => _): Self = this.set("onStalled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStalled: Self = this.set("onStalled", js.undefined)
    @scala.inline
    def setOnStalledCapture(value: /* ev */ Event => _): Self = this.set("onStalledCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStalledCapture: Self = this.set("onStalledCapture", js.undefined)
    @scala.inline
    def setOnStorage(value: /* ev */ StorageEvent => _): Self = this.set("onStorage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStorage: Self = this.set("onStorage", js.undefined)
    @scala.inline
    def setOnStorageCapture(value: /* ev */ StorageEvent => _): Self = this.set("onStorageCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStorageCapture: Self = this.set("onStorageCapture", js.undefined)
    @scala.inline
    def setOnSubmit(value: /* ev */ Event => _): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setOnSubmitCapture(value: /* ev */ Event => _): Self = this.set("onSubmitCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmitCapture: Self = this.set("onSubmitCapture", js.undefined)
    @scala.inline
    def setOnSuspend(value: /* ev */ Event => _): Self = this.set("onSuspend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuspend: Self = this.set("onSuspend", js.undefined)
    @scala.inline
    def setOnSuspendCapture(value: /* ev */ Event => _): Self = this.set("onSuspendCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuspendCapture: Self = this.set("onSuspendCapture", js.undefined)
    @scala.inline
    def setOnTimeUpdate(value: /* ev */ Event => _): Self = this.set("onTimeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    @scala.inline
    def setOnTimeUpdateCapture(value: /* ev */ Event => _): Self = this.set("onTimeUpdateCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTimeUpdateCapture: Self = this.set("onTimeUpdateCapture", js.undefined)
    @scala.inline
    def setOnTouchCancel(value: js.Any): Self = this.set("onTouchCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    @scala.inline
    def setOnTouchCancelCapture(value: js.Any): Self = this.set("onTouchCancelCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchCancelCapture: Self = this.set("onTouchCancelCapture", js.undefined)
    @scala.inline
    def setOnTouchEnd(value: js.Any): Self = this.set("onTouchEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    @scala.inline
    def setOnTouchEndCapture(value: js.Any): Self = this.set("onTouchEndCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchEndCapture: Self = this.set("onTouchEndCapture", js.undefined)
    @scala.inline
    def setOnTouchMove(value: js.Any): Self = this.set("onTouchMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    @scala.inline
    def setOnTouchMoveCapture(value: js.Any): Self = this.set("onTouchMoveCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchMoveCapture: Self = this.set("onTouchMoveCapture", js.undefined)
    @scala.inline
    def setOnTouchStart(value: js.Any): Self = this.set("onTouchStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    @scala.inline
    def setOnTouchStartCapture(value: js.Any): Self = this.set("onTouchStartCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTouchStartCapture: Self = this.set("onTouchStartCapture", js.undefined)
    @scala.inline
    def setOnUnload(value: /* ev */ Event => _): Self = this.set("onUnload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUnload: Self = this.set("onUnload", js.undefined)
    @scala.inline
    def setOnUnloadCapture(value: /* ev */ Event => _): Self = this.set("onUnloadCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUnloadCapture: Self = this.set("onUnloadCapture", js.undefined)
    @scala.inline
    def setOnVolumeChange(value: /* ev */ Event => _): Self = this.set("onVolumeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    @scala.inline
    def setOnVolumeChangeCapture(value: /* ev */ Event => _): Self = this.set("onVolumeChangeCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVolumeChangeCapture: Self = this.set("onVolumeChangeCapture", js.undefined)
    @scala.inline
    def setOnWaiting(value: /* ev */ Event => _): Self = this.set("onWaiting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWaiting: Self = this.set("onWaiting", js.undefined)
    @scala.inline
    def setOnWaitingCapture(value: /* ev */ Event => _): Self = this.set("onWaitingCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWaitingCapture: Self = this.set("onWaitingCapture", js.undefined)
    @scala.inline
    def setOnWheel(value: /* ev */ WheelEvent => _): Self = this.set("onWheel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    @scala.inline
    def setOnWheelCapture(value: /* ev */ WheelEvent => _): Self = this.set("onWheelCapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWheelCapture: Self = this.set("onWheelCapture", js.undefined)
  }
  
}

