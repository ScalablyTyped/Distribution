package typings.railsUjs

import typings.railsUjs.ajaxMod.AjaxOptions
import typings.railsUjs.domMod.SelectorObject
import typings.railsUjs.railsUjsStrings.abort
import typings.railsUjs.railsUjsStrings.animationcancel
import typings.railsUjs.railsUjsStrings.animationend
import typings.railsUjs.railsUjsStrings.animationiteration
import typings.railsUjs.railsUjsStrings.animationstart
import typings.railsUjs.railsUjsStrings.auxclick
import typings.railsUjs.railsUjsStrings.blur
import typings.railsUjs.railsUjsStrings.cancel
import typings.railsUjs.railsUjsStrings.canplay
import typings.railsUjs.railsUjsStrings.canplaythrough
import typings.railsUjs.railsUjsStrings.change
import typings.railsUjs.railsUjsStrings.click
import typings.railsUjs.railsUjsStrings.close
import typings.railsUjs.railsUjsStrings.contextmenu
import typings.railsUjs.railsUjsStrings.copy
import typings.railsUjs.railsUjsStrings.cuechange
import typings.railsUjs.railsUjsStrings.cut
import typings.railsUjs.railsUjsStrings.dblclick
import typings.railsUjs.railsUjsStrings.drag
import typings.railsUjs.railsUjsStrings.dragend
import typings.railsUjs.railsUjsStrings.dragenter
import typings.railsUjs.railsUjsStrings.dragexit
import typings.railsUjs.railsUjsStrings.dragleave
import typings.railsUjs.railsUjsStrings.dragover
import typings.railsUjs.railsUjsStrings.dragstart
import typings.railsUjs.railsUjsStrings.drop
import typings.railsUjs.railsUjsStrings.durationchange
import typings.railsUjs.railsUjsStrings.emptied
import typings.railsUjs.railsUjsStrings.ended
import typings.railsUjs.railsUjsStrings.error
import typings.railsUjs.railsUjsStrings.focus
import typings.railsUjs.railsUjsStrings.focusin
import typings.railsUjs.railsUjsStrings.focusout
import typings.railsUjs.railsUjsStrings.fullscreenchange
import typings.railsUjs.railsUjsStrings.fullscreenerror
import typings.railsUjs.railsUjsStrings.gotpointercapture
import typings.railsUjs.railsUjsStrings.input
import typings.railsUjs.railsUjsStrings.invalid
import typings.railsUjs.railsUjsStrings.keydown
import typings.railsUjs.railsUjsStrings.keypress
import typings.railsUjs.railsUjsStrings.keyup
import typings.railsUjs.railsUjsStrings.load
import typings.railsUjs.railsUjsStrings.loadeddata
import typings.railsUjs.railsUjsStrings.loadedmetadata
import typings.railsUjs.railsUjsStrings.loadstart
import typings.railsUjs.railsUjsStrings.lostpointercapture
import typings.railsUjs.railsUjsStrings.mousedown
import typings.railsUjs.railsUjsStrings.mouseenter
import typings.railsUjs.railsUjsStrings.mouseleave
import typings.railsUjs.railsUjsStrings.mousemove
import typings.railsUjs.railsUjsStrings.mouseout
import typings.railsUjs.railsUjsStrings.mouseover
import typings.railsUjs.railsUjsStrings.mouseup
import typings.railsUjs.railsUjsStrings.paste
import typings.railsUjs.railsUjsStrings.pause
import typings.railsUjs.railsUjsStrings.play
import typings.railsUjs.railsUjsStrings.playing
import typings.railsUjs.railsUjsStrings.pointercancel
import typings.railsUjs.railsUjsStrings.pointerdown
import typings.railsUjs.railsUjsStrings.pointerenter
import typings.railsUjs.railsUjsStrings.pointerleave
import typings.railsUjs.railsUjsStrings.pointermove
import typings.railsUjs.railsUjsStrings.pointerout
import typings.railsUjs.railsUjsStrings.pointerover
import typings.railsUjs.railsUjsStrings.pointerup
import typings.railsUjs.railsUjsStrings.progress
import typings.railsUjs.railsUjsStrings.ratechange
import typings.railsUjs.railsUjsStrings.reset
import typings.railsUjs.railsUjsStrings.resize
import typings.railsUjs.railsUjsStrings.scroll
import typings.railsUjs.railsUjsStrings.securitypolicyviolation
import typings.railsUjs.railsUjsStrings.seeked
import typings.railsUjs.railsUjsStrings.seeking
import typings.railsUjs.railsUjsStrings.select
import typings.railsUjs.railsUjsStrings.selectionchange
import typings.railsUjs.railsUjsStrings.selectstart
import typings.railsUjs.railsUjsStrings.stalled
import typings.railsUjs.railsUjsStrings.submit
import typings.railsUjs.railsUjsStrings.suspend
import typings.railsUjs.railsUjsStrings.timeupdate
import typings.railsUjs.railsUjsStrings.toggle
import typings.railsUjs.railsUjsStrings.touchcancel
import typings.railsUjs.railsUjsStrings.touchend
import typings.railsUjs.railsUjsStrings.touchmove
import typings.railsUjs.railsUjsStrings.touchstart
import typings.railsUjs.railsUjsStrings.transitioncancel
import typings.railsUjs.railsUjsStrings.transitionend
import typings.railsUjs.railsUjsStrings.transitionrun
import typings.railsUjs.railsUjsStrings.transitionstart
import typings.railsUjs.railsUjsStrings.volumechange
import typings.railsUjs.railsUjsStrings.waiting
import typings.railsUjs.railsUjsStrings.wheel
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.Element
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventListener
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rails/ujs", "CSRFProtection")
  @js.native
  def CSRFProtection(xhr: XMLHttpRequest): Unit = js.native
  
  @JSImport("@rails/ujs", "$")
  @js.native
  def _empty(selector: String): js.Array[Element] = js.native
  
  @JSImport("@rails/ujs", "ajax")
  @js.native
  def ajax(options: AjaxOptions): Unit = js.native
  
  @JSImport("@rails/ujs", "buttonClickSelector")
  @js.native
  val buttonClickSelector: SelectorObject = js.native
  
  @JSImport("@rails/ujs", "buttonDisableSelector")
  @js.native
  val buttonDisableSelector: String = js.native
  
  @JSImport("@rails/ujs", "confirm")
  @js.native
  def confirm(message: String): Boolean = js.native
  @JSImport("@rails/ujs", "confirm")
  @js.native
  def confirm(message: String, element: Element): Boolean = js.native
  
  @JSImport("@rails/ujs", "cspNonce")
  @js.native
  def cspNonce(): js.UndefOr[String] = js.native
  
  @JSImport("@rails/ujs", "csrfParam")
  @js.native
  def csrfParam(): String | Null = js.native
  
  @JSImport("@rails/ujs", "csrfToken")
  @js.native
  def csrfToken(): String | Null = js.native
  
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate(element: EventTarget, selector: String, eventType: String, handler: EventListener): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate(element: EventTarget, selector: SelectorObject, eventType: String, handler: EventListener): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_abort(
    element: EventTarget,
    selector: String,
    eventType: abort,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_abort(
    element: EventTarget,
    selector: SelectorObject,
    eventType: abort,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_animationcancel(
    element: EventTarget,
    selector: String,
    eventType: animationcancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_animationcancel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: animationcancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_animationend(
    element: EventTarget,
    selector: String,
    eventType: animationend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_animationend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: animationend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_animationiteration(
    element: EventTarget,
    selector: String,
    eventType: animationiteration,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_animationiteration(
    element: EventTarget,
    selector: SelectorObject,
    eventType: animationiteration,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_animationstart(
    element: EventTarget,
    selector: String,
    eventType: animationstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_animationstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: animationstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_auxclick(
    element: EventTarget,
    selector: String,
    eventType: auxclick,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_auxclick(
    element: EventTarget,
    selector: SelectorObject,
    eventType: auxclick,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_blur(
    element: EventTarget,
    selector: String,
    eventType: blur,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_blur(
    element: EventTarget,
    selector: SelectorObject,
    eventType: blur,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_cancel(
    element: EventTarget,
    selector: String,
    eventType: cancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_cancel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: cancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_canplay(
    element: EventTarget,
    selector: String,
    eventType: canplay,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_canplay(
    element: EventTarget,
    selector: SelectorObject,
    eventType: canplay,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_canplaythrough(
    element: EventTarget,
    selector: String,
    eventType: canplaythrough,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_canplaythrough(
    element: EventTarget,
    selector: SelectorObject,
    eventType: canplaythrough,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_change(
    element: EventTarget,
    selector: String,
    eventType: change,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_change(
    element: EventTarget,
    selector: SelectorObject,
    eventType: change,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_click(
    element: EventTarget,
    selector: String,
    eventType: click,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_click(
    element: EventTarget,
    selector: SelectorObject,
    eventType: click,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_close(
    element: EventTarget,
    selector: String,
    eventType: close,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_close(
    element: EventTarget,
    selector: SelectorObject,
    eventType: close,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_contextmenu(
    element: EventTarget,
    selector: String,
    eventType: contextmenu,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_contextmenu(
    element: EventTarget,
    selector: SelectorObject,
    eventType: contextmenu,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_copy(
    element: EventTarget,
    selector: String,
    eventType: copy,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_copy(
    element: EventTarget,
    selector: SelectorObject,
    eventType: copy,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_cuechange(
    element: EventTarget,
    selector: String,
    eventType: cuechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_cuechange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: cuechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_cut(
    element: EventTarget,
    selector: String,
    eventType: cut,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_cut(
    element: EventTarget,
    selector: SelectorObject,
    eventType: cut,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_dblclick(
    element: EventTarget,
    selector: String,
    eventType: dblclick,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_dblclick(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dblclick,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_drag(
    element: EventTarget,
    selector: String,
    eventType: drag,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_drag(
    element: EventTarget,
    selector: SelectorObject,
    eventType: drag,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_dragend(
    element: EventTarget,
    selector: String,
    eventType: dragend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_dragend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_dragenter(
    element: EventTarget,
    selector: String,
    eventType: dragenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_dragenter(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_dragexit(
    element: EventTarget,
    selector: String,
    eventType: dragexit,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_dragexit(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragexit,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_dragleave(
    element: EventTarget,
    selector: String,
    eventType: dragleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_dragleave(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_dragover(
    element: EventTarget,
    selector: String,
    eventType: dragover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_dragover(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_dragstart(
    element: EventTarget,
    selector: String,
    eventType: dragstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_dragstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: dragstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_drop(
    element: EventTarget,
    selector: String,
    eventType: drop,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_drop(
    element: EventTarget,
    selector: SelectorObject,
    eventType: drop,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_durationchange(
    element: EventTarget,
    selector: String,
    eventType: durationchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_durationchange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: durationchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_emptied(
    element: EventTarget,
    selector: String,
    eventType: emptied,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_emptied(
    element: EventTarget,
    selector: SelectorObject,
    eventType: emptied,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_ended(
    element: EventTarget,
    selector: String,
    eventType: ended,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_ended(
    element: EventTarget,
    selector: SelectorObject,
    eventType: ended,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_error(
    element: EventTarget,
    selector: String,
    eventType: error,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_error(
    element: EventTarget,
    selector: SelectorObject,
    eventType: error,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_focus(
    element: EventTarget,
    selector: String,
    eventType: focus,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_focus(
    element: EventTarget,
    selector: SelectorObject,
    eventType: focus,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_focusin(
    element: EventTarget,
    selector: String,
    eventType: focusin,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_focusin(
    element: EventTarget,
    selector: SelectorObject,
    eventType: focusin,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_focusout(
    element: EventTarget,
    selector: String,
    eventType: focusout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_focusout(
    element: EventTarget,
    selector: SelectorObject,
    eventType: focusout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_fullscreenchange(
    element: EventTarget,
    selector: String,
    eventType: fullscreenchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_fullscreenchange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: fullscreenchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_fullscreenerror(
    element: EventTarget,
    selector: String,
    eventType: fullscreenerror,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_fullscreenerror(
    element: EventTarget,
    selector: SelectorObject,
    eventType: fullscreenerror,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_gotpointercapture(
    element: EventTarget,
    selector: String,
    eventType: gotpointercapture,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_gotpointercapture(
    element: EventTarget,
    selector: SelectorObject,
    eventType: gotpointercapture,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_input(
    element: EventTarget,
    selector: String,
    eventType: input,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_input(
    element: EventTarget,
    selector: SelectorObject,
    eventType: input,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_invalid(
    element: EventTarget,
    selector: String,
    eventType: invalid,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_invalid(
    element: EventTarget,
    selector: SelectorObject,
    eventType: invalid,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_keydown(
    element: EventTarget,
    selector: String,
    eventType: keydown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_keydown(
    element: EventTarget,
    selector: SelectorObject,
    eventType: keydown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_keypress(
    element: EventTarget,
    selector: String,
    eventType: keypress,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_keypress(
    element: EventTarget,
    selector: SelectorObject,
    eventType: keypress,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_keyup(
    element: EventTarget,
    selector: String,
    eventType: keyup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_keyup(
    element: EventTarget,
    selector: SelectorObject,
    eventType: keyup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_load(
    element: EventTarget,
    selector: String,
    eventType: load,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_load(
    element: EventTarget,
    selector: SelectorObject,
    eventType: load,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_loadeddata(
    element: EventTarget,
    selector: String,
    eventType: loadeddata,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_loadeddata(
    element: EventTarget,
    selector: SelectorObject,
    eventType: loadeddata,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_loadedmetadata(
    element: EventTarget,
    selector: String,
    eventType: loadedmetadata,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_loadedmetadata(
    element: EventTarget,
    selector: SelectorObject,
    eventType: loadedmetadata,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_loadstart(
    element: EventTarget,
    selector: String,
    eventType: loadstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_loadstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: loadstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_lostpointercapture(
    element: EventTarget,
    selector: String,
    eventType: lostpointercapture,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_lostpointercapture(
    element: EventTarget,
    selector: SelectorObject,
    eventType: lostpointercapture,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_mousedown(
    element: EventTarget,
    selector: String,
    eventType: mousedown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_mousedown(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mousedown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_mouseenter(
    element: EventTarget,
    selector: String,
    eventType: mouseenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_mouseenter(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mouseenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_mouseleave(
    element: EventTarget,
    selector: String,
    eventType: mouseleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_mouseleave(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mouseleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_mousemove(
    element: EventTarget,
    selector: String,
    eventType: mousemove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_mousemove(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mousemove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_mouseout(
    element: EventTarget,
    selector: String,
    eventType: mouseout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_mouseout(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mouseout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_mouseover(
    element: EventTarget,
    selector: String,
    eventType: mouseover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_mouseover(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mouseover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_mouseup(
    element: EventTarget,
    selector: String,
    eventType: mouseup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_mouseup(
    element: EventTarget,
    selector: SelectorObject,
    eventType: mouseup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_paste(
    element: EventTarget,
    selector: String,
    eventType: paste,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_paste(
    element: EventTarget,
    selector: SelectorObject,
    eventType: paste,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pause(
    element: EventTarget,
    selector: String,
    eventType: pause,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pause(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pause,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_play(
    element: EventTarget,
    selector: String,
    eventType: play,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_play(
    element: EventTarget,
    selector: SelectorObject,
    eventType: play,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_playing(
    element: EventTarget,
    selector: String,
    eventType: playing,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_playing(
    element: EventTarget,
    selector: SelectorObject,
    eventType: playing,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pointercancel(
    element: EventTarget,
    selector: String,
    eventType: pointercancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pointercancel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointercancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pointerdown(
    element: EventTarget,
    selector: String,
    eventType: pointerdown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pointerdown(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerdown,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pointerenter(
    element: EventTarget,
    selector: String,
    eventType: pointerenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pointerenter(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerenter,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pointerleave(
    element: EventTarget,
    selector: String,
    eventType: pointerleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pointerleave(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerleave,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pointermove(
    element: EventTarget,
    selector: String,
    eventType: pointermove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pointermove(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointermove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pointerout(
    element: EventTarget,
    selector: String,
    eventType: pointerout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pointerout(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerout,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pointerover(
    element: EventTarget,
    selector: String,
    eventType: pointerover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pointerover(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerover,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pointerup(
    element: EventTarget,
    selector: String,
    eventType: pointerup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_pointerup(
    element: EventTarget,
    selector: SelectorObject,
    eventType: pointerup,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_progress(
    element: EventTarget,
    selector: String,
    eventType: progress,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent[EventTarget], _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_progress(
    element: EventTarget,
    selector: SelectorObject,
    eventType: progress,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent[EventTarget], _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_ratechange(
    element: EventTarget,
    selector: String,
    eventType: ratechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_ratechange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: ratechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_reset(
    element: EventTarget,
    selector: String,
    eventType: reset,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_reset(
    element: EventTarget,
    selector: SelectorObject,
    eventType: reset,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_resize(
    element: EventTarget,
    selector: String,
    eventType: resize,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_resize(
    element: EventTarget,
    selector: SelectorObject,
    eventType: resize,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_scroll(
    element: EventTarget,
    selector: String,
    eventType: scroll,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_scroll(
    element: EventTarget,
    selector: SelectorObject,
    eventType: scroll,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_securitypolicyviolation(
    element: EventTarget,
    selector: String,
    eventType: securitypolicyviolation,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_securitypolicyviolation(
    element: EventTarget,
    selector: SelectorObject,
    eventType: securitypolicyviolation,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_seeked(
    element: EventTarget,
    selector: String,
    eventType: seeked,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_seeked(
    element: EventTarget,
    selector: SelectorObject,
    eventType: seeked,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_seeking(
    element: EventTarget,
    selector: String,
    eventType: seeking,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_seeking(
    element: EventTarget,
    selector: SelectorObject,
    eventType: seeking,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_select(
    element: EventTarget,
    selector: String,
    eventType: select,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_select(
    element: EventTarget,
    selector: SelectorObject,
    eventType: select,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_selectionchange(
    element: EventTarget,
    selector: String,
    eventType: selectionchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_selectionchange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: selectionchange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_selectstart(
    element: EventTarget,
    selector: String,
    eventType: selectstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_selectstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: selectstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_stalled(
    element: EventTarget,
    selector: String,
    eventType: stalled,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_stalled(
    element: EventTarget,
    selector: SelectorObject,
    eventType: stalled,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_submit(
    element: EventTarget,
    selector: String,
    eventType: submit,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_submit(
    element: EventTarget,
    selector: SelectorObject,
    eventType: submit,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_suspend(
    element: EventTarget,
    selector: String,
    eventType: suspend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_suspend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: suspend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_timeupdate(
    element: EventTarget,
    selector: String,
    eventType: timeupdate,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_timeupdate(
    element: EventTarget,
    selector: SelectorObject,
    eventType: timeupdate,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_toggle(
    element: EventTarget,
    selector: String,
    eventType: toggle,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_toggle(
    element: EventTarget,
    selector: SelectorObject,
    eventType: toggle,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_touchcancel(
    element: EventTarget,
    selector: String,
    eventType: touchcancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_touchcancel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: touchcancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_touchend(
    element: EventTarget,
    selector: String,
    eventType: touchend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_touchend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: touchend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_touchmove(
    element: EventTarget,
    selector: String,
    eventType: touchmove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_touchmove(
    element: EventTarget,
    selector: SelectorObject,
    eventType: touchmove,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_touchstart(
    element: EventTarget,
    selector: String,
    eventType: touchstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_touchstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: touchstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_transitioncancel(
    element: EventTarget,
    selector: String,
    eventType: transitioncancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_transitioncancel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: transitioncancel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_transitionend(
    element: EventTarget,
    selector: String,
    eventType: transitionend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_transitionend(
    element: EventTarget,
    selector: SelectorObject,
    eventType: transitionend,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_transitionrun(
    element: EventTarget,
    selector: String,
    eventType: transitionrun,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_transitionrun(
    element: EventTarget,
    selector: SelectorObject,
    eventType: transitionrun,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_transitionstart(
    element: EventTarget,
    selector: String,
    eventType: transitionstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_transitionstart(
    element: EventTarget,
    selector: SelectorObject,
    eventType: transitionstart,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_volumechange(
    element: EventTarget,
    selector: String,
    eventType: volumechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_volumechange(
    element: EventTarget,
    selector: SelectorObject,
    eventType: volumechange,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_waiting(
    element: EventTarget,
    selector: String,
    eventType: waiting,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_waiting(
    element: EventTarget,
    selector: SelectorObject,
    eventType: waiting,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_wheel(
    element: EventTarget,
    selector: String,
    eventType: wheel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _]
  ): Unit = js.native
  @JSImport("@rails/ujs", "delegate")
  @js.native
  def delegate_wheel(
    element: EventTarget,
    selector: SelectorObject,
    eventType: wheel,
    handler: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _]
  ): Unit = js.native
  
  @JSImport("@rails/ujs", "disableElement")
  @js.native
  def disableElement(e: Element): Unit = js.native
  @JSImport("@rails/ujs", "disableElement")
  @js.native
  def disableElement(e: Event): Unit = js.native
  
  @JSImport("@rails/ujs", "enableElement")
  @js.native
  def enableElement(e: Element): Unit = js.native
  @JSImport("@rails/ujs", "enableElement")
  @js.native
  def enableElement(e: Event): Unit = js.native
  
  @JSImport("@rails/ujs", "fileInputSelector")
  @js.native
  val fileInputSelector: String = js.native
  
  @JSImport("@rails/ujs", "fire")
  @js.native
  def fire(obj: EventTarget, name: String): Boolean = js.native
  @JSImport("@rails/ujs", "fire")
  @js.native
  def fire(obj: EventTarget, name: String, data: js.Any): Boolean = js.native
  
  @JSImport("@rails/ujs", "formDisableSelector")
  @js.native
  val formDisableSelector: String = js.native
  
  @JSImport("@rails/ujs", "formElements")
  @js.native
  def formElements(form: Element, selector: String): js.Array[HTMLElement] = js.native
  
  @JSImport("@rails/ujs", "formEnableSelector")
  @js.native
  val formEnableSelector: String = js.native
  
  @JSImport("@rails/ujs", "formInputClickSelector")
  @js.native
  val formInputClickSelector: String = js.native
  
  @JSImport("@rails/ujs", "formSubmitButtonClick")
  @js.native
  def formSubmitButtonClick(e: Event): Unit = js.native
  
  @JSImport("@rails/ujs", "formSubmitSelector")
  @js.native
  val formSubmitSelector: String = js.native
  
  @JSImport("@rails/ujs", "getData")
  @js.native
  def getData(element: Element, key: String): js.Any = js.native
  
  @JSImport("@rails/ujs", "handleConfirm")
  @js.native
  def handleConfirm(e: Event): Unit = js.native
  
  @JSImport("@rails/ujs", "handleDisabledElement")
  @js.native
  def handleDisabledElement(e: Event): Unit = js.native
  
  @JSImport("@rails/ujs", "handleMethod")
  @js.native
  def handleMethod(e: Event): Unit = js.native
  
  @JSImport("@rails/ujs", "handleRemote")
  @js.native
  def handleRemote(e: Event): Unit = js.native
  
  @JSImport("@rails/ujs", "href")
  @js.native
  def href(element: HTMLElement): js.UndefOr[String] = js.native
  
  @JSImport("@rails/ujs", "inputChangeSelector")
  @js.native
  val inputChangeSelector: String = js.native
  
  @JSImport("@rails/ujs", "isCrossDomain")
  @js.native
  def isCrossDomain(url: String): Boolean = js.native
  
  @JSImport("@rails/ujs", "linkClickSelector")
  @js.native
  val linkClickSelector: String = js.native
  
  @JSImport("@rails/ujs", "linkDisableSelector")
  @js.native
  val linkDisableSelector: String = js.native
  
  @JSImport("@rails/ujs", "loadCSPNonce")
  @js.native
  def loadCSPNonce(): js.UndefOr[String] = js.native
  
  @JSImport("@rails/ujs", "matches")
  @js.native
  def matches(element: Element, selector: String): Boolean = js.native
  @JSImport("@rails/ujs", "matches")
  @js.native
  def matches(element: Element, selector: SelectorObject): Boolean = js.native
  
  @JSImport("@rails/ujs", "preventInsignificantClick")
  @js.native
  def preventInsignificantClick(e: Event): Unit = js.native
  
  @JSImport("@rails/ujs", "refreshCSRFTokens")
  @js.native
  def refreshCSRFTokens(): Unit = js.native
  
  @JSImport("@rails/ujs", "serializeElement")
  @js.native
  def serializeElement(element: Element, additionalParam: js.Any): String = js.native
  
  @JSImport("@rails/ujs", "setData")
  @js.native
  def setData(element: Element, key: String, value: js.Any): Unit = js.native
  
  @JSImport("@rails/ujs", "start")
  @js.native
  def start(): Unit = js.native
  
  @JSImport("@rails/ujs", "stopEverything")
  @js.native
  def stopEverything(e: Event): Unit = js.native
}
