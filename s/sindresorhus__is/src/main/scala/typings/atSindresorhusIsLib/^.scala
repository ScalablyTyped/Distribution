package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  val Array: ArrayConstructor = js.native
  val ArrayBuffer: ArrayBufferConstructor = js.native
  var Atomics: atSindresorhusIsLib.Atomics = js.native
  val Boolean: BooleanConstructor = js.native
  var CSS: atSindresorhusIsLib.CSS = js.native
  val DataView: DataViewConstructor = js.native
  val Date: DateConstructor = js.native
  val Error: ErrorConstructor = js.native
  val EvalError: EvalErrorConstructor = js.native
  val Float32Array: Float32ArrayConstructor = js.native
  val Float64Array: Float64ArrayConstructor = js.native
  val Function: FunctionConstructor = js.native
  val Infinity: scala.Double = js.native
  val Int16Array: Int16ArrayConstructor = js.native
  val Int32Array: Int32ArrayConstructor = js.native
  val Int8Array: Int8ArrayConstructor = js.native
  /**
    * An intrinsic object that provides functions to convert JavaScript values to and from the JavaScript Object Notation (JSON) format.
    */
  val JSON: atSindresorhusIsLib.JSON = js.native
  var Map: MapConstructor = js.native
  /** An intrinsic object that provides basic mathematics functionality and constants. */
  val Math: atSindresorhusIsLib.Math = js.native
  /////////////////////////////
  /// ECMAScript APIs
  /////////////////////////////
  val NaN: scala.Double = js.native
  /** An object that represents a number of any kind. All JavaScript numbers are 64-bit floating-point numbers. */
  val Number: NumberConstructor = js.native
  /**
    * Provides functionality common to all JavaScript objects.
    */
  val Object: ObjectConstructor = js.native
  var Promise: PromiseConstructor = js.native
  var Proxy: ProxyConstructor = js.native
  val RangeError: RangeErrorConstructor = js.native
  val ReferenceError: ReferenceErrorConstructor = js.native
  val RegExp: RegExpConstructor = js.native
  var ServiceUIFrameContext: atSindresorhusIsLib.ServiceUIFrameContext = js.native
  var Set: SetConstructor = js.native
  var SharedArrayBuffer: SharedArrayBufferConstructor = js.native
  /**
    * Allows manipulation and formatting of text strings and determination and location of substrings within strings.
    */
  val String: StringConstructor = js.native
  val SyntaxError: SyntaxErrorConstructor = js.native
  val TypeError: TypeErrorConstructor = js.native
  val URIError: URIErrorConstructor = js.native
  val Uint16Array: Uint16ArrayConstructor = js.native
  val Uint32Array: Uint32ArrayConstructor = js.native
  val Uint8Array: Uint8ArrayConstructor = js.native
  val Uint8ClampedArray: Uint8ClampedArrayConstructor = js.native
  var WeakMap: WeakMapConstructor = js.native
  var WeakSet: WeakSetConstructor = js.native
  var applicationCache: ApplicationCache = js.native
  var caches: CacheStorage = js.native
  var clientInformation: Navigator = js.native
  var closed: scala.Boolean = js.native
  var console: Console = js.native
  var crypto: Crypto = js.native
  var customElements: CustomElementRegistry = js.native
  var defaultStatus: java.lang.String = js.native
  var devicePixelRatio: scala.Double = js.native
  var doNotTrack: java.lang.String = js.native
  var document: Document = js.native
  var event: js.UndefOr[Event] = js.native
  /** @deprecated */
  var external: External = js.native
  var frameElement: Element = js.native
  var frames: Window = js.native
  var history: History = js.native
  var indexedDB: IDBFactory = js.native
  var innerHeight: scala.Double = js.native
  var innerWidth: scala.Double = js.native
  var isSecureContext: scala.Boolean = js.native
  var length: scala.Double = js.native
  var localStorage: Storage = js.native
  var location: Location = js.native
  var locationbar: BarProp = js.native
  var menubar: BarProp = js.native
  var msContentScript: ExtensionScriptApis = js.native
  val name: scala.Nothing = js.native
  var navigator: Navigator = js.native
  var offscreenBuffering: java.lang.String | scala.Boolean = js.native
  /**
    * Fires when the user aborts the download.
    * @param ev The event.
    */
  var onabort: (js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, js.Any]) | scala.Null = js.native
  var onafterprint: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onanimationcancel: (js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, js.Any]) | scala.Null = js.native
  var onanimationend: (js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, js.Any]) | scala.Null = js.native
  var onanimationiteration: (js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, js.Any]) | scala.Null = js.native
  var onanimationstart: (js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, js.Any]) | scala.Null = js.native
  var onauxclick: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onbeforeprint: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onbeforeunload: (js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the object loses the input focus.
    * @param ev The focus event.
    */
  var onblur: (js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, js.Any]) | scala.Null = js.native
  var oncancel: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when playback is possible, but would require further buffering.
    * @param ev The event.
    */
  var oncanplay: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var oncanplaythrough: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the contents of the object or selection have changed.
    * @param ev The event.
    */
  var onchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user clicks the left mouse button on the object
    * @param ev The mouse event.
    */
  var onclick: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var onclose: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var oncompassneedscalibration: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user clicks the right mouse button in the client area, opening the context menu.
    * @param ev The mouse event.
    */
  var oncontextmenu: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var oncuechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user double-clicks the object.
    * @param ev The mouse event.
    */
  var ondblclick: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var ondevicelight: (js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, js.Any]) | scala.Null = js.native
  var ondevicemotion: (js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, js.Any]) | scala.Null = js.native
  var ondeviceorientation: (js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires on the source object continuously during a drag operation.
    * @param ev The event.
    */
  var ondrag: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires on the source object when the user releases the mouse at the close of a drag operation.
    * @param ev The event.
    */
  var ondragend: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires on the target element when the user drags the object to a valid drop target.
    * @param ev The drag event.
    */
  var ondragenter: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  var ondragexit: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
    * @param ev The drag event.
    */
  var ondragleave: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires on the target element continuously while the user drags the object over a valid drop target.
    * @param ev The event.
    */
  var ondragover: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires on the source object when the user starts to drag a text selection or selected object.
    * @param ev The event.
    */
  var ondragstart: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  var ondrop: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the duration attribute is updated.
    * @param ev The event.
    */
  var ondurationchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the media element is reset to its initial state.
    * @param ev The event.
    */
  var onemptied: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the end of playback is reached.
    * @param ev The event
    */
  var onended: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when an error occurs during object loading.
    * @param ev The event.
    */
  var onerror: ErrorEventHandler = js.native
  /**
    * Fires when the object receives focus.
    * @param ev The event.
    */
  var onfocus: (js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, js.Any]) | scala.Null = js.native
  var ongotpointercapture: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onhashchange: (js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, js.Any]) | scala.Null = js.native
  var oninput: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var oninvalid: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user presses a key.
    * @param ev The keyboard event
    */
  var onkeydown: (js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user presses an alphanumeric key.
    * @param ev The event.
    */
  var onkeypress: (js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user releases a key.
    * @param ev The keyboard event
    */
  var onkeyup: (js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, js.Any]) | scala.Null = js.native
  var onlanguagechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires immediately after the browser loads the object.
    * @param ev The event.
    */
  var onload: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when media data is loaded at the current playback position.
    * @param ev The event.
    */
  var onloadeddata: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the duration and dimensions of the media have been determined.
    * @param ev The event.
    */
  var onloadedmetadata: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onloadend: (js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when Internet Explorer begins looking for media data.
    * @param ev The event.
    */
  var onloadstart: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onlostpointercapture: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onmessage: (js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, js.Any]) | scala.Null = js.native
  var onmessageerror: (js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user clicks the object with either mouse button.
    * @param ev The mouse event.
    */
  var onmousedown: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var onmouseenter: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var onmouseleave: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user moves the mouse over the object.
    * @param ev The mouse event.
    */
  var onmousemove: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user moves the mouse pointer outside the boundaries of the object.
    * @param ev The mouse event.
    */
  var onmouseout: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user moves the mouse pointer into the object.
    * @param ev The mouse event.
    */
  var onmouseover: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user releases a mouse button while the mouse is over the object.
    * @param ev The mouse event.
    */
  var onmouseup: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | scala.Null = js.native
  var onmousewheel: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgesturechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgesturedoubletap: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgestureend: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgesturehold: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgesturestart: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsgesturetap: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmsinertiastart: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointercancel: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerdown: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerenter: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerleave: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointermove: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerout: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerover: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onmspointerup: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onoffline: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var ononline: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /** @deprecated */
  var onorientationchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onpagehide: (js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, js.Any]) | scala.Null = js.native
  var onpageshow: (js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when playback is paused.
    * @param ev The event.
    */
  var onpause: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the play method is requested.
    * @param ev The event.
    */
  var onplay: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the audio or video has started playing.
    * @param ev The event.
    */
  var onplaying: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onpointercancel: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerdown: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerenter: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerleave: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointermove: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerout: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerover: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpointerup: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | scala.Null = js.native
  var onpopstate: (js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs to indicate progress while downloading media data.
    * @param ev The event.
    */
  var onprogress: (js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the playback rate is increased or decreased.
    * @param ev The event.
    */
  var onratechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onreadystatechange: (js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, js.Any]) | scala.Null = js.native
  var onrejectionhandled: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user resets a form.
    * @param ev The event.
    */
  var onreset: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onresize: (js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, js.Any]) | scala.Null = js.native
  /**
    * Fires when the user repositions the scroll box in the scroll bar on the object.
    * @param ev The event.
    */
  var onscroll: (js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, js.Any]) | scala.Null = js.native
  var onsecuritypolicyviolation: (js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the seek operation ends.
    * @param ev The event.
    */
  var onseeked: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the current playback position is moved.
    * @param ev The event.
    */
  var onseeking: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Fires when the current selection changes.
    * @param ev The event.
    */
  var onselect: (js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the download has stopped.
    * @param ev The event.
    */
  var onstalled: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onstorage: (js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, js.Any]) | scala.Null = js.native
  var onsubmit: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs if the load operation has been intentionally halted.
    * @param ev The event.
    */
  var onsuspend: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs to indicate the current playback position.
    * @param ev The event.
    */
  var ontimeupdate: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var ontoggle: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var ontouchcancel: (js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, js.Any]) | scala.Null = js.native
  var ontouchend: (js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, js.Any]) | scala.Null = js.native
  var ontouchmove: (js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, js.Any]) | scala.Null = js.native
  var ontouchstart: (js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, js.Any]) | scala.Null = js.native
  var ontransitioncancel: (js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, js.Any]) | scala.Null = js.native
  var ontransitionend: (js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, js.Any]) | scala.Null = js.native
  var ontransitionrun: (js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, js.Any]) | scala.Null = js.native
  var ontransitionstart: (js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, js.Any]) | scala.Null = js.native
  var onunhandledrejection: (js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, js.Any]) | scala.Null = js.native
  var onunload: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when the volume is changed, or playback is muted or unmuted.
    * @param ev The event.
    */
  var onvolumechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplayactivate: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplayblur: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplayconnect: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplaydeactivate: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplaydisconnect: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplayfocus: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplaypointerrestricted: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplaypointerunrestricted: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  /**
    * Occurs when playback stops because the next frame of a video resource is not available.
    * @param ev The event.
    */
  var onwaiting: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | scala.Null = js.native
  var onwheel: (js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, js.Any]) | scala.Null = js.native
  var opener: js.Any = js.native
  /** @deprecated */
  var orientation: java.lang.String | scala.Double = js.native
  var origin: java.lang.String = js.native
  var outerHeight: scala.Double = js.native
  var outerWidth: scala.Double = js.native
  var pageXOffset: scala.Double = js.native
  var pageYOffset: scala.Double = js.native
  var parent: Window = js.native
  var performance: Performance = js.native
  var personalbar: BarProp = js.native
  var screen: Screen = js.native
  var screenLeft: scala.Double = js.native
  var screenTop: scala.Double = js.native
  var screenX: scala.Double = js.native
  var screenY: scala.Double = js.native
  var scrollX: scala.Double = js.native
  var scrollY: scala.Double = js.native
  var scrollbars: BarProp = js.native
  var self: Window = js.native
  var sessionStorage: Storage = js.native
  var speechSynthesis: SpeechSynthesis = js.native
  var status: java.lang.String = js.native
  var statusbar: BarProp = js.native
  var styleMedia: StyleMedia = js.native
  var toolbar: BarProp = js.native
  var top: Window = js.native
  var window: Window = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationcancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationiteration(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_animationstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_auxclick(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_blur(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplay(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_canplaythrough(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contextmenu(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dblclick(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drag(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragexit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dragstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_drop(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_durationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_emptied(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focus(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gotpointercapture(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_input(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_invalid(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keydown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keypress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keyup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadeddata(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadedmetadata(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lostpointercapture(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousedown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousemove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseout(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mouseup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playing(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointercancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerdown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointermove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerout(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pointerup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ratechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_reset(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resize(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_scroll(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_securitypolicyviolation(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeked(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_seeking(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_select(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stalled(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_submit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suspend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeupdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_toggle(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchcancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchmove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_touchstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitioncancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionrun(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transitionstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_volumechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wheel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def alert(): scala.Unit = js.native
  def alert(message: js.Any): scala.Unit = js.native
  def atob(encodedString: java.lang.String): java.lang.String = js.native
  def blur(): scala.Unit = js.native
  def btoa(rawString: java.lang.String): java.lang.String = js.native
  def cancelAnimationFrame(handle: scala.Double): scala.Unit = js.native
  /** @deprecated */
  def captureEvents(): scala.Unit = js.native
  def clearInterval(): scala.Unit = js.native
  def clearInterval(handle: scala.Double): scala.Unit = js.native
  def clearTimeout(): scala.Unit = js.native
  def clearTimeout(handle: scala.Double): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def confirm(): scala.Boolean = js.native
  def confirm(message: java.lang.String): scala.Boolean = js.native
  def createImageBitmap(image: ImageBitmapSource): Promise[ImageBitmap] = js.native
  def createImageBitmap(image: ImageBitmapSource, sx: scala.Double, sy: scala.Double, sw: scala.Double, sh: scala.Double): Promise[ImageBitmap] = js.native
  /**
    * Gets the unencoded version of an encoded Uniform Resource Identifier (URI).
    * @param encodedURI A value representing an encoded URI.
    */
  def decodeURI(encodedURI: java.lang.String): java.lang.String = js.native
  /**
    * Gets the unencoded version of an encoded component of a Uniform Resource Identifier (URI).
    * @param encodedURIComponent A value representing an encoded URI component.
    */
  def decodeURIComponent(encodedURIComponent: java.lang.String): java.lang.String = js.native
  def departFocus(navigationReason: NavigationReason, origin: FocusNavigationOrigin): scala.Unit = js.native
  /**
    * Dispatches a synthetic event event to target and returns true
    * if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise.
    */
  def dispatchEvent(event: Event): scala.Boolean = js.native
  /**
    * Encodes a text string as a valid Uniform Resource Identifier (URI)
    * @param uri A value representing an encoded URI.
    */
  def encodeURI(uri: java.lang.String): java.lang.String = js.native
  /**
    * Encodes a text string as a valid component of a Uniform Resource Identifier (URI).
    * @param uriComponent A value representing an encoded URI component.
    */
  def encodeURIComponent(uriComponent: java.lang.String): java.lang.String = js.native
  /**
    * Computes a new string in which certain characters have been replaced by a hexadecimal escape sequence.
    * @param string A string value
    */
  def escape(string: java.lang.String): java.lang.String = js.native
  /**
    * Evaluates JavaScript code and executes it.
    * @param x A String value that contains valid JavaScript code.
    */
  def eval(x: java.lang.String): js.Any = js.native
  def fetch(input: RequestInfo): Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): Promise[Response] = js.native
  def focus(): scala.Unit = js.native
  def getComputedStyle(elt: Element): CSSStyleDeclaration = js.native
  def getComputedStyle(elt: Element, pseudoElt: java.lang.String): CSSStyleDeclaration = js.native
  def getMatchedCSSRules(elt: Element): CSSRuleList = js.native
  def getMatchedCSSRules(elt: Element, pseudoElt: java.lang.String): CSSRuleList = js.native
  def getSelection(): Selection = js.native
  /**
    * Determines whether a supplied number is finite.
    * @param number Any numeric value.
    */
  def isFinite(number: scala.Double): scala.Boolean = js.native
  /**
    * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a number).
    * @param number A numeric value.
    */
  def isNaN(number: scala.Double): scala.Boolean = js.native
  def matchMedia(query: java.lang.String): MediaQueryList = js.native
  def moveBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def msWriteProfilerMark(profilerMarkName: java.lang.String): scala.Unit = js.native
  def open(): Window | scala.Null = js.native
  def open(url: java.lang.String): Window | scala.Null = js.native
  def open(url: java.lang.String, target: java.lang.String): Window | scala.Null = js.native
  def open(url: java.lang.String, target: java.lang.String, features: java.lang.String): Window | scala.Null = js.native
  def open(
    url: java.lang.String,
    target: java.lang.String,
    features: java.lang.String,
    replace: scala.Boolean
  ): Window | scala.Null = js.native
  /**
    * Converts a string to a floating-point number.
    * @param string A string that contains a floating-point number.
    */
  def parseFloat(string: java.lang.String): scala.Double = js.native
  /**
    * Converts A string to an integer.
    * @param s A string to convert into a number.
    * @param radix A value between 2 and 36 that specifies the base of the number in numString.
    * If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
    * All other strings are considered decimal.
    */
  def parseInt(s: java.lang.String): scala.Double = js.native
  def parseInt(s: java.lang.String, radix: scala.Double): scala.Double = js.native
  def postMessage(message: js.Any, targetOrigin: java.lang.String): scala.Unit = js.native
  def postMessage(message: js.Any, targetOrigin: java.lang.String, transfer: Array[Transferable]): scala.Unit = js.native
  def print(): scala.Unit = js.native
  def prompt(): java.lang.String | scala.Null = js.native
  def prompt(message: java.lang.String): java.lang.String | scala.Null = js.native
  def prompt(message: java.lang.String, _default: java.lang.String): java.lang.String | scala.Null = js.native
  def queueMicrotask(callback: Function): scala.Unit = js.native
  /** @deprecated */
  def releaseEvents(): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationcancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationiteration(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_animationstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.animationstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_auxclick(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.auxclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_blur(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.blur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplay(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.canplay,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_canplaythrough(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.canplaythrough,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.change,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.click,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.close,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contextmenu(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.contextmenu,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dblclick(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dblclick,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drag(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.drag,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragexit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragexit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dragstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.dragstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_drop(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.drop,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_durationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.durationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_emptied(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.emptied,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focus(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.focus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gotpointercapture(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.gotpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_input(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.input,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_invalid(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.invalid,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keydown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keydown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keypress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keypress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keyup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.load,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadeddata(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadeddata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadedmetadata(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadedmetadata,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lostpointercapture(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.lostpointercapture,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.message,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousedown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousedown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousemove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousemove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseout(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mouseup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mouseup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.offline,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.online,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pause,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_play(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.play,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playing(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.playing,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointercancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointercancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerdown(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerdown,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerenter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerenter,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerleave(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointermove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointermove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerout(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerout,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerover(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerover,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pointerup(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.pointerup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_progress(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ratechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ratechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_reset(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.reset,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resize(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_scroll(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.scroll,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_securitypolicyviolation(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeked(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.seeked,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_seeking(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.seeking,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_select(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stalled(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.stalled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_submit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.submit,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suspend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.suspend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_timeupdate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.timeupdate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_toggle(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.toggle,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchcancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchcancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchmove(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchmove,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_touchstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.touchstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitioncancel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitioncancel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionend(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionrun(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionrun,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transitionstart(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.transitionstart,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_volumechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.volumechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.waiting,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_wheel(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.wheel,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def requestAnimationFrame(callback: FrameRequestCallback): scala.Double = js.native
  def resizeBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def resizeTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scroll(): scala.Unit = js.native
  def scroll(options: ScrollToOptions): scala.Unit = js.native
  def scroll(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollBy(): scala.Unit = js.native
  def scrollBy(options: ScrollToOptions): scala.Unit = js.native
  def scrollBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollTo(): scala.Unit = js.native
  def scrollTo(options: ScrollToOptions): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setInterval(handler: TimerHandler): scala.Double = js.native
  def setInterval(handler: TimerHandler, timeout: scala.Double, arguments: js.Any*): scala.Double = js.native
  def setTimeout(handler: TimerHandler): scala.Double = js.native
  def setTimeout(handler: TimerHandler, timeout: scala.Double, arguments: js.Any*): scala.Double = js.native
  def stop(): scala.Unit = js.native
  /**
    * Computes a new string in which hexadecimal escape sequences are replaced with the character that it represents.
    * @param string A string value
    */
  def unescape(string: java.lang.String): java.lang.String = js.native
  def webkitCancelAnimationFrame(handle: scala.Double): scala.Unit = js.native
  def webkitConvertPointFromNodeToPage(node: Node, pt: WebKitPoint): WebKitPoint = js.native
  def webkitConvertPointFromPageToNode(node: Node, pt: WebKitPoint): WebKitPoint = js.native
  def webkitRequestAnimationFrame(callback: FrameRequestCallback): scala.Double = js.native
}

