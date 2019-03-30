package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalEventHandlers extends js.Object {
  /**
    * Fires when the user aborts the download.
    * @param ev The event.
    */
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | scala.Null = js.native
  var onanimationcancel: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | scala.Null = js.native
  var onanimationend: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | scala.Null = js.native
  var onanimationiteration: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | scala.Null = js.native
  var onanimationstart: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | scala.Null = js.native
  var onauxclick: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the object loses the input focus.
    * @param ev The focus event.
    */
  var onblur: (js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | scala.Null = js.native
  var oncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when playback is possible, but would require further buffering.
    * @param ev The event.
    */
  var oncanplay: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var oncanplaythrough: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the contents of the object or selection have changed.
    * @param ev The event.
    */
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the user clicks the left mouse button on the object
    * @param ev The mouse event.
    */
  var onclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the user clicks the right mouse button in the client area, opening the context menu.
    * @param ev The mouse event.
    */
  var oncontextmenu: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  var oncuechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the user double-clicks the object.
    * @param ev The mouse event.
    */
  var ondblclick: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  /**
    * Fires on the source object continuously during a drag operation.
    * @param ev The event.
    */
  var ondrag: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | scala.Null = js.native
  /**
    * Fires on the source object when the user releases the mouse at the close of a drag operation.
    * @param ev The event.
    */
  var ondragend: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | scala.Null = js.native
  /**
    * Fires on the target element when the user drags the object to a valid drop target.
    * @param ev The drag event.
    */
  var ondragenter: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | scala.Null = js.native
  var ondragexit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
    * @param ev The drag event.
    */
  var ondragleave: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | scala.Null = js.native
  /**
    * Fires on the target element continuously while the user drags the object over a valid drop target.
    * @param ev The event.
    */
  var ondragover: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | scala.Null = js.native
  /**
    * Fires on the source object when the user starts to drag a text selection or selected object.
    * @param ev The event.
    */
  var ondragstart: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | scala.Null = js.native
  var ondrop: (js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | scala.Null = js.native
  /**
    * Occurs when the duration attribute is updated.
    * @param ev The event.
    */
  var ondurationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when the media element is reset to its initial state.
    * @param ev The event.
    */
  var onemptied: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when the end of playback is reached.
    * @param ev The event
    */
  var onended: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when an error occurs during object loading.
    * @param ev The event.
    */
  var onerror: OnErrorEventHandler = js.native
  /**
    * Fires when the object receives focus.
    * @param ev The event.
    */
  var onfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | scala.Null = js.native
  var ongotpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  var oninput: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var oninvalid: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the user presses a key.
    * @param ev The keyboard event
    */
  var onkeydown: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | scala.Null = js.native
  /**
    * Fires when the user presses an alphanumeric key.
    * @param ev The event.
    */
  var onkeypress: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | scala.Null = js.native
  /**
    * Fires when the user releases a key.
    * @param ev The keyboard event
    */
  var onkeyup: (js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | scala.Null = js.native
  /**
    * Fires immediately after the browser loads the object.
    * @param ev The event.
    */
  var onload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when media data is loaded at the current playback position.
    * @param ev The event.
    */
  var onloadeddata: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when the duration and dimensions of the media have been determined.
    * @param ev The event.
    */
  var onloadedmetadata: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onloadend: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  /**
    * Occurs when Internet Explorer begins looking for media data.
    * @param ev The event.
    */
  var onloadstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onlostpointercapture: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  /**
    * Fires when the user clicks the object with either mouse button.
    * @param ev The mouse event.
    */
  var onmousedown: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  var onmouseenter: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  var onmouseleave: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  /**
    * Fires when the user moves the mouse over the object.
    * @param ev The mouse event.
    */
  var onmousemove: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  /**
    * Fires when the user moves the mouse pointer outside the boundaries of the object.
    * @param ev The mouse event.
    */
  var onmouseout: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  /**
    * Fires when the user moves the mouse pointer into the object.
    * @param ev The mouse event.
    */
  var onmouseover: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  /**
    * Fires when the user releases a mouse button while the mouse is over the object.
    * @param ev The mouse event.
    */
  var onmouseup: (js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | scala.Null = js.native
  /**
    * Occurs when playback is paused.
    * @param ev The event.
    */
  var onpause: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when the play method is requested.
    * @param ev The event.
    */
  var onplay: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when the audio or video has started playing.
    * @param ev The event.
    */
  var onplaying: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onpointercancel: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  var onpointerdown: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  var onpointerenter: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  var onpointerleave: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  var onpointermove: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  var onpointerout: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  var onpointerover: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  var onpointerup: (js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | scala.Null = js.native
  /**
    * Occurs to indicate progress while downloading media data.
    * @param ev The event.
    */
  var onprogress: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  /**
    * Occurs when the playback rate is increased or decreased.
    * @param ev The event.
    */
  var onratechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the user resets a form.
    * @param ev The event.
    */
  var onreset: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onresize: (js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | scala.Null = js.native
  /**
    * Fires when the user repositions the scroll box in the scroll bar on the object.
    * @param ev The event.
    */
  var onscroll: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onsecuritypolicyviolation: (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]) | scala.Null = js.native
  /**
    * Occurs when the seek operation ends.
    * @param ev The event.
    */
  var onseeked: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when the current playback position is moved.
    * @param ev The event.
    */
  var onseeking: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the current selection changes.
    * @param ev The event.
    */
  var onselect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onselectionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onselectstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when the download has stopped.
    * @param ev The event.
    */
  var onstalled: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onsubmit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs if the load operation has been intentionally halted.
    * @param ev The event.
    */
  var onsuspend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs to indicate the current playback position.
    * @param ev The event.
    */
  var ontimeupdate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var ontoggle: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var ontouchcancel: (js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | scala.Null = js.native
  var ontouchend: (js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | scala.Null = js.native
  var ontouchmove: (js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | scala.Null = js.native
  var ontouchstart: (js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | scala.Null = js.native
  var ontransitioncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | scala.Null = js.native
  var ontransitionend: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | scala.Null = js.native
  var ontransitionrun: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | scala.Null = js.native
  var ontransitionstart: (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | scala.Null = js.native
  /**
    * Occurs when the volume is changed, or playback is muted or unmuted.
    * @param ev The event.
    */
  var onvolumechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Occurs when playback stops because the next frame of a video resource is not available.
    * @param ev The event.
    */
  var onwaiting: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onwheel: (js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]) | scala.Null = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: stdLib.stdLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: stdLib.stdLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: stdLib.stdLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: stdLib.stdLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: stdLib.stdLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: stdLib.stdLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: stdLib.stdLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: stdLib.stdLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: stdLib.stdLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: stdLib.stdLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: stdLib.stdLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: stdLib.stdLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: stdLib.stdLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: stdLib.stdLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: stdLib.stdLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: stdLib.stdLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: stdLib.stdLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: stdLib.stdLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: stdLib.stdLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: stdLib.stdLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: stdLib.stdLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: stdLib.stdLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: stdLib.stdLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: stdLib.stdLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: stdLib.stdLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: stdLib.stdLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: stdLib.stdLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: stdLib.stdLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: stdLib.stdLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: stdLib.stdLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: stdLib.stdLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: stdLib.stdLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: stdLib.stdLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: stdLib.stdLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: stdLib.stdLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: stdLib.stdLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: stdLib.stdLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: stdLib.stdLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: stdLib.stdLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: stdLib.stdLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: stdLib.stdLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: stdLib.stdLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: stdLib.stdLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: stdLib.stdLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: stdLib.stdLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: stdLib.stdLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: stdLib.stdLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: stdLib.stdLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: stdLib.stdLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: stdLib.stdLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: stdLib.stdLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: stdLib.stdLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: stdLib.stdLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: stdLib.stdLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: stdLib.stdLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: stdLib.stdLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: stdLib.stdLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: stdLib.stdLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: stdLib.stdLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: stdLib.stdLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: stdLib.stdLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: stdLib.stdLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: stdLib.stdLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: stdLib.stdLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: stdLib.stdLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: stdLib.stdLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: stdLib.stdLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: stdLib.stdLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: stdLib.stdLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: stdLib.stdLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: stdLib.stdLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: stdLib.stdLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: stdLib.stdLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: stdLib.stdLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: stdLib.stdLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: stdLib.stdLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: stdLib.stdLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: stdLib.stdLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: stdLib.stdLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: stdLib.stdLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: stdLib.stdLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: stdLib.stdLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: stdLib.stdLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: stdLib.stdLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: stdLib.stdLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: stdLib.stdLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: stdLib.stdLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: stdLib.stdLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: stdLib.stdLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: stdLib.stdLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: stdLib.stdLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: stdLib.stdLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: stdLib.stdLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: stdLib.stdLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: stdLib.stdLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: stdLib.stdLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: stdLib.stdLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: stdLib.stdLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: stdLib.stdLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: stdLib.stdLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: stdLib.stdLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: stdLib.stdLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: stdLib.stdLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: stdLib.stdLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: stdLib.stdLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: stdLib.stdLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: stdLib.stdLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: stdLib.stdLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: stdLib.stdLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: stdLib.stdLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: stdLib.stdLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: stdLib.stdLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: stdLib.stdLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: stdLib.stdLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: stdLib.stdLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: stdLib.stdLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: stdLib.stdLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: stdLib.stdLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: stdLib.stdLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: stdLib.stdLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: stdLib.stdLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: stdLib.stdLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: stdLib.stdLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: stdLib.stdLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: stdLib.stdLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: stdLib.stdLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: stdLib.stdLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: stdLib.stdLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: stdLib.stdLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: stdLib.stdLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: stdLib.stdLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: stdLib.stdLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: stdLib.stdLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: stdLib.stdLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: stdLib.stdLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: stdLib.stdLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: stdLib.stdLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: stdLib.stdLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: stdLib.stdLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: stdLib.stdLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: stdLib.stdLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: stdLib.stdLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: stdLib.stdLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: stdLib.stdLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: stdLib.stdLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: stdLib.stdLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: stdLib.stdLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: stdLib.stdLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: stdLib.stdLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: stdLib.stdLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: stdLib.stdLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: stdLib.stdLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: stdLib.stdLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: stdLib.stdLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: stdLib.stdLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: stdLib.stdLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: stdLib.stdLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: stdLib.stdLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: stdLib.stdLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: stdLib.stdLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: stdLib.stdLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: stdLib.stdLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: stdLib.stdLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: stdLib.stdLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: stdLib.stdLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: stdLib.stdLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: stdLib.stdLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: stdLib.stdLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: stdLib.stdLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: stdLib.stdLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: stdLib.stdLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: stdLib.stdLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: stdLib.stdLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: stdLib.stdLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: stdLib.stdLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: stdLib.stdLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: stdLib.stdLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: stdLib.stdLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: stdLib.stdLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: stdLib.stdLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: stdLib.stdLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: stdLib.stdLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: stdLib.stdLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: stdLib.stdLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: stdLib.stdLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: stdLib.stdLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: stdLib.stdLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: stdLib.stdLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: stdLib.stdLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: stdLib.stdLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: stdLib.stdLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: stdLib.stdLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: stdLib.stdLibStrings.selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: stdLib.stdLibStrings.selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionchange(
    `type`: stdLib.stdLibStrings.selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: stdLib.stdLibStrings.selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: stdLib.stdLibStrings.selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectstart(
    `type`: stdLib.stdLibStrings.selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stdLib.stdLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stdLib.stdLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: stdLib.stdLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: stdLib.stdLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: stdLib.stdLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: stdLib.stdLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: stdLib.stdLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: stdLib.stdLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: stdLib.stdLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: stdLib.stdLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: stdLib.stdLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: stdLib.stdLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: stdLib.stdLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: stdLib.stdLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: stdLib.stdLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: stdLib.stdLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: stdLib.stdLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: stdLib.stdLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: stdLib.stdLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: stdLib.stdLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: stdLib.stdLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: stdLib.stdLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: stdLib.stdLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: stdLib.stdLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: stdLib.stdLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: stdLib.stdLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: stdLib.stdLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: stdLib.stdLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: stdLib.stdLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: stdLib.stdLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: stdLib.stdLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: stdLib.stdLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: stdLib.stdLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: stdLib.stdLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: stdLib.stdLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: stdLib.stdLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: stdLib.stdLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: stdLib.stdLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: stdLib.stdLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: stdLib.stdLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: stdLib.stdLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: stdLib.stdLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: stdLib.stdLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: stdLib.stdLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: stdLib.stdLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: stdLib.stdLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: stdLib.stdLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: stdLib.stdLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: stdLib.stdLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: stdLib.stdLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: stdLib.stdLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: stdLib.stdLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: stdLib.stdLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: stdLib.stdLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: stdLib.stdLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: stdLib.stdLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: stdLib.stdLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: stdLib.stdLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: stdLib.stdLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: stdLib.stdLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: stdLib.stdLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: stdLib.stdLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: stdLib.stdLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: stdLib.stdLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: stdLib.stdLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: stdLib.stdLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: stdLib.stdLibStrings.blur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: stdLib.stdLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: stdLib.stdLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: stdLib.stdLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: stdLib.stdLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: stdLib.stdLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: stdLib.stdLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: stdLib.stdLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: stdLib.stdLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: stdLib.stdLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: stdLib.stdLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: stdLib.stdLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: stdLib.stdLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: stdLib.stdLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: stdLib.stdLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: stdLib.stdLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: stdLib.stdLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: stdLib.stdLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: stdLib.stdLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: stdLib.stdLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: stdLib.stdLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: stdLib.stdLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: stdLib.stdLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: stdLib.stdLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: stdLib.stdLibStrings.drag,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: stdLib.stdLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: stdLib.stdLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: stdLib.stdLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: stdLib.stdLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: stdLib.stdLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: stdLib.stdLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: stdLib.stdLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: stdLib.stdLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: stdLib.stdLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: stdLib.stdLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: stdLib.stdLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: stdLib.stdLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: stdLib.stdLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: stdLib.stdLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: stdLib.stdLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: stdLib.stdLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: stdLib.stdLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: stdLib.stdLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: stdLib.stdLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: stdLib.stdLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: stdLib.stdLibStrings.drop,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: stdLib.stdLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: stdLib.stdLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: stdLib.stdLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: stdLib.stdLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: stdLib.stdLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: stdLib.stdLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: stdLib.stdLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: stdLib.stdLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: stdLib.stdLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: stdLib.stdLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: stdLib.stdLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: stdLib.stdLibStrings.focus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: stdLib.stdLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: stdLib.stdLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: stdLib.stdLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: stdLib.stdLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: stdLib.stdLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: stdLib.stdLibStrings.input,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: stdLib.stdLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: stdLib.stdLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: stdLib.stdLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: stdLib.stdLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: stdLib.stdLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: stdLib.stdLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: stdLib.stdLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: stdLib.stdLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: stdLib.stdLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: stdLib.stdLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: stdLib.stdLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: stdLib.stdLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: stdLib.stdLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: stdLib.stdLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: stdLib.stdLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: stdLib.stdLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: stdLib.stdLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: stdLib.stdLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: stdLib.stdLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: stdLib.stdLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: stdLib.stdLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: stdLib.stdLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: stdLib.stdLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: stdLib.stdLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: stdLib.stdLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: stdLib.stdLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: stdLib.stdLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: stdLib.stdLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: stdLib.stdLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: stdLib.stdLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: stdLib.stdLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: stdLib.stdLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: stdLib.stdLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: stdLib.stdLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: stdLib.stdLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: stdLib.stdLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: stdLib.stdLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: stdLib.stdLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: stdLib.stdLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: stdLib.stdLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: stdLib.stdLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: stdLib.stdLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: stdLib.stdLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: stdLib.stdLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: stdLib.stdLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: stdLib.stdLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: stdLib.stdLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: stdLib.stdLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: stdLib.stdLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: stdLib.stdLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: stdLib.stdLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: stdLib.stdLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: stdLib.stdLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: stdLib.stdLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: stdLib.stdLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: stdLib.stdLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: stdLib.stdLibStrings.play,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: stdLib.stdLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: stdLib.stdLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: stdLib.stdLibStrings.playing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: stdLib.stdLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: stdLib.stdLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: stdLib.stdLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: stdLib.stdLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: stdLib.stdLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: stdLib.stdLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: stdLib.stdLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: stdLib.stdLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: stdLib.stdLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: stdLib.stdLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: stdLib.stdLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: stdLib.stdLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: stdLib.stdLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: stdLib.stdLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: stdLib.stdLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: stdLib.stdLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: stdLib.stdLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: stdLib.stdLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: stdLib.stdLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: stdLib.stdLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: stdLib.stdLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: stdLib.stdLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: stdLib.stdLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: stdLib.stdLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: stdLib.stdLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: stdLib.stdLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: stdLib.stdLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: stdLib.stdLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: stdLib.stdLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: stdLib.stdLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: stdLib.stdLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: stdLib.stdLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: stdLib.stdLibStrings.reset,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: stdLib.stdLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: stdLib.stdLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: stdLib.stdLibStrings.resize,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: stdLib.stdLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: stdLib.stdLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: stdLib.stdLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: stdLib.stdLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: stdLib.stdLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: stdLib.stdLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: stdLib.stdLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: stdLib.stdLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: stdLib.stdLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: stdLib.stdLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: stdLib.stdLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: stdLib.stdLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: stdLib.stdLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: stdLib.stdLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: stdLib.stdLibStrings.select,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: stdLib.stdLibStrings.selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: stdLib.stdLibStrings.selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionchange(
    `type`: stdLib.stdLibStrings.selectionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: stdLib.stdLibStrings.selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: stdLib.stdLibStrings.selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectstart(
    `type`: stdLib.stdLibStrings.selectstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stdLib.stdLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stdLib.stdLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: stdLib.stdLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: stdLib.stdLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: stdLib.stdLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: stdLib.stdLibStrings.submit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: stdLib.stdLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: stdLib.stdLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: stdLib.stdLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: stdLib.stdLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: stdLib.stdLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: stdLib.stdLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: stdLib.stdLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: stdLib.stdLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: stdLib.stdLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: stdLib.stdLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: stdLib.stdLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: stdLib.stdLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: stdLib.stdLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: stdLib.stdLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: stdLib.stdLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: stdLib.stdLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: stdLib.stdLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: stdLib.stdLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: stdLib.stdLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: stdLib.stdLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: stdLib.stdLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: stdLib.stdLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: stdLib.stdLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: stdLib.stdLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: stdLib.stdLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: stdLib.stdLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: stdLib.stdLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: stdLib.stdLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: stdLib.stdLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: stdLib.stdLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: stdLib.stdLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: stdLib.stdLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: stdLib.stdLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: stdLib.stdLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: stdLib.stdLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: stdLib.stdLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: stdLib.stdLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: stdLib.stdLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: stdLib.stdLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: stdLib.stdLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: stdLib.stdLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: stdLib.stdLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
}

