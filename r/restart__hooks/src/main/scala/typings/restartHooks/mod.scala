package typings.restartHooks

import typings.react.mod.MutableRefObject
import typings.restartHooks.restartHooksStrings.`use-credentials`
import typings.restartHooks.restartHooksStrings.abort
import typings.restartHooks.restartHooksStrings.animationcancel
import typings.restartHooks.restartHooksStrings.animationend
import typings.restartHooks.restartHooksStrings.animationiteration
import typings.restartHooks.restartHooksStrings.animationstart
import typings.restartHooks.restartHooksStrings.anonymous
import typings.restartHooks.restartHooksStrings.auxclick
import typings.restartHooks.restartHooksStrings.blur
import typings.restartHooks.restartHooksStrings.cancel
import typings.restartHooks.restartHooksStrings.canplay
import typings.restartHooks.restartHooksStrings.canplaythrough
import typings.restartHooks.restartHooksStrings.change
import typings.restartHooks.restartHooksStrings.click
import typings.restartHooks.restartHooksStrings.close
import typings.restartHooks.restartHooksStrings.contextmenu
import typings.restartHooks.restartHooksStrings.copy
import typings.restartHooks.restartHooksStrings.cuechange
import typings.restartHooks.restartHooksStrings.cut
import typings.restartHooks.restartHooksStrings.dblclick
import typings.restartHooks.restartHooksStrings.drag
import typings.restartHooks.restartHooksStrings.dragend
import typings.restartHooks.restartHooksStrings.dragenter
import typings.restartHooks.restartHooksStrings.dragexit
import typings.restartHooks.restartHooksStrings.dragleave
import typings.restartHooks.restartHooksStrings.dragover
import typings.restartHooks.restartHooksStrings.dragstart
import typings.restartHooks.restartHooksStrings.drop
import typings.restartHooks.restartHooksStrings.durationchange
import typings.restartHooks.restartHooksStrings.emptied
import typings.restartHooks.restartHooksStrings.ended
import typings.restartHooks.restartHooksStrings.error
import typings.restartHooks.restartHooksStrings.focus
import typings.restartHooks.restartHooksStrings.focusin
import typings.restartHooks.restartHooksStrings.focusout
import typings.restartHooks.restartHooksStrings.fullscreenchange
import typings.restartHooks.restartHooksStrings.fullscreenerror
import typings.restartHooks.restartHooksStrings.gotpointercapture
import typings.restartHooks.restartHooksStrings.input
import typings.restartHooks.restartHooksStrings.invalid
import typings.restartHooks.restartHooksStrings.keydown
import typings.restartHooks.restartHooksStrings.keypress
import typings.restartHooks.restartHooksStrings.keyup
import typings.restartHooks.restartHooksStrings.load
import typings.restartHooks.restartHooksStrings.loadeddata
import typings.restartHooks.restartHooksStrings.loadedmetadata
import typings.restartHooks.restartHooksStrings.loadstart
import typings.restartHooks.restartHooksStrings.lostpointercapture
import typings.restartHooks.restartHooksStrings.mousedown
import typings.restartHooks.restartHooksStrings.mouseenter
import typings.restartHooks.restartHooksStrings.mouseleave
import typings.restartHooks.restartHooksStrings.mousemove
import typings.restartHooks.restartHooksStrings.mouseout
import typings.restartHooks.restartHooksStrings.mouseover
import typings.restartHooks.restartHooksStrings.mouseup
import typings.restartHooks.restartHooksStrings.paste
import typings.restartHooks.restartHooksStrings.pause
import typings.restartHooks.restartHooksStrings.play
import typings.restartHooks.restartHooksStrings.playing
import typings.restartHooks.restartHooksStrings.pointercancel
import typings.restartHooks.restartHooksStrings.pointerdown
import typings.restartHooks.restartHooksStrings.pointerenter
import typings.restartHooks.restartHooksStrings.pointerleave
import typings.restartHooks.restartHooksStrings.pointerlockchange
import typings.restartHooks.restartHooksStrings.pointerlockerror
import typings.restartHooks.restartHooksStrings.pointermove
import typings.restartHooks.restartHooksStrings.pointerout
import typings.restartHooks.restartHooksStrings.pointerover
import typings.restartHooks.restartHooksStrings.pointerup
import typings.restartHooks.restartHooksStrings.progress
import typings.restartHooks.restartHooksStrings.ratechange
import typings.restartHooks.restartHooksStrings.readystatechange
import typings.restartHooks.restartHooksStrings.reset
import typings.restartHooks.restartHooksStrings.resize
import typings.restartHooks.restartHooksStrings.scroll
import typings.restartHooks.restartHooksStrings.securitypolicyviolation
import typings.restartHooks.restartHooksStrings.seeked
import typings.restartHooks.restartHooksStrings.seeking
import typings.restartHooks.restartHooksStrings.select
import typings.restartHooks.restartHooksStrings.selectionchange
import typings.restartHooks.restartHooksStrings.selectstart
import typings.restartHooks.restartHooksStrings.stalled
import typings.restartHooks.restartHooksStrings.submit
import typings.restartHooks.restartHooksStrings.suspend
import typings.restartHooks.restartHooksStrings.timeupdate
import typings.restartHooks.restartHooksStrings.toggle
import typings.restartHooks.restartHooksStrings.touchcancel
import typings.restartHooks.restartHooksStrings.touchend
import typings.restartHooks.restartHooksStrings.touchmove
import typings.restartHooks.restartHooksStrings.touchstart
import typings.restartHooks.restartHooksStrings.transitioncancel
import typings.restartHooks.restartHooksStrings.transitionend
import typings.restartHooks.restartHooksStrings.transitionrun
import typings.restartHooks.restartHooksStrings.transitionstart
import typings.restartHooks.restartHooksStrings.visibilitychange
import typings.restartHooks.restartHooksStrings.volumechange
import typings.restartHooks.restartHooksStrings.waiting
import typings.restartHooks.restartHooksStrings.wheel
import typings.restartHooks.useEventListenerMod.EventHandler
import typings.restartHooks.useGlobalListenerMod.DocumentEventHandler
import typings.restartHooks.useImageMod.State
import typings.restartHooks.useMergeStateFromPropsMod.Mapper
import typings.restartHooks.useMergeStateMod.MergeStateSetter
import typings.restartHooks.useResizeObserverMod.Rect
import typings.std.AddEventListenerOptions
import typings.std.Document
import typings.std.Element
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@restart/hooks", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def useCallbackRef[TValue](): js.Tuple2[TValue | Null, js.Function1[/* ref */ TValue | Null, Unit]] = js.native
  
  /**
    * Creates a `Ref` whose value is updated in an effect, ensuring the most recent
    * value is the one rendered with. Generally only required for Concurrent mode usage
    * where previous work in `render()` may be discarded befor being used.
    *
    * This is safe to access in an event handler.
    *
    * @param value The `Ref` value
    */
  def useCommittedRef[TValue](value: TValue): MutableRefObject[TValue] = js.native
  
  def useEventCallback[TCallback /* <: js.Function1[/* repeated */ js.Any, _] */](): TCallback = js.native
  def useEventCallback[TCallback /* <: js.Function1[/* repeated */ js.Any, _] */](fn: TCallback): TCallback = js.native
  
  @JSName("useEventListener")
  def useEventListener_abort[T /* <: Element | Document | Window */](eventTarget: T, event: abort, listener: EventHandler[T, abort]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_abort[T /* <: Element | Document | Window */](eventTarget: T, event: abort, listener: EventHandler[T, abort], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_abort[T /* <: Element | Document | Window */](eventTarget: T, event: abort, listener: EventHandler[T, abort], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_abort[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: abort, listener: EventHandler[T, abort]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_abort[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: abort, listener: EventHandler[T, abort], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_abort[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: abort,
    listener: EventHandler[T, abort],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationcancel[T /* <: Element | Document | Window */](eventTarget: T, event: animationcancel, listener: EventHandler[T, animationcancel]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationcancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationcancel,
    listener: EventHandler[T, animationcancel],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationcancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationcancel,
    listener: EventHandler[T, animationcancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationcancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: animationcancel, listener: EventHandler[T, animationcancel]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationcancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationcancel,
    listener: EventHandler[T, animationcancel],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationcancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationcancel,
    listener: EventHandler[T, animationcancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationend[T /* <: Element | Document | Window */](eventTarget: T, event: animationend, listener: EventHandler[T, animationend]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationend[T /* <: Element | Document | Window */](eventTarget: T, event: animationend, listener: EventHandler[T, animationend], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationend,
    listener: EventHandler[T, animationend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: animationend, listener: EventHandler[T, animationend]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationend,
    listener: EventHandler[T, animationend],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationend,
    listener: EventHandler[T, animationend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationiteration[T /* <: Element | Document | Window */](eventTarget: T, event: animationiteration, listener: EventHandler[T, animationiteration]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationiteration,
    listener: EventHandler[T, animationiteration],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationiteration,
    listener: EventHandler[T, animationiteration],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationiteration,
    listener: EventHandler[T, animationiteration]
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationiteration,
    listener: EventHandler[T, animationiteration],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationiteration,
    listener: EventHandler[T, animationiteration],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationstart[T /* <: Element | Document | Window */](eventTarget: T, event: animationstart, listener: EventHandler[T, animationstart]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationstart[T /* <: Element | Document | Window */](eventTarget: T, event: animationstart, listener: EventHandler[T, animationstart], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationstart,
    listener: EventHandler[T, animationstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: animationstart, listener: EventHandler[T, animationstart]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationstart,
    listener: EventHandler[T, animationstart],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_animationstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationstart,
    listener: EventHandler[T, animationstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_auxclick[T /* <: Element | Document | Window */](eventTarget: T, event: auxclick, listener: EventHandler[T, auxclick]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_auxclick[T /* <: Element | Document | Window */](eventTarget: T, event: auxclick, listener: EventHandler[T, auxclick], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_auxclick[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: auxclick,
    listener: EventHandler[T, auxclick],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_auxclick[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: auxclick, listener: EventHandler[T, auxclick]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_auxclick[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: auxclick,
    listener: EventHandler[T, auxclick],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_auxclick[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: auxclick,
    listener: EventHandler[T, auxclick],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_blur[T /* <: Element | Document | Window */](eventTarget: T, event: blur, listener: EventHandler[T, blur]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_blur[T /* <: Element | Document | Window */](eventTarget: T, event: blur, listener: EventHandler[T, blur], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_blur[T /* <: Element | Document | Window */](eventTarget: T, event: blur, listener: EventHandler[T, blur], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_blur[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: blur, listener: EventHandler[T, blur]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_blur[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: blur, listener: EventHandler[T, blur], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_blur[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: blur,
    listener: EventHandler[T, blur],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cancel[T /* <: Element | Document | Window */](eventTarget: T, event: cancel, listener: EventHandler[T, cancel]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cancel[T /* <: Element | Document | Window */](eventTarget: T, event: cancel, listener: EventHandler[T, cancel], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cancel[T /* <: Element | Document | Window */](eventTarget: T, event: cancel, listener: EventHandler[T, cancel], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cancel, listener: EventHandler[T, cancel]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cancel, listener: EventHandler[T, cancel], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: cancel,
    listener: EventHandler[T, cancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_canplay[T /* <: Element | Document | Window */](eventTarget: T, event: canplay, listener: EventHandler[T, canplay]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_canplay[T /* <: Element | Document | Window */](eventTarget: T, event: canplay, listener: EventHandler[T, canplay], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_canplay[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: canplay,
    listener: EventHandler[T, canplay],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_canplay[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: canplay, listener: EventHandler[T, canplay]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_canplay[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: canplay, listener: EventHandler[T, canplay], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_canplay[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: canplay,
    listener: EventHandler[T, canplay],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_canplaythrough[T /* <: Element | Document | Window */](eventTarget: T, event: canplaythrough, listener: EventHandler[T, canplaythrough]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_canplaythrough[T /* <: Element | Document | Window */](eventTarget: T, event: canplaythrough, listener: EventHandler[T, canplaythrough], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_canplaythrough[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: canplaythrough,
    listener: EventHandler[T, canplaythrough],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_canplaythrough[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: canplaythrough, listener: EventHandler[T, canplaythrough]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_canplaythrough[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: canplaythrough,
    listener: EventHandler[T, canplaythrough],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_canplaythrough[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: canplaythrough,
    listener: EventHandler[T, canplaythrough],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_change[T /* <: Element | Document | Window */](eventTarget: T, event: change, listener: EventHandler[T, change]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_change[T /* <: Element | Document | Window */](eventTarget: T, event: change, listener: EventHandler[T, change], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_change[T /* <: Element | Document | Window */](eventTarget: T, event: change, listener: EventHandler[T, change], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_change[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: change, listener: EventHandler[T, change]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_change[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: change, listener: EventHandler[T, change], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_change[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: change,
    listener: EventHandler[T, change],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_click[T /* <: Element | Document | Window */](eventTarget: T, event: click, listener: EventHandler[T, click]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_click[T /* <: Element | Document | Window */](eventTarget: T, event: click, listener: EventHandler[T, click], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_click[T /* <: Element | Document | Window */](eventTarget: T, event: click, listener: EventHandler[T, click], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_click[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: click, listener: EventHandler[T, click]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_click[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: click, listener: EventHandler[T, click], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_click[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: click,
    listener: EventHandler[T, click],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_close[T /* <: Element | Document | Window */](eventTarget: T, event: close, listener: EventHandler[T, close]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_close[T /* <: Element | Document | Window */](eventTarget: T, event: close, listener: EventHandler[T, close], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_close[T /* <: Element | Document | Window */](eventTarget: T, event: close, listener: EventHandler[T, close], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_close[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: close, listener: EventHandler[T, close]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_close[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: close, listener: EventHandler[T, close], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_close[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: close,
    listener: EventHandler[T, close],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_contextmenu[T /* <: Element | Document | Window */](eventTarget: T, event: contextmenu, listener: EventHandler[T, contextmenu]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_contextmenu[T /* <: Element | Document | Window */](eventTarget: T, event: contextmenu, listener: EventHandler[T, contextmenu], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_contextmenu[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: contextmenu,
    listener: EventHandler[T, contextmenu],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_contextmenu[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: contextmenu, listener: EventHandler[T, contextmenu]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_contextmenu[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: contextmenu,
    listener: EventHandler[T, contextmenu],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_contextmenu[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: contextmenu,
    listener: EventHandler[T, contextmenu],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_copy[T /* <: Element | Document | Window */](eventTarget: T, event: copy, listener: EventHandler[T, copy]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_copy[T /* <: Element | Document | Window */](eventTarget: T, event: copy, listener: EventHandler[T, copy], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_copy[T /* <: Element | Document | Window */](eventTarget: T, event: copy, listener: EventHandler[T, copy], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_copy[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: copy, listener: EventHandler[T, copy]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_copy[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: copy, listener: EventHandler[T, copy], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_copy[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: copy,
    listener: EventHandler[T, copy],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cuechange[T /* <: Element | Document | Window */](eventTarget: T, event: cuechange, listener: EventHandler[T, cuechange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cuechange[T /* <: Element | Document | Window */](eventTarget: T, event: cuechange, listener: EventHandler[T, cuechange], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cuechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: cuechange,
    listener: EventHandler[T, cuechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cuechange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cuechange, listener: EventHandler[T, cuechange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cuechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: cuechange,
    listener: EventHandler[T, cuechange],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cuechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: cuechange,
    listener: EventHandler[T, cuechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cut[T /* <: Element | Document | Window */](eventTarget: T, event: cut, listener: EventHandler[T, cut]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cut[T /* <: Element | Document | Window */](eventTarget: T, event: cut, listener: EventHandler[T, cut], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cut[T /* <: Element | Document | Window */](eventTarget: T, event: cut, listener: EventHandler[T, cut], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cut[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cut, listener: EventHandler[T, cut]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cut[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cut, listener: EventHandler[T, cut], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_cut[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: cut,
    listener: EventHandler[T, cut],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dblclick[T /* <: Element | Document | Window */](eventTarget: T, event: dblclick, listener: EventHandler[T, dblclick]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dblclick[T /* <: Element | Document | Window */](eventTarget: T, event: dblclick, listener: EventHandler[T, dblclick], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dblclick[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dblclick,
    listener: EventHandler[T, dblclick],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dblclick[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dblclick, listener: EventHandler[T, dblclick]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dblclick[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dblclick,
    listener: EventHandler[T, dblclick],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dblclick[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dblclick,
    listener: EventHandler[T, dblclick],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_drag[T /* <: Element | Document | Window */](eventTarget: T, event: drag, listener: EventHandler[T, drag]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_drag[T /* <: Element | Document | Window */](eventTarget: T, event: drag, listener: EventHandler[T, drag], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_drag[T /* <: Element | Document | Window */](eventTarget: T, event: drag, listener: EventHandler[T, drag], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_drag[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: drag, listener: EventHandler[T, drag]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_drag[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: drag, listener: EventHandler[T, drag], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_drag[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: drag,
    listener: EventHandler[T, drag],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragend[T /* <: Element | Document | Window */](eventTarget: T, event: dragend, listener: EventHandler[T, dragend]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragend[T /* <: Element | Document | Window */](eventTarget: T, event: dragend, listener: EventHandler[T, dragend], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragend,
    listener: EventHandler[T, dragend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragend, listener: EventHandler[T, dragend]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragend, listener: EventHandler[T, dragend], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragend,
    listener: EventHandler[T, dragend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragenter[T /* <: Element | Document | Window */](eventTarget: T, event: dragenter, listener: EventHandler[T, dragenter]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragenter[T /* <: Element | Document | Window */](eventTarget: T, event: dragenter, listener: EventHandler[T, dragenter], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragenter[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragenter,
    listener: EventHandler[T, dragenter],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragenter[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragenter, listener: EventHandler[T, dragenter]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragenter,
    listener: EventHandler[T, dragenter],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragenter,
    listener: EventHandler[T, dragenter],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragexit[T /* <: Element | Document | Window */](eventTarget: T, event: dragexit, listener: EventHandler[T, dragexit]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragexit[T /* <: Element | Document | Window */](eventTarget: T, event: dragexit, listener: EventHandler[T, dragexit], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragexit[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragexit,
    listener: EventHandler[T, dragexit],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragexit[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragexit, listener: EventHandler[T, dragexit]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragexit[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragexit,
    listener: EventHandler[T, dragexit],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragexit[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragexit,
    listener: EventHandler[T, dragexit],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragleave[T /* <: Element | Document | Window */](eventTarget: T, event: dragleave, listener: EventHandler[T, dragleave]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragleave[T /* <: Element | Document | Window */](eventTarget: T, event: dragleave, listener: EventHandler[T, dragleave], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragleave[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragleave,
    listener: EventHandler[T, dragleave],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragleave[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragleave, listener: EventHandler[T, dragleave]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragleave,
    listener: EventHandler[T, dragleave],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragleave,
    listener: EventHandler[T, dragleave],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragover[T /* <: Element | Document | Window */](eventTarget: T, event: dragover, listener: EventHandler[T, dragover]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragover[T /* <: Element | Document | Window */](eventTarget: T, event: dragover, listener: EventHandler[T, dragover], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragover[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragover,
    listener: EventHandler[T, dragover],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragover[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragover, listener: EventHandler[T, dragover]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragover,
    listener: EventHandler[T, dragover],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragover,
    listener: EventHandler[T, dragover],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragstart[T /* <: Element | Document | Window */](eventTarget: T, event: dragstart, listener: EventHandler[T, dragstart]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragstart[T /* <: Element | Document | Window */](eventTarget: T, event: dragstart, listener: EventHandler[T, dragstart], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragstart,
    listener: EventHandler[T, dragstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragstart, listener: EventHandler[T, dragstart]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragstart,
    listener: EventHandler[T, dragstart],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_dragstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragstart,
    listener: EventHandler[T, dragstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_drop[T /* <: Element | Document | Window */](eventTarget: T, event: drop, listener: EventHandler[T, drop]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_drop[T /* <: Element | Document | Window */](eventTarget: T, event: drop, listener: EventHandler[T, drop], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_drop[T /* <: Element | Document | Window */](eventTarget: T, event: drop, listener: EventHandler[T, drop], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_drop[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: drop, listener: EventHandler[T, drop]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_drop[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: drop, listener: EventHandler[T, drop], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_drop[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: drop,
    listener: EventHandler[T, drop],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_durationchange[T /* <: Element | Document | Window */](eventTarget: T, event: durationchange, listener: EventHandler[T, durationchange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_durationchange[T /* <: Element | Document | Window */](eventTarget: T, event: durationchange, listener: EventHandler[T, durationchange], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_durationchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: durationchange,
    listener: EventHandler[T, durationchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_durationchange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: durationchange, listener: EventHandler[T, durationchange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_durationchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: durationchange,
    listener: EventHandler[T, durationchange],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_durationchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: durationchange,
    listener: EventHandler[T, durationchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_emptied[T /* <: Element | Document | Window */](eventTarget: T, event: emptied, listener: EventHandler[T, emptied]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_emptied[T /* <: Element | Document | Window */](eventTarget: T, event: emptied, listener: EventHandler[T, emptied], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_emptied[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: emptied,
    listener: EventHandler[T, emptied],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_emptied[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: emptied, listener: EventHandler[T, emptied]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_emptied[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: emptied, listener: EventHandler[T, emptied], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_emptied[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: emptied,
    listener: EventHandler[T, emptied],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_ended[T /* <: Element | Document | Window */](eventTarget: T, event: ended, listener: EventHandler[T, ended]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_ended[T /* <: Element | Document | Window */](eventTarget: T, event: ended, listener: EventHandler[T, ended], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_ended[T /* <: Element | Document | Window */](eventTarget: T, event: ended, listener: EventHandler[T, ended], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_ended[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: ended, listener: EventHandler[T, ended]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_ended[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: ended, listener: EventHandler[T, ended], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_ended[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: ended,
    listener: EventHandler[T, ended],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_error[T /* <: Element | Document | Window */](eventTarget: T, event: error, listener: EventHandler[T, error]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_error[T /* <: Element | Document | Window */](eventTarget: T, event: error, listener: EventHandler[T, error], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_error[T /* <: Element | Document | Window */](eventTarget: T, event: error, listener: EventHandler[T, error], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_error[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: error, listener: EventHandler[T, error]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_error[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: error, listener: EventHandler[T, error], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_error[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: error,
    listener: EventHandler[T, error],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focus[T /* <: Element | Document | Window */](eventTarget: T, event: focus, listener: EventHandler[T, focus]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focus[T /* <: Element | Document | Window */](eventTarget: T, event: focus, listener: EventHandler[T, focus], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focus[T /* <: Element | Document | Window */](eventTarget: T, event: focus, listener: EventHandler[T, focus], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focus[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focus, listener: EventHandler[T, focus]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focus[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focus, listener: EventHandler[T, focus], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focus[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: focus,
    listener: EventHandler[T, focus],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focusin[T /* <: Element | Document | Window */](eventTarget: T, event: focusin, listener: EventHandler[T, focusin]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focusin[T /* <: Element | Document | Window */](eventTarget: T, event: focusin, listener: EventHandler[T, focusin], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focusin[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: focusin,
    listener: EventHandler[T, focusin],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focusin[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focusin, listener: EventHandler[T, focusin]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focusin[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focusin, listener: EventHandler[T, focusin], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focusin[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: focusin,
    listener: EventHandler[T, focusin],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focusout[T /* <: Element | Document | Window */](eventTarget: T, event: focusout, listener: EventHandler[T, focusout]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focusout[T /* <: Element | Document | Window */](eventTarget: T, event: focusout, listener: EventHandler[T, focusout], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focusout[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: focusout,
    listener: EventHandler[T, focusout],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focusout[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focusout, listener: EventHandler[T, focusout]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focusout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: focusout,
    listener: EventHandler[T, focusout],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_focusout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: focusout,
    listener: EventHandler[T, focusout],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_fullscreenchange[T /* <: Element | Document | Window */](eventTarget: T, event: fullscreenchange, listener: EventHandler[T, fullscreenchange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_fullscreenchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: fullscreenchange,
    listener: EventHandler[T, fullscreenchange],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_fullscreenchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: fullscreenchange,
    listener: EventHandler[T, fullscreenchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_fullscreenchange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: fullscreenchange, listener: EventHandler[T, fullscreenchange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_fullscreenchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: fullscreenchange,
    listener: EventHandler[T, fullscreenchange],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_fullscreenchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: fullscreenchange,
    listener: EventHandler[T, fullscreenchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_fullscreenerror[T /* <: Element | Document | Window */](eventTarget: T, event: fullscreenerror, listener: EventHandler[T, fullscreenerror]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_fullscreenerror[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: fullscreenerror,
    listener: EventHandler[T, fullscreenerror],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_fullscreenerror[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: fullscreenerror,
    listener: EventHandler[T, fullscreenerror],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_fullscreenerror[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: fullscreenerror, listener: EventHandler[T, fullscreenerror]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_fullscreenerror[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: fullscreenerror,
    listener: EventHandler[T, fullscreenerror],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_fullscreenerror[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: fullscreenerror,
    listener: EventHandler[T, fullscreenerror],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_gotpointercapture[T /* <: Element | Document | Window */](eventTarget: T, event: gotpointercapture, listener: EventHandler[T, gotpointercapture]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture]
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_input[T /* <: Element | Document | Window */](eventTarget: T, event: input, listener: EventHandler[T, input]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_input[T /* <: Element | Document | Window */](eventTarget: T, event: input, listener: EventHandler[T, input], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_input[T /* <: Element | Document | Window */](eventTarget: T, event: input, listener: EventHandler[T, input], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_input[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: input, listener: EventHandler[T, input]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_input[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: input, listener: EventHandler[T, input], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_input[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: input,
    listener: EventHandler[T, input],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_invalid[T /* <: Element | Document | Window */](eventTarget: T, event: invalid, listener: EventHandler[T, invalid]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_invalid[T /* <: Element | Document | Window */](eventTarget: T, event: invalid, listener: EventHandler[T, invalid], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_invalid[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: invalid,
    listener: EventHandler[T, invalid],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_invalid[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: invalid, listener: EventHandler[T, invalid]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_invalid[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: invalid, listener: EventHandler[T, invalid], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_invalid[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: invalid,
    listener: EventHandler[T, invalid],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keydown[T /* <: Element | Document | Window */](eventTarget: T, event: keydown, listener: EventHandler[T, keydown]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keydown[T /* <: Element | Document | Window */](eventTarget: T, event: keydown, listener: EventHandler[T, keydown], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keydown[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: keydown,
    listener: EventHandler[T, keydown],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keydown[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keydown, listener: EventHandler[T, keydown]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keydown[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keydown, listener: EventHandler[T, keydown], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keydown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: keydown,
    listener: EventHandler[T, keydown],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keypress[T /* <: Element | Document | Window */](eventTarget: T, event: keypress, listener: EventHandler[T, keypress]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keypress[T /* <: Element | Document | Window */](eventTarget: T, event: keypress, listener: EventHandler[T, keypress], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keypress[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: keypress,
    listener: EventHandler[T, keypress],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keypress[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keypress, listener: EventHandler[T, keypress]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keypress[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: keypress,
    listener: EventHandler[T, keypress],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keypress[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: keypress,
    listener: EventHandler[T, keypress],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keyup[T /* <: Element | Document | Window */](eventTarget: T, event: keyup, listener: EventHandler[T, keyup]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keyup[T /* <: Element | Document | Window */](eventTarget: T, event: keyup, listener: EventHandler[T, keyup], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keyup[T /* <: Element | Document | Window */](eventTarget: T, event: keyup, listener: EventHandler[T, keyup], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keyup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keyup, listener: EventHandler[T, keyup]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keyup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keyup, listener: EventHandler[T, keyup], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_keyup[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: keyup,
    listener: EventHandler[T, keyup],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_load[T /* <: Element | Document | Window */](eventTarget: T, event: load, listener: EventHandler[T, load]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_load[T /* <: Element | Document | Window */](eventTarget: T, event: load, listener: EventHandler[T, load], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_load[T /* <: Element | Document | Window */](eventTarget: T, event: load, listener: EventHandler[T, load], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_load[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: load, listener: EventHandler[T, load]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_load[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: load, listener: EventHandler[T, load], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_load[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: load,
    listener: EventHandler[T, load],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadeddata[T /* <: Element | Document | Window */](eventTarget: T, event: loadeddata, listener: EventHandler[T, loadeddata]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadeddata[T /* <: Element | Document | Window */](eventTarget: T, event: loadeddata, listener: EventHandler[T, loadeddata], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadeddata[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: loadeddata,
    listener: EventHandler[T, loadeddata],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadeddata[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: loadeddata, listener: EventHandler[T, loadeddata]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadeddata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadeddata,
    listener: EventHandler[T, loadeddata],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadeddata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadeddata,
    listener: EventHandler[T, loadeddata],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadedmetadata[T /* <: Element | Document | Window */](eventTarget: T, event: loadedmetadata, listener: EventHandler[T, loadedmetadata]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadedmetadata[T /* <: Element | Document | Window */](eventTarget: T, event: loadedmetadata, listener: EventHandler[T, loadedmetadata], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadedmetadata[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: loadedmetadata,
    listener: EventHandler[T, loadedmetadata],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadedmetadata[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: loadedmetadata, listener: EventHandler[T, loadedmetadata]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadedmetadata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadedmetadata,
    listener: EventHandler[T, loadedmetadata],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadedmetadata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadedmetadata,
    listener: EventHandler[T, loadedmetadata],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadstart[T /* <: Element | Document | Window */](eventTarget: T, event: loadstart, listener: EventHandler[T, loadstart]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadstart[T /* <: Element | Document | Window */](eventTarget: T, event: loadstart, listener: EventHandler[T, loadstart], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: loadstart,
    listener: EventHandler[T, loadstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: loadstart, listener: EventHandler[T, loadstart]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadstart,
    listener: EventHandler[T, loadstart],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_loadstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadstart,
    listener: EventHandler[T, loadstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_lostpointercapture[T /* <: Element | Document | Window */](eventTarget: T, event: lostpointercapture, listener: EventHandler[T, lostpointercapture]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture]
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mousedown[T /* <: Element | Document | Window */](eventTarget: T, event: mousedown, listener: EventHandler[T, mousedown]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mousedown[T /* <: Element | Document | Window */](eventTarget: T, event: mousedown, listener: EventHandler[T, mousedown], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mousedown[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mousedown,
    listener: EventHandler[T, mousedown],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mousedown[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mousedown, listener: EventHandler[T, mousedown]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mousedown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mousedown,
    listener: EventHandler[T, mousedown],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mousedown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mousedown,
    listener: EventHandler[T, mousedown],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseenter[T /* <: Element | Document | Window */](eventTarget: T, event: mouseenter, listener: EventHandler[T, mouseenter]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseenter[T /* <: Element | Document | Window */](eventTarget: T, event: mouseenter, listener: EventHandler[T, mouseenter], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseenter[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseenter,
    listener: EventHandler[T, mouseenter],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseenter[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseenter, listener: EventHandler[T, mouseenter]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseenter,
    listener: EventHandler[T, mouseenter],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseenter,
    listener: EventHandler[T, mouseenter],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseleave[T /* <: Element | Document | Window */](eventTarget: T, event: mouseleave, listener: EventHandler[T, mouseleave]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseleave[T /* <: Element | Document | Window */](eventTarget: T, event: mouseleave, listener: EventHandler[T, mouseleave], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseleave[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseleave,
    listener: EventHandler[T, mouseleave],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseleave[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseleave, listener: EventHandler[T, mouseleave]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseleave,
    listener: EventHandler[T, mouseleave],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseleave,
    listener: EventHandler[T, mouseleave],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mousemove[T /* <: Element | Document | Window */](eventTarget: T, event: mousemove, listener: EventHandler[T, mousemove]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mousemove[T /* <: Element | Document | Window */](eventTarget: T, event: mousemove, listener: EventHandler[T, mousemove], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mousemove[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mousemove,
    listener: EventHandler[T, mousemove],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mousemove[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mousemove, listener: EventHandler[T, mousemove]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mousemove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mousemove,
    listener: EventHandler[T, mousemove],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mousemove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mousemove,
    listener: EventHandler[T, mousemove],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseout[T /* <: Element | Document | Window */](eventTarget: T, event: mouseout, listener: EventHandler[T, mouseout]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseout[T /* <: Element | Document | Window */](eventTarget: T, event: mouseout, listener: EventHandler[T, mouseout], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseout[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseout,
    listener: EventHandler[T, mouseout],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseout[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseout, listener: EventHandler[T, mouseout]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseout,
    listener: EventHandler[T, mouseout],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseout,
    listener: EventHandler[T, mouseout],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseover[T /* <: Element | Document | Window */](eventTarget: T, event: mouseover, listener: EventHandler[T, mouseover]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseover[T /* <: Element | Document | Window */](eventTarget: T, event: mouseover, listener: EventHandler[T, mouseover], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseover[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseover,
    listener: EventHandler[T, mouseover],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseover[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseover, listener: EventHandler[T, mouseover]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseover,
    listener: EventHandler[T, mouseover],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseover,
    listener: EventHandler[T, mouseover],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseup[T /* <: Element | Document | Window */](eventTarget: T, event: mouseup, listener: EventHandler[T, mouseup]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseup[T /* <: Element | Document | Window */](eventTarget: T, event: mouseup, listener: EventHandler[T, mouseup], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseup[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseup,
    listener: EventHandler[T, mouseup],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseup, listener: EventHandler[T, mouseup]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseup, listener: EventHandler[T, mouseup], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_mouseup[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseup,
    listener: EventHandler[T, mouseup],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_paste[T /* <: Element | Document | Window */](eventTarget: T, event: paste, listener: EventHandler[T, paste]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_paste[T /* <: Element | Document | Window */](eventTarget: T, event: paste, listener: EventHandler[T, paste], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_paste[T /* <: Element | Document | Window */](eventTarget: T, event: paste, listener: EventHandler[T, paste], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_paste[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: paste, listener: EventHandler[T, paste]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_paste[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: paste, listener: EventHandler[T, paste], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_paste[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: paste,
    listener: EventHandler[T, paste],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pause[T /* <: Element | Document | Window */](eventTarget: T, event: pause, listener: EventHandler[T, pause]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pause[T /* <: Element | Document | Window */](eventTarget: T, event: pause, listener: EventHandler[T, pause], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pause[T /* <: Element | Document | Window */](eventTarget: T, event: pause, listener: EventHandler[T, pause], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pause[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pause, listener: EventHandler[T, pause]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pause[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pause, listener: EventHandler[T, pause], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pause[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pause,
    listener: EventHandler[T, pause],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_play[T /* <: Element | Document | Window */](eventTarget: T, event: play, listener: EventHandler[T, play]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_play[T /* <: Element | Document | Window */](eventTarget: T, event: play, listener: EventHandler[T, play], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_play[T /* <: Element | Document | Window */](eventTarget: T, event: play, listener: EventHandler[T, play], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_play[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: play, listener: EventHandler[T, play]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_play[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: play, listener: EventHandler[T, play], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_play[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: play,
    listener: EventHandler[T, play],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_playing[T /* <: Element | Document | Window */](eventTarget: T, event: playing, listener: EventHandler[T, playing]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_playing[T /* <: Element | Document | Window */](eventTarget: T, event: playing, listener: EventHandler[T, playing], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_playing[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: playing,
    listener: EventHandler[T, playing],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_playing[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: playing, listener: EventHandler[T, playing]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_playing[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: playing, listener: EventHandler[T, playing], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_playing[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: playing,
    listener: EventHandler[T, playing],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointercancel[T /* <: Element | Document | Window */](eventTarget: T, event: pointercancel, listener: EventHandler[T, pointercancel]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointercancel[T /* <: Element | Document | Window */](eventTarget: T, event: pointercancel, listener: EventHandler[T, pointercancel], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointercancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointercancel,
    listener: EventHandler[T, pointercancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointercancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointercancel, listener: EventHandler[T, pointercancel]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointercancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointercancel,
    listener: EventHandler[T, pointercancel],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointercancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointercancel,
    listener: EventHandler[T, pointercancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerdown[T /* <: Element | Document | Window */](eventTarget: T, event: pointerdown, listener: EventHandler[T, pointerdown]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerdown[T /* <: Element | Document | Window */](eventTarget: T, event: pointerdown, listener: EventHandler[T, pointerdown], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerdown[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerdown,
    listener: EventHandler[T, pointerdown],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerdown[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerdown, listener: EventHandler[T, pointerdown]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerdown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerdown,
    listener: EventHandler[T, pointerdown],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerdown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerdown,
    listener: EventHandler[T, pointerdown],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerenter[T /* <: Element | Document | Window */](eventTarget: T, event: pointerenter, listener: EventHandler[T, pointerenter]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerenter[T /* <: Element | Document | Window */](eventTarget: T, event: pointerenter, listener: EventHandler[T, pointerenter], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerenter[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerenter,
    listener: EventHandler[T, pointerenter],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerenter[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerenter, listener: EventHandler[T, pointerenter]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerenter,
    listener: EventHandler[T, pointerenter],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerenter,
    listener: EventHandler[T, pointerenter],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerleave[T /* <: Element | Document | Window */](eventTarget: T, event: pointerleave, listener: EventHandler[T, pointerleave]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerleave[T /* <: Element | Document | Window */](eventTarget: T, event: pointerleave, listener: EventHandler[T, pointerleave], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerleave[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerleave,
    listener: EventHandler[T, pointerleave],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerleave[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerleave, listener: EventHandler[T, pointerleave]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerleave,
    listener: EventHandler[T, pointerleave],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerleave,
    listener: EventHandler[T, pointerleave],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerlockchange[T /* <: Element | Document | Window */](eventTarget: T, event: pointerlockchange, listener: EventHandler[T, pointerlockchange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange]
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerlockerror[T /* <: Element | Document | Window */](eventTarget: T, event: pointerlockerror, listener: EventHandler[T, pointerlockerror]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerlockerror[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerlockerror,
    listener: EventHandler[T, pointerlockerror],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerlockerror[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerlockerror,
    listener: EventHandler[T, pointerlockerror],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerlockerror[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerlockerror, listener: EventHandler[T, pointerlockerror]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerlockerror[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockerror,
    listener: EventHandler[T, pointerlockerror],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerlockerror[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockerror,
    listener: EventHandler[T, pointerlockerror],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointermove[T /* <: Element | Document | Window */](eventTarget: T, event: pointermove, listener: EventHandler[T, pointermove]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointermove[T /* <: Element | Document | Window */](eventTarget: T, event: pointermove, listener: EventHandler[T, pointermove], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointermove[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointermove,
    listener: EventHandler[T, pointermove],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointermove[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointermove, listener: EventHandler[T, pointermove]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointermove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointermove,
    listener: EventHandler[T, pointermove],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointermove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointermove,
    listener: EventHandler[T, pointermove],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerout[T /* <: Element | Document | Window */](eventTarget: T, event: pointerout, listener: EventHandler[T, pointerout]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerout[T /* <: Element | Document | Window */](eventTarget: T, event: pointerout, listener: EventHandler[T, pointerout], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerout[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerout,
    listener: EventHandler[T, pointerout],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerout[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerout, listener: EventHandler[T, pointerout]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerout,
    listener: EventHandler[T, pointerout],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerout,
    listener: EventHandler[T, pointerout],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerover[T /* <: Element | Document | Window */](eventTarget: T, event: pointerover, listener: EventHandler[T, pointerover]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerover[T /* <: Element | Document | Window */](eventTarget: T, event: pointerover, listener: EventHandler[T, pointerover], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerover[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerover,
    listener: EventHandler[T, pointerover],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerover[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerover, listener: EventHandler[T, pointerover]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerover,
    listener: EventHandler[T, pointerover],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerover,
    listener: EventHandler[T, pointerover],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerup[T /* <: Element | Document | Window */](eventTarget: T, event: pointerup, listener: EventHandler[T, pointerup]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerup[T /* <: Element | Document | Window */](eventTarget: T, event: pointerup, listener: EventHandler[T, pointerup], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerup[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerup,
    listener: EventHandler[T, pointerup],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerup, listener: EventHandler[T, pointerup]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerup[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerup,
    listener: EventHandler[T, pointerup],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_pointerup[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerup,
    listener: EventHandler[T, pointerup],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_progress[T /* <: Element | Document | Window */](eventTarget: T, event: progress, listener: EventHandler[T, progress]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_progress[T /* <: Element | Document | Window */](eventTarget: T, event: progress, listener: EventHandler[T, progress], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_progress[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: progress,
    listener: EventHandler[T, progress],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_progress[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: progress, listener: EventHandler[T, progress]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_progress[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: progress,
    listener: EventHandler[T, progress],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_progress[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: progress,
    listener: EventHandler[T, progress],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_ratechange[T /* <: Element | Document | Window */](eventTarget: T, event: ratechange, listener: EventHandler[T, ratechange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_ratechange[T /* <: Element | Document | Window */](eventTarget: T, event: ratechange, listener: EventHandler[T, ratechange], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_ratechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: ratechange,
    listener: EventHandler[T, ratechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_ratechange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: ratechange, listener: EventHandler[T, ratechange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_ratechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: ratechange,
    listener: EventHandler[T, ratechange],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_ratechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: ratechange,
    listener: EventHandler[T, ratechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_readystatechange[T /* <: Element | Document | Window */](eventTarget: T, event: readystatechange, listener: EventHandler[T, readystatechange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_readystatechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: readystatechange,
    listener: EventHandler[T, readystatechange],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_readystatechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: readystatechange,
    listener: EventHandler[T, readystatechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_readystatechange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: readystatechange, listener: EventHandler[T, readystatechange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_readystatechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: readystatechange,
    listener: EventHandler[T, readystatechange],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_readystatechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: readystatechange,
    listener: EventHandler[T, readystatechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_reset[T /* <: Element | Document | Window */](eventTarget: T, event: reset, listener: EventHandler[T, reset]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_reset[T /* <: Element | Document | Window */](eventTarget: T, event: reset, listener: EventHandler[T, reset], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_reset[T /* <: Element | Document | Window */](eventTarget: T, event: reset, listener: EventHandler[T, reset], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_reset[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: reset, listener: EventHandler[T, reset]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_reset[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: reset, listener: EventHandler[T, reset], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_reset[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: reset,
    listener: EventHandler[T, reset],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_resize[T /* <: Element | Document | Window */](eventTarget: T, event: resize, listener: EventHandler[T, resize]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_resize[T /* <: Element | Document | Window */](eventTarget: T, event: resize, listener: EventHandler[T, resize], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_resize[T /* <: Element | Document | Window */](eventTarget: T, event: resize, listener: EventHandler[T, resize], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_resize[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: resize, listener: EventHandler[T, resize]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_resize[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: resize, listener: EventHandler[T, resize], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_resize[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: resize,
    listener: EventHandler[T, resize],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_scroll[T /* <: Element | Document | Window */](eventTarget: T, event: scroll, listener: EventHandler[T, scroll]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_scroll[T /* <: Element | Document | Window */](eventTarget: T, event: scroll, listener: EventHandler[T, scroll], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_scroll[T /* <: Element | Document | Window */](eventTarget: T, event: scroll, listener: EventHandler[T, scroll], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_scroll[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: scroll, listener: EventHandler[T, scroll]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_scroll[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: scroll, listener: EventHandler[T, scroll], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_scroll[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: scroll,
    listener: EventHandler[T, scroll],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_securitypolicyviolation[T /* <: Element | Document | Window */](eventTarget: T, event: securitypolicyviolation, listener: EventHandler[T, securitypolicyviolation]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation]
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_seeked[T /* <: Element | Document | Window */](eventTarget: T, event: seeked, listener: EventHandler[T, seeked]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_seeked[T /* <: Element | Document | Window */](eventTarget: T, event: seeked, listener: EventHandler[T, seeked], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_seeked[T /* <: Element | Document | Window */](eventTarget: T, event: seeked, listener: EventHandler[T, seeked], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_seeked[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: seeked, listener: EventHandler[T, seeked]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_seeked[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: seeked, listener: EventHandler[T, seeked], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_seeked[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: seeked,
    listener: EventHandler[T, seeked],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_seeking[T /* <: Element | Document | Window */](eventTarget: T, event: seeking, listener: EventHandler[T, seeking]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_seeking[T /* <: Element | Document | Window */](eventTarget: T, event: seeking, listener: EventHandler[T, seeking], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_seeking[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: seeking,
    listener: EventHandler[T, seeking],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_seeking[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: seeking, listener: EventHandler[T, seeking]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_seeking[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: seeking, listener: EventHandler[T, seeking], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_seeking[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: seeking,
    listener: EventHandler[T, seeking],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_select[T /* <: Element | Document | Window */](eventTarget: T, event: select, listener: EventHandler[T, select]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_select[T /* <: Element | Document | Window */](eventTarget: T, event: select, listener: EventHandler[T, select], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_select[T /* <: Element | Document | Window */](eventTarget: T, event: select, listener: EventHandler[T, select], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_select[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: select, listener: EventHandler[T, select]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_select[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: select, listener: EventHandler[T, select], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_select[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: select,
    listener: EventHandler[T, select],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_selectionchange[T /* <: Element | Document | Window */](eventTarget: T, event: selectionchange, listener: EventHandler[T, selectionchange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_selectionchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: selectionchange,
    listener: EventHandler[T, selectionchange],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_selectionchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: selectionchange,
    listener: EventHandler[T, selectionchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_selectionchange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: selectionchange, listener: EventHandler[T, selectionchange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_selectionchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: selectionchange,
    listener: EventHandler[T, selectionchange],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_selectionchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: selectionchange,
    listener: EventHandler[T, selectionchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_selectstart[T /* <: Element | Document | Window */](eventTarget: T, event: selectstart, listener: EventHandler[T, selectstart]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_selectstart[T /* <: Element | Document | Window */](eventTarget: T, event: selectstart, listener: EventHandler[T, selectstart], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_selectstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: selectstart,
    listener: EventHandler[T, selectstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_selectstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: selectstart, listener: EventHandler[T, selectstart]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_selectstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: selectstart,
    listener: EventHandler[T, selectstart],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_selectstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: selectstart,
    listener: EventHandler[T, selectstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_stalled[T /* <: Element | Document | Window */](eventTarget: T, event: stalled, listener: EventHandler[T, stalled]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_stalled[T /* <: Element | Document | Window */](eventTarget: T, event: stalled, listener: EventHandler[T, stalled], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_stalled[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: stalled,
    listener: EventHandler[T, stalled],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_stalled[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: stalled, listener: EventHandler[T, stalled]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_stalled[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: stalled, listener: EventHandler[T, stalled], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_stalled[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: stalled,
    listener: EventHandler[T, stalled],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_submit[T /* <: Element | Document | Window */](eventTarget: T, event: submit, listener: EventHandler[T, submit]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_submit[T /* <: Element | Document | Window */](eventTarget: T, event: submit, listener: EventHandler[T, submit], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_submit[T /* <: Element | Document | Window */](eventTarget: T, event: submit, listener: EventHandler[T, submit], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_submit[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: submit, listener: EventHandler[T, submit]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_submit[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: submit, listener: EventHandler[T, submit], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_submit[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: submit,
    listener: EventHandler[T, submit],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_suspend[T /* <: Element | Document | Window */](eventTarget: T, event: suspend, listener: EventHandler[T, suspend]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_suspend[T /* <: Element | Document | Window */](eventTarget: T, event: suspend, listener: EventHandler[T, suspend], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_suspend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: suspend,
    listener: EventHandler[T, suspend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_suspend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: suspend, listener: EventHandler[T, suspend]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_suspend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: suspend, listener: EventHandler[T, suspend], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_suspend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: suspend,
    listener: EventHandler[T, suspend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_timeupdate[T /* <: Element | Document | Window */](eventTarget: T, event: timeupdate, listener: EventHandler[T, timeupdate]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_timeupdate[T /* <: Element | Document | Window */](eventTarget: T, event: timeupdate, listener: EventHandler[T, timeupdate], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_timeupdate[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: timeupdate,
    listener: EventHandler[T, timeupdate],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_timeupdate[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: timeupdate, listener: EventHandler[T, timeupdate]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_timeupdate[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: timeupdate,
    listener: EventHandler[T, timeupdate],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_timeupdate[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: timeupdate,
    listener: EventHandler[T, timeupdate],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_toggle[T /* <: Element | Document | Window */](eventTarget: T, event: toggle, listener: EventHandler[T, toggle]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_toggle[T /* <: Element | Document | Window */](eventTarget: T, event: toggle, listener: EventHandler[T, toggle], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_toggle[T /* <: Element | Document | Window */](eventTarget: T, event: toggle, listener: EventHandler[T, toggle], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_toggle[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: toggle, listener: EventHandler[T, toggle]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_toggle[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: toggle, listener: EventHandler[T, toggle], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_toggle[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: toggle,
    listener: EventHandler[T, toggle],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchcancel[T /* <: Element | Document | Window */](eventTarget: T, event: touchcancel, listener: EventHandler[T, touchcancel]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchcancel[T /* <: Element | Document | Window */](eventTarget: T, event: touchcancel, listener: EventHandler[T, touchcancel], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchcancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: touchcancel,
    listener: EventHandler[T, touchcancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchcancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: touchcancel, listener: EventHandler[T, touchcancel]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchcancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchcancel,
    listener: EventHandler[T, touchcancel],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchcancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchcancel,
    listener: EventHandler[T, touchcancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchend[T /* <: Element | Document | Window */](eventTarget: T, event: touchend, listener: EventHandler[T, touchend]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchend[T /* <: Element | Document | Window */](eventTarget: T, event: touchend, listener: EventHandler[T, touchend], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: touchend,
    listener: EventHandler[T, touchend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: touchend, listener: EventHandler[T, touchend]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchend,
    listener: EventHandler[T, touchend],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchend,
    listener: EventHandler[T, touchend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchmove[T /* <: Element | Document | Window */](eventTarget: T, event: touchmove, listener: EventHandler[T, touchmove]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchmove[T /* <: Element | Document | Window */](eventTarget: T, event: touchmove, listener: EventHandler[T, touchmove], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchmove[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: touchmove,
    listener: EventHandler[T, touchmove],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchmove[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: touchmove, listener: EventHandler[T, touchmove]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchmove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchmove,
    listener: EventHandler[T, touchmove],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchmove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchmove,
    listener: EventHandler[T, touchmove],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchstart[T /* <: Element | Document | Window */](eventTarget: T, event: touchstart, listener: EventHandler[T, touchstart]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchstart[T /* <: Element | Document | Window */](eventTarget: T, event: touchstart, listener: EventHandler[T, touchstart], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: touchstart,
    listener: EventHandler[T, touchstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: touchstart, listener: EventHandler[T, touchstart]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchstart,
    listener: EventHandler[T, touchstart],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_touchstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchstart,
    listener: EventHandler[T, touchstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitioncancel[T /* <: Element | Document | Window */](eventTarget: T, event: transitioncancel, listener: EventHandler[T, transitioncancel]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitioncancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitioncancel,
    listener: EventHandler[T, transitioncancel],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitioncancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitioncancel,
    listener: EventHandler[T, transitioncancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitioncancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: transitioncancel, listener: EventHandler[T, transitioncancel]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitioncancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitioncancel,
    listener: EventHandler[T, transitioncancel],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitioncancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitioncancel,
    listener: EventHandler[T, transitioncancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionend[T /* <: Element | Document | Window */](eventTarget: T, event: transitionend, listener: EventHandler[T, transitionend]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionend[T /* <: Element | Document | Window */](eventTarget: T, event: transitionend, listener: EventHandler[T, transitionend], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitionend,
    listener: EventHandler[T, transitionend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: transitionend, listener: EventHandler[T, transitionend]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionend,
    listener: EventHandler[T, transitionend],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionend,
    listener: EventHandler[T, transitionend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionrun[T /* <: Element | Document | Window */](eventTarget: T, event: transitionrun, listener: EventHandler[T, transitionrun]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionrun[T /* <: Element | Document | Window */](eventTarget: T, event: transitionrun, listener: EventHandler[T, transitionrun], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionrun[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitionrun,
    listener: EventHandler[T, transitionrun],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionrun[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: transitionrun, listener: EventHandler[T, transitionrun]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionrun[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionrun,
    listener: EventHandler[T, transitionrun],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionrun[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionrun,
    listener: EventHandler[T, transitionrun],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionstart[T /* <: Element | Document | Window */](eventTarget: T, event: transitionstart, listener: EventHandler[T, transitionstart]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitionstart,
    listener: EventHandler[T, transitionstart],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitionstart,
    listener: EventHandler[T, transitionstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: transitionstart, listener: EventHandler[T, transitionstart]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionstart,
    listener: EventHandler[T, transitionstart],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_transitionstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionstart,
    listener: EventHandler[T, transitionstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_visibilitychange[T /* <: Element | Document | Window */](eventTarget: T, event: visibilitychange, listener: EventHandler[T, visibilitychange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_visibilitychange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: visibilitychange,
    listener: EventHandler[T, visibilitychange],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_visibilitychange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: visibilitychange,
    listener: EventHandler[T, visibilitychange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_visibilitychange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: visibilitychange, listener: EventHandler[T, visibilitychange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_visibilitychange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: visibilitychange,
    listener: EventHandler[T, visibilitychange],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_visibilitychange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: visibilitychange,
    listener: EventHandler[T, visibilitychange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_volumechange[T /* <: Element | Document | Window */](eventTarget: T, event: volumechange, listener: EventHandler[T, volumechange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_volumechange[T /* <: Element | Document | Window */](eventTarget: T, event: volumechange, listener: EventHandler[T, volumechange], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_volumechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: volumechange,
    listener: EventHandler[T, volumechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_volumechange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: volumechange, listener: EventHandler[T, volumechange]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_volumechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: volumechange,
    listener: EventHandler[T, volumechange],
    capture: Boolean
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_volumechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: volumechange,
    listener: EventHandler[T, volumechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_waiting[T /* <: Element | Document | Window */](eventTarget: T, event: waiting, listener: EventHandler[T, waiting]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_waiting[T /* <: Element | Document | Window */](eventTarget: T, event: waiting, listener: EventHandler[T, waiting], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_waiting[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: waiting,
    listener: EventHandler[T, waiting],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_waiting[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: waiting, listener: EventHandler[T, waiting]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_waiting[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: waiting, listener: EventHandler[T, waiting], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_waiting[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: waiting,
    listener: EventHandler[T, waiting],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_wheel[T /* <: Element | Document | Window */](eventTarget: T, event: wheel, listener: EventHandler[T, wheel]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_wheel[T /* <: Element | Document | Window */](eventTarget: T, event: wheel, listener: EventHandler[T, wheel], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_wheel[T /* <: Element | Document | Window */](eventTarget: T, event: wheel, listener: EventHandler[T, wheel], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_wheel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: wheel, listener: EventHandler[T, wheel]): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_wheel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: wheel, listener: EventHandler[T, wheel], capture: Boolean): Unit = js.native
  @JSName("useEventListener")
  def useEventListener_wheel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: wheel,
    listener: EventHandler[T, wheel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  
  @JSName("useGlobalListener")
  def useGlobalListener_abort(event: abort, handler: DocumentEventHandler[abort]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_abort(event: abort, handler: DocumentEventHandler[abort], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_abort(event: abort, handler: DocumentEventHandler[abort], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_animationcancel(event: animationcancel, handler: DocumentEventHandler[animationcancel]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_animationcancel(event: animationcancel, handler: DocumentEventHandler[animationcancel], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_animationcancel(
    event: animationcancel,
    handler: DocumentEventHandler[animationcancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_animationend(event: animationend, handler: DocumentEventHandler[animationend]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_animationend(event: animationend, handler: DocumentEventHandler[animationend], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_animationend(event: animationend, handler: DocumentEventHandler[animationend], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_animationiteration(event: animationiteration, handler: DocumentEventHandler[animationiteration]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_animationiteration(event: animationiteration, handler: DocumentEventHandler[animationiteration], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_animationiteration(
    event: animationiteration,
    handler: DocumentEventHandler[animationiteration],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_animationstart(event: animationstart, handler: DocumentEventHandler[animationstart]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_animationstart(event: animationstart, handler: DocumentEventHandler[animationstart], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_animationstart(
    event: animationstart,
    handler: DocumentEventHandler[animationstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_auxclick(event: auxclick, handler: DocumentEventHandler[auxclick]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_auxclick(event: auxclick, handler: DocumentEventHandler[auxclick], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_auxclick(event: auxclick, handler: DocumentEventHandler[auxclick], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_blur(event: blur, handler: DocumentEventHandler[blur]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_blur(event: blur, handler: DocumentEventHandler[blur], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_blur(event: blur, handler: DocumentEventHandler[blur], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_cancel(event: cancel, handler: DocumentEventHandler[cancel]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_cancel(event: cancel, handler: DocumentEventHandler[cancel], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_cancel(event: cancel, handler: DocumentEventHandler[cancel], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_canplay(event: canplay, handler: DocumentEventHandler[canplay]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_canplay(event: canplay, handler: DocumentEventHandler[canplay], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_canplay(event: canplay, handler: DocumentEventHandler[canplay], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_canplaythrough(event: canplaythrough, handler: DocumentEventHandler[canplaythrough]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_canplaythrough(event: canplaythrough, handler: DocumentEventHandler[canplaythrough], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_canplaythrough(
    event: canplaythrough,
    handler: DocumentEventHandler[canplaythrough],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_change(event: change, handler: DocumentEventHandler[change]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_change(event: change, handler: DocumentEventHandler[change], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_change(event: change, handler: DocumentEventHandler[change], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_click(event: click, handler: DocumentEventHandler[click]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_click(event: click, handler: DocumentEventHandler[click], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_click(event: click, handler: DocumentEventHandler[click], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_close(event: close, handler: DocumentEventHandler[close]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_close(event: close, handler: DocumentEventHandler[close], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_close(event: close, handler: DocumentEventHandler[close], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_contextmenu(event: contextmenu, handler: DocumentEventHandler[contextmenu]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_contextmenu(event: contextmenu, handler: DocumentEventHandler[contextmenu], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_contextmenu(event: contextmenu, handler: DocumentEventHandler[contextmenu], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_copy(event: copy, handler: DocumentEventHandler[copy]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_copy(event: copy, handler: DocumentEventHandler[copy], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_copy(event: copy, handler: DocumentEventHandler[copy], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_cuechange(event: cuechange, handler: DocumentEventHandler[cuechange]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_cuechange(event: cuechange, handler: DocumentEventHandler[cuechange], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_cuechange(event: cuechange, handler: DocumentEventHandler[cuechange], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_cut(event: cut, handler: DocumentEventHandler[cut]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_cut(event: cut, handler: DocumentEventHandler[cut], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_cut(event: cut, handler: DocumentEventHandler[cut], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dblclick(event: dblclick, handler: DocumentEventHandler[dblclick]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dblclick(event: dblclick, handler: DocumentEventHandler[dblclick], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dblclick(event: dblclick, handler: DocumentEventHandler[dblclick], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_drag(event: drag, handler: DocumentEventHandler[drag]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_drag(event: drag, handler: DocumentEventHandler[drag], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_drag(event: drag, handler: DocumentEventHandler[drag], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragend(event: dragend, handler: DocumentEventHandler[dragend]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragend(event: dragend, handler: DocumentEventHandler[dragend], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragend(event: dragend, handler: DocumentEventHandler[dragend], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragenter(event: dragenter, handler: DocumentEventHandler[dragenter]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragenter(event: dragenter, handler: DocumentEventHandler[dragenter], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragenter(event: dragenter, handler: DocumentEventHandler[dragenter], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragexit(event: dragexit, handler: DocumentEventHandler[dragexit]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragexit(event: dragexit, handler: DocumentEventHandler[dragexit], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragexit(event: dragexit, handler: DocumentEventHandler[dragexit], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragleave(event: dragleave, handler: DocumentEventHandler[dragleave]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragleave(event: dragleave, handler: DocumentEventHandler[dragleave], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragleave(event: dragleave, handler: DocumentEventHandler[dragleave], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragover(event: dragover, handler: DocumentEventHandler[dragover]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragover(event: dragover, handler: DocumentEventHandler[dragover], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragover(event: dragover, handler: DocumentEventHandler[dragover], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragstart(event: dragstart, handler: DocumentEventHandler[dragstart]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragstart(event: dragstart, handler: DocumentEventHandler[dragstart], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_dragstart(event: dragstart, handler: DocumentEventHandler[dragstart], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_drop(event: drop, handler: DocumentEventHandler[drop]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_drop(event: drop, handler: DocumentEventHandler[drop], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_drop(event: drop, handler: DocumentEventHandler[drop], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_durationchange(event: durationchange, handler: DocumentEventHandler[durationchange]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_durationchange(event: durationchange, handler: DocumentEventHandler[durationchange], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_durationchange(
    event: durationchange,
    handler: DocumentEventHandler[durationchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_emptied(event: emptied, handler: DocumentEventHandler[emptied]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_emptied(event: emptied, handler: DocumentEventHandler[emptied], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_emptied(event: emptied, handler: DocumentEventHandler[emptied], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_ended(event: ended, handler: DocumentEventHandler[ended]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_ended(event: ended, handler: DocumentEventHandler[ended], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_ended(event: ended, handler: DocumentEventHandler[ended], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_error(event: error, handler: DocumentEventHandler[error]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_error(event: error, handler: DocumentEventHandler[error], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_error(event: error, handler: DocumentEventHandler[error], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_focus(event: focus, handler: DocumentEventHandler[focus]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_focus(event: focus, handler: DocumentEventHandler[focus], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_focus(event: focus, handler: DocumentEventHandler[focus], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_focusin(event: focusin, handler: DocumentEventHandler[focusin]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_focusin(event: focusin, handler: DocumentEventHandler[focusin], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_focusin(event: focusin, handler: DocumentEventHandler[focusin], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_focusout(event: focusout, handler: DocumentEventHandler[focusout]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_focusout(event: focusout, handler: DocumentEventHandler[focusout], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_focusout(event: focusout, handler: DocumentEventHandler[focusout], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_fullscreenchange(event: fullscreenchange, handler: DocumentEventHandler[fullscreenchange]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_fullscreenchange(event: fullscreenchange, handler: DocumentEventHandler[fullscreenchange], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_fullscreenchange(
    event: fullscreenchange,
    handler: DocumentEventHandler[fullscreenchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_fullscreenerror(event: fullscreenerror, handler: DocumentEventHandler[fullscreenerror]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_fullscreenerror(event: fullscreenerror, handler: DocumentEventHandler[fullscreenerror], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_fullscreenerror(
    event: fullscreenerror,
    handler: DocumentEventHandler[fullscreenerror],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_gotpointercapture(event: gotpointercapture, handler: DocumentEventHandler[gotpointercapture]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_gotpointercapture(event: gotpointercapture, handler: DocumentEventHandler[gotpointercapture], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_gotpointercapture(
    event: gotpointercapture,
    handler: DocumentEventHandler[gotpointercapture],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_input(event: input, handler: DocumentEventHandler[input]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_input(event: input, handler: DocumentEventHandler[input], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_input(event: input, handler: DocumentEventHandler[input], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_invalid(event: invalid, handler: DocumentEventHandler[invalid]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_invalid(event: invalid, handler: DocumentEventHandler[invalid], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_invalid(event: invalid, handler: DocumentEventHandler[invalid], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_keydown(event: keydown, handler: DocumentEventHandler[keydown]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_keydown(event: keydown, handler: DocumentEventHandler[keydown], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_keydown(event: keydown, handler: DocumentEventHandler[keydown], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_keypress(event: keypress, handler: DocumentEventHandler[keypress]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_keypress(event: keypress, handler: DocumentEventHandler[keypress], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_keypress(event: keypress, handler: DocumentEventHandler[keypress], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_keyup(event: keyup, handler: DocumentEventHandler[keyup]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_keyup(event: keyup, handler: DocumentEventHandler[keyup], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_keyup(event: keyup, handler: DocumentEventHandler[keyup], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_load(event: load, handler: DocumentEventHandler[load]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_load(event: load, handler: DocumentEventHandler[load], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_load(event: load, handler: DocumentEventHandler[load], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_loadeddata(event: loadeddata, handler: DocumentEventHandler[loadeddata]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_loadeddata(event: loadeddata, handler: DocumentEventHandler[loadeddata], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_loadeddata(event: loadeddata, handler: DocumentEventHandler[loadeddata], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_loadedmetadata(event: loadedmetadata, handler: DocumentEventHandler[loadedmetadata]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_loadedmetadata(event: loadedmetadata, handler: DocumentEventHandler[loadedmetadata], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_loadedmetadata(
    event: loadedmetadata,
    handler: DocumentEventHandler[loadedmetadata],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_loadstart(event: loadstart, handler: DocumentEventHandler[loadstart]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_loadstart(event: loadstart, handler: DocumentEventHandler[loadstart], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_loadstart(event: loadstart, handler: DocumentEventHandler[loadstart], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_lostpointercapture(event: lostpointercapture, handler: DocumentEventHandler[lostpointercapture]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_lostpointercapture(event: lostpointercapture, handler: DocumentEventHandler[lostpointercapture], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_lostpointercapture(
    event: lostpointercapture,
    handler: DocumentEventHandler[lostpointercapture],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mousedown(event: mousedown, handler: DocumentEventHandler[mousedown]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mousedown(event: mousedown, handler: DocumentEventHandler[mousedown], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mousedown(event: mousedown, handler: DocumentEventHandler[mousedown], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mouseenter(event: mouseenter, handler: DocumentEventHandler[mouseenter]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mouseenter(event: mouseenter, handler: DocumentEventHandler[mouseenter], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mouseenter(event: mouseenter, handler: DocumentEventHandler[mouseenter], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mouseleave(event: mouseleave, handler: DocumentEventHandler[mouseleave]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mouseleave(event: mouseleave, handler: DocumentEventHandler[mouseleave], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mouseleave(event: mouseleave, handler: DocumentEventHandler[mouseleave], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mousemove(event: mousemove, handler: DocumentEventHandler[mousemove]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mousemove(event: mousemove, handler: DocumentEventHandler[mousemove], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mousemove(event: mousemove, handler: DocumentEventHandler[mousemove], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mouseout(event: mouseout, handler: DocumentEventHandler[mouseout]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mouseout(event: mouseout, handler: DocumentEventHandler[mouseout], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mouseout(event: mouseout, handler: DocumentEventHandler[mouseout], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mouseover(event: mouseover, handler: DocumentEventHandler[mouseover]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mouseover(event: mouseover, handler: DocumentEventHandler[mouseover], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mouseover(event: mouseover, handler: DocumentEventHandler[mouseover], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mouseup(event: mouseup, handler: DocumentEventHandler[mouseup]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mouseup(event: mouseup, handler: DocumentEventHandler[mouseup], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_mouseup(event: mouseup, handler: DocumentEventHandler[mouseup], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_paste(event: paste, handler: DocumentEventHandler[paste]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_paste(event: paste, handler: DocumentEventHandler[paste], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_paste(event: paste, handler: DocumentEventHandler[paste], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pause(event: pause, handler: DocumentEventHandler[pause]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pause(event: pause, handler: DocumentEventHandler[pause], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pause(event: pause, handler: DocumentEventHandler[pause], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_play(event: play, handler: DocumentEventHandler[play]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_play(event: play, handler: DocumentEventHandler[play], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_play(event: play, handler: DocumentEventHandler[play], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_playing(event: playing, handler: DocumentEventHandler[playing]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_playing(event: playing, handler: DocumentEventHandler[playing], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_playing(event: playing, handler: DocumentEventHandler[playing], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointercancel(event: pointercancel, handler: DocumentEventHandler[pointercancel]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointercancel(event: pointercancel, handler: DocumentEventHandler[pointercancel], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointercancel(
    event: pointercancel,
    handler: DocumentEventHandler[pointercancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerdown(event: pointerdown, handler: DocumentEventHandler[pointerdown]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerdown(event: pointerdown, handler: DocumentEventHandler[pointerdown], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerdown(event: pointerdown, handler: DocumentEventHandler[pointerdown], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerenter(event: pointerenter, handler: DocumentEventHandler[pointerenter]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerenter(event: pointerenter, handler: DocumentEventHandler[pointerenter], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerenter(event: pointerenter, handler: DocumentEventHandler[pointerenter], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerleave(event: pointerleave, handler: DocumentEventHandler[pointerleave]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerleave(event: pointerleave, handler: DocumentEventHandler[pointerleave], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerleave(event: pointerleave, handler: DocumentEventHandler[pointerleave], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerlockchange(event: pointerlockchange, handler: DocumentEventHandler[pointerlockchange]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerlockchange(event: pointerlockchange, handler: DocumentEventHandler[pointerlockchange], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerlockchange(
    event: pointerlockchange,
    handler: DocumentEventHandler[pointerlockchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerlockerror(event: pointerlockerror, handler: DocumentEventHandler[pointerlockerror]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerlockerror(event: pointerlockerror, handler: DocumentEventHandler[pointerlockerror], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerlockerror(
    event: pointerlockerror,
    handler: DocumentEventHandler[pointerlockerror],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointermove(event: pointermove, handler: DocumentEventHandler[pointermove]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointermove(event: pointermove, handler: DocumentEventHandler[pointermove], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointermove(event: pointermove, handler: DocumentEventHandler[pointermove], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerout(event: pointerout, handler: DocumentEventHandler[pointerout]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerout(event: pointerout, handler: DocumentEventHandler[pointerout], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerout(event: pointerout, handler: DocumentEventHandler[pointerout], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerover(event: pointerover, handler: DocumentEventHandler[pointerover]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerover(event: pointerover, handler: DocumentEventHandler[pointerover], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerover(event: pointerover, handler: DocumentEventHandler[pointerover], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerup(event: pointerup, handler: DocumentEventHandler[pointerup]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerup(event: pointerup, handler: DocumentEventHandler[pointerup], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_pointerup(event: pointerup, handler: DocumentEventHandler[pointerup], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_progress(event: progress, handler: DocumentEventHandler[progress]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_progress(event: progress, handler: DocumentEventHandler[progress], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_progress(event: progress, handler: DocumentEventHandler[progress], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_ratechange(event: ratechange, handler: DocumentEventHandler[ratechange]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_ratechange(event: ratechange, handler: DocumentEventHandler[ratechange], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_ratechange(event: ratechange, handler: DocumentEventHandler[ratechange], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_readystatechange(event: readystatechange, handler: DocumentEventHandler[readystatechange]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_readystatechange(event: readystatechange, handler: DocumentEventHandler[readystatechange], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_readystatechange(
    event: readystatechange,
    handler: DocumentEventHandler[readystatechange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_reset(event: reset, handler: DocumentEventHandler[reset]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_reset(event: reset, handler: DocumentEventHandler[reset], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_reset(event: reset, handler: DocumentEventHandler[reset], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_resize(event: resize, handler: DocumentEventHandler[resize]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_resize(event: resize, handler: DocumentEventHandler[resize], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_resize(event: resize, handler: DocumentEventHandler[resize], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_scroll(event: scroll, handler: DocumentEventHandler[scroll]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_scroll(event: scroll, handler: DocumentEventHandler[scroll], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_scroll(event: scroll, handler: DocumentEventHandler[scroll], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_securitypolicyviolation(event: securitypolicyviolation, handler: DocumentEventHandler[securitypolicyviolation]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_securitypolicyviolation(
    event: securitypolicyviolation,
    handler: DocumentEventHandler[securitypolicyviolation],
    capture: Boolean
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_securitypolicyviolation(
    event: securitypolicyviolation,
    handler: DocumentEventHandler[securitypolicyviolation],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_seeked(event: seeked, handler: DocumentEventHandler[seeked]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_seeked(event: seeked, handler: DocumentEventHandler[seeked], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_seeked(event: seeked, handler: DocumentEventHandler[seeked], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_seeking(event: seeking, handler: DocumentEventHandler[seeking]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_seeking(event: seeking, handler: DocumentEventHandler[seeking], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_seeking(event: seeking, handler: DocumentEventHandler[seeking], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_select(event: select, handler: DocumentEventHandler[select]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_select(event: select, handler: DocumentEventHandler[select], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_select(event: select, handler: DocumentEventHandler[select], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_selectionchange(event: selectionchange, handler: DocumentEventHandler[selectionchange]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_selectionchange(event: selectionchange, handler: DocumentEventHandler[selectionchange], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_selectionchange(
    event: selectionchange,
    handler: DocumentEventHandler[selectionchange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_selectstart(event: selectstart, handler: DocumentEventHandler[selectstart]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_selectstart(event: selectstart, handler: DocumentEventHandler[selectstart], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_selectstart(event: selectstart, handler: DocumentEventHandler[selectstart], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_stalled(event: stalled, handler: DocumentEventHandler[stalled]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_stalled(event: stalled, handler: DocumentEventHandler[stalled], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_stalled(event: stalled, handler: DocumentEventHandler[stalled], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_submit(event: submit, handler: DocumentEventHandler[submit]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_submit(event: submit, handler: DocumentEventHandler[submit], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_submit(event: submit, handler: DocumentEventHandler[submit], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_suspend(event: suspend, handler: DocumentEventHandler[suspend]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_suspend(event: suspend, handler: DocumentEventHandler[suspend], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_suspend(event: suspend, handler: DocumentEventHandler[suspend], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_timeupdate(event: timeupdate, handler: DocumentEventHandler[timeupdate]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_timeupdate(event: timeupdate, handler: DocumentEventHandler[timeupdate], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_timeupdate(event: timeupdate, handler: DocumentEventHandler[timeupdate], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_toggle(event: toggle, handler: DocumentEventHandler[toggle]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_toggle(event: toggle, handler: DocumentEventHandler[toggle], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_toggle(event: toggle, handler: DocumentEventHandler[toggle], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_touchcancel(event: touchcancel, handler: DocumentEventHandler[touchcancel]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_touchcancel(event: touchcancel, handler: DocumentEventHandler[touchcancel], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_touchcancel(event: touchcancel, handler: DocumentEventHandler[touchcancel], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_touchend(event: touchend, handler: DocumentEventHandler[touchend]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_touchend(event: touchend, handler: DocumentEventHandler[touchend], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_touchend(event: touchend, handler: DocumentEventHandler[touchend], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_touchmove(event: touchmove, handler: DocumentEventHandler[touchmove]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_touchmove(event: touchmove, handler: DocumentEventHandler[touchmove], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_touchmove(event: touchmove, handler: DocumentEventHandler[touchmove], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_touchstart(event: touchstart, handler: DocumentEventHandler[touchstart]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_touchstart(event: touchstart, handler: DocumentEventHandler[touchstart], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_touchstart(event: touchstart, handler: DocumentEventHandler[touchstart], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_transitioncancel(event: transitioncancel, handler: DocumentEventHandler[transitioncancel]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_transitioncancel(event: transitioncancel, handler: DocumentEventHandler[transitioncancel], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_transitioncancel(
    event: transitioncancel,
    handler: DocumentEventHandler[transitioncancel],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_transitionend(event: transitionend, handler: DocumentEventHandler[transitionend]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_transitionend(event: transitionend, handler: DocumentEventHandler[transitionend], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_transitionend(
    event: transitionend,
    handler: DocumentEventHandler[transitionend],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_transitionrun(event: transitionrun, handler: DocumentEventHandler[transitionrun]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_transitionrun(event: transitionrun, handler: DocumentEventHandler[transitionrun], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_transitionrun(
    event: transitionrun,
    handler: DocumentEventHandler[transitionrun],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_transitionstart(event: transitionstart, handler: DocumentEventHandler[transitionstart]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_transitionstart(event: transitionstart, handler: DocumentEventHandler[transitionstart], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_transitionstart(
    event: transitionstart,
    handler: DocumentEventHandler[transitionstart],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_visibilitychange(event: visibilitychange, handler: DocumentEventHandler[visibilitychange]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_visibilitychange(event: visibilitychange, handler: DocumentEventHandler[visibilitychange], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_visibilitychange(
    event: visibilitychange,
    handler: DocumentEventHandler[visibilitychange],
    capture: AddEventListenerOptions
  ): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_volumechange(event: volumechange, handler: DocumentEventHandler[volumechange]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_volumechange(event: volumechange, handler: DocumentEventHandler[volumechange], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_volumechange(event: volumechange, handler: DocumentEventHandler[volumechange], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_waiting(event: waiting, handler: DocumentEventHandler[waiting]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_waiting(event: waiting, handler: DocumentEventHandler[waiting], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_waiting(event: waiting, handler: DocumentEventHandler[waiting], capture: AddEventListenerOptions): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_wheel(event: wheel, handler: DocumentEventHandler[wheel]): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_wheel(event: wheel, handler: DocumentEventHandler[wheel], capture: Boolean): Unit = js.native
  @JSName("useGlobalListener")
  def useGlobalListener_wheel(event: wheel, handler: DocumentEventHandler[wheel], capture: AddEventListenerOptions): Unit = js.native
  
  def useImage(): State = js.native
  def useImage(imageOrUrl: js.UndefOr[scala.Nothing], crossOrigin: String): State = js.native
  def useImage(imageOrUrl: String): State = js.native
  def useImage(imageOrUrl: String, crossOrigin: String): State = js.native
  def useImage(imageOrUrl: Null, crossOrigin: String): State = js.native
  def useImage(imageOrUrl: HTMLImageElement): State = js.native
  def useImage(imageOrUrl: HTMLImageElement, crossOrigin: String): State = js.native
  @JSName("useImage")
  def useImage_anonymous(imageOrUrl: js.UndefOr[scala.Nothing], crossOrigin: anonymous): State = js.native
  @JSName("useImage")
  def useImage_anonymous(imageOrUrl: String, crossOrigin: anonymous): State = js.native
  @JSName("useImage")
  def useImage_anonymous(imageOrUrl: Null, crossOrigin: anonymous): State = js.native
  @JSName("useImage")
  def useImage_anonymous(imageOrUrl: HTMLImageElement, crossOrigin: anonymous): State = js.native
  @JSName("useImage")
  def useImage_usecredentials(imageOrUrl: js.UndefOr[scala.Nothing], crossOrigin: `use-credentials`): State = js.native
  @JSName("useImage")
  def useImage_usecredentials(imageOrUrl: String, crossOrigin: `use-credentials`): State = js.native
  @JSName("useImage")
  def useImage_usecredentials(imageOrUrl: Null, crossOrigin: `use-credentials`): State = js.native
  @JSName("useImage")
  def useImage_usecredentials(imageOrUrl: HTMLImageElement, crossOrigin: `use-credentials`): State = js.native
  
  def useInterval(fn: js.Function0[Unit], ms: Double): Unit = js.native
  /**
    * Creates a pausable `setInterval` that is properly cleaned up when a component unmounted
    *
    * ```tsx
    *  const [paused, setPaused] = useState(false)
    *  const [timer, setTimer] = useState(0)
    *
    *  useInterval(() => setTimer(i => i + 1), 1000, paused)
    *
    *  return (
    *    <span>
    *      {timer} seconds past
    *
    *      <button onClick={() => setPaused(p => !p)}>{paused ? 'Play' : 'Pause' }</button>
    *    </span>
    * )
    * ```
    *
    * @param fn an function run on each interval
    * @param ms The milliseconds duration of the interval
    * @param paused Whether or not the interval is currently running
    */
  def useInterval(fn: js.Function0[Unit], ms: Double, paused: Boolean): Unit = js.native
  /**
    * Creates a pausable `setInterval` that _fires_ immediately and is
    * properly cleaned up when a component unmounted
    *
    * ```tsx
    *  const [timer, setTimer] = useState(-1)
    *  useInterval(() => setTimer(i => i + 1), 1000, false, true)
    *
    *  // will update to 0 on the first effect
    *  return <span>{timer} seconds past</span>
    * ```
    *
    * @param fn an function run on each interval
    * @param ms The milliseconds duration of the interval
    * @param paused Whether or not the interval is currently running
    * @param runImmediately Whether to run the function immediately on mount or unpause
    * rather than waiting for the first interval to elapse
    *
    */
  def useInterval(fn: js.Function0[Unit], ms: Double, paused: Boolean, runImmediately: Boolean): Unit = js.native
  
  def useMergeState[TState /* <: js.Object */](initialState: TState): js.Tuple2[TState, MergeStateSetter[TState]] = js.native
  def useMergeState[TState /* <: js.Object */](initialState: js.Function0[TState]): js.Tuple2[TState, MergeStateSetter[TState]] = js.native
  
  def useMergeStateFromProps[TProps, TState](props: TProps, gDSFP: Mapper[TProps, TState], initialState: TState): js.Tuple2[TState, MergeStateSetter[TState]] = js.native
  
  def useMounted(): js.Function0[Boolean] = js.native
  
  def usePrevious[T](value: T): T | Null = js.native
  
  def useRafInterval(fn: js.Function0[Unit], ms: Double): Unit = js.native
  
  def useResizeObserver[TElement /* <: Element */](): Rect | Null = js.native
  def useResizeObserver[TElement /* <: Element */](element: TElement): Rect | Null = js.native
}
