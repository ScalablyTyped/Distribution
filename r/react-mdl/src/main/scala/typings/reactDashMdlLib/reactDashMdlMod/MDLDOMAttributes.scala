package typings
package reactDashMdlLib.reactDashMdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// DOMAttributes (minus 'onClick', 'onChange')
trait MDLDOMAttributes[T] extends js.Object {
  // DOMAttributes (minus onClick)
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var dangerouslySetInnerHTML: js.UndefOr[reactDashMdlLib.Anon_Html] = js.undefined
  // Media Events
  var onAbort: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onBlur: js.UndefOr[reactLib.reactMod.FocusEventHandler[T]] = js.undefined
  var onCanPlay: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onCanPlayThrough: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  // Composition Events
  var onCompositionEnd: js.UndefOr[reactLib.reactMod.CompositionEventHandler[T]] = js.undefined
  var onCompositionStart: js.UndefOr[reactLib.reactMod.CompositionEventHandler[T]] = js.undefined
  var onCompositionUpdate: js.UndefOr[reactLib.reactMod.CompositionEventHandler[T]] = js.undefined
  // MouseEvents
  var onContextMenu: js.UndefOr[reactLib.reactMod.MouseEventHandler[T]] = js.undefined
  // Clipboard Events
  var onCopy: js.UndefOr[reactLib.reactMod.ClipboardEventHandler[T]] = js.undefined
  var onCut: js.UndefOr[reactLib.reactMod.ClipboardEventHandler[T]] = js.undefined
  var onDoubleClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[T]] = js.undefined
  var onDrag: js.UndefOr[reactLib.reactMod.DragEventHandler[T]] = js.undefined
  var onDragEnd: js.UndefOr[reactLib.reactMod.DragEventHandler[T]] = js.undefined
  var onDragEnter: js.UndefOr[reactLib.reactMod.DragEventHandler[T]] = js.undefined
  var onDragExit: js.UndefOr[reactLib.reactMod.DragEventHandler[T]] = js.undefined
  var onDragLeave: js.UndefOr[reactLib.reactMod.DragEventHandler[T]] = js.undefined
  var onDragOver: js.UndefOr[reactLib.reactMod.DragEventHandler[T]] = js.undefined
  var onDragStart: js.UndefOr[reactLib.reactMod.DragEventHandler[T]] = js.undefined
  var onDrop: js.UndefOr[reactLib.reactMod.DragEventHandler[T]] = js.undefined
  var onDurationChange: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onEmptied: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onEncrypted: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onEnded: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onError: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  // Focus Events
  var onFocus: js.UndefOr[reactLib.reactMod.FocusEventHandler[T]] = js.undefined
  // Form Events
  var onInput: js.UndefOr[reactLib.reactMod.FormEventHandler[T]] = js.undefined
   // also a Media Event
  // Keyboard Events
  var onKeyDown: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[T]] = js.undefined
  var onKeyPress: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[T]] = js.undefined
  var onKeyUp: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[T]] = js.undefined
  // Image Events
  var onLoad: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onLoadStart: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onLoadedData: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onLoadedMetadata: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onMouseDown: js.UndefOr[reactLib.reactMod.MouseEventHandler[T]] = js.undefined
  var onMouseEnter: js.UndefOr[reactLib.reactMod.MouseEventHandler[T]] = js.undefined
  var onMouseLeave: js.UndefOr[reactLib.reactMod.MouseEventHandler[T]] = js.undefined
  var onMouseMove: js.UndefOr[reactLib.reactMod.MouseEventHandler[T]] = js.undefined
  var onMouseOut: js.UndefOr[reactLib.reactMod.MouseEventHandler[T]] = js.undefined
  var onMouseOver: js.UndefOr[reactLib.reactMod.MouseEventHandler[T]] = js.undefined
  var onMouseUp: js.UndefOr[reactLib.reactMod.MouseEventHandler[T]] = js.undefined
  var onPaste: js.UndefOr[reactLib.reactMod.ClipboardEventHandler[T]] = js.undefined
  var onPause: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onPlay: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onPlaying: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onProgress: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onRateChange: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  // UI Events
  var onScroll: js.UndefOr[reactLib.reactMod.UIEventHandler[T]] = js.undefined
  var onSeeked: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onSeeking: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  // Selection Events
  var onSelect: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onStalled: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onSubmit: js.UndefOr[reactLib.reactMod.FormEventHandler[T]] = js.undefined
  var onSuspend: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onTimeUpdate: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  // Touch Events
  var onTouchCancel: js.UndefOr[reactLib.reactMod.TouchEventHandler[T]] = js.undefined
  var onTouchEnd: js.UndefOr[reactLib.reactMod.TouchEventHandler[T]] = js.undefined
  var onTouchMove: js.UndefOr[reactLib.reactMod.TouchEventHandler[T]] = js.undefined
  var onTouchStart: js.UndefOr[reactLib.reactMod.TouchEventHandler[T]] = js.undefined
  var onVolumeChange: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  var onWaiting: js.UndefOr[reactLib.reactMod.ReactEventHandler[T]] = js.undefined
  // Wheel Events
  var onWheel: js.UndefOr[reactLib.reactMod.WheelEventHandler[T]] = js.undefined
}

object MDLDOMAttributes {
  @scala.inline
  def apply[T](
    children: reactLib.reactMod.ReactNode = null,
    dangerouslySetInnerHTML: reactDashMdlLib.Anon_Html = null,
    onAbort: reactLib.reactMod.ReactEventHandler[T] = null,
    onBlur: reactLib.reactMod.FocusEventHandler[T] = null,
    onCanPlay: reactLib.reactMod.ReactEventHandler[T] = null,
    onCanPlayThrough: reactLib.reactMod.ReactEventHandler[T] = null,
    onCompositionEnd: reactLib.reactMod.CompositionEventHandler[T] = null,
    onCompositionStart: reactLib.reactMod.CompositionEventHandler[T] = null,
    onCompositionUpdate: reactLib.reactMod.CompositionEventHandler[T] = null,
    onContextMenu: reactLib.reactMod.MouseEventHandler[T] = null,
    onCopy: reactLib.reactMod.ClipboardEventHandler[T] = null,
    onCut: reactLib.reactMod.ClipboardEventHandler[T] = null,
    onDoubleClick: reactLib.reactMod.MouseEventHandler[T] = null,
    onDrag: reactLib.reactMod.DragEventHandler[T] = null,
    onDragEnd: reactLib.reactMod.DragEventHandler[T] = null,
    onDragEnter: reactLib.reactMod.DragEventHandler[T] = null,
    onDragExit: reactLib.reactMod.DragEventHandler[T] = null,
    onDragLeave: reactLib.reactMod.DragEventHandler[T] = null,
    onDragOver: reactLib.reactMod.DragEventHandler[T] = null,
    onDragStart: reactLib.reactMod.DragEventHandler[T] = null,
    onDrop: reactLib.reactMod.DragEventHandler[T] = null,
    onDurationChange: reactLib.reactMod.ReactEventHandler[T] = null,
    onEmptied: reactLib.reactMod.ReactEventHandler[T] = null,
    onEncrypted: reactLib.reactMod.ReactEventHandler[T] = null,
    onEnded: reactLib.reactMod.ReactEventHandler[T] = null,
    onError: reactLib.reactMod.ReactEventHandler[T] = null,
    onFocus: reactLib.reactMod.FocusEventHandler[T] = null,
    onInput: reactLib.reactMod.FormEventHandler[T] = null,
    onKeyDown: reactLib.reactMod.KeyboardEventHandler[T] = null,
    onKeyPress: reactLib.reactMod.KeyboardEventHandler[T] = null,
    onKeyUp: reactLib.reactMod.KeyboardEventHandler[T] = null,
    onLoad: reactLib.reactMod.ReactEventHandler[T] = null,
    onLoadStart: reactLib.reactMod.ReactEventHandler[T] = null,
    onLoadedData: reactLib.reactMod.ReactEventHandler[T] = null,
    onLoadedMetadata: reactLib.reactMod.ReactEventHandler[T] = null,
    onMouseDown: reactLib.reactMod.MouseEventHandler[T] = null,
    onMouseEnter: reactLib.reactMod.MouseEventHandler[T] = null,
    onMouseLeave: reactLib.reactMod.MouseEventHandler[T] = null,
    onMouseMove: reactLib.reactMod.MouseEventHandler[T] = null,
    onMouseOut: reactLib.reactMod.MouseEventHandler[T] = null,
    onMouseOver: reactLib.reactMod.MouseEventHandler[T] = null,
    onMouseUp: reactLib.reactMod.MouseEventHandler[T] = null,
    onPaste: reactLib.reactMod.ClipboardEventHandler[T] = null,
    onPause: reactLib.reactMod.ReactEventHandler[T] = null,
    onPlay: reactLib.reactMod.ReactEventHandler[T] = null,
    onPlaying: reactLib.reactMod.ReactEventHandler[T] = null,
    onProgress: reactLib.reactMod.ReactEventHandler[T] = null,
    onRateChange: reactLib.reactMod.ReactEventHandler[T] = null,
    onScroll: reactLib.reactMod.UIEventHandler[T] = null,
    onSeeked: reactLib.reactMod.ReactEventHandler[T] = null,
    onSeeking: reactLib.reactMod.ReactEventHandler[T] = null,
    onSelect: reactLib.reactMod.ReactEventHandler[T] = null,
    onStalled: reactLib.reactMod.ReactEventHandler[T] = null,
    onSubmit: reactLib.reactMod.FormEventHandler[T] = null,
    onSuspend: reactLib.reactMod.ReactEventHandler[T] = null,
    onTimeUpdate: reactLib.reactMod.ReactEventHandler[T] = null,
    onTouchCancel: reactLib.reactMod.TouchEventHandler[T] = null,
    onTouchEnd: reactLib.reactMod.TouchEventHandler[T] = null,
    onTouchMove: reactLib.reactMod.TouchEventHandler[T] = null,
    onTouchStart: reactLib.reactMod.TouchEventHandler[T] = null,
    onVolumeChange: reactLib.reactMod.ReactEventHandler[T] = null,
    onWaiting: reactLib.reactMod.ReactEventHandler[T] = null,
    onWheel: reactLib.reactMod.WheelEventHandler[T] = null
  ): MDLDOMAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML)
    if (onAbort != null) __obj.updateDynamic("onAbort")(onAbort)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(onCanPlay)
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(onCanPlayThrough)
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(onCompositionEnd)
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(onCompositionStart)
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(onCompositionUpdate)
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu)
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy)
    if (onCut != null) __obj.updateDynamic("onCut")(onCut)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(onDurationChange)
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(onEmptied)
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(onEncrypted)
    if (onEnded != null) __obj.updateDynamic("onEnded")(onEnded)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onInput != null) __obj.updateDynamic("onInput")(onInput)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(onLoadStart)
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(onLoadedData)
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(onLoadedMetadata)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onPaste != null) __obj.updateDynamic("onPaste")(onPaste)
    if (onPause != null) __obj.updateDynamic("onPause")(onPause)
    if (onPlay != null) __obj.updateDynamic("onPlay")(onPlay)
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(onPlaying)
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress)
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(onRateChange)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(onSeeked)
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(onSeeking)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onStalled != null) __obj.updateDynamic("onStalled")(onStalled)
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit)
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(onSuspend)
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(onTimeUpdate)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(onVolumeChange)
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(onWaiting)
    if (onWheel != null) __obj.updateDynamic("onWheel")(onWheel)
    __obj.asInstanceOf[MDLDOMAttributes[T]]
  }
}

