package typings.rax.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rax.anon.Html
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMAttributes[T]
  extends StObject
     with // weex
/* key */ StringDictionary[js.Any] {
  
  var children: js.UndefOr[RaxNode] = js.undefined
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  
  // Media Events
  var onAbort: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onAbortCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onAnimationEnd: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAnimationEndCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAnimationIteration: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAnimationIterationCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  // Animation Events
  var onAnimationStart: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAnimationStartCapture: js.UndefOr[AnimationEventHandler[T]] = js.undefined
  
  var onAppear: js.UndefOr[AppearEventHandler[T]] = js.undefined
  
  // MouseEvents
  var onAuxClick: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onAuxClickCapture: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
  var onBeforeInput: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onBeforeInputCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[T]] = js.undefined
  
  var onBlurCapture: js.UndefOr[FocusEventHandler[T]] = js.undefined
  
  var onCanPlay: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onCanPlayCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onCanPlayThrough: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onCanPlayThroughCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // Form Events
  var onChange: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onChangeCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  
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
  
  var onDisappear: js.UndefOr[AppearEventHandler[T]] = js.undefined
  
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
  
  var onDurationChange: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onDurationChangeCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEmptied: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEmptiedCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEncrypted: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEncryptedCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEnded: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onEndedCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onError: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // also a Media Event
  var onErrorCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
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
  var onLoad: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadStart: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadStartCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadedData: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadedDataCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadedMetadata: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onLoadedMetadataCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // Weex Common Events
  var onLongpress: js.UndefOr[MouseEventHandler[T]] = js.undefined
  
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
  
  var onPause: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPauseCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPlay: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPlayCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPlaying: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onPlayingCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
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
  
  var onProgress: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onProgressCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onRateChange: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onRateChangeCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onReset: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onResetCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  // UI Events
  var onScroll: js.UndefOr[UIEventHandler[T]] = js.undefined
  
  var onScrollCapture: js.UndefOr[UIEventHandler[T]] = js.undefined
  
  var onSeeked: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSeekedCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSeeking: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSeekingCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // Selection Events
  var onSelect: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSelectCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onStalled: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onStalledCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSubmit: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onSubmitCapture: js.UndefOr[FormEventHandler[T]] = js.undefined
  
  var onSuspend: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onSuspendCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onTimeUpdate: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onTimeUpdateCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
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
  
  var onVolumeChange: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onVolumeChangeCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onWaiting: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  var onWaitingCapture: js.UndefOr[RaxEventHandler[T]] = js.undefined
  
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[T]] = js.undefined
  
  var onWheelCapture: js.UndefOr[WheelEventHandler[T]] = js.undefined
}
object DOMAttributes {
  
  inline def apply[T](): DOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMAttributes[T]]
  }
  
  extension [Self <: DOMAttributes[?], T](x: Self & DOMAttributes[T]) {
    
    inline def setChildren(value: RaxNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    inline def setOnAbort(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
    
    inline def setOnAbortCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onAbortCapture", js.Any.fromFunction1(value))
    
    inline def setOnAbortCaptureUndefined: Self = StObject.set(x, "onAbortCapture", js.undefined)
    
    inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    inline def setOnAnimationEnd(value: AnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
    
    inline def setOnAnimationEndCapture(value: AnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationEndCapture", js.Any.fromFunction1(value))
    
    inline def setOnAnimationEndCaptureUndefined: Self = StObject.set(x, "onAnimationEndCapture", js.undefined)
    
    inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
    
    inline def setOnAnimationIteration(value: AnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
    
    inline def setOnAnimationIterationCapture(value: AnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationIterationCapture", js.Any.fromFunction1(value))
    
    inline def setOnAnimationIterationCaptureUndefined: Self = StObject.set(x, "onAnimationIterationCapture", js.undefined)
    
    inline def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
    
    inline def setOnAnimationStart(value: AnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
    
    inline def setOnAnimationStartCapture(value: AnimationEvent[T] => Unit): Self = StObject.set(x, "onAnimationStartCapture", js.Any.fromFunction1(value))
    
    inline def setOnAnimationStartCaptureUndefined: Self = StObject.set(x, "onAnimationStartCapture", js.undefined)
    
    inline def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
    
    inline def setOnAppear(value: AppearEvent[T] => Unit): Self = StObject.set(x, "onAppear", js.Any.fromFunction1(value))
    
    inline def setOnAppearUndefined: Self = StObject.set(x, "onAppear", js.undefined)
    
    inline def setOnAuxClick(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
    
    inline def setOnAuxClickCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onAuxClickCapture", js.Any.fromFunction1(value))
    
    inline def setOnAuxClickCaptureUndefined: Self = StObject.set(x, "onAuxClickCapture", js.undefined)
    
    inline def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
    
    inline def setOnBeforeInput(value: FormEvent[T] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
    
    inline def setOnBeforeInputCapture(value: FormEvent[T] => Unit): Self = StObject.set(x, "onBeforeInputCapture", js.Any.fromFunction1(value))
    
    inline def setOnBeforeInputCaptureUndefined: Self = StObject.set(x, "onBeforeInputCapture", js.undefined)
    
    inline def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
    
    inline def setOnBlur(value: FocusEvent[T] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurCapture(value: FocusEvent[T] => Unit): Self = StObject.set(x, "onBlurCapture", js.Any.fromFunction1(value))
    
    inline def setOnBlurCaptureUndefined: Self = StObject.set(x, "onBlurCapture", js.undefined)
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnCanPlay(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
    
    inline def setOnCanPlayCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlayCapture", js.Any.fromFunction1(value))
    
    inline def setOnCanPlayCaptureUndefined: Self = StObject.set(x, "onCanPlayCapture", js.undefined)
    
    inline def setOnCanPlayThrough(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
    
    inline def setOnCanPlayThroughCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlayThroughCapture", js.Any.fromFunction1(value))
    
    inline def setOnCanPlayThroughCaptureUndefined: Self = StObject.set(x, "onCanPlayThroughCapture", js.undefined)
    
    inline def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    inline def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    inline def setOnChange(value: FormEvent[T] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeCapture(value: FormEvent[T] => Unit): Self = StObject.set(x, "onChangeCapture", js.Any.fromFunction1(value))
    
    inline def setOnChangeCaptureUndefined: Self = StObject.set(x, "onChangeCapture", js.undefined)
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClickCapture", js.Any.fromFunction1(value))
    
    inline def setOnClickCaptureUndefined: Self = StObject.set(x, "onClickCapture", js.undefined)
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnCompositionEnd(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
    
    inline def setOnCompositionEndCapture(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionEndCapture", js.Any.fromFunction1(value))
    
    inline def setOnCompositionEndCaptureUndefined: Self = StObject.set(x, "onCompositionEndCapture", js.undefined)
    
    inline def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    inline def setOnCompositionStart(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
    
    inline def setOnCompositionStartCapture(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionStartCapture", js.Any.fromFunction1(value))
    
    inline def setOnCompositionStartCaptureUndefined: Self = StObject.set(x, "onCompositionStartCapture", js.undefined)
    
    inline def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    inline def setOnCompositionUpdate(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
    
    inline def setOnCompositionUpdateCapture(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionUpdateCapture", js.Any.fromFunction1(value))
    
    inline def setOnCompositionUpdateCaptureUndefined: Self = StObject.set(x, "onCompositionUpdateCapture", js.undefined)
    
    inline def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    inline def setOnContextMenu(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    inline def setOnContextMenuCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenuCapture", js.Any.fromFunction1(value))
    
    inline def setOnContextMenuCaptureUndefined: Self = StObject.set(x, "onContextMenuCapture", js.undefined)
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnCopy(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
    
    inline def setOnCopyCapture(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onCopyCapture", js.Any.fromFunction1(value))
    
    inline def setOnCopyCaptureUndefined: Self = StObject.set(x, "onCopyCapture", js.undefined)
    
    inline def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    inline def setOnCut(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
    
    inline def setOnCutCapture(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onCutCapture", js.Any.fromFunction1(value))
    
    inline def setOnCutCaptureUndefined: Self = StObject.set(x, "onCutCapture", js.undefined)
    
    inline def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    inline def setOnDisappear(value: AppearEvent[T] => Unit): Self = StObject.set(x, "onDisappear", js.Any.fromFunction1(value))
    
    inline def setOnDisappearUndefined: Self = StObject.set(x, "onDisappear", js.undefined)
    
    inline def setOnDoubleClick(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
    
    inline def setOnDoubleClickCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClickCapture", js.Any.fromFunction1(value))
    
    inline def setOnDoubleClickCaptureUndefined: Self = StObject.set(x, "onDoubleClickCapture", js.undefined)
    
    inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    inline def setOnDrag(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    inline def setOnDragCapture(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragCapture", js.Any.fromFunction1(value))
    
    inline def setOnDragCaptureUndefined: Self = StObject.set(x, "onDragCapture", js.undefined)
    
    inline def setOnDragEnd(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndCapture(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragEndCapture", js.Any.fromFunction1(value))
    
    inline def setOnDragEndCaptureUndefined: Self = StObject.set(x, "onDragEndCapture", js.undefined)
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragEnter(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
    
    inline def setOnDragEnterCapture(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragEnterCapture", js.Any.fromFunction1(value))
    
    inline def setOnDragEnterCaptureUndefined: Self = StObject.set(x, "onDragEnterCapture", js.undefined)
    
    inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    inline def setOnDragExit(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
    
    inline def setOnDragExitCapture(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragExitCapture", js.Any.fromFunction1(value))
    
    inline def setOnDragExitCaptureUndefined: Self = StObject.set(x, "onDragExitCapture", js.undefined)
    
    inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    inline def setOnDragLeave(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
    
    inline def setOnDragLeaveCapture(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragLeaveCapture", js.Any.fromFunction1(value))
    
    inline def setOnDragLeaveCaptureUndefined: Self = StObject.set(x, "onDragLeaveCapture", js.undefined)
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnDragOver(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
    
    inline def setOnDragOverCapture(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragOverCapture", js.Any.fromFunction1(value))
    
    inline def setOnDragOverCaptureUndefined: Self = StObject.set(x, "onDragOverCapture", js.undefined)
    
    inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    inline def setOnDragStart(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setOnDragStartCapture(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragStartCapture", js.Any.fromFunction1(value))
    
    inline def setOnDragStartCaptureUndefined: Self = StObject.set(x, "onDragStartCapture", js.undefined)
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    inline def setOnDrop(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
    
    inline def setOnDropCapture(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDropCapture", js.Any.fromFunction1(value))
    
    inline def setOnDropCaptureUndefined: Self = StObject.set(x, "onDropCapture", js.undefined)
    
    inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    inline def setOnDurationChange(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
    
    inline def setOnDurationChangeCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onDurationChangeCapture", js.Any.fromFunction1(value))
    
    inline def setOnDurationChangeCaptureUndefined: Self = StObject.set(x, "onDurationChangeCapture", js.undefined)
    
    inline def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    inline def setOnEmptied(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
    
    inline def setOnEmptiedCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEmptiedCapture", js.Any.fromFunction1(value))
    
    inline def setOnEmptiedCaptureUndefined: Self = StObject.set(x, "onEmptiedCapture", js.undefined)
    
    inline def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    inline def setOnEncrypted(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
    
    inline def setOnEncryptedCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEncryptedCapture", js.Any.fromFunction1(value))
    
    inline def setOnEncryptedCaptureUndefined: Self = StObject.set(x, "onEncryptedCapture", js.undefined)
    
    inline def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    inline def setOnEnded(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    inline def setOnEndedCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEndedCapture", js.Any.fromFunction1(value))
    
    inline def setOnEndedCaptureUndefined: Self = StObject.set(x, "onEndedCapture", js.undefined)
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onErrorCapture", js.Any.fromFunction1(value))
    
    inline def setOnErrorCaptureUndefined: Self = StObject.set(x, "onErrorCapture", js.undefined)
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFocus(value: FocusEvent[T] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusCapture(value: FocusEvent[T] => Unit): Self = StObject.set(x, "onFocusCapture", js.Any.fromFunction1(value))
    
    inline def setOnFocusCaptureUndefined: Self = StObject.set(x, "onFocusCapture", js.undefined)
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnGotPointerCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onGotPointerCapture", js.Any.fromFunction1(value))
    
    inline def setOnGotPointerCaptureCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onGotPointerCaptureCapture", js.Any.fromFunction1(value))
    
    inline def setOnGotPointerCaptureCaptureUndefined: Self = StObject.set(x, "onGotPointerCaptureCapture", js.undefined)
    
    inline def setOnGotPointerCaptureUndefined: Self = StObject.set(x, "onGotPointerCapture", js.undefined)
    
    inline def setOnInput(value: FormEvent[T] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
    
    inline def setOnInputCapture(value: FormEvent[T] => Unit): Self = StObject.set(x, "onInputCapture", js.Any.fromFunction1(value))
    
    inline def setOnInputCaptureUndefined: Self = StObject.set(x, "onInputCapture", js.undefined)
    
    inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    inline def setOnInvalid(value: FormEvent[T] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
    
    inline def setOnInvalidCapture(value: FormEvent[T] => Unit): Self = StObject.set(x, "onInvalidCapture", js.Any.fromFunction1(value))
    
    inline def setOnInvalidCaptureUndefined: Self = StObject.set(x, "onInvalidCapture", js.undefined)
    
    inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
    
    inline def setOnKeyDown(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownCapture(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyDownCapture", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownCaptureUndefined: Self = StObject.set(x, "onKeyDownCapture", js.undefined)
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyPress(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
    
    inline def setOnKeyPressCapture(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyPressCapture", js.Any.fromFunction1(value))
    
    inline def setOnKeyPressCaptureUndefined: Self = StObject.set(x, "onKeyPressCapture", js.undefined)
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    inline def setOnKeyUp(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpCapture(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyUpCapture", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpCaptureUndefined: Self = StObject.set(x, "onKeyUpCapture", js.undefined)
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnLoad(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadCapture", js.Any.fromFunction1(value))
    
    inline def setOnLoadCaptureUndefined: Self = StObject.set(x, "onLoadCapture", js.undefined)
    
    inline def setOnLoadStart(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
    
    inline def setOnLoadStartCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadStartCapture", js.Any.fromFunction1(value))
    
    inline def setOnLoadStartCaptureUndefined: Self = StObject.set(x, "onLoadStartCapture", js.undefined)
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnLoadedData(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
    
    inline def setOnLoadedDataCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedDataCapture", js.Any.fromFunction1(value))
    
    inline def setOnLoadedDataCaptureUndefined: Self = StObject.set(x, "onLoadedDataCapture", js.undefined)
    
    inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    inline def setOnLoadedMetadata(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
    
    inline def setOnLoadedMetadataCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedMetadataCapture", js.Any.fromFunction1(value))
    
    inline def setOnLoadedMetadataCaptureUndefined: Self = StObject.set(x, "onLoadedMetadataCapture", js.undefined)
    
    inline def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    inline def setOnLongpress(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onLongpress", js.Any.fromFunction1(value))
    
    inline def setOnLongpressUndefined: Self = StObject.set(x, "onLongpress", js.undefined)
    
    inline def setOnLostPointerCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onLostPointerCapture", js.Any.fromFunction1(value))
    
    inline def setOnLostPointerCaptureCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onLostPointerCaptureCapture", js.Any.fromFunction1(value))
    
    inline def setOnLostPointerCaptureCaptureUndefined: Self = StObject.set(x, "onLostPointerCaptureCapture", js.undefined)
    
    inline def setOnLostPointerCaptureUndefined: Self = StObject.set(x, "onLostPointerCapture", js.undefined)
    
    inline def setOnMouseDown(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseDownCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDownCapture", js.Any.fromFunction1(value))
    
    inline def setOnMouseDownCaptureUndefined: Self = StObject.set(x, "onMouseDownCapture", js.undefined)
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    inline def setOnMouseMoveCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMoveCapture", js.Any.fromFunction1(value))
    
    inline def setOnMouseMoveCaptureUndefined: Self = StObject.set(x, "onMouseMoveCapture", js.undefined)
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
    
    inline def setOnMouseOutCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOutCapture", js.Any.fromFunction1(value))
    
    inline def setOnMouseOutCaptureUndefined: Self = StObject.set(x, "onMouseOutCapture", js.undefined)
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseOver(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
    
    inline def setOnMouseOverCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOverCapture", js.Any.fromFunction1(value))
    
    inline def setOnMouseOverCaptureUndefined: Self = StObject.set(x, "onMouseOverCapture", js.undefined)
    
    inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    inline def setOnMouseUp(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    inline def setOnMouseUpCapture(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUpCapture", js.Any.fromFunction1(value))
    
    inline def setOnMouseUpCaptureUndefined: Self = StObject.set(x, "onMouseUpCapture", js.undefined)
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnPaste(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
    
    inline def setOnPasteCapture(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onPasteCapture", js.Any.fromFunction1(value))
    
    inline def setOnPasteCaptureUndefined: Self = StObject.set(x, "onPasteCapture", js.undefined)
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnPause(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    inline def setOnPauseCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPauseCapture", js.Any.fromFunction1(value))
    
    inline def setOnPauseCaptureUndefined: Self = StObject.set(x, "onPauseCapture", js.undefined)
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    inline def setOnPlayCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPlayCapture", js.Any.fromFunction1(value))
    
    inline def setOnPlayCaptureUndefined: Self = StObject.set(x, "onPlayCapture", js.undefined)
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnPlaying(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
    
    inline def setOnPlayingCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPlayingCapture", js.Any.fromFunction1(value))
    
    inline def setOnPlayingCaptureUndefined: Self = StObject.set(x, "onPlayingCapture", js.undefined)
    
    inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    inline def setOnPointerCancel(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
    
    inline def setOnPointerCancelCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
    
    inline def setOnPointerDownCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
    
    inline def setOnPointerEnterCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
    
    inline def setOnPointerLeaveCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
    
    inline def setOnPointerMoveCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerOut(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
    
    inline def setOnPointerOutCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOutCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerOutCaptureUndefined: Self = StObject.set(x, "onPointerOutCapture", js.undefined)
    
    inline def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
    
    inline def setOnPointerOver(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
    
    inline def setOnPointerOverCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerOverCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerOverCaptureUndefined: Self = StObject.set(x, "onPointerOverCapture", js.undefined)
    
    inline def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
    
    inline def setOnPointerUp(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
    
    inline def setOnPointerUpCapture(value: PointerEvent[T] => Unit): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1(value))
    
    inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnProgress(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    inline def setOnProgressCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onProgressCapture", js.Any.fromFunction1(value))
    
    inline def setOnProgressCaptureUndefined: Self = StObject.set(x, "onProgressCapture", js.undefined)
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnRateChange(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
    
    inline def setOnRateChangeCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onRateChangeCapture", js.Any.fromFunction1(value))
    
    inline def setOnRateChangeCaptureUndefined: Self = StObject.set(x, "onRateChangeCapture", js.undefined)
    
    inline def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    inline def setOnReset(value: FormEvent[T] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
    
    inline def setOnResetCapture(value: FormEvent[T] => Unit): Self = StObject.set(x, "onResetCapture", js.Any.fromFunction1(value))
    
    inline def setOnResetCaptureUndefined: Self = StObject.set(x, "onResetCapture", js.undefined)
    
    inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
    
    inline def setOnScroll(value: UIEvent[T] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollCapture(value: UIEvent[T] => Unit): Self = StObject.set(x, "onScrollCapture", js.Any.fromFunction1(value))
    
    inline def setOnScrollCaptureUndefined: Self = StObject.set(x, "onScrollCapture", js.undefined)
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSeeked(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
    
    inline def setOnSeekedCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSeekedCapture", js.Any.fromFunction1(value))
    
    inline def setOnSeekedCaptureUndefined: Self = StObject.set(x, "onSeekedCapture", js.undefined)
    
    inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    inline def setOnSeeking(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
    
    inline def setOnSeekingCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSeekingCapture", js.Any.fromFunction1(value))
    
    inline def setOnSeekingCaptureUndefined: Self = StObject.set(x, "onSeekingCapture", js.undefined)
    
    inline def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    inline def setOnSelect(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    inline def setOnSelectCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSelectCapture", js.Any.fromFunction1(value))
    
    inline def setOnSelectCaptureUndefined: Self = StObject.set(x, "onSelectCapture", js.undefined)
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOnStalled(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
    
    inline def setOnStalledCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onStalledCapture", js.Any.fromFunction1(value))
    
    inline def setOnStalledCaptureUndefined: Self = StObject.set(x, "onStalledCapture", js.undefined)
    
    inline def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    inline def setOnSubmit(value: FormEvent[T] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    inline def setOnSubmitCapture(value: FormEvent[T] => Unit): Self = StObject.set(x, "onSubmitCapture", js.Any.fromFunction1(value))
    
    inline def setOnSubmitCaptureUndefined: Self = StObject.set(x, "onSubmitCapture", js.undefined)
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setOnSuspend(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
    
    inline def setOnSuspendCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSuspendCapture", js.Any.fromFunction1(value))
    
    inline def setOnSuspendCaptureUndefined: Self = StObject.set(x, "onSuspendCapture", js.undefined)
    
    inline def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    inline def setOnTimeUpdate(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
    
    inline def setOnTimeUpdateCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onTimeUpdateCapture", js.Any.fromFunction1(value))
    
    inline def setOnTimeUpdateCaptureUndefined: Self = StObject.set(x, "onTimeUpdateCapture", js.undefined)
    
    inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    inline def setOnTouchCancel(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    inline def setOnTouchCancelCapture(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchCancelCapture", js.Any.fromFunction1(value))
    
    inline def setOnTouchCancelCaptureUndefined: Self = StObject.set(x, "onTouchCancelCapture", js.undefined)
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndCapture(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    inline def setOnTouchMoveCapture(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchMoveCapture", js.Any.fromFunction1(value))
    
    inline def setOnTouchMoveCaptureUndefined: Self = StObject.set(x, "onTouchMoveCapture", js.undefined)
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setOnTouchStartCapture(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchStartCapture", js.Any.fromFunction1(value))
    
    inline def setOnTouchStartCaptureUndefined: Self = StObject.set(x, "onTouchStartCapture", js.undefined)
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOnTransitionEnd(value: TransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
    
    inline def setOnTransitionEndCapture(value: TransitionEvent[T] => Unit): Self = StObject.set(x, "onTransitionEndCapture", js.Any.fromFunction1(value))
    
    inline def setOnTransitionEndCaptureUndefined: Self = StObject.set(x, "onTransitionEndCapture", js.undefined)
    
    inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
    
    inline def setOnVolumeChange(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
    
    inline def setOnVolumeChangeCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onVolumeChangeCapture", js.Any.fromFunction1(value))
    
    inline def setOnVolumeChangeCaptureUndefined: Self = StObject.set(x, "onVolumeChangeCapture", js.undefined)
    
    inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    inline def setOnWaiting(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
    
    inline def setOnWaitingCapture(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onWaitingCapture", js.Any.fromFunction1(value))
    
    inline def setOnWaitingCaptureUndefined: Self = StObject.set(x, "onWaitingCapture", js.undefined)
    
    inline def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    inline def setOnWheel(value: WheelEvent[T] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    
    inline def setOnWheelCapture(value: WheelEvent[T] => Unit): Self = StObject.set(x, "onWheelCapture", js.Any.fromFunction1(value))
    
    inline def setOnWheelCaptureUndefined: Self = StObject.set(x, "onWheelCapture", js.undefined)
    
    inline def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
  }
}
