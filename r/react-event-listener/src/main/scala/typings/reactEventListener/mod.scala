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
  open class default[T /* <: EventTarget | WindowEventTargets */] ()
    extends PureComponent[EventListenerProps[T], js.Object, Any]
  
  inline def withOptions[T, TThis](handler: js.ThisFunction1[/* this */ TThis, /* ev */ T, Any], options: EventOptions): js.ThisFunction1[/* this */ TThis, /* ev */ T, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("withOptions")(handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction1[/* this */ TThis, /* ev */ T, Any]]
  
  type EventListener[T /* <: EventTarget | WindowEventTargets */] = PureComponent[EventListenerProps[T], js.Object, Any]
  
  trait EventListenerProps[T /* <: EventTarget | WindowEventTargets */] extends StObject {
    
    var onAbort: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onAbortCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onAfterPrint: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onAfterPrintCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onBeforePrint: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onBeforePrintCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onBeforeUnload: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ BeforeUnloadEvent, Any]
      ] = js.undefined
    
    var onBeforeUnloadCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ BeforeUnloadEvent, Any]
      ] = js.undefined
    
    var onBlur: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, Any]] = js.undefined
    
    var onBlurCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, Any]] = js.undefined
    
    var onCanPlay: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onCanPlayCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onCanPlayThrough: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onCanPlayThroughCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onClick: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onClickCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onCompassNeedsCalibration: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onCompassNeedsCalibrationCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onContextMenu: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onContextMenuCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onDblClick: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onDblClickCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onDeviceMotion: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceMotionEvent, Any]
      ] = js.undefined
    
    var onDeviceMotionCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceMotionEvent, Any]
      ] = js.undefined
    
    var onDeviceOrientation: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceOrientationEvent, Any]
      ] = js.undefined
    
    var onDeviceOrientationCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceOrientationEvent, Any]
      ] = js.undefined
    
    var onDrag: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]] = js.undefined
    
    var onDragCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]] = js.undefined
    
    var onDragEnd: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]] = js.undefined
    
    var onDragEndCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]] = js.undefined
    
    var onDragEnter: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]] = js.undefined
    
    var onDragEnterCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]] = js.undefined
    
    var onDragLeave: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]] = js.undefined
    
    var onDragLeaveCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]] = js.undefined
    
    var onDragOver: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]] = js.undefined
    
    var onDragOverCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]] = js.undefined
    
    var onDragStart: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]] = js.undefined
    
    var onDragStartCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]] = js.undefined
    
    var onDrop: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]] = js.undefined
    
    var onDropCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]] = js.undefined
    
    var onDurationChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onDurationChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onEmptied: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onEmptiedCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onEnded: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onEndedCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onError: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* args */ OnErrorEventHandlerArgs, Any]
      ] = js.undefined
    
    var onErrorCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* args */ OnErrorEventHandlerArgs, Any]
      ] = js.undefined
    
    var onFocus: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, Any]] = js.undefined
    
    var onFocusCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, Any]] = js.undefined
    
    var onHashChange: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ HashChangeEvent, Any]
      ] = js.undefined
    
    var onHashChangeCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ HashChangeEvent, Any]
      ] = js.undefined
    
    var onInput: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onInputCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onKeyDown: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]
      ] = js.undefined
    
    var onKeyDownCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]
      ] = js.undefined
    
    var onKeyPress: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]
      ] = js.undefined
    
    var onKeyPressCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]
      ] = js.undefined
    
    var onKeyUp: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]
      ] = js.undefined
    
    var onKeyUpCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]
      ] = js.undefined
    
    var onLoad: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onLoadCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onLoadStart: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onLoadStartCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onLoadedData: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onLoadedDataCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onLoadedMetadata: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onLoadedMetadataCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onMessage: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MessageEvent[Any], Any]
      ] = js.undefined
    
    var onMessageCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MessageEvent[Any], Any]
      ] = js.undefined
    
    var onMouseDown: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onMouseDownCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onMouseEnterCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onMouseLeaveCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onMouseMove: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onMouseMoveCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onMouseOut: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onMouseOutCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onMouseOver: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onMouseOverCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onMouseUp: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onMouseUpCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]] = js.undefined
    
    var onMouseWheel: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, Any]] = js.undefined
    
    var onMouseWheelCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, Any]] = js.undefined
    
    var onOffline: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onOfflineCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onOnline: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onOnlineCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onOrientationChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onOrientationChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onPageHide: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, Any]
      ] = js.undefined
    
    var onPageHideCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, Any]
      ] = js.undefined
    
    var onPageShow: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, Any]
      ] = js.undefined
    
    var onPageShowCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, Any]
      ] = js.undefined
    
    var onPause: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onPauseCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onPlay: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onPlayCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onPlaying: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onPlayingCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    // Global events
    var onPointerCancel: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onPointerCancelCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onPointerDown: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onPointerDownCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onPointerEnter: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onPointerEnterCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onPointerLeave: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onPointerLeaveCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onPointerMove: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onPointerMoveCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onPointerOut: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onPointerOutCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onPointerOver: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onPointerOverCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onPointerUp: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onPointerUpCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]
      ] = js.undefined
    
    var onPopState: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PopStateEvent, Any]
      ] = js.undefined
    
    var onPopStateCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PopStateEvent, Any]
      ] = js.undefined
    
    var onProgress: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], Any]
      ] = js.undefined
    
    var onProgressCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], Any]
      ] = js.undefined
    
    var onRateChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onRateChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onReadyStateChange: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], Any]
      ] = js.undefined
    
    var onReadyStateChangeCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], Any]
      ] = js.undefined
    
    var onReset: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onResetCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onResize: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]] = js.undefined
    
    var onResizeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]] = js.undefined
    
    var onScroll: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]] = js.undefined
    
    var onScrollCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]] = js.undefined
    
    var onSeeked: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onSeekedCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onSeeking: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onSeekingCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onSelect: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]] = js.undefined
    
    var onSelectCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]] = js.undefined
    
    var onSelectionChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onSelectionChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onStalled: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onStalledCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onStorage: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ StorageEvent, Any]
      ] = js.undefined
    
    var onStorageCapture: js.UndefOr[
        js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ StorageEvent, Any]
      ] = js.undefined
    
    var onSubmit: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onSubmitCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onSuspend: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onSuspendCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onTimeUpdate: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onTimeUpdateCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onTouchCancel: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]] = js.undefined
    
    var onTouchCancelCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]] = js.undefined
    
    var onTouchEnd: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]] = js.undefined
    
    var onTouchEndCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]] = js.undefined
    
    var onTouchMove: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]] = js.undefined
    
    var onTouchMoveCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]] = js.undefined
    
    var onTouchStart: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]] = js.undefined
    
    var onTouchStartCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]] = js.undefined
    
    var onUnload: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onUnloadCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onVolumeChange: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onVolumeChangeCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onWaiting: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onWaitingCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]] = js.undefined
    
    var onWheel: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, Any]] = js.undefined
    
    var onWheelCapture: js.UndefOr[js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, Any]] = js.undefined
    
    /**
      * Target (window or document)
      */
    var target: T
  }
  object EventListenerProps {
    
    inline def apply[T /* <: EventTarget | WindowEventTargets */](target: T): EventListenerProps[T] = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventListenerProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventListenerProps[?], T /* <: EventTarget | WindowEventTargets */] (val x: Self & EventListenerProps[T]) extends AnyVal {
      
      inline def setOnAbort(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onAbort", value.asInstanceOf[js.Any])
      
      inline def setOnAbortCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onAbortCapture", value.asInstanceOf[js.Any])
      
      inline def setOnAbortCaptureUndefined: Self = StObject.set(x, "onAbortCapture", js.undefined)
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnAfterPrint(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onAfterPrint", value.asInstanceOf[js.Any])
      
      inline def setOnAfterPrintCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onAfterPrintCapture", value.asInstanceOf[js.Any])
      
      inline def setOnAfterPrintCaptureUndefined: Self = StObject.set(x, "onAfterPrintCapture", js.undefined)
      
      inline def setOnAfterPrintUndefined: Self = StObject.set(x, "onAfterPrint", js.undefined)
      
      inline def setOnBeforePrint(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onBeforePrint", value.asInstanceOf[js.Any])
      
      inline def setOnBeforePrintCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onBeforePrintCapture", value.asInstanceOf[js.Any])
      
      inline def setOnBeforePrintCaptureUndefined: Self = StObject.set(x, "onBeforePrintCapture", js.undefined)
      
      inline def setOnBeforePrintUndefined: Self = StObject.set(x, "onBeforePrint", js.undefined)
      
      inline def setOnBeforeUnload(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ BeforeUnloadEvent, Any]): Self = StObject.set(x, "onBeforeUnload", value.asInstanceOf[js.Any])
      
      inline def setOnBeforeUnloadCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ BeforeUnloadEvent, Any]): Self = StObject.set(x, "onBeforeUnloadCapture", value.asInstanceOf[js.Any])
      
      inline def setOnBeforeUnloadCaptureUndefined: Self = StObject.set(x, "onBeforeUnloadCapture", js.undefined)
      
      inline def setOnBeforeUnloadUndefined: Self = StObject.set(x, "onBeforeUnload", js.undefined)
      
      inline def setOnBlur(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, Any]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      inline def setOnBlurCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, Any]): Self = StObject.set(x, "onBlurCapture", value.asInstanceOf[js.Any])
      
      inline def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCanPlay(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onCanPlay", value.asInstanceOf[js.Any])
      
      inline def setOnCanPlayCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onCanPlayCapture", value.asInstanceOf[js.Any])
      
      inline def setOnCanPlayCaptureUndefined: Self = StObject.set(x, "onCanPlayCapture", js.undefined)
      
      inline def setOnCanPlayThrough(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onCanPlayThrough", value.asInstanceOf[js.Any])
      
      inline def setOnCanPlayThroughCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onCanPlayThroughCapture", value.asInstanceOf[js.Any])
      
      inline def setOnCanPlayThroughCaptureUndefined: Self = StObject.set(x, "onCanPlayThroughCapture", js.undefined)
      
      inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      inline def setOnChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onChangeCapture", value.asInstanceOf[js.Any])
      
      inline def setOnChangeCaptureUndefined: Self = StObject.set(x, "onChangeCapture", js.undefined)
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onClickCapture", value.asInstanceOf[js.Any])
      
      inline def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCompassNeedsCalibration(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onCompassNeedsCalibration", value.asInstanceOf[js.Any])
      
      inline def setOnCompassNeedsCalibrationCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onCompassNeedsCalibrationCapture", value.asInstanceOf[js.Any])
      
      inline def setOnCompassNeedsCalibrationCaptureUndefined: Self = StObject.set(x, "onCompassNeedsCalibrationCapture", js.undefined)
      
      inline def setOnCompassNeedsCalibrationUndefined: Self = StObject.set(x, "onCompassNeedsCalibration", js.undefined)
      
      inline def setOnContextMenu(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
      
      inline def setOnContextMenuCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onContextMenuCapture", value.asInstanceOf[js.Any])
      
      inline def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnDblClick(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onDblClick", value.asInstanceOf[js.Any])
      
      inline def setOnDblClickCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onDblClickCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDblClickCaptureUndefined: Self = StObject.set(x, "onDblClickCapture", js.undefined)
      
      inline def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
      
      inline def setOnDeviceMotion(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceMotionEvent, Any]): Self = StObject.set(x, "onDeviceMotion", value.asInstanceOf[js.Any])
      
      inline def setOnDeviceMotionCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceMotionEvent, Any]): Self = StObject.set(x, "onDeviceMotionCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDeviceMotionCaptureUndefined: Self = StObject.set(x, "onDeviceMotionCapture", js.undefined)
      
      inline def setOnDeviceMotionUndefined: Self = StObject.set(x, "onDeviceMotion", js.undefined)
      
      inline def setOnDeviceOrientation(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceOrientationEvent, Any]): Self = StObject.set(x, "onDeviceOrientation", value.asInstanceOf[js.Any])
      
      inline def setOnDeviceOrientationCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceOrientationEvent, Any]): Self = StObject.set(x, "onDeviceOrientationCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDeviceOrientationCaptureUndefined: Self = StObject.set(x, "onDeviceOrientationCapture", js.undefined)
      
      inline def setOnDeviceOrientationUndefined: Self = StObject.set(x, "onDeviceOrientation", js.undefined)
      
      inline def setOnDrag(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
      
      inline def setOnDragCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): Self = StObject.set(x, "onDragCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
      
      inline def setOnDragEnd(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
      
      inline def setOnDragEndCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): Self = StObject.set(x, "onDragEndCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): Self = StObject.set(x, "onDragEnter", value.asInstanceOf[js.Any])
      
      inline def setOnDragEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): Self = StObject.set(x, "onDragEnterCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): Self = StObject.set(x, "onDragLeave", value.asInstanceOf[js.Any])
      
      inline def setOnDragLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): Self = StObject.set(x, "onDragLeaveCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): Self = StObject.set(x, "onDragOver", value.asInstanceOf[js.Any])
      
      inline def setOnDragOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): Self = StObject.set(x, "onDragOverCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
      
      inline def setOnDragStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): Self = StObject.set(x, "onDragStartCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnDrop(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
      
      inline def setOnDropCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, Any]): Self = StObject.set(x, "onDropCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnDurationChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onDurationChange", value.asInstanceOf[js.Any])
      
      inline def setOnDurationChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onDurationChangeCapture", value.asInstanceOf[js.Any])
      
      inline def setOnDurationChangeCaptureUndefined: Self = StObject.set(x, "onDurationChangeCapture", js.undefined)
      
      inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      inline def setOnEmptied(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onEmptied", value.asInstanceOf[js.Any])
      
      inline def setOnEmptiedCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onEmptiedCapture", value.asInstanceOf[js.Any])
      
      inline def setOnEmptiedCaptureUndefined: Self = StObject.set(x, "onEmptiedCapture", js.undefined)
      
      inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      inline def setOnEnded(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onEnded", value.asInstanceOf[js.Any])
      
      inline def setOnEndedCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onEndedCapture", value.asInstanceOf[js.Any])
      
      inline def setOnEndedCaptureUndefined: Self = StObject.set(x, "onEndedCapture", js.undefined)
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnError(
        value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* args */ OnErrorEventHandlerArgs, Any]
      ): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
      
      inline def setOnErrorCapture(
        value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* args */ OnErrorEventHandlerArgs, Any]
      ): Self = StObject.set(x, "onErrorCapture", value.asInstanceOf[js.Any])
      
      inline def setOnErrorCaptureUndefined: Self = StObject.set(x, "onErrorCapture", js.undefined)
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFocus(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, Any]): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      inline def setOnFocusCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, Any]): Self = StObject.set(x, "onFocusCapture", value.asInstanceOf[js.Any])
      
      inline def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnHashChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ HashChangeEvent, Any]): Self = StObject.set(x, "onHashChange", value.asInstanceOf[js.Any])
      
      inline def setOnHashChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ HashChangeEvent, Any]): Self = StObject.set(x, "onHashChangeCapture", value.asInstanceOf[js.Any])
      
      inline def setOnHashChangeCaptureUndefined: Self = StObject.set(x, "onHashChangeCapture", js.undefined)
      
      inline def setOnHashChangeUndefined: Self = StObject.set(x, "onHashChange", js.undefined)
      
      inline def setOnInput(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onInput", value.asInstanceOf[js.Any])
      
      inline def setOnInputCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onInputCapture", value.asInstanceOf[js.Any])
      
      inline def setOnInputCaptureUndefined: Self = StObject.set(x, "onInputCapture", js.undefined)
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnKeyDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOnKeyDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]): Self = StObject.set(x, "onKeyDownCapture", value.asInstanceOf[js.Any])
      
      inline def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
      
      inline def setOnKeyPressCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]): Self = StObject.set(x, "onKeyPressCapture", value.asInstanceOf[js.Any])
      
      inline def setOnKeyPressCaptureUndefined: Self = StObject.set(x, "onKeyPressCapture", js.undefined)
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
      
      inline def setOnKeyUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, Any]): Self = StObject.set(x, "onKeyUpCapture", value.asInstanceOf[js.Any])
      
      inline def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnLoad(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      inline def setOnLoadCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onLoadCapture", value.asInstanceOf[js.Any])
      
      inline def setOnLoadCaptureUndefined: Self = StObject.set(x, "onLoadCapture", js.undefined)
      
      inline def setOnLoadStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onLoadStart", value.asInstanceOf[js.Any])
      
      inline def setOnLoadStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onLoadStartCapture", value.asInstanceOf[js.Any])
      
      inline def setOnLoadStartCaptureUndefined: Self = StObject.set(x, "onLoadStartCapture", js.undefined)
      
      inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoadedData(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onLoadedData", value.asInstanceOf[js.Any])
      
      inline def setOnLoadedDataCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onLoadedDataCapture", value.asInstanceOf[js.Any])
      
      inline def setOnLoadedDataCaptureUndefined: Self = StObject.set(x, "onLoadedDataCapture", js.undefined)
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnLoadedMetadata(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onLoadedMetadata", value.asInstanceOf[js.Any])
      
      inline def setOnLoadedMetadataCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onLoadedMetadataCapture", value.asInstanceOf[js.Any])
      
      inline def setOnLoadedMetadataCaptureUndefined: Self = StObject.set(x, "onLoadedMetadataCapture", js.undefined)
      
      inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      inline def setOnMessage(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MessageEvent[Any], Any]): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
      
      inline def setOnMessageCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MessageEvent[Any], Any]): Self = StObject.set(x, "onMessageCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMessageCaptureUndefined: Self = StObject.set(x, "onMessageCapture", js.undefined)
      
      inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      inline def setOnMouseDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
      
      inline def setOnMouseDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onMouseDownCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
      
      inline def setOnMouseEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onMouseEnterCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMouseEnterCaptureUndefined: Self = StObject.set(x, "onMouseEnterCapture", js.undefined)
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
      
      inline def setOnMouseLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onMouseLeaveCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMouseLeaveCaptureUndefined: Self = StObject.set(x, "onMouseLeaveCapture", js.undefined)
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
      
      inline def setOnMouseMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onMouseMoveCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseOut(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
      
      inline def setOnMouseOutCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onMouseOutCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
      
      inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      inline def setOnMouseOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
      
      inline def setOnMouseOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onMouseOverCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
      
      inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      inline def setOnMouseUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
      
      inline def setOnMouseUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, Any]): Self = StObject.set(x, "onMouseUpCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnMouseWheel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, Any]): Self = StObject.set(x, "onMouseWheel", value.asInstanceOf[js.Any])
      
      inline def setOnMouseWheelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, Any]): Self = StObject.set(x, "onMouseWheelCapture", value.asInstanceOf[js.Any])
      
      inline def setOnMouseWheelCaptureUndefined: Self = StObject.set(x, "onMouseWheelCapture", js.undefined)
      
      inline def setOnMouseWheelUndefined: Self = StObject.set(x, "onMouseWheel", js.undefined)
      
      inline def setOnOffline(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onOffline", value.asInstanceOf[js.Any])
      
      inline def setOnOfflineCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onOfflineCapture", value.asInstanceOf[js.Any])
      
      inline def setOnOfflineCaptureUndefined: Self = StObject.set(x, "onOfflineCapture", js.undefined)
      
      inline def setOnOfflineUndefined: Self = StObject.set(x, "onOffline", js.undefined)
      
      inline def setOnOnline(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onOnline", value.asInstanceOf[js.Any])
      
      inline def setOnOnlineCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onOnlineCapture", value.asInstanceOf[js.Any])
      
      inline def setOnOnlineCaptureUndefined: Self = StObject.set(x, "onOnlineCapture", js.undefined)
      
      inline def setOnOnlineUndefined: Self = StObject.set(x, "onOnline", js.undefined)
      
      inline def setOnOrientationChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onOrientationChange", value.asInstanceOf[js.Any])
      
      inline def setOnOrientationChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onOrientationChangeCapture", value.asInstanceOf[js.Any])
      
      inline def setOnOrientationChangeCaptureUndefined: Self = StObject.set(x, "onOrientationChangeCapture", js.undefined)
      
      inline def setOnOrientationChangeUndefined: Self = StObject.set(x, "onOrientationChange", js.undefined)
      
      inline def setOnPageHide(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, Any]): Self = StObject.set(x, "onPageHide", value.asInstanceOf[js.Any])
      
      inline def setOnPageHideCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, Any]): Self = StObject.set(x, "onPageHideCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPageHideCaptureUndefined: Self = StObject.set(x, "onPageHideCapture", js.undefined)
      
      inline def setOnPageHideUndefined: Self = StObject.set(x, "onPageHide", js.undefined)
      
      inline def setOnPageShow(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, Any]): Self = StObject.set(x, "onPageShow", value.asInstanceOf[js.Any])
      
      inline def setOnPageShowCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, Any]): Self = StObject.set(x, "onPageShowCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPageShowCaptureUndefined: Self = StObject.set(x, "onPageShowCapture", js.undefined)
      
      inline def setOnPageShowUndefined: Self = StObject.set(x, "onPageShow", js.undefined)
      
      inline def setOnPause(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
      
      inline def setOnPauseCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onPauseCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPauseCaptureUndefined: Self = StObject.set(x, "onPauseCapture", js.undefined)
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onPlay", value.asInstanceOf[js.Any])
      
      inline def setOnPlayCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onPlayCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPlayCaptureUndefined: Self = StObject.set(x, "onPlayCapture", js.undefined)
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaying(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
      
      inline def setOnPlayingCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onPlayingCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPlayingCaptureUndefined: Self = StObject.set(x, "onPlayingCapture", js.undefined)
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnPointerCancel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
      
      inline def setOnPointerCancelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onPointerCancelCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
      
      inline def setOnPointerDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onPointerDownCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
      
      inline def setOnPointerEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onPointerEnterCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
      
      inline def setOnPointerLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onPointerLeaveCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
      
      inline def setOnPointerMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onPointerMoveCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerOut(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onPointerOut", value.asInstanceOf[js.Any])
      
      inline def setOnPointerOutCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onPointerOutCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
      
      inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      inline def setOnPointerOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onPointerOver", value.asInstanceOf[js.Any])
      
      inline def setOnPointerOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onPointerOverCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
      
      inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      inline def setOnPointerUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
      
      inline def setOnPointerUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, Any]): Self = StObject.set(x, "onPointerUpCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnPopState(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PopStateEvent, Any]): Self = StObject.set(x, "onPopState", value.asInstanceOf[js.Any])
      
      inline def setOnPopStateCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PopStateEvent, Any]): Self = StObject.set(x, "onPopStateCapture", value.asInstanceOf[js.Any])
      
      inline def setOnPopStateCaptureUndefined: Self = StObject.set(x, "onPopStateCapture", js.undefined)
      
      inline def setOnPopStateUndefined: Self = StObject.set(x, "onPopState", js.undefined)
      
      inline def setOnProgress(
        value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], Any]
      ): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
      
      inline def setOnProgressCapture(
        value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], Any]
      ): Self = StObject.set(x, "onProgressCapture", value.asInstanceOf[js.Any])
      
      inline def setOnProgressCaptureUndefined: Self = StObject.set(x, "onProgressCapture", js.undefined)
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnRateChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onRateChange", value.asInstanceOf[js.Any])
      
      inline def setOnRateChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onRateChangeCapture", value.asInstanceOf[js.Any])
      
      inline def setOnRateChangeCaptureUndefined: Self = StObject.set(x, "onRateChangeCapture", js.undefined)
      
      inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      inline def setOnReadyStateChange(
        value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], Any]
      ): Self = StObject.set(x, "onReadyStateChange", value.asInstanceOf[js.Any])
      
      inline def setOnReadyStateChangeCapture(
        value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent[EventTarget], Any]
      ): Self = StObject.set(x, "onReadyStateChangeCapture", value.asInstanceOf[js.Any])
      
      inline def setOnReadyStateChangeCaptureUndefined: Self = StObject.set(x, "onReadyStateChangeCapture", js.undefined)
      
      inline def setOnReadyStateChangeUndefined: Self = StObject.set(x, "onReadyStateChange", js.undefined)
      
      inline def setOnReset(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
      
      inline def setOnResetCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onResetCapture", value.asInstanceOf[js.Any])
      
      inline def setOnResetCaptureUndefined: Self = StObject.set(x, "onResetCapture", js.undefined)
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnResize(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]): Self = StObject.set(x, "onResize", value.asInstanceOf[js.Any])
      
      inline def setOnResizeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]): Self = StObject.set(x, "onResizeCapture", value.asInstanceOf[js.Any])
      
      inline def setOnResizeCaptureUndefined: Self = StObject.set(x, "onResizeCapture", js.undefined)
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnScroll(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
      
      inline def setOnScrollCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]): Self = StObject.set(x, "onScrollCapture", value.asInstanceOf[js.Any])
      
      inline def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSeeked(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onSeeked", value.asInstanceOf[js.Any])
      
      inline def setOnSeekedCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onSeekedCapture", value.asInstanceOf[js.Any])
      
      inline def setOnSeekedCaptureUndefined: Self = StObject.set(x, "onSeekedCapture", js.undefined)
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnSeeking(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onSeeking", value.asInstanceOf[js.Any])
      
      inline def setOnSeekingCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onSeekingCapture", value.asInstanceOf[js.Any])
      
      inline def setOnSeekingCaptureUndefined: Self = StObject.set(x, "onSeekingCapture", js.undefined)
      
      inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      inline def setOnSelect(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, Any]): Self = StObject.set(x, "onSelectCapture", value.asInstanceOf[js.Any])
      
      inline def setOnSelectCaptureUndefined: Self = StObject.set(x, "onSelectCapture", js.undefined)
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnSelectionChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onSelectionChange", value.asInstanceOf[js.Any])
      
      inline def setOnSelectionChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onSelectionChangeCapture", value.asInstanceOf[js.Any])
      
      inline def setOnSelectionChangeCaptureUndefined: Self = StObject.set(x, "onSelectionChangeCapture", js.undefined)
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setOnStalled(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onStalled", value.asInstanceOf[js.Any])
      
      inline def setOnStalledCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onStalledCapture", value.asInstanceOf[js.Any])
      
      inline def setOnStalledCaptureUndefined: Self = StObject.set(x, "onStalledCapture", js.undefined)
      
      inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      inline def setOnStorage(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ StorageEvent, Any]): Self = StObject.set(x, "onStorage", value.asInstanceOf[js.Any])
      
      inline def setOnStorageCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ StorageEvent, Any]): Self = StObject.set(x, "onStorageCapture", value.asInstanceOf[js.Any])
      
      inline def setOnStorageCaptureUndefined: Self = StObject.set(x, "onStorageCapture", js.undefined)
      
      inline def setOnStorageUndefined: Self = StObject.set(x, "onStorage", js.undefined)
      
      inline def setOnSubmit(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onSubmit", value.asInstanceOf[js.Any])
      
      inline def setOnSubmitCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onSubmitCapture", value.asInstanceOf[js.Any])
      
      inline def setOnSubmitCaptureUndefined: Self = StObject.set(x, "onSubmitCapture", js.undefined)
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnSuspend(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onSuspend", value.asInstanceOf[js.Any])
      
      inline def setOnSuspendCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onSuspendCapture", value.asInstanceOf[js.Any])
      
      inline def setOnSuspendCaptureUndefined: Self = StObject.set(x, "onSuspendCapture", js.undefined)
      
      inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      inline def setOnTimeUpdate(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onTimeUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnTimeUpdateCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onTimeUpdateCapture", value.asInstanceOf[js.Any])
      
      inline def setOnTimeUpdateCaptureUndefined: Self = StObject.set(x, "onTimeUpdateCapture", js.undefined)
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnTouchCancel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
      
      inline def setOnTouchCancelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]): Self = StObject.set(x, "onTouchCancelCapture", value.asInstanceOf[js.Any])
      
      inline def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
      
      inline def setOnTouchEndCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]): Self = StObject.set(x, "onTouchEndCapture", value.asInstanceOf[js.Any])
      
      inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
      
      inline def setOnTouchMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]): Self = StObject.set(x, "onTouchMoveCapture", value.asInstanceOf[js.Any])
      
      inline def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
      
      inline def setOnTouchStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, Any]): Self = StObject.set(x, "onTouchStartCapture", value.asInstanceOf[js.Any])
      
      inline def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setOnUnload(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onUnload", value.asInstanceOf[js.Any])
      
      inline def setOnUnloadCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onUnloadCapture", value.asInstanceOf[js.Any])
      
      inline def setOnUnloadCaptureUndefined: Self = StObject.set(x, "onUnloadCapture", js.undefined)
      
      inline def setOnUnloadUndefined: Self = StObject.set(x, "onUnload", js.undefined)
      
      inline def setOnVolumeChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onVolumeChange", value.asInstanceOf[js.Any])
      
      inline def setOnVolumeChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onVolumeChangeCapture", value.asInstanceOf[js.Any])
      
      inline def setOnVolumeChangeCaptureUndefined: Self = StObject.set(x, "onVolumeChangeCapture", js.undefined)
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setOnWaiting(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
      
      inline def setOnWaitingCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, Any]): Self = StObject.set(x, "onWaitingCapture", value.asInstanceOf[js.Any])
      
      inline def setOnWaitingCaptureUndefined: Self = StObject.set(x, "onWaitingCapture", js.undefined)
      
      inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      inline def setOnWheel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, Any]): Self = StObject.set(x, "onWheel", value.asInstanceOf[js.Any])
      
      inline def setOnWheelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, Any]): Self = StObject.set(x, "onWheelCapture", value.asInstanceOf[js.Any])
      
      inline def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
      
      inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      inline def setTarget(value: T): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends 'clientInformation' | 'closed' | 'customElements' | 'devicePixelRatio' | 'document' | 'event' | 'external' | 'frameElement' | 'frames' | 'history' | 'innerHeight' | 'innerWidth' | 'length' | 'locationbar' | 'menubar' | 'name' | 'navigator' | 'ondevicemotion' | 'ondeviceorientation' | 'onorientationchange' | 'opener' | 'orientation' | 'outerHeight' | 'outerWidth' | 'pageXOffset' | 'pageYOffset' | 'parent' | 'personalbar' | 'screen' | 'screenLeft' | 'screenTop' | 'screenX' | 'screenY' | 'scrollX' | 'scrollY' | 'scrollbars' | 'self' | 'speechSynthesis' | 'status' | 'statusbar' | 'toolbar' | 'top' | 'visualViewport' | 'window' ? std.Window[T] : T
    }}}
    */
  type EventListenerThisType[T /* <: EventTarget | WindowEventTargets */] = T
  
  /* Inlined parent std.Pick<std.AddEventListenerOptions, 'capture' | 'passive'> */
  trait EventOptions extends StObject {
    
    var capture: js.UndefOr[Boolean] = js.undefined
    
    var passive: js.UndefOr[Boolean] = js.undefined
  }
  object EventOptions {
    
    inline def apply(): EventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventOptions] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    std.OnErrorEventHandlerNonNull extends (args : infer A): any ? A : []
    }}}
    */
  type OnErrorEventHandlerArgs = js.Array[Any]
  
  type WindowEventTargets = js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.BarProp extends std.EventTarget ? 'locationbar' : never */ js.Any
  ]
}
