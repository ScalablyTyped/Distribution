package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var ActiveXObject: typings.std.ActiveXObject = js.native
  var Array: ArrayConstructor = js.native
  var ArrayBuffer: ArrayBufferConstructor = js.native
  var Atomics: typings.std.Atomics = js.native
  var BigInt: BigIntConstructor = js.native
  var BigInt64Array: BigInt64ArrayConstructor = js.native
  var BigUint64Array: BigUint64ArrayConstructor = js.native
  var Boolean: BooleanConstructor = js.native
  var CSS: typings.std.CSS = js.native
  var DataView: DataViewConstructor = js.native
  var Date: DateConstructor = js.native
  var Enumerator: EnumeratorConstructor = js.native
  var Error: ErrorConstructor = js.native
  var EvalError: EvalErrorConstructor = js.native
  var Float32Array: Float32ArrayConstructor = js.native
  var Float64Array: Float64ArrayConstructor = js.native
  var Function: FunctionConstructor = js.native
  var Infinity: Double = js.native
  var Int16Array: Int16ArrayConstructor = js.native
  var Int32Array: Int32ArrayConstructor = js.native
  var Int8Array: Int8ArrayConstructor = js.native
  /**
    * An intrinsic object that provides functions to convert JavaScript values to and from the JavaScript Object Notation (JSON) format.
    */
  var JSON: typings.std.JSON = js.native
  var Map: MapConstructor = js.native
  /** An intrinsic object that provides basic mathematics functionality and constants. */
  var Math: typings.std.Math = js.native
  /////////////////////////////
  /// ECMAScript APIs
  /////////////////////////////
  var NaN: Double = js.native
  /** An object that represents a number of any kind. All JavaScript numbers are 64-bit floating-point numbers. */
  var Number: NumberConstructor = js.native
  /**
    * Provides functionality common to all JavaScript objects.
    */
  var Object: ObjectConstructor = js.native
  var Promise: PromiseConstructor = js.native
  var Proxy: ProxyConstructor = js.native
  var RangeError: RangeErrorConstructor = js.native
  var ReferenceError: ReferenceErrorConstructor = js.native
  var RegExp: RegExpConstructor = js.native
  var ServiceUIFrameContext: typings.std.ServiceUIFrameContext = js.native
  var Set: SetConstructor = js.native
  var SharedArrayBuffer: SharedArrayBufferConstructor = js.native
  /**
    * Allows manipulation and formatting of text strings and determination and location of substrings within strings.
    */
  var String: StringConstructor = js.native
  var SyntaxError: SyntaxErrorConstructor = js.native
  var TypeError: TypeErrorConstructor = js.native
  var URIError: URIErrorConstructor = js.native
  var Uint16Array: Uint16ArrayConstructor = js.native
  var Uint32Array: Uint32ArrayConstructor = js.native
  var Uint8Array: Uint8ArrayConstructor = js.native
  var Uint8ClampedArray: Uint8ClampedArrayConstructor = js.native
  var VBArray: VBArrayConstructor = js.native
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
  var devicePixelRatio: Double = js.native
  var doNotTrack: java.lang.String = js.native
  var document: Document = js.native
  /** @deprecated */
  var event: js.UndefOr[Event] = js.native
  /** @deprecated */
  var external: External = js.native
  var frameElement: Element = js.native
  var frames: Window = js.native
  var history: History = js.native
  var indexedDB: IDBFactory = js.native
  var innerHeight: Double = js.native
  var innerWidth: Double = js.native
  var isSecureContext: scala.Boolean = js.native
  var length: Double = js.native
  var localStorage: Storage = js.native
  var location: Location = js.native
  var locationbar: BarProp = js.native
  var menubar: BarProp = js.native
  var msContentScript: ExtensionScriptApis = js.native
  var navigator: Navigator = js.native
  var offscreenBuffering: java.lang.String | scala.Boolean = js.native
  /**
    * Fires when the user aborts the download.
    * @param ev The event.
    */
  var onabort: (js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, js.Any]) | Null = js.native
  var onafterprint: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onanimationcancel: (js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, js.Any]) | Null = js.native
  var onanimationend: (js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, js.Any]) | Null = js.native
  var onanimationiteration: (js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, js.Any]) | Null = js.native
  var onanimationstart: (js.ThisFunction1[/* this */ Window, /* ev */ AnimationEvent, js.Any]) | Null = js.native
  var onauxclick: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | Null = js.native
  var onbeforeprint: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onbeforeunload: (js.ThisFunction1[/* this */ Window, /* ev */ BeforeUnloadEvent, js.Any]) | Null = js.native
  /**
    * Fires when the object loses the input focus.
    * @param ev The focus event.
    */
  var onblur: (js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, js.Any]) | Null = js.native
  var oncancel: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Occurs when playback is possible, but would require further buffering.
    * @param ev The event.
    */
  var oncanplay: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var oncanplaythrough: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Fires when the contents of the object or selection have changed.
    * @param ev The event.
    */
  var onchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Fires when the user clicks the left mouse button on the object
    * @param ev The mouse event.
    */
  var onclick: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | Null = js.native
  var onclose: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var oncompassneedscalibration: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Fires when the user clicks the right mouse button in the client area, opening the context menu.
    * @param ev The mouse event.
    */
  var oncontextmenu: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | Null = js.native
  var oncuechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Fires when the user double-clicks the object.
    * @param ev The mouse event.
    */
  var ondblclick: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | Null = js.native
  var ondevicelight: (js.ThisFunction1[/* this */ Window, /* ev */ DeviceLightEvent, js.Any]) | Null = js.native
  var ondevicemotion: (js.ThisFunction1[/* this */ Window, /* ev */ DeviceMotionEvent, js.Any]) | Null = js.native
  var ondeviceorientation: (js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, js.Any]) | Null = js.native
  var ondeviceorientationabsolute: (js.ThisFunction1[/* this */ Window, /* ev */ DeviceOrientationEvent, js.Any]) | Null = js.native
  /**
    * Fires on the source object continuously during a drag operation.
    * @param ev The event.
    */
  var ondrag: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | Null = js.native
  /**
    * Fires on the source object when the user releases the mouse at the close of a drag operation.
    * @param ev The event.
    */
  var ondragend: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | Null = js.native
  /**
    * Fires on the target element when the user drags the object to a valid drop target.
    * @param ev The drag event.
    */
  var ondragenter: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | Null = js.native
  var ondragexit: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Fires on the target object when the user moves the mouse out of a valid drop target during a drag operation.
    * @param ev The drag event.
    */
  var ondragleave: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | Null = js.native
  /**
    * Fires on the target element continuously while the user drags the object over a valid drop target.
    * @param ev The event.
    */
  var ondragover: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | Null = js.native
  /**
    * Fires on the source object when the user starts to drag a text selection or selected object.
    * @param ev The event.
    */
  var ondragstart: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | Null = js.native
  var ondrop: (js.ThisFunction1[/* this */ Window, /* ev */ DragEvent, js.Any]) | Null = js.native
  /**
    * Occurs when the duration attribute is updated.
    * @param ev The event.
    */
  var ondurationchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Occurs when the media element is reset to its initial state.
    * @param ev The event.
    */
  var onemptied: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Occurs when the end of playback is reached.
    * @param ev The event
    */
  var onended: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Fires when an error occurs during object loading.
    * @param ev The event.
    */
  var onerror: OnErrorEventHandler = js.native
  /**
    * Fires when the object receives focus.
    * @param ev The event.
    */
  var onfocus: (js.ThisFunction1[/* this */ Window, /* ev */ FocusEvent, js.Any]) | Null = js.native
  var ongotpointercapture: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | Null = js.native
  var onhashchange: (js.ThisFunction1[/* this */ Window, /* ev */ HashChangeEvent, js.Any]) | Null = js.native
  var oninput: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var oninvalid: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Fires when the user presses a key.
    * @param ev The keyboard event
    */
  var onkeydown: (js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, js.Any]) | Null = js.native
  /**
    * Fires when the user presses an alphanumeric key.
    * @param ev The event.
    */
  var onkeypress: (js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, js.Any]) | Null = js.native
  /**
    * Fires when the user releases a key.
    * @param ev The keyboard event
    */
  var onkeyup: (js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, js.Any]) | Null = js.native
  var onlanguagechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Fires immediately after the browser loads the object.
    * @param ev The event.
    */
  var onload: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Occurs when media data is loaded at the current playback position.
    * @param ev The event.
    */
  var onloadeddata: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Occurs when the duration and dimensions of the media have been determined.
    * @param ev The event.
    */
  var onloadedmetadata: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onloadend: (js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent[EventTarget], js.Any]) | Null = js.native
  /**
    * Occurs when Internet Explorer begins looking for media data.
    * @param ev The event.
    */
  var onloadstart: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onlostpointercapture: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | Null = js.native
  var onmessage: (js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, js.Any]) | Null = js.native
  var onmessageerror: (js.ThisFunction1[/* this */ Window, /* ev */ MessageEvent, js.Any]) | Null = js.native
  /**
    * Fires when the user clicks the object with either mouse button.
    * @param ev The mouse event.
    */
  var onmousedown: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | Null = js.native
  var onmouseenter: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | Null = js.native
  var onmouseleave: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | Null = js.native
  /**
    * Fires when the user moves the mouse over the object.
    * @param ev The mouse event.
    */
  var onmousemove: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | Null = js.native
  /**
    * Fires when the user moves the mouse pointer outside the boundaries of the object.
    * @param ev The mouse event.
    */
  var onmouseout: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | Null = js.native
  /**
    * Fires when the user moves the mouse pointer into the object.
    * @param ev The mouse event.
    */
  var onmouseover: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | Null = js.native
  /**
    * Fires when the user releases a mouse button while the mouse is over the object.
    * @param ev The mouse event.
    */
  var onmouseup: (js.ThisFunction1[/* this */ Window, /* ev */ MouseEvent, js.Any]) | Null = js.native
  var onmousewheel: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onmsgesturechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onmsgesturedoubletap: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onmsgestureend: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onmsgesturehold: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onmsgesturestart: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onmsgesturetap: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onmsinertiastart: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onmspointercancel: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onmspointerdown: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onmspointerenter: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onmspointerleave: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onmspointermove: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onmspointerout: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onmspointerover: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onmspointerup: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onoffline: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var ononline: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /** @deprecated */
  var onorientationchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onpagehide: (js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, js.Any]) | Null = js.native
  var onpageshow: (js.ThisFunction1[/* this */ Window, /* ev */ PageTransitionEvent, js.Any]) | Null = js.native
  /**
    * Occurs when playback is paused.
    * @param ev The event.
    */
  var onpause: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Occurs when the play method is requested.
    * @param ev The event.
    */
  var onplay: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Occurs when the audio or video has started playing.
    * @param ev The event.
    */
  var onplaying: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onpointercancel: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | Null = js.native
  var onpointerdown: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | Null = js.native
  var onpointerenter: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | Null = js.native
  var onpointerleave: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | Null = js.native
  var onpointermove: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | Null = js.native
  var onpointerout: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | Null = js.native
  var onpointerover: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | Null = js.native
  var onpointerup: (js.ThisFunction1[/* this */ Window, /* ev */ PointerEvent, js.Any]) | Null = js.native
  var onpopstate: (js.ThisFunction1[/* this */ Window, /* ev */ PopStateEvent, js.Any]) | Null = js.native
  /**
    * Occurs to indicate progress while downloading media data.
    * @param ev The event.
    */
  var onprogress: (js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent[EventTarget], js.Any]) | Null = js.native
  /**
    * Occurs when the playback rate is increased or decreased.
    * @param ev The event.
    */
  var onratechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onreadystatechange: (js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent[Window], js.Any]) | Null = js.native
  var onrejectionhandled: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Fires when the user resets a form.
    * @param ev The event.
    */
  var onreset: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onresize: (js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, js.Any]) | Null = js.native
  /**
    * Fires when the user repositions the scroll box in the scroll bar on the object.
    * @param ev The event.
    */
  var onscroll: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onsecuritypolicyviolation: (js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, js.Any]) | Null = js.native
  /**
    * Occurs when the seek operation ends.
    * @param ev The event.
    */
  var onseeked: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Occurs when the current playback position is moved.
    * @param ev The event.
    */
  var onseeking: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Fires when the current selection changes.
    * @param ev The event.
    */
  var onselect: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onselectionchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onselectstart: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Occurs when the download has stopped.
    * @param ev The event.
    */
  var onstalled: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onstorage: (js.ThisFunction1[/* this */ Window, /* ev */ StorageEvent, js.Any]) | Null = js.native
  var onsubmit: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Occurs if the load operation has been intentionally halted.
    * @param ev The event.
    */
  var onsuspend: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Occurs to indicate the current playback position.
    * @param ev The event.
    */
  var ontimeupdate: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var ontoggle: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var ontouchcancel: (js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, js.Any]) | Null = js.native
  var ontouchend: (js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, js.Any]) | Null = js.native
  var ontouchmove: (js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, js.Any]) | Null = js.native
  var ontouchstart: (js.ThisFunction1[/* this */ Window, /* ev */ TouchEvent, js.Any]) | Null = js.native
  var ontransitioncancel: (js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, js.Any]) | Null = js.native
  var ontransitionend: (js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, js.Any]) | Null = js.native
  var ontransitionrun: (js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, js.Any]) | Null = js.native
  var ontransitionstart: (js.ThisFunction1[/* this */ Window, /* ev */ TransitionEvent, js.Any]) | Null = js.native
  var onunhandledrejection: (js.ThisFunction1[/* this */ Window, /* ev */ PromiseRejectionEvent, js.Any]) | Null = js.native
  var onunload: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Occurs when the volume is changed, or playback is muted or unmuted.
    * @param ev The event.
    */
  var onvolumechange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onvrdisplayactivate: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onvrdisplayblur: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onvrdisplayconnect: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onvrdisplaydeactivate: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onvrdisplaydisconnect: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onvrdisplayfocus: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onvrdisplaypointerrestricted: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onvrdisplaypointerunrestricted: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  /**
    * Occurs when playback stops because the next frame of a video resource is not available.
    * @param ev The event.
    */
  var onwaiting: (js.ThisFunction1[/* this */ Window, /* ev */ Event, js.Any]) | Null = js.native
  var onwheel: (js.ThisFunction1[/* this */ Window, /* ev */ WheelEvent, js.Any]) | Null = js.native
  var opener: js.Any = js.native
  /** @deprecated */
  var orientation: java.lang.String | Double = js.native
  var origin: java.lang.String = js.native
  var outerHeight: Double = js.native
  var outerWidth: Double = js.native
  var pageXOffset: Double = js.native
  var pageYOffset: Double = js.native
  var parent: Window = js.native
  var performance: Performance = js.native
  var personalbar: BarProp = js.native
  var screen: Screen = js.native
  var screenLeft: Double = js.native
  var screenTop: Double = js.native
  var screenX: Double = js.native
  var screenY: Double = js.native
  var scrollX: Double = js.native
  var scrollY: Double = js.native
  var scrollbars: BarProp = js.native
  var self: Window with (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis */ js.Any) = js.native
  var sessionStorage: Storage = js.native
  var speechSynthesis: SpeechSynthesis = js.native
  var status: java.lang.String = js.native
  var statusbar: BarProp = js.native
  var styleMedia: StyleMedia = js.native
  var toolbar: BarProp = js.native
  var top: Window = js.native
  var window: Window with (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis */ js.Any) = js.native
}

