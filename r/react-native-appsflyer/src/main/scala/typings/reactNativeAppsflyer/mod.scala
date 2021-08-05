package typings.reactNativeAppsflyer

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeAppsflyer.anon.Dictkey
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.failure
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-appsflyer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def generateInviteLink(options: InviteLinkOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateInviteLink")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def generateInviteLink(options: InviteLinkOptions, success: Unit, error: ErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateInviteLink")(options.asInstanceOf[js.Any], success.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateInviteLink(options: InviteLinkOptions, success: SuccessCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateInviteLink")(options.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateInviteLink(options: InviteLinkOptions, success: SuccessCallback, error: ErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateInviteLink")(options.asInstanceOf[js.Any], success.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getAppsFlyerUID(callback: js.Function2[/* error */ js.Any, /* appsFlyerUID */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppsFlyerUID")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def initSdk(options: InitSdkOptions): Unit | js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("initSdk")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | js.Promise[String]]
    inline def initSdk(options: InitSdkOptions, success: Unit, error: ErrorCallback): Unit | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("initSdk")(options.asInstanceOf[js.Any], success.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[String]]
    inline def initSdk(options: InitSdkOptions, success: SuccessCallback): Unit | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("initSdk")(options.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[String]]
    inline def initSdk(options: InitSdkOptions, success: SuccessCallback, error: ErrorCallback): Unit | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("initSdk")(options.asInstanceOf[js.Any], success.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[String]]
    
    inline def onAppOpenAttribution(callback: js.Function1[/* response */ js.Any, Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onAppOpenAttribution")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
    
    inline def onInstallConversionData(callback: js.Function1[/* data */ ConversionData, Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onInstallConversionData")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
    
    inline def sendDeepLinkData(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendDeepLinkData")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setAdditionalData(additionalData: AdditionalData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAdditionalData")(additionalData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setAdditionalData(additionalData: AdditionalData, success: SuccessCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAdditionalData")(additionalData.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setAppInviteOneLinkID(oneLinkId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAppInviteOneLinkID")(oneLinkId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setAppInviteOneLinkID(oneLinkId: String, callback: SuccessCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAppInviteOneLinkID")(oneLinkId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setCollectAndroidID(isCollect: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCollectAndroidID")(isCollect.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setCollectAndroidID(isCollect: Boolean, callback: SuccessCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCollectAndroidID")(isCollect.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setCollectIMEI(isCollect: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCollectIMEI")(isCollect.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setCollectIMEI(isCollect: Boolean, callback: SuccessCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCollectIMEI")(isCollect.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setCurrencyCode(currencyCode: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCurrencyCode")(currencyCode.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setCurrencyCode(currencyCode: String, callback: SuccessCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCurrencyCode")(currencyCode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setCustomerUserId(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCustomerUserId")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setCustomerUserId(userId: String, callback: SuccessCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomerUserId")(userId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setDeviceTrackingDisabled(isDeviceTrackingDisabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDeviceTrackingDisabled")(isDeviceTrackingDisabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setDeviceTrackingDisabled(isDeviceTrackingDisabled: Boolean, success: SuccessCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDeviceTrackingDisabled")(isDeviceTrackingDisabled.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setUserEmails(options: EmailOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserEmails")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setUserEmails(options: EmailOptions, success: Unit, error: ErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserEmails")(options.asInstanceOf[js.Any], success.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setUserEmails(options: EmailOptions, success: SuccessCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserEmails")(options.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setUserEmails(options: EmailOptions, success: SuccessCallback, error: ErrorCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserEmails")(options.asInstanceOf[js.Any], success.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def stopTracking(isStopTracking: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopTracking")(isStopTracking.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def stopTracking(isStopTracking: Boolean, callback: SuccessCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stopTracking")(isStopTracking.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def trackAndOpenStore(appId: String, campaign: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackAndOpenStore")(appId.asInstanceOf[js.Any], campaign.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def trackAndOpenStore(appId: String, campaign: String, additionalData: AdditionalData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackAndOpenStore")(appId.asInstanceOf[js.Any], campaign.asInstanceOf[js.Any], additionalData.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def trackAppLaunch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackAppLaunch")().asInstanceOf[Unit]
    
    inline def trackCrossPromotionImpression(appId: String, campaign: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackCrossPromotionImpression")(appId.asInstanceOf[js.Any], campaign.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def trackEvent(eventName: String, eventValues: EventValues): Unit | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("trackEvent")(eventName.asInstanceOf[js.Any], eventValues.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[String]]
    inline def trackEvent(eventName: String, eventValues: EventValues, success: Unit, error: ErrorCallback): Unit | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("trackEvent")(eventName.asInstanceOf[js.Any], eventValues.asInstanceOf[js.Any], success.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[String]]
    inline def trackEvent(eventName: String, eventValues: EventValues, success: SuccessCallback): Unit | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("trackEvent")(eventName.asInstanceOf[js.Any], eventValues.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[String]]
    inline def trackEvent(eventName: String, eventValues: EventValues, success: SuccessCallback, error: ErrorCallback): Unit | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("trackEvent")(eventName.asInstanceOf[js.Any], eventValues.asInstanceOf[js.Any], success.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[String]]
    
    inline def trackLocation(longitude: Double, latitude: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackLocation")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def trackLocation(
      longitude: Double,
      latitude: Double,
      callback: js.Function2[/* error */ js.Any, /* coordinates */ js.Array[Double], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackLocation")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updateServerUninstallToken(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateServerUninstallToken")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def updateServerUninstallToken(token: String, callback: SuccessCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateServerUninstallToken")(token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  sealed trait EmailCryptType extends StObject
  @JSImport("react-native-appsflyer", "EmailCryptType")
  @js.native
  object EmailCryptType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EmailCryptType & Double] = js.native
    
    @js.native
    sealed trait EmailCryptTypeMD5
      extends StObject
         with EmailCryptType
    /* 2 */ val EmailCryptTypeMD5: typings.reactNativeAppsflyer.mod.EmailCryptType.EmailCryptTypeMD5 & Double = js.native
    
    @js.native
    sealed trait EmailCryptTypeNone
      extends StObject
         with EmailCryptType
    /* 0 */ val EmailCryptTypeNone: typings.reactNativeAppsflyer.mod.EmailCryptType.EmailCryptTypeNone & Double = js.native
    
    @js.native
    sealed trait EmailCryptTypeSHA1
      extends StObject
         with EmailCryptType
    /* 1 */ val EmailCryptTypeSHA1: typings.reactNativeAppsflyer.mod.EmailCryptType.EmailCryptTypeSHA1 & Double = js.native
    
    @js.native
    sealed trait EmailCryptTypeSHA256
      extends StObject
         with EmailCryptType
    /* 3 */ val EmailCryptTypeSHA256: typings.reactNativeAppsflyer.mod.EmailCryptType.EmailCryptTypeSHA256 & Double = js.native
  }
  
  type AdditionalData = StringDictionary[js.Any]
  
  trait ConversionData extends StObject {
    
    var data: Dictkey
    
    var status: success | failure
    
    var `type`: String
  }
  object ConversionData {
    
    inline def apply(data: Dictkey, status: success | failure, `type`: String): ConversionData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConversionData]
    }
    
    extension [Self <: ConversionData](x: Self) {
      
      inline def setData(value: Dictkey): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: success | failure): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmailOptions extends StObject {
    
    var emails: js.Array[String]
    
    var emailsCryptType: EmailCryptType
  }
  object EmailOptions {
    
    inline def apply(emails: js.Array[String], emailsCryptType: EmailCryptType): EmailOptions = {
      val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any], emailsCryptType = emailsCryptType.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailOptions]
    }
    
    extension [Self <: EmailOptions](x: Self) {
      
      inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
      
      inline def setEmailsCryptType(value: EmailCryptType): Self = StObject.set(x, "emailsCryptType", value.asInstanceOf[js.Any])
      
      inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value :_*))
    }
  }
  
  type ErrorCallback = js.Function1[/* error */ js.Any, Unit]
  
  type EventValues = StringDictionary[js.Any]
  
  trait InitSdkOptions extends StObject {
    
    var appId: String
    
    var devKey: String
    
    var isDebug: Boolean
  }
  object InitSdkOptions {
    
    inline def apply(appId: String, devKey: String, isDebug: Boolean): InitSdkOptions = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], devKey = devKey.asInstanceOf[js.Any], isDebug = isDebug.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitSdkOptions]
    }
    
    extension [Self <: InitSdkOptions](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setDevKey(value: String): Self = StObject.set(x, "devKey", value.asInstanceOf[js.Any])
      
      inline def setIsDebug(value: Boolean): Self = StObject.set(x, "isDebug", value.asInstanceOf[js.Any])
    }
  }
  
  trait InviteLinkOptions extends StObject {
    
    var baseDeeplink: js.UndefOr[String] = js.undefined
    
    var campaign: js.UndefOr[String] = js.undefined
    
    var channel: js.UndefOr[String] = js.undefined
    
    var customerID: js.UndefOr[String] = js.undefined
    
    var deeplinkPath: js.UndefOr[String] = js.undefined
    
    var referrerImageUrl: js.UndefOr[String] = js.undefined
    
    var referrerName: js.UndefOr[String] = js.undefined
    
    var userParams: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object InviteLinkOptions {
    
    inline def apply(): InviteLinkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InviteLinkOptions]
    }
    
    extension [Self <: InviteLinkOptions](x: Self) {
      
      inline def setBaseDeeplink(value: String): Self = StObject.set(x, "baseDeeplink", value.asInstanceOf[js.Any])
      
      inline def setBaseDeeplinkUndefined: Self = StObject.set(x, "baseDeeplink", js.undefined)
      
      inline def setCampaign(value: String): Self = StObject.set(x, "campaign", value.asInstanceOf[js.Any])
      
      inline def setCampaignUndefined: Self = StObject.set(x, "campaign", js.undefined)
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setCustomerID(value: String): Self = StObject.set(x, "customerID", value.asInstanceOf[js.Any])
      
      inline def setCustomerIDUndefined: Self = StObject.set(x, "customerID", js.undefined)
      
      inline def setDeeplinkPath(value: String): Self = StObject.set(x, "deeplinkPath", value.asInstanceOf[js.Any])
      
      inline def setDeeplinkPathUndefined: Self = StObject.set(x, "deeplinkPath", js.undefined)
      
      inline def setReferrerImageUrl(value: String): Self = StObject.set(x, "referrerImageUrl", value.asInstanceOf[js.Any])
      
      inline def setReferrerImageUrlUndefined: Self = StObject.set(x, "referrerImageUrl", js.undefined)
      
      inline def setReferrerName(value: String): Self = StObject.set(x, "referrerName", value.asInstanceOf[js.Any])
      
      inline def setReferrerNameUndefined: Self = StObject.set(x, "referrerName", js.undefined)
      
      inline def setUserParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "userParams", value.asInstanceOf[js.Any])
      
      inline def setUserParamsUndefined: Self = StObject.set(x, "userParams", js.undefined)
    }
  }
  
  type SuccessCallback = js.Function1[/* success */ js.Any, Unit]
}
