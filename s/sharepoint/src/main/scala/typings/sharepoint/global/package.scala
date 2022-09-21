package typings.sharepoint.global

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.AjaxNavigate
import typings.sharepoint.Browseris
import typings.sharepoint.ContextInfo
import typings.sharepoint.MQuery
import typings.sharepoint.SPClientTemplates.Item
import typings.sharepoint.SPClientTemplates.RenderContextFieldInForm
import typings.sharepoint.SPClientTemplates.RenderContextInView
import typings.sharepoint.SPClientTemplates.RenderContextItemInView
import typings.sharepoint.SPMgr
import typings.sharepoint.Srch.ClientControl
import typings.sharepoint.sharepointStrings.abort
import typings.sharepoint.sharepointStrings.animationcancel
import typings.sharepoint.sharepointStrings.animationend
import typings.sharepoint.sharepointStrings.animationiteration
import typings.sharepoint.sharepointStrings.animationstart
import typings.sharepoint.sharepointStrings.auxclick
import typings.sharepoint.sharepointStrings.beforeinput
import typings.sharepoint.sharepointStrings.blur
import typings.sharepoint.sharepointStrings.canplay
import typings.sharepoint.sharepointStrings.canplaythrough
import typings.sharepoint.sharepointStrings.change
import typings.sharepoint.sharepointStrings.click
import typings.sharepoint.sharepointStrings.close
import typings.sharepoint.sharepointStrings.compositionend
import typings.sharepoint.sharepointStrings.compositionstart
import typings.sharepoint.sharepointStrings.compositionupdate
import typings.sharepoint.sharepointStrings.contextmenu
import typings.sharepoint.sharepointStrings.copy
import typings.sharepoint.sharepointStrings.cuechange
import typings.sharepoint.sharepointStrings.cut
import typings.sharepoint.sharepointStrings.dblclick
import typings.sharepoint.sharepointStrings.drag
import typings.sharepoint.sharepointStrings.dragend
import typings.sharepoint.sharepointStrings.dragenter
import typings.sharepoint.sharepointStrings.dragleave
import typings.sharepoint.sharepointStrings.dragover
import typings.sharepoint.sharepointStrings.dragstart
import typings.sharepoint.sharepointStrings.drop
import typings.sharepoint.sharepointStrings.durationchange
import typings.sharepoint.sharepointStrings.emptied
import typings.sharepoint.sharepointStrings.ended
import typings.sharepoint.sharepointStrings.error
import typings.sharepoint.sharepointStrings.focus
import typings.sharepoint.sharepointStrings.focusin
import typings.sharepoint.sharepointStrings.focusout
import typings.sharepoint.sharepointStrings.formdata
import typings.sharepoint.sharepointStrings.fullscreenchange
import typings.sharepoint.sharepointStrings.fullscreenerror
import typings.sharepoint.sharepointStrings.gotpointercapture
import typings.sharepoint.sharepointStrings.input
import typings.sharepoint.sharepointStrings.invalid
import typings.sharepoint.sharepointStrings.keydown
import typings.sharepoint.sharepointStrings.keypress
import typings.sharepoint.sharepointStrings.keyup
import typings.sharepoint.sharepointStrings.load
import typings.sharepoint.sharepointStrings.loadeddata
import typings.sharepoint.sharepointStrings.loadedmetadata
import typings.sharepoint.sharepointStrings.loadstart
import typings.sharepoint.sharepointStrings.lostpointercapture
import typings.sharepoint.sharepointStrings.mousedown
import typings.sharepoint.sharepointStrings.mouseenter
import typings.sharepoint.sharepointStrings.mouseleave
import typings.sharepoint.sharepointStrings.mousemove
import typings.sharepoint.sharepointStrings.mouseout
import typings.sharepoint.sharepointStrings.mouseover
import typings.sharepoint.sharepointStrings.mouseup
import typings.sharepoint.sharepointStrings.paste
import typings.sharepoint.sharepointStrings.pause
import typings.sharepoint.sharepointStrings.play
import typings.sharepoint.sharepointStrings.playing
import typings.sharepoint.sharepointStrings.pointercancel
import typings.sharepoint.sharepointStrings.pointerdown
import typings.sharepoint.sharepointStrings.pointerenter
import typings.sharepoint.sharepointStrings.pointerleave
import typings.sharepoint.sharepointStrings.pointermove
import typings.sharepoint.sharepointStrings.pointerout
import typings.sharepoint.sharepointStrings.pointerover
import typings.sharepoint.sharepointStrings.pointerup
import typings.sharepoint.sharepointStrings.progress
import typings.sharepoint.sharepointStrings.ratechange
import typings.sharepoint.sharepointStrings.reset
import typings.sharepoint.sharepointStrings.resize
import typings.sharepoint.sharepointStrings.scroll
import typings.sharepoint.sharepointStrings.securitypolicyviolation
import typings.sharepoint.sharepointStrings.seeked
import typings.sharepoint.sharepointStrings.seeking
import typings.sharepoint.sharepointStrings.select
import typings.sharepoint.sharepointStrings.selectionchange
import typings.sharepoint.sharepointStrings.selectstart
import typings.sharepoint.sharepointStrings.slotchange
import typings.sharepoint.sharepointStrings.stalled
import typings.sharepoint.sharepointStrings.submit
import typings.sharepoint.sharepointStrings.suspend
import typings.sharepoint.sharepointStrings.timeupdate
import typings.sharepoint.sharepointStrings.toggle
import typings.sharepoint.sharepointStrings.touchcancel
import typings.sharepoint.sharepointStrings.touchend
import typings.sharepoint.sharepointStrings.touchmove
import typings.sharepoint.sharepointStrings.touchstart
import typings.sharepoint.sharepointStrings.transitioncancel
import typings.sharepoint.sharepointStrings.transitionend
import typings.sharepoint.sharepointStrings.transitionrun
import typings.sharepoint.sharepointStrings.transitionstart
import typings.sharepoint.sharepointStrings.volumechange
import typings.sharepoint.sharepointStrings.waiting
import typings.sharepoint.sharepointStrings.webkitanimationend
import typings.sharepoint.sharepointStrings.webkitanimationiteration
import typings.sharepoint.sharepointStrings.webkitanimationstart
import typings.sharepoint.sharepointStrings.webkittransitionend
import typings.sharepoint.sharepointStrings.wheel
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.Element
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventListener
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.GlobalEventHandlers
import typings.std.HTMLElement
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


inline def AddEvtHandler(element: HTMLElement, event: String, func: EventListener): Unit = (js.Dynamic.global.applyDynamic("AddEvtHandler")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def AttachEvent_abort(
  `type`: abort,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_animationcancel(
  `type`: animationcancel,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_animationend(
  `type`: animationend,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_animationiteration(
  `type`: animationiteration,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_animationstart(
  `type`: animationstart,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_auxclick(
  `type`: auxclick,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_beforeinput(
  `type`: beforeinput,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ InputEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_blur(
  `type`: blur,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_canplay(
  `type`: canplay,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_canplaythrough(
  `type`: canplaythrough,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_change(
  `type`: change,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_click(
  `type`: click,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_close(
  `type`: close,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_compositionend(
  `type`: compositionend,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_compositionstart(
  `type`: compositionstart,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_compositionupdate(
  `type`: compositionupdate,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ CompositionEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_contextmenu(
  `type`: contextmenu,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_copy(
  `type`: copy,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_cuechange(
  `type`: cuechange,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_cut(
  `type`: cut,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_dblclick(
  `type`: dblclick,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_drag(
  `type`: drag,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_dragend(
  `type`: dragend,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_dragenter(
  `type`: dragenter,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_dragleave(
  `type`: dragleave,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_dragover(
  `type`: dragover,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_dragstart(
  `type`: dragstart,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_drop(
  `type`: drop,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_durationchange(
  `type`: durationchange,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_emptied(
  `type`: emptied,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_ended(
  `type`: ended,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_error(
  `type`: error,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ErrorEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_focus(
  `type`: focus,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_focusin(
  `type`: focusin,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_focusout(
  `type`: focusout,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_formdata(
  `type`: formdata,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FormDataEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_fullscreenchange(
  `type`: fullscreenchange,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_fullscreenerror(
  `type`: fullscreenerror,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_gotpointercapture(
  `type`: gotpointercapture,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_input(
  `type`: input,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_invalid(
  `type`: invalid,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_keydown(
  `type`: keydown,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_keypress(
  `type`: keypress,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_keyup(
  `type`: keyup,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_load(
  `type`: load,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_loadeddata(
  `type`: loadeddata,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_loadedmetadata(
  `type`: loadedmetadata,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_loadstart(
  `type`: loadstart,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_lostpointercapture(
  `type`: lostpointercapture,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_mousedown(
  `type`: mousedown,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_mouseenter(
  `type`: mouseenter,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_mouseleave(
  `type`: mouseleave,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_mousemove(
  `type`: mousemove,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_mouseout(
  `type`: mouseout,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_mouseover(
  `type`: mouseover,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_mouseup(
  `type`: mouseup,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_paste(
  `type`: paste,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ClipboardEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_pause(
  `type`: pause,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_play(
  `type`: play,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_playing(
  `type`: playing,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_pointercancel(
  `type`: pointercancel,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_pointerdown(
  `type`: pointerdown,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_pointerenter(
  `type`: pointerenter,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_pointerleave(
  `type`: pointerleave,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_pointermove(
  `type`: pointermove,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_pointerout(
  `type`: pointerout,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_pointerover(
  `type`: pointerover,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_pointerup(
  `type`: pointerup,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_progress(
  `type`: progress,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent[EventTarget], Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_ratechange(
  `type`: ratechange,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_reset(
  `type`: reset,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_resize(
  `type`: resize,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_scroll(
  `type`: scroll,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_securitypolicyviolation(
  `type`: securitypolicyviolation,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_seeked(
  `type`: seeked,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_seeking(
  `type`: seeking,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_select(
  `type`: select,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_selectionchange(
  `type`: selectionchange,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_selectstart(
  `type`: selectstart,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_slotchange(
  `type`: slotchange,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_stalled(
  `type`: stalled,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_submit(
  `type`: submit,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SubmitEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_suspend(
  `type`: suspend,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_timeupdate(
  `type`: timeupdate,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_toggle(
  `type`: toggle,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_touchcancel(
  `type`: touchcancel,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_touchend(
  `type`: touchend,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_touchmove(
  `type`: touchmove,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_touchstart(
  `type`: touchstart,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_transitioncancel(
  `type`: transitioncancel,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_transitionend(
  `type`: transitionend,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_transitionrun(
  `type`: transitionrun,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_transitionstart(
  `type`: transitionstart,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_volumechange(
  `type`: volumechange,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_waiting(
  `type`: waiting,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_webkitanimationend(
  `type`: webkitanimationend,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_webkitanimationiteration(
  `type`: webkitanimationiteration,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_webkitanimationstart(
  `type`: webkitanimationstart,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_webkittransitionend(
  `type`: webkittransitionend,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ Event, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def AttachEvent_wheel(
  `type`: wheel,
  eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, Any],
  el: GlobalEventHandlers
): Any = (js.Dynamic.global.applyDynamic("AttachEvent")(`type`.asInstanceOf[js.Any], eventFunc.asInstanceOf[js.Any], el.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def CancelEvent(e: Event): Boolean = js.Dynamic.global.applyDynamic("CancelEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def CoreRender(template: Any, context: Any): String = (js.Dynamic.global.applyDynamic("CoreRender")(template.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]

inline def ExecuteOrDelayUntilBodyLoaded(initFunc: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("ExecuteOrDelayUntilBodyLoaded")(initFunc.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ExecuteOrDelayUntilEventNotified(func: js.Function1[/* repeated */ Any, Unit], eventName: String): Boolean = (js.Dynamic.global.applyDynamic("ExecuteOrDelayUntilEventNotified")(func.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def ExecuteOrDelayUntilScriptLoaded(func: js.Function0[Unit], depScriptFileName: String): Boolean = (js.Dynamic.global.applyDynamic("ExecuteOrDelayUntilScriptLoaded")(func.asInstanceOf[js.Any], depScriptFileName.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def GenerateIID(renderCtx: RenderContextItemInView): String = js.Dynamic.global.applyDynamic("GenerateIID")(renderCtx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def GenerateIIDForListItem(renderCtx: RenderContextInView, listItem: Item): String = (js.Dynamic.global.applyDynamic("GenerateIIDForListItem")(renderCtx.asInstanceOf[js.Any], listItem.asInstanceOf[js.Any])).asInstanceOf[String]

inline def GetCurrentCtx(): ContextInfo = js.Dynamic.global.applyDynamic("GetCurrentCtx")().asInstanceOf[ContextInfo]

inline def GetThemedImageUrl(image: String): String = js.Dynamic.global.applyDynamic("GetThemedImageUrl")(image.asInstanceOf[js.Any]).asInstanceOf[String]

/** Gets query string parameter */
inline def GetUrlKeyValue(key: String): String = js.Dynamic.global.applyDynamic("GetUrlKeyValue")(key.asInstanceOf[js.Any]).asInstanceOf[String]

inline def HP: typings.sharepoint.HP = js.Dynamic.global.selectDynamic("HP").asInstanceOf[typings.sharepoint.HP]
inline def HP_=(x: typings.sharepoint.HP): Unit = js.Dynamic.global.updateDynamic("HP")(x.asInstanceOf[js.Any])

inline def LAccessibleMenuText: String = js.Dynamic.global.selectDynamic("L_AccessibleMenu_Text").asInstanceOf[String]

inline def LCannotEditPropertyCheckoutText: String = js.Dynamic.global.selectDynamic("L_CannotEditPropertyCheckout_Text").asInstanceOf[String]

inline def LCannotEditPropertyForLocalCopyText: String = js.Dynamic.global.selectDynamic("L_CannotEditPropertyForLocalCopy_Text").asInstanceOf[String]

inline def LCheckOutRetryText: String = js.Dynamic.global.selectDynamic("L_CheckOutRetry_Text").asInstanceOf[String]

inline def LCheckoutConfirm: String = js.Dynamic.global.selectDynamic("L_CheckoutConfirm").asInstanceOf[String]

inline def LClickOnce1Text: String = js.Dynamic.global.selectDynamic("L_ClickOnce1_text").asInstanceOf[String]

inline def LConfirmCheckoutText: String = js.Dynamic.global.selectDynamic("L_ConfirmCheckout_Text").asInstanceOf[String]

inline def LConfirmUnlinkCopyText: String = js.Dynamic.global.selectDynamic("L_ConfirmUnlinkCopy_Text").asInstanceOf[String]

inline def LCopyingOfflineVersionWarningText: String = js.Dynamic.global.selectDynamic("L_CopyingOfflineVersionWarning_Text").asInstanceOf[String]

inline def LDiscardCheckoutConfirm: String = js.Dynamic.global.selectDynamic("L_DiscardCheckoutConfirm").asInstanceOf[String]

inline def LEnterValidCopyDestText: String = js.Dynamic.global.selectDynamic("L_EnterValidCopyDest_Text").asInstanceOf[String]

inline def LInplviewPageNotYetSaved: String = js.Dynamic.global.selectDynamic("L_Inplview_PageNotYetSaved").asInstanceOf[String]

inline def LLanguageText: String = js.Dynamic.global.selectDynamic("L_Language_Text").asInstanceOf[String]

inline def LLoadingErrorText: String = js.Dynamic.global.selectDynamic("L_Loading_Error_Text").asInstanceOf[String]

inline def LLoadingText: String = js.Dynamic.global.selectDynamic("L_Loading_Text").asInstanceOf[String]

inline def LMustCheckoutText: String = js.Dynamic.global.selectDynamic("L_MustCheckout_Text").asInstanceOf[String]

inline def LNewBlogPostFailedText: String = js.Dynamic.global.selectDynamic("L_NewBlogPostFailed_Text").asInstanceOf[String]

inline def LNewBlogPostText: String = js.Dynamic.global.selectDynamic("L_NewBlogPost_Text").asInstanceOf[String]

inline def LNewDocLibTb1Text: String = js.Dynamic.global.selectDynamic("L_NewDocLibTb1_Text").asInstanceOf[String]

inline def LNewDocLibTb2Text: String = js.Dynamic.global.selectDynamic("L_NewDocLibTb2_Text").asInstanceOf[String]

inline def LNewFormClickOnce1Text: String = js.Dynamic.global.selectDynamic("L_NewFormClickOnce1_Text").asInstanceOf[String]

inline def LNewFormLibTb1Text: String = js.Dynamic.global.selectDynamic("L_NewFormLibTb1_Text").asInstanceOf[String]

inline def LNewFormLibTb2Text: String = js.Dynamic.global.selectDynamic("L_NewFormLibTb2_Text").asInstanceOf[String]

inline def LNoExplorerViewText: String = js.Dynamic.global.selectDynamic("L_NoExplorerView_Text").asInstanceOf[String]

inline def LSTSDelConfirm1Text: String = js.Dynamic.global.selectDynamic("L_STSDelConfirm1_Text").asInstanceOf[String]

inline def LSTSDelConfirm2Text: String = js.Dynamic.global.selectDynamic("L_STSDelConfirm2_Text").asInstanceOf[String]

inline def LSTSDelConfirmText: String = js.Dynamic.global.selectDynamic("L_STSDelConfirm_Text").asInstanceOf[String]

inline def LSTSRecycleConfirm1Text: String = js.Dynamic.global.selectDynamic("L_STSRecycleConfirm1_Text").asInstanceOf[String]

inline def LSTSRecycleConfirm2Text: String = js.Dynamic.global.selectDynamic("L_STSRecycleConfirm2_Text").asInstanceOf[String]

inline def LSTSRecycleConfirmText: String = js.Dynamic.global.selectDynamic("L_STSRecycleConfirm_Text").asInstanceOf[String]

inline def LSubMenuText: String = js.Dynamic.global.selectDynamic("L_SubMenu_Text").asInstanceOf[String]

inline def LWarnkOnceText: String = js.Dynamic.global.selectDynamic("L_WarnkOnce_text").asInstanceOf[String]

inline def LWebFoldersErrorText: String = js.Dynamic.global.selectDynamic("L_WebFoldersError_Text").asInstanceOf[String]

inline def LWebFoldersRequiredText: String = js.Dynamic.global.selectDynamic("L_WebFoldersRequired_Text").asInstanceOf[String]

inline def LWikiWebPartNoClosedOrUploaded: String = js.Dynamic.global.selectDynamic("L_WikiWebPartNoClosedOrUploaded").asInstanceOf[String]

inline def MSOWebPartPageFormName: String = js.Dynamic.global.selectDynamic("MSOWebPartPageFormName").asInstanceOf[String]
inline def MSOWebPartPageFormName_=(x: String): Unit = js.Dynamic.global.updateDynamic("MSOWebPartPageFormName")(x.asInstanceOf[js.Any])

inline def NotifyBodyLoadedAndExecuteWaitingJobs(): Unit = js.Dynamic.global.applyDynamic("NotifyBodyLoadedAndExecuteWaitingJobs")().asInstanceOf[Unit]

inline def NotifyEventAndExecuteWaitingJobs(eventName: String): Unit = js.Dynamic.global.applyDynamic("NotifyEventAndExecuteWaitingJobs")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def NotifyScriptLoadedAndExecuteWaitingJobs(scriptFileName: String): Unit = js.Dynamic.global.applyDynamic("NotifyScriptLoadedAndExecuteWaitingJobs")(scriptFileName.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def RefreshCommandUI(): Unit = js.Dynamic.global.applyDynamic("RefreshCommandUI")().asInstanceOf[Unit]

/** Register function to rerun on partial update in MDS-enabled site.*/
inline def RegisterModuleInit(scriptFileName: String, initFunc: js.Function0[Unit]): Unit = (js.Dynamic.global.applyDynamic("RegisterModuleInit")(scriptFileName.asInstanceOf[js.Any], initFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def SPClientPeoplePickerCSRTemplate(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPClientPeoplePickerCSRTemplate")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPClientRenderer: typings.sharepoint.SPClientRenderer = js.Dynamic.global.selectDynamic("SPClientRenderer").asInstanceOf[typings.sharepoint.SPClientRenderer]
inline def SPClientRenderer_=(x: typings.sharepoint.SPClientRenderer): Unit = js.Dynamic.global.updateDynamic("SPClientRenderer")(x.asInstanceOf[js.Any])

inline def SPFieldAttachmentsDefault(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldAttachments_Default")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldBooleanEdit(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldBoolean_Edit")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldChoiceDropdownEdit(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldChoice_Dropdown_Edit")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldChoiceEdit(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldChoice_Edit")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldChoiceRadioEdit(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldChoice_Radio_Edit")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldDateTimeDisplay(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldDateTime_Display")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldDateTimeEdit(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldDateTime_Edit")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldFileDisplay(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldFile_Display")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldFileEdit(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldFile_Edit")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldFormDisplayDefault(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPField_FormDisplay_Default")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldFormDisplayDefaultNoEncode(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPField_FormDisplay_DefaultNoEncode")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldFormDisplayEmpty(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPField_FormDisplay_Empty")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldLookupDisplay(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldLookup_Display")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldLookupEdit(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldLookup_Edit")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldLookupMultiEdit(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldLookupMulti_Edit")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldMultiChoiceEdit(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldMultiChoice_Edit")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldNoteDisplay(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldNote_Display")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldNoteEdit(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldNote_Edit")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldNumberEdit(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldNumber_Edit")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldTextEdit(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldText_Edit")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldUrlDisplay(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldUrl_Display")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldUrlEdit(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldUrl_Edit")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldUserDisplay(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldUser_Display")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFieldUserMultiDisplay(ctx: RenderContextFieldInForm): String = js.Dynamic.global.applyDynamic("SPFieldUserMulti_Display")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SPFormControlAppendValidationErrorMessage(nodeId: String, errorResult: Any): Unit = (js.Dynamic.global.applyDynamic("SPFormControl_AppendValidationErrorMessage")(nodeId.asInstanceOf[js.Any], errorResult.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def STSHtmlDecode(value: String): String = js.Dynamic.global.applyDynamic("STSHtmlDecode")(value.asInstanceOf[js.Any]).asInstanceOf[String]

inline def STSHtmlEncode(value: String): String = js.Dynamic.global.applyDynamic("STSHtmlEncode")(value.asInstanceOf[js.Any]).asInstanceOf[String]

inline def STSScriptEncode(str: String): String = js.Dynamic.global.applyDynamic("STSScriptEncode")(str.asInstanceOf[js.Any]).asInstanceOf[String]

inline def STSScriptEncodeWithQuote(str: String): String = js.Dynamic.global.applyDynamic("STSScriptEncodeWithQuote")(str.asInstanceOf[js.Any]).asInstanceOf[String]

inline def SelectRibbonTab(tabId: String, force: Boolean): Any = (js.Dynamic.global.applyDynamic("SelectRibbonTab")(tabId.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def SetFullScreenMode(fullscreen: Boolean): Unit = js.Dynamic.global.applyDynamic("SetFullScreenMode")(fullscreen.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def StAttrQuote(st: String): String = js.Dynamic.global.applyDynamic("StAttrQuote")(st.asInstanceOf[js.Any]).asInstanceOf[String]

inline def Strings: Any = js.Dynamic.global.selectDynamic("Strings").asInstanceOf[Any]
inline def Strings_=(x: Any): Unit = js.Dynamic.global.updateDynamic("Strings")(x.asInstanceOf[js.Any])

inline def ToggleDeveloperDashboard(): Unit = js.Dynamic.global.applyDynamic("ToggleDeveloperDashboard")().asInstanceOf[Unit]

inline def ToggleTrace(): Unit = js.Dynamic.global.applyDynamic("ToggleTrace")().asInstanceOf[Unit]

/** (calls Srch.U.addRenderContextCallback) */
inline def addRenderContextCallback(renderCtx: Any, itemWrapperFunction: Any): Unit = (js.Dynamic.global.applyDynamic("$addRenderContextCallback")(renderCtx.asInstanceOf[js.Any], itemWrapperFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ajaxNavigate: AjaxNavigate = js.Dynamic.global.selectDynamic("ajaxNavigate").asInstanceOf[AjaxNavigate]
inline def ajaxNavigate_=(x: AjaxNavigate): Unit = js.Dynamic.global.updateDynamic("ajaxNavigate")(x.asInstanceOf[js.Any])

inline def bIsFileDialogView: Boolean = js.Dynamic.global.selectDynamic("bIsFileDialogView").asInstanceOf[Boolean]

inline def browseris: Browseris = js.Dynamic.global.selectDynamic("browseris").asInstanceOf[Browseris]
inline def browseris_=(x: Browseris): Unit = js.Dynamic.global.updateDynamic("browseris")(x.asInstanceOf[js.Any])

inline def cascadeDeleteWarningMessage: String = js.Dynamic.global.selectDynamic("cascadeDeleteWarningMessage").asInstanceOf[String]

inline def contentLineText(p: Any): Any = js.Dynamic.global.applyDynamic("$contentLineText")(p.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def encodeScriptQuote(str: String): String = js.Dynamic.global.applyDynamic("encodeScriptQuote")(str.asInstanceOf[js.Any]).asInstanceOf[String]

/** (alias for Srch.U.findResultObjectFromDOM) */
inline def findResultObjectFromDOM(e: Element, `type`: String): Unit = (js.Dynamic.global.applyDynamic("$findResultObjectFromDOM")(e.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def getCachedItemValue(ctx: Any, nameToLookup: String): Any = (js.Dynamic.global.applyDynamic("$getCachedItemValue")(ctx.asInstanceOf[js.Any], nameToLookup.asInstanceOf[js.Any])).asInstanceOf[Any]

/** Returns the ClientControl associated with specified DOM element (alias for Srch.U.getClientComponent) */
inline def getClientControl(e: Element): ClientControl = js.Dynamic.global.applyDynamic("$getClientControl")(e.asInstanceOf[js.Any]).asInstanceOf[ClientControl]

inline def getItemValue(ctx: Any, nameToLookup: String): Any = (js.Dynamic.global.applyDynamic("$getItemValue")(ctx.asInstanceOf[js.Any], nameToLookup.asInstanceOf[js.Any])).asInstanceOf[Any]

/** (alias for Srch.U.getResultObject) */
inline def getResultItem(id: String): Any = js.Dynamic.global.applyDynamic("$getResultItem")(id.asInstanceOf[js.Any]).asInstanceOf[Any]

/** (alias for Srch.U.getResultObject) */
inline def getResultObject(id: String): Any = js.Dynamic.global.applyDynamic("$getResultObject")(id.asInstanceOf[js.Any]).asInstanceOf[Any]

/** (alias for SP.Utilities.HttpUtility.htmlEncode) */
inline def htmlEncode(s: String): String = js.Dynamic.global.applyDynamic("$htmlEncode")(s.asInstanceOf[js.Any]).asInstanceOf[String]

inline def imgSrcUrl(p: Any): String = js.Dynamic.global.applyDynamic("$imgSrcUrl")(p.asInstanceOf[js.Any]).asInstanceOf[String]

inline def includeCSS(templateLink: String, scriptLink: String): Unit = (js.Dynamic.global.applyDynamic("$includeCSS")(templateLink.asInstanceOf[js.Any], scriptLink.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def includeLanguageScript(templateLink: String, scriptLink: String): Any = (js.Dynamic.global.applyDynamic("$includeLanguageScript")(templateLink.asInstanceOf[js.Any], scriptLink.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def includeScript(templateLink: String, relativeLink: String): Unit = (js.Dynamic.global.applyDynamic("$includeScript")(templateLink.asInstanceOf[js.Any], relativeLink.asInstanceOf[js.Any])).asInstanceOf[Unit]

/** Returns true if the specified array is null or empty */
inline def isEmptyArray(array: js.Array[Any]): Boolean = js.Dynamic.global.applyDynamic("$isEmptyArray")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/** Returns true if the value parameter is null or empty string */
inline def isEmptyString(value: String): Boolean = js.Dynamic.global.applyDynamic("$isEmptyString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/** Returns true if the specified item is found in the specified array (uses '===' for comparing) */
inline def isInArray(array: js.Array[Any], item: Any): Boolean = (js.Dynamic.global.applyDynamic("$isInArray")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/** Returns true if the value parameter is null or undefined */
inline def isNull(value: Any): Boolean = js.Dynamic.global.applyDynamic("$isNull")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def m: MQuery = js.Dynamic.global.selectDynamic("m$").asInstanceOf[MQuery]
inline def m_=(x: MQuery): Unit = js.Dynamic.global.updateDynamic("m$")(x.asInstanceOf[js.Any])

inline def recycleBinEnabled: Double = js.Dynamic.global.selectDynamic("recycleBinEnabled").asInstanceOf[Double]

/** Registers in system resources defined by the dictionary object (alias for Srch.U.registerResourceDictionary) */
inline def registerResourceDictionary(locale: String, dict: StringDictionary[String]): Unit = (js.Dynamic.global.applyDynamic("$registerResourceDictionary")(locale.asInstanceOf[js.Any], dict.asInstanceOf[js.Any])).asInstanceOf[Unit]

/** Retrieves localized string with the specified id */
inline def resource(id: String): String = js.Dynamic.global.applyDynamic("$resource")(id.asInstanceOf[js.Any]).asInstanceOf[String]

inline def ribbonStartInit(initialTabId: String, buildMinimized: Boolean, e: Event): Unit = (js.Dynamic.global.applyDynamic("_ribbonStartInit")(initialTabId.asInstanceOf[js.Any], buildMinimized.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]

/** (alias for SP.Utilities.HttpUtility.ecmaScriptStringLiteralEncode) */
inline def scriptEncode(s: String): String = js.Dynamic.global.applyDynamic("$scriptEncode")(s.asInstanceOf[js.Any]).asInstanceOf[String]

/** (calls Srch.U.setItemRenderWrapper) */
inline def setItemWrapperCallback(renderCtx: Any, itemWrapperFunction: Any): Unit = (js.Dynamic.global.applyDynamic("$setItemWrapperCallback")(renderCtx.asInstanceOf[js.Any], itemWrapperFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]

/** (alias for Srch.U.setResultObject) */
inline def setResultItem(id: String, resultObject: Any): Unit = (js.Dynamic.global.applyDynamic("$setResultItem")(id.asInstanceOf[js.Any], resultObject.asInstanceOf[js.Any])).asInstanceOf[Unit]

/** (alias for Srch.U.setResultObject) */
inline def setResultObject(id: String, resultObject: Any): Unit = (js.Dynamic.global.applyDynamic("$setResultObject")(id.asInstanceOf[js.Any], resultObject.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def spBodyOnLoadCalled: Boolean = js.Dynamic.global.selectDynamic("_spBodyOnLoadCalled").asInstanceOf[Boolean]
inline def spBodyOnLoadCalled_=(x: Boolean): Unit = js.Dynamic.global.updateDynamic("_spBodyOnLoadCalled")(x.asInstanceOf[js.Any])

inline def spBodyOnLoadFunctionNames: js.Array[String] = js.Dynamic.global.selectDynamic("_spBodyOnLoadFunctionNames").asInstanceOf[js.Array[String]]
inline def spBodyOnLoadFunctionNames_=(x: js.Array[String]): Unit = js.Dynamic.global.updateDynamic("_spBodyOnLoadFunctionNames")(x.asInstanceOf[js.Any])

inline def spBodyOnLoadFunctions: js.Array[js.Function0[Unit]] = js.Dynamic.global.selectDynamic("_spBodyOnLoadFunctions").asInstanceOf[js.Array[js.Function0[Unit]]]
inline def spBodyOnLoadFunctions_=(x: js.Array[js.Function0[Unit]]): Unit = js.Dynamic.global.updateDynamic("_spBodyOnLoadFunctions")(x.asInstanceOf[js.Any])

inline def spFriendlyUrlPageContextInfo: typings.sharepoint.spFriendlyUrlPageContextInfo = js.Dynamic.global.selectDynamic("_spFriendlyUrlPageContextInfo").asInstanceOf[typings.sharepoint.spFriendlyUrlPageContextInfo]
inline def spFriendlyUrlPageContextInfo_=(x: typings.sharepoint.spFriendlyUrlPageContextInfo): Unit = js.Dynamic.global.updateDynamic("_spFriendlyUrlPageContextInfo")(x.asInstanceOf[js.Any])

inline def spMgr: SPMgr = js.Dynamic.global.selectDynamic("spMgr").asInstanceOf[SPMgr]
inline def spMgr_=(x: SPMgr): Unit = js.Dynamic.global.updateDynamic("spMgr")(x.asInstanceOf[js.Any])

inline def spPageContextInfo: typings.sharepoint.spPageContextInfo = js.Dynamic.global.selectDynamic("_spPageContextInfo").asInstanceOf[typings.sharepoint.spPageContextInfo]
inline def spPageContextInfo_=(x: typings.sharepoint.spPageContextInfo): Unit = js.Dynamic.global.updateDynamic("_spPageContextInfo")(x.asInstanceOf[js.Any])

/** Ensures that url has correct protocol or is a relative URL, and html-encodes it.
  * If URL is incorrect, returns empty string. */
inline def urlHtmlEncode(s: String): String = js.Dynamic.global.applyDynamic("$urlHtmlEncode")(s.asInstanceOf[js.Any]).asInstanceOf[String]

inline def urlHtmlEncodeString(string: String): String = js.Dynamic.global.applyDynamic("$urlHtmlEncodeString")(string.asInstanceOf[js.Any]).asInstanceOf[String]

/** (alias for SP.Utilities.HttpUtility.urlKeyValueEncode) */
inline def urlKeyValueEncode(s: String): String = js.Dynamic.global.applyDynamic("$urlKeyValueEncode")(s.asInstanceOf[js.Any]).asInstanceOf[String]

/** (alias for SP.Utilities.HttpUtility.urlPathEncode) */
inline def urlPathEncode(s: String): String = js.Dynamic.global.applyDynamic("$urlPathEncode")(s.asInstanceOf[js.Any]).asInstanceOf[String]
