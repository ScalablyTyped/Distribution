package typings.reactNativeAppsflyer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-appsflyer", JSImport.Default)
@js.native
object default extends js.Object {
  
  def generateInviteLink(options: InviteLinkOptions): Unit = js.native
  def generateInviteLink(options: InviteLinkOptions, success: js.UndefOr[scala.Nothing], error: ErrorCallback): Unit = js.native
  def generateInviteLink(options: InviteLinkOptions, success: SuccessCallback): Unit = js.native
  def generateInviteLink(options: InviteLinkOptions, success: SuccessCallback, error: ErrorCallback): Unit = js.native
  
  def getAppsFlyerUID(callback: js.Function2[/* error */ js.Any, /* appsFlyerUID */ String, Unit]): Unit = js.native
  
  def initSdk(options: InitSdkOptions): Unit | js.Promise[String] = js.native
  def initSdk(options: InitSdkOptions, success: js.UndefOr[scala.Nothing], error: ErrorCallback): Unit | js.Promise[String] = js.native
  def initSdk(options: InitSdkOptions, success: SuccessCallback): Unit | js.Promise[String] = js.native
  def initSdk(options: InitSdkOptions, success: SuccessCallback, error: ErrorCallback): Unit | js.Promise[String] = js.native
  
  def onAppOpenAttribution(callback: js.Function1[/* response */ js.Any, Unit]): js.Function0[Unit] = js.native
  
  def onInstallConversionData(callback: js.Function1[/* data */ ConversionData, Unit]): js.Function0[Unit] = js.native
  
  def sendDeepLinkData(url: String): Unit = js.native
  
  def setAdditionalData(additionalData: AdditionalData): Unit = js.native
  def setAdditionalData(additionalData: AdditionalData, success: SuccessCallback): Unit = js.native
  
  def setAppInviteOneLinkID(oneLinkId: String): Unit = js.native
  def setAppInviteOneLinkID(oneLinkId: String, callback: SuccessCallback): Unit = js.native
  
  def setCollectAndroidID(isCollect: Boolean): Unit = js.native
  def setCollectAndroidID(isCollect: Boolean, callback: SuccessCallback): Unit = js.native
  
  def setCollectIMEI(isCollect: Boolean): Unit = js.native
  def setCollectIMEI(isCollect: Boolean, callback: SuccessCallback): Unit = js.native
  
  def setCurrencyCode(currencyCode: String): Unit = js.native
  def setCurrencyCode(currencyCode: String, callback: SuccessCallback): Unit = js.native
  
  def setCustomerUserId(userId: String): Unit = js.native
  def setCustomerUserId(userId: String, callback: SuccessCallback): Unit = js.native
  
  def setDeviceTrackingDisabled(isDeviceTrackingDisabled: Boolean): Unit = js.native
  def setDeviceTrackingDisabled(isDeviceTrackingDisabled: Boolean, success: SuccessCallback): Unit = js.native
  
  def setUserEmails(options: EmailOptions): Unit = js.native
  def setUserEmails(options: EmailOptions, success: js.UndefOr[scala.Nothing], error: ErrorCallback): Unit = js.native
  def setUserEmails(options: EmailOptions, success: SuccessCallback): Unit = js.native
  def setUserEmails(options: EmailOptions, success: SuccessCallback, error: ErrorCallback): Unit = js.native
  
  def stopTracking(isStopTracking: Boolean): Unit = js.native
  def stopTracking(isStopTracking: Boolean, callback: SuccessCallback): Unit = js.native
  
  def trackAndOpenStore(appId: String, campaign: String): Unit = js.native
  def trackAndOpenStore(appId: String, campaign: String, additionalData: AdditionalData): Unit = js.native
  
  def trackAppLaunch(): Unit = js.native
  
  def trackCrossPromotionImpression(appId: String, campaign: String): Unit = js.native
  
  def trackEvent(eventName: String, eventValues: EventValues): Unit | js.Promise[String] = js.native
  def trackEvent(
    eventName: String,
    eventValues: EventValues,
    success: js.UndefOr[scala.Nothing],
    error: ErrorCallback
  ): Unit | js.Promise[String] = js.native
  def trackEvent(eventName: String, eventValues: EventValues, success: SuccessCallback): Unit | js.Promise[String] = js.native
  def trackEvent(eventName: String, eventValues: EventValues, success: SuccessCallback, error: ErrorCallback): Unit | js.Promise[String] = js.native
  
  def trackLocation(longitude: Double, latitude: Double): Unit = js.native
  def trackLocation(
    longitude: Double,
    latitude: Double,
    callback: js.Function2[/* error */ js.Any, /* coordinates */ js.Array[Double], Unit]
  ): Unit = js.native
  
  def updateServerUninstallToken(token: String): Unit = js.native
  def updateServerUninstallToken(token: String, callback: SuccessCallback): Unit = js.native
}
