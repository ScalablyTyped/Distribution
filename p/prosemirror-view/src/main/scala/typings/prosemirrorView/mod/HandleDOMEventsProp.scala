package typings.prosemirrorView.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Schema
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

/* Inlined std.Partial<{[ K in keyof std.DocumentEventMap ]: (this : ThisT, view : prosemirror-view.prosemirror-view.EditorView<S>, event : std.DocumentEventMap[K]): boolean}> & {[key: string] : (this : ThisT, view : prosemirror-view.prosemirror-view.EditorView<S>, event : any): boolean} */
@js.native
trait HandleDOMEventsProp[ThisT, S /* <: Schema[_, _] */]
  extends /* key */ StringDictionary[
      js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ js.Any, Boolean]
    ] {
  
  var abort: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ UIEvent, Boolean]
  ] = js.native
  
  var animationcancel: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ AnimationEvent, Boolean]
  ] = js.native
  
  var animationend: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ AnimationEvent, Boolean]
  ] = js.native
  
  var animationiteration: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ AnimationEvent, Boolean]
  ] = js.native
  
  var animationstart: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ AnimationEvent, Boolean]
  ] = js.native
  
  var auxclick: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
  ] = js.native
  
  var blur: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ FocusEvent, Boolean]
  ] = js.native
  
  var cancel: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var canplay: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var canplaythrough: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var change: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var click: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
  ] = js.native
  
  var close: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var contextmenu: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
  ] = js.native
  
  var copy: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ ClipboardEvent, Boolean]
  ] = js.native
  
  var cuechange: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var cut: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ ClipboardEvent, Boolean]
  ] = js.native
  
  var dblclick: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
  ] = js.native
  
  var drag: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
  ] = js.native
  
  var dragend: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
  ] = js.native
  
  var dragenter: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
  ] = js.native
  
  var dragexit: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var dragleave: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
  ] = js.native
  
  var dragover: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
  ] = js.native
  
  var dragstart: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
  ] = js.native
  
  var drop: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
  ] = js.native
  
  var durationchange: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var emptied: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var ended: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var error: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ ErrorEvent, Boolean]
  ] = js.native
  
  var focus: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ FocusEvent, Boolean]
  ] = js.native
  
  var focusin: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ FocusEvent, Boolean]
  ] = js.native
  
  var focusout: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ FocusEvent, Boolean]
  ] = js.native
  
  var fullscreenchange: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var fullscreenerror: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var gotpointercapture: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
  ] = js.native
  
  var input: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var invalid: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var keydown: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]
  ] = js.native
  
  var keypress: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]
  ] = js.native
  
  var keyup: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]
  ] = js.native
  
  var load: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var loadeddata: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var loadedmetadata: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var loadstart: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var lostpointercapture: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
  ] = js.native
  
  var mousedown: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
  ] = js.native
  
  var mouseenter: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
  ] = js.native
  
  var mouseleave: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
  ] = js.native
  
  var mousemove: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
  ] = js.native
  
  var mouseout: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
  ] = js.native
  
  var mouseover: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
  ] = js.native
  
  var mouseup: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
  ] = js.native
  
  var paste: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ ClipboardEvent, Boolean]
  ] = js.native
  
  var pause: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var play: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var playing: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var pointercancel: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
  ] = js.native
  
  var pointerdown: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
  ] = js.native
  
  var pointerenter: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
  ] = js.native
  
  var pointerleave: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
  ] = js.native
  
  var pointerlockchange: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var pointerlockerror: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var pointermove: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
  ] = js.native
  
  var pointerout: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
  ] = js.native
  
  var pointerover: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
  ] = js.native
  
  var pointerup: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
  ] = js.native
  
  var progress: js.UndefOr[
    js.ThisFunction2[
      /* this */ ThisT, 
      /* view */ EditorView[S], 
      /* event */ ProgressEvent[EventTarget], 
      Boolean
    ]
  ] = js.native
  
  var ratechange: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var readystatechange: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var reset: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var resize: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ UIEvent, Boolean]
  ] = js.native
  
  var scroll: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var securitypolicyviolation: js.UndefOr[
    js.ThisFunction2[
      /* this */ ThisT, 
      /* view */ EditorView[S], 
      /* event */ SecurityPolicyViolationEvent, 
      Boolean
    ]
  ] = js.native
  
  var seeked: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var seeking: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var select: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var selectionchange: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var selectstart: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var stalled: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var submit: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var suspend: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var timeupdate: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var toggle: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var touchcancel: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TouchEvent, Boolean]
  ] = js.native
  
  var touchend: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TouchEvent, Boolean]
  ] = js.native
  
  var touchmove: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TouchEvent, Boolean]
  ] = js.native
  
  var touchstart: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TouchEvent, Boolean]
  ] = js.native
  
  var transitioncancel: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TransitionEvent, Boolean]
  ] = js.native
  
  var transitionend: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TransitionEvent, Boolean]
  ] = js.native
  
  var transitionrun: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TransitionEvent, Boolean]
  ] = js.native
  
  var transitionstart: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TransitionEvent, Boolean]
  ] = js.native
  
  var visibilitychange: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var volumechange: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var waiting: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
  ] = js.native
  
  var wheel: js.UndefOr[
    js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ WheelEvent, Boolean]
  ] = js.native
}
object HandleDOMEventsProp {
  
  @scala.inline
  def apply[ThisT, S /* <: Schema[_, _] */](): HandleDOMEventsProp[ThisT, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleDOMEventsProp[ThisT, S]]
  }
  
  @scala.inline
  implicit class HandleDOMEventsPropOps[Self <: HandleDOMEventsProp[_, _], ThisT, S /* <: Schema[_, _] */] (val x: Self with (HandleDOMEventsProp[ThisT, S])) extends AnyVal {
    
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
    def setAbort(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ UIEvent, Boolean]): Self = this.set("abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    
    @scala.inline
    def setAnimationcancel(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ AnimationEvent, Boolean]
    ): Self = this.set("animationcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationcancel: Self = this.set("animationcancel", js.undefined)
    
    @scala.inline
    def setAnimationend(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ AnimationEvent, Boolean]
    ): Self = this.set("animationend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationend: Self = this.set("animationend", js.undefined)
    
    @scala.inline
    def setAnimationiteration(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ AnimationEvent, Boolean]
    ): Self = this.set("animationiteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationiteration: Self = this.set("animationiteration", js.undefined)
    
    @scala.inline
    def setAnimationstart(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ AnimationEvent, Boolean]
    ): Self = this.set("animationstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationstart: Self = this.set("animationstart", js.undefined)
    
    @scala.inline
    def setAuxclick(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
    ): Self = this.set("auxclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuxclick: Self = this.set("auxclick", js.undefined)
    
    @scala.inline
    def setBlur(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ FocusEvent, Boolean]
    ): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    
    @scala.inline
    def setCancel(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setCanplay(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("canplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanplay: Self = this.set("canplay", js.undefined)
    
    @scala.inline
    def setCanplaythrough(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("canplaythrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanplaythrough: Self = this.set("canplaythrough", js.undefined)
    
    @scala.inline
    def setChange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setClick(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
    ): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setClose(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setContextmenu(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
    ): Self = this.set("contextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextmenu: Self = this.set("contextmenu", js.undefined)
    
    @scala.inline
    def setCopy(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ ClipboardEvent, Boolean]
    ): Self = this.set("copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setCuechange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("cuechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCuechange: Self = this.set("cuechange", js.undefined)
    
    @scala.inline
    def setCut(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ ClipboardEvent, Boolean]
    ): Self = this.set("cut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCut: Self = this.set("cut", js.undefined)
    
    @scala.inline
    def setDblclick(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
    ): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDblclick: Self = this.set("dblclick", js.undefined)
    
    @scala.inline
    def setDrag(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
    ): Self = this.set("drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragend(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
    ): Self = this.set("dragend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragend: Self = this.set("dragend", js.undefined)
    
    @scala.inline
    def setDragenter(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
    ): Self = this.set("dragenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragenter: Self = this.set("dragenter", js.undefined)
    
    @scala.inline
    def setDragexit(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("dragexit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragexit: Self = this.set("dragexit", js.undefined)
    
    @scala.inline
    def setDragleave(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
    ): Self = this.set("dragleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragleave: Self = this.set("dragleave", js.undefined)
    
    @scala.inline
    def setDragover(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
    ): Self = this.set("dragover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragover: Self = this.set("dragover", js.undefined)
    
    @scala.inline
    def setDragstart(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
    ): Self = this.set("dragstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragstart: Self = this.set("dragstart", js.undefined)
    
    @scala.inline
    def setDrop(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
    ): Self = this.set("drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setDurationchange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("durationchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationchange: Self = this.set("durationchange", js.undefined)
    
    @scala.inline
    def setEmptied(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("emptied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptied: Self = this.set("emptied", js.undefined)
    
    @scala.inline
    def setEnded(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("ended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnded: Self = this.set("ended", js.undefined)
    
    @scala.inline
    def setError(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ ErrorEvent, Boolean]
    ): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFocus(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ FocusEvent, Boolean]
    ): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setFocusin(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ FocusEvent, Boolean]
    ): Self = this.set("focusin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusin: Self = this.set("focusin", js.undefined)
    
    @scala.inline
    def setFocusout(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ FocusEvent, Boolean]
    ): Self = this.set("focusout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusout: Self = this.set("focusout", js.undefined)
    
    @scala.inline
    def setFullscreenchange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("fullscreenchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreenchange: Self = this.set("fullscreenchange", js.undefined)
    
    @scala.inline
    def setFullscreenerror(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("fullscreenerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreenerror: Self = this.set("fullscreenerror", js.undefined)
    
    @scala.inline
    def setGotpointercapture(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
    ): Self = this.set("gotpointercapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGotpointercapture: Self = this.set("gotpointercapture", js.undefined)
    
    @scala.inline
    def setInput(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setInvalid(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    
    @scala.inline
    def setKeydown(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]
    ): Self = this.set("keydown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeydown: Self = this.set("keydown", js.undefined)
    
    @scala.inline
    def setKeypress(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]
    ): Self = this.set("keypress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeypress: Self = this.set("keypress", js.undefined)
    
    @scala.inline
    def setKeyup(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]
    ): Self = this.set("keyup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyup: Self = this.set("keyup", js.undefined)
    
    @scala.inline
    def setLoad(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLoadeddata(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("loadeddata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadeddata: Self = this.set("loadeddata", js.undefined)
    
    @scala.inline
    def setLoadedmetadata(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("loadedmetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadedmetadata: Self = this.set("loadedmetadata", js.undefined)
    
    @scala.inline
    def setLoadstart(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("loadstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadstart: Self = this.set("loadstart", js.undefined)
    
    @scala.inline
    def setLostpointercapture(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
    ): Self = this.set("lostpointercapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLostpointercapture: Self = this.set("lostpointercapture", js.undefined)
    
    @scala.inline
    def setMousedown(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
    ): Self = this.set("mousedown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMousedown: Self = this.set("mousedown", js.undefined)
    
    @scala.inline
    def setMouseenter(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
    ): Self = this.set("mouseenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseenter: Self = this.set("mouseenter", js.undefined)
    
    @scala.inline
    def setMouseleave(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
    ): Self = this.set("mouseleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseleave: Self = this.set("mouseleave", js.undefined)
    
    @scala.inline
    def setMousemove(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
    ): Self = this.set("mousemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMousemove: Self = this.set("mousemove", js.undefined)
    
    @scala.inline
    def setMouseout(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
    ): Self = this.set("mouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseout: Self = this.set("mouseout", js.undefined)
    
    @scala.inline
    def setMouseover(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
    ): Self = this.set("mouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseover: Self = this.set("mouseover", js.undefined)
    
    @scala.inline
    def setMouseup(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
    ): Self = this.set("mouseup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseup: Self = this.set("mouseup", js.undefined)
    
    @scala.inline
    def setPaste(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ ClipboardEvent, Boolean]
    ): Self = this.set("paste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaste: Self = this.set("paste", js.undefined)
    
    @scala.inline
    def setPause(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    
    @scala.inline
    def setPlay(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("play", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    
    @scala.inline
    def setPlaying(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("playing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaying: Self = this.set("playing", js.undefined)
    
    @scala.inline
    def setPointercancel(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
    ): Self = this.set("pointercancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointercancel: Self = this.set("pointercancel", js.undefined)
    
    @scala.inline
    def setPointerdown(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
    ): Self = this.set("pointerdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerdown: Self = this.set("pointerdown", js.undefined)
    
    @scala.inline
    def setPointerenter(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
    ): Self = this.set("pointerenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerenter: Self = this.set("pointerenter", js.undefined)
    
    @scala.inline
    def setPointerleave(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
    ): Self = this.set("pointerleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerleave: Self = this.set("pointerleave", js.undefined)
    
    @scala.inline
    def setPointerlockchange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("pointerlockchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerlockchange: Self = this.set("pointerlockchange", js.undefined)
    
    @scala.inline
    def setPointerlockerror(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("pointerlockerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerlockerror: Self = this.set("pointerlockerror", js.undefined)
    
    @scala.inline
    def setPointermove(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
    ): Self = this.set("pointermove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointermove: Self = this.set("pointermove", js.undefined)
    
    @scala.inline
    def setPointerout(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
    ): Self = this.set("pointerout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerout: Self = this.set("pointerout", js.undefined)
    
    @scala.inline
    def setPointerover(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
    ): Self = this.set("pointerover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerover: Self = this.set("pointerover", js.undefined)
    
    @scala.inline
    def setPointerup(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
    ): Self = this.set("pointerup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerup: Self = this.set("pointerup", js.undefined)
    
    @scala.inline
    def setProgress(
      value: js.ThisFunction2[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* event */ ProgressEvent[EventTarget], 
          Boolean
        ]
    ): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setRatechange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("ratechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatechange: Self = this.set("ratechange", js.undefined)
    
    @scala.inline
    def setReadystatechange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("readystatechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadystatechange: Self = this.set("readystatechange", js.undefined)
    
    @scala.inline
    def setReset(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setResize(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ UIEvent, Boolean]): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setScroll(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setSecuritypolicyviolation(
      value: js.ThisFunction2[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* event */ SecurityPolicyViolationEvent, 
          Boolean
        ]
    ): Self = this.set("securitypolicyviolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecuritypolicyviolation: Self = this.set("securitypolicyviolation", js.undefined)
    
    @scala.inline
    def setSeeked(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("seeked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeeked: Self = this.set("seeked", js.undefined)
    
    @scala.inline
    def setSeeking(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("seeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeeking: Self = this.set("seeking", js.undefined)
    
    @scala.inline
    def setSelect(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSelectionchange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("selectionchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionchange: Self = this.set("selectionchange", js.undefined)
    
    @scala.inline
    def setSelectstart(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("selectstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectstart: Self = this.set("selectstart", js.undefined)
    
    @scala.inline
    def setStalled(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("stalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStalled: Self = this.set("stalled", js.undefined)
    
    @scala.inline
    def setSubmit(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("submit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmit: Self = this.set("submit", js.undefined)
    
    @scala.inline
    def setSuspend(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("suspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspend: Self = this.set("suspend", js.undefined)
    
    @scala.inline
    def setTimeupdate(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("timeupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeupdate: Self = this.set("timeupdate", js.undefined)
    
    @scala.inline
    def setToggle(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    
    @scala.inline
    def setTouchcancel(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TouchEvent, Boolean]
    ): Self = this.set("touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchcancel: Self = this.set("touchcancel", js.undefined)
    
    @scala.inline
    def setTouchend(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TouchEvent, Boolean]
    ): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchend: Self = this.set("touchend", js.undefined)
    
    @scala.inline
    def setTouchmove(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TouchEvent, Boolean]
    ): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchmove: Self = this.set("touchmove", js.undefined)
    
    @scala.inline
    def setTouchstart(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TouchEvent, Boolean]
    ): Self = this.set("touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchstart: Self = this.set("touchstart", js.undefined)
    
    @scala.inline
    def setTransitioncancel(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TransitionEvent, Boolean]
    ): Self = this.set("transitioncancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitioncancel: Self = this.set("transitioncancel", js.undefined)
    
    @scala.inline
    def setTransitionend(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TransitionEvent, Boolean]
    ): Self = this.set("transitionend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionend: Self = this.set("transitionend", js.undefined)
    
    @scala.inline
    def setTransitionrun(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TransitionEvent, Boolean]
    ): Self = this.set("transitionrun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionrun: Self = this.set("transitionrun", js.undefined)
    
    @scala.inline
    def setTransitionstart(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TransitionEvent, Boolean]
    ): Self = this.set("transitionstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionstart: Self = this.set("transitionstart", js.undefined)
    
    @scala.inline
    def setVisibilitychange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("visibilitychange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibilitychange: Self = this.set("visibilitychange", js.undefined)
    
    @scala.inline
    def setVolumechange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("volumechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumechange: Self = this.set("volumechange", js.undefined)
    
    @scala.inline
    def setWaiting(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = this.set("waiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaiting: Self = this.set("waiting", js.undefined)
    
    @scala.inline
    def setWheel(
      value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ WheelEvent, Boolean]
    ): Self = this.set("wheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheel: Self = this.set("wheel", js.undefined)
  }
}
