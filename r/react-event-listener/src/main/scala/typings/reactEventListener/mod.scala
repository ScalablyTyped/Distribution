package typings.reactEventListener

import typings.react.mod.PureComponent
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-event-listener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-event-listener", JSImport.Default)
  @js.native
  class default[T /* <: EventTarget | WindowEventTargets */] ()
    extends PureComponent[EventListenerProps[T], js.Object, js.Any]
  
  @scala.inline
  def withOptions[T, TThis](handler: js.ThisFunction1[/* this */ TThis, /* ev */ T, js.Any], options: EventOptions): js.ThisFunction1[/* this */ TThis, /* ev */ T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("withOptions")(handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction1[/* this */ TThis, /* ev */ T, js.Any]]
  
  type EventListener[T /* <: EventTarget | WindowEventTargets */] = PureComponent[EventListenerProps[T], js.Object, js.Any]
  
  trait EventListenerProps[T /* <: EventTarget | WindowEventTargets */] extends StObject {
    
    var oNmsPointerUp: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]
      ] = js.undefined
    
    var oNmsPointerUpCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]
      ] = js.undefined
    
    var onAbort: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onAbortCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onAfterPrint: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onAfterPrintCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onBeforePrint: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onBeforePrintCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onBeforeUnload: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ BeforeUnloadEvent, js.Any]
      ] = js.undefined
    
    var onBeforeUnloadCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ BeforeUnloadEvent, js.Any]
      ] = js.undefined
    
    var onBlur: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, js.Any]
      ] = js.undefined
    
    var onBlurCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, js.Any]
      ] = js.undefined
    
    var onCanPlay: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onCanPlayCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onCanPlayThroughCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onClick: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onClickCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onCompassNeedsCalibration: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onCompassNeedsCalibrationCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onContextMenu: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onContextMenuCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onDblClick: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onDblClickCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onDeviceMotion: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceMotionEvent, js.Any]
      ] = js.undefined
    
    var onDeviceMotionCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceMotionEvent, js.Any]
      ] = js.undefined
    
    var onDeviceOrientation: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceOrientationEvent, js.Any]
      ] = js.undefined
    
    var onDeviceOrientationCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceOrientationEvent, js.Any]
      ] = js.undefined
    
    var onDrag: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]
      ] = js.undefined
    
    var onDragCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]
      ] = js.undefined
    
    var onDragEnd: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]
      ] = js.undefined
    
    var onDragEndCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]
      ] = js.undefined
    
    var onDragEnter: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]
      ] = js.undefined
    
    var onDragEnterCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]
      ] = js.undefined
    
    var onDragLeave: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]
      ] = js.undefined
    
    var onDragLeaveCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]
      ] = js.undefined
    
    var onDragOver: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]
      ] = js.undefined
    
    var onDragOverCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]
      ] = js.undefined
    
    var onDragStart: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]
      ] = js.undefined
    
    var onDragStartCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]
      ] = js.undefined
    
    var onDrop: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]
      ] = js.undefined
    
    var onDropCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]
      ] = js.undefined
    
    var onDurationChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onDurationChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onEmptied: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onEmptiedCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onEnded: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onEndedCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onError: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* args */ OnErrorEventHandlerArgs, js.Any]
      ] = js.undefined
    
    var onErrorCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* args */ OnErrorEventHandlerArgs, js.Any]
      ] = js.undefined
    
    var onFocus: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, js.Any]
      ] = js.undefined
    
    var onFocusCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, js.Any]
      ] = js.undefined
    
    var onHashChange: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ HashChangeEvent, js.Any]
      ] = js.undefined
    
    var onHashChangeCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ HashChangeEvent, js.Any]
      ] = js.undefined
    
    var onInput: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onInputCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onKeyDown: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, js.Any]
      ] = js.undefined
    
    var onKeyDownCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, js.Any]
      ] = js.undefined
    
    var onKeyPress: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, js.Any]
      ] = js.undefined
    
    var onKeyPressCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, js.Any]
      ] = js.undefined
    
    var onKeyUp: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, js.Any]
      ] = js.undefined
    
    var onKeyUpCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, js.Any]
      ] = js.undefined
    
    var onLoad: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onLoadCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onLoadStart: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onLoadStartCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onLoadedData: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onLoadedDataCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onLoadedMetadataCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onMessage: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MessageEvent[js.Any], js.Any]
      ] = js.undefined
    
    var onMessageCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MessageEvent[js.Any], js.Any]
      ] = js.undefined
    
    var onMouseDown: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onMouseDownCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onMouseEnter: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onMouseEnterCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onMouseLeave: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onMouseLeaveCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onMouseMove: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onMouseMoveCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onMouseOut: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onMouseOutCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onMouseOver: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onMouseOverCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onMouseUp: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onMouseUpCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]
      ] = js.undefined
    
    var onMouseWheel: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, js.Any]
      ] = js.undefined
    
    var onMouseWheelCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, js.Any]
      ] = js.undefined
    
    var onMsGestureChange: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]
      ] = js.undefined
    
    var onMsGestureChangeCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]
      ] = js.undefined
    
    var onMsGestureDoubleTap: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]
      ] = js.undefined
    
    var onMsGestureDoubleTapCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]
      ] = js.undefined
    
    var onMsGestureEnd: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]
      ] = js.undefined
    
    var onMsGestureEndCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]
      ] = js.undefined
    
    var onMsGestureHold: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]
      ] = js.undefined
    
    var onMsGestureHoldCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]
      ] = js.undefined
    
    var onMsGestureStart: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]
      ] = js.undefined
    
    var onMsGestureStartCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]
      ] = js.undefined
    
    var onMsGestureTap: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]
      ] = js.undefined
    
    var onMsGestureTapCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]
      ] = js.undefined
    
    var onMsInertiaStart: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]
      ] = js.undefined
    
    var onMsInertiaStartCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]
      ] = js.undefined
    
    var onMsPointerCancel: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]
      ] = js.undefined
    
    var onMsPointerCancelCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]
      ] = js.undefined
    
    var onMsPointerDown: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]
      ] = js.undefined
    
    var onMsPointerDownCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]
      ] = js.undefined
    
    var onMsPointerEnter: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]
      ] = js.undefined
    
    var onMsPointerEnterCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]
      ] = js.undefined
    
    var onMsPointerLeave: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]
      ] = js.undefined
    
    var onMsPointerLeaveCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]
      ] = js.undefined
    
    var onMsPointerMove: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]
      ] = js.undefined
    
    var onMsPointerMoveCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]
      ] = js.undefined
    
    var onMsPointerOut: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]
      ] = js.undefined
    
    var onMsPointerOutCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]
      ] = js.undefined
    
    var onMsPointerOver: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]
      ] = js.undefined
    
    var onMsPointerOverCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]
      ] = js.undefined
    
    var onOffline: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onOfflineCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onOnline: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onOnlineCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onOrientationChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onOrientationChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onPageHide: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, js.Any]
      ] = js.undefined
    
    var onPageHideCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, js.Any]
      ] = js.undefined
    
    var onPageShow: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, js.Any]
      ] = js.undefined
    
    var onPageShowCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, js.Any]
      ] = js.undefined
    
    var onPause: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onPauseCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onPlay: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onPlayCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onPlaying: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onPlayingCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    // Global events
    var onPointerCancel: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onPointerCancelCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onPointerDown: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onPointerDownCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onPointerEnter: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onPointerEnterCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onPointerLeave: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onPointerLeaveCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onPointerMove: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onPointerMoveCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onPointerOut: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onPointerOutCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onPointerOver: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onPointerOverCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onPointerUp: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onPointerUpCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]
      ] = js.undefined
    
    var onPopState: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PopStateEvent, js.Any]
      ] = js.undefined
    
    var onPopStateCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PopStateEvent, js.Any]
      ] = js.undefined
    
    var onProgress: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], js.Any]
      ] = js.undefined
    
    var onProgressCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], js.Any]
      ] = js.undefined
    
    var onRateChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onRateChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onReadyStateChange: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], js.Any]
      ] = js.undefined
    
    var onReadyStateChangeCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], js.Any]
      ] = js.undefined
    
    var onReset: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onResetCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onResize: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, js.Any]] = js.undefined
    
    var onResizeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, js.Any]] = js.undefined
    
    var onScroll: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, js.Any]] = js.undefined
    
    var onScrollCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, js.Any]] = js.undefined
    
    var onSeeked: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onSeekedCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onSeeking: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onSeekingCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onSelect: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, js.Any]] = js.undefined
    
    var onSelectCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, js.Any]] = js.undefined
    
    var onSelectionChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onSelectionChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onStalled: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onStalledCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onStorage: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ StorageEvent, js.Any]
      ] = js.undefined
    
    var onStorageCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ StorageEvent, js.Any]
      ] = js.undefined
    
    var onSubmit: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onSubmitCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onSuspend: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onSuspendCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onTimeUpdateCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onTouchCancel: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, js.Any]
      ] = js.undefined
    
    var onTouchCancelCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, js.Any]
      ] = js.undefined
    
    var onTouchEnd: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, js.Any]
      ] = js.undefined
    
    var onTouchEndCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, js.Any]
      ] = js.undefined
    
    var onTouchMove: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, js.Any]
      ] = js.undefined
    
    var onTouchMoveCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, js.Any]
      ] = js.undefined
    
    var onTouchStart: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, js.Any]
      ] = js.undefined
    
    var onTouchStartCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, js.Any]
      ] = js.undefined
    
    var onUnload: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onUnloadCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onVolumeChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onVolumeChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onWaiting: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onWaitingCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]] = js.undefined
    
    var onWheel: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, js.Any]
      ] = js.undefined
    
    var onWheelCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, js.Any]
      ] = js.undefined
    
    /**
      * Target (window or document)
      */
    var target: T
  }
  object EventListenerProps {
    
    @scala.inline
    def apply[T /* <: EventTarget | WindowEventTargets */](target: T): EventListenerProps[T] = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventListenerProps[T]]
    }
    
    @scala.inline
    implicit class EventListenerPropsMutableBuilder[Self <: EventListenerProps[?], T /* <: EventTarget | WindowEventTargets */] (val x: Self & EventListenerProps[T]) extends AnyVal {
      
      @scala.inline
      def setONmsPointerUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]): Self = StObject.set(x, "oNmsPointerUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setONmsPointerUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]): Self = StObject.set(x, "oNmsPointerUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setONmsPointerUpCaptureUndefined: Self = StObject.set(x, "oNmsPointerUpCapture", js.undefined)
      
      @scala.inline
      def setONmsPointerUpUndefined: Self = StObject.set(x, "oNmsPointerUp", js.undefined)
      
      @scala.inline
      def setOnAbort(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAbortCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onAbortCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAbortCaptureUndefined: Self = StObject.set(x, "onAbortCapture", js.undefined)
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAfterPrint(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onAfterPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAfterPrintCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onAfterPrintCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAfterPrintCaptureUndefined: Self = StObject.set(x, "onAfterPrintCapture", js.undefined)
      
      @scala.inline
      def setOnAfterPrintUndefined: Self = StObject.set(x, "onAfterPrint", js.undefined)
      
      @scala.inline
      def setOnBeforePrint(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onBeforePrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBeforePrintCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onBeforePrintCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBeforePrintCaptureUndefined: Self = StObject.set(x, "onBeforePrintCapture", js.undefined)
      
      @scala.inline
      def setOnBeforePrintUndefined: Self = StObject.set(x, "onBeforePrint", js.undefined)
      
      @scala.inline
      def setOnBeforeUnload(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ BeforeUnloadEvent, js.Any]): Self = StObject.set(x, "onBeforeUnload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBeforeUnloadCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ BeforeUnloadEvent, js.Any]): Self = StObject.set(x, "onBeforeUnloadCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBeforeUnloadCaptureUndefined: Self = StObject.set(x, "onBeforeUnloadCapture", js.undefined)
      
      @scala.inline
      def setOnBeforeUnloadUndefined: Self = StObject.set(x, "onBeforeUnload", js.undefined)
      
      @scala.inline
      def setOnBlur(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, js.Any]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlurCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, js.Any]): Self = StObject.set(x, "onBlurCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onCanPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCanPlayCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onCanPlayCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCanPlayCaptureUndefined: Self = StObject.set(x, "onCanPlayCapture", js.undefined)
      
      @scala.inline
      def setOnCanPlayThrough(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onCanPlayThrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCanPlayThroughCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onCanPlayThroughCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCanPlayThroughCaptureUndefined: Self = StObject.set(x, "onCanPlayThroughCapture", js.undefined)
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeCaptureUndefined: Self = StObject.set(x, "onChangeCapture", js.undefined)
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompassNeedsCalibration(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onCompassNeedsCalibration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompassNeedsCalibrationCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onCompassNeedsCalibrationCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompassNeedsCalibrationCaptureUndefined: Self = StObject.set(x, "onCompassNeedsCalibrationCapture", js.undefined)
      
      @scala.inline
      def setOnCompassNeedsCalibrationUndefined: Self = StObject.set(x, "onCompassNeedsCalibration", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnContextMenuCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onContextMenuCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnDblClick(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onDblClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDblClickCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onDblClickCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDblClickCaptureUndefined: Self = StObject.set(x, "onDblClickCapture", js.undefined)
      
      @scala.inline
      def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
      
      @scala.inline
      def setOnDeviceMotion(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceMotionEvent, js.Any]): Self = StObject.set(x, "onDeviceMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeviceMotionCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceMotionEvent, js.Any]): Self = StObject.set(x, "onDeviceMotionCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeviceMotionCaptureUndefined: Self = StObject.set(x, "onDeviceMotionCapture", js.undefined)
      
      @scala.inline
      def setOnDeviceMotionUndefined: Self = StObject.set(x, "onDeviceMotion", js.undefined)
      
      @scala.inline
      def setOnDeviceOrientation(
        value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceOrientationEvent, js.Any]
      ): Self = StObject.set(x, "onDeviceOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeviceOrientationCapture(
        value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceOrientationEvent, js.Any]
      ): Self = StObject.set(x, "onDeviceOrientationCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeviceOrientationCaptureUndefined: Self = StObject.set(x, "onDeviceOrientationCapture", js.undefined)
      
      @scala.inline
      def setOnDeviceOrientationUndefined: Self = StObject.set(x, "onDeviceOrientation", js.undefined)
      
      @scala.inline
      def setOnDrag(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "onDragCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
      
      @scala.inline
      def setOnDragEnd(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragEndCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "onDragEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "onDragEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "onDragEnterCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "onDragLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "onDragLeaveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "onDragOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "onDragOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "onDragStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDropCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "onDropCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onDurationChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDurationChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onDurationChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDurationChangeCaptureUndefined: Self = StObject.set(x, "onDurationChangeCapture", js.undefined)
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onEmptied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEmptiedCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onEmptiedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEmptiedCaptureUndefined: Self = StObject.set(x, "onEmptiedCapture", js.undefined)
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEnded(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEndedCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onEndedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEndedCaptureUndefined: Self = StObject.set(x, "onEndedCapture", js.undefined)
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(
        value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* args */ OnErrorEventHandlerArgs, js.Any]
      ): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnErrorCapture(
        value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* args */ OnErrorEventHandlerArgs, js.Any]
      ): Self = StObject.set(x, "onErrorCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnErrorCaptureUndefined: Self = StObject.set(x, "onErrorCapture", js.undefined)
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, js.Any]): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFocusCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, js.Any]): Self = StObject.set(x, "onFocusCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnHashChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ HashChangeEvent, js.Any]): Self = StObject.set(x, "onHashChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnHashChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ HashChangeEvent, js.Any]): Self = StObject.set(x, "onHashChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnHashChangeCaptureUndefined: Self = StObject.set(x, "onHashChangeCapture", js.undefined)
      
      @scala.inline
      def setOnHashChangeUndefined: Self = StObject.set(x, "onHashChange", js.undefined)
      
      @scala.inline
      def setOnInput(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnInputCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onInputCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnInputCaptureUndefined: Self = StObject.set(x, "onInputCapture", js.undefined)
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, js.Any]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, js.Any]): Self = StObject.set(x, "onKeyDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, js.Any]): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyPressCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, js.Any]): Self = StObject.set(x, "onKeyPressCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyPressCaptureUndefined: Self = StObject.set(x, "onKeyPressCapture", js.undefined)
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, js.Any]): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, js.Any]): Self = StObject.set(x, "onKeyUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onLoadCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadCaptureUndefined: Self = StObject.set(x, "onLoadCapture", js.undefined)
      
      @scala.inline
      def setOnLoadStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onLoadStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onLoadStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadStartCaptureUndefined: Self = StObject.set(x, "onLoadStartCapture", js.undefined)
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onLoadedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadedDataCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onLoadedDataCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadedDataCaptureUndefined: Self = StObject.set(x, "onLoadedDataCapture", js.undefined)
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onLoadedMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadedMetadataCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onLoadedMetadataCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadedMetadataCaptureUndefined: Self = StObject.set(x, "onLoadedMetadataCapture", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMessage(
        value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MessageEvent[js.Any], js.Any]
      ): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMessageCapture(
        value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MessageEvent[js.Any], js.Any]
      ): Self = StObject.set(x, "onMessageCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMessageCaptureUndefined: Self = StObject.set(x, "onMessageCapture", js.undefined)
      
      @scala.inline
      def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onMouseDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onMouseEnterCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseEnterCaptureUndefined: Self = StObject.set(x, "onMouseEnterCapture", js.undefined)
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onMouseLeaveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseLeaveCaptureUndefined: Self = StObject.set(x, "onMouseLeaveCapture", js.undefined)
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onMouseMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseOutCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onMouseOutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onMouseOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onMouseUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnMouseWheel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, js.Any]): Self = StObject.set(x, "onMouseWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseWheelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, js.Any]): Self = StObject.set(x, "onMouseWheelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseWheelCaptureUndefined: Self = StObject.set(x, "onMouseWheelCapture", js.undefined)
      
      @scala.inline
      def setOnMouseWheelUndefined: Self = StObject.set(x, "onMouseWheel", js.undefined)
      
      @scala.inline
      def setOnMsGestureChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]): Self = StObject.set(x, "onMsGestureChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsGestureChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]): Self = StObject.set(x, "onMsGestureChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsGestureChangeCaptureUndefined: Self = StObject.set(x, "onMsGestureChangeCapture", js.undefined)
      
      @scala.inline
      def setOnMsGestureChangeUndefined: Self = StObject.set(x, "onMsGestureChange", js.undefined)
      
      @scala.inline
      def setOnMsGestureDoubleTap(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]): Self = StObject.set(x, "onMsGestureDoubleTap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsGestureDoubleTapCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]): Self = StObject.set(x, "onMsGestureDoubleTapCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsGestureDoubleTapCaptureUndefined: Self = StObject.set(x, "onMsGestureDoubleTapCapture", js.undefined)
      
      @scala.inline
      def setOnMsGestureDoubleTapUndefined: Self = StObject.set(x, "onMsGestureDoubleTap", js.undefined)
      
      @scala.inline
      def setOnMsGestureEnd(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]): Self = StObject.set(x, "onMsGestureEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsGestureEndCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]): Self = StObject.set(x, "onMsGestureEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsGestureEndCaptureUndefined: Self = StObject.set(x, "onMsGestureEndCapture", js.undefined)
      
      @scala.inline
      def setOnMsGestureEndUndefined: Self = StObject.set(x, "onMsGestureEnd", js.undefined)
      
      @scala.inline
      def setOnMsGestureHold(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]): Self = StObject.set(x, "onMsGestureHold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsGestureHoldCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]): Self = StObject.set(x, "onMsGestureHoldCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsGestureHoldCaptureUndefined: Self = StObject.set(x, "onMsGestureHoldCapture", js.undefined)
      
      @scala.inline
      def setOnMsGestureHoldUndefined: Self = StObject.set(x, "onMsGestureHold", js.undefined)
      
      @scala.inline
      def setOnMsGestureStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]): Self = StObject.set(x, "onMsGestureStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsGestureStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]): Self = StObject.set(x, "onMsGestureStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsGestureStartCaptureUndefined: Self = StObject.set(x, "onMsGestureStartCapture", js.undefined)
      
      @scala.inline
      def setOnMsGestureStartUndefined: Self = StObject.set(x, "onMsGestureStart", js.undefined)
      
      @scala.inline
      def setOnMsGestureTap(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]): Self = StObject.set(x, "onMsGestureTap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsGestureTapCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]): Self = StObject.set(x, "onMsGestureTapCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsGestureTapCaptureUndefined: Self = StObject.set(x, "onMsGestureTapCapture", js.undefined)
      
      @scala.inline
      def setOnMsGestureTapUndefined: Self = StObject.set(x, "onMsGestureTap", js.undefined)
      
      @scala.inline
      def setOnMsInertiaStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]): Self = StObject.set(x, "onMsInertiaStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsInertiaStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, js.Any]): Self = StObject.set(x, "onMsInertiaStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsInertiaStartCaptureUndefined: Self = StObject.set(x, "onMsInertiaStartCapture", js.undefined)
      
      @scala.inline
      def setOnMsInertiaStartUndefined: Self = StObject.set(x, "onMsInertiaStart", js.undefined)
      
      @scala.inline
      def setOnMsPointerCancel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]): Self = StObject.set(x, "onMsPointerCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsPointerCancelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]): Self = StObject.set(x, "onMsPointerCancelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsPointerCancelCaptureUndefined: Self = StObject.set(x, "onMsPointerCancelCapture", js.undefined)
      
      @scala.inline
      def setOnMsPointerCancelUndefined: Self = StObject.set(x, "onMsPointerCancel", js.undefined)
      
      @scala.inline
      def setOnMsPointerDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]): Self = StObject.set(x, "onMsPointerDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsPointerDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]): Self = StObject.set(x, "onMsPointerDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsPointerDownCaptureUndefined: Self = StObject.set(x, "onMsPointerDownCapture", js.undefined)
      
      @scala.inline
      def setOnMsPointerDownUndefined: Self = StObject.set(x, "onMsPointerDown", js.undefined)
      
      @scala.inline
      def setOnMsPointerEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]): Self = StObject.set(x, "onMsPointerEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsPointerEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]): Self = StObject.set(x, "onMsPointerEnterCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsPointerEnterCaptureUndefined: Self = StObject.set(x, "onMsPointerEnterCapture", js.undefined)
      
      @scala.inline
      def setOnMsPointerEnterUndefined: Self = StObject.set(x, "onMsPointerEnter", js.undefined)
      
      @scala.inline
      def setOnMsPointerLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]): Self = StObject.set(x, "onMsPointerLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsPointerLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]): Self = StObject.set(x, "onMsPointerLeaveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsPointerLeaveCaptureUndefined: Self = StObject.set(x, "onMsPointerLeaveCapture", js.undefined)
      
      @scala.inline
      def setOnMsPointerLeaveUndefined: Self = StObject.set(x, "onMsPointerLeave", js.undefined)
      
      @scala.inline
      def setOnMsPointerMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]): Self = StObject.set(x, "onMsPointerMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsPointerMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]): Self = StObject.set(x, "onMsPointerMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsPointerMoveCaptureUndefined: Self = StObject.set(x, "onMsPointerMoveCapture", js.undefined)
      
      @scala.inline
      def setOnMsPointerMoveUndefined: Self = StObject.set(x, "onMsPointerMove", js.undefined)
      
      @scala.inline
      def setOnMsPointerOut(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]): Self = StObject.set(x, "onMsPointerOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsPointerOutCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]): Self = StObject.set(x, "onMsPointerOutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsPointerOutCaptureUndefined: Self = StObject.set(x, "onMsPointerOutCapture", js.undefined)
      
      @scala.inline
      def setOnMsPointerOutUndefined: Self = StObject.set(x, "onMsPointerOut", js.undefined)
      
      @scala.inline
      def setOnMsPointerOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]): Self = StObject.set(x, "onMsPointerOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsPointerOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, js.Any]): Self = StObject.set(x, "onMsPointerOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMsPointerOverCaptureUndefined: Self = StObject.set(x, "onMsPointerOverCapture", js.undefined)
      
      @scala.inline
      def setOnMsPointerOverUndefined: Self = StObject.set(x, "onMsPointerOver", js.undefined)
      
      @scala.inline
      def setOnOffline(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onOffline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOfflineCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onOfflineCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOfflineCaptureUndefined: Self = StObject.set(x, "onOfflineCapture", js.undefined)
      
      @scala.inline
      def setOnOfflineUndefined: Self = StObject.set(x, "onOffline", js.undefined)
      
      @scala.inline
      def setOnOnline(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onOnline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOnlineCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onOnlineCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOnlineCaptureUndefined: Self = StObject.set(x, "onOnlineCapture", js.undefined)
      
      @scala.inline
      def setOnOnlineUndefined: Self = StObject.set(x, "onOnline", js.undefined)
      
      @scala.inline
      def setOnOrientationChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onOrientationChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOrientationChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onOrientationChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOrientationChangeCaptureUndefined: Self = StObject.set(x, "onOrientationChangeCapture", js.undefined)
      
      @scala.inline
      def setOnOrientationChangeUndefined: Self = StObject.set(x, "onOrientationChange", js.undefined)
      
      @scala.inline
      def setOnPageHide(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, js.Any]): Self = StObject.set(x, "onPageHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPageHideCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, js.Any]): Self = StObject.set(x, "onPageHideCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPageHideCaptureUndefined: Self = StObject.set(x, "onPageHideCapture", js.undefined)
      
      @scala.inline
      def setOnPageHideUndefined: Self = StObject.set(x, "onPageHide", js.undefined)
      
      @scala.inline
      def setOnPageShow(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, js.Any]): Self = StObject.set(x, "onPageShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPageShowCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, js.Any]): Self = StObject.set(x, "onPageShowCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPageShowCaptureUndefined: Self = StObject.set(x, "onPageShowCapture", js.undefined)
      
      @scala.inline
      def setOnPageShowUndefined: Self = StObject.set(x, "onPageShow", js.undefined)
      
      @scala.inline
      def setOnPause(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPauseCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onPauseCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPauseCaptureUndefined: Self = StObject.set(x, "onPauseCapture", js.undefined)
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPlayCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onPlayCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPlayCaptureUndefined: Self = StObject.set(x, "onPlayCapture", js.undefined)
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPlayingCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onPlayingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPlayingCaptureUndefined: Self = StObject.set(x, "onPlayingCapture", js.undefined)
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerCancelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onPointerCancelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onPointerDownCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onPointerEnterCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onPointerLeaveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onPointerMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onPointerOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerOutCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onPointerOutCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onPointerOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onPointerOverCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onPointerUpCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnPopState(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PopStateEvent, js.Any]): Self = StObject.set(x, "onPopState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPopStateCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PopStateEvent, js.Any]): Self = StObject.set(x, "onPopStateCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPopStateCaptureUndefined: Self = StObject.set(x, "onPopStateCapture", js.undefined)
      
      @scala.inline
      def setOnPopStateUndefined: Self = StObject.set(x, "onPopState", js.undefined)
      
      @scala.inline
      def setOnProgress(
        value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], js.Any]
      ): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnProgressCapture(
        value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], js.Any]
      ): Self = StObject.set(x, "onProgressCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnProgressCaptureUndefined: Self = StObject.set(x, "onProgressCapture", js.undefined)
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onRateChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRateChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onRateChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRateChangeCaptureUndefined: Self = StObject.set(x, "onRateChangeCapture", js.undefined)
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReadyStateChange(
        value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], js.Any]
      ): Self = StObject.set(x, "onReadyStateChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReadyStateChangeCapture(
        value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], js.Any]
      ): Self = StObject.set(x, "onReadyStateChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReadyStateChangeCaptureUndefined: Self = StObject.set(x, "onReadyStateChangeCapture", js.undefined)
      
      @scala.inline
      def setOnReadyStateChangeUndefined: Self = StObject.set(x, "onReadyStateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResetCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onResetCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResetCaptureUndefined: Self = StObject.set(x, "onResetCapture", js.undefined)
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnResize(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, js.Any]): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResizeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, js.Any]): Self = StObject.set(x, "onResizeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResizeCaptureUndefined: Self = StObject.set(x, "onResizeCapture", js.undefined)
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setOnScroll(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, js.Any]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScrollCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, js.Any]): Self = StObject.set(x, "onScrollCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onSeeked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSeekedCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onSeekedCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSeekedCaptureUndefined: Self = StObject.set(x, "onSeekedCapture", js.undefined)
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onSeeking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSeekingCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onSeekingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSeekingCaptureUndefined: Self = StObject.set(x, "onSeekingCapture", js.undefined)
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, js.Any]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, js.Any]): Self = StObject.set(x, "onSelectCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectCaptureUndefined: Self = StObject.set(x, "onSelectCapture", js.undefined)
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnSelectionChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onSelectionChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectionChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onSelectionChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectionChangeCaptureUndefined: Self = StObject.set(x, "onSelectionChangeCapture", js.undefined)
      
      @scala.inline
      def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      @scala.inline
      def setOnStalled(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onStalled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStalledCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onStalledCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStalledCaptureUndefined: Self = StObject.set(x, "onStalledCapture", js.undefined)
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnStorage(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ StorageEvent, js.Any]): Self = StObject.set(x, "onStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStorageCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ StorageEvent, js.Any]): Self = StObject.set(x, "onStorageCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStorageCaptureUndefined: Self = StObject.set(x, "onStorageCapture", js.undefined)
      
      @scala.inline
      def setOnStorageUndefined: Self = StObject.set(x, "onStorage", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSubmitCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onSubmitCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSubmitCaptureUndefined: Self = StObject.set(x, "onSubmitCapture", js.undefined)
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onSuspend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSuspendCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onSuspendCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSuspendCaptureUndefined: Self = StObject.set(x, "onSuspendCapture", js.undefined)
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onTimeUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTimeUpdateCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onTimeUpdateCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTimeUpdateCaptureUndefined: Self = StObject.set(x, "onTimeUpdateCapture", js.undefined)
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchCancelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "onTouchCancelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchEndCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "onTouchEndCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "onTouchMoveCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "onTouchStartCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnUnload(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onUnload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUnloadCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onUnloadCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUnloadCaptureUndefined: Self = StObject.set(x, "onUnloadCapture", js.undefined)
      
      @scala.inline
      def setOnUnloadUndefined: Self = StObject.set(x, "onUnload", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onVolumeChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnVolumeChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onVolumeChangeCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnVolumeChangeCaptureUndefined: Self = StObject.set(x, "onVolumeChangeCapture", js.undefined)
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnWaitingCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, js.Any]): Self = StObject.set(x, "onWaitingCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnWaitingCaptureUndefined: Self = StObject.set(x, "onWaitingCapture", js.undefined)
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, js.Any]): Self = StObject.set(x, "onWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnWheelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, js.Any]): Self = StObject.set(x, "onWheelCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setTarget(value: T): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type EventListenerThisType[T /* <: EventTarget | WindowEventTargets */] = T | (/* import warning: importer.ImportType#apply Failed type conversion: std.Window[T] */ js.Any)
  
  /* Inlined parent std.Pick<std.AddEventListenerOptions, 'capture' | 'passive'> */
  trait EventOptions extends StObject {
    
    var capture: js.UndefOr[Boolean] = js.undefined
    
    var passive: js.UndefOr[Boolean] = js.undefined
  }
  object EventOptions {
    
    @scala.inline
    def apply(): EventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventOptions]
    }
    
    @scala.inline
    implicit class EventOptionsMutableBuilder[Self <: EventOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
    }
  }
  
  type OnErrorEventHandlerArgs = js.Array[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactEventListener.reactEventListenerStrings.locationbar
    - typings.reactEventListener.reactEventListenerStrings.onmspointerleave
    - scala.Unit
    - typings.reactEventListener.reactEventListenerStrings.opener
    - typings.reactEventListener.reactEventListenerStrings.window
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplayactivate
    - typings.reactEventListener.reactEventListenerStrings.speechSynthesis
    - typings.reactEventListener.reactEventListenerStrings.onmsgesturechange
    - typings.reactEventListener.reactEventListenerStrings.styleMedia
    - typings.reactEventListener.reactEventListenerStrings.scrollX
    - typings.reactEventListener.reactEventListenerStrings.defaultStatus
    - typings.reactEventListener.reactEventListenerStrings.ondevicelight
    - typings.reactEventListener.reactEventListenerStrings.innerHeight
    - typings.reactEventListener.reactEventListenerStrings.screen
    - typings.reactEventListener.reactEventListenerStrings.statusbar
    - typings.reactEventListener.reactEventListenerStrings.location
    - typings.reactEventListener.reactEventListenerStrings.history
    - typings.reactEventListener.reactEventListenerStrings.status
    - typings.reactEventListener.reactEventListenerStrings.onreadystatechange
    - typings.reactEventListener.reactEventListenerStrings.screenTop
    - typings.reactEventListener.reactEventListenerStrings.offscreenBuffering
    - typings.reactEventListener.reactEventListenerStrings.onmspointerdown
    - typings.reactEventListener.reactEventListenerStrings.name
    - typings.reactEventListener.reactEventListenerStrings.onmspointerout
    - typings.reactEventListener.reactEventListenerStrings.menubar
    - typings.reactEventListener.reactEventListenerStrings.onmspointermove
    - typings.reactEventListener.reactEventListenerStrings.doNotTrack
    - typings.reactEventListener.reactEventListenerStrings.oncompassneedscalibration
    - typings.reactEventListener.reactEventListenerStrings.self
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplaypointerrestricted
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplaypresentchange
    - typings.reactEventListener.reactEventListenerStrings.onmspointerup
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplaydeactivate
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplaypointerunrestricted
    - typings.reactEventListener.reactEventListenerStrings.outerWidth
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplayfocus
    - typings.reactEventListener.reactEventListenerStrings.onmsgesturedoubletap
    - typings.reactEventListener.reactEventListenerStrings.msContentScript
    - typings.reactEventListener.reactEventListenerStrings.ondevicemotion
    - typings.reactEventListener.reactEventListenerStrings.outerHeight
    - typings.reactEventListener.reactEventListenerStrings.scrollbars
    - typings.reactEventListener.reactEventListenerStrings.frameElement
    - typings.reactEventListener.reactEventListenerStrings.clientInformation
    - typings.reactEventListener.reactEventListenerStrings.devicePixelRatio
    - typings.reactEventListener.reactEventListenerStrings.pageXOffset
    - typings.reactEventListener.reactEventListenerStrings.pageYOffset
    - typings.reactEventListener.reactEventListenerStrings.length
    - typings.reactEventListener.reactEventListenerStrings.toolbar
    - typings.reactEventListener.reactEventListenerStrings.onmsgesturestart
    - typings.reactEventListener.reactEventListenerStrings.onmsinertiastart
    - typings.reactEventListener.reactEventListenerStrings.visualViewport
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplayconnect
    - typings.reactEventListener.reactEventListenerStrings.onorientationchange
    - typings.reactEventListener.reactEventListenerStrings.scrollY
    - typings.reactEventListener.reactEventListenerStrings.onmspointerenter
    - typings.reactEventListener.reactEventListenerStrings.navigator
    - typings.reactEventListener.reactEventListenerStrings.orientation
    - typings.reactEventListener.reactEventListenerStrings.onmspointerover
    - typings.reactEventListener.reactEventListenerStrings.event
    - typings.reactEventListener.reactEventListenerStrings.top
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplaydisconnect
    - typings.reactEventListener.reactEventListenerStrings.screenY
    - typings.reactEventListener.reactEventListenerStrings.innerWidth
    - typings.reactEventListener.reactEventListenerStrings.applicationCache
    - typings.reactEventListener.reactEventListenerStrings.onmsgesturehold
    - typings.reactEventListener.reactEventListenerStrings.parent
    - typings.reactEventListener.reactEventListenerStrings.customElements
    - typings.reactEventListener.reactEventListenerStrings.document
    - typings.reactEventListener.reactEventListenerStrings.onmousewheel
    - typings.reactEventListener.reactEventListenerStrings.screenX
    - typings.reactEventListener.reactEventListenerStrings.external
    - typings.reactEventListener.reactEventListenerStrings.onvrdisplayblur
    - typings.reactEventListener.reactEventListenerStrings.onmsgesturetap
    - typings.reactEventListener.reactEventListenerStrings.frames
    - typings.reactEventListener.reactEventListenerStrings.ondeviceorientation
    - typings.reactEventListener.reactEventListenerStrings.closed
    - typings.reactEventListener.reactEventListenerStrings.onmspointercancel
    - typings.reactEventListener.reactEventListenerStrings.personalbar
    - typings.reactEventListener.reactEventListenerStrings.onmsgestureend
    - typings.reactEventListener.reactEventListenerStrings.ondeviceorientationabsolute
    - typings.reactEventListener.reactEventListenerStrings.screenLeft
  */
  type WindowEventTargets = js.UndefOr[_WindowEventTargets]
  
  trait _WindowEventTargets extends StObject
}
