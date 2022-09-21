package typings.std

import org.scalablytyped.runtime.NumberDictionary
import typings.std.stdStrings.DOMContentLoaded
import typings.std.stdStrings.devicemotion
import typings.std.stdStrings.deviceorientation
import typings.std.stdStrings.orientationchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A window containing a DOM document; the document property points to the DOM document loaded in that window. */
@js.native
trait Window
  extends StObject
     with EventTarget
     with AnimationFrameProvider
     with GlobalEventHandlers
     with WindowEventHandlers
     with WindowLocalStorage
     with WindowOrWorkerGlobalScope
     with WindowSessionStorage
     with /* standard dom */
/* index */ NumberDictionary[Window] {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_DOMContentLoaded(`type`: DOMContentLoaded, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_DOMContentLoaded(
    `type`: DOMContentLoaded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_DOMContentLoaded(
    `type`: DOMContentLoaded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(`type`: orientationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def alert(): Unit = js.native
  def alert(message: Any): Unit = js.native
  
  /* standard dom */
  def blur(): Unit = js.native
  
  /* standard dom */
  def cancelIdleCallback(handle: Double): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  def captureEvents(): Unit = js.native
  
  /** @deprecated This is a legacy alias of `navigator`. */
  /* standard dom */
  val clientInformation: Navigator = js.native
  
  /** Closes the window. */
  /* standard dom */
  def close(): Unit = js.native
  
  /** Returns true if the window has been closed, false otherwise. */
  /* standard dom */
  val closed: scala.Boolean = js.native
  
  /* standard dom */
  def confirm(): scala.Boolean = js.native
  def confirm(message: java.lang.String): scala.Boolean = js.native
  
  /** Defines a new custom element, mapping the given name to the given constructor as an autonomous custom element. */
  /* standard dom */
  val customElements: CustomElementRegistry = js.native
  
  /* standard dom */
  val devicePixelRatio: Double = js.native
  
  /* standard dom */
  val document: Document = js.native
  
  /** @deprecated */
  /* standard dom */
  val event: js.UndefOr[Event] = js.native
  
  /** @deprecated */
  /* standard dom */
  val external: External = js.native
  
  /** Moves the focus to the window's browsing context, if any. */
  /* standard dom */
  def focus(): Unit = js.native
  
  /* standard dom */
  val frameElement: Element | Null = js.native
  
  /* standard dom */
  val frames: WindowProxy = js.native
  
  /* standard dom */
  def getComputedStyle(elt: Element): CSSStyleDeclaration = js.native
  def getComputedStyle(elt: Element, pseudoElt: java.lang.String): CSSStyleDeclaration = js.native
  
  /* standard dom */
  def getSelection(): Selection | Null = js.native
  
  /* standard dom */
  val history: History = js.native
  
  /* standard dom */
  val innerHeight: Double = js.native
  
  /* standard dom */
  val innerWidth: Double = js.native
  
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom */
  def location: Location = js.native
  /* standard dom */
  def location_=(href: java.lang.String | Location): Unit = js.native
  
  /** Returns true if the location bar is visible; otherwise, returns false. */
  /* standard dom */
  val locationbar: BarProp = js.native
  
  /* standard dom */
  def matchMedia(query: java.lang.String): MediaQueryList = js.native
  
  /** Returns true if the menu bar is visible; otherwise, returns false. */
  /* standard dom */
  val menubar: BarProp = js.native
  
  /* standard dom */
  def moveBy(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  def moveTo(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  var name: java.lang.String = js.native
  
  /* standard dom */
  val navigator: Navigator = js.native
  
  /** Available only in secure contexts. */
  /* standard dom */
  var ondevicemotion: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, Any]) | Null = js.native
  
  /** Available only in secure contexts. */
  /* standard dom */
  var ondeviceorientation: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, Any]) | Null = js.native
  
  /** @deprecated */
  /* standard dom */
  var onorientationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  def open(): WindowProxy | Null = js.native
  def open(url: java.lang.String): WindowProxy | Null = js.native
  def open(url: java.lang.String, target: java.lang.String): WindowProxy | Null = js.native
  def open(url: java.lang.String, target: java.lang.String, features: java.lang.String): WindowProxy | Null = js.native
  def open(url: java.lang.String, target: Unit, features: java.lang.String): WindowProxy | Null = js.native
  def open(url: Unit, target: java.lang.String): WindowProxy | Null = js.native
  def open(url: Unit, target: java.lang.String, features: java.lang.String): WindowProxy | Null = js.native
  def open(url: Unit, target: Unit, features: java.lang.String): WindowProxy | Null = js.native
  def open(url: URL): WindowProxy | Null = js.native
  def open(url: URL, target: java.lang.String): WindowProxy | Null = js.native
  def open(url: URL, target: java.lang.String, features: java.lang.String): WindowProxy | Null = js.native
  def open(url: URL, target: Unit, features: java.lang.String): WindowProxy | Null = js.native
  
  /* standard dom */
  var opener: Any = js.native
  
  /** @deprecated */
  /* standard dom */
  val orientation: Double = js.native
  
  /* standard dom */
  val outerHeight: Double = js.native
  
  /* standard dom */
  val outerWidth: Double = js.native
  
  /** @deprecated This is a legacy alias of `scrollX`. */
  /* standard dom */
  val pageXOffset: Double = js.native
  
  /** @deprecated This is a legacy alias of `scrollY`. */
  /* standard dom */
  val pageYOffset: Double = js.native
  
  /**
    * Refers to either the parent WindowProxy, or itself.
    *
    * It can rarely be null e.g. for contentWindow of an iframe that is already removed from the parent.
    */
  /* standard dom */
  val parent: WindowProxy = js.native
  
  /** Returns true if the personal bar is visible; otherwise, returns false. */
  /* standard dom */
  val personalbar: BarProp = js.native
  
  /* standard dom */
  def postMessage(message: Any): Unit = js.native
  def postMessage(message: Any, options: WindowPostMessageOptions): Unit = js.native
  /**
    * Posts a message to the given window. Messages can be structured objects, e.g. nested objects and arrays, can contain JavaScript values (strings, numbers, Date objects, etc), and can contain certain data objects such as File Blob, FileList, and ArrayBuffer objects.
    *
    * Objects listed in the transfer member of options are transferred, not just cloned, meaning that they are no longer usable on the sending side.
    *
    * A target origin can be specified using the targetOrigin member of options. If not provided, it defaults to "/". This default restricts the message to same-origin targets only.
    *
    * If the origin of the target window doesn't match the given target origin, the message is discarded, to avoid information leakage. To send the message to the target regardless of origin, set the target origin to "*".
    *
    * Throws a "DataCloneError" DOMException if transfer array contains duplicate objects or if message could not be cloned.
    */
  /* standard dom */
  def postMessage(message: Any, targetOrigin: java.lang.String): Unit = js.native
  def postMessage(message: Any, targetOrigin: java.lang.String, transfer: js.Array[Transferable]): Unit = js.native
  
  /* standard dom */
  def print(): Unit = js.native
  
  /* standard dom */
  def prompt(): java.lang.String | Null = js.native
  def prompt(message: java.lang.String): java.lang.String | Null = js.native
  def prompt(message: java.lang.String, _default: java.lang.String): java.lang.String | Null = js.native
  def prompt(message: Unit, _default: java.lang.String): java.lang.String | Null = js.native
  
  /** @deprecated */
  /* standard dom */
  def releaseEvents(): Unit = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_DOMContentLoaded(`type`: DOMContentLoaded, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_DOMContentLoaded(
    `type`: DOMContentLoaded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_DOMContentLoaded(
    `type`: DOMContentLoaded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(`type`: orientationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def requestIdleCallback(callback: IdleRequestCallback): Double = js.native
  def requestIdleCallback(callback: IdleRequestCallback, options: IdleRequestOptions): Double = js.native
  
  /* standard dom */
  def resizeBy(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  def resizeTo(width: Double, height: Double): Unit = js.native
  
  /* standard dom */
  val screen: Screen = js.native
  
  /* standard dom */
  val screenLeft: Double = js.native
  
  /* standard dom */
  val screenTop: Double = js.native
  
  /* standard dom */
  val screenX: Double = js.native
  
  /* standard dom */
  val screenY: Double = js.native
  
  /* standard dom */
  def scroll(): Unit = js.native
  def scroll(options: ScrollToOptions): Unit = js.native
  /* standard dom */
  def scroll(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  def scrollBy(): Unit = js.native
  def scrollBy(options: ScrollToOptions): Unit = js.native
  /* standard dom */
  def scrollBy(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  def scrollTo(): Unit = js.native
  def scrollTo(options: ScrollToOptions): Unit = js.native
  /* standard dom */
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  val scrollX: Double = js.native
  
  /* standard dom */
  val scrollY: Double = js.native
  
  /** Returns true if the scrollbars are visible; otherwise, returns false. */
  /* standard dom */
  val scrollbars: BarProp = js.native
  
  /* standard dom */
  val self: Window & (/* globalThis */ Any) = js.native
  
  /* standard dom */
  val speechSynthesis: SpeechSynthesis = js.native
  
  /** @deprecated */
  /* standard dom */
  var status: java.lang.String = js.native
  
  /** Returns true if the status bar is visible; otherwise, returns false. */
  /* standard dom */
  val statusbar: BarProp = js.native
  
  /** Cancels the document load. */
  /* standard dom */
  def stop(): Unit = js.native
  
  /** Returns true if the toolbar is visible; otherwise, returns false. */
  /* standard dom */
  val toolbar: BarProp = js.native
  
  /* standard dom */
  val top: WindowProxy | Null = js.native
  
  /* standard dom */
  val visualViewport: VisualViewport | Null = js.native
  
  /* standard dom */
  val window: Window & (/* globalThis */ Any) = js.native
}
