package typings.snabbdom.eventlistenersMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventListener
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
import scala.scalajs.js.annotation._

/* Inlined {[ N in keyof std.HTMLElementEventMap ]:? (ev : std.HTMLElementEventMap[N]): void} & {[event: string] : std.EventListener} */
@js.native
trait On extends /* event */ StringDictionary[EventListener] {
  var abort: js.UndefOr[js.Function1[/* ev */ UIEvent, Unit]] = js.native
  var animationcancel: js.UndefOr[js.Function1[/* ev */ AnimationEvent, Unit]] = js.native
  var animationend: js.UndefOr[js.Function1[/* ev */ AnimationEvent, Unit]] = js.native
  var animationiteration: js.UndefOr[js.Function1[/* ev */ AnimationEvent, Unit]] = js.native
  var animationstart: js.UndefOr[js.Function1[/* ev */ AnimationEvent, Unit]] = js.native
  var auxclick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var blur: js.UndefOr[js.Function1[/* ev */ FocusEvent, Unit]] = js.native
  var cancel: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var canplay: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var canplaythrough: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var change: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var click: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var close: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var contextmenu: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var copy: js.UndefOr[js.Function1[/* ev */ ClipboardEvent, Unit]] = js.native
  var cuechange: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var cut: js.UndefOr[js.Function1[/* ev */ ClipboardEvent, Unit]] = js.native
  var dblclick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var drag: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.native
  var dragend: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.native
  var dragenter: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.native
  var dragexit: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var dragleave: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.native
  var dragover: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.native
  var dragstart: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.native
  var drop: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.native
  var durationchange: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var emptied: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var ended: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var error: js.UndefOr[js.Function1[/* ev */ ErrorEvent, Unit]] = js.native
  var focus: js.UndefOr[js.Function1[/* ev */ FocusEvent, Unit]] = js.native
  var focusin: js.UndefOr[js.Function1[/* ev */ FocusEvent, Unit]] = js.native
  var focusout: js.UndefOr[js.Function1[/* ev */ FocusEvent, Unit]] = js.native
  var fullscreenchange: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var fullscreenerror: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var gotpointercapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var input: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var invalid: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var keydown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Unit]] = js.native
  var keypress: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Unit]] = js.native
  var keyup: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Unit]] = js.native
  var load: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var loadeddata: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var loadedmetadata: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var loadstart: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var lostpointercapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var mousedown: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var mouseenter: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var mouseleave: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var mousemove: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var mouseout: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var mouseover: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var mouseup: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.native
  var paste: js.UndefOr[js.Function1[/* ev */ ClipboardEvent, Unit]] = js.native
  var pause: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var play: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var playing: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var pointercancel: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var pointerdown: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var pointerenter: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var pointerleave: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var pointermove: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var pointerout: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var pointerover: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var pointerup: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.native
  var progress: js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]] = js.native
  var ratechange: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var reset: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var resize: js.UndefOr[js.Function1[/* ev */ UIEvent, Unit]] = js.native
  var scroll: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var securitypolicyviolation: js.UndefOr[js.Function1[/* ev */ SecurityPolicyViolationEvent, Unit]] = js.native
  var seeked: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var seeking: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var select: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var selectionchange: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var selectstart: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var stalled: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var submit: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var suspend: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var timeupdate: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var toggle: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var touchcancel: js.UndefOr[js.Function1[/* ev */ TouchEvent, Unit]] = js.native
  var touchend: js.UndefOr[js.Function1[/* ev */ TouchEvent, Unit]] = js.native
  var touchmove: js.UndefOr[js.Function1[/* ev */ TouchEvent, Unit]] = js.native
  var touchstart: js.UndefOr[js.Function1[/* ev */ TouchEvent, Unit]] = js.native
  var transitioncancel: js.UndefOr[js.Function1[/* ev */ TransitionEvent, Unit]] = js.native
  var transitionend: js.UndefOr[js.Function1[/* ev */ TransitionEvent, Unit]] = js.native
  var transitionrun: js.UndefOr[js.Function1[/* ev */ TransitionEvent, Unit]] = js.native
  var transitionstart: js.UndefOr[js.Function1[/* ev */ TransitionEvent, Unit]] = js.native
  var volumechange: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var waiting: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.native
  var wheel: js.UndefOr[js.Function1[/* ev */ WheelEvent, Unit]] = js.native
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
    def setAbort(value: /* ev */ UIEvent => Unit): Self = this.set("abort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    @scala.inline
    def setAnimationcancel(value: /* ev */ AnimationEvent => Unit): Self = this.set("animationcancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAnimationcancel: Self = this.set("animationcancel", js.undefined)
    @scala.inline
    def setAnimationend(value: /* ev */ AnimationEvent => Unit): Self = this.set("animationend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAnimationend: Self = this.set("animationend", js.undefined)
    @scala.inline
    def setAnimationiteration(value: /* ev */ AnimationEvent => Unit): Self = this.set("animationiteration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAnimationiteration: Self = this.set("animationiteration", js.undefined)
    @scala.inline
    def setAnimationstart(value: /* ev */ AnimationEvent => Unit): Self = this.set("animationstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAnimationstart: Self = this.set("animationstart", js.undefined)
    @scala.inline
    def setAuxclick(value: /* ev */ MouseEvent => Unit): Self = this.set("auxclick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAuxclick: Self = this.set("auxclick", js.undefined)
    @scala.inline
    def setBlur(value: /* ev */ FocusEvent => Unit): Self = this.set("blur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    @scala.inline
    def setCancel(value: /* ev */ Event => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setCanplay(value: /* ev */ Event => Unit): Self = this.set("canplay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCanplay: Self = this.set("canplay", js.undefined)
    @scala.inline
    def setCanplaythrough(value: /* ev */ Event => Unit): Self = this.set("canplaythrough", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCanplaythrough: Self = this.set("canplaythrough", js.undefined)
    @scala.inline
    def setChange(value: /* ev */ Event => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setClick(value: /* ev */ MouseEvent => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setClose(value: /* ev */ Event => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setContextmenu(value: /* ev */ MouseEvent => Unit): Self = this.set("contextmenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContextmenu: Self = this.set("contextmenu", js.undefined)
    @scala.inline
    def setCopy(value: /* ev */ ClipboardEvent => Unit): Self = this.set("copy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    @scala.inline
    def setCuechange(value: /* ev */ Event => Unit): Self = this.set("cuechange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCuechange: Self = this.set("cuechange", js.undefined)
    @scala.inline
    def setCut(value: /* ev */ ClipboardEvent => Unit): Self = this.set("cut", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCut: Self = this.set("cut", js.undefined)
    @scala.inline
    def setDblclick(value: /* ev */ MouseEvent => Unit): Self = this.set("dblclick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDblclick: Self = this.set("dblclick", js.undefined)
    @scala.inline
    def setDrag(value: /* ev */ DragEvent => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setDragend(value: /* ev */ DragEvent => Unit): Self = this.set("dragend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragend: Self = this.set("dragend", js.undefined)
    @scala.inline
    def setDragenter(value: /* ev */ DragEvent => Unit): Self = this.set("dragenter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragenter: Self = this.set("dragenter", js.undefined)
    @scala.inline
    def setDragexit(value: /* ev */ Event => Unit): Self = this.set("dragexit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragexit: Self = this.set("dragexit", js.undefined)
    @scala.inline
    def setDragleave(value: /* ev */ DragEvent => Unit): Self = this.set("dragleave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragleave: Self = this.set("dragleave", js.undefined)
    @scala.inline
    def setDragover(value: /* ev */ DragEvent => Unit): Self = this.set("dragover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragover: Self = this.set("dragover", js.undefined)
    @scala.inline
    def setDragstart(value: /* ev */ DragEvent => Unit): Self = this.set("dragstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragstart: Self = this.set("dragstart", js.undefined)
    @scala.inline
    def setDrop(value: /* ev */ DragEvent => Unit): Self = this.set("drop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    @scala.inline
    def setDurationchange(value: /* ev */ Event => Unit): Self = this.set("durationchange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDurationchange: Self = this.set("durationchange", js.undefined)
    @scala.inline
    def setEmptied(value: /* ev */ Event => Unit): Self = this.set("emptied", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEmptied: Self = this.set("emptied", js.undefined)
    @scala.inline
    def setEnded(value: /* ev */ Event => Unit): Self = this.set("ended", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEnded: Self = this.set("ended", js.undefined)
    @scala.inline
    def setError(value: /* ev */ ErrorEvent => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFocus(value: /* ev */ FocusEvent => Unit): Self = this.set("focus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setFocusin(value: /* ev */ FocusEvent => Unit): Self = this.set("focusin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFocusin: Self = this.set("focusin", js.undefined)
    @scala.inline
    def setFocusout(value: /* ev */ FocusEvent => Unit): Self = this.set("focusout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFocusout: Self = this.set("focusout", js.undefined)
    @scala.inline
    def setFullscreenchange(value: /* ev */ Event => Unit): Self = this.set("fullscreenchange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFullscreenchange: Self = this.set("fullscreenchange", js.undefined)
    @scala.inline
    def setFullscreenerror(value: /* ev */ Event => Unit): Self = this.set("fullscreenerror", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFullscreenerror: Self = this.set("fullscreenerror", js.undefined)
    @scala.inline
    def setGotpointercapture(value: /* ev */ PointerEvent => Unit): Self = this.set("gotpointercapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGotpointercapture: Self = this.set("gotpointercapture", js.undefined)
    @scala.inline
    def setInput(value: /* ev */ Event => Unit): Self = this.set("input", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setInvalid(value: /* ev */ Event => Unit): Self = this.set("invalid", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    @scala.inline
    def setKeydown(value: /* ev */ KeyboardEvent => Unit): Self = this.set("keydown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeydown: Self = this.set("keydown", js.undefined)
    @scala.inline
    def setKeypress(value: /* ev */ KeyboardEvent => Unit): Self = this.set("keypress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeypress: Self = this.set("keypress", js.undefined)
    @scala.inline
    def setKeyup(value: /* ev */ KeyboardEvent => Unit): Self = this.set("keyup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeyup: Self = this.set("keyup", js.undefined)
    @scala.inline
    def setLoad(value: /* ev */ Event => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setLoadeddata(value: /* ev */ Event => Unit): Self = this.set("loadeddata", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoadeddata: Self = this.set("loadeddata", js.undefined)
    @scala.inline
    def setLoadedmetadata(value: /* ev */ Event => Unit): Self = this.set("loadedmetadata", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoadedmetadata: Self = this.set("loadedmetadata", js.undefined)
    @scala.inline
    def setLoadstart(value: /* ev */ Event => Unit): Self = this.set("loadstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoadstart: Self = this.set("loadstart", js.undefined)
    @scala.inline
    def setLostpointercapture(value: /* ev */ PointerEvent => Unit): Self = this.set("lostpointercapture", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLostpointercapture: Self = this.set("lostpointercapture", js.undefined)
    @scala.inline
    def setMousedown(value: /* ev */ MouseEvent => Unit): Self = this.set("mousedown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMousedown: Self = this.set("mousedown", js.undefined)
    @scala.inline
    def setMouseenter(value: /* ev */ MouseEvent => Unit): Self = this.set("mouseenter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseenter: Self = this.set("mouseenter", js.undefined)
    @scala.inline
    def setMouseleave(value: /* ev */ MouseEvent => Unit): Self = this.set("mouseleave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseleave: Self = this.set("mouseleave", js.undefined)
    @scala.inline
    def setMousemove(value: /* ev */ MouseEvent => Unit): Self = this.set("mousemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMousemove: Self = this.set("mousemove", js.undefined)
    @scala.inline
    def setMouseout(value: /* ev */ MouseEvent => Unit): Self = this.set("mouseout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseout: Self = this.set("mouseout", js.undefined)
    @scala.inline
    def setMouseover(value: /* ev */ MouseEvent => Unit): Self = this.set("mouseover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseover: Self = this.set("mouseover", js.undefined)
    @scala.inline
    def setMouseup(value: /* ev */ MouseEvent => Unit): Self = this.set("mouseup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseup: Self = this.set("mouseup", js.undefined)
    @scala.inline
    def setPaste(value: /* ev */ ClipboardEvent => Unit): Self = this.set("paste", js.Any.fromFunction1(value))
    @scala.inline
    def deletePaste: Self = this.set("paste", js.undefined)
    @scala.inline
    def setPause(value: /* ev */ Event => Unit): Self = this.set("pause", js.Any.fromFunction1(value))
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    @scala.inline
    def setPlay(value: /* ev */ Event => Unit): Self = this.set("play", js.Any.fromFunction1(value))
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    @scala.inline
    def setPlaying(value: /* ev */ Event => Unit): Self = this.set("playing", js.Any.fromFunction1(value))
    @scala.inline
    def deletePlaying: Self = this.set("playing", js.undefined)
    @scala.inline
    def setPointercancel(value: /* ev */ PointerEvent => Unit): Self = this.set("pointercancel", js.Any.fromFunction1(value))
    @scala.inline
    def deletePointercancel: Self = this.set("pointercancel", js.undefined)
    @scala.inline
    def setPointerdown(value: /* ev */ PointerEvent => Unit): Self = this.set("pointerdown", js.Any.fromFunction1(value))
    @scala.inline
    def deletePointerdown: Self = this.set("pointerdown", js.undefined)
    @scala.inline
    def setPointerenter(value: /* ev */ PointerEvent => Unit): Self = this.set("pointerenter", js.Any.fromFunction1(value))
    @scala.inline
    def deletePointerenter: Self = this.set("pointerenter", js.undefined)
    @scala.inline
    def setPointerleave(value: /* ev */ PointerEvent => Unit): Self = this.set("pointerleave", js.Any.fromFunction1(value))
    @scala.inline
    def deletePointerleave: Self = this.set("pointerleave", js.undefined)
    @scala.inline
    def setPointermove(value: /* ev */ PointerEvent => Unit): Self = this.set("pointermove", js.Any.fromFunction1(value))
    @scala.inline
    def deletePointermove: Self = this.set("pointermove", js.undefined)
    @scala.inline
    def setPointerout(value: /* ev */ PointerEvent => Unit): Self = this.set("pointerout", js.Any.fromFunction1(value))
    @scala.inline
    def deletePointerout: Self = this.set("pointerout", js.undefined)
    @scala.inline
    def setPointerover(value: /* ev */ PointerEvent => Unit): Self = this.set("pointerover", js.Any.fromFunction1(value))
    @scala.inline
    def deletePointerover: Self = this.set("pointerover", js.undefined)
    @scala.inline
    def setPointerup(value: /* ev */ PointerEvent => Unit): Self = this.set("pointerup", js.Any.fromFunction1(value))
    @scala.inline
    def deletePointerup: Self = this.set("pointerup", js.undefined)
    @scala.inline
    def setProgress(value: /* ev */ ProgressEvent[EventTarget] => Unit): Self = this.set("progress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setRatechange(value: /* ev */ Event => Unit): Self = this.set("ratechange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRatechange: Self = this.set("ratechange", js.undefined)
    @scala.inline
    def setReset(value: /* ev */ Event => Unit): Self = this.set("reset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setResize(value: /* ev */ UIEvent => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setScroll(value: /* ev */ Event => Unit): Self = this.set("scroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setSecuritypolicyviolation(value: /* ev */ SecurityPolicyViolationEvent => Unit): Self = this.set("securitypolicyviolation", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSecuritypolicyviolation: Self = this.set("securitypolicyviolation", js.undefined)
    @scala.inline
    def setSeeked(value: /* ev */ Event => Unit): Self = this.set("seeked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSeeked: Self = this.set("seeked", js.undefined)
    @scala.inline
    def setSeeking(value: /* ev */ Event => Unit): Self = this.set("seeking", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSeeking: Self = this.set("seeking", js.undefined)
    @scala.inline
    def setSelect(value: /* ev */ Event => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSelectionchange(value: /* ev */ Event => Unit): Self = this.set("selectionchange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectionchange: Self = this.set("selectionchange", js.undefined)
    @scala.inline
    def setSelectstart(value: /* ev */ Event => Unit): Self = this.set("selectstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectstart: Self = this.set("selectstart", js.undefined)
    @scala.inline
    def setStalled(value: /* ev */ Event => Unit): Self = this.set("stalled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStalled: Self = this.set("stalled", js.undefined)
    @scala.inline
    def setSubmit(value: /* ev */ Event => Unit): Self = this.set("submit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSubmit: Self = this.set("submit", js.undefined)
    @scala.inline
    def setSuspend(value: /* ev */ Event => Unit): Self = this.set("suspend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuspend: Self = this.set("suspend", js.undefined)
    @scala.inline
    def setTimeupdate(value: /* ev */ Event => Unit): Self = this.set("timeupdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTimeupdate: Self = this.set("timeupdate", js.undefined)
    @scala.inline
    def setToggle(value: /* ev */ Event => Unit): Self = this.set("toggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    @scala.inline
    def setTouchcancel(value: /* ev */ TouchEvent => Unit): Self = this.set("touchcancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTouchcancel: Self = this.set("touchcancel", js.undefined)
    @scala.inline
    def setTouchend(value: /* ev */ TouchEvent => Unit): Self = this.set("touchend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTouchend: Self = this.set("touchend", js.undefined)
    @scala.inline
    def setTouchmove(value: /* ev */ TouchEvent => Unit): Self = this.set("touchmove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTouchmove: Self = this.set("touchmove", js.undefined)
    @scala.inline
    def setTouchstart(value: /* ev */ TouchEvent => Unit): Self = this.set("touchstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTouchstart: Self = this.set("touchstart", js.undefined)
    @scala.inline
    def setTransitioncancel(value: /* ev */ TransitionEvent => Unit): Self = this.set("transitioncancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransitioncancel: Self = this.set("transitioncancel", js.undefined)
    @scala.inline
    def setTransitionend(value: /* ev */ TransitionEvent => Unit): Self = this.set("transitionend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransitionend: Self = this.set("transitionend", js.undefined)
    @scala.inline
    def setTransitionrun(value: /* ev */ TransitionEvent => Unit): Self = this.set("transitionrun", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransitionrun: Self = this.set("transitionrun", js.undefined)
    @scala.inline
    def setTransitionstart(value: /* ev */ TransitionEvent => Unit): Self = this.set("transitionstart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransitionstart: Self = this.set("transitionstart", js.undefined)
    @scala.inline
    def setVolumechange(value: /* ev */ Event => Unit): Self = this.set("volumechange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteVolumechange: Self = this.set("volumechange", js.undefined)
    @scala.inline
    def setWaiting(value: /* ev */ Event => Unit): Self = this.set("waiting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWaiting: Self = this.set("waiting", js.undefined)
    @scala.inline
    def setWheel(value: /* ev */ WheelEvent => Unit): Self = this.set("wheel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWheel: Self = this.set("wheel", js.undefined)
  }
  
}

