package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The state and the identity of the user agent. It allows scripts to query it and to register themselves to carry on some activities. */
@js.native
trait Navigator
  extends StObject
     with NavigatorAutomationInformation
     with NavigatorConcurrentHardware
     with NavigatorContentUtils
     with NavigatorCookies
     with NavigatorID
     with NavigatorLanguage
     with NavigatorLocks
     with NavigatorOnLine
     with NavigatorPlugins
     with NavigatorStorage {
  
  /** Available only in secure contexts. */
  /* standard dom */
  def canShare(): scala.Boolean = js.native
  def canShare(data: ShareData): scala.Boolean = js.native
  
  /** Available only in secure contexts. */
  /* standard dom */
  val clipboard: Clipboard = js.native
  
  /** Available only in secure contexts. */
  /* standard dom */
  val credentials: CredentialsContainer = js.native
  
  /* standard dom */
  val doNotTrack: java.lang.String | Null = js.native
  
  /* standard dom */
  val geolocation: Geolocation = js.native
  
  /* standard dom */
  def getGamepads(): js.Array[Gamepad | Null] = js.native
  
  /* standard dom */
  val maxTouchPoints: Double = js.native
  
  /* standard dom */
  val mediaCapabilities: MediaCapabilities = js.native
  
  /** Available only in secure contexts. */
  /* standard dom */
  val mediaDevices: MediaDevices = js.native
  
  /* standard dom */
  val mediaSession: MediaSession = js.native
  
  /* standard dom */
  val permissions: Permissions = js.native
  
  /** Available only in secure contexts. */
  /* standard dom */
  def requestMediaKeySystemAccess(keySystem: java.lang.String, supportedConfigurations: js.Array[MediaKeySystemConfiguration]): js.Promise[MediaKeySystemAccess] = js.native
  /** Available only in secure contexts. */
  /* standard dom.iterable */
  def requestMediaKeySystemAccess(keySystem: java.lang.String, supportedConfigurations: js.Iterable[MediaKeySystemConfiguration]): js.Promise[MediaKeySystemAccess] = js.native
  
  /* standard dom */
  def sendBeacon(url: java.lang.String): scala.Boolean = js.native
  def sendBeacon(url: java.lang.String, data: BodyInit): scala.Boolean = js.native
  def sendBeacon(url: URL): scala.Boolean = js.native
  def sendBeacon(url: URL, data: BodyInit): scala.Boolean = js.native
  
  /** Available only in secure contexts. */
  /* standard dom */
  val serviceWorker: ServiceWorkerContainer = js.native
  
  /** Available only in secure contexts. */
  /* standard dom */
  def share(): js.Promise[Unit] = js.native
  def share(data: ShareData): js.Promise[Unit] = js.native
  
  /* standard dom.iterable */
  def vibrate(pattern: js.Iterable[Double]): scala.Boolean = js.native
  /* standard dom */
  def vibrate(pattern: VibratePattern): scala.Boolean = js.native
}
