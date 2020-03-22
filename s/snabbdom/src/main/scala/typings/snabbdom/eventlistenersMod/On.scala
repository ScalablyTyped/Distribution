package typings.snabbdom.eventlistenersMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.EventListener
import typings.std.EventTarget
import typings.std.Event_
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
trait On extends /* event */ StringDictionary[EventListener] {
  var abort: js.UndefOr[js.Function1[/* ev */ UIEvent, Unit]] = js.undefined
  var animationcancel: js.UndefOr[js.Function1[/* ev */ AnimationEvent, Unit]] = js.undefined
  var animationend: js.UndefOr[js.Function1[/* ev */ AnimationEvent, Unit]] = js.undefined
  var animationiteration: js.UndefOr[js.Function1[/* ev */ AnimationEvent, Unit]] = js.undefined
  var animationstart: js.UndefOr[js.Function1[/* ev */ AnimationEvent, Unit]] = js.undefined
  var auxclick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var blur: js.UndefOr[js.Function1[/* ev */ FocusEvent, Unit]] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var canplay: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var canplaythrough: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var click: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var contextmenu: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var copy: js.UndefOr[js.Function1[/* ev */ ClipboardEvent, Unit]] = js.undefined
  var cuechange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var cut: js.UndefOr[js.Function1[/* ev */ ClipboardEvent, Unit]] = js.undefined
  var dblclick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var drag: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.undefined
  var dragenter: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.undefined
  var dragexit: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var dragleave: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.undefined
  var dragover: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* ev */ DragEvent, Unit]] = js.undefined
  var durationchange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var emptied: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var ended: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* ev */ ErrorEvent, Unit]] = js.undefined
  var focus: js.UndefOr[js.Function1[/* ev */ FocusEvent, Unit]] = js.undefined
  var focusin: js.UndefOr[js.Function1[/* ev */ FocusEvent, Unit]] = js.undefined
  var focusout: js.UndefOr[js.Function1[/* ev */ FocusEvent, Unit]] = js.undefined
  var fullscreenchange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var fullscreenerror: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var gotpointercapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var input: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var invalid: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var keydown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Unit]] = js.undefined
  var keypress: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Unit]] = js.undefined
  var keyup: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Unit]] = js.undefined
  var load: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var loadeddata: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var loadedmetadata: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var loadstart: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var lostpointercapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var mousedown: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var mouseenter: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var mouseleave: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var mousemove: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var mouseout: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var mouseover: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var mouseup: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  var paste: js.UndefOr[js.Function1[/* ev */ ClipboardEvent, Unit]] = js.undefined
  var pause: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var play: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var playing: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var pointercancel: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var pointerdown: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var pointerenter: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var pointerleave: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var pointermove: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var pointerout: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var pointerover: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var pointerup: js.UndefOr[js.Function1[/* ev */ PointerEvent, Unit]] = js.undefined
  var progress: js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]] = js.undefined
  var ratechange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var reset: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var resize: js.UndefOr[js.Function1[/* ev */ UIEvent, Unit]] = js.undefined
  var scroll: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var securitypolicyviolation: js.UndefOr[js.Function1[/* ev */ SecurityPolicyViolationEvent, Unit]] = js.undefined
  var seeked: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var seeking: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var select: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var selectionchange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var selectstart: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var stalled: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var submit: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var suspend: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var timeupdate: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var toggle: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var touchcancel: js.UndefOr[js.Function1[/* ev */ TouchEvent, Unit]] = js.undefined
  var touchend: js.UndefOr[js.Function1[/* ev */ TouchEvent, Unit]] = js.undefined
  var touchmove: js.UndefOr[js.Function1[/* ev */ TouchEvent, Unit]] = js.undefined
  var touchstart: js.UndefOr[js.Function1[/* ev */ TouchEvent, Unit]] = js.undefined
  var transitioncancel: js.UndefOr[js.Function1[/* ev */ TransitionEvent, Unit]] = js.undefined
  var transitionend: js.UndefOr[js.Function1[/* ev */ TransitionEvent, Unit]] = js.undefined
  var transitionrun: js.UndefOr[js.Function1[/* ev */ TransitionEvent, Unit]] = js.undefined
  var transitionstart: js.UndefOr[js.Function1[/* ev */ TransitionEvent, Unit]] = js.undefined
  var volumechange: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var waiting: js.UndefOr[js.Function1[/* ev */ Event_, Unit]] = js.undefined
  var wheel: js.UndefOr[js.Function1[/* ev */ WheelEvent, Unit]] = js.undefined
}

object On {
  @scala.inline
  def apply(
    StringDictionary: /* event */ StringDictionary[EventListener] = null,
    abort: /* ev */ UIEvent => Unit = null,
    animationcancel: /* ev */ AnimationEvent => Unit = null,
    animationend: /* ev */ AnimationEvent => Unit = null,
    animationiteration: /* ev */ AnimationEvent => Unit = null,
    animationstart: /* ev */ AnimationEvent => Unit = null,
    auxclick: /* ev */ MouseEvent => Unit = null,
    blur: /* ev */ FocusEvent => Unit = null,
    cancel: /* ev */ Event_ => Unit = null,
    canplay: /* ev */ Event_ => Unit = null,
    canplaythrough: /* ev */ Event_ => Unit = null,
    change: /* ev */ Event_ => Unit = null,
    click: /* ev */ MouseEvent => Unit = null,
    close: /* ev */ Event_ => Unit = null,
    contextmenu: /* ev */ MouseEvent => Unit = null,
    copy: /* ev */ ClipboardEvent => Unit = null,
    cuechange: /* ev */ Event_ => Unit = null,
    cut: /* ev */ ClipboardEvent => Unit = null,
    dblclick: /* ev */ MouseEvent => Unit = null,
    drag: /* ev */ DragEvent => Unit = null,
    dragend: /* ev */ DragEvent => Unit = null,
    dragenter: /* ev */ DragEvent => Unit = null,
    dragexit: /* ev */ Event_ => Unit = null,
    dragleave: /* ev */ DragEvent => Unit = null,
    dragover: /* ev */ DragEvent => Unit = null,
    dragstart: /* ev */ DragEvent => Unit = null,
    drop: /* ev */ DragEvent => Unit = null,
    durationchange: /* ev */ Event_ => Unit = null,
    emptied: /* ev */ Event_ => Unit = null,
    ended: /* ev */ Event_ => Unit = null,
    error: /* ev */ ErrorEvent => Unit = null,
    focus: /* ev */ FocusEvent => Unit = null,
    focusin: /* ev */ FocusEvent => Unit = null,
    focusout: /* ev */ FocusEvent => Unit = null,
    fullscreenchange: /* ev */ Event_ => Unit = null,
    fullscreenerror: /* ev */ Event_ => Unit = null,
    gotpointercapture: /* ev */ PointerEvent => Unit = null,
    input: /* ev */ Event_ => Unit = null,
    invalid: /* ev */ Event_ => Unit = null,
    keydown: /* ev */ KeyboardEvent => Unit = null,
    keypress: /* ev */ KeyboardEvent => Unit = null,
    keyup: /* ev */ KeyboardEvent => Unit = null,
    load: /* ev */ Event_ => Unit = null,
    loadeddata: /* ev */ Event_ => Unit = null,
    loadedmetadata: /* ev */ Event_ => Unit = null,
    loadstart: /* ev */ Event_ => Unit = null,
    lostpointercapture: /* ev */ PointerEvent => Unit = null,
    mousedown: /* ev */ MouseEvent => Unit = null,
    mouseenter: /* ev */ MouseEvent => Unit = null,
    mouseleave: /* ev */ MouseEvent => Unit = null,
    mousemove: /* ev */ MouseEvent => Unit = null,
    mouseout: /* ev */ MouseEvent => Unit = null,
    mouseover: /* ev */ MouseEvent => Unit = null,
    mouseup: /* ev */ MouseEvent => Unit = null,
    paste: /* ev */ ClipboardEvent => Unit = null,
    pause: /* ev */ Event_ => Unit = null,
    play: /* ev */ Event_ => Unit = null,
    playing: /* ev */ Event_ => Unit = null,
    pointercancel: /* ev */ PointerEvent => Unit = null,
    pointerdown: /* ev */ PointerEvent => Unit = null,
    pointerenter: /* ev */ PointerEvent => Unit = null,
    pointerleave: /* ev */ PointerEvent => Unit = null,
    pointermove: /* ev */ PointerEvent => Unit = null,
    pointerout: /* ev */ PointerEvent => Unit = null,
    pointerover: /* ev */ PointerEvent => Unit = null,
    pointerup: /* ev */ PointerEvent => Unit = null,
    progress: /* ev */ ProgressEvent[EventTarget] => Unit = null,
    ratechange: /* ev */ Event_ => Unit = null,
    reset: /* ev */ Event_ => Unit = null,
    resize: /* ev */ UIEvent => Unit = null,
    scroll: /* ev */ Event_ => Unit = null,
    securitypolicyviolation: /* ev */ SecurityPolicyViolationEvent => Unit = null,
    seeked: /* ev */ Event_ => Unit = null,
    seeking: /* ev */ Event_ => Unit = null,
    select: /* ev */ Event_ => Unit = null,
    selectionchange: /* ev */ Event_ => Unit = null,
    selectstart: /* ev */ Event_ => Unit = null,
    stalled: /* ev */ Event_ => Unit = null,
    submit: /* ev */ Event_ => Unit = null,
    suspend: /* ev */ Event_ => Unit = null,
    timeupdate: /* ev */ Event_ => Unit = null,
    toggle: /* ev */ Event_ => Unit = null,
    touchcancel: /* ev */ TouchEvent => Unit = null,
    touchend: /* ev */ TouchEvent => Unit = null,
    touchmove: /* ev */ TouchEvent => Unit = null,
    touchstart: /* ev */ TouchEvent => Unit = null,
    transitioncancel: /* ev */ TransitionEvent => Unit = null,
    transitionend: /* ev */ TransitionEvent => Unit = null,
    transitionrun: /* ev */ TransitionEvent => Unit = null,
    transitionstart: /* ev */ TransitionEvent => Unit = null,
    volumechange: /* ev */ Event_ => Unit = null,
    waiting: /* ev */ Event_ => Unit = null,
    wheel: /* ev */ WheelEvent => Unit = null
  ): On = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (abort != null) __obj.updateDynamic("abort")(js.Any.fromFunction1(abort))
    if (animationcancel != null) __obj.updateDynamic("animationcancel")(js.Any.fromFunction1(animationcancel))
    if (animationend != null) __obj.updateDynamic("animationend")(js.Any.fromFunction1(animationend))
    if (animationiteration != null) __obj.updateDynamic("animationiteration")(js.Any.fromFunction1(animationiteration))
    if (animationstart != null) __obj.updateDynamic("animationstart")(js.Any.fromFunction1(animationstart))
    if (auxclick != null) __obj.updateDynamic("auxclick")(js.Any.fromFunction1(auxclick))
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction1(blur))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (canplay != null) __obj.updateDynamic("canplay")(js.Any.fromFunction1(canplay))
    if (canplaythrough != null) __obj.updateDynamic("canplaythrough")(js.Any.fromFunction1(canplaythrough))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (contextmenu != null) __obj.updateDynamic("contextmenu")(js.Any.fromFunction1(contextmenu))
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction1(copy))
    if (cuechange != null) __obj.updateDynamic("cuechange")(js.Any.fromFunction1(cuechange))
    if (cut != null) __obj.updateDynamic("cut")(js.Any.fromFunction1(cut))
    if (dblclick != null) __obj.updateDynamic("dblclick")(js.Any.fromFunction1(dblclick))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1(dragend))
    if (dragenter != null) __obj.updateDynamic("dragenter")(js.Any.fromFunction1(dragenter))
    if (dragexit != null) __obj.updateDynamic("dragexit")(js.Any.fromFunction1(dragexit))
    if (dragleave != null) __obj.updateDynamic("dragleave")(js.Any.fromFunction1(dragleave))
    if (dragover != null) __obj.updateDynamic("dragover")(js.Any.fromFunction1(dragover))
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1(dragstart))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1(drop))
    if (durationchange != null) __obj.updateDynamic("durationchange")(js.Any.fromFunction1(durationchange))
    if (emptied != null) __obj.updateDynamic("emptied")(js.Any.fromFunction1(emptied))
    if (ended != null) __obj.updateDynamic("ended")(js.Any.fromFunction1(ended))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction1(focus))
    if (focusin != null) __obj.updateDynamic("focusin")(js.Any.fromFunction1(focusin))
    if (focusout != null) __obj.updateDynamic("focusout")(js.Any.fromFunction1(focusout))
    if (fullscreenchange != null) __obj.updateDynamic("fullscreenchange")(js.Any.fromFunction1(fullscreenchange))
    if (fullscreenerror != null) __obj.updateDynamic("fullscreenerror")(js.Any.fromFunction1(fullscreenerror))
    if (gotpointercapture != null) __obj.updateDynamic("gotpointercapture")(js.Any.fromFunction1(gotpointercapture))
    if (input != null) __obj.updateDynamic("input")(js.Any.fromFunction1(input))
    if (invalid != null) __obj.updateDynamic("invalid")(js.Any.fromFunction1(invalid))
    if (keydown != null) __obj.updateDynamic("keydown")(js.Any.fromFunction1(keydown))
    if (keypress != null) __obj.updateDynamic("keypress")(js.Any.fromFunction1(keypress))
    if (keyup != null) __obj.updateDynamic("keyup")(js.Any.fromFunction1(keyup))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (loadeddata != null) __obj.updateDynamic("loadeddata")(js.Any.fromFunction1(loadeddata))
    if (loadedmetadata != null) __obj.updateDynamic("loadedmetadata")(js.Any.fromFunction1(loadedmetadata))
    if (loadstart != null) __obj.updateDynamic("loadstart")(js.Any.fromFunction1(loadstart))
    if (lostpointercapture != null) __obj.updateDynamic("lostpointercapture")(js.Any.fromFunction1(lostpointercapture))
    if (mousedown != null) __obj.updateDynamic("mousedown")(js.Any.fromFunction1(mousedown))
    if (mouseenter != null) __obj.updateDynamic("mouseenter")(js.Any.fromFunction1(mouseenter))
    if (mouseleave != null) __obj.updateDynamic("mouseleave")(js.Any.fromFunction1(mouseleave))
    if (mousemove != null) __obj.updateDynamic("mousemove")(js.Any.fromFunction1(mousemove))
    if (mouseout != null) __obj.updateDynamic("mouseout")(js.Any.fromFunction1(mouseout))
    if (mouseover != null) __obj.updateDynamic("mouseover")(js.Any.fromFunction1(mouseover))
    if (mouseup != null) __obj.updateDynamic("mouseup")(js.Any.fromFunction1(mouseup))
    if (paste != null) __obj.updateDynamic("paste")(js.Any.fromFunction1(paste))
    if (pause != null) __obj.updateDynamic("pause")(js.Any.fromFunction1(pause))
    if (play != null) __obj.updateDynamic("play")(js.Any.fromFunction1(play))
    if (playing != null) __obj.updateDynamic("playing")(js.Any.fromFunction1(playing))
    if (pointercancel != null) __obj.updateDynamic("pointercancel")(js.Any.fromFunction1(pointercancel))
    if (pointerdown != null) __obj.updateDynamic("pointerdown")(js.Any.fromFunction1(pointerdown))
    if (pointerenter != null) __obj.updateDynamic("pointerenter")(js.Any.fromFunction1(pointerenter))
    if (pointerleave != null) __obj.updateDynamic("pointerleave")(js.Any.fromFunction1(pointerleave))
    if (pointermove != null) __obj.updateDynamic("pointermove")(js.Any.fromFunction1(pointermove))
    if (pointerout != null) __obj.updateDynamic("pointerout")(js.Any.fromFunction1(pointerout))
    if (pointerover != null) __obj.updateDynamic("pointerover")(js.Any.fromFunction1(pointerover))
    if (pointerup != null) __obj.updateDynamic("pointerup")(js.Any.fromFunction1(pointerup))
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction1(progress))
    if (ratechange != null) __obj.updateDynamic("ratechange")(js.Any.fromFunction1(ratechange))
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction1(reset))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction1(scroll))
    if (securitypolicyviolation != null) __obj.updateDynamic("securitypolicyviolation")(js.Any.fromFunction1(securitypolicyviolation))
    if (seeked != null) __obj.updateDynamic("seeked")(js.Any.fromFunction1(seeked))
    if (seeking != null) __obj.updateDynamic("seeking")(js.Any.fromFunction1(seeking))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selectionchange != null) __obj.updateDynamic("selectionchange")(js.Any.fromFunction1(selectionchange))
    if (selectstart != null) __obj.updateDynamic("selectstart")(js.Any.fromFunction1(selectstart))
    if (stalled != null) __obj.updateDynamic("stalled")(js.Any.fromFunction1(stalled))
    if (submit != null) __obj.updateDynamic("submit")(js.Any.fromFunction1(submit))
    if (suspend != null) __obj.updateDynamic("suspend")(js.Any.fromFunction1(suspend))
    if (timeupdate != null) __obj.updateDynamic("timeupdate")(js.Any.fromFunction1(timeupdate))
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction1(toggle))
    if (touchcancel != null) __obj.updateDynamic("touchcancel")(js.Any.fromFunction1(touchcancel))
    if (touchend != null) __obj.updateDynamic("touchend")(js.Any.fromFunction1(touchend))
    if (touchmove != null) __obj.updateDynamic("touchmove")(js.Any.fromFunction1(touchmove))
    if (touchstart != null) __obj.updateDynamic("touchstart")(js.Any.fromFunction1(touchstart))
    if (transitioncancel != null) __obj.updateDynamic("transitioncancel")(js.Any.fromFunction1(transitioncancel))
    if (transitionend != null) __obj.updateDynamic("transitionend")(js.Any.fromFunction1(transitionend))
    if (transitionrun != null) __obj.updateDynamic("transitionrun")(js.Any.fromFunction1(transitionrun))
    if (transitionstart != null) __obj.updateDynamic("transitionstart")(js.Any.fromFunction1(transitionstart))
    if (volumechange != null) __obj.updateDynamic("volumechange")(js.Any.fromFunction1(volumechange))
    if (waiting != null) __obj.updateDynamic("waiting")(js.Any.fromFunction1(waiting))
    if (wheel != null) __obj.updateDynamic("wheel")(js.Any.fromFunction1(wheel))
    __obj.asInstanceOf[On]
  }
}

