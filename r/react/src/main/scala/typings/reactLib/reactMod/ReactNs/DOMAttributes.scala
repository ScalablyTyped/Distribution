package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMAttributes[T] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[reactLib.Anon_Html] = js.undefined
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onAbortCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  var onAnimationEndCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  var onAnimationIterationCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  var onAnimationStartCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onBeforeInputCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[T]] = js.undefined
  var onBlurCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onCanPlayCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onCanPlayThroughCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onChangeCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  // MouseEvents
  var onClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onClickCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  var onCompositionEndCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  var onCompositionStartCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  var onCompositionUpdateCapture: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onContextMenuCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  var onCopyCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  var onCutCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onDoubleClickCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragEndCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragEnterCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragExitCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragLeaveCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragOverCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragStartCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDropCapture: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onDurationChangeCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onEmptiedCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onEncryptedCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onEndedCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[T]] = js.undefined
   // also a Media Event
  var onErrorCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[T]] = js.undefined
  var onFocusCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
  var onGotPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onGotPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onInputCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onInvalidCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  var onKeyDownCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  var onKeyPressCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  var onKeyUpCapture: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onLoadCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onLoadStartCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onLoadedDataCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onLoadedMetadataCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onLostPointerCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onLostPointerCaptureCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseDownCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseMoveCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseOutCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseOverCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseUpCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  var onPasteCapture: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onPauseCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onPlayCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onPlayingCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerCancelCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerDownCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerEnterCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerLeaveCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerMoveCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerOutCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerOverCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerUpCapture: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onProgressCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onRateChangeCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onResetCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[T]] = js.undefined
  var onScrollCapture: js.UndefOr[UIEventHandler[T]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onSeekedCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onSeekingCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onSelectCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onStalledCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onSubmitCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onSuspendCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onTimeUpdateCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchCancelCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchEndCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchMoveCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchStartCapture: js.UndefOr[TouchEventHandler[T]] = js.undefined
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[T]] = js.undefined
  var onTransitionEndCapture: js.UndefOr[TransitionEventHandler[T]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onVolumeChangeCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onWaitingCapture: js.UndefOr[ReactEventHandler[T]] = js.undefined
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[T]] = js.undefined
  var onWheelCapture: js.UndefOr[WheelEventHandler[T]] = js.undefined
}

