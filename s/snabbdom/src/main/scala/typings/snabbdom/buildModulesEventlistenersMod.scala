package typings.snabbdom

import org.scalablytyped.runtime.StringDictionary
import typings.snabbdom.buildModulesModuleMod.Module
import typings.snabbdom.buildVnodeMod.VNode_
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.InputEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildModulesEventlistenersMod {
  
  @JSImport("snabbdom/build/modules/eventlisteners", "eventListenersModule")
  @js.native
  val eventListenersModule: Module = js.native
  
  type Listener[T] = js.ThisFunction2[/* this */ VNode_, /* ev */ T, /* vnode */ VNode_, Unit]
  
  /* Inlined {[ N in keyof std.HTMLElementEventMap ]:? snabbdom.snabbdom/build/modules/eventlisteners.Listener<std.HTMLElementEventMap[N]> | std.Array<snabbdom.snabbdom/build/modules/eventlisteners.Listener<std.HTMLElementEventMap[N]>>} & {[event: string] : snabbdom.snabbdom/build/modules/eventlisteners.Listener<any> | std.Array<snabbdom.snabbdom/build/modules/eventlisteners.Listener<any>>} */
  trait On
    extends StObject
       with /* event */ StringDictionary[Listener[Any] | js.Array[Listener[Any]]] {
    
    var abort: js.UndefOr[Listener[UIEvent] | js.Array[Listener[UIEvent]]] = js.undefined
    
    var animationcancel: js.UndefOr[Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]] = js.undefined
    
    var animationend: js.UndefOr[Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]] = js.undefined
    
    var animationiteration: js.UndefOr[Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]] = js.undefined
    
    var animationstart: js.UndefOr[Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]] = js.undefined
    
    var auxclick: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.undefined
    
    var beforeinput: js.UndefOr[Listener[InputEvent] | js.Array[Listener[InputEvent]]] = js.undefined
    
    var blur: js.UndefOr[Listener[FocusEvent] | js.Array[Listener[FocusEvent]]] = js.undefined
    
    var cancel: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var canplay: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var canplaythrough: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var change: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var click: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.undefined
    
    var close: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var compositionend: js.UndefOr[Listener[CompositionEvent] | js.Array[Listener[CompositionEvent]]] = js.undefined
    
    var compositionstart: js.UndefOr[Listener[CompositionEvent] | js.Array[Listener[CompositionEvent]]] = js.undefined
    
    var compositionupdate: js.UndefOr[Listener[CompositionEvent] | js.Array[Listener[CompositionEvent]]] = js.undefined
    
    var contextmenu: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.undefined
    
    var copy: js.UndefOr[Listener[ClipboardEvent] | js.Array[Listener[ClipboardEvent]]] = js.undefined
    
    var cuechange: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var cut: js.UndefOr[Listener[ClipboardEvent] | js.Array[Listener[ClipboardEvent]]] = js.undefined
    
    var dblclick: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.undefined
    
    var drag: js.UndefOr[Listener[DragEvent] | js.Array[Listener[DragEvent]]] = js.undefined
    
    var dragend: js.UndefOr[Listener[DragEvent] | js.Array[Listener[DragEvent]]] = js.undefined
    
    var dragenter: js.UndefOr[Listener[DragEvent] | js.Array[Listener[DragEvent]]] = js.undefined
    
    var dragleave: js.UndefOr[Listener[DragEvent] | js.Array[Listener[DragEvent]]] = js.undefined
    
    var dragover: js.UndefOr[Listener[DragEvent] | js.Array[Listener[DragEvent]]] = js.undefined
    
    var dragstart: js.UndefOr[Listener[DragEvent] | js.Array[Listener[DragEvent]]] = js.undefined
    
    var drop: js.UndefOr[Listener[DragEvent] | js.Array[Listener[DragEvent]]] = js.undefined
    
    var durationchange: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var emptied: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var ended: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var error: js.UndefOr[Listener[ErrorEvent] | js.Array[Listener[ErrorEvent]]] = js.undefined
    
    var focus: js.UndefOr[Listener[FocusEvent] | js.Array[Listener[FocusEvent]]] = js.undefined
    
    var focusin: js.UndefOr[Listener[FocusEvent] | js.Array[Listener[FocusEvent]]] = js.undefined
    
    var focusout: js.UndefOr[Listener[FocusEvent] | js.Array[Listener[FocusEvent]]] = js.undefined
    
    var formdata: js.UndefOr[Listener[FormDataEvent] | js.Array[Listener[FormDataEvent]]] = js.undefined
    
    var fullscreenchange: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var fullscreenerror: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var gotpointercapture: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.undefined
    
    var input: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var invalid: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var keydown: js.UndefOr[Listener[KeyboardEvent] | js.Array[Listener[KeyboardEvent]]] = js.undefined
    
    var keypress: js.UndefOr[Listener[KeyboardEvent] | js.Array[Listener[KeyboardEvent]]] = js.undefined
    
    var keyup: js.UndefOr[Listener[KeyboardEvent] | js.Array[Listener[KeyboardEvent]]] = js.undefined
    
    var load: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var loadeddata: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var loadedmetadata: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var loadstart: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var lostpointercapture: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.undefined
    
    var mousedown: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.undefined
    
    var mouseenter: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.undefined
    
    var mouseleave: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.undefined
    
    var mousemove: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.undefined
    
    var mouseout: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.undefined
    
    var mouseover: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.undefined
    
    var mouseup: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.undefined
    
    var paste: js.UndefOr[Listener[ClipboardEvent] | js.Array[Listener[ClipboardEvent]]] = js.undefined
    
    var pause: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var play: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var playing: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var pointercancel: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.undefined
    
    var pointerdown: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.undefined
    
    var pointerenter: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.undefined
    
    var pointerleave: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.undefined
    
    var pointermove: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.undefined
    
    var pointerout: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.undefined
    
    var pointerover: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.undefined
    
    var pointerup: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.undefined
    
    var progress: js.UndefOr[
        Listener[ProgressEvent[EventTarget]] | js.Array[Listener[ProgressEvent[EventTarget]]]
      ] = js.undefined
    
    var ratechange: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var reset: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var resize: js.UndefOr[Listener[UIEvent] | js.Array[Listener[UIEvent]]] = js.undefined
    
    var scroll: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var securitypolicyviolation: js.UndefOr[
        Listener[SecurityPolicyViolationEvent] | js.Array[Listener[SecurityPolicyViolationEvent]]
      ] = js.undefined
    
    var seeked: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var seeking: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var select: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var selectionchange: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var selectstart: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var slotchange: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var stalled: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var submit: js.UndefOr[Listener[SubmitEvent] | js.Array[Listener[SubmitEvent]]] = js.undefined
    
    var suspend: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var timeupdate: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var toggle: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var touchcancel: js.UndefOr[Listener[TouchEvent] | js.Array[Listener[TouchEvent]]] = js.undefined
    
    var touchend: js.UndefOr[Listener[TouchEvent] | js.Array[Listener[TouchEvent]]] = js.undefined
    
    var touchmove: js.UndefOr[Listener[TouchEvent] | js.Array[Listener[TouchEvent]]] = js.undefined
    
    var touchstart: js.UndefOr[Listener[TouchEvent] | js.Array[Listener[TouchEvent]]] = js.undefined
    
    var transitioncancel: js.UndefOr[Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]] = js.undefined
    
    var transitionend: js.UndefOr[Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]] = js.undefined
    
    var transitionrun: js.UndefOr[Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]] = js.undefined
    
    var transitionstart: js.UndefOr[Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]] = js.undefined
    
    var volumechange: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var waiting: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var webkitanimationend: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var webkitanimationiteration: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var webkitanimationstart: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var webkittransitionend: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.undefined
    
    var wheel: js.UndefOr[Listener[WheelEvent] | js.Array[Listener[WheelEvent]]] = js.undefined
  }
  object On {
    
    inline def apply(): On = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[On]
    }
    
    extension [Self <: On](x: Self) {
      
      inline def setAbort(value: Listener[UIEvent] | js.Array[Listener[UIEvent]]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      
      inline def setAbortVarargs(value: Listener[UIEvent]*): Self = StObject.set(x, "abort", js.Array(value*))
      
      inline def setAnimationcancel(value: Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]): Self = StObject.set(x, "animationcancel", value.asInstanceOf[js.Any])
      
      inline def setAnimationcancelUndefined: Self = StObject.set(x, "animationcancel", js.undefined)
      
      inline def setAnimationcancelVarargs(value: Listener[AnimationEvent]*): Self = StObject.set(x, "animationcancel", js.Array(value*))
      
      inline def setAnimationend(value: Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]): Self = StObject.set(x, "animationend", value.asInstanceOf[js.Any])
      
      inline def setAnimationendUndefined: Self = StObject.set(x, "animationend", js.undefined)
      
      inline def setAnimationendVarargs(value: Listener[AnimationEvent]*): Self = StObject.set(x, "animationend", js.Array(value*))
      
      inline def setAnimationiteration(value: Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]): Self = StObject.set(x, "animationiteration", value.asInstanceOf[js.Any])
      
      inline def setAnimationiterationUndefined: Self = StObject.set(x, "animationiteration", js.undefined)
      
      inline def setAnimationiterationVarargs(value: Listener[AnimationEvent]*): Self = StObject.set(x, "animationiteration", js.Array(value*))
      
      inline def setAnimationstart(value: Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]): Self = StObject.set(x, "animationstart", value.asInstanceOf[js.Any])
      
      inline def setAnimationstartUndefined: Self = StObject.set(x, "animationstart", js.undefined)
      
      inline def setAnimationstartVarargs(value: Listener[AnimationEvent]*): Self = StObject.set(x, "animationstart", js.Array(value*))
      
      inline def setAuxclick(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "auxclick", value.asInstanceOf[js.Any])
      
      inline def setAuxclickUndefined: Self = StObject.set(x, "auxclick", js.undefined)
      
      inline def setAuxclickVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "auxclick", js.Array(value*))
      
      inline def setBeforeinput(value: Listener[InputEvent] | js.Array[Listener[InputEvent]]): Self = StObject.set(x, "beforeinput", value.asInstanceOf[js.Any])
      
      inline def setBeforeinputUndefined: Self = StObject.set(x, "beforeinput", js.undefined)
      
      inline def setBeforeinputVarargs(value: Listener[InputEvent]*): Self = StObject.set(x, "beforeinput", js.Array(value*))
      
      inline def setBlur(value: Listener[FocusEvent] | js.Array[Listener[FocusEvent]]): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setBlurVarargs(value: Listener[FocusEvent]*): Self = StObject.set(x, "blur", js.Array(value*))
      
      inline def setCancel(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCancelVarargs(value: Listener[Event]*): Self = StObject.set(x, "cancel", js.Array(value*))
      
      inline def setCanplay(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "canplay", value.asInstanceOf[js.Any])
      
      inline def setCanplayUndefined: Self = StObject.set(x, "canplay", js.undefined)
      
      inline def setCanplayVarargs(value: Listener[Event]*): Self = StObject.set(x, "canplay", js.Array(value*))
      
      inline def setCanplaythrough(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "canplaythrough", value.asInstanceOf[js.Any])
      
      inline def setCanplaythroughUndefined: Self = StObject.set(x, "canplaythrough", js.undefined)
      
      inline def setCanplaythroughVarargs(value: Listener[Event]*): Self = StObject.set(x, "canplaythrough", js.Array(value*))
      
      inline def setChange(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setChangeVarargs(value: Listener[Event]*): Self = StObject.set(x, "change", js.Array(value*))
      
      inline def setClick(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setClickVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "click", js.Array(value*))
      
      inline def setClose(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCloseVarargs(value: Listener[Event]*): Self = StObject.set(x, "close", js.Array(value*))
      
      inline def setCompositionend(value: Listener[CompositionEvent] | js.Array[Listener[CompositionEvent]]): Self = StObject.set(x, "compositionend", value.asInstanceOf[js.Any])
      
      inline def setCompositionendUndefined: Self = StObject.set(x, "compositionend", js.undefined)
      
      inline def setCompositionendVarargs(value: Listener[CompositionEvent]*): Self = StObject.set(x, "compositionend", js.Array(value*))
      
      inline def setCompositionstart(value: Listener[CompositionEvent] | js.Array[Listener[CompositionEvent]]): Self = StObject.set(x, "compositionstart", value.asInstanceOf[js.Any])
      
      inline def setCompositionstartUndefined: Self = StObject.set(x, "compositionstart", js.undefined)
      
      inline def setCompositionstartVarargs(value: Listener[CompositionEvent]*): Self = StObject.set(x, "compositionstart", js.Array(value*))
      
      inline def setCompositionupdate(value: Listener[CompositionEvent] | js.Array[Listener[CompositionEvent]]): Self = StObject.set(x, "compositionupdate", value.asInstanceOf[js.Any])
      
      inline def setCompositionupdateUndefined: Self = StObject.set(x, "compositionupdate", js.undefined)
      
      inline def setCompositionupdateVarargs(value: Listener[CompositionEvent]*): Self = StObject.set(x, "compositionupdate", js.Array(value*))
      
      inline def setContextmenu(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
      
      inline def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
      
      inline def setContextmenuVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "contextmenu", js.Array(value*))
      
      inline def setCopy(value: Listener[ClipboardEvent] | js.Array[Listener[ClipboardEvent]]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      inline def setCopyVarargs(value: Listener[ClipboardEvent]*): Self = StObject.set(x, "copy", js.Array(value*))
      
      inline def setCuechange(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "cuechange", value.asInstanceOf[js.Any])
      
      inline def setCuechangeUndefined: Self = StObject.set(x, "cuechange", js.undefined)
      
      inline def setCuechangeVarargs(value: Listener[Event]*): Self = StObject.set(x, "cuechange", js.Array(value*))
      
      inline def setCut(value: Listener[ClipboardEvent] | js.Array[Listener[ClipboardEvent]]): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
      
      inline def setCutUndefined: Self = StObject.set(x, "cut", js.undefined)
      
      inline def setCutVarargs(value: Listener[ClipboardEvent]*): Self = StObject.set(x, "cut", js.Array(value*))
      
      inline def setDblclick(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
      
      inline def setDblclickUndefined: Self = StObject.set(x, "dblclick", js.undefined)
      
      inline def setDblclickVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "dblclick", js.Array(value*))
      
      inline def setDrag(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setDragVarargs(value: Listener[DragEvent]*): Self = StObject.set(x, "drag", js.Array(value*))
      
      inline def setDragend(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = StObject.set(x, "dragend", value.asInstanceOf[js.Any])
      
      inline def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
      
      inline def setDragendVarargs(value: Listener[DragEvent]*): Self = StObject.set(x, "dragend", js.Array(value*))
      
      inline def setDragenter(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = StObject.set(x, "dragenter", value.asInstanceOf[js.Any])
      
      inline def setDragenterUndefined: Self = StObject.set(x, "dragenter", js.undefined)
      
      inline def setDragenterVarargs(value: Listener[DragEvent]*): Self = StObject.set(x, "dragenter", js.Array(value*))
      
      inline def setDragleave(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = StObject.set(x, "dragleave", value.asInstanceOf[js.Any])
      
      inline def setDragleaveUndefined: Self = StObject.set(x, "dragleave", js.undefined)
      
      inline def setDragleaveVarargs(value: Listener[DragEvent]*): Self = StObject.set(x, "dragleave", js.Array(value*))
      
      inline def setDragover(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = StObject.set(x, "dragover", value.asInstanceOf[js.Any])
      
      inline def setDragoverUndefined: Self = StObject.set(x, "dragover", js.undefined)
      
      inline def setDragoverVarargs(value: Listener[DragEvent]*): Self = StObject.set(x, "dragover", js.Array(value*))
      
      inline def setDragstart(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = StObject.set(x, "dragstart", value.asInstanceOf[js.Any])
      
      inline def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
      
      inline def setDragstartVarargs(value: Listener[DragEvent]*): Self = StObject.set(x, "dragstart", js.Array(value*))
      
      inline def setDrop(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      inline def setDropVarargs(value: Listener[DragEvent]*): Self = StObject.set(x, "drop", js.Array(value*))
      
      inline def setDurationchange(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "durationchange", value.asInstanceOf[js.Any])
      
      inline def setDurationchangeUndefined: Self = StObject.set(x, "durationchange", js.undefined)
      
      inline def setDurationchangeVarargs(value: Listener[Event]*): Self = StObject.set(x, "durationchange", js.Array(value*))
      
      inline def setEmptied(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "emptied", value.asInstanceOf[js.Any])
      
      inline def setEmptiedUndefined: Self = StObject.set(x, "emptied", js.undefined)
      
      inline def setEmptiedVarargs(value: Listener[Event]*): Self = StObject.set(x, "emptied", js.Array(value*))
      
      inline def setEnded(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
      
      inline def setEndedUndefined: Self = StObject.set(x, "ended", js.undefined)
      
      inline def setEndedVarargs(value: Listener[Event]*): Self = StObject.set(x, "ended", js.Array(value*))
      
      inline def setError(value: Listener[ErrorEvent] | js.Array[Listener[ErrorEvent]]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setErrorVarargs(value: Listener[ErrorEvent]*): Self = StObject.set(x, "error", js.Array(value*))
      
      inline def setFocus(value: Listener[FocusEvent] | js.Array[Listener[FocusEvent]]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setFocusVarargs(value: Listener[FocusEvent]*): Self = StObject.set(x, "focus", js.Array(value*))
      
      inline def setFocusin(value: Listener[FocusEvent] | js.Array[Listener[FocusEvent]]): Self = StObject.set(x, "focusin", value.asInstanceOf[js.Any])
      
      inline def setFocusinUndefined: Self = StObject.set(x, "focusin", js.undefined)
      
      inline def setFocusinVarargs(value: Listener[FocusEvent]*): Self = StObject.set(x, "focusin", js.Array(value*))
      
      inline def setFocusout(value: Listener[FocusEvent] | js.Array[Listener[FocusEvent]]): Self = StObject.set(x, "focusout", value.asInstanceOf[js.Any])
      
      inline def setFocusoutUndefined: Self = StObject.set(x, "focusout", js.undefined)
      
      inline def setFocusoutVarargs(value: Listener[FocusEvent]*): Self = StObject.set(x, "focusout", js.Array(value*))
      
      inline def setFormdata(value: Listener[FormDataEvent] | js.Array[Listener[FormDataEvent]]): Self = StObject.set(x, "formdata", value.asInstanceOf[js.Any])
      
      inline def setFormdataUndefined: Self = StObject.set(x, "formdata", js.undefined)
      
      inline def setFormdataVarargs(value: Listener[FormDataEvent]*): Self = StObject.set(x, "formdata", js.Array(value*))
      
      inline def setFullscreenchange(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "fullscreenchange", value.asInstanceOf[js.Any])
      
      inline def setFullscreenchangeUndefined: Self = StObject.set(x, "fullscreenchange", js.undefined)
      
      inline def setFullscreenchangeVarargs(value: Listener[Event]*): Self = StObject.set(x, "fullscreenchange", js.Array(value*))
      
      inline def setFullscreenerror(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "fullscreenerror", value.asInstanceOf[js.Any])
      
      inline def setFullscreenerrorUndefined: Self = StObject.set(x, "fullscreenerror", js.undefined)
      
      inline def setFullscreenerrorVarargs(value: Listener[Event]*): Self = StObject.set(x, "fullscreenerror", js.Array(value*))
      
      inline def setGotpointercapture(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "gotpointercapture", value.asInstanceOf[js.Any])
      
      inline def setGotpointercaptureUndefined: Self = StObject.set(x, "gotpointercapture", js.undefined)
      
      inline def setGotpointercaptureVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "gotpointercapture", js.Array(value*))
      
      inline def setInput(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setInputVarargs(value: Listener[Event]*): Self = StObject.set(x, "input", js.Array(value*))
      
      inline def setInvalid(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setInvalidVarargs(value: Listener[Event]*): Self = StObject.set(x, "invalid", js.Array(value*))
      
      inline def setKeydown(value: Listener[KeyboardEvent] | js.Array[Listener[KeyboardEvent]]): Self = StObject.set(x, "keydown", value.asInstanceOf[js.Any])
      
      inline def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
      
      inline def setKeydownVarargs(value: Listener[KeyboardEvent]*): Self = StObject.set(x, "keydown", js.Array(value*))
      
      inline def setKeypress(value: Listener[KeyboardEvent] | js.Array[Listener[KeyboardEvent]]): Self = StObject.set(x, "keypress", value.asInstanceOf[js.Any])
      
      inline def setKeypressUndefined: Self = StObject.set(x, "keypress", js.undefined)
      
      inline def setKeypressVarargs(value: Listener[KeyboardEvent]*): Self = StObject.set(x, "keypress", js.Array(value*))
      
      inline def setKeyup(value: Listener[KeyboardEvent] | js.Array[Listener[KeyboardEvent]]): Self = StObject.set(x, "keyup", value.asInstanceOf[js.Any])
      
      inline def setKeyupUndefined: Self = StObject.set(x, "keyup", js.undefined)
      
      inline def setKeyupVarargs(value: Listener[KeyboardEvent]*): Self = StObject.set(x, "keyup", js.Array(value*))
      
      inline def setLoad(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLoadVarargs(value: Listener[Event]*): Self = StObject.set(x, "load", js.Array(value*))
      
      inline def setLoadeddata(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "loadeddata", value.asInstanceOf[js.Any])
      
      inline def setLoadeddataUndefined: Self = StObject.set(x, "loadeddata", js.undefined)
      
      inline def setLoadeddataVarargs(value: Listener[Event]*): Self = StObject.set(x, "loadeddata", js.Array(value*))
      
      inline def setLoadedmetadata(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "loadedmetadata", value.asInstanceOf[js.Any])
      
      inline def setLoadedmetadataUndefined: Self = StObject.set(x, "loadedmetadata", js.undefined)
      
      inline def setLoadedmetadataVarargs(value: Listener[Event]*): Self = StObject.set(x, "loadedmetadata", js.Array(value*))
      
      inline def setLoadstart(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
      
      inline def setLoadstartUndefined: Self = StObject.set(x, "loadstart", js.undefined)
      
      inline def setLoadstartVarargs(value: Listener[Event]*): Self = StObject.set(x, "loadstart", js.Array(value*))
      
      inline def setLostpointercapture(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "lostpointercapture", value.asInstanceOf[js.Any])
      
      inline def setLostpointercaptureUndefined: Self = StObject.set(x, "lostpointercapture", js.undefined)
      
      inline def setLostpointercaptureVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "lostpointercapture", js.Array(value*))
      
      inline def setMousedown(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      inline def setMousedownUndefined: Self = StObject.set(x, "mousedown", js.undefined)
      
      inline def setMousedownVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "mousedown", js.Array(value*))
      
      inline def setMouseenter(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "mouseenter", value.asInstanceOf[js.Any])
      
      inline def setMouseenterUndefined: Self = StObject.set(x, "mouseenter", js.undefined)
      
      inline def setMouseenterVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "mouseenter", js.Array(value*))
      
      inline def setMouseleave(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "mouseleave", value.asInstanceOf[js.Any])
      
      inline def setMouseleaveUndefined: Self = StObject.set(x, "mouseleave", js.undefined)
      
      inline def setMouseleaveVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "mouseleave", js.Array(value*))
      
      inline def setMousemove(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
      
      inline def setMousemoveUndefined: Self = StObject.set(x, "mousemove", js.undefined)
      
      inline def setMousemoveVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "mousemove", js.Array(value*))
      
      inline def setMouseout(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
      
      inline def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
      
      inline def setMouseoutVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "mouseout", js.Array(value*))
      
      inline def setMouseover(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      inline def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
      
      inline def setMouseoverVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "mouseover", js.Array(value*))
      
      inline def setMouseup(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      inline def setMouseupUndefined: Self = StObject.set(x, "mouseup", js.undefined)
      
      inline def setMouseupVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "mouseup", js.Array(value*))
      
      inline def setPaste(value: Listener[ClipboardEvent] | js.Array[Listener[ClipboardEvent]]): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
      
      inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
      
      inline def setPasteVarargs(value: Listener[ClipboardEvent]*): Self = StObject.set(x, "paste", js.Array(value*))
      
      inline def setPause(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setPauseVarargs(value: Listener[Event]*): Self = StObject.set(x, "pause", js.Array(value*))
      
      inline def setPlay(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      inline def setPlayVarargs(value: Listener[Event]*): Self = StObject.set(x, "play", js.Array(value*))
      
      inline def setPlaying(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
      
      inline def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
      
      inline def setPlayingVarargs(value: Listener[Event]*): Self = StObject.set(x, "playing", js.Array(value*))
      
      inline def setPointercancel(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "pointercancel", value.asInstanceOf[js.Any])
      
      inline def setPointercancelUndefined: Self = StObject.set(x, "pointercancel", js.undefined)
      
      inline def setPointercancelVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "pointercancel", js.Array(value*))
      
      inline def setPointerdown(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "pointerdown", value.asInstanceOf[js.Any])
      
      inline def setPointerdownUndefined: Self = StObject.set(x, "pointerdown", js.undefined)
      
      inline def setPointerdownVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "pointerdown", js.Array(value*))
      
      inline def setPointerenter(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "pointerenter", value.asInstanceOf[js.Any])
      
      inline def setPointerenterUndefined: Self = StObject.set(x, "pointerenter", js.undefined)
      
      inline def setPointerenterVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "pointerenter", js.Array(value*))
      
      inline def setPointerleave(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "pointerleave", value.asInstanceOf[js.Any])
      
      inline def setPointerleaveUndefined: Self = StObject.set(x, "pointerleave", js.undefined)
      
      inline def setPointerleaveVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "pointerleave", js.Array(value*))
      
      inline def setPointermove(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "pointermove", value.asInstanceOf[js.Any])
      
      inline def setPointermoveUndefined: Self = StObject.set(x, "pointermove", js.undefined)
      
      inline def setPointermoveVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "pointermove", js.Array(value*))
      
      inline def setPointerout(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "pointerout", value.asInstanceOf[js.Any])
      
      inline def setPointeroutUndefined: Self = StObject.set(x, "pointerout", js.undefined)
      
      inline def setPointeroutVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "pointerout", js.Array(value*))
      
      inline def setPointerover(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "pointerover", value.asInstanceOf[js.Any])
      
      inline def setPointeroverUndefined: Self = StObject.set(x, "pointerover", js.undefined)
      
      inline def setPointeroverVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "pointerover", js.Array(value*))
      
      inline def setPointerup(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "pointerup", value.asInstanceOf[js.Any])
      
      inline def setPointerupUndefined: Self = StObject.set(x, "pointerup", js.undefined)
      
      inline def setPointerupVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "pointerup", js.Array(value*))
      
      inline def setProgress(value: Listener[ProgressEvent[EventTarget]] | js.Array[Listener[ProgressEvent[EventTarget]]]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setProgressVarargs(value: Listener[ProgressEvent[EventTarget]]*): Self = StObject.set(x, "progress", js.Array(value*))
      
      inline def setRatechange(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "ratechange", value.asInstanceOf[js.Any])
      
      inline def setRatechangeUndefined: Self = StObject.set(x, "ratechange", js.undefined)
      
      inline def setRatechangeVarargs(value: Listener[Event]*): Self = StObject.set(x, "ratechange", js.Array(value*))
      
      inline def setReset(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setResetVarargs(value: Listener[Event]*): Self = StObject.set(x, "reset", js.Array(value*))
      
      inline def setResize(value: Listener[UIEvent] | js.Array[Listener[UIEvent]]): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setResizeVarargs(value: Listener[UIEvent]*): Self = StObject.set(x, "resize", js.Array(value*))
      
      inline def setScroll(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setScrollVarargs(value: Listener[Event]*): Self = StObject.set(x, "scroll", js.Array(value*))
      
      inline def setSecuritypolicyviolation(value: Listener[SecurityPolicyViolationEvent] | js.Array[Listener[SecurityPolicyViolationEvent]]): Self = StObject.set(x, "securitypolicyviolation", value.asInstanceOf[js.Any])
      
      inline def setSecuritypolicyviolationUndefined: Self = StObject.set(x, "securitypolicyviolation", js.undefined)
      
      inline def setSecuritypolicyviolationVarargs(value: Listener[SecurityPolicyViolationEvent]*): Self = StObject.set(x, "securitypolicyviolation", js.Array(value*))
      
      inline def setSeeked(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "seeked", value.asInstanceOf[js.Any])
      
      inline def setSeekedUndefined: Self = StObject.set(x, "seeked", js.undefined)
      
      inline def setSeekedVarargs(value: Listener[Event]*): Self = StObject.set(x, "seeked", js.Array(value*))
      
      inline def setSeeking(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "seeking", value.asInstanceOf[js.Any])
      
      inline def setSeekingUndefined: Self = StObject.set(x, "seeking", js.undefined)
      
      inline def setSeekingVarargs(value: Listener[Event]*): Self = StObject.set(x, "seeking", js.Array(value*))
      
      inline def setSelect(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectVarargs(value: Listener[Event]*): Self = StObject.set(x, "select", js.Array(value*))
      
      inline def setSelectionchange(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "selectionchange", value.asInstanceOf[js.Any])
      
      inline def setSelectionchangeUndefined: Self = StObject.set(x, "selectionchange", js.undefined)
      
      inline def setSelectionchangeVarargs(value: Listener[Event]*): Self = StObject.set(x, "selectionchange", js.Array(value*))
      
      inline def setSelectstart(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "selectstart", value.asInstanceOf[js.Any])
      
      inline def setSelectstartUndefined: Self = StObject.set(x, "selectstart", js.undefined)
      
      inline def setSelectstartVarargs(value: Listener[Event]*): Self = StObject.set(x, "selectstart", js.Array(value*))
      
      inline def setSlotchange(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "slotchange", value.asInstanceOf[js.Any])
      
      inline def setSlotchangeUndefined: Self = StObject.set(x, "slotchange", js.undefined)
      
      inline def setSlotchangeVarargs(value: Listener[Event]*): Self = StObject.set(x, "slotchange", js.Array(value*))
      
      inline def setStalled(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "stalled", value.asInstanceOf[js.Any])
      
      inline def setStalledUndefined: Self = StObject.set(x, "stalled", js.undefined)
      
      inline def setStalledVarargs(value: Listener[Event]*): Self = StObject.set(x, "stalled", js.Array(value*))
      
      inline def setSubmit(value: Listener[SubmitEvent] | js.Array[Listener[SubmitEvent]]): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
      
      inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
      
      inline def setSubmitVarargs(value: Listener[SubmitEvent]*): Self = StObject.set(x, "submit", js.Array(value*))
      
      inline def setSuspend(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
      
      inline def setSuspendUndefined: Self = StObject.set(x, "suspend", js.undefined)
      
      inline def setSuspendVarargs(value: Listener[Event]*): Self = StObject.set(x, "suspend", js.Array(value*))
      
      inline def setTimeupdate(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "timeupdate", value.asInstanceOf[js.Any])
      
      inline def setTimeupdateUndefined: Self = StObject.set(x, "timeupdate", js.undefined)
      
      inline def setTimeupdateVarargs(value: Listener[Event]*): Self = StObject.set(x, "timeupdate", js.Array(value*))
      
      inline def setToggle(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setToggleVarargs(value: Listener[Event]*): Self = StObject.set(x, "toggle", js.Array(value*))
      
      inline def setTouchcancel(value: Listener[TouchEvent] | js.Array[Listener[TouchEvent]]): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
      
      inline def setTouchcancelUndefined: Self = StObject.set(x, "touchcancel", js.undefined)
      
      inline def setTouchcancelVarargs(value: Listener[TouchEvent]*): Self = StObject.set(x, "touchcancel", js.Array(value*))
      
      inline def setTouchend(value: Listener[TouchEvent] | js.Array[Listener[TouchEvent]]): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      inline def setTouchendUndefined: Self = StObject.set(x, "touchend", js.undefined)
      
      inline def setTouchendVarargs(value: Listener[TouchEvent]*): Self = StObject.set(x, "touchend", js.Array(value*))
      
      inline def setTouchmove(value: Listener[TouchEvent] | js.Array[Listener[TouchEvent]]): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
      
      inline def setTouchmoveUndefined: Self = StObject.set(x, "touchmove", js.undefined)
      
      inline def setTouchmoveVarargs(value: Listener[TouchEvent]*): Self = StObject.set(x, "touchmove", js.Array(value*))
      
      inline def setTouchstart(value: Listener[TouchEvent] | js.Array[Listener[TouchEvent]]): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
      
      inline def setTouchstartUndefined: Self = StObject.set(x, "touchstart", js.undefined)
      
      inline def setTouchstartVarargs(value: Listener[TouchEvent]*): Self = StObject.set(x, "touchstart", js.Array(value*))
      
      inline def setTransitioncancel(value: Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]): Self = StObject.set(x, "transitioncancel", value.asInstanceOf[js.Any])
      
      inline def setTransitioncancelUndefined: Self = StObject.set(x, "transitioncancel", js.undefined)
      
      inline def setTransitioncancelVarargs(value: Listener[TransitionEvent]*): Self = StObject.set(x, "transitioncancel", js.Array(value*))
      
      inline def setTransitionend(value: Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]): Self = StObject.set(x, "transitionend", value.asInstanceOf[js.Any])
      
      inline def setTransitionendUndefined: Self = StObject.set(x, "transitionend", js.undefined)
      
      inline def setTransitionendVarargs(value: Listener[TransitionEvent]*): Self = StObject.set(x, "transitionend", js.Array(value*))
      
      inline def setTransitionrun(value: Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]): Self = StObject.set(x, "transitionrun", value.asInstanceOf[js.Any])
      
      inline def setTransitionrunUndefined: Self = StObject.set(x, "transitionrun", js.undefined)
      
      inline def setTransitionrunVarargs(value: Listener[TransitionEvent]*): Self = StObject.set(x, "transitionrun", js.Array(value*))
      
      inline def setTransitionstart(value: Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]): Self = StObject.set(x, "transitionstart", value.asInstanceOf[js.Any])
      
      inline def setTransitionstartUndefined: Self = StObject.set(x, "transitionstart", js.undefined)
      
      inline def setTransitionstartVarargs(value: Listener[TransitionEvent]*): Self = StObject.set(x, "transitionstart", js.Array(value*))
      
      inline def setVolumechange(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "volumechange", value.asInstanceOf[js.Any])
      
      inline def setVolumechangeUndefined: Self = StObject.set(x, "volumechange", js.undefined)
      
      inline def setVolumechangeVarargs(value: Listener[Event]*): Self = StObject.set(x, "volumechange", js.Array(value*))
      
      inline def setWaiting(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
      
      inline def setWaitingUndefined: Self = StObject.set(x, "waiting", js.undefined)
      
      inline def setWaitingVarargs(value: Listener[Event]*): Self = StObject.set(x, "waiting", js.Array(value*))
      
      inline def setWebkitanimationend(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "webkitanimationend", value.asInstanceOf[js.Any])
      
      inline def setWebkitanimationendUndefined: Self = StObject.set(x, "webkitanimationend", js.undefined)
      
      inline def setWebkitanimationendVarargs(value: Listener[Event]*): Self = StObject.set(x, "webkitanimationend", js.Array(value*))
      
      inline def setWebkitanimationiteration(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "webkitanimationiteration", value.asInstanceOf[js.Any])
      
      inline def setWebkitanimationiterationUndefined: Self = StObject.set(x, "webkitanimationiteration", js.undefined)
      
      inline def setWebkitanimationiterationVarargs(value: Listener[Event]*): Self = StObject.set(x, "webkitanimationiteration", js.Array(value*))
      
      inline def setWebkitanimationstart(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "webkitanimationstart", value.asInstanceOf[js.Any])
      
      inline def setWebkitanimationstartUndefined: Self = StObject.set(x, "webkitanimationstart", js.undefined)
      
      inline def setWebkitanimationstartVarargs(value: Listener[Event]*): Self = StObject.set(x, "webkitanimationstart", js.Array(value*))
      
      inline def setWebkittransitionend(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "webkittransitionend", value.asInstanceOf[js.Any])
      
      inline def setWebkittransitionendUndefined: Self = StObject.set(x, "webkittransitionend", js.undefined)
      
      inline def setWebkittransitionendVarargs(value: Listener[Event]*): Self = StObject.set(x, "webkittransitionend", js.Array(value*))
      
      inline def setWheel(value: Listener[WheelEvent] | js.Array[Listener[WheelEvent]]): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
      
      inline def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
      
      inline def setWheelVarargs(value: Listener[WheelEvent]*): Self = StObject.set(x, "wheel", js.Array(value*))
    }
  }
}
