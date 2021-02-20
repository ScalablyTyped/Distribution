package typings.reactNativeAppsflyer

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeAppsflyer.anon.Dictkey
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.failure
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-appsflyer", "default.generateInviteLink")
    @js.native
    def generateInviteLink(options: InviteLinkOptions): Unit = js.native
    @JSImport("react-native-appsflyer", "default.generateInviteLink")
    @js.native
    def generateInviteLink(options: InviteLinkOptions, success: js.UndefOr[scala.Nothing], error: ErrorCallback): Unit = js.native
    @JSImport("react-native-appsflyer", "default.generateInviteLink")
    @js.native
    def generateInviteLink(options: InviteLinkOptions, success: SuccessCallback): Unit = js.native
    @JSImport("react-native-appsflyer", "default.generateInviteLink")
    @js.native
    def generateInviteLink(options: InviteLinkOptions, success: SuccessCallback, error: ErrorCallback): Unit = js.native
    
    @JSImport("react-native-appsflyer", "default.getAppsFlyerUID")
    @js.native
    def getAppsFlyerUID(callback: js.Function2[/* error */ js.Any, /* appsFlyerUID */ String, Unit]): Unit = js.native
    
    @JSImport("react-native-appsflyer", "default.initSdk")
    @js.native
    def initSdk(options: InitSdkOptions): Unit | js.Promise[String] = js.native
    @JSImport("react-native-appsflyer", "default.initSdk")
    @js.native
    def initSdk(options: InitSdkOptions, success: js.UndefOr[scala.Nothing], error: ErrorCallback): Unit | js.Promise[String] = js.native
    @JSImport("react-native-appsflyer", "default.initSdk")
    @js.native
    def initSdk(options: InitSdkOptions, success: SuccessCallback): Unit | js.Promise[String] = js.native
    @JSImport("react-native-appsflyer", "default.initSdk")
    @js.native
    def initSdk(options: InitSdkOptions, success: SuccessCallback, error: ErrorCallback): Unit | js.Promise[String] = js.native
    
    @JSImport("react-native-appsflyer", "default.onAppOpenAttribution")
    @js.native
    def onAppOpenAttribution(callback: js.Function1[/* response */ js.Any, Unit]): js.Function0[Unit] = js.native
    
    @JSImport("react-native-appsflyer", "default.onInstallConversionData")
    @js.native
    def onInstallConversionData(callback: js.Function1[/* data */ ConversionData, Unit]): js.Function0[Unit] = js.native
    
    @JSImport("react-native-appsflyer", "default.sendDeepLinkData")
    @js.native
    def sendDeepLinkData(url: String): Unit = js.native
    
    @JSImport("react-native-appsflyer", "default.setAdditionalData")
    @js.native
    def setAdditionalData(additionalData: AdditionalData): Unit = js.native
    @JSImport("react-native-appsflyer", "default.setAdditionalData")
    @js.native
    def setAdditionalData(additionalData: AdditionalData, success: SuccessCallback): Unit = js.native
    
    @JSImport("react-native-appsflyer", "default.setAppInviteOneLinkID")
    @js.native
    def setAppInviteOneLinkID(oneLinkId: String): Unit = js.native
    @JSImport("react-native-appsflyer", "default.setAppInviteOneLinkID")
    @js.native
    def setAppInviteOneLinkID(oneLinkId: String, callback: SuccessCallback): Unit = js.native
    
    @JSImport("react-native-appsflyer", "default.setCollectAndroidID")
    @js.native
    def setCollectAndroidID(isCollect: Boolean): Unit = js.native
    @JSImport("react-native-appsflyer", "default.setCollectAndroidID")
    @js.native
    def setCollectAndroidID(isCollect: Boolean, callback: SuccessCallback): Unit = js.native
    
    @JSImport("react-native-appsflyer", "default.setCollectIMEI")
    @js.native
    def setCollectIMEI(isCollect: Boolean): Unit = js.native
    @JSImport("react-native-appsflyer", "default.setCollectIMEI")
    @js.native
    def setCollectIMEI(isCollect: Boolean, callback: SuccessCallback): Unit = js.native
    
    @JSImport("react-native-appsflyer", "default.setCurrencyCode")
    @js.native
    def setCurrencyCode(currencyCode: String): Unit = js.native
    @JSImport("react-native-appsflyer", "default.setCurrencyCode")
    @js.native
    def setCurrencyCode(currencyCode: String, callback: SuccessCallback): Unit = js.native
    
    @JSImport("react-native-appsflyer", "default.setCustomerUserId")
    @js.native
    def setCustomerUserId(userId: String): Unit = js.native
    @JSImport("react-native-appsflyer", "default.setCustomerUserId")
    @js.native
    def setCustomerUserId(userId: String, callback: SuccessCallback): Unit = js.native
    
    @JSImport("react-native-appsflyer", "default.setDeviceTrackingDisabled")
    @js.native
    def setDeviceTrackingDisabled(isDeviceTrackingDisabled: Boolean): Unit = js.native
    @JSImport("react-native-appsflyer", "default.setDeviceTrackingDisabled")
    @js.native
    def setDeviceTrackingDisabled(isDeviceTrackingDisabled: Boolean, success: SuccessCallback): Unit = js.native
    
    @JSImport("react-native-appsflyer", "default.setUserEmails")
    @js.native
    def setUserEmails(options: EmailOptions): Unit = js.native
    @JSImport("react-native-appsflyer", "default.setUserEmails")
    @js.native
    def setUserEmails(options: EmailOptions, success: js.UndefOr[scala.Nothing], error: ErrorCallback): Unit = js.native
    @JSImport("react-native-appsflyer", "default.setUserEmails")
    @js.native
    def setUserEmails(options: EmailOptions, success: SuccessCallback): Unit = js.native
    @JSImport("react-native-appsflyer", "default.setUserEmails")
    @js.native
    def setUserEmails(options: EmailOptions, success: SuccessCallback, error: ErrorCallback): Unit = js.native
    
    @JSImport("react-native-appsflyer", "default.stopTracking")
    @js.native
    def stopTracking(isStopTracking: Boolean): Unit = js.native
    @JSImport("react-native-appsflyer", "default.stopTracking")
    @js.native
    def stopTracking(isStopTracking: Boolean, callback: SuccessCallback): Unit = js.native
    
    @JSImport("react-native-appsflyer", "default.trackAndOpenStore")
    @js.native
    def trackAndOpenStore(appId: String, campaign: String): Unit = js.native
    @JSImport("react-native-appsflyer", "default.trackAndOpenStore")
    @js.native
    def trackAndOpenStore(appId: String, campaign: String, additionalData: AdditionalData): Unit = js.native
    
    @JSImport("react-native-appsflyer", "default.trackAppLaunch")
    @js.native
    def trackAppLaunch(): Unit = js.native
    
    @JSImport("react-native-appsflyer", "default.trackCrossPromotionImpression")
    @js.native
    def trackCrossPromotionImpression(appId: String, campaign: String): Unit = js.native
    
    @JSImport("react-native-appsflyer", "default.trackEvent")
    @js.native
    def trackEvent(eventName: String, eventValues: EventValues): Unit | js.Promise[String] = js.native
    @JSImport("react-native-appsflyer", "default.trackEvent")
    @js.native
    def trackEvent(
      eventName: String,
      eventValues: EventValues,
      success: js.UndefOr[scala.Nothing],
      error: ErrorCallback
    ): Unit | js.Promise[String] = js.native
    @JSImport("react-native-appsflyer", "default.trackEvent")
    @js.native
    def trackEvent(eventName: String, eventValues: EventValues, success: SuccessCallback): Unit | js.Promise[String] = js.native
    @JSImport("react-native-appsflyer", "default.trackEvent")
    @js.native
    def trackEvent(eventName: String, eventValues: EventValues, success: SuccessCallback, error: ErrorCallback): Unit | js.Promise[String] = js.native
    
    @JSImport("react-native-appsflyer", "default.trackLocation")
    @js.native
    def trackLocation(longitude: Double, latitude: Double): Unit = js.native
    @JSImport("react-native-appsflyer", "default.trackLocation")
    @js.native
    def trackLocation(
      longitude: Double,
      latitude: Double,
      callback: js.Function2[/* error */ js.Any, /* coordinates */ js.Array[Double], Unit]
    ): Unit = js.native
    
    @JSImport("react-native-appsflyer", "default.updateServerUninstallToken")
    @js.native
    def updateServerUninstallToken(token: String): Unit = js.native
    @JSImport("react-native-appsflyer", "default.updateServerUninstallToken")
    @js.native
    def updateServerUninstallToken(token: String, callback: SuccessCallback): Unit = js.native
  }
  
  @js.native
  sealed trait EmailCryptType extends StObject
  @JSImport("react-native-appsflyer", "EmailCryptType")
  @js.native
  object EmailCryptType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EmailCryptType with Double] = js.native
    
    @js.native
    sealed trait EmailCryptTypeMD5 extends EmailCryptType
    /* 2 */ val EmailCryptTypeMD5: typings.reactNativeAppsflyer.mod.EmailCryptType.EmailCryptTypeMD5 with Double = js.native
    
    @js.native
    sealed trait EmailCryptTypeNone extends EmailCryptType
    /* 0 */ val EmailCryptTypeNone: typings.reactNativeAppsflyer.mod.EmailCryptType.EmailCryptTypeNone with Double = js.native
    
    @js.native
    sealed trait EmailCryptTypeSHA1 extends EmailCryptType
    /* 1 */ val EmailCryptTypeSHA1: typings.reactNativeAppsflyer.mod.EmailCryptType.EmailCryptTypeSHA1 with Double = js.native
    
    @js.native
    sealed trait EmailCryptTypeSHA256 extends EmailCryptType
    /* 3 */ val EmailCryptTypeSHA256: typings.reactNativeAppsflyer.mod.EmailCryptType.EmailCryptTypeSHA256 with Double = js.native
  }
  
  type AdditionalData = StringDictionary[js.Any]
  
  @js.native
  trait ConversionData extends StObject {
    
    var data: Dictkey = js.native
    
    var status: success | failure = js.native
    
    var `type`: String = js.native
  }
  object ConversionData {
    
    @scala.inline
    def apply(data: Dictkey, status: success | failure, `type`: String): ConversionData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConversionData]
    }
    
    @scala.inline
    implicit class ConversionDataMutableBuilder[Self <: ConversionData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Dictkey): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: success | failure): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EmailOptions extends StObject {
    
    var emails: js.Array[String] = js.native
    
    var emailsCryptType: EmailCryptType = js.native
  }
  object EmailOptions {
    
    @scala.inline
    def apply(emails: js.Array[String], emailsCryptType: EmailCryptType): EmailOptions = {
      val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any], emailsCryptType = emailsCryptType.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailOptions]
    }
    
    @scala.inline
    implicit class EmailOptionsMutableBuilder[Self <: EmailOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailsCryptType(value: EmailCryptType): Self = StObject.set(x, "emailsCryptType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value :_*))
    }
  }
  
  type ErrorCallback = js.Function1[/* error */ js.Any, Unit]
  
  type EventValues = StringDictionary[js.Any]
  
  @js.native
  trait InitSdkOptions extends StObject {
    
    var appId: String = js.native
    
    var devKey: String = js.native
    
    var isDebug: Boolean = js.native
  }
  object InitSdkOptions {
    
    @scala.inline
    def apply(appId: String, devKey: String, isDebug: Boolean): InitSdkOptions = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], devKey = devKey.asInstanceOf[js.Any], isDebug = isDebug.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitSdkOptions]
    }
    
    @scala.inline
    implicit class InitSdkOptionsMutableBuilder[Self <: InitSdkOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevKey(value: String): Self = StObject.set(x, "devKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDebug(value: Boolean): Self = StObject.set(x, "isDebug", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InviteLinkOptions extends StObject {
    
    var baseDeeplink: js.UndefOr[String] = js.native
    
    var campaign: js.UndefOr[String] = js.native
    
    var channel: js.UndefOr[String] = js.native
    
    var customerID: js.UndefOr[String] = js.native
    
    var deeplinkPath: js.UndefOr[String] = js.native
    
    var referrerImageUrl: js.UndefOr[String] = js.native
    
    var referrerName: js.UndefOr[String] = js.native
    
    var userParams: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object InviteLinkOptions {
    
    @scala.inline
    def apply(): InviteLinkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InviteLinkOptions]
    }
    
    @scala.inline
    implicit class InviteLinkOptionsMutableBuilder[Self <: InviteLinkOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseDeeplink(value: String): Self = StObject.set(x, "baseDeeplink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseDeeplinkUndefined: Self = StObject.set(x, "baseDeeplink", js.undefined)
      
      @scala.inline
      def setCampaign(value: String): Self = StObject.set(x, "campaign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCampaignUndefined: Self = StObject.set(x, "campaign", js.undefined)
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setCustomerID(value: String): Self = StObject.set(x, "customerID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerIDUndefined: Self = StObject.set(x, "customerID", js.undefined)
      
      @scala.inline
      def setDeeplinkPath(value: String): Self = StObject.set(x, "deeplinkPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeeplinkPathUndefined: Self = StObject.set(x, "deeplinkPath", js.undefined)
      
      @scala.inline
      def setReferrerImageUrl(value: String): Self = StObject.set(x, "referrerImageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrerImageUrlUndefined: Self = StObject.set(x, "referrerImageUrl", js.undefined)
      
      @scala.inline
      def setReferrerName(value: String): Self = StObject.set(x, "referrerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrerNameUndefined: Self = StObject.set(x, "referrerName", js.undefined)
      
      @scala.inline
      def setUserParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "userParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserParamsUndefined: Self = StObject.set(x, "userParams", js.undefined)
    }
  }
  
  type SuccessCallback = js.Function1[/* success */ js.Any, Unit]
}
