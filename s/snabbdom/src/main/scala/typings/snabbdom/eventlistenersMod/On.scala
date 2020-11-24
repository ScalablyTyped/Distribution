package typings.snabbdom.eventlistenersMod

import org.scalablytyped.runtime.StringDictionary
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class OnOps[Self <: On] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbortVarargs(value: Listener[UIEvent]*): Self = this.set("abort", js.Array(value :_*))
    
    @scala.inline
    def setAbort(value: Listener[UIEvent] | js.Array[Listener[UIEvent]]): Self = this.set("abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    
    @scala.inline
    def setAnimationcancelVarargs(value: Listener[AnimationEvent]*): Self = this.set("animationcancel", js.Array(value :_*))
    
    @scala.inline
    def setAnimationcancel(value: Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]): Self = this.set("animationcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationcancel: Self = this.set("animationcancel", js.undefined)
    
    @scala.inline
    def setAnimationendVarargs(value: Listener[AnimationEvent]*): Self = this.set("animationend", js.Array(value :_*))
    
    @scala.inline
    def setAnimationend(value: Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]): Self = this.set("animationend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationend: Self = this.set("animationend", js.undefined)
    
    @scala.inline
    def setAnimationiterationVarargs(value: Listener[AnimationEvent]*): Self = this.set("animationiteration", js.Array(value :_*))
    
    @scala.inline
    def setAnimationiteration(value: Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]): Self = this.set("animationiteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationiteration: Self = this.set("animationiteration", js.undefined)
    
    @scala.inline
    def setAnimationstartVarargs(value: Listener[AnimationEvent]*): Self = this.set("animationstart", js.Array(value :_*))
    
    @scala.inline
    def setAnimationstart(value: Listener[AnimationEvent] | js.Array[Listener[AnimationEvent]]): Self = this.set("animationstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationstart: Self = this.set("animationstart", js.undefined)
    
    @scala.inline
    def setAuxclickVarargs(value: Listener[MouseEvent]*): Self = this.set("auxclick", js.Array(value :_*))
    
    @scala.inline
    def setAuxclick(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = this.set("auxclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuxclick: Self = this.set("auxclick", js.undefined)
    
    @scala.inline
    def setBlurVarargs(value: Listener[FocusEvent]*): Self = this.set("blur", js.Array(value :_*))
    
    @scala.inline
    def setBlur(value: Listener[FocusEvent] | js.Array[Listener[FocusEvent]]): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    
    @scala.inline
    def setCancelVarargs(value: Listener[Event]*): Self = this.set("cancel", js.Array(value :_*))
    
    @scala.inline
    def setCancel(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setCanplayVarargs(value: Listener[Event]*): Self = this.set("canplay", js.Array(value :_*))
    
    @scala.inline
    def setCanplay(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("canplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanplay: Self = this.set("canplay", js.undefined)
    
    @scala.inline
    def setCanplaythroughVarargs(value: Listener[Event]*): Self = this.set("canplaythrough", js.Array(value :_*))
    
    @scala.inline
    def setCanplaythrough(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("canplaythrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanplaythrough: Self = this.set("canplaythrough", js.undefined)
    
    @scala.inline
    def setChangeVarargs(value: Listener[Event]*): Self = this.set("change", js.Array(value :_*))
    
    @scala.inline
    def setChange(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setClickVarargs(value: Listener[MouseEvent]*): Self = this.set("click", js.Array(value :_*))
    
    @scala.inline
    def setClick(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setCloseVarargs(value: Listener[Event]*): Self = this.set("close", js.Array(value :_*))
    
    @scala.inline
    def setClose(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setContextmenuVarargs(value: Listener[MouseEvent]*): Self = this.set("contextmenu", js.Array(value :_*))
    
    @scala.inline
    def setContextmenu(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = this.set("contextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextmenu: Self = this.set("contextmenu", js.undefined)
    
    @scala.inline
    def setCopyVarargs(value: Listener[ClipboardEvent]*): Self = this.set("copy", js.Array(value :_*))
    
    @scala.inline
    def setCopy(value: Listener[ClipboardEvent] | js.Array[Listener[ClipboardEvent]]): Self = this.set("copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setCuechangeVarargs(value: Listener[Event]*): Self = this.set("cuechange", js.Array(value :_*))
    
    @scala.inline
    def setCuechange(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("cuechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCuechange: Self = this.set("cuechange", js.undefined)
    
    @scala.inline
    def setCutVarargs(value: Listener[ClipboardEvent]*): Self = this.set("cut", js.Array(value :_*))
    
    @scala.inline
    def setCut(value: Listener[ClipboardEvent] | js.Array[Listener[ClipboardEvent]]): Self = this.set("cut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCut: Self = this.set("cut", js.undefined)
    
    @scala.inline
    def setDblclickVarargs(value: Listener[MouseEvent]*): Self = this.set("dblclick", js.Array(value :_*))
    
    @scala.inline
    def setDblclick(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDblclick: Self = this.set("dblclick", js.undefined)
    
    @scala.inline
    def setDragVarargs(value: Listener[DragEvent]*): Self = this.set("drag", js.Array(value :_*))
    
    @scala.inline
    def setDrag(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = this.set("drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragendVarargs(value: Listener[DragEvent]*): Self = this.set("dragend", js.Array(value :_*))
    
    @scala.inline
    def setDragend(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = this.set("dragend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragend: Self = this.set("dragend", js.undefined)
    
    @scala.inline
    def setDragenterVarargs(value: Listener[DragEvent]*): Self = this.set("dragenter", js.Array(value :_*))
    
    @scala.inline
    def setDragenter(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = this.set("dragenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragenter: Self = this.set("dragenter", js.undefined)
    
    @scala.inline
    def setDragexitVarargs(value: Listener[Event]*): Self = this.set("dragexit", js.Array(value :_*))
    
    @scala.inline
    def setDragexit(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("dragexit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragexit: Self = this.set("dragexit", js.undefined)
    
    @scala.inline
    def setDragleaveVarargs(value: Listener[DragEvent]*): Self = this.set("dragleave", js.Array(value :_*))
    
    @scala.inline
    def setDragleave(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = this.set("dragleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragleave: Self = this.set("dragleave", js.undefined)
    
    @scala.inline
    def setDragoverVarargs(value: Listener[DragEvent]*): Self = this.set("dragover", js.Array(value :_*))
    
    @scala.inline
    def setDragover(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = this.set("dragover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragover: Self = this.set("dragover", js.undefined)
    
    @scala.inline
    def setDragstartVarargs(value: Listener[DragEvent]*): Self = this.set("dragstart", js.Array(value :_*))
    
    @scala.inline
    def setDragstart(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = this.set("dragstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragstart: Self = this.set("dragstart", js.undefined)
    
    @scala.inline
    def setDropVarargs(value: Listener[DragEvent]*): Self = this.set("drop", js.Array(value :_*))
    
    @scala.inline
    def setDrop(value: Listener[DragEvent] | js.Array[Listener[DragEvent]]): Self = this.set("drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setDurationchangeVarargs(value: Listener[Event]*): Self = this.set("durationchange", js.Array(value :_*))
    
    @scala.inline
    def setDurationchange(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("durationchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationchange: Self = this.set("durationchange", js.undefined)
    
    @scala.inline
    def setEmptiedVarargs(value: Listener[Event]*): Self = this.set("emptied", js.Array(value :_*))
    
    @scala.inline
    def setEmptied(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("emptied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptied: Self = this.set("emptied", js.undefined)
    
    @scala.inline
    def setEndedVarargs(value: Listener[Event]*): Self = this.set("ended", js.Array(value :_*))
    
    @scala.inline
    def setEnded(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("ended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnded: Self = this.set("ended", js.undefined)
    
    @scala.inline
    def setErrorVarargs(value: Listener[ErrorEvent]*): Self = this.set("error", js.Array(value :_*))
    
    @scala.inline
    def setError(value: Listener[ErrorEvent] | js.Array[Listener[ErrorEvent]]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFocusVarargs(value: Listener[FocusEvent]*): Self = this.set("focus", js.Array(value :_*))
    
    @scala.inline
    def setFocus(value: Listener[FocusEvent] | js.Array[Listener[FocusEvent]]): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setFocusinVarargs(value: Listener[FocusEvent]*): Self = this.set("focusin", js.Array(value :_*))
    
    @scala.inline
    def setFocusin(value: Listener[FocusEvent] | js.Array[Listener[FocusEvent]]): Self = this.set("focusin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusin: Self = this.set("focusin", js.undefined)
    
    @scala.inline
    def setFocusoutVarargs(value: Listener[FocusEvent]*): Self = this.set("focusout", js.Array(value :_*))
    
    @scala.inline
    def setFocusout(value: Listener[FocusEvent] | js.Array[Listener[FocusEvent]]): Self = this.set("focusout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusout: Self = this.set("focusout", js.undefined)
    
    @scala.inline
    def setFullscreenchangeVarargs(value: Listener[Event]*): Self = this.set("fullscreenchange", js.Array(value :_*))
    
    @scala.inline
    def setFullscreenchange(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("fullscreenchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreenchange: Self = this.set("fullscreenchange", js.undefined)
    
    @scala.inline
    def setFullscreenerrorVarargs(value: Listener[Event]*): Self = this.set("fullscreenerror", js.Array(value :_*))
    
    @scala.inline
    def setFullscreenerror(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("fullscreenerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreenerror: Self = this.set("fullscreenerror", js.undefined)
    
    @scala.inline
    def setGotpointercaptureVarargs(value: Listener[PointerEvent]*): Self = this.set("gotpointercapture", js.Array(value :_*))
    
    @scala.inline
    def setGotpointercapture(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = this.set("gotpointercapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGotpointercapture: Self = this.set("gotpointercapture", js.undefined)
    
    @scala.inline
    def setInputVarargs(value: Listener[Event]*): Self = this.set("input", js.Array(value :_*))
    
    @scala.inline
    def setInput(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setInvalidVarargs(value: Listener[Event]*): Self = this.set("invalid", js.Array(value :_*))
    
    @scala.inline
    def setInvalid(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    
    @scala.inline
    def setKeydownVarargs(value: Listener[KeyboardEvent]*): Self = this.set("keydown", js.Array(value :_*))
    
    @scala.inline
    def setKeydown(value: Listener[KeyboardEvent] | js.Array[Listener[KeyboardEvent]]): Self = this.set("keydown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeydown: Self = this.set("keydown", js.undefined)
    
    @scala.inline
    def setKeypressVarargs(value: Listener[KeyboardEvent]*): Self = this.set("keypress", js.Array(value :_*))
    
    @scala.inline
    def setKeypress(value: Listener[KeyboardEvent] | js.Array[Listener[KeyboardEvent]]): Self = this.set("keypress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeypress: Self = this.set("keypress", js.undefined)
    
    @scala.inline
    def setKeyupVarargs(value: Listener[KeyboardEvent]*): Self = this.set("keyup", js.Array(value :_*))
    
    @scala.inline
    def setKeyup(value: Listener[KeyboardEvent] | js.Array[Listener[KeyboardEvent]]): Self = this.set("keyup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyup: Self = this.set("keyup", js.undefined)
    
    @scala.inline
    def setLoadVarargs(value: Listener[Event]*): Self = this.set("load", js.Array(value :_*))
    
    @scala.inline
    def setLoad(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLoadeddataVarargs(value: Listener[Event]*): Self = this.set("loadeddata", js.Array(value :_*))
    
    @scala.inline
    def setLoadeddata(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("loadeddata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadeddata: Self = this.set("loadeddata", js.undefined)
    
    @scala.inline
    def setLoadedmetadataVarargs(value: Listener[Event]*): Self = this.set("loadedmetadata", js.Array(value :_*))
    
    @scala.inline
    def setLoadedmetadata(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("loadedmetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadedmetadata: Self = this.set("loadedmetadata", js.undefined)
    
    @scala.inline
    def setLoadstartVarargs(value: Listener[Event]*): Self = this.set("loadstart", js.Array(value :_*))
    
    @scala.inline
    def setLoadstart(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("loadstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadstart: Self = this.set("loadstart", js.undefined)
    
    @scala.inline
    def setLostpointercaptureVarargs(value: Listener[PointerEvent]*): Self = this.set("lostpointercapture", js.Array(value :_*))
    
    @scala.inline
    def setLostpointercapture(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = this.set("lostpointercapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLostpointercapture: Self = this.set("lostpointercapture", js.undefined)
    
    @scala.inline
    def setMousedownVarargs(value: Listener[MouseEvent]*): Self = this.set("mousedown", js.Array(value :_*))
    
    @scala.inline
    def setMousedown(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = this.set("mousedown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMousedown: Self = this.set("mousedown", js.undefined)
    
    @scala.inline
    def setMouseenterVarargs(value: Listener[MouseEvent]*): Self = this.set("mouseenter", js.Array(value :_*))
    
    @scala.inline
    def setMouseenter(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = this.set("mouseenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseenter: Self = this.set("mouseenter", js.undefined)
    
    @scala.inline
    def setMouseleaveVarargs(value: Listener[MouseEvent]*): Self = this.set("mouseleave", js.Array(value :_*))
    
    @scala.inline
    def setMouseleave(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = this.set("mouseleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseleave: Self = this.set("mouseleave", js.undefined)
    
    @scala.inline
    def setMousemoveVarargs(value: Listener[MouseEvent]*): Self = this.set("mousemove", js.Array(value :_*))
    
    @scala.inline
    def setMousemove(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = this.set("mousemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMousemove: Self = this.set("mousemove", js.undefined)
    
    @scala.inline
    def setMouseoutVarargs(value: Listener[MouseEvent]*): Self = this.set("mouseout", js.Array(value :_*))
    
    @scala.inline
    def setMouseout(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = this.set("mouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseout: Self = this.set("mouseout", js.undefined)
    
    @scala.inline
    def setMouseoverVarargs(value: Listener[MouseEvent]*): Self = this.set("mouseover", js.Array(value :_*))
    
    @scala.inline
    def setMouseover(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = this.set("mouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseover: Self = this.set("mouseover", js.undefined)
    
    @scala.inline
    def setMouseupVarargs(value: Listener[MouseEvent]*): Self = this.set("mouseup", js.Array(value :_*))
    
    @scala.inline
    def setMouseup(value: Listener[MouseEvent] | js.Array[Listener[MouseEvent]]): Self = this.set("mouseup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseup: Self = this.set("mouseup", js.undefined)
    
    @scala.inline
    def setPasteVarargs(value: Listener[ClipboardEvent]*): Self = this.set("paste", js.Array(value :_*))
    
    @scala.inline
    def setPaste(value: Listener[ClipboardEvent] | js.Array[Listener[ClipboardEvent]]): Self = this.set("paste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaste: Self = this.set("paste", js.undefined)
    
    @scala.inline
    def setPauseVarargs(value: Listener[Event]*): Self = this.set("pause", js.Array(value :_*))
    
    @scala.inline
    def setPause(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    
    @scala.inline
    def setPlayVarargs(value: Listener[Event]*): Self = this.set("play", js.Array(value :_*))
    
    @scala.inline
    def setPlay(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("play", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    
    @scala.inline
    def setPlayingVarargs(value: Listener[Event]*): Self = this.set("playing", js.Array(value :_*))
    
    @scala.inline
    def setPlaying(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("playing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaying: Self = this.set("playing", js.undefined)
    
    @scala.inline
    def setPointercancelVarargs(value: Listener[PointerEvent]*): Self = this.set("pointercancel", js.Array(value :_*))
    
    @scala.inline
    def setPointercancel(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = this.set("pointercancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointercancel: Self = this.set("pointercancel", js.undefined)
    
    @scala.inline
    def setPointerdownVarargs(value: Listener[PointerEvent]*): Self = this.set("pointerdown", js.Array(value :_*))
    
    @scala.inline
    def setPointerdown(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = this.set("pointerdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerdown: Self = this.set("pointerdown", js.undefined)
    
    @scala.inline
    def setPointerenterVarargs(value: Listener[PointerEvent]*): Self = this.set("pointerenter", js.Array(value :_*))
    
    @scala.inline
    def setPointerenter(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = this.set("pointerenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerenter: Self = this.set("pointerenter", js.undefined)
    
    @scala.inline
    def setPointerleaveVarargs(value: Listener[PointerEvent]*): Self = this.set("pointerleave", js.Array(value :_*))
    
    @scala.inline
    def setPointerleave(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = this.set("pointerleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerleave: Self = this.set("pointerleave", js.undefined)
    
    @scala.inline
    def setPointermoveVarargs(value: Listener[PointerEvent]*): Self = this.set("pointermove", js.Array(value :_*))
    
    @scala.inline
    def setPointermove(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = this.set("pointermove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointermove: Self = this.set("pointermove", js.undefined)
    
    @scala.inline
    def setPointeroutVarargs(value: Listener[PointerEvent]*): Self = this.set("pointerout", js.Array(value :_*))
    
    @scala.inline
    def setPointerout(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = this.set("pointerout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerout: Self = this.set("pointerout", js.undefined)
    
    @scala.inline
    def setPointeroverVarargs(value: Listener[PointerEvent]*): Self = this.set("pointerover", js.Array(value :_*))
    
    @scala.inline
    def setPointerover(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = this.set("pointerover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerover: Self = this.set("pointerover", js.undefined)
    
    @scala.inline
    def setPointerupVarargs(value: Listener[PointerEvent]*): Self = this.set("pointerup", js.Array(value :_*))
    
    @scala.inline
    def setPointerup(value: Listener[PointerEvent] | js.Array[Listener[PointerEvent]]): Self = this.set("pointerup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerup: Self = this.set("pointerup", js.undefined)
    
    @scala.inline
    def setProgressVarargs(value: Listener[ProgressEvent[EventTarget]]*): Self = this.set("progress", js.Array(value :_*))
    
    @scala.inline
    def setProgress(value: Listener[ProgressEvent[EventTarget]] | js.Array[Listener[ProgressEvent[EventTarget]]]): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setRatechangeVarargs(value: Listener[Event]*): Self = this.set("ratechange", js.Array(value :_*))
    
    @scala.inline
    def setRatechange(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("ratechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatechange: Self = this.set("ratechange", js.undefined)
    
    @scala.inline
    def setResetVarargs(value: Listener[Event]*): Self = this.set("reset", js.Array(value :_*))
    
    @scala.inline
    def setReset(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setResizeVarargs(value: Listener[UIEvent]*): Self = this.set("resize", js.Array(value :_*))
    
    @scala.inline
    def setResize(value: Listener[UIEvent] | js.Array[Listener[UIEvent]]): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setScrollVarargs(value: Listener[Event]*): Self = this.set("scroll", js.Array(value :_*))
    
    @scala.inline
    def setScroll(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setSecuritypolicyviolationVarargs(value: Listener[SecurityPolicyViolationEvent]*): Self = this.set("securitypolicyviolation", js.Array(value :_*))
    
    @scala.inline
    def setSecuritypolicyviolation(value: Listener[SecurityPolicyViolationEvent] | js.Array[Listener[SecurityPolicyViolationEvent]]): Self = this.set("securitypolicyviolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecuritypolicyviolation: Self = this.set("securitypolicyviolation", js.undefined)
    
    @scala.inline
    def setSeekedVarargs(value: Listener[Event]*): Self = this.set("seeked", js.Array(value :_*))
    
    @scala.inline
    def setSeeked(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("seeked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeeked: Self = this.set("seeked", js.undefined)
    
    @scala.inline
    def setSeekingVarargs(value: Listener[Event]*): Self = this.set("seeking", js.Array(value :_*))
    
    @scala.inline
    def setSeeking(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("seeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeeking: Self = this.set("seeking", js.undefined)
    
    @scala.inline
    def setSelectVarargs(value: Listener[Event]*): Self = this.set("select", js.Array(value :_*))
    
    @scala.inline
    def setSelect(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSelectionchangeVarargs(value: Listener[Event]*): Self = this.set("selectionchange", js.Array(value :_*))
    
    @scala.inline
    def setSelectionchange(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("selectionchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionchange: Self = this.set("selectionchange", js.undefined)
    
    @scala.inline
    def setSelectstartVarargs(value: Listener[Event]*): Self = this.set("selectstart", js.Array(value :_*))
    
    @scala.inline
    def setSelectstart(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("selectstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectstart: Self = this.set("selectstart", js.undefined)
    
    @scala.inline
    def setStalledVarargs(value: Listener[Event]*): Self = this.set("stalled", js.Array(value :_*))
    
    @scala.inline
    def setStalled(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("stalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStalled: Self = this.set("stalled", js.undefined)
    
    @scala.inline
    def setSubmitVarargs(value: Listener[Event]*): Self = this.set("submit", js.Array(value :_*))
    
    @scala.inline
    def setSubmit(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("submit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmit: Self = this.set("submit", js.undefined)
    
    @scala.inline
    def setSuspendVarargs(value: Listener[Event]*): Self = this.set("suspend", js.Array(value :_*))
    
    @scala.inline
    def setSuspend(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("suspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspend: Self = this.set("suspend", js.undefined)
    
    @scala.inline
    def setTimeupdateVarargs(value: Listener[Event]*): Self = this.set("timeupdate", js.Array(value :_*))
    
    @scala.inline
    def setTimeupdate(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("timeupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeupdate: Self = this.set("timeupdate", js.undefined)
    
    @scala.inline
    def setToggleVarargs(value: Listener[Event]*): Self = this.set("toggle", js.Array(value :_*))
    
    @scala.inline
    def setToggle(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    
    @scala.inline
    def setTouchcancelVarargs(value: Listener[TouchEvent]*): Self = this.set("touchcancel", js.Array(value :_*))
    
    @scala.inline
    def setTouchcancel(value: Listener[TouchEvent] | js.Array[Listener[TouchEvent]]): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchcancel: Self = this.set("touchcancel", js.undefined)
    
    @scala.inline
    def setTouchendVarargs(value: Listener[TouchEvent]*): Self = this.set("touchend", js.Array(value :_*))
    
    @scala.inline
    def setTouchend(value: Listener[TouchEvent] | js.Array[Listener[TouchEvent]]): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchend: Self = this.set("touchend", js.undefined)
    
    @scala.inline
    def setTouchmoveVarargs(value: Listener[TouchEvent]*): Self = this.set("touchmove", js.Array(value :_*))
    
    @scala.inline
    def setTouchmove(value: Listener[TouchEvent] | js.Array[Listener[TouchEvent]]): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchmove: Self = this.set("touchmove", js.undefined)
    
    @scala.inline
    def setTouchstartVarargs(value: Listener[TouchEvent]*): Self = this.set("touchstart", js.Array(value :_*))
    
    @scala.inline
    def setTouchstart(value: Listener[TouchEvent] | js.Array[Listener[TouchEvent]]): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchstart: Self = this.set("touchstart", js.undefined)
    
    @scala.inline
    def setTransitioncancelVarargs(value: Listener[TransitionEvent]*): Self = this.set("transitioncancel", js.Array(value :_*))
    
    @scala.inline
    def setTransitioncancel(value: Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]): Self = this.set("transitioncancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitioncancel: Self = this.set("transitioncancel", js.undefined)
    
    @scala.inline
    def setTransitionendVarargs(value: Listener[TransitionEvent]*): Self = this.set("transitionend", js.Array(value :_*))
    
    @scala.inline
    def setTransitionend(value: Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]): Self = this.set("transitionend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionend: Self = this.set("transitionend", js.undefined)
    
    @scala.inline
    def setTransitionrunVarargs(value: Listener[TransitionEvent]*): Self = this.set("transitionrun", js.Array(value :_*))
    
    @scala.inline
    def setTransitionrun(value: Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]): Self = this.set("transitionrun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionrun: Self = this.set("transitionrun", js.undefined)
    
    @scala.inline
    def setTransitionstartVarargs(value: Listener[TransitionEvent]*): Self = this.set("transitionstart", js.Array(value :_*))
    
    @scala.inline
    def setTransitionstart(value: Listener[TransitionEvent] | js.Array[Listener[TransitionEvent]]): Self = this.set("transitionstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionstart: Self = this.set("transitionstart", js.undefined)
    
    @scala.inline
    def setVolumechangeVarargs(value: Listener[Event]*): Self = this.set("volumechange", js.Array(value :_*))
    
    @scala.inline
    def setVolumechange(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("volumechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumechange: Self = this.set("volumechange", js.undefined)
    
    @scala.inline
    def setWaitingVarargs(value: Listener[Event]*): Self = this.set("waiting", js.Array(value :_*))
    
    @scala.inline
    def setWaiting(value: Listener[Event] | js.Array[Listener[Event]]): Self = this.set("waiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaiting: Self = this.set("waiting", js.undefined)
    
    @scala.inline
    def setWheelVarargs(value: Listener[WheelEvent]*): Self = this.set("wheel", js.Array(value :_*))
    
    @scala.inline
    def setWheel(value: Listener[WheelEvent] | js.Array[Listener[WheelEvent]]): Self = this.set("wheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheel: Self = this.set("wheel", js.undefined)
  }
}
