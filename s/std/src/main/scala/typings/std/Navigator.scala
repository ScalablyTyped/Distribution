package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The state and the identity of the user agent. It allows scripts to query it and to register themselves to carry on some activities.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator)
  */
@js.native
trait Navigator
  extends StObject
     with NavigatorAutomationInformation
     with NavigatorBadge
     with NavigatorConcurrentHardware
     with NavigatorContentUtils
     with NavigatorCookies
     with NavigatorID
     with NavigatorLanguage
     with NavigatorLocks
     with NavigatorOnLine
     with NavigatorPlugins
     with NavigatorStorage {
  
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/canShare)
    */
  /* standard dom */
  def canShare(): scala.Boolean = js.native
  def canShare(data: ShareData): scala.Boolean = js.native
  
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/clipboard)
    */
  /* standard dom */
  val clipboard: Clipboard = js.native
  
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/credentials)
    */
  /* standard dom */
  val credentials: CredentialsContainer = js.native
  
  /* standard dom */
  val doNotTrack: java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/geolocation) */
  /* standard dom */
  val geolocation: Geolocation = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/getGamepads) */
  /* standard dom */
  def getGamepads(): js.Array[Gamepad | Null] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/maxTouchPoints) */
  /* standard dom */
  val maxTouchPoints: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/mediaCapabilities) */
  /* standard dom */
  val mediaCapabilities: MediaCapabilities = js.native
  
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/mediaDevices)
    */
  /* standard dom */
  val mediaDevices: MediaDevices = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/mediaSession) */
  /* standard dom */
  val mediaSession: MediaSession = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/permissions) */
  /* standard dom */
  val permissions: Permissions = js.native
  
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/requestMIDIAccess)
    */
  /* standard dom */
  def requestMIDIAccess(): js.Promise[MIDIAccess] = js.native
  def requestMIDIAccess(options: MIDIOptions): js.Promise[MIDIAccess] = js.native
  
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/requestMediaKeySystemAccess)
    */
  /* standard dom */
  def requestMediaKeySystemAccess(keySystem: java.lang.String, supportedConfigurations: js.Array[MediaKeySystemConfiguration]): js.Promise[MediaKeySystemAccess] = js.native
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/requestMediaKeySystemAccess)
    */
  /* standard dom.iterable */
  def requestMediaKeySystemAccess(keySystem: java.lang.String, supportedConfigurations: js.Iterable[MediaKeySystemConfiguration]): js.Promise[MediaKeySystemAccess] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/sendBeacon) */
  /* standard dom */
  def sendBeacon(url: java.lang.String): scala.Boolean = js.native
  def sendBeacon(url: java.lang.String, data: BodyInit): scala.Boolean = js.native
  def sendBeacon(url: URL): scala.Boolean = js.native
  def sendBeacon(url: URL, data: BodyInit): scala.Boolean = js.native
  
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/serviceWorker)
    */
  /* standard dom */
  val serviceWorker: ServiceWorkerContainer = js.native
  
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/share)
    */
  /* standard dom */
  def share(): js.Promise[Unit] = js.native
  def share(data: ShareData): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/userActivation) */
  /* standard dom */
  val userActivation: UserActivation = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/vibrate) */
  /* standard dom.iterable */
  def vibrate(pattern: js.Iterable[Double]): scala.Boolean = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/vibrate) */
  /* standard dom */
  def vibrate(pattern: VibratePattern): scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/wakeLock) */
  /* standard dom */
  val wakeLock: WakeLock = js.native
}
