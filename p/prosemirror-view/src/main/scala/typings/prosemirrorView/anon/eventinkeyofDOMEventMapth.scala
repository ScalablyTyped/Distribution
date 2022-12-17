package typings.prosemirrorView.anon

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

/* Inlined {[ event in keyof prosemirror-view.prosemirror-view.DOMEventMap ]:? (this : any, view : prosemirror-view.prosemirror-view.EditorView, event : prosemirror-view.prosemirror-view.DOMEventMap[event]): boolean | void} */
trait eventinkeyofDOMEventMapth extends StObject {
  
  var abort: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ UIEvent, Boolean | Unit]
  ] = js.undefined
  
  var animationcancel: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ AnimationEvent, Boolean | Unit]
  ] = js.undefined
  
  var animationend: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ AnimationEvent, Boolean | Unit]
  ] = js.undefined
  
  var animationiteration: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ AnimationEvent, Boolean | Unit]
  ] = js.undefined
  
  var animationstart: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ AnimationEvent, Boolean | Unit]
  ] = js.undefined
  
  var auxclick: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
  ] = js.undefined
  
  var beforeinput: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ InputEvent, Boolean | Unit]
  ] = js.undefined
  
  var blur: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ FocusEvent, Boolean | Unit]
  ] = js.undefined
  
  var cancel: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var canplay: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var canplaythrough: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var change: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var click: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
  ] = js.undefined
  
  var close: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var compositionend: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ CompositionEvent, Boolean | Unit]
  ] = js.undefined
  
  var compositionstart: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ CompositionEvent, Boolean | Unit]
  ] = js.undefined
  
  var compositionupdate: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ CompositionEvent, Boolean | Unit]
  ] = js.undefined
  
  var contextmenu: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
  ] = js.undefined
  
  var copy: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ ClipboardEvent, Boolean | Unit]
  ] = js.undefined
  
  var cuechange: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var cut: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ ClipboardEvent, Boolean | Unit]
  ] = js.undefined
  
  var dblclick: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
  ] = js.undefined
  
  var drag: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ DragEvent, Boolean | Unit]
  ] = js.undefined
  
  var dragend: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ DragEvent, Boolean | Unit]
  ] = js.undefined
  
  var dragenter: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ DragEvent, Boolean | Unit]
  ] = js.undefined
  
  var dragleave: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ DragEvent, Boolean | Unit]
  ] = js.undefined
  
  var dragover: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ DragEvent, Boolean | Unit]
  ] = js.undefined
  
  var dragstart: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ DragEvent, Boolean | Unit]
  ] = js.undefined
  
  var drop: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ DragEvent, Boolean | Unit]
  ] = js.undefined
  
  var durationchange: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var emptied: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var ended: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var error: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ ErrorEvent, Boolean | Unit]
  ] = js.undefined
  
  var focus: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ FocusEvent, Boolean | Unit]
  ] = js.undefined
  
  var focusin: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ FocusEvent, Boolean | Unit]
  ] = js.undefined
  
  var focusout: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ FocusEvent, Boolean | Unit]
  ] = js.undefined
  
  var formdata: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ FormDataEvent, Boolean | Unit]
  ] = js.undefined
  
  var fullscreenchange: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var fullscreenerror: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var gotpointercapture: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
  ] = js.undefined
  
  var input: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var invalid: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var keydown: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ KeyboardEvent, Boolean | Unit]
  ] = js.undefined
  
  var keypress: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ KeyboardEvent, Boolean | Unit]
  ] = js.undefined
  
  var keyup: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ KeyboardEvent, Boolean | Unit]
  ] = js.undefined
  
  var load: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var loadeddata: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var loadedmetadata: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var loadstart: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var lostpointercapture: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
  ] = js.undefined
  
  var mousedown: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
  ] = js.undefined
  
  var mouseenter: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
  ] = js.undefined
  
  var mouseleave: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
  ] = js.undefined
  
  var mousemove: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
  ] = js.undefined
  
  var mouseout: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
  ] = js.undefined
  
  var mouseover: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
  ] = js.undefined
  
  var mouseup: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
  ] = js.undefined
  
  var paste: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ ClipboardEvent, Boolean | Unit]
  ] = js.undefined
  
  var pause: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var play: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var playing: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var pointercancel: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
  ] = js.undefined
  
  var pointerdown: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
  ] = js.undefined
  
  var pointerenter: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
  ] = js.undefined
  
  var pointerleave: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
  ] = js.undefined
  
  var pointermove: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
  ] = js.undefined
  
  var pointerout: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
  ] = js.undefined
  
  var pointerover: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
  ] = js.undefined
  
  var pointerup: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
  ] = js.undefined
  
  var progress: js.UndefOr[
    js.ThisFunction2[
      /* this */ Any, 
      /* view */ this.type, 
      /* event */ ProgressEvent[EventTarget], 
      Boolean | Unit
    ]
  ] = js.undefined
  
  var ratechange: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var reset: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var resize: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ UIEvent, Boolean | Unit]
  ] = js.undefined
  
  var scroll: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var securitypolicyviolation: js.UndefOr[
    js.ThisFunction2[
      /* this */ Any, 
      /* view */ this.type, 
      /* event */ SecurityPolicyViolationEvent, 
      Boolean | Unit
    ]
  ] = js.undefined
  
  var seeked: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var seeking: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var select: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var selectionchange: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var selectstart: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var slotchange: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var stalled: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var submit: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ SubmitEvent, Boolean | Unit]
  ] = js.undefined
  
  var suspend: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var timeupdate: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var toggle: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var touchcancel: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ TouchEvent, Boolean | Unit]
  ] = js.undefined
  
  var touchend: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ TouchEvent, Boolean | Unit]
  ] = js.undefined
  
  var touchmove: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ TouchEvent, Boolean | Unit]
  ] = js.undefined
  
  var touchstart: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ TouchEvent, Boolean | Unit]
  ] = js.undefined
  
  var transitioncancel: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ TransitionEvent, Boolean | Unit]
  ] = js.undefined
  
  var transitionend: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ TransitionEvent, Boolean | Unit]
  ] = js.undefined
  
  var transitionrun: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ TransitionEvent, Boolean | Unit]
  ] = js.undefined
  
  var transitionstart: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ TransitionEvent, Boolean | Unit]
  ] = js.undefined
  
  var volumechange: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var waiting: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var webkitanimationend: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var webkitanimationiteration: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var webkitanimationstart: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var webkittransitionend: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
  ] = js.undefined
  
  var wheel: js.UndefOr[
    js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ WheelEvent, Boolean | Unit]
  ] = js.undefined
}
object eventinkeyofDOMEventMapth {
  
  inline def apply(): eventinkeyofDOMEventMapth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[eventinkeyofDOMEventMapth]
  }
  
  extension [Self <: eventinkeyofDOMEventMapth](x: Self) {
    
    inline def setAbort(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ UIEvent, Boolean | Unit]
    ): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
    
    inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    inline def setAnimationcancel(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ AnimationEvent, Boolean | Unit]
    ): Self = StObject.set(x, "animationcancel", value.asInstanceOf[js.Any])
    
    inline def setAnimationcancelUndefined: Self = StObject.set(x, "animationcancel", js.undefined)
    
    inline def setAnimationend(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ AnimationEvent, Boolean | Unit]
    ): Self = StObject.set(x, "animationend", value.asInstanceOf[js.Any])
    
    inline def setAnimationendUndefined: Self = StObject.set(x, "animationend", js.undefined)
    
    inline def setAnimationiteration(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ AnimationEvent, Boolean | Unit]
    ): Self = StObject.set(x, "animationiteration", value.asInstanceOf[js.Any])
    
    inline def setAnimationiterationUndefined: Self = StObject.set(x, "animationiteration", js.undefined)
    
    inline def setAnimationstart(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ AnimationEvent, Boolean | Unit]
    ): Self = StObject.set(x, "animationstart", value.asInstanceOf[js.Any])
    
    inline def setAnimationstartUndefined: Self = StObject.set(x, "animationstart", js.undefined)
    
    inline def setAuxclick(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
    ): Self = StObject.set(x, "auxclick", value.asInstanceOf[js.Any])
    
    inline def setAuxclickUndefined: Self = StObject.set(x, "auxclick", js.undefined)
    
    inline def setBeforeinput(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ InputEvent, Boolean | Unit]
    ): Self = StObject.set(x, "beforeinput", value.asInstanceOf[js.Any])
    
    inline def setBeforeinputUndefined: Self = StObject.set(x, "beforeinput", js.undefined)
    
    inline def setBlur(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ FocusEvent, Boolean | Unit]
    ): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    inline def setCancel(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setCanplay(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "canplay", value.asInstanceOf[js.Any])
    
    inline def setCanplayUndefined: Self = StObject.set(x, "canplay", js.undefined)
    
    inline def setCanplaythrough(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "canplaythrough", value.asInstanceOf[js.Any])
    
    inline def setCanplaythroughUndefined: Self = StObject.set(x, "canplaythrough", js.undefined)
    
    inline def setChange(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setClick(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
    ): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setClose(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setCompositionend(
      value: js.ThisFunction2[
          /* this */ Any, 
          eventinkeyofDOMEventMapth, 
          /* event */ CompositionEvent, 
          Boolean | Unit
        ]
    ): Self = StObject.set(x, "compositionend", value.asInstanceOf[js.Any])
    
    inline def setCompositionendUndefined: Self = StObject.set(x, "compositionend", js.undefined)
    
    inline def setCompositionstart(
      value: js.ThisFunction2[
          /* this */ Any, 
          eventinkeyofDOMEventMapth, 
          /* event */ CompositionEvent, 
          Boolean | Unit
        ]
    ): Self = StObject.set(x, "compositionstart", value.asInstanceOf[js.Any])
    
    inline def setCompositionstartUndefined: Self = StObject.set(x, "compositionstart", js.undefined)
    
    inline def setCompositionupdate(
      value: js.ThisFunction2[
          /* this */ Any, 
          eventinkeyofDOMEventMapth, 
          /* event */ CompositionEvent, 
          Boolean | Unit
        ]
    ): Self = StObject.set(x, "compositionupdate", value.asInstanceOf[js.Any])
    
    inline def setCompositionupdateUndefined: Self = StObject.set(x, "compositionupdate", js.undefined)
    
    inline def setContextmenu(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
    ): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
    
    inline def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
    
    inline def setCopy(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ ClipboardEvent, Boolean | Unit]
    ): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setCuechange(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "cuechange", value.asInstanceOf[js.Any])
    
    inline def setCuechangeUndefined: Self = StObject.set(x, "cuechange", js.undefined)
    
    inline def setCut(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ ClipboardEvent, Boolean | Unit]
    ): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
    
    inline def setCutUndefined: Self = StObject.set(x, "cut", js.undefined)
    
    inline def setDblclick(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
    ): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    inline def setDblclickUndefined: Self = StObject.set(x, "dblclick", js.undefined)
    
    inline def setDrag(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ DragEvent, Boolean | Unit]
    ): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setDragend(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ DragEvent, Boolean | Unit]
    ): Self = StObject.set(x, "dragend", value.asInstanceOf[js.Any])
    
    inline def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
    
    inline def setDragenter(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ DragEvent, Boolean | Unit]
    ): Self = StObject.set(x, "dragenter", value.asInstanceOf[js.Any])
    
    inline def setDragenterUndefined: Self = StObject.set(x, "dragenter", js.undefined)
    
    inline def setDragleave(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ DragEvent, Boolean | Unit]
    ): Self = StObject.set(x, "dragleave", value.asInstanceOf[js.Any])
    
    inline def setDragleaveUndefined: Self = StObject.set(x, "dragleave", js.undefined)
    
    inline def setDragover(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ DragEvent, Boolean | Unit]
    ): Self = StObject.set(x, "dragover", value.asInstanceOf[js.Any])
    
    inline def setDragoverUndefined: Self = StObject.set(x, "dragover", js.undefined)
    
    inline def setDragstart(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ DragEvent, Boolean | Unit]
    ): Self = StObject.set(x, "dragstart", value.asInstanceOf[js.Any])
    
    inline def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
    
    inline def setDrop(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ DragEvent, Boolean | Unit]
    ): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setDurationchange(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "durationchange", value.asInstanceOf[js.Any])
    
    inline def setDurationchangeUndefined: Self = StObject.set(x, "durationchange", js.undefined)
    
    inline def setEmptied(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "emptied", value.asInstanceOf[js.Any])
    
    inline def setEmptiedUndefined: Self = StObject.set(x, "emptied", js.undefined)
    
    inline def setEnded(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
    
    inline def setEndedUndefined: Self = StObject.set(x, "ended", js.undefined)
    
    inline def setError(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ ErrorEvent, Boolean | Unit]
    ): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFocus(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ FocusEvent, Boolean | Unit]
    ): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setFocusin(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ FocusEvent, Boolean | Unit]
    ): Self = StObject.set(x, "focusin", value.asInstanceOf[js.Any])
    
    inline def setFocusinUndefined: Self = StObject.set(x, "focusin", js.undefined)
    
    inline def setFocusout(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ FocusEvent, Boolean | Unit]
    ): Self = StObject.set(x, "focusout", value.asInstanceOf[js.Any])
    
    inline def setFocusoutUndefined: Self = StObject.set(x, "focusout", js.undefined)
    
    inline def setFormdata(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ FormDataEvent, Boolean | Unit]
    ): Self = StObject.set(x, "formdata", value.asInstanceOf[js.Any])
    
    inline def setFormdataUndefined: Self = StObject.set(x, "formdata", js.undefined)
    
    inline def setFullscreenchange(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "fullscreenchange", value.asInstanceOf[js.Any])
    
    inline def setFullscreenchangeUndefined: Self = StObject.set(x, "fullscreenchange", js.undefined)
    
    inline def setFullscreenerror(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "fullscreenerror", value.asInstanceOf[js.Any])
    
    inline def setFullscreenerrorUndefined: Self = StObject.set(x, "fullscreenerror", js.undefined)
    
    inline def setGotpointercapture(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
    ): Self = StObject.set(x, "gotpointercapture", value.asInstanceOf[js.Any])
    
    inline def setGotpointercaptureUndefined: Self = StObject.set(x, "gotpointercapture", js.undefined)
    
    inline def setInput(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setInvalid(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    inline def setKeydown(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ KeyboardEvent, Boolean | Unit]
    ): Self = StObject.set(x, "keydown", value.asInstanceOf[js.Any])
    
    inline def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
    
    inline def setKeypress(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ KeyboardEvent, Boolean | Unit]
    ): Self = StObject.set(x, "keypress", value.asInstanceOf[js.Any])
    
    inline def setKeypressUndefined: Self = StObject.set(x, "keypress", js.undefined)
    
    inline def setKeyup(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ KeyboardEvent, Boolean | Unit]
    ): Self = StObject.set(x, "keyup", value.asInstanceOf[js.Any])
    
    inline def setKeyupUndefined: Self = StObject.set(x, "keyup", js.undefined)
    
    inline def setLoad(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setLoadeddata(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "loadeddata", value.asInstanceOf[js.Any])
    
    inline def setLoadeddataUndefined: Self = StObject.set(x, "loadeddata", js.undefined)
    
    inline def setLoadedmetadata(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "loadedmetadata", value.asInstanceOf[js.Any])
    
    inline def setLoadedmetadataUndefined: Self = StObject.set(x, "loadedmetadata", js.undefined)
    
    inline def setLoadstart(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
    
    inline def setLoadstartUndefined: Self = StObject.set(x, "loadstart", js.undefined)
    
    inline def setLostpointercapture(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
    ): Self = StObject.set(x, "lostpointercapture", value.asInstanceOf[js.Any])
    
    inline def setLostpointercaptureUndefined: Self = StObject.set(x, "lostpointercapture", js.undefined)
    
    inline def setMousedown(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
    ): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
    
    inline def setMousedownUndefined: Self = StObject.set(x, "mousedown", js.undefined)
    
    inline def setMouseenter(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
    ): Self = StObject.set(x, "mouseenter", value.asInstanceOf[js.Any])
    
    inline def setMouseenterUndefined: Self = StObject.set(x, "mouseenter", js.undefined)
    
    inline def setMouseleave(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
    ): Self = StObject.set(x, "mouseleave", value.asInstanceOf[js.Any])
    
    inline def setMouseleaveUndefined: Self = StObject.set(x, "mouseleave", js.undefined)
    
    inline def setMousemove(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
    ): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
    
    inline def setMousemoveUndefined: Self = StObject.set(x, "mousemove", js.undefined)
    
    inline def setMouseout(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
    ): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
    
    inline def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
    
    inline def setMouseover(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
    ): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
    
    inline def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
    
    inline def setMouseup(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
    ): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
    
    inline def setMouseupUndefined: Self = StObject.set(x, "mouseup", js.undefined)
    
    inline def setPaste(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ ClipboardEvent, Boolean | Unit]
    ): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
    
    inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
    
    inline def setPause(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setPlay(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
    
    inline def setPlaying(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
    
    inline def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
    
    inline def setPointercancel(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
    ): Self = StObject.set(x, "pointercancel", value.asInstanceOf[js.Any])
    
    inline def setPointercancelUndefined: Self = StObject.set(x, "pointercancel", js.undefined)
    
    inline def setPointerdown(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
    ): Self = StObject.set(x, "pointerdown", value.asInstanceOf[js.Any])
    
    inline def setPointerdownUndefined: Self = StObject.set(x, "pointerdown", js.undefined)
    
    inline def setPointerenter(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
    ): Self = StObject.set(x, "pointerenter", value.asInstanceOf[js.Any])
    
    inline def setPointerenterUndefined: Self = StObject.set(x, "pointerenter", js.undefined)
    
    inline def setPointerleave(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
    ): Self = StObject.set(x, "pointerleave", value.asInstanceOf[js.Any])
    
    inline def setPointerleaveUndefined: Self = StObject.set(x, "pointerleave", js.undefined)
    
    inline def setPointermove(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
    ): Self = StObject.set(x, "pointermove", value.asInstanceOf[js.Any])
    
    inline def setPointermoveUndefined: Self = StObject.set(x, "pointermove", js.undefined)
    
    inline def setPointerout(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
    ): Self = StObject.set(x, "pointerout", value.asInstanceOf[js.Any])
    
    inline def setPointeroutUndefined: Self = StObject.set(x, "pointerout", js.undefined)
    
    inline def setPointerover(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
    ): Self = StObject.set(x, "pointerover", value.asInstanceOf[js.Any])
    
    inline def setPointeroverUndefined: Self = StObject.set(x, "pointerover", js.undefined)
    
    inline def setPointerup(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
    ): Self = StObject.set(x, "pointerup", value.asInstanceOf[js.Any])
    
    inline def setPointerupUndefined: Self = StObject.set(x, "pointerup", js.undefined)
    
    inline def setProgress(
      value: js.ThisFunction2[
          /* this */ Any, 
          eventinkeyofDOMEventMapth, 
          /* event */ ProgressEvent[EventTarget], 
          Boolean | Unit
        ]
    ): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRatechange(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "ratechange", value.asInstanceOf[js.Any])
    
    inline def setRatechangeUndefined: Self = StObject.set(x, "ratechange", js.undefined)
    
    inline def setReset(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setResize(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ UIEvent, Boolean | Unit]
    ): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setScroll(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setSecuritypolicyviolation(
      value: js.ThisFunction2[
          /* this */ Any, 
          eventinkeyofDOMEventMapth, 
          /* event */ SecurityPolicyViolationEvent, 
          Boolean | Unit
        ]
    ): Self = StObject.set(x, "securitypolicyviolation", value.asInstanceOf[js.Any])
    
    inline def setSecuritypolicyviolationUndefined: Self = StObject.set(x, "securitypolicyviolation", js.undefined)
    
    inline def setSeeked(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "seeked", value.asInstanceOf[js.Any])
    
    inline def setSeekedUndefined: Self = StObject.set(x, "seeked", js.undefined)
    
    inline def setSeeking(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "seeking", value.asInstanceOf[js.Any])
    
    inline def setSeekingUndefined: Self = StObject.set(x, "seeking", js.undefined)
    
    inline def setSelect(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelectionchange(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "selectionchange", value.asInstanceOf[js.Any])
    
    inline def setSelectionchangeUndefined: Self = StObject.set(x, "selectionchange", js.undefined)
    
    inline def setSelectstart(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "selectstart", value.asInstanceOf[js.Any])
    
    inline def setSelectstartUndefined: Self = StObject.set(x, "selectstart", js.undefined)
    
    inline def setSlotchange(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "slotchange", value.asInstanceOf[js.Any])
    
    inline def setSlotchangeUndefined: Self = StObject.set(x, "slotchange", js.undefined)
    
    inline def setStalled(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "stalled", value.asInstanceOf[js.Any])
    
    inline def setStalledUndefined: Self = StObject.set(x, "stalled", js.undefined)
    
    inline def setSubmit(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ SubmitEvent, Boolean | Unit]
    ): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
    
    inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
    
    inline def setSuspend(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
    
    inline def setSuspendUndefined: Self = StObject.set(x, "suspend", js.undefined)
    
    inline def setTimeupdate(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "timeupdate", value.asInstanceOf[js.Any])
    
    inline def setTimeupdateUndefined: Self = StObject.set(x, "timeupdate", js.undefined)
    
    inline def setToggle(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    
    inline def setTouchcancel(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ TouchEvent, Boolean | Unit]
    ): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    inline def setTouchcancelUndefined: Self = StObject.set(x, "touchcancel", js.undefined)
    
    inline def setTouchend(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ TouchEvent, Boolean | Unit]
    ): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    inline def setTouchendUndefined: Self = StObject.set(x, "touchend", js.undefined)
    
    inline def setTouchmove(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ TouchEvent, Boolean | Unit]
    ): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    inline def setTouchmoveUndefined: Self = StObject.set(x, "touchmove", js.undefined)
    
    inline def setTouchstart(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ TouchEvent, Boolean | Unit]
    ): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    inline def setTouchstartUndefined: Self = StObject.set(x, "touchstart", js.undefined)
    
    inline def setTransitioncancel(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ TransitionEvent, Boolean | Unit]
    ): Self = StObject.set(x, "transitioncancel", value.asInstanceOf[js.Any])
    
    inline def setTransitioncancelUndefined: Self = StObject.set(x, "transitioncancel", js.undefined)
    
    inline def setTransitionend(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ TransitionEvent, Boolean | Unit]
    ): Self = StObject.set(x, "transitionend", value.asInstanceOf[js.Any])
    
    inline def setTransitionendUndefined: Self = StObject.set(x, "transitionend", js.undefined)
    
    inline def setTransitionrun(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ TransitionEvent, Boolean | Unit]
    ): Self = StObject.set(x, "transitionrun", value.asInstanceOf[js.Any])
    
    inline def setTransitionrunUndefined: Self = StObject.set(x, "transitionrun", js.undefined)
    
    inline def setTransitionstart(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ TransitionEvent, Boolean | Unit]
    ): Self = StObject.set(x, "transitionstart", value.asInstanceOf[js.Any])
    
    inline def setTransitionstartUndefined: Self = StObject.set(x, "transitionstart", js.undefined)
    
    inline def setVolumechange(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "volumechange", value.asInstanceOf[js.Any])
    
    inline def setVolumechangeUndefined: Self = StObject.set(x, "volumechange", js.undefined)
    
    inline def setWaiting(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
    
    inline def setWaitingUndefined: Self = StObject.set(x, "waiting", js.undefined)
    
    inline def setWebkitanimationend(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "webkitanimationend", value.asInstanceOf[js.Any])
    
    inline def setWebkitanimationendUndefined: Self = StObject.set(x, "webkitanimationend", js.undefined)
    
    inline def setWebkitanimationiteration(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "webkitanimationiteration", value.asInstanceOf[js.Any])
    
    inline def setWebkitanimationiterationUndefined: Self = StObject.set(x, "webkitanimationiteration", js.undefined)
    
    inline def setWebkitanimationstart(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "webkitanimationstart", value.asInstanceOf[js.Any])
    
    inline def setWebkitanimationstartUndefined: Self = StObject.set(x, "webkitanimationstart", js.undefined)
    
    inline def setWebkittransitionend(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
    ): Self = StObject.set(x, "webkittransitionend", value.asInstanceOf[js.Any])
    
    inline def setWebkittransitionendUndefined: Self = StObject.set(x, "webkittransitionend", js.undefined)
    
    inline def setWheel(
      value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ WheelEvent, Boolean | Unit]
    ): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
    
    inline def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
  }
}
