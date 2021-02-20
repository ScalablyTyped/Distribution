package typings.snabbdom

import org.scalablytyped.runtime.StringDictionary
import typings.snabbdom.moduleMod.Module
import typings.snabbdom.vnodeMod.VNode_
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventlistenersMod {
  
  @JSImport("snabbdom/build/package/modules/eventlisteners", "eventListenersModule")
  @js.native
  val eventListenersModule: Module = js.native
  
  type Listener[T] = js.ThisFunction2[/* this */ VNode_, /* ev */ T, /* vnode */ VNode_, Unit]
  
  /* Inlined {[ N in keyof std.HTMLElementEventMap ]:? snabbdom.snabbdom/build/package/modules/eventlisteners.Listener<std.HTMLElementEventMap[N]> | std.Array<snabbdom.snabbdom/build/package/modules/eventlisteners.Listener<std.HTMLElementEventMap[N]>>} & {[event: string] : snabbdom.snabbdom/build/package/modules/eventlisteners.Listener<any> | std.Array<snabbdom.snabbdom/build/package/modules/eventlisteners.Listener<any>>} */
  @js.native
  trait On
    extends /* event */ StringDictionary[Listener[_] | js.Array[Listener[_]]] {
    
    var abort: js.UndefOr[Listener[UIEvent] | js.Array[Listener[UIEvent]]] = js.native
    
    var animationcancel: js.UndefOr[Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]] = js.native
    
    var animationend: js.UndefOr[Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]] = js.native
    
    var animationiteration: js.UndefOr[Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]] = js.native
    
    var animationstart: js.UndefOr[Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]] = js.native
    
    var auxclick: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.native
    
    var blur: js.UndefOr[Listener[FocusEvent] | js.Array[Listener[FocusEvent]]] = js.native
    
    var cancel: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var canplay: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var canplaythrough: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var change: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var click: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.native
    
    var close: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var contextmenu: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.native
    
    var copy: js.UndefOr[Listener[ClipboardEvent] | js.Array[Listener[ClipboardEvent]]] = js.native
    
    var cuechange: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var cut: js.UndefOr[Listener[ClipboardEvent] | js.Array[Listener[ClipboardEvent]]] = js.native
    
    var dblclick: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.native
    
    var drag: js.UndefOr[Listener[DragEvent] | js.Array[Listener[DragEvent]]] = js.native
    
    var dragend: js.UndefOr[Listener[DragEvent] | js.Array[Listener[DragEvent]]] = js.native
    
    var dragenter: js.UndefOr[Listener[DragEvent] | js.Array[Listener[DragEvent]]] = js.native
    
    var dragexit: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var dragleave: js.UndefOr[Listener[DragEvent] | js.Array[Listener[DragEvent]]] = js.native
    
    var dragover: js.UndefOr[Listener[DragEvent] | js.Array[Listener[DragEvent]]] = js.native
    
    var dragstart: js.UndefOr[Listener[DragEvent] | js.Array[Listener[DragEvent]]] = js.native
    
    var drop: js.UndefOr[Listener[DragEvent] | js.Array[Listener[DragEvent]]] = js.native
    
    var durationchange: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var emptied: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var ended: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var error: js.UndefOr[Listener[ErrorEvent] | js.Array[Listener[ErrorEvent]]] = js.native
    
    var focus: js.UndefOr[Listener[FocusEvent] | js.Array[Listener[FocusEvent]]] = js.native
    
    var focusin: js.UndefOr[Listener[FocusEvent] | js.Array[Listener[FocusEvent]]] = js.native
    
    var focusout: js.UndefOr[Listener[FocusEvent] | js.Array[Listener[FocusEvent]]] = js.native
    
    var fullscreenchange: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var fullscreenerror: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var gotpointercapture: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.native
    
    var input: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var invalid: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var keydown: js.UndefOr[Listener[KeyboardEvent] | js.Array[Listener[KeyboardEvent]]] = js.native
    
    var keypress: js.UndefOr[Listener[KeyboardEvent] | js.Array[Listener[KeyboardEvent]]] = js.native
    
    var keyup: js.UndefOr[Listener[KeyboardEvent] | js.Array[Listener[KeyboardEvent]]] = js.native
    
    var load: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var loadeddata: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var loadedmetadata: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var loadstart: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var lostpointercapture: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.native
    
    var mousedown: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.native
    
    var mouseenter: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.native
    
    var mouseleave: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.native
    
    var mousemove: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.native
    
    var mouseout: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.native
    
    var mouseover: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.native
    
    var mouseup: js.UndefOr[Listener[MouseEvent] | js.Array[Listener[MouseEvent]]] = js.native
    
    var paste: js.UndefOr[Listener[ClipboardEvent] | js.Array[Listener[ClipboardEvent]]] = js.native
    
    var pause: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var play: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var playing: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var pointercancel: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.native
    
    var pointerdown: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.native
    
    var pointerenter: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.native
    
    var pointerleave: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.native
    
    var pointermove: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.native
    
    var pointerout: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.native
    
    var pointerover: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.native
    
    var pointerup: js.UndefOr[Listener[PointerEvent] | js.Array[Listener[PointerEvent]]] = js.native
    
    var progress: js.UndefOr[
        Listener[ProgressEvent[EventTarget]] | js.Array[Listener[ProgressEvent[EventTarget]]]
      ] = js.native
    
    var ratechange: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var reset: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var resize: js.UndefOr[Listener[UIEvent] | js.Array[Listener[UIEvent]]] = js.native
    
    var scroll: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var securitypolicyviolation: js.UndefOr[
        Listener[SecurityPolicyViolationEvent] | js.Array[Listener[SecurityPolicyViolationEvent]]
      ] = js.native
    
    var seeked: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var seeking: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var select: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var selectionchange: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var selectstart: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var stalled: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var submit: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var suspend: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var timeupdate: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var toggle: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var touchcancel: js.UndefOr[Listener[TouchEvent] | js.Array[Listener[TouchEvent]]] = js.native
    
    var touchend: js.UndefOr[Listener[TouchEvent] | js.Array[Listener[TouchEvent]]] = js.native
    
    var touchmove: js.UndefOr[Listener[TouchEvent] | js.Array[Listener[TouchEvent]]] = js.native
    
    var touchstart: js.UndefOr[Listener[TouchEvent] | js.Array[Listener[TouchEvent]]] = js.native
    
    var transitioncancel: js.UndefOr[Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]] = js.native
    
    var transitionend: js.UndefOr[Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]] = js.native
    
    var transitionrun: js.UndefOr[Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]] = js.native
    
    var transitionstart: js.UndefOr[Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]] = js.native
    
    var volumechange: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var waiting: js.UndefOr[Listener[Event] | js.Array[Listener[Event]]] = js.native
    
    var wheel: js.UndefOr[Listener[WheelEvent] | js.Array[Listener[WheelEvent]]] = js.native
  }
  object On {
    
    @scala.inline
    def apply(): On = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[On]
    }
    
    @scala.inline
    implicit class OnMutableBuilder[Self <: On] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: Listener[UIEvent] | js.Array[Listener[UIEvent]]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      
      @scala.inline
      def setAbortVarargs(value: Listener[UIEvent]*): Self = StObject.set(x, "abort", js.Array(value :_*))
      
      @scala.inline
      def setAnimationcancel(value: Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]): Self = StObject.set(x, "animationcancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationcancelUndefined: Self = StObject.set(x, "animationcancel", js.undefined)
      
      @scala.inline
      def setAnimationcancelVarargs(value: Listener[AnimationEvent]*): Self = StObject.set(x, "animationcancel", js.Array(value :_*))
      
      @scala.inline
      def setAnimationend(value: Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]): Self = StObject.set(x, "animationend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationendUndefined: Self = StObject.set(x, "animationend", js.undefined)
      
      @scala.inline
      def setAnimationendVarargs(value: Listener[AnimationEvent]*): Self = StObject.set(x, "animationend", js.Array(value :_*))
      
      @scala.inline
      def setAnimationiteration(value: Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]): Self = StObject.set(x, "animationiteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationiterationUndefined: Self = StObject.set(x, "animationiteration", js.undefined)
      
      @scala.inline
      def setAnimationiterationVarargs(value: Listener[AnimationEvent]*): Self = StObject.set(x, "animationiteration", js.Array(value :_*))
      
      @scala.inline
      def setAnimationstart(value: Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]): Self = StObject.set(x, "animationstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationstartUndefined: Self = StObject.set(x, "animationstart", js.undefined)
      
      @scala.inline
      def setAnimationstartVarargs(value: Listener[AnimationEvent]*): Self = StObject.set(x, "animationstart", js.Array(value :_*))
      
      @scala.inline
      def setAuxclick(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "auxclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuxclickUndefined: Self = StObject.set(x, "auxclick", js.undefined)
      
      @scala.inline
      def setAuxclickVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "auxclick", js.Array(value :_*))
      
      @scala.inline
      def setBlur(value: Listener[FocusEvent] | js.Array[Listener[FocusEvent]]): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      @scala.inline
      def setBlurVarargs(value: Listener[FocusEvent]*): Self = StObject.set(x, "blur", js.Array(value :_*))
      
      @scala.inline
      def setCancel(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCancelVarargs(value: Listener[Event]*): Self = StObject.set(x, "cancel", js.Array(value :_*))
      
      @scala.inline
      def setCanplay(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "canplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanplayUndefined: Self = StObject.set(x, "canplay", js.undefined)
      
      @scala.inline
      def setCanplayVarargs(value: Listener[Event]*): Self = StObject.set(x, "canplay", js.Array(value :_*))
      
      @scala.inline
      def setCanplaythrough(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "canplaythrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanplaythroughUndefined: Self = StObject.set(x, "canplaythrough", js.undefined)
      
      @scala.inline
      def setCanplaythroughVarargs(value: Listener[Event]*): Self = StObject.set(x, "canplaythrough", js.Array(value :_*))
      
      @scala.inline
      def setChange(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setChangeVarargs(value: Listener[Event]*): Self = StObject.set(x, "change", js.Array(value :_*))
      
      @scala.inline
      def setClick(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setClickVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "click", js.Array(value :_*))
      
      @scala.inline
      def setClose(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setCloseVarargs(value: Listener[Event]*): Self = StObject.set(x, "close", js.Array(value :_*))
      
      @scala.inline
      def setContextmenu(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
      
      @scala.inline
      def setContextmenuVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "contextmenu", js.Array(value :_*))
      
      @scala.inline
      def setCopy(value: Listener[ClipboardEvent] | js.Array[Listener[ClipboardEvent]]): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setCopyVarargs(value: Listener[ClipboardEvent]*): Self = StObject.set(x, "copy", js.Array(value :_*))
      
      @scala.inline
      def setCuechange(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "cuechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCuechangeUndefined: Self = StObject.set(x, "cuechange", js.undefined)
      
      @scala.inline
      def setCuechangeVarargs(value: Listener[Event]*): Self = StObject.set(x, "cuechange", js.Array(value :_*))
      
      @scala.inline
      def setCut(value: Listener[ClipboardEvent] | js.Array[Listener[ClipboardEvent]]): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCutUndefined: Self = StObject.set(x, "cut", js.undefined)
      
      @scala.inline
      def setCutVarargs(value: Listener[ClipboardEvent]*): Self = StObject.set(x, "cut", js.Array(value :_*))
      
      @scala.inline
      def setDblclick(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDblclickUndefined: Self = StObject.set(x, "dblclick", js.undefined)
      
      @scala.inline
      def setDblclickVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "dblclick", js.Array(value :_*))
      
      @scala.inline
      def setDrag(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      @scala.inline
      def setDragVarargs(value: Listener[DragEvent]*): Self = StObject.set(x, "drag", js.Array(value :_*))
      
      @scala.inline
      def setDragend(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = StObject.set(x, "dragend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
      
      @scala.inline
      def setDragendVarargs(value: Listener[DragEvent]*): Self = StObject.set(x, "dragend", js.Array(value :_*))
      
      @scala.inline
      def setDragenter(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = StObject.set(x, "dragenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragenterUndefined: Self = StObject.set(x, "dragenter", js.undefined)
      
      @scala.inline
      def setDragenterVarargs(value: Listener[DragEvent]*): Self = StObject.set(x, "dragenter", js.Array(value :_*))
      
      @scala.inline
      def setDragexit(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "dragexit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragexitUndefined: Self = StObject.set(x, "dragexit", js.undefined)
      
      @scala.inline
      def setDragexitVarargs(value: Listener[Event]*): Self = StObject.set(x, "dragexit", js.Array(value :_*))
      
      @scala.inline
      def setDragleave(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = StObject.set(x, "dragleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragleaveUndefined: Self = StObject.set(x, "dragleave", js.undefined)
      
      @scala.inline
      def setDragleaveVarargs(value: Listener[DragEvent]*): Self = StObject.set(x, "dragleave", js.Array(value :_*))
      
      @scala.inline
      def setDragover(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = StObject.set(x, "dragover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragoverUndefined: Self = StObject.set(x, "dragover", js.undefined)
      
      @scala.inline
      def setDragoverVarargs(value: Listener[DragEvent]*): Self = StObject.set(x, "dragover", js.Array(value :_*))
      
      @scala.inline
      def setDragstart(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = StObject.set(x, "dragstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
      
      @scala.inline
      def setDragstartVarargs(value: Listener[DragEvent]*): Self = StObject.set(x, "dragstart", js.Array(value :_*))
      
      @scala.inline
      def setDrop(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      @scala.inline
      def setDropVarargs(value: Listener[DragEvent]*): Self = StObject.set(x, "drop", js.Array(value :_*))
      
      @scala.inline
      def setDurationchange(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "durationchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationchangeUndefined: Self = StObject.set(x, "durationchange", js.undefined)
      
      @scala.inline
      def setDurationchangeVarargs(value: Listener[Event]*): Self = StObject.set(x, "durationchange", js.Array(value :_*))
      
      @scala.inline
      def setEmptied(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "emptied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptiedUndefined: Self = StObject.set(x, "emptied", js.undefined)
      
      @scala.inline
      def setEmptiedVarargs(value: Listener[Event]*): Self = StObject.set(x, "emptied", js.Array(value :_*))
      
      @scala.inline
      def setEnded(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndedUndefined: Self = StObject.set(x, "ended", js.undefined)
      
      @scala.inline
      def setEndedVarargs(value: Listener[Event]*): Self = StObject.set(x, "ended", js.Array(value :_*))
      
      @scala.inline
      def setError(value: Listener[ErrorEvent] | js.Array[Listener[ErrorEvent]]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setErrorVarargs(value: Listener[ErrorEvent]*): Self = StObject.set(x, "error", js.Array(value :_*))
      
      @scala.inline
      def setFocus(value: Listener[FocusEvent] | js.Array[Listener[FocusEvent]]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setFocusVarargs(value: Listener[FocusEvent]*): Self = StObject.set(x, "focus", js.Array(value :_*))
      
      @scala.inline
      def setFocusin(value: Listener[FocusEvent] | js.Array[Listener[FocusEvent]]): Self = StObject.set(x, "focusin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusinUndefined: Self = StObject.set(x, "focusin", js.undefined)
      
      @scala.inline
      def setFocusinVarargs(value: Listener[FocusEvent]*): Self = StObject.set(x, "focusin", js.Array(value :_*))
      
      @scala.inline
      def setFocusout(value: Listener[FocusEvent] | js.Array[Listener[FocusEvent]]): Self = StObject.set(x, "focusout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusoutUndefined: Self = StObject.set(x, "focusout", js.undefined)
      
      @scala.inline
      def setFocusoutVarargs(value: Listener[FocusEvent]*): Self = StObject.set(x, "focusout", js.Array(value :_*))
      
      @scala.inline
      def setFullscreenchange(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "fullscreenchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenchangeUndefined: Self = StObject.set(x, "fullscreenchange", js.undefined)
      
      @scala.inline
      def setFullscreenchangeVarargs(value: Listener[Event]*): Self = StObject.set(x, "fullscreenchange", js.Array(value :_*))
      
      @scala.inline
      def setFullscreenerror(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "fullscreenerror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenerrorUndefined: Self = StObject.set(x, "fullscreenerror", js.undefined)
      
      @scala.inline
      def setFullscreenerrorVarargs(value: Listener[Event]*): Self = StObject.set(x, "fullscreenerror", js.Array(value :_*))
      
      @scala.inline
      def setGotpointercapture(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "gotpointercapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGotpointercaptureUndefined: Self = StObject.set(x, "gotpointercapture", js.undefined)
      
      @scala.inline
      def setGotpointercaptureVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "gotpointercapture", js.Array(value :_*))
      
      @scala.inline
      def setInput(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setInputVarargs(value: Listener[Event]*): Self = StObject.set(x, "input", js.Array(value :_*))
      
      @scala.inline
      def setInvalid(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setInvalidVarargs(value: Listener[Event]*): Self = StObject.set(x, "invalid", js.Array(value :_*))
      
      @scala.inline
      def setKeydown(value: Listener[KeyboardEvent] | js.Array[Listener[KeyboardEvent]]): Self = StObject.set(x, "keydown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
      
      @scala.inline
      def setKeydownVarargs(value: Listener[KeyboardEvent]*): Self = StObject.set(x, "keydown", js.Array(value :_*))
      
      @scala.inline
      def setKeypress(value: Listener[KeyboardEvent] | js.Array[Listener[KeyboardEvent]]): Self = StObject.set(x, "keypress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeypressUndefined: Self = StObject.set(x, "keypress", js.undefined)
      
      @scala.inline
      def setKeypressVarargs(value: Listener[KeyboardEvent]*): Self = StObject.set(x, "keypress", js.Array(value :_*))
      
      @scala.inline
      def setKeyup(value: Listener[KeyboardEvent] | js.Array[Listener[KeyboardEvent]]): Self = StObject.set(x, "keyup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyupUndefined: Self = StObject.set(x, "keyup", js.undefined)
      
      @scala.inline
      def setKeyupVarargs(value: Listener[KeyboardEvent]*): Self = StObject.set(x, "keyup", js.Array(value :_*))
      
      @scala.inline
      def setLoad(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setLoadVarargs(value: Listener[Event]*): Self = StObject.set(x, "load", js.Array(value :_*))
      
      @scala.inline
      def setLoadeddata(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "loadeddata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadeddataUndefined: Self = StObject.set(x, "loadeddata", js.undefined)
      
      @scala.inline
      def setLoadeddataVarargs(value: Listener[Event]*): Self = StObject.set(x, "loadeddata", js.Array(value :_*))
      
      @scala.inline
      def setLoadedmetadata(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "loadedmetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedmetadataUndefined: Self = StObject.set(x, "loadedmetadata", js.undefined)
      
      @scala.inline
      def setLoadedmetadataVarargs(value: Listener[Event]*): Self = StObject.set(x, "loadedmetadata", js.Array(value :_*))
      
      @scala.inline
      def setLoadstart(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadstartUndefined: Self = StObject.set(x, "loadstart", js.undefined)
      
      @scala.inline
      def setLoadstartVarargs(value: Listener[Event]*): Self = StObject.set(x, "loadstart", js.Array(value :_*))
      
      @scala.inline
      def setLostpointercapture(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "lostpointercapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLostpointercaptureUndefined: Self = StObject.set(x, "lostpointercapture", js.undefined)
      
      @scala.inline
      def setLostpointercaptureVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "lostpointercapture", js.Array(value :_*))
      
      @scala.inline
      def setMousedown(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousedownUndefined: Self = StObject.set(x, "mousedown", js.undefined)
      
      @scala.inline
      def setMousedownVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "mousedown", js.Array(value :_*))
      
      @scala.inline
      def setMouseenter(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "mouseenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseenterUndefined: Self = StObject.set(x, "mouseenter", js.undefined)
      
      @scala.inline
      def setMouseenterVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "mouseenter", js.Array(value :_*))
      
      @scala.inline
      def setMouseleave(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "mouseleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseleaveUndefined: Self = StObject.set(x, "mouseleave", js.undefined)
      
      @scala.inline
      def setMouseleaveVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "mouseleave", js.Array(value :_*))
      
      @scala.inline
      def setMousemove(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousemoveUndefined: Self = StObject.set(x, "mousemove", js.undefined)
      
      @scala.inline
      def setMousemoveVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "mousemove", js.Array(value :_*))
      
      @scala.inline
      def setMouseout(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
      
      @scala.inline
      def setMouseoutVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "mouseout", js.Array(value :_*))
      
      @scala.inline
      def setMouseover(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
      
      @scala.inline
      def setMouseoverVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "mouseover", js.Array(value :_*))
      
      @scala.inline
      def setMouseup(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseupUndefined: Self = StObject.set(x, "mouseup", js.undefined)
      
      @scala.inline
      def setMouseupVarargs(value: Listener[MouseEvent]*): Self = StObject.set(x, "mouseup", js.Array(value :_*))
      
      @scala.inline
      def setPaste(value: Listener[ClipboardEvent] | js.Array[Listener[ClipboardEvent]]): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
      
      @scala.inline
      def setPasteVarargs(value: Listener[ClipboardEvent]*): Self = StObject.set(x, "paste", js.Array(value :_*))
      
      @scala.inline
      def setPause(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      @scala.inline
      def setPauseVarargs(value: Listener[Event]*): Self = StObject.set(x, "pause", js.Array(value :_*))
      
      @scala.inline
      def setPlay(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      @scala.inline
      def setPlayVarargs(value: Listener[Event]*): Self = StObject.set(x, "play", js.Array(value :_*))
      
      @scala.inline
      def setPlaying(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
      
      @scala.inline
      def setPlayingVarargs(value: Listener[Event]*): Self = StObject.set(x, "playing", js.Array(value :_*))
      
      @scala.inline
      def setPointercancel(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "pointercancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointercancelUndefined: Self = StObject.set(x, "pointercancel", js.undefined)
      
      @scala.inline
      def setPointercancelVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "pointercancel", js.Array(value :_*))
      
      @scala.inline
      def setPointerdown(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "pointerdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerdownUndefined: Self = StObject.set(x, "pointerdown", js.undefined)
      
      @scala.inline
      def setPointerdownVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "pointerdown", js.Array(value :_*))
      
      @scala.inline
      def setPointerenter(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "pointerenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerenterUndefined: Self = StObject.set(x, "pointerenter", js.undefined)
      
      @scala.inline
      def setPointerenterVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "pointerenter", js.Array(value :_*))
      
      @scala.inline
      def setPointerleave(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "pointerleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerleaveUndefined: Self = StObject.set(x, "pointerleave", js.undefined)
      
      @scala.inline
      def setPointerleaveVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "pointerleave", js.Array(value :_*))
      
      @scala.inline
      def setPointermove(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "pointermove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointermoveUndefined: Self = StObject.set(x, "pointermove", js.undefined)
      
      @scala.inline
      def setPointermoveVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "pointermove", js.Array(value :_*))
      
      @scala.inline
      def setPointerout(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "pointerout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointeroutUndefined: Self = StObject.set(x, "pointerout", js.undefined)
      
      @scala.inline
      def setPointeroutVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "pointerout", js.Array(value :_*))
      
      @scala.inline
      def setPointerover(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "pointerover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointeroverUndefined: Self = StObject.set(x, "pointerover", js.undefined)
      
      @scala.inline
      def setPointeroverVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "pointerover", js.Array(value :_*))
      
      @scala.inline
      def setPointerup(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = StObject.set(x, "pointerup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerupUndefined: Self = StObject.set(x, "pointerup", js.undefined)
      
      @scala.inline
      def setPointerupVarargs(value: Listener[PointerEvent]*): Self = StObject.set(x, "pointerup", js.Array(value :_*))
      
      @scala.inline
      def setProgress(value: Listener[ProgressEvent[EventTarget]] | js.Array[Listener[ProgressEvent[EventTarget]]]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setProgressVarargs(value: Listener[ProgressEvent[EventTarget]]*): Self = StObject.set(x, "progress", js.Array(value :_*))
      
      @scala.inline
      def setRatechange(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "ratechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatechangeUndefined: Self = StObject.set(x, "ratechange", js.undefined)
      
      @scala.inline
      def setRatechangeVarargs(value: Listener[Event]*): Self = StObject.set(x, "ratechange", js.Array(value :_*))
      
      @scala.inline
      def setReset(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      @scala.inline
      def setResetVarargs(value: Listener[Event]*): Self = StObject.set(x, "reset", js.Array(value :_*))
      
      @scala.inline
      def setResize(value: Listener[UIEvent] | js.Array[Listener[UIEvent]]): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setResizeVarargs(value: Listener[UIEvent]*): Self = StObject.set(x, "resize", js.Array(value :_*))
      
      @scala.inline
      def setScroll(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setScrollVarargs(value: Listener[Event]*): Self = StObject.set(x, "scroll", js.Array(value :_*))
      
      @scala.inline
      def setSecuritypolicyviolation(value: Listener[SecurityPolicyViolationEvent] | js.Array[Listener[SecurityPolicyViolationEvent]]): Self = StObject.set(x, "securitypolicyviolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecuritypolicyviolationUndefined: Self = StObject.set(x, "securitypolicyviolation", js.undefined)
      
      @scala.inline
      def setSecuritypolicyviolationVarargs(value: Listener[SecurityPolicyViolationEvent]*): Self = StObject.set(x, "securitypolicyviolation", js.Array(value :_*))
      
      @scala.inline
      def setSeeked(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "seeked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeekedUndefined: Self = StObject.set(x, "seeked", js.undefined)
      
      @scala.inline
      def setSeekedVarargs(value: Listener[Event]*): Self = StObject.set(x, "seeked", js.Array(value :_*))
      
      @scala.inline
      def setSeeking(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "seeking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeekingUndefined: Self = StObject.set(x, "seeking", js.undefined)
      
      @scala.inline
      def setSeekingVarargs(value: Listener[Event]*): Self = StObject.set(x, "seeking", js.Array(value :_*))
      
      @scala.inline
      def setSelect(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setSelectVarargs(value: Listener[Event]*): Self = StObject.set(x, "select", js.Array(value :_*))
      
      @scala.inline
      def setSelectionchange(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "selectionchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionchangeUndefined: Self = StObject.set(x, "selectionchange", js.undefined)
      
      @scala.inline
      def setSelectionchangeVarargs(value: Listener[Event]*): Self = StObject.set(x, "selectionchange", js.Array(value :_*))
      
      @scala.inline
      def setSelectstart(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "selectstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectstartUndefined: Self = StObject.set(x, "selectstart", js.undefined)
      
      @scala.inline
      def setSelectstartVarargs(value: Listener[Event]*): Self = StObject.set(x, "selectstart", js.Array(value :_*))
      
      @scala.inline
      def setStalled(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "stalled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStalledUndefined: Self = StObject.set(x, "stalled", js.undefined)
      
      @scala.inline
      def setStalledVarargs(value: Listener[Event]*): Self = StObject.set(x, "stalled", js.Array(value :_*))
      
      @scala.inline
      def setSubmit(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
      
      @scala.inline
      def setSubmitVarargs(value: Listener[Event]*): Self = StObject.set(x, "submit", js.Array(value :_*))
      
      @scala.inline
      def setSuspend(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuspendUndefined: Self = StObject.set(x, "suspend", js.undefined)
      
      @scala.inline
      def setSuspendVarargs(value: Listener[Event]*): Self = StObject.set(x, "suspend", js.Array(value :_*))
      
      @scala.inline
      def setTimeupdate(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "timeupdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeupdateUndefined: Self = StObject.set(x, "timeupdate", js.undefined)
      
      @scala.inline
      def setTimeupdateVarargs(value: Listener[Event]*): Self = StObject.set(x, "timeupdate", js.Array(value :_*))
      
      @scala.inline
      def setToggle(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      @scala.inline
      def setToggleVarargs(value: Listener[Event]*): Self = StObject.set(x, "toggle", js.Array(value :_*))
      
      @scala.inline
      def setTouchcancel(value: Listener[TouchEvent] | js.Array[Listener[TouchEvent]]): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchcancelUndefined: Self = StObject.set(x, "touchcancel", js.undefined)
      
      @scala.inline
      def setTouchcancelVarargs(value: Listener[TouchEvent]*): Self = StObject.set(x, "touchcancel", js.Array(value :_*))
      
      @scala.inline
      def setTouchend(value: Listener[TouchEvent] | js.Array[Listener[TouchEvent]]): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchendUndefined: Self = StObject.set(x, "touchend", js.undefined)
      
      @scala.inline
      def setTouchendVarargs(value: Listener[TouchEvent]*): Self = StObject.set(x, "touchend", js.Array(value :_*))
      
      @scala.inline
      def setTouchmove(value: Listener[TouchEvent] | js.Array[Listener[TouchEvent]]): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchmoveUndefined: Self = StObject.set(x, "touchmove", js.undefined)
      
      @scala.inline
      def setTouchmoveVarargs(value: Listener[TouchEvent]*): Self = StObject.set(x, "touchmove", js.Array(value :_*))
      
      @scala.inline
      def setTouchstart(value: Listener[TouchEvent] | js.Array[Listener[TouchEvent]]): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchstartUndefined: Self = StObject.set(x, "touchstart", js.undefined)
      
      @scala.inline
      def setTouchstartVarargs(value: Listener[TouchEvent]*): Self = StObject.set(x, "touchstart", js.Array(value :_*))
      
      @scala.inline
      def setTransitioncancel(value: Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]): Self = StObject.set(x, "transitioncancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitioncancelUndefined: Self = StObject.set(x, "transitioncancel", js.undefined)
      
      @scala.inline
      def setTransitioncancelVarargs(value: Listener[TransitionEvent]*): Self = StObject.set(x, "transitioncancel", js.Array(value :_*))
      
      @scala.inline
      def setTransitionend(value: Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]): Self = StObject.set(x, "transitionend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionendUndefined: Self = StObject.set(x, "transitionend", js.undefined)
      
      @scala.inline
      def setTransitionendVarargs(value: Listener[TransitionEvent]*): Self = StObject.set(x, "transitionend", js.Array(value :_*))
      
      @scala.inline
      def setTransitionrun(value: Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]): Self = StObject.set(x, "transitionrun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionrunUndefined: Self = StObject.set(x, "transitionrun", js.undefined)
      
      @scala.inline
      def setTransitionrunVarargs(value: Listener[TransitionEvent]*): Self = StObject.set(x, "transitionrun", js.Array(value :_*))
      
      @scala.inline
      def setTransitionstart(value: Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]): Self = StObject.set(x, "transitionstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionstartUndefined: Self = StObject.set(x, "transitionstart", js.undefined)
      
      @scala.inline
      def setTransitionstartVarargs(value: Listener[TransitionEvent]*): Self = StObject.set(x, "transitionstart", js.Array(value :_*))
      
      @scala.inline
      def setVolumechange(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "volumechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumechangeUndefined: Self = StObject.set(x, "volumechange", js.undefined)
      
      @scala.inline
      def setVolumechangeVarargs(value: Listener[Event]*): Self = StObject.set(x, "volumechange", js.Array(value :_*))
      
      @scala.inline
      def setWaiting(value: Listener[Event] | js.Array[Listener[Event]]): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitingUndefined: Self = StObject.set(x, "waiting", js.undefined)
      
      @scala.inline
      def setWaitingVarargs(value: Listener[Event]*): Self = StObject.set(x, "waiting", js.Array(value :_*))
      
      @scala.inline
      def setWheel(value: Listener[WheelEvent] | js.Array[Listener[WheelEvent]]): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
      
      @scala.inline
      def setWheelVarargs(value: Listener[WheelEvent]*): Self = StObject.set(x, "wheel", js.Array(value :_*))
    }
  }
}
