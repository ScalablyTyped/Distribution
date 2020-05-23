package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The state and the identity of the user agent. It allows scripts to query it and to register themselves to carry on some activities. */
@js.native
trait Navigator
  extends MSFileSaver
     with MSNavigatorDoNotTrack
     with NavigatorAutomationInformation
     with NavigatorBeacon
     with NavigatorConcurrentHardware
     with NavigatorContentUtils
     with NavigatorCookies
     with NavigatorID
     with NavigatorLanguage
     with NavigatorOnLine
     with NavigatorPlugins
     with NavigatorStorage {
  val activeVRDisplays: js.Array[VRDisplay] = js.native
  val clipboard: Clipboard = js.native
  val credentials: CredentialsContainer = js.native
  val doNotTrack: java.lang.String | Null = js.native
  val geolocation: Geolocation = js.native
  val maxTouchPoints: Double = js.native
  val mediaDevices: MediaDevices = js.native
  val msManipulationViewsEnabled: scala.Boolean = js.native
  val msMaxTouchPoints: Double = js.native
  val msPointerEnabled: scala.Boolean = js.native
  val permissions: Permissions = js.native
  val pointerEnabled: scala.Boolean = js.native
  val serviceWorker: ServiceWorkerContainer = js.native
  def getGamepads(): js.Array[Gamepad | Null] = js.native
  def getUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): Unit = js.native
  def getVRDisplays(): js.Promise[js.Array[VRDisplay]] = js.native
  def msLaunchUri(uri: java.lang.String): Unit = js.native
  def msLaunchUri(uri: java.lang.String, successCallback: MSLaunchUriCallback): Unit = js.native
  def msLaunchUri(
    uri: java.lang.String,
    successCallback: MSLaunchUriCallback,
    noHandlerCallback: MSLaunchUriCallback
  ): Unit = js.native
  def requestMediaKeySystemAccess(keySystem: java.lang.String, supportedConfigurations: js.Array[MediaKeySystemConfiguration]): js.Promise[MediaKeySystemAccess] = js.native
  def requestMediaKeySystemAccess(keySystem: java.lang.String, supportedConfigurations: Iterable[MediaKeySystemConfiguration]): js.Promise[MediaKeySystemAccess] = js.native
  def share(): js.Promise[Unit] = js.native
  def share(data: ShareData): js.Promise[Unit] = js.native
  def vibrate(pattern: js.Array[Double]): scala.Boolean = js.native
  def vibrate(pattern: Double): scala.Boolean = js.native
}

