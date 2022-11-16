package typings.restartHooks

import typings.react.mod.MutableRefObject
import typings.restartHooks.cjsUseEventListenerMod.EventHandler
import typings.restartHooks.cjsUseGlobalListenerMod.DocumentEventHandler
import typings.restartHooks.cjsUseImageMod.State
import typings.restartHooks.cjsUseMergeStateFromPropsMod.Mapper
import typings.restartHooks.cjsUseMergeStateMod.MergeStateSetter
import typings.restartHooks.cjsUseResizeObserverMod.Rect
import typings.restartHooks.restartHooksStrings.DOMContentLoaded
import typings.restartHooks.restartHooksStrings.`use-credentials`
import typings.restartHooks.restartHooksStrings.abort
import typings.restartHooks.restartHooksStrings.animationcancel
import typings.restartHooks.restartHooksStrings.animationend
import typings.restartHooks.restartHooksStrings.animationiteration
import typings.restartHooks.restartHooksStrings.animationstart
import typings.restartHooks.restartHooksStrings.anonymous
import typings.restartHooks.restartHooksStrings.auxclick
import typings.restartHooks.restartHooksStrings.beforeinput
import typings.restartHooks.restartHooksStrings.blur
import typings.restartHooks.restartHooksStrings.cancel
import typings.restartHooks.restartHooksStrings.canplay
import typings.restartHooks.restartHooksStrings.canplaythrough
import typings.restartHooks.restartHooksStrings.change
import typings.restartHooks.restartHooksStrings.click
import typings.restartHooks.restartHooksStrings.close
import typings.restartHooks.restartHooksStrings.compositionend
import typings.restartHooks.restartHooksStrings.compositionstart
import typings.restartHooks.restartHooksStrings.compositionupdate
import typings.restartHooks.restartHooksStrings.contextmenu
import typings.restartHooks.restartHooksStrings.copy
import typings.restartHooks.restartHooksStrings.cuechange
import typings.restartHooks.restartHooksStrings.cut
import typings.restartHooks.restartHooksStrings.dblclick
import typings.restartHooks.restartHooksStrings.drag
import typings.restartHooks.restartHooksStrings.dragend
import typings.restartHooks.restartHooksStrings.dragenter
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
import typings.restartHooks.restartHooksStrings.formdata
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
import typings.restartHooks.restartHooksStrings.slotchange
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
import typings.restartHooks.restartHooksStrings.webkitanimationend
import typings.restartHooks.restartHooksStrings.webkitanimationiteration
import typings.restartHooks.restartHooksStrings.webkitanimationstart
import typings.restartHooks.restartHooksStrings.webkittransitionend
import typings.restartHooks.restartHooksStrings.wheel
import typings.std.AddEventListenerOptions
import typings.std.Document
import typings.std.Element
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@restart/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCallbackRef[TValue](): js.Tuple2[TValue | Null, js.Function1[/* ref */ TValue | Null, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCallbackRef")().asInstanceOf[js.Tuple2[TValue | Null, js.Function1[/* ref */ TValue | Null, Unit]]]
  
  /**
    * Creates a `Ref` whose value is updated in an effect, ensuring the most recent
    * value is the one rendered with. Generally only required for Concurrent mode usage
    * where previous work in `render()` may be discarded before being used.
    *
    * This is safe to access in an event handler.
    *
    * @param value The `Ref` value
    */
  inline def useCommittedRef[TValue](value: TValue): MutableRefObject[TValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCommittedRef")(value.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[TValue]]
  
  inline def useEventCallback[TCallback /* <: js.Function1[/* repeated */ Any, Any] */](): TCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventCallback")().asInstanceOf[TCallback]
  inline def useEventCallback[TCallback /* <: js.Function1[/* repeated */ Any, Any] */](fn: TCallback): TCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventCallback")(fn.asInstanceOf[js.Any]).asInstanceOf[TCallback]
  
  inline def useEventListener_DOMContentLoaded[T /* <: Element | Document | Window */](eventTarget: T, event: DOMContentLoaded, listener: EventHandler[T, DOMContentLoaded]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_DOMContentLoaded[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: DOMContentLoaded,
    listener: EventHandler[T, DOMContentLoaded],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_DOMContentLoaded[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: DOMContentLoaded,
    listener: EventHandler[T, DOMContentLoaded],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_DOMContentLoaded[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: DOMContentLoaded, listener: EventHandler[T, DOMContentLoaded]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_DOMContentLoaded[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: DOMContentLoaded,
    listener: EventHandler[T, DOMContentLoaded],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_DOMContentLoaded[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: DOMContentLoaded,
    listener: EventHandler[T, DOMContentLoaded],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_abort[T /* <: Element | Document | Window */](eventTarget: T, event: abort, listener: EventHandler[T, abort]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort[T /* <: Element | Document | Window */](eventTarget: T, event: abort, listener: EventHandler[T, abort], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort[T /* <: Element | Document | Window */](eventTarget: T, event: abort, listener: EventHandler[T, abort], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: abort, listener: EventHandler[T, abort]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: abort, listener: EventHandler[T, abort], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_abort[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: abort,
    listener: EventHandler[T, abort],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_animationcancel[T /* <: Element | Document | Window */](eventTarget: T, event: animationcancel, listener: EventHandler[T, animationcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationcancel,
    listener: EventHandler[T, animationcancel],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationcancel,
    listener: EventHandler[T, animationcancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: animationcancel, listener: EventHandler[T, animationcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationcancel,
    listener: EventHandler[T, animationcancel],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationcancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationcancel,
    listener: EventHandler[T, animationcancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_animationend[T /* <: Element | Document | Window */](eventTarget: T, event: animationend, listener: EventHandler[T, animationend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend[T /* <: Element | Document | Window */](eventTarget: T, event: animationend, listener: EventHandler[T, animationend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationend,
    listener: EventHandler[T, animationend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: animationend, listener: EventHandler[T, animationend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationend,
    listener: EventHandler[T, animationend],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationend,
    listener: EventHandler[T, animationend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_animationiteration[T /* <: Element | Document | Window */](eventTarget: T, event: animationiteration, listener: EventHandler[T, animationiteration]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationiteration,
    listener: EventHandler[T, animationiteration],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationiteration,
    listener: EventHandler[T, animationiteration],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationiteration,
    listener: EventHandler[T, animationiteration]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationiteration,
    listener: EventHandler[T, animationiteration],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationiteration,
    listener: EventHandler[T, animationiteration],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_animationstart[T /* <: Element | Document | Window */](eventTarget: T, event: animationstart, listener: EventHandler[T, animationstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart[T /* <: Element | Document | Window */](eventTarget: T, event: animationstart, listener: EventHandler[T, animationstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: animationstart,
    listener: EventHandler[T, animationstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: animationstart, listener: EventHandler[T, animationstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationstart,
    listener: EventHandler[T, animationstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_animationstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: animationstart,
    listener: EventHandler[T, animationstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_auxclick[T /* <: Element | Document | Window */](eventTarget: T, event: auxclick, listener: EventHandler[T, auxclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick[T /* <: Element | Document | Window */](eventTarget: T, event: auxclick, listener: EventHandler[T, auxclick], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: auxclick,
    listener: EventHandler[T, auxclick],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: auxclick, listener: EventHandler[T, auxclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: auxclick,
    listener: EventHandler[T, auxclick],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_auxclick[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: auxclick,
    listener: EventHandler[T, auxclick],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_beforeinput[T /* <: Element | Document | Window */](eventTarget: T, event: beforeinput, listener: EventHandler[T, beforeinput]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeinput[T /* <: Element | Document | Window */](eventTarget: T, event: beforeinput, listener: EventHandler[T, beforeinput], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeinput[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: beforeinput,
    listener: EventHandler[T, beforeinput],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeinput[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: beforeinput, listener: EventHandler[T, beforeinput]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeinput[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: beforeinput,
    listener: EventHandler[T, beforeinput],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_beforeinput[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: beforeinput,
    listener: EventHandler[T, beforeinput],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_blur[T /* <: Element | Document | Window */](eventTarget: T, event: blur, listener: EventHandler[T, blur]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur[T /* <: Element | Document | Window */](eventTarget: T, event: blur, listener: EventHandler[T, blur], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur[T /* <: Element | Document | Window */](eventTarget: T, event: blur, listener: EventHandler[T, blur], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: blur, listener: EventHandler[T, blur]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: blur, listener: EventHandler[T, blur], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_blur[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: blur,
    listener: EventHandler[T, blur],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_cancel[T /* <: Element | Document | Window */](eventTarget: T, event: cancel, listener: EventHandler[T, cancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cancel[T /* <: Element | Document | Window */](eventTarget: T, event: cancel, listener: EventHandler[T, cancel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cancel[T /* <: Element | Document | Window */](eventTarget: T, event: cancel, listener: EventHandler[T, cancel], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cancel, listener: EventHandler[T, cancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cancel, listener: EventHandler[T, cancel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: cancel,
    listener: EventHandler[T, cancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_canplay[T /* <: Element | Document | Window */](eventTarget: T, event: canplay, listener: EventHandler[T, canplay]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay[T /* <: Element | Document | Window */](eventTarget: T, event: canplay, listener: EventHandler[T, canplay], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: canplay,
    listener: EventHandler[T, canplay],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: canplay, listener: EventHandler[T, canplay]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: canplay, listener: EventHandler[T, canplay], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplay[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: canplay,
    listener: EventHandler[T, canplay],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_canplaythrough[T /* <: Element | Document | Window */](eventTarget: T, event: canplaythrough, listener: EventHandler[T, canplaythrough]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough[T /* <: Element | Document | Window */](eventTarget: T, event: canplaythrough, listener: EventHandler[T, canplaythrough], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: canplaythrough,
    listener: EventHandler[T, canplaythrough],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: canplaythrough, listener: EventHandler[T, canplaythrough]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: canplaythrough,
    listener: EventHandler[T, canplaythrough],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_canplaythrough[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: canplaythrough,
    listener: EventHandler[T, canplaythrough],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_change[T /* <: Element | Document | Window */](eventTarget: T, event: change, listener: EventHandler[T, change]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change[T /* <: Element | Document | Window */](eventTarget: T, event: change, listener: EventHandler[T, change], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change[T /* <: Element | Document | Window */](eventTarget: T, event: change, listener: EventHandler[T, change], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: change, listener: EventHandler[T, change]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: change, listener: EventHandler[T, change], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_change[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: change,
    listener: EventHandler[T, change],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_click[T /* <: Element | Document | Window */](eventTarget: T, event: click, listener: EventHandler[T, click]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click[T /* <: Element | Document | Window */](eventTarget: T, event: click, listener: EventHandler[T, click], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click[T /* <: Element | Document | Window */](eventTarget: T, event: click, listener: EventHandler[T, click], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: click, listener: EventHandler[T, click]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: click, listener: EventHandler[T, click], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_click[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: click,
    listener: EventHandler[T, click],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_close[T /* <: Element | Document | Window */](eventTarget: T, event: close, listener: EventHandler[T, close]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close[T /* <: Element | Document | Window */](eventTarget: T, event: close, listener: EventHandler[T, close], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close[T /* <: Element | Document | Window */](eventTarget: T, event: close, listener: EventHandler[T, close], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: close, listener: EventHandler[T, close]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: close, listener: EventHandler[T, close], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_close[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: close,
    listener: EventHandler[T, close],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_compositionend[T /* <: Element | Document | Window */](eventTarget: T, event: compositionend, listener: EventHandler[T, compositionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionend[T /* <: Element | Document | Window */](eventTarget: T, event: compositionend, listener: EventHandler[T, compositionend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: compositionend,
    listener: EventHandler[T, compositionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: compositionend, listener: EventHandler[T, compositionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: compositionend,
    listener: EventHandler[T, compositionend],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: compositionend,
    listener: EventHandler[T, compositionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_compositionstart[T /* <: Element | Document | Window */](eventTarget: T, event: compositionstart, listener: EventHandler[T, compositionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: compositionstart,
    listener: EventHandler[T, compositionstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: compositionstart,
    listener: EventHandler[T, compositionstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: compositionstart, listener: EventHandler[T, compositionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: compositionstart,
    listener: EventHandler[T, compositionstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: compositionstart,
    listener: EventHandler[T, compositionstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_compositionupdate[T /* <: Element | Document | Window */](eventTarget: T, event: compositionupdate, listener: EventHandler[T, compositionupdate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionupdate[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: compositionupdate,
    listener: EventHandler[T, compositionupdate],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionupdate[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: compositionupdate,
    listener: EventHandler[T, compositionupdate],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionupdate[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: compositionupdate,
    listener: EventHandler[T, compositionupdate]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionupdate[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: compositionupdate,
    listener: EventHandler[T, compositionupdate],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_compositionupdate[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: compositionupdate,
    listener: EventHandler[T, compositionupdate],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_contextmenu[T /* <: Element | Document | Window */](eventTarget: T, event: contextmenu, listener: EventHandler[T, contextmenu]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu[T /* <: Element | Document | Window */](eventTarget: T, event: contextmenu, listener: EventHandler[T, contextmenu], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: contextmenu,
    listener: EventHandler[T, contextmenu],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: contextmenu, listener: EventHandler[T, contextmenu]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: contextmenu,
    listener: EventHandler[T, contextmenu],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_contextmenu[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: contextmenu,
    listener: EventHandler[T, contextmenu],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_copy[T /* <: Element | Document | Window */](eventTarget: T, event: copy, listener: EventHandler[T, copy]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_copy[T /* <: Element | Document | Window */](eventTarget: T, event: copy, listener: EventHandler[T, copy], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_copy[T /* <: Element | Document | Window */](eventTarget: T, event: copy, listener: EventHandler[T, copy], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_copy[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: copy, listener: EventHandler[T, copy]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_copy[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: copy, listener: EventHandler[T, copy], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_copy[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: copy,
    listener: EventHandler[T, copy],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_cuechange[T /* <: Element | Document | Window */](eventTarget: T, event: cuechange, listener: EventHandler[T, cuechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange[T /* <: Element | Document | Window */](eventTarget: T, event: cuechange, listener: EventHandler[T, cuechange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: cuechange,
    listener: EventHandler[T, cuechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cuechange, listener: EventHandler[T, cuechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: cuechange,
    listener: EventHandler[T, cuechange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cuechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: cuechange,
    listener: EventHandler[T, cuechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_cut[T /* <: Element | Document | Window */](eventTarget: T, event: cut, listener: EventHandler[T, cut]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cut[T /* <: Element | Document | Window */](eventTarget: T, event: cut, listener: EventHandler[T, cut], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cut[T /* <: Element | Document | Window */](eventTarget: T, event: cut, listener: EventHandler[T, cut], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cut[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cut, listener: EventHandler[T, cut]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cut[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: cut, listener: EventHandler[T, cut], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_cut[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: cut,
    listener: EventHandler[T, cut],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dblclick[T /* <: Element | Document | Window */](eventTarget: T, event: dblclick, listener: EventHandler[T, dblclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick[T /* <: Element | Document | Window */](eventTarget: T, event: dblclick, listener: EventHandler[T, dblclick], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dblclick,
    listener: EventHandler[T, dblclick],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dblclick, listener: EventHandler[T, dblclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dblclick,
    listener: EventHandler[T, dblclick],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dblclick[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dblclick,
    listener: EventHandler[T, dblclick],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_drag[T /* <: Element | Document | Window */](eventTarget: T, event: drag, listener: EventHandler[T, drag]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag[T /* <: Element | Document | Window */](eventTarget: T, event: drag, listener: EventHandler[T, drag], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag[T /* <: Element | Document | Window */](eventTarget: T, event: drag, listener: EventHandler[T, drag], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: drag, listener: EventHandler[T, drag]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: drag, listener: EventHandler[T, drag], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drag[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: drag,
    listener: EventHandler[T, drag],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragend[T /* <: Element | Document | Window */](eventTarget: T, event: dragend, listener: EventHandler[T, dragend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend[T /* <: Element | Document | Window */](eventTarget: T, event: dragend, listener: EventHandler[T, dragend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragend,
    listener: EventHandler[T, dragend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragend, listener: EventHandler[T, dragend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragend, listener: EventHandler[T, dragend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragend,
    listener: EventHandler[T, dragend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragenter[T /* <: Element | Document | Window */](eventTarget: T, event: dragenter, listener: EventHandler[T, dragenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter[T /* <: Element | Document | Window */](eventTarget: T, event: dragenter, listener: EventHandler[T, dragenter], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragenter,
    listener: EventHandler[T, dragenter],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragenter, listener: EventHandler[T, dragenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragenter,
    listener: EventHandler[T, dragenter],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragenter,
    listener: EventHandler[T, dragenter],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragleave[T /* <: Element | Document | Window */](eventTarget: T, event: dragleave, listener: EventHandler[T, dragleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave[T /* <: Element | Document | Window */](eventTarget: T, event: dragleave, listener: EventHandler[T, dragleave], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragleave,
    listener: EventHandler[T, dragleave],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragleave, listener: EventHandler[T, dragleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragleave,
    listener: EventHandler[T, dragleave],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragleave,
    listener: EventHandler[T, dragleave],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragover[T /* <: Element | Document | Window */](eventTarget: T, event: dragover, listener: EventHandler[T, dragover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover[T /* <: Element | Document | Window */](eventTarget: T, event: dragover, listener: EventHandler[T, dragover], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragover,
    listener: EventHandler[T, dragover],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragover, listener: EventHandler[T, dragover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragover,
    listener: EventHandler[T, dragover],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragover,
    listener: EventHandler[T, dragover],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_dragstart[T /* <: Element | Document | Window */](eventTarget: T, event: dragstart, listener: EventHandler[T, dragstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart[T /* <: Element | Document | Window */](eventTarget: T, event: dragstart, listener: EventHandler[T, dragstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: dragstart,
    listener: EventHandler[T, dragstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: dragstart, listener: EventHandler[T, dragstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragstart,
    listener: EventHandler[T, dragstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_dragstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: dragstart,
    listener: EventHandler[T, dragstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_drop[T /* <: Element | Document | Window */](eventTarget: T, event: drop, listener: EventHandler[T, drop]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop[T /* <: Element | Document | Window */](eventTarget: T, event: drop, listener: EventHandler[T, drop], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop[T /* <: Element | Document | Window */](eventTarget: T, event: drop, listener: EventHandler[T, drop], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: drop, listener: EventHandler[T, drop]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: drop, listener: EventHandler[T, drop], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_drop[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: drop,
    listener: EventHandler[T, drop],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_durationchange[T /* <: Element | Document | Window */](eventTarget: T, event: durationchange, listener: EventHandler[T, durationchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange[T /* <: Element | Document | Window */](eventTarget: T, event: durationchange, listener: EventHandler[T, durationchange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: durationchange,
    listener: EventHandler[T, durationchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: durationchange, listener: EventHandler[T, durationchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: durationchange,
    listener: EventHandler[T, durationchange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_durationchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: durationchange,
    listener: EventHandler[T, durationchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_emptied[T /* <: Element | Document | Window */](eventTarget: T, event: emptied, listener: EventHandler[T, emptied]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied[T /* <: Element | Document | Window */](eventTarget: T, event: emptied, listener: EventHandler[T, emptied], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: emptied,
    listener: EventHandler[T, emptied],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: emptied, listener: EventHandler[T, emptied]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: emptied, listener: EventHandler[T, emptied], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_emptied[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: emptied,
    listener: EventHandler[T, emptied],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_ended[T /* <: Element | Document | Window */](eventTarget: T, event: ended, listener: EventHandler[T, ended]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended[T /* <: Element | Document | Window */](eventTarget: T, event: ended, listener: EventHandler[T, ended], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended[T /* <: Element | Document | Window */](eventTarget: T, event: ended, listener: EventHandler[T, ended], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: ended, listener: EventHandler[T, ended]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: ended, listener: EventHandler[T, ended], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ended[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: ended,
    listener: EventHandler[T, ended],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_error[T /* <: Element | Document | Window */](eventTarget: T, event: error, listener: EventHandler[T, error]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error[T /* <: Element | Document | Window */](eventTarget: T, event: error, listener: EventHandler[T, error], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error[T /* <: Element | Document | Window */](eventTarget: T, event: error, listener: EventHandler[T, error], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: error, listener: EventHandler[T, error]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: error, listener: EventHandler[T, error], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_error[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: error,
    listener: EventHandler[T, error],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_focus[T /* <: Element | Document | Window */](eventTarget: T, event: focus, listener: EventHandler[T, focus]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus[T /* <: Element | Document | Window */](eventTarget: T, event: focus, listener: EventHandler[T, focus], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus[T /* <: Element | Document | Window */](eventTarget: T, event: focus, listener: EventHandler[T, focus], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focus, listener: EventHandler[T, focus]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focus, listener: EventHandler[T, focus], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focus[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: focus,
    listener: EventHandler[T, focus],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_focusin[T /* <: Element | Document | Window */](eventTarget: T, event: focusin, listener: EventHandler[T, focusin]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin[T /* <: Element | Document | Window */](eventTarget: T, event: focusin, listener: EventHandler[T, focusin], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: focusin,
    listener: EventHandler[T, focusin],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focusin, listener: EventHandler[T, focusin]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focusin, listener: EventHandler[T, focusin], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusin[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: focusin,
    listener: EventHandler[T, focusin],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_focusout[T /* <: Element | Document | Window */](eventTarget: T, event: focusout, listener: EventHandler[T, focusout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout[T /* <: Element | Document | Window */](eventTarget: T, event: focusout, listener: EventHandler[T, focusout], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: focusout,
    listener: EventHandler[T, focusout],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: focusout, listener: EventHandler[T, focusout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: focusout,
    listener: EventHandler[T, focusout],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_focusout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: focusout,
    listener: EventHandler[T, focusout],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_formdata[T /* <: Element | Document | Window */](eventTarget: T, event: formdata, listener: EventHandler[T, formdata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_formdata[T /* <: Element | Document | Window */](eventTarget: T, event: formdata, listener: EventHandler[T, formdata], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_formdata[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: formdata,
    listener: EventHandler[T, formdata],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_formdata[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: formdata, listener: EventHandler[T, formdata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_formdata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: formdata,
    listener: EventHandler[T, formdata],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_formdata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: formdata,
    listener: EventHandler[T, formdata],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_fullscreenchange[T /* <: Element | Document | Window */](eventTarget: T, event: fullscreenchange, listener: EventHandler[T, fullscreenchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: fullscreenchange,
    listener: EventHandler[T, fullscreenchange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: fullscreenchange,
    listener: EventHandler[T, fullscreenchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenchange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: fullscreenchange, listener: EventHandler[T, fullscreenchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: fullscreenchange,
    listener: EventHandler[T, fullscreenchange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: fullscreenchange,
    listener: EventHandler[T, fullscreenchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_fullscreenerror[T /* <: Element | Document | Window */](eventTarget: T, event: fullscreenerror, listener: EventHandler[T, fullscreenerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenerror[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: fullscreenerror,
    listener: EventHandler[T, fullscreenerror],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenerror[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: fullscreenerror,
    listener: EventHandler[T, fullscreenerror],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenerror[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: fullscreenerror, listener: EventHandler[T, fullscreenerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenerror[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: fullscreenerror,
    listener: EventHandler[T, fullscreenerror],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_fullscreenerror[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: fullscreenerror,
    listener: EventHandler[T, fullscreenerror],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_gotpointercapture[T /* <: Element | Document | Window */](eventTarget: T, event: gotpointercapture, listener: EventHandler[T, gotpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_gotpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: gotpointercapture,
    listener: EventHandler[T, gotpointercapture],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_input[T /* <: Element | Document | Window */](eventTarget: T, event: input, listener: EventHandler[T, input]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input[T /* <: Element | Document | Window */](eventTarget: T, event: input, listener: EventHandler[T, input], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input[T /* <: Element | Document | Window */](eventTarget: T, event: input, listener: EventHandler[T, input], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: input, listener: EventHandler[T, input]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: input, listener: EventHandler[T, input], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_input[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: input,
    listener: EventHandler[T, input],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_invalid[T /* <: Element | Document | Window */](eventTarget: T, event: invalid, listener: EventHandler[T, invalid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid[T /* <: Element | Document | Window */](eventTarget: T, event: invalid, listener: EventHandler[T, invalid], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: invalid,
    listener: EventHandler[T, invalid],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: invalid, listener: EventHandler[T, invalid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: invalid, listener: EventHandler[T, invalid], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_invalid[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: invalid,
    listener: EventHandler[T, invalid],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_keydown[T /* <: Element | Document | Window */](eventTarget: T, event: keydown, listener: EventHandler[T, keydown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown[T /* <: Element | Document | Window */](eventTarget: T, event: keydown, listener: EventHandler[T, keydown], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: keydown,
    listener: EventHandler[T, keydown],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keydown, listener: EventHandler[T, keydown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keydown, listener: EventHandler[T, keydown], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keydown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: keydown,
    listener: EventHandler[T, keydown],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_keypress[T /* <: Element | Document | Window */](eventTarget: T, event: keypress, listener: EventHandler[T, keypress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress[T /* <: Element | Document | Window */](eventTarget: T, event: keypress, listener: EventHandler[T, keypress], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: keypress,
    listener: EventHandler[T, keypress],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keypress, listener: EventHandler[T, keypress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: keypress,
    listener: EventHandler[T, keypress],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keypress[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: keypress,
    listener: EventHandler[T, keypress],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_keyup[T /* <: Element | Document | Window */](eventTarget: T, event: keyup, listener: EventHandler[T, keyup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup[T /* <: Element | Document | Window */](eventTarget: T, event: keyup, listener: EventHandler[T, keyup], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup[T /* <: Element | Document | Window */](eventTarget: T, event: keyup, listener: EventHandler[T, keyup], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keyup, listener: EventHandler[T, keyup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: keyup, listener: EventHandler[T, keyup], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_keyup[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: keyup,
    listener: EventHandler[T, keyup],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_load[T /* <: Element | Document | Window */](eventTarget: T, event: load, listener: EventHandler[T, load]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load[T /* <: Element | Document | Window */](eventTarget: T, event: load, listener: EventHandler[T, load], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load[T /* <: Element | Document | Window */](eventTarget: T, event: load, listener: EventHandler[T, load], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: load, listener: EventHandler[T, load]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: load, listener: EventHandler[T, load], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_load[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: load,
    listener: EventHandler[T, load],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_loadeddata[T /* <: Element | Document | Window */](eventTarget: T, event: loadeddata, listener: EventHandler[T, loadeddata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata[T /* <: Element | Document | Window */](eventTarget: T, event: loadeddata, listener: EventHandler[T, loadeddata], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: loadeddata,
    listener: EventHandler[T, loadeddata],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: loadeddata, listener: EventHandler[T, loadeddata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadeddata,
    listener: EventHandler[T, loadeddata],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadeddata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadeddata,
    listener: EventHandler[T, loadeddata],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_loadedmetadata[T /* <: Element | Document | Window */](eventTarget: T, event: loadedmetadata, listener: EventHandler[T, loadedmetadata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata[T /* <: Element | Document | Window */](eventTarget: T, event: loadedmetadata, listener: EventHandler[T, loadedmetadata], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: loadedmetadata,
    listener: EventHandler[T, loadedmetadata],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: loadedmetadata, listener: EventHandler[T, loadedmetadata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadedmetadata,
    listener: EventHandler[T, loadedmetadata],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadedmetadata[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadedmetadata,
    listener: EventHandler[T, loadedmetadata],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_loadstart[T /* <: Element | Document | Window */](eventTarget: T, event: loadstart, listener: EventHandler[T, loadstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart[T /* <: Element | Document | Window */](eventTarget: T, event: loadstart, listener: EventHandler[T, loadstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: loadstart,
    listener: EventHandler[T, loadstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: loadstart, listener: EventHandler[T, loadstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadstart,
    listener: EventHandler[T, loadstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_loadstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: loadstart,
    listener: EventHandler[T, loadstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_lostpointercapture[T /* <: Element | Document | Window */](eventTarget: T, event: lostpointercapture, listener: EventHandler[T, lostpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_lostpointercapture[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: lostpointercapture,
    listener: EventHandler[T, lostpointercapture],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mousedown[T /* <: Element | Document | Window */](eventTarget: T, event: mousedown, listener: EventHandler[T, mousedown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown[T /* <: Element | Document | Window */](eventTarget: T, event: mousedown, listener: EventHandler[T, mousedown], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mousedown,
    listener: EventHandler[T, mousedown],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mousedown, listener: EventHandler[T, mousedown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mousedown,
    listener: EventHandler[T, mousedown],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousedown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mousedown,
    listener: EventHandler[T, mousedown],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseenter[T /* <: Element | Document | Window */](eventTarget: T, event: mouseenter, listener: EventHandler[T, mouseenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter[T /* <: Element | Document | Window */](eventTarget: T, event: mouseenter, listener: EventHandler[T, mouseenter], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseenter,
    listener: EventHandler[T, mouseenter],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseenter, listener: EventHandler[T, mouseenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseenter,
    listener: EventHandler[T, mouseenter],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseenter,
    listener: EventHandler[T, mouseenter],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseleave[T /* <: Element | Document | Window */](eventTarget: T, event: mouseleave, listener: EventHandler[T, mouseleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave[T /* <: Element | Document | Window */](eventTarget: T, event: mouseleave, listener: EventHandler[T, mouseleave], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseleave,
    listener: EventHandler[T, mouseleave],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseleave, listener: EventHandler[T, mouseleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseleave,
    listener: EventHandler[T, mouseleave],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseleave,
    listener: EventHandler[T, mouseleave],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mousemove[T /* <: Element | Document | Window */](eventTarget: T, event: mousemove, listener: EventHandler[T, mousemove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove[T /* <: Element | Document | Window */](eventTarget: T, event: mousemove, listener: EventHandler[T, mousemove], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mousemove,
    listener: EventHandler[T, mousemove],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mousemove, listener: EventHandler[T, mousemove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mousemove,
    listener: EventHandler[T, mousemove],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mousemove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mousemove,
    listener: EventHandler[T, mousemove],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseout[T /* <: Element | Document | Window */](eventTarget: T, event: mouseout, listener: EventHandler[T, mouseout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout[T /* <: Element | Document | Window */](eventTarget: T, event: mouseout, listener: EventHandler[T, mouseout], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseout,
    listener: EventHandler[T, mouseout],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseout, listener: EventHandler[T, mouseout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseout,
    listener: EventHandler[T, mouseout],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseout,
    listener: EventHandler[T, mouseout],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseover[T /* <: Element | Document | Window */](eventTarget: T, event: mouseover, listener: EventHandler[T, mouseover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover[T /* <: Element | Document | Window */](eventTarget: T, event: mouseover, listener: EventHandler[T, mouseover], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseover,
    listener: EventHandler[T, mouseover],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseover, listener: EventHandler[T, mouseover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseover,
    listener: EventHandler[T, mouseover],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseover,
    listener: EventHandler[T, mouseover],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_mouseup[T /* <: Element | Document | Window */](eventTarget: T, event: mouseup, listener: EventHandler[T, mouseup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup[T /* <: Element | Document | Window */](eventTarget: T, event: mouseup, listener: EventHandler[T, mouseup], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: mouseup,
    listener: EventHandler[T, mouseup],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseup, listener: EventHandler[T, mouseup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: mouseup, listener: EventHandler[T, mouseup], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_mouseup[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: mouseup,
    listener: EventHandler[T, mouseup],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_paste[T /* <: Element | Document | Window */](eventTarget: T, event: paste, listener: EventHandler[T, paste]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_paste[T /* <: Element | Document | Window */](eventTarget: T, event: paste, listener: EventHandler[T, paste], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_paste[T /* <: Element | Document | Window */](eventTarget: T, event: paste, listener: EventHandler[T, paste], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_paste[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: paste, listener: EventHandler[T, paste]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_paste[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: paste, listener: EventHandler[T, paste], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_paste[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: paste,
    listener: EventHandler[T, paste],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pause[T /* <: Element | Document | Window */](eventTarget: T, event: pause, listener: EventHandler[T, pause]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause[T /* <: Element | Document | Window */](eventTarget: T, event: pause, listener: EventHandler[T, pause], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause[T /* <: Element | Document | Window */](eventTarget: T, event: pause, listener: EventHandler[T, pause], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pause, listener: EventHandler[T, pause]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pause, listener: EventHandler[T, pause], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pause[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pause,
    listener: EventHandler[T, pause],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_play[T /* <: Element | Document | Window */](eventTarget: T, event: play, listener: EventHandler[T, play]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play[T /* <: Element | Document | Window */](eventTarget: T, event: play, listener: EventHandler[T, play], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play[T /* <: Element | Document | Window */](eventTarget: T, event: play, listener: EventHandler[T, play], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: play, listener: EventHandler[T, play]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: play, listener: EventHandler[T, play], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_play[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: play,
    listener: EventHandler[T, play],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_playing[T /* <: Element | Document | Window */](eventTarget: T, event: playing, listener: EventHandler[T, playing]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing[T /* <: Element | Document | Window */](eventTarget: T, event: playing, listener: EventHandler[T, playing], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: playing,
    listener: EventHandler[T, playing],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: playing, listener: EventHandler[T, playing]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: playing, listener: EventHandler[T, playing], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_playing[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: playing,
    listener: EventHandler[T, playing],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointercancel[T /* <: Element | Document | Window */](eventTarget: T, event: pointercancel, listener: EventHandler[T, pointercancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel[T /* <: Element | Document | Window */](eventTarget: T, event: pointercancel, listener: EventHandler[T, pointercancel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointercancel,
    listener: EventHandler[T, pointercancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointercancel, listener: EventHandler[T, pointercancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointercancel,
    listener: EventHandler[T, pointercancel],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointercancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointercancel,
    listener: EventHandler[T, pointercancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerdown[T /* <: Element | Document | Window */](eventTarget: T, event: pointerdown, listener: EventHandler[T, pointerdown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown[T /* <: Element | Document | Window */](eventTarget: T, event: pointerdown, listener: EventHandler[T, pointerdown], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerdown,
    listener: EventHandler[T, pointerdown],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerdown, listener: EventHandler[T, pointerdown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerdown,
    listener: EventHandler[T, pointerdown],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerdown[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerdown,
    listener: EventHandler[T, pointerdown],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerenter[T /* <: Element | Document | Window */](eventTarget: T, event: pointerenter, listener: EventHandler[T, pointerenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter[T /* <: Element | Document | Window */](eventTarget: T, event: pointerenter, listener: EventHandler[T, pointerenter], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerenter,
    listener: EventHandler[T, pointerenter],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerenter, listener: EventHandler[T, pointerenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerenter,
    listener: EventHandler[T, pointerenter],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerenter[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerenter,
    listener: EventHandler[T, pointerenter],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerleave[T /* <: Element | Document | Window */](eventTarget: T, event: pointerleave, listener: EventHandler[T, pointerleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave[T /* <: Element | Document | Window */](eventTarget: T, event: pointerleave, listener: EventHandler[T, pointerleave], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerleave,
    listener: EventHandler[T, pointerleave],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerleave, listener: EventHandler[T, pointerleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerleave,
    listener: EventHandler[T, pointerleave],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerleave[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerleave,
    listener: EventHandler[T, pointerleave],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerlockchange[T /* <: Element | Document | Window */](eventTarget: T, event: pointerlockchange, listener: EventHandler[T, pointerlockchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerlockchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockchange,
    listener: EventHandler[T, pointerlockchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerlockerror[T /* <: Element | Document | Window */](eventTarget: T, event: pointerlockerror, listener: EventHandler[T, pointerlockerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerlockerror[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerlockerror,
    listener: EventHandler[T, pointerlockerror],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerlockerror[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerlockerror,
    listener: EventHandler[T, pointerlockerror],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerlockerror[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerlockerror, listener: EventHandler[T, pointerlockerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerlockerror[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockerror,
    listener: EventHandler[T, pointerlockerror],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerlockerror[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerlockerror,
    listener: EventHandler[T, pointerlockerror],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointermove[T /* <: Element | Document | Window */](eventTarget: T, event: pointermove, listener: EventHandler[T, pointermove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove[T /* <: Element | Document | Window */](eventTarget: T, event: pointermove, listener: EventHandler[T, pointermove], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointermove,
    listener: EventHandler[T, pointermove],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointermove, listener: EventHandler[T, pointermove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointermove,
    listener: EventHandler[T, pointermove],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointermove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointermove,
    listener: EventHandler[T, pointermove],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerout[T /* <: Element | Document | Window */](eventTarget: T, event: pointerout, listener: EventHandler[T, pointerout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout[T /* <: Element | Document | Window */](eventTarget: T, event: pointerout, listener: EventHandler[T, pointerout], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerout,
    listener: EventHandler[T, pointerout],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerout, listener: EventHandler[T, pointerout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerout,
    listener: EventHandler[T, pointerout],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerout[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerout,
    listener: EventHandler[T, pointerout],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerover[T /* <: Element | Document | Window */](eventTarget: T, event: pointerover, listener: EventHandler[T, pointerover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover[T /* <: Element | Document | Window */](eventTarget: T, event: pointerover, listener: EventHandler[T, pointerover], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerover,
    listener: EventHandler[T, pointerover],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerover, listener: EventHandler[T, pointerover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerover,
    listener: EventHandler[T, pointerover],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerover[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerover,
    listener: EventHandler[T, pointerover],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_pointerup[T /* <: Element | Document | Window */](eventTarget: T, event: pointerup, listener: EventHandler[T, pointerup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup[T /* <: Element | Document | Window */](eventTarget: T, event: pointerup, listener: EventHandler[T, pointerup], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: pointerup,
    listener: EventHandler[T, pointerup],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: pointerup, listener: EventHandler[T, pointerup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerup,
    listener: EventHandler[T, pointerup],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_pointerup[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: pointerup,
    listener: EventHandler[T, pointerup],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_progress[T /* <: Element | Document | Window */](eventTarget: T, event: progress, listener: EventHandler[T, progress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress[T /* <: Element | Document | Window */](eventTarget: T, event: progress, listener: EventHandler[T, progress], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: progress,
    listener: EventHandler[T, progress],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: progress, listener: EventHandler[T, progress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: progress,
    listener: EventHandler[T, progress],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_progress[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: progress,
    listener: EventHandler[T, progress],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_ratechange[T /* <: Element | Document | Window */](eventTarget: T, event: ratechange, listener: EventHandler[T, ratechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange[T /* <: Element | Document | Window */](eventTarget: T, event: ratechange, listener: EventHandler[T, ratechange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: ratechange,
    listener: EventHandler[T, ratechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: ratechange, listener: EventHandler[T, ratechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: ratechange,
    listener: EventHandler[T, ratechange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_ratechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: ratechange,
    listener: EventHandler[T, ratechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_readystatechange[T /* <: Element | Document | Window */](eventTarget: T, event: readystatechange, listener: EventHandler[T, readystatechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_readystatechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: readystatechange,
    listener: EventHandler[T, readystatechange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_readystatechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: readystatechange,
    listener: EventHandler[T, readystatechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_readystatechange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: readystatechange, listener: EventHandler[T, readystatechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_readystatechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: readystatechange,
    listener: EventHandler[T, readystatechange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_readystatechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: readystatechange,
    listener: EventHandler[T, readystatechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_reset[T /* <: Element | Document | Window */](eventTarget: T, event: reset, listener: EventHandler[T, reset]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset[T /* <: Element | Document | Window */](eventTarget: T, event: reset, listener: EventHandler[T, reset], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset[T /* <: Element | Document | Window */](eventTarget: T, event: reset, listener: EventHandler[T, reset], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: reset, listener: EventHandler[T, reset]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: reset, listener: EventHandler[T, reset], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_reset[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: reset,
    listener: EventHandler[T, reset],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_resize[T /* <: Element | Document | Window */](eventTarget: T, event: resize, listener: EventHandler[T, resize]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize[T /* <: Element | Document | Window */](eventTarget: T, event: resize, listener: EventHandler[T, resize], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize[T /* <: Element | Document | Window */](eventTarget: T, event: resize, listener: EventHandler[T, resize], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: resize, listener: EventHandler[T, resize]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: resize, listener: EventHandler[T, resize], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_resize[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: resize,
    listener: EventHandler[T, resize],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_scroll[T /* <: Element | Document | Window */](eventTarget: T, event: scroll, listener: EventHandler[T, scroll]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll[T /* <: Element | Document | Window */](eventTarget: T, event: scroll, listener: EventHandler[T, scroll], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll[T /* <: Element | Document | Window */](eventTarget: T, event: scroll, listener: EventHandler[T, scroll], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: scroll, listener: EventHandler[T, scroll]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: scroll, listener: EventHandler[T, scroll], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_scroll[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: scroll,
    listener: EventHandler[T, scroll],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_securitypolicyviolation[T /* <: Element | Document | Window */](eventTarget: T, event: securitypolicyviolation, listener: EventHandler[T, securitypolicyviolation]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_securitypolicyviolation[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: securitypolicyviolation,
    listener: EventHandler[T, securitypolicyviolation],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_seeked[T /* <: Element | Document | Window */](eventTarget: T, event: seeked, listener: EventHandler[T, seeked]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked[T /* <: Element | Document | Window */](eventTarget: T, event: seeked, listener: EventHandler[T, seeked], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked[T /* <: Element | Document | Window */](eventTarget: T, event: seeked, listener: EventHandler[T, seeked], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: seeked, listener: EventHandler[T, seeked]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: seeked, listener: EventHandler[T, seeked], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeked[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: seeked,
    listener: EventHandler[T, seeked],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_seeking[T /* <: Element | Document | Window */](eventTarget: T, event: seeking, listener: EventHandler[T, seeking]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking[T /* <: Element | Document | Window */](eventTarget: T, event: seeking, listener: EventHandler[T, seeking], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: seeking,
    listener: EventHandler[T, seeking],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: seeking, listener: EventHandler[T, seeking]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: seeking, listener: EventHandler[T, seeking], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_seeking[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: seeking,
    listener: EventHandler[T, seeking],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_select[T /* <: Element | Document | Window */](eventTarget: T, event: select, listener: EventHandler[T, select]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select[T /* <: Element | Document | Window */](eventTarget: T, event: select, listener: EventHandler[T, select], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select[T /* <: Element | Document | Window */](eventTarget: T, event: select, listener: EventHandler[T, select], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: select, listener: EventHandler[T, select]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: select, listener: EventHandler[T, select], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_select[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: select,
    listener: EventHandler[T, select],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_selectionchange[T /* <: Element | Document | Window */](eventTarget: T, event: selectionchange, listener: EventHandler[T, selectionchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: selectionchange,
    listener: EventHandler[T, selectionchange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: selectionchange,
    listener: EventHandler[T, selectionchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: selectionchange, listener: EventHandler[T, selectionchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: selectionchange,
    listener: EventHandler[T, selectionchange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectionchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: selectionchange,
    listener: EventHandler[T, selectionchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_selectstart[T /* <: Element | Document | Window */](eventTarget: T, event: selectstart, listener: EventHandler[T, selectstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart[T /* <: Element | Document | Window */](eventTarget: T, event: selectstart, listener: EventHandler[T, selectstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: selectstart,
    listener: EventHandler[T, selectstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: selectstart, listener: EventHandler[T, selectstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: selectstart,
    listener: EventHandler[T, selectstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_selectstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: selectstart,
    listener: EventHandler[T, selectstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_slotchange[T /* <: Element | Document | Window */](eventTarget: T, event: slotchange, listener: EventHandler[T, slotchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_slotchange[T /* <: Element | Document | Window */](eventTarget: T, event: slotchange, listener: EventHandler[T, slotchange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_slotchange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: slotchange,
    listener: EventHandler[T, slotchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_slotchange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: slotchange, listener: EventHandler[T, slotchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_slotchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: slotchange,
    listener: EventHandler[T, slotchange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_slotchange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: slotchange,
    listener: EventHandler[T, slotchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_stalled[T /* <: Element | Document | Window */](eventTarget: T, event: stalled, listener: EventHandler[T, stalled]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled[T /* <: Element | Document | Window */](eventTarget: T, event: stalled, listener: EventHandler[T, stalled], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: stalled,
    listener: EventHandler[T, stalled],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: stalled, listener: EventHandler[T, stalled]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: stalled, listener: EventHandler[T, stalled], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_stalled[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: stalled,
    listener: EventHandler[T, stalled],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_submit[T /* <: Element | Document | Window */](eventTarget: T, event: submit, listener: EventHandler[T, submit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit[T /* <: Element | Document | Window */](eventTarget: T, event: submit, listener: EventHandler[T, submit], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit[T /* <: Element | Document | Window */](eventTarget: T, event: submit, listener: EventHandler[T, submit], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: submit, listener: EventHandler[T, submit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: submit, listener: EventHandler[T, submit], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_submit[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: submit,
    listener: EventHandler[T, submit],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_suspend[T /* <: Element | Document | Window */](eventTarget: T, event: suspend, listener: EventHandler[T, suspend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend[T /* <: Element | Document | Window */](eventTarget: T, event: suspend, listener: EventHandler[T, suspend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: suspend,
    listener: EventHandler[T, suspend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: suspend, listener: EventHandler[T, suspend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: suspend, listener: EventHandler[T, suspend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_suspend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: suspend,
    listener: EventHandler[T, suspend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_timeupdate[T /* <: Element | Document | Window */](eventTarget: T, event: timeupdate, listener: EventHandler[T, timeupdate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate[T /* <: Element | Document | Window */](eventTarget: T, event: timeupdate, listener: EventHandler[T, timeupdate], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: timeupdate,
    listener: EventHandler[T, timeupdate],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: timeupdate, listener: EventHandler[T, timeupdate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: timeupdate,
    listener: EventHandler[T, timeupdate],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_timeupdate[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: timeupdate,
    listener: EventHandler[T, timeupdate],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_toggle[T /* <: Element | Document | Window */](eventTarget: T, event: toggle, listener: EventHandler[T, toggle]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle[T /* <: Element | Document | Window */](eventTarget: T, event: toggle, listener: EventHandler[T, toggle], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle[T /* <: Element | Document | Window */](eventTarget: T, event: toggle, listener: EventHandler[T, toggle], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: toggle, listener: EventHandler[T, toggle]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: toggle, listener: EventHandler[T, toggle], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_toggle[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: toggle,
    listener: EventHandler[T, toggle],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_touchcancel[T /* <: Element | Document | Window */](eventTarget: T, event: touchcancel, listener: EventHandler[T, touchcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel[T /* <: Element | Document | Window */](eventTarget: T, event: touchcancel, listener: EventHandler[T, touchcancel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: touchcancel,
    listener: EventHandler[T, touchcancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: touchcancel, listener: EventHandler[T, touchcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchcancel,
    listener: EventHandler[T, touchcancel],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchcancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchcancel,
    listener: EventHandler[T, touchcancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_touchend[T /* <: Element | Document | Window */](eventTarget: T, event: touchend, listener: EventHandler[T, touchend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend[T /* <: Element | Document | Window */](eventTarget: T, event: touchend, listener: EventHandler[T, touchend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: touchend,
    listener: EventHandler[T, touchend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: touchend, listener: EventHandler[T, touchend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchend,
    listener: EventHandler[T, touchend],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchend,
    listener: EventHandler[T, touchend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_touchmove[T /* <: Element | Document | Window */](eventTarget: T, event: touchmove, listener: EventHandler[T, touchmove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove[T /* <: Element | Document | Window */](eventTarget: T, event: touchmove, listener: EventHandler[T, touchmove], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: touchmove,
    listener: EventHandler[T, touchmove],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: touchmove, listener: EventHandler[T, touchmove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchmove,
    listener: EventHandler[T, touchmove],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchmove[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchmove,
    listener: EventHandler[T, touchmove],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_touchstart[T /* <: Element | Document | Window */](eventTarget: T, event: touchstart, listener: EventHandler[T, touchstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart[T /* <: Element | Document | Window */](eventTarget: T, event: touchstart, listener: EventHandler[T, touchstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: touchstart,
    listener: EventHandler[T, touchstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: touchstart, listener: EventHandler[T, touchstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchstart,
    listener: EventHandler[T, touchstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_touchstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: touchstart,
    listener: EventHandler[T, touchstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_transitioncancel[T /* <: Element | Document | Window */](eventTarget: T, event: transitioncancel, listener: EventHandler[T, transitioncancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitioncancel,
    listener: EventHandler[T, transitioncancel],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitioncancel,
    listener: EventHandler[T, transitioncancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: transitioncancel, listener: EventHandler[T, transitioncancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitioncancel,
    listener: EventHandler[T, transitioncancel],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitioncancel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitioncancel,
    listener: EventHandler[T, transitioncancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_transitionend[T /* <: Element | Document | Window */](eventTarget: T, event: transitionend, listener: EventHandler[T, transitionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend[T /* <: Element | Document | Window */](eventTarget: T, event: transitionend, listener: EventHandler[T, transitionend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitionend,
    listener: EventHandler[T, transitionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: transitionend, listener: EventHandler[T, transitionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionend,
    listener: EventHandler[T, transitionend],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionend,
    listener: EventHandler[T, transitionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_transitionrun[T /* <: Element | Document | Window */](eventTarget: T, event: transitionrun, listener: EventHandler[T, transitionrun]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun[T /* <: Element | Document | Window */](eventTarget: T, event: transitionrun, listener: EventHandler[T, transitionrun], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitionrun,
    listener: EventHandler[T, transitionrun],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: transitionrun, listener: EventHandler[T, transitionrun]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionrun,
    listener: EventHandler[T, transitionrun],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionrun[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionrun,
    listener: EventHandler[T, transitionrun],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_transitionstart[T /* <: Element | Document | Window */](eventTarget: T, event: transitionstart, listener: EventHandler[T, transitionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitionstart,
    listener: EventHandler[T, transitionstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: transitionstart,
    listener: EventHandler[T, transitionstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: transitionstart, listener: EventHandler[T, transitionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionstart,
    listener: EventHandler[T, transitionstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_transitionstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: transitionstart,
    listener: EventHandler[T, transitionstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_visibilitychange[T /* <: Element | Document | Window */](eventTarget: T, event: visibilitychange, listener: EventHandler[T, visibilitychange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_visibilitychange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: visibilitychange,
    listener: EventHandler[T, visibilitychange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_visibilitychange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: visibilitychange,
    listener: EventHandler[T, visibilitychange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_visibilitychange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: visibilitychange, listener: EventHandler[T, visibilitychange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_visibilitychange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: visibilitychange,
    listener: EventHandler[T, visibilitychange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_visibilitychange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: visibilitychange,
    listener: EventHandler[T, visibilitychange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_volumechange[T /* <: Element | Document | Window */](eventTarget: T, event: volumechange, listener: EventHandler[T, volumechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange[T /* <: Element | Document | Window */](eventTarget: T, event: volumechange, listener: EventHandler[T, volumechange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: volumechange,
    listener: EventHandler[T, volumechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: volumechange, listener: EventHandler[T, volumechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: volumechange,
    listener: EventHandler[T, volumechange],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_volumechange[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: volumechange,
    listener: EventHandler[T, volumechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_waiting[T /* <: Element | Document | Window */](eventTarget: T, event: waiting, listener: EventHandler[T, waiting]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting[T /* <: Element | Document | Window */](eventTarget: T, event: waiting, listener: EventHandler[T, waiting], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: waiting,
    listener: EventHandler[T, waiting],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: waiting, listener: EventHandler[T, waiting]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: waiting, listener: EventHandler[T, waiting], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_waiting[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: waiting,
    listener: EventHandler[T, waiting],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_webkitanimationend[T /* <: Element | Document | Window */](eventTarget: T, event: webkitanimationend, listener: EventHandler[T, webkitanimationend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkitanimationend,
    listener: EventHandler[T, webkitanimationend],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkitanimationend,
    listener: EventHandler[T, webkitanimationend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationend,
    listener: EventHandler[T, webkitanimationend]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationend,
    listener: EventHandler[T, webkitanimationend],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationend,
    listener: EventHandler[T, webkitanimationend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_webkitanimationiteration[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkitanimationiteration,
    listener: EventHandler[T, webkitanimationiteration]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationiteration[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkitanimationiteration,
    listener: EventHandler[T, webkitanimationiteration],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationiteration[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkitanimationiteration,
    listener: EventHandler[T, webkitanimationiteration],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationiteration,
    listener: EventHandler[T, webkitanimationiteration]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationiteration,
    listener: EventHandler[T, webkitanimationiteration],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationiteration[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationiteration,
    listener: EventHandler[T, webkitanimationiteration],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_webkitanimationstart[T /* <: Element | Document | Window */](eventTarget: T, event: webkitanimationstart, listener: EventHandler[T, webkitanimationstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkitanimationstart,
    listener: EventHandler[T, webkitanimationstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationstart[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkitanimationstart,
    listener: EventHandler[T, webkitanimationstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationstart,
    listener: EventHandler[T, webkitanimationstart]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationstart,
    listener: EventHandler[T, webkitanimationstart],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkitanimationstart[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkitanimationstart,
    listener: EventHandler[T, webkitanimationstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_webkittransitionend[T /* <: Element | Document | Window */](eventTarget: T, event: webkittransitionend, listener: EventHandler[T, webkittransitionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkittransitionend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkittransitionend,
    listener: EventHandler[T, webkittransitionend],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkittransitionend[T /* <: Element | Document | Window */](
    eventTarget: T,
    event: webkittransitionend,
    listener: EventHandler[T, webkittransitionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkittransitionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkittransitionend,
    listener: EventHandler[T, webkittransitionend]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkittransitionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkittransitionend,
    listener: EventHandler[T, webkittransitionend],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_webkittransitionend[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: webkittransitionend,
    listener: EventHandler[T, webkittransitionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventListener_wheel[T /* <: Element | Document | Window */](eventTarget: T, event: wheel, listener: EventHandler[T, wheel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel[T /* <: Element | Document | Window */](eventTarget: T, event: wheel, listener: EventHandler[T, wheel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel[T /* <: Element | Document | Window */](eventTarget: T, event: wheel, listener: EventHandler[T, wheel], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: wheel, listener: EventHandler[T, wheel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel[T /* <: Element | Document | Window */](eventTarget: js.Function0[T], event: wheel, listener: EventHandler[T, wheel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener_wheel[T /* <: Element | Document | Window */](
    eventTarget: js.Function0[T],
    event: wheel,
    listener: EventHandler[T, wheel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_DOMContentLoaded(event: DOMContentLoaded, handler: DocumentEventHandler[DOMContentLoaded]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_DOMContentLoaded(event: DOMContentLoaded, handler: DocumentEventHandler[DOMContentLoaded], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_DOMContentLoaded(
    event: DOMContentLoaded,
    handler: DocumentEventHandler[DOMContentLoaded],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_abort(event: abort, handler: DocumentEventHandler[abort]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_abort(event: abort, handler: DocumentEventHandler[abort], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_abort(event: abort, handler: DocumentEventHandler[abort], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_animationcancel(event: animationcancel, handler: DocumentEventHandler[animationcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_animationcancel(event: animationcancel, handler: DocumentEventHandler[animationcancel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_animationcancel(
    event: animationcancel,
    handler: DocumentEventHandler[animationcancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_animationend(event: animationend, handler: DocumentEventHandler[animationend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_animationend(event: animationend, handler: DocumentEventHandler[animationend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_animationend(event: animationend, handler: DocumentEventHandler[animationend], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_animationiteration(event: animationiteration, handler: DocumentEventHandler[animationiteration]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_animationiteration(event: animationiteration, handler: DocumentEventHandler[animationiteration], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_animationiteration(
    event: animationiteration,
    handler: DocumentEventHandler[animationiteration],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_animationstart(event: animationstart, handler: DocumentEventHandler[animationstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_animationstart(event: animationstart, handler: DocumentEventHandler[animationstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_animationstart(
    event: animationstart,
    handler: DocumentEventHandler[animationstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_auxclick(event: auxclick, handler: DocumentEventHandler[auxclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_auxclick(event: auxclick, handler: DocumentEventHandler[auxclick], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_auxclick(event: auxclick, handler: DocumentEventHandler[auxclick], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_beforeinput(event: beforeinput, handler: DocumentEventHandler[beforeinput]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_beforeinput(event: beforeinput, handler: DocumentEventHandler[beforeinput], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_beforeinput(event: beforeinput, handler: DocumentEventHandler[beforeinput], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_blur(event: blur, handler: DocumentEventHandler[blur]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_blur(event: blur, handler: DocumentEventHandler[blur], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_blur(event: blur, handler: DocumentEventHandler[blur], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_cancel(event: cancel, handler: DocumentEventHandler[cancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_cancel(event: cancel, handler: DocumentEventHandler[cancel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_cancel(event: cancel, handler: DocumentEventHandler[cancel], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_canplay(event: canplay, handler: DocumentEventHandler[canplay]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_canplay(event: canplay, handler: DocumentEventHandler[canplay], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_canplay(event: canplay, handler: DocumentEventHandler[canplay], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_canplaythrough(event: canplaythrough, handler: DocumentEventHandler[canplaythrough]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_canplaythrough(event: canplaythrough, handler: DocumentEventHandler[canplaythrough], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_canplaythrough(
    event: canplaythrough,
    handler: DocumentEventHandler[canplaythrough],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_change(event: change, handler: DocumentEventHandler[change]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_change(event: change, handler: DocumentEventHandler[change], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_change(event: change, handler: DocumentEventHandler[change], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_click(event: click, handler: DocumentEventHandler[click]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_click(event: click, handler: DocumentEventHandler[click], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_click(event: click, handler: DocumentEventHandler[click], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_close(event: close, handler: DocumentEventHandler[close]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_close(event: close, handler: DocumentEventHandler[close], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_close(event: close, handler: DocumentEventHandler[close], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_compositionend(event: compositionend, handler: DocumentEventHandler[compositionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_compositionend(event: compositionend, handler: DocumentEventHandler[compositionend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_compositionend(
    event: compositionend,
    handler: DocumentEventHandler[compositionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_compositionstart(event: compositionstart, handler: DocumentEventHandler[compositionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_compositionstart(event: compositionstart, handler: DocumentEventHandler[compositionstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_compositionstart(
    event: compositionstart,
    handler: DocumentEventHandler[compositionstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_compositionupdate(event: compositionupdate, handler: DocumentEventHandler[compositionupdate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_compositionupdate(event: compositionupdate, handler: DocumentEventHandler[compositionupdate], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_compositionupdate(
    event: compositionupdate,
    handler: DocumentEventHandler[compositionupdate],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_contextmenu(event: contextmenu, handler: DocumentEventHandler[contextmenu]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_contextmenu(event: contextmenu, handler: DocumentEventHandler[contextmenu], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_contextmenu(event: contextmenu, handler: DocumentEventHandler[contextmenu], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_copy(event: copy, handler: DocumentEventHandler[copy]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_copy(event: copy, handler: DocumentEventHandler[copy], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_copy(event: copy, handler: DocumentEventHandler[copy], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_cuechange(event: cuechange, handler: DocumentEventHandler[cuechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_cuechange(event: cuechange, handler: DocumentEventHandler[cuechange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_cuechange(event: cuechange, handler: DocumentEventHandler[cuechange], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_cut(event: cut, handler: DocumentEventHandler[cut]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_cut(event: cut, handler: DocumentEventHandler[cut], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_cut(event: cut, handler: DocumentEventHandler[cut], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_dblclick(event: dblclick, handler: DocumentEventHandler[dblclick]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_dblclick(event: dblclick, handler: DocumentEventHandler[dblclick], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_dblclick(event: dblclick, handler: DocumentEventHandler[dblclick], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_drag(event: drag, handler: DocumentEventHandler[drag]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_drag(event: drag, handler: DocumentEventHandler[drag], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_drag(event: drag, handler: DocumentEventHandler[drag], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_dragend(event: dragend, handler: DocumentEventHandler[dragend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_dragend(event: dragend, handler: DocumentEventHandler[dragend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_dragend(event: dragend, handler: DocumentEventHandler[dragend], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_dragenter(event: dragenter, handler: DocumentEventHandler[dragenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_dragenter(event: dragenter, handler: DocumentEventHandler[dragenter], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_dragenter(event: dragenter, handler: DocumentEventHandler[dragenter], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_dragleave(event: dragleave, handler: DocumentEventHandler[dragleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_dragleave(event: dragleave, handler: DocumentEventHandler[dragleave], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_dragleave(event: dragleave, handler: DocumentEventHandler[dragleave], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_dragover(event: dragover, handler: DocumentEventHandler[dragover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_dragover(event: dragover, handler: DocumentEventHandler[dragover], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_dragover(event: dragover, handler: DocumentEventHandler[dragover], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_dragstart(event: dragstart, handler: DocumentEventHandler[dragstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_dragstart(event: dragstart, handler: DocumentEventHandler[dragstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_dragstart(event: dragstart, handler: DocumentEventHandler[dragstart], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_drop(event: drop, handler: DocumentEventHandler[drop]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_drop(event: drop, handler: DocumentEventHandler[drop], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_drop(event: drop, handler: DocumentEventHandler[drop], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_durationchange(event: durationchange, handler: DocumentEventHandler[durationchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_durationchange(event: durationchange, handler: DocumentEventHandler[durationchange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_durationchange(
    event: durationchange,
    handler: DocumentEventHandler[durationchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_emptied(event: emptied, handler: DocumentEventHandler[emptied]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_emptied(event: emptied, handler: DocumentEventHandler[emptied], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_emptied(event: emptied, handler: DocumentEventHandler[emptied], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_ended(event: ended, handler: DocumentEventHandler[ended]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_ended(event: ended, handler: DocumentEventHandler[ended], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_ended(event: ended, handler: DocumentEventHandler[ended], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_error(event: error, handler: DocumentEventHandler[error]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_error(event: error, handler: DocumentEventHandler[error], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_error(event: error, handler: DocumentEventHandler[error], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_focus(event: focus, handler: DocumentEventHandler[focus]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_focus(event: focus, handler: DocumentEventHandler[focus], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_focus(event: focus, handler: DocumentEventHandler[focus], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_focusin(event: focusin, handler: DocumentEventHandler[focusin]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_focusin(event: focusin, handler: DocumentEventHandler[focusin], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_focusin(event: focusin, handler: DocumentEventHandler[focusin], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_focusout(event: focusout, handler: DocumentEventHandler[focusout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_focusout(event: focusout, handler: DocumentEventHandler[focusout], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_focusout(event: focusout, handler: DocumentEventHandler[focusout], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_formdata(event: formdata, handler: DocumentEventHandler[formdata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_formdata(event: formdata, handler: DocumentEventHandler[formdata], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_formdata(event: formdata, handler: DocumentEventHandler[formdata], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_fullscreenchange(event: fullscreenchange, handler: DocumentEventHandler[fullscreenchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_fullscreenchange(event: fullscreenchange, handler: DocumentEventHandler[fullscreenchange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_fullscreenchange(
    event: fullscreenchange,
    handler: DocumentEventHandler[fullscreenchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_fullscreenerror(event: fullscreenerror, handler: DocumentEventHandler[fullscreenerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_fullscreenerror(event: fullscreenerror, handler: DocumentEventHandler[fullscreenerror], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_fullscreenerror(
    event: fullscreenerror,
    handler: DocumentEventHandler[fullscreenerror],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_gotpointercapture(event: gotpointercapture, handler: DocumentEventHandler[gotpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_gotpointercapture(event: gotpointercapture, handler: DocumentEventHandler[gotpointercapture], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_gotpointercapture(
    event: gotpointercapture,
    handler: DocumentEventHandler[gotpointercapture],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_input(event: input, handler: DocumentEventHandler[input]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_input(event: input, handler: DocumentEventHandler[input], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_input(event: input, handler: DocumentEventHandler[input], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_invalid(event: invalid, handler: DocumentEventHandler[invalid]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_invalid(event: invalid, handler: DocumentEventHandler[invalid], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_invalid(event: invalid, handler: DocumentEventHandler[invalid], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_keydown(event: keydown, handler: DocumentEventHandler[keydown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_keydown(event: keydown, handler: DocumentEventHandler[keydown], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_keydown(event: keydown, handler: DocumentEventHandler[keydown], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_keypress(event: keypress, handler: DocumentEventHandler[keypress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_keypress(event: keypress, handler: DocumentEventHandler[keypress], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_keypress(event: keypress, handler: DocumentEventHandler[keypress], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_keyup(event: keyup, handler: DocumentEventHandler[keyup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_keyup(event: keyup, handler: DocumentEventHandler[keyup], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_keyup(event: keyup, handler: DocumentEventHandler[keyup], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_load(event: load, handler: DocumentEventHandler[load]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_load(event: load, handler: DocumentEventHandler[load], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_load(event: load, handler: DocumentEventHandler[load], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_loadeddata(event: loadeddata, handler: DocumentEventHandler[loadeddata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_loadeddata(event: loadeddata, handler: DocumentEventHandler[loadeddata], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_loadeddata(event: loadeddata, handler: DocumentEventHandler[loadeddata], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_loadedmetadata(event: loadedmetadata, handler: DocumentEventHandler[loadedmetadata]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_loadedmetadata(event: loadedmetadata, handler: DocumentEventHandler[loadedmetadata], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_loadedmetadata(
    event: loadedmetadata,
    handler: DocumentEventHandler[loadedmetadata],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_loadstart(event: loadstart, handler: DocumentEventHandler[loadstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_loadstart(event: loadstart, handler: DocumentEventHandler[loadstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_loadstart(event: loadstart, handler: DocumentEventHandler[loadstart], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_lostpointercapture(event: lostpointercapture, handler: DocumentEventHandler[lostpointercapture]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_lostpointercapture(event: lostpointercapture, handler: DocumentEventHandler[lostpointercapture], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_lostpointercapture(
    event: lostpointercapture,
    handler: DocumentEventHandler[lostpointercapture],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_mousedown(event: mousedown, handler: DocumentEventHandler[mousedown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_mousedown(event: mousedown, handler: DocumentEventHandler[mousedown], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_mousedown(event: mousedown, handler: DocumentEventHandler[mousedown], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_mouseenter(event: mouseenter, handler: DocumentEventHandler[mouseenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_mouseenter(event: mouseenter, handler: DocumentEventHandler[mouseenter], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_mouseenter(event: mouseenter, handler: DocumentEventHandler[mouseenter], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_mouseleave(event: mouseleave, handler: DocumentEventHandler[mouseleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_mouseleave(event: mouseleave, handler: DocumentEventHandler[mouseleave], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_mouseleave(event: mouseleave, handler: DocumentEventHandler[mouseleave], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_mousemove(event: mousemove, handler: DocumentEventHandler[mousemove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_mousemove(event: mousemove, handler: DocumentEventHandler[mousemove], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_mousemove(event: mousemove, handler: DocumentEventHandler[mousemove], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_mouseout(event: mouseout, handler: DocumentEventHandler[mouseout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_mouseout(event: mouseout, handler: DocumentEventHandler[mouseout], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_mouseout(event: mouseout, handler: DocumentEventHandler[mouseout], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_mouseover(event: mouseover, handler: DocumentEventHandler[mouseover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_mouseover(event: mouseover, handler: DocumentEventHandler[mouseover], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_mouseover(event: mouseover, handler: DocumentEventHandler[mouseover], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_mouseup(event: mouseup, handler: DocumentEventHandler[mouseup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_mouseup(event: mouseup, handler: DocumentEventHandler[mouseup], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_mouseup(event: mouseup, handler: DocumentEventHandler[mouseup], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_paste(event: paste, handler: DocumentEventHandler[paste]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_paste(event: paste, handler: DocumentEventHandler[paste], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_paste(event: paste, handler: DocumentEventHandler[paste], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_pause(event: pause, handler: DocumentEventHandler[pause]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pause(event: pause, handler: DocumentEventHandler[pause], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pause(event: pause, handler: DocumentEventHandler[pause], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_play(event: play, handler: DocumentEventHandler[play]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_play(event: play, handler: DocumentEventHandler[play], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_play(event: play, handler: DocumentEventHandler[play], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_playing(event: playing, handler: DocumentEventHandler[playing]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_playing(event: playing, handler: DocumentEventHandler[playing], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_playing(event: playing, handler: DocumentEventHandler[playing], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_pointercancel(event: pointercancel, handler: DocumentEventHandler[pointercancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointercancel(event: pointercancel, handler: DocumentEventHandler[pointercancel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointercancel(
    event: pointercancel,
    handler: DocumentEventHandler[pointercancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_pointerdown(event: pointerdown, handler: DocumentEventHandler[pointerdown]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointerdown(event: pointerdown, handler: DocumentEventHandler[pointerdown], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointerdown(event: pointerdown, handler: DocumentEventHandler[pointerdown], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_pointerenter(event: pointerenter, handler: DocumentEventHandler[pointerenter]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointerenter(event: pointerenter, handler: DocumentEventHandler[pointerenter], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointerenter(event: pointerenter, handler: DocumentEventHandler[pointerenter], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_pointerleave(event: pointerleave, handler: DocumentEventHandler[pointerleave]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointerleave(event: pointerleave, handler: DocumentEventHandler[pointerleave], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointerleave(event: pointerleave, handler: DocumentEventHandler[pointerleave], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_pointerlockchange(event: pointerlockchange, handler: DocumentEventHandler[pointerlockchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointerlockchange(event: pointerlockchange, handler: DocumentEventHandler[pointerlockchange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointerlockchange(
    event: pointerlockchange,
    handler: DocumentEventHandler[pointerlockchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_pointerlockerror(event: pointerlockerror, handler: DocumentEventHandler[pointerlockerror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointerlockerror(event: pointerlockerror, handler: DocumentEventHandler[pointerlockerror], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointerlockerror(
    event: pointerlockerror,
    handler: DocumentEventHandler[pointerlockerror],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_pointermove(event: pointermove, handler: DocumentEventHandler[pointermove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointermove(event: pointermove, handler: DocumentEventHandler[pointermove], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointermove(event: pointermove, handler: DocumentEventHandler[pointermove], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_pointerout(event: pointerout, handler: DocumentEventHandler[pointerout]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointerout(event: pointerout, handler: DocumentEventHandler[pointerout], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointerout(event: pointerout, handler: DocumentEventHandler[pointerout], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_pointerover(event: pointerover, handler: DocumentEventHandler[pointerover]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointerover(event: pointerover, handler: DocumentEventHandler[pointerover], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointerover(event: pointerover, handler: DocumentEventHandler[pointerover], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_pointerup(event: pointerup, handler: DocumentEventHandler[pointerup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointerup(event: pointerup, handler: DocumentEventHandler[pointerup], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_pointerup(event: pointerup, handler: DocumentEventHandler[pointerup], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_progress(event: progress, handler: DocumentEventHandler[progress]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_progress(event: progress, handler: DocumentEventHandler[progress], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_progress(event: progress, handler: DocumentEventHandler[progress], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_ratechange(event: ratechange, handler: DocumentEventHandler[ratechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_ratechange(event: ratechange, handler: DocumentEventHandler[ratechange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_ratechange(event: ratechange, handler: DocumentEventHandler[ratechange], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_readystatechange(event: readystatechange, handler: DocumentEventHandler[readystatechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_readystatechange(event: readystatechange, handler: DocumentEventHandler[readystatechange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_readystatechange(
    event: readystatechange,
    handler: DocumentEventHandler[readystatechange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_reset(event: reset, handler: DocumentEventHandler[reset]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_reset(event: reset, handler: DocumentEventHandler[reset], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_reset(event: reset, handler: DocumentEventHandler[reset], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_resize(event: resize, handler: DocumentEventHandler[resize]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_resize(event: resize, handler: DocumentEventHandler[resize], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_resize(event: resize, handler: DocumentEventHandler[resize], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_scroll(event: scroll, handler: DocumentEventHandler[scroll]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_scroll(event: scroll, handler: DocumentEventHandler[scroll], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_scroll(event: scroll, handler: DocumentEventHandler[scroll], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_securitypolicyviolation(event: securitypolicyviolation, handler: DocumentEventHandler[securitypolicyviolation]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_securitypolicyviolation(
    event: securitypolicyviolation,
    handler: DocumentEventHandler[securitypolicyviolation],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_securitypolicyviolation(
    event: securitypolicyviolation,
    handler: DocumentEventHandler[securitypolicyviolation],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_seeked(event: seeked, handler: DocumentEventHandler[seeked]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_seeked(event: seeked, handler: DocumentEventHandler[seeked], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_seeked(event: seeked, handler: DocumentEventHandler[seeked], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_seeking(event: seeking, handler: DocumentEventHandler[seeking]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_seeking(event: seeking, handler: DocumentEventHandler[seeking], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_seeking(event: seeking, handler: DocumentEventHandler[seeking], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_select(event: select, handler: DocumentEventHandler[select]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_select(event: select, handler: DocumentEventHandler[select], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_select(event: select, handler: DocumentEventHandler[select], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_selectionchange(event: selectionchange, handler: DocumentEventHandler[selectionchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_selectionchange(event: selectionchange, handler: DocumentEventHandler[selectionchange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_selectionchange(
    event: selectionchange,
    handler: DocumentEventHandler[selectionchange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_selectstart(event: selectstart, handler: DocumentEventHandler[selectstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_selectstart(event: selectstart, handler: DocumentEventHandler[selectstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_selectstart(event: selectstart, handler: DocumentEventHandler[selectstart], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_slotchange(event: slotchange, handler: DocumentEventHandler[slotchange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_slotchange(event: slotchange, handler: DocumentEventHandler[slotchange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_slotchange(event: slotchange, handler: DocumentEventHandler[slotchange], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_stalled(event: stalled, handler: DocumentEventHandler[stalled]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_stalled(event: stalled, handler: DocumentEventHandler[stalled], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_stalled(event: stalled, handler: DocumentEventHandler[stalled], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_submit(event: submit, handler: DocumentEventHandler[submit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_submit(event: submit, handler: DocumentEventHandler[submit], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_submit(event: submit, handler: DocumentEventHandler[submit], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_suspend(event: suspend, handler: DocumentEventHandler[suspend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_suspend(event: suspend, handler: DocumentEventHandler[suspend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_suspend(event: suspend, handler: DocumentEventHandler[suspend], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_timeupdate(event: timeupdate, handler: DocumentEventHandler[timeupdate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_timeupdate(event: timeupdate, handler: DocumentEventHandler[timeupdate], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_timeupdate(event: timeupdate, handler: DocumentEventHandler[timeupdate], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_toggle(event: toggle, handler: DocumentEventHandler[toggle]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_toggle(event: toggle, handler: DocumentEventHandler[toggle], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_toggle(event: toggle, handler: DocumentEventHandler[toggle], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_touchcancel(event: touchcancel, handler: DocumentEventHandler[touchcancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_touchcancel(event: touchcancel, handler: DocumentEventHandler[touchcancel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_touchcancel(event: touchcancel, handler: DocumentEventHandler[touchcancel], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_touchend(event: touchend, handler: DocumentEventHandler[touchend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_touchend(event: touchend, handler: DocumentEventHandler[touchend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_touchend(event: touchend, handler: DocumentEventHandler[touchend], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_touchmove(event: touchmove, handler: DocumentEventHandler[touchmove]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_touchmove(event: touchmove, handler: DocumentEventHandler[touchmove], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_touchmove(event: touchmove, handler: DocumentEventHandler[touchmove], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_touchstart(event: touchstart, handler: DocumentEventHandler[touchstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_touchstart(event: touchstart, handler: DocumentEventHandler[touchstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_touchstart(event: touchstart, handler: DocumentEventHandler[touchstart], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_transitioncancel(event: transitioncancel, handler: DocumentEventHandler[transitioncancel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_transitioncancel(event: transitioncancel, handler: DocumentEventHandler[transitioncancel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_transitioncancel(
    event: transitioncancel,
    handler: DocumentEventHandler[transitioncancel],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_transitionend(event: transitionend, handler: DocumentEventHandler[transitionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_transitionend(event: transitionend, handler: DocumentEventHandler[transitionend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_transitionend(
    event: transitionend,
    handler: DocumentEventHandler[transitionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_transitionrun(event: transitionrun, handler: DocumentEventHandler[transitionrun]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_transitionrun(event: transitionrun, handler: DocumentEventHandler[transitionrun], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_transitionrun(
    event: transitionrun,
    handler: DocumentEventHandler[transitionrun],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_transitionstart(event: transitionstart, handler: DocumentEventHandler[transitionstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_transitionstart(event: transitionstart, handler: DocumentEventHandler[transitionstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_transitionstart(
    event: transitionstart,
    handler: DocumentEventHandler[transitionstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_visibilitychange(event: visibilitychange, handler: DocumentEventHandler[visibilitychange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_visibilitychange(event: visibilitychange, handler: DocumentEventHandler[visibilitychange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_visibilitychange(
    event: visibilitychange,
    handler: DocumentEventHandler[visibilitychange],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_volumechange(event: volumechange, handler: DocumentEventHandler[volumechange]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_volumechange(event: volumechange, handler: DocumentEventHandler[volumechange], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_volumechange(event: volumechange, handler: DocumentEventHandler[volumechange], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_waiting(event: waiting, handler: DocumentEventHandler[waiting]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_waiting(event: waiting, handler: DocumentEventHandler[waiting], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_waiting(event: waiting, handler: DocumentEventHandler[waiting], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_webkitanimationend(event: webkitanimationend, handler: DocumentEventHandler[webkitanimationend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_webkitanimationend(event: webkitanimationend, handler: DocumentEventHandler[webkitanimationend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_webkitanimationend(
    event: webkitanimationend,
    handler: DocumentEventHandler[webkitanimationend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_webkitanimationiteration(event: webkitanimationiteration, handler: DocumentEventHandler[webkitanimationiteration]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_webkitanimationiteration(
    event: webkitanimationiteration,
    handler: DocumentEventHandler[webkitanimationiteration],
    capture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_webkitanimationiteration(
    event: webkitanimationiteration,
    handler: DocumentEventHandler[webkitanimationiteration],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_webkitanimationstart(event: webkitanimationstart, handler: DocumentEventHandler[webkitanimationstart]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_webkitanimationstart(event: webkitanimationstart, handler: DocumentEventHandler[webkitanimationstart], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_webkitanimationstart(
    event: webkitanimationstart,
    handler: DocumentEventHandler[webkitanimationstart],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_webkittransitionend(event: webkittransitionend, handler: DocumentEventHandler[webkittransitionend]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_webkittransitionend(event: webkittransitionend, handler: DocumentEventHandler[webkittransitionend], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_webkittransitionend(
    event: webkittransitionend,
    handler: DocumentEventHandler[webkittransitionend],
    capture: AddEventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useGlobalListener_wheel(event: wheel, handler: DocumentEventHandler[wheel]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_wheel(event: wheel, handler: DocumentEventHandler[wheel], capture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useGlobalListener_wheel(event: wheel, handler: DocumentEventHandler[wheel], capture: AddEventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useGlobalListener")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], capture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useImage(): State = ^.asInstanceOf[js.Dynamic].applyDynamic("useImage")().asInstanceOf[State]
  inline def useImage(imageOrUrl: String): State = ^.asInstanceOf[js.Dynamic].applyDynamic("useImage")(imageOrUrl.asInstanceOf[js.Any]).asInstanceOf[State]
  inline def useImage(imageOrUrl: String, crossOrigin: anonymous | `use-credentials`): State = (^.asInstanceOf[js.Dynamic].applyDynamic("useImage")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def useImage(imageOrUrl: String, crossOrigin: String): State = (^.asInstanceOf[js.Dynamic].applyDynamic("useImage")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def useImage(imageOrUrl: Null, crossOrigin: anonymous | `use-credentials`): State = (^.asInstanceOf[js.Dynamic].applyDynamic("useImage")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def useImage(imageOrUrl: Null, crossOrigin: String): State = (^.asInstanceOf[js.Dynamic].applyDynamic("useImage")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def useImage(imageOrUrl: Unit, crossOrigin: anonymous | `use-credentials`): State = (^.asInstanceOf[js.Dynamic].applyDynamic("useImage")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def useImage(imageOrUrl: Unit, crossOrigin: String): State = (^.asInstanceOf[js.Dynamic].applyDynamic("useImage")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def useImage(imageOrUrl: HTMLImageElement): State = ^.asInstanceOf[js.Dynamic].applyDynamic("useImage")(imageOrUrl.asInstanceOf[js.Any]).asInstanceOf[State]
  inline def useImage(imageOrUrl: HTMLImageElement, crossOrigin: anonymous | `use-credentials`): State = (^.asInstanceOf[js.Dynamic].applyDynamic("useImage")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  inline def useImage(imageOrUrl: HTMLImageElement, crossOrigin: String): State = (^.asInstanceOf[js.Dynamic].applyDynamic("useImage")(imageOrUrl.asInstanceOf[js.Any], crossOrigin.asInstanceOf[js.Any])).asInstanceOf[State]
  
  inline def useInterval(fn: js.Function0[Unit], ms: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
  inline def useInterval(fn: js.Function0[Unit], ms: Double, paused: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], paused.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
  inline def useInterval(fn: js.Function0[Unit], ms: Double, paused: Boolean, runImmediately: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], paused.asInstanceOf[js.Any], runImmediately.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useMergeState[TState /* <: js.Object */](initialState: TState): js.Tuple2[TState, MergeStateSetter[TState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergeState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TState, MergeStateSetter[TState]]]
  inline def useMergeState[TState /* <: js.Object */](initialState: js.Function0[TState]): js.Tuple2[TState, MergeStateSetter[TState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergeState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TState, MergeStateSetter[TState]]]
  
  inline def useMergeStateFromProps[TProps, TState](props: TProps, gDSFP: Mapper[TProps, TState], initialState: TState): js.Tuple2[TState, MergeStateSetter[TState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMergeStateFromProps")(props.asInstanceOf[js.Any], gDSFP.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TState, MergeStateSetter[TState]]]
  
  inline def useMounted(): js.Function0[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMounted")().asInstanceOf[js.Function0[Boolean]]
  
  inline def usePrevious[T](value: T): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("usePrevious")(value.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  
  inline def useRafInterval(fn: js.Function0[Unit], ms: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRafInterval")(fn.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useResizeObserver[TElement /* <: Element */](): Rect | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")().asInstanceOf[Rect | Null]
  inline def useResizeObserver[TElement /* <: Element */](element: TElement): Rect | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(element.asInstanceOf[js.Any]).asInstanceOf[Rect | Null]
}
