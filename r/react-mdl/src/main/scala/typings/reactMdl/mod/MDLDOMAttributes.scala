package typings.reactMdl.mod

import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.CompositionEvent
import typings.react.mod.CompositionEventHandler
import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.NativeUIEvent
import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import typings.react.mod.WheelEvent
import typings.react.mod.WheelEventHandler
import typings.reactMdl.anon.Html
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// DOMAttributes (minus 'onClick', 'onChange')
trait MDLDOMAttributes[T] extends StObject {
  
  // DOMAttributes (minus onClick)
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  
  // Media Events
  var onAbort: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[T]] = js.undefined
  
  var onCanPlay: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onCanPlayThrough: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  // Composition Events
  var onCompositionEnd: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onCompositionStart: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  var onCompositionUpdate: js.UndefOr[CompositionEventHandler[T]] = js.undefined
  
  // MouseEvents
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
  
  // Form Events
  var onInput: js.UndefOr[FormEventHandler[T]] = js.undefined
  
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
  
  var onProgress: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onRateChange: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
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
  
  var onVolumeChange: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onWaiting: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  // Wheel Events
  var onWheel: js.UndefOr[WheelEventHandler[T]] = js.undefined
}
object MDLDOMAttributes {
  
  @scala.inline
  def apply[T](): MDLDOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MDLDOMAttributes[T]]
  }
  
  @scala.inline
  implicit class MDLDOMAttributesMutableBuilder[Self <: MDLDOMAttributes[?], T] (val x: Self & MDLDOMAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    
    @scala.inline
    def setOnAbort(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
    
    @scala.inline
    def setOnBlur(value: FocusEvent[T] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnCanPlay(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanPlayThrough(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
    
    @scala.inline
    def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
    
    @scala.inline
    def setOnCompositionEnd(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
    
    @scala.inline
    def setOnCompositionStart(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
    
    @scala.inline
    def setOnCompositionUpdate(value: CompositionEvent[T] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    @scala.inline
    def setOnCopy(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
    
    @scala.inline
    def setOnCut(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnDrag(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEnd(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragEnter(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
    
    @scala.inline
    def setOnDragExit(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    @scala.inline
    def setOnDragOver(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    @scala.inline
    def setOnDrop(value: DragEvent[T] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
    
    @scala.inline
    def setOnDurationChange(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
    
    @scala.inline
    def setOnEmptied(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
    
    @scala.inline
    def setOnEncrypted(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
    
    @scala.inline
    def setOnEnded(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    @scala.inline
    def setOnError(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEvent[T] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnInput(value: FormEvent[T] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[T] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setOnLoad(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadStart(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnLoadedData(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
    
    @scala.inline
    def setOnLoadedMetadata(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: MouseEvent[T, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnPaste(value: ClipboardEvent[T] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    @scala.inline
    def setOnPause(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    @scala.inline
    def setOnPlaying(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
    
    @scala.inline
    def setOnProgress(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    @scala.inline
    def setOnRateChange(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
    
    @scala.inline
    def setOnScroll(value: UIEvent[T, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOnSeeked(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
    
    @scala.inline
    def setOnSeeking(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
    
    @scala.inline
    def setOnSelect(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOnStalled(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: FormEvent[T] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    @scala.inline
    def setOnSuspend(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
    
    @scala.inline
    def setOnTimeUpdate(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: TouchEvent[T] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    @scala.inline
    def setOnVolumeChange(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
    
    @scala.inline
    def setOnWaiting(value: SyntheticEvent[T, Event] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
    
    @scala.inline
    def setOnWheel(value: WheelEvent[T] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
  }
}
