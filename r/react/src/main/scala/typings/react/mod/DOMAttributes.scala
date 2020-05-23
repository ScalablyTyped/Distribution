package typings.react.mod

import typings.react.anon.Html
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMAttributes[T] extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onBeforeInput: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[T]] = js.undefined
  var onCanPlay: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[T]] = js.undefined
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  var onCompositionStart: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  var onContextMenu: js.UndefOr[MouseEventHandler[T]] = js.undefined
  // Clipboard Events
  var onCopy: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  var onCut: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onDrag: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragEnd: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragEnter: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragExit: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragLeave: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragOver: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDragStart: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDrop: js.UndefOr[DragEventHandler[T]] = js.undefined
  var onDurationChange: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onEmptied: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onEncrypted: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onEnded: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onError: js.UndefOr[ReactEventHandler[T]] = js.undefined
  // Focus Events
  var onFocus: js.UndefOr[FocusEventHandler[T]] = js.undefined
  var onInput: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onInvalid: js.UndefOr[FormEventHandler[T]] = js.undefined
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[T]] = js.undefined
  // Image Events
  var onLoad: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onLoadStart: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onLoadedData: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onLoadedMetadata: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseMove: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseOut: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseOver: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[T]] = js.undefined
  var onPaste: js.UndefOr[ClipboardEventHandler[T]] = js.undefined
  var onPause: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onPlay: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onPlaying: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onPointerCancel: js.UndefOr[PointerEventHandler[T]] = js.undefined
  // Pointer Events
  var onPointerDown: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerEnter: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerLeave: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerMove: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerOut: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerOver: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onPointerUp: js.UndefOr[PointerEventHandler[T]] = js.undefined
  var onProgress: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onRateChange: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onReset: js.UndefOr[FormEventHandler[T]] = js.undefined
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[T]] = js.undefined
  var onSeeked: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onSeeking: js.UndefOr[ReactEventHandler[T]] = js.undefined
  // Selection Events
  var onSelect: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onStalled: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onSubmit: js.UndefOr[FormEventHandler[T]] = js.undefined
  var onSuspend: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onTimeUpdate: js.UndefOr[ReactEventHandler[T]] = js.undefined
  // Touch Events
  var onTouchCancel: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchMove: js.UndefOr[TouchEventHandler[T]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[T]] = js.undefined
  // Transition Events
  var onTransitionEnd: js.UndefOr[TransitionEventHandler[T]] = js.undefined
  var onVolumeChange: js.UndefOr[ReactEventHandler[T]] = js.undefined
  var onWaiting: js.UndefOr[ReactEventHandler[T]] = js.undefined
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[T]] = js.undefined
}

object DOMAttributes {
  @scala.inline
  def apply[T](
    children: ReactNode = null,
    dangerouslySetInnerHTML: Html = null,
    onAbort: SyntheticEvent[T, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[T] => Unit = null,
    onAnimationIteration: AnimationEvent[T] => Unit = null,
    onAnimationStart: AnimationEvent[T] => Unit = null,
    onAuxClick: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[T] => Unit = null,
    onBlur: FocusEvent[T] => Unit = null,
    onCanPlay: SyntheticEvent[T, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[T, Event] => Unit = null,
    onChange: FormEvent[T] => Unit = null,
    onClick: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[T] => Unit = null,
    onCompositionStart: CompositionEvent[T] => Unit = null,
    onCompositionUpdate: CompositionEvent[T] => Unit = null,
    onContextMenu: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[T] => Unit = null,
    onCut: ClipboardEvent[T] => Unit = null,
    onDoubleClick: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[T] => Unit = null,
    onDragEnd: DragEvent[T] => Unit = null,
    onDragEnter: DragEvent[T] => Unit = null,
    onDragExit: DragEvent[T] => Unit = null,
    onDragLeave: DragEvent[T] => Unit = null,
    onDragOver: DragEvent[T] => Unit = null,
    onDragStart: DragEvent[T] => Unit = null,
    onDrop: DragEvent[T] => Unit = null,
    onDurationChange: SyntheticEvent[T, Event] => Unit = null,
    onEmptied: SyntheticEvent[T, Event] => Unit = null,
    onEncrypted: SyntheticEvent[T, Event] => Unit = null,
    onEnded: SyntheticEvent[T, Event] => Unit = null,
    onError: SyntheticEvent[T, Event] => Unit = null,
    onFocus: FocusEvent[T] => Unit = null,
    onInput: FormEvent[T] => Unit = null,
    onInvalid: FormEvent[T] => Unit = null,
    onKeyDown: KeyboardEvent[T] => Unit = null,
    onKeyPress: KeyboardEvent[T] => Unit = null,
    onKeyUp: KeyboardEvent[T] => Unit = null,
    onLoad: SyntheticEvent[T, Event] => Unit = null,
    onLoadStart: SyntheticEvent[T, Event] => Unit = null,
    onLoadedData: SyntheticEvent[T, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[T, Event] => Unit = null,
    onMouseDown: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[T, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[T] => Unit = null,
    onPause: SyntheticEvent[T, Event] => Unit = null,
    onPlay: SyntheticEvent[T, Event] => Unit = null,
    onPlaying: SyntheticEvent[T, Event] => Unit = null,
    onPointerCancel: PointerEvent[T] => Unit = null,
    onPointerDown: PointerEvent[T] => Unit = null,
    onPointerEnter: PointerEvent[T] => Unit = null,
    onPointerLeave: PointerEvent[T] => Unit = null,
    onPointerMove: PointerEvent[T] => Unit = null,
    onPointerOut: PointerEvent[T] => Unit = null,
    onPointerOver: PointerEvent[T] => Unit = null,
    onPointerUp: PointerEvent[T] => Unit = null,
    onProgress: SyntheticEvent[T, Event] => Unit = null,
    onRateChange: SyntheticEvent[T, Event] => Unit = null,
    onReset: FormEvent[T] => Unit = null,
    onScroll: UIEvent[T, NativeUIEvent] => Unit = null,
    onSeeked: SyntheticEvent[T, Event] => Unit = null,
    onSeeking: SyntheticEvent[T, Event] => Unit = null,
    onSelect: SyntheticEvent[T, Event] => Unit = null,
    onStalled: SyntheticEvent[T, Event] => Unit = null,
    onSubmit: FormEvent[T] => Unit = null,
    onSuspend: SyntheticEvent[T, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[T, Event] => Unit = null,
    onTouchCancel: TouchEvent[T] => Unit = null,
    onTouchEnd: TouchEvent[T] => Unit = null,
    onTouchMove: TouchEvent[T] => Unit = null,
    onTouchStart: TouchEvent[T] => Unit = null,
    onTransitionEnd: TransitionEvent[T] => Unit = null,
    onVolumeChange: SyntheticEvent[T, Event] => Unit = null,
    onWaiting: SyntheticEvent[T, Event] => Unit = null,
    onWheel: WheelEvent[T] => Unit = null
  ): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    __obj.asInstanceOf[DOMAttributes[T]]
  }
}

