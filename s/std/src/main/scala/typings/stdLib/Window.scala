package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window
  extends EventTarget
     with WindowTimers
     with WindowSessionStorage
     with WindowLocalStorage
     with WindowConsole
     with GlobalEventHandlers
     with IDBEnvironment
     with WindowBase64
     with GlobalFetch
     with WindowOrWorkerGlobalScope
     with WindowEventHandlers {
  var Blob: Anon_BlobParts = js.native
  var URL: Anon_Base = js.native
  var URLSearchParams: Anon_Init = js.native
  val applicationCache: ApplicationCache = js.native
  val clientInformation: Navigator = js.native
  val closed: scala.Boolean = js.native
  var customElements: CustomElementRegistry = js.native
  var defaultStatus: java.lang.String = js.native
  val devicePixelRatio: scala.Double = js.native
  val doNotTrack: java.lang.String = js.native
  val document: Document = js.native
  val event: js.UndefOr[Event] = js.native
  /** @deprecated */
  val external: External = js.native
  val frameElement: Element = js.native
  val frames: Window = js.native
  val history: History = js.native
  /* InferMemberOverrides */
  override val indexedDB: IDBFactory = js.native
  val innerHeight: scala.Double = js.native
  val innerWidth: scala.Double = js.native
  val isSecureContext: scala.Boolean = js.native
  val length: scala.Double = js.native
  var location: Location = js.native
  val locationbar: BarProp = js.native
  val menubar: BarProp = js.native
  val msContentScript: ExtensionScriptApis = js.native
  var name: java.lang.String = js.native
  val navigator: Navigator = js.native
  var offscreenBuffering: java.lang.String | scala.Boolean = js.native
  var oncompassneedscalibration: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var ondevicelight: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _]) | scala.Null = js.native
  var ondevicemotion: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _]) | scala.Null = js.native
  var ondeviceorientation: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]) | scala.Null = js.native
  var onmousewheel: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmsgesturechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmsgesturedoubletap: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmsgestureend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmsgesturehold: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmsgesturestart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmsgesturetap: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmsinertiastart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmspointercancel: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmspointerdown: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmspointerenter: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmspointerleave: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmspointermove: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmspointerout: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmspointerover: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmspointerup: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /** @deprecated */
  var onorientationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  var onvrdisplayactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onvrdisplayblur: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onvrdisplayconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onvrdisplaydeactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onvrdisplaydisconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onvrdisplayfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onvrdisplaypointerrestricted: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onvrdisplaypointerunrestricted: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var opener: js.Any = js.native
  /** @deprecated */
  val orientation: java.lang.String | scala.Double = js.native
  val outerHeight: scala.Double = js.native
  val outerWidth: scala.Double = js.native
  val pageXOffset: scala.Double = js.native
  val pageYOffset: scala.Double = js.native
  val parent: Window = js.native
  val personalbar: BarProp = js.native
  val screen: Screen = js.native
  val screenLeft: scala.Double = js.native
  val screenTop: scala.Double = js.native
  val screenX: scala.Double = js.native
  val screenY: scala.Double = js.native
  val scrollX: scala.Double = js.native
  val scrollY: scala.Double = js.native
  val scrollbars: BarProp = js.native
  val self: Window = js.native
  val speechSynthesis: SpeechSynthesis = js.native
  var status: java.lang.String = js.native
  val statusbar: BarProp = js.native
  val styleMedia: StyleMedia = js.native
  val toolbar: BarProp = js.native
  val top: Window = js.native
  val window: Window = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: stdLib.stdLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: stdLib.stdLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureChange(
    `type`: stdLib.stdLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: stdLib.stdLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: stdLib.stdLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureDoubleTap(
    `type`: stdLib.stdLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: stdLib.stdLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: stdLib.stdLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureEnd(
    `type`: stdLib.stdLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: stdLib.stdLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: stdLib.stdLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureHold(
    `type`: stdLib.stdLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: stdLib.stdLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: stdLib.stdLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureStart(
    `type`: stdLib.stdLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: stdLib.stdLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: stdLib.stdLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSGestureTap(
    `type`: stdLib.stdLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: stdLib.stdLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: stdLib.stdLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSInertiaStart(
    `type`: stdLib.stdLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: stdLib.stdLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: stdLib.stdLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerCancel(
    `type`: stdLib.stdLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: stdLib.stdLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: stdLib.stdLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerDown(
    `type`: stdLib.stdLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: stdLib.stdLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: stdLib.stdLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerEnter(
    `type`: stdLib.stdLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: stdLib.stdLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: stdLib.stdLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerLeave(
    `type`: stdLib.stdLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: stdLib.stdLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: stdLib.stdLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerMove(
    `type`: stdLib.stdLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: stdLib.stdLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: stdLib.stdLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOut(
    `type`: stdLib.stdLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: stdLib.stdLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: stdLib.stdLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerOver(
    `type`: stdLib.stdLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: stdLib.stdLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: stdLib.stdLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSPointerUp(
    `type`: stdLib.stdLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: stdLib.stdLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: stdLib.stdLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: stdLib.stdLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: stdLib.stdLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: stdLib.stdLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicelight(
    `type`: stdLib.stdLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: stdLib.stdLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: stdLib.stdLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: stdLib.stdLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: stdLib.stdLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: stdLib.stdLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: stdLib.stdLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: stdLib.stdLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: stdLib.stdLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: stdLib.stdLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: stdLib.stdLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: stdLib.stdLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: stdLib.stdLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: stdLib.stdLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: stdLib.stdLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: stdLib.stdLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: stdLib.stdLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: stdLib.stdLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: stdLib.stdLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: stdLib.stdLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: stdLib.stdLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: stdLib.stdLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: stdLib.stdLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: stdLib.stdLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: stdLib.stdLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: stdLib.stdLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: stdLib.stdLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: stdLib.stdLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: stdLib.stdLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: stdLib.stdLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: stdLib.stdLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: stdLib.stdLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: stdLib.stdLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: stdLib.stdLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: stdLib.stdLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: stdLib.stdLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: stdLib.stdLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: stdLib.stdLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: stdLib.stdLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: stdLib.stdLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: stdLib.stdLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: stdLib.stdLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: stdLib.stdLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def alert(): scala.Unit = js.native
  def alert(message: js.Any): scala.Unit = js.native
  /* InferMemberOverrides */
  override def atob(data: java.lang.String): java.lang.String = js.native
  def blur(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def btoa(data: java.lang.String): java.lang.String = js.native
  def cancelAnimationFrame(handle: scala.Double): scala.Unit = js.native
  /** @deprecated */
  def captureEvents(): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def confirm(): scala.Boolean = js.native
  def confirm(message: java.lang.String): scala.Boolean = js.native
  def departFocus(navigationReason: NavigationReason, origin: FocusNavigationOrigin): scala.Unit = js.native
  /* InferMemberOverrides */
  override def fetch(input: RequestInfo): js.Promise[Response] = js.native
  /* InferMemberOverrides */
  override def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  def focus(): scala.Unit = js.native
  def getComputedStyle(elt: Element): CSSStyleDeclaration = js.native
  def getComputedStyle(elt: Element, pseudoElt: java.lang.String): CSSStyleDeclaration = js.native
  def getMatchedCSSRules(elt: Element): CSSRuleList = js.native
  def getMatchedCSSRules(elt: Element, pseudoElt: java.lang.String): CSSRuleList = js.native
  def getSelection(): Selection = js.native
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
  def postMessage(message: js.Any, targetOrigin: java.lang.String): scala.Unit = js.native
  def postMessage(message: js.Any, targetOrigin: java.lang.String, transfer: js.Array[Transferable]): scala.Unit = js.native
  def print(): scala.Unit = js.native
  def prompt(): java.lang.String | scala.Null = js.native
  def prompt(message: java.lang.String): java.lang.String | scala.Null = js.native
  def prompt(message: java.lang.String, _default: java.lang.String): java.lang.String | scala.Null = js.native
  /** @deprecated */
  def releaseEvents(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: stdLib.stdLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: stdLib.stdLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureChange(
    `type`: stdLib.stdLibStrings.MSGestureChange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: stdLib.stdLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: stdLib.stdLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureDoubleTap(
    `type`: stdLib.stdLibStrings.MSGestureDoubleTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: stdLib.stdLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: stdLib.stdLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureEnd(
    `type`: stdLib.stdLibStrings.MSGestureEnd,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: stdLib.stdLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: stdLib.stdLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureHold(
    `type`: stdLib.stdLibStrings.MSGestureHold,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: stdLib.stdLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: stdLib.stdLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureStart(
    `type`: stdLib.stdLibStrings.MSGestureStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: stdLib.stdLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: stdLib.stdLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSGestureTap(
    `type`: stdLib.stdLibStrings.MSGestureTap,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: stdLib.stdLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: stdLib.stdLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSInertiaStart(
    `type`: stdLib.stdLibStrings.MSInertiaStart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: stdLib.stdLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: stdLib.stdLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerCancel(
    `type`: stdLib.stdLibStrings.MSPointerCancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: stdLib.stdLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: stdLib.stdLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerDown(
    `type`: stdLib.stdLibStrings.MSPointerDown,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: stdLib.stdLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: stdLib.stdLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerEnter(
    `type`: stdLib.stdLibStrings.MSPointerEnter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: stdLib.stdLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: stdLib.stdLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerLeave(
    `type`: stdLib.stdLibStrings.MSPointerLeave,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: stdLib.stdLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: stdLib.stdLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerMove(
    `type`: stdLib.stdLibStrings.MSPointerMove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: stdLib.stdLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: stdLib.stdLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOut(
    `type`: stdLib.stdLibStrings.MSPointerOut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: stdLib.stdLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: stdLib.stdLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerOver(
    `type`: stdLib.stdLibStrings.MSPointerOver,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: stdLib.stdLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: stdLib.stdLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSPointerUp(
    `type`: stdLib.stdLibStrings.MSPointerUp,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: stdLib.stdLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: stdLib.stdLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: stdLib.stdLibStrings.compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: stdLib.stdLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: stdLib.stdLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicelight(
    `type`: stdLib.stdLibStrings.devicelight,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceLightEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: stdLib.stdLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: stdLib.stdLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: stdLib.stdLibStrings.devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: stdLib.stdLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: stdLib.stdLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: stdLib.stdLibStrings.deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: stdLib.stdLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: stdLib.stdLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: stdLib.stdLibStrings.mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: stdLib.stdLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: stdLib.stdLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: stdLib.stdLibStrings.orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: stdLib.stdLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: stdLib.stdLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: stdLib.stdLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: stdLib.stdLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: stdLib.stdLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: stdLib.stdLibStrings.vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: stdLib.stdLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: stdLib.stdLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: stdLib.stdLibStrings.vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: stdLib.stdLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: stdLib.stdLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: stdLib.stdLibStrings.vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: stdLib.stdLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: stdLib.stdLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: stdLib.stdLibStrings.vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: stdLib.stdLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: stdLib.stdLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: stdLib.stdLibStrings.vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: stdLib.stdLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: stdLib.stdLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayfocus(
    `type`: stdLib.stdLibStrings.vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: stdLib.stdLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: stdLib.stdLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerrestricted(
    `type`: stdLib.stdLibStrings.vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: stdLib.stdLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: stdLib.stdLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypointerunrestricted(
    `type`: stdLib.stdLibStrings.vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: stdLib.stdLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: stdLib.stdLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: stdLib.stdLibStrings.vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
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
  def stop(): scala.Unit = js.native
  def webkitCancelAnimationFrame(handle: scala.Double): scala.Unit = js.native
  def webkitConvertPointFromNodeToPage(node: Node, pt: WebKitPoint): WebKitPoint = js.native
  def webkitConvertPointFromPageToNode(node: Node, pt: WebKitPoint): WebKitPoint = js.native
  def webkitRequestAnimationFrame(callback: FrameRequestCallback): scala.Double = js.native
}

@JSGlobal("Window")
@js.native
class WindowCls () extends Window {
  /* CompleteClass */
  override val console: Console = js.native
  /* CompleteClass */
  override val indexedDB: IDBFactory = js.native
  /* CompleteClass */
  override val localStorage: Storage = js.native
  /* CompleteClass */
  override val sessionStorage: Storage = js.native
  /* CompleteClass */
  override def atob(encodedString: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def btoa(rawString: java.lang.String): java.lang.String = js.native
}

@JSGlobal("Window")
@js.native
object Window
  extends org.scalablytyped.runtime.Instantiable0[Window]

