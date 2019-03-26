package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator
  extends NavigatorID
     with NavigatorOnLine
     with NavigatorContentUtils
     with NavigatorStorageUtils
     with MSNavigatorDoNotTrack
     with MSFileSaver
     with NavigatorBeacon
     with NavigatorConcurrentHardware
     with NavigatorUserMedia
     with NavigatorLanguage
     with NavigatorStorage
     with NavigatorAutomationInformation {
  val activeVRDisplays: js.Array[VRDisplay] = js.native
  val authentication: WebAuthentication = js.native
  val cookieEnabled: scala.Boolean = js.native
  val doNotTrack: java.lang.String | scala.Null = js.native
  var gamepadInputEmulation: GamepadInputEmulationType = js.native
  val geolocation: Geolocation = js.native
  val maxTouchPoints: scala.Double = js.native
  val mimeTypes: MimeTypeArray = js.native
  val msManipulationViewsEnabled: scala.Boolean = js.native
  val msMaxTouchPoints: scala.Double = js.native
  val msPointerEnabled: scala.Boolean = js.native
  val plugins: PluginArray = js.native
  val pointerEnabled: scala.Boolean = js.native
  val serviceWorker: ServiceWorkerContainer = js.native
  def getGamepads(): js.Array[Gamepad | scala.Null] = js.native
  def getVRDisplays(): js.Promise[js.Array[VRDisplay]] = js.native
  def javaEnabled(): scala.Boolean = js.native
  def msLaunchUri(uri: java.lang.String): scala.Unit = js.native
  def msLaunchUri(uri: java.lang.String, successCallback: MSLaunchUriCallback): scala.Unit = js.native
  def msLaunchUri(
    uri: java.lang.String,
    successCallback: MSLaunchUriCallback,
    noHandlerCallback: MSLaunchUriCallback
  ): scala.Unit = js.native
  def requestMediaKeySystemAccess(keySystem: java.lang.String, supportedConfigurations: js.Array[MediaKeySystemConfiguration]): js.Promise[MediaKeySystemAccess] = js.native
  def vibrate(pattern: js.Array[scala.Double]): scala.Boolean = js.native
  def vibrate(pattern: scala.Double): scala.Boolean = js.native
}

@JSGlobal("Navigator")
@js.native
class NavigatorCls () extends Navigator {
  /* CompleteClass */
  override val appCodeName: java.lang.String = js.native
  /* CompleteClass */
  override val appName: java.lang.String = js.native
  /* CompleteClass */
  override val appVersion: java.lang.String = js.native
  /* CompleteClass */
  override val hardwareConcurrency: scala.Double = js.native
  /* CompleteClass */
  override val language: java.lang.String = js.native
  /* CompleteClass */
  override val languages: js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override val mediaDevices: MediaDevices = js.native
  /* CompleteClass */
  override val onLine: scala.Boolean = js.native
  /* CompleteClass */
  override val platform: java.lang.String = js.native
  /* CompleteClass */
  override val product: java.lang.String = js.native
  /* CompleteClass */
  override val productSub: java.lang.String = js.native
  /* CompleteClass */
  override val storage: StorageManager = js.native
  /* CompleteClass */
  override val userAgent: java.lang.String = js.native
  /* CompleteClass */
  override val vendor: java.lang.String = js.native
  /* CompleteClass */
  override val vendorSub: java.lang.String = js.native
  /* CompleteClass */
  override val webdriver: scala.Boolean = js.native
  /* CompleteClass */
  override def confirmSiteSpecificTrackingException(args: ConfirmSiteSpecificExceptionsInformation): scala.Boolean = js.native
  /* CompleteClass */
  override def confirmWebWideTrackingException(args: ExceptionInformation): scala.Boolean = js.native
  /* CompleteClass */
  override def getDisplayMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream] = js.native
  /* CompleteClass */
  override def getUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): scala.Unit = js.native
  /* CompleteClass */
  override def removeSiteSpecificTrackingException(args: ExceptionInformation): scala.Unit = js.native
  /* CompleteClass */
  override def removeWebWideTrackingException(args: ExceptionInformation): scala.Unit = js.native
  /* CompleteClass */
  override def storeSiteSpecificTrackingException(args: StoreSiteSpecificExceptionsInformation): scala.Unit = js.native
  /* CompleteClass */
  override def storeWebWideTrackingException(args: StoreExceptionsInformation): scala.Unit = js.native
}

@JSGlobal("Navigator")
@js.native
object Navigator
  extends org.scalablytyped.runtime.Instantiable0[Navigator]

