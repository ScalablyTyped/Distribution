package typings.reactNativeAppsflyer

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeAppsflyer.anon.Afadset
import typings.reactNativeAppsflyer.anon.Afsub1
import typings.reactNativeAppsflyer.anon.Dictkey
import typings.reactNativeAppsflyer.reactNativeAppsflyerInts.`0`
import typings.reactNativeAppsflyer.reactNativeAppsflyerInts.`3`
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.Error
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.FOUND
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.NOT_FOUND
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.failure
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.onAppOpenAttribution
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.onAttributionFailure
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.onDeepLinking
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.onInstallConversionDataLoaded
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.onInstallConversionFailure
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-appsflyer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def addPushNotificationDeepLinkPath(path: js.Array[String], successC: SuccessCB, errorC: ErrorCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPushNotificationDeepLinkPath")(path.asInstanceOf[js.Any], successC.asInstanceOf[js.Any], errorC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def anonymizeUser(shouldAnonymize: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("anonymizeUser")(shouldAnonymize.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def anonymizeUser(shouldAnonymize: Boolean, successC: SuccessCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("anonymizeUser")(shouldAnonymize.asInstanceOf[js.Any], successC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def appendParametersToDeepLinkingURL(contains: String, parameters: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendParametersToDeepLinkingURL")(contains.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def disableAdvertisingIdentifier(isDisable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableAdvertisingIdentifier")(isDisable.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * For iOS Only
      * */
    inline def disableCollectASA(shouldDisable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableCollectASA")(shouldDisable.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def disableSKAD(disableSkad: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableSKAD")(disableSkad.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def generateInviteLink(params: GenerateInviteLinkParams, successC: SuccessCB, errorC: ErrorCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateInviteLink")(params.asInstanceOf[js.Any], successC.asInstanceOf[js.Any], errorC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getAppsFlyerUID(callback: js.Function2[/* error */ js.Error, /* uid */ String, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppsFlyerUID")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def initSdk(options: InitSDKOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("initSdk")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def initSdk(options: InitSDKOptions, successC: SuccessCB, errorC: ErrorCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initSdk")(options.asInstanceOf[js.Any], successC.asInstanceOf[js.Any], errorC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logCrossPromotionAndOpenStore(appId: String, campaign: String, params: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logCrossPromotionAndOpenStore")(appId.asInstanceOf[js.Any], campaign.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logCrossPromotionImpression(appId: String, campaign: String, parameters: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logCrossPromotionImpression")(appId.asInstanceOf[js.Any], campaign.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent(eventName: String, eventValues: js.Object): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(eventName.asInstanceOf[js.Any], eventValues.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def logEvent(eventName: String, eventValues: js.Object, successC: SuccessCB, errorC: ErrorCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(eventName.asInstanceOf[js.Any], eventValues.asInstanceOf[js.Any], successC.asInstanceOf[js.Any], errorC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logLocation(longitude: Double, latitude: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logLocation")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logLocation(longitude: Double, latitude: Double, successC: SuccessCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logLocation")(longitude.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], successC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def onAppOpenAttribution(callback: js.Function1[/* data */ OnAppOpenAttributionData, Any]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onAppOpenAttribution")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
    
    inline def onAttributionFailure(callback: js.Function1[/* data */ OnAppOpenAttributionData, Any]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onAttributionFailure")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
    
    inline def onDeepLink(callback: js.Function1[/* data */ UnifiedDeepLinkData, Any]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDeepLink")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
    
    inline def onInstallConversionData(callback: js.Function1[/* data */ ConversionData, Any]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onInstallConversionData")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
    
    inline def onInstallConversionFailure(callback: js.Function1[/* data */ ConversionData, Any]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onInstallConversionFailure")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
    
    inline def performOnAppAttribution(urlString: String, successC: SuccessCB, errorC: ErrorCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("performOnAppAttribution")(urlString.asInstanceOf[js.Any], successC.asInstanceOf[js.Any], errorC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def performOnDeepLinking(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("performOnDeepLinking")().asInstanceOf[Unit]
    
    inline def sendPushNotificationData(pushPayload: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendPushNotificationData")(pushPayload.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendPushNotificationData(pushPayload: js.Object, errorC: ErrorCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendPushNotificationData")(pushPayload.asInstanceOf[js.Any], errorC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setAdditionalData(additionalData: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAdditionalData")(additionalData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setAdditionalData(additionalData: js.Object, successC: SuccessCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAdditionalData")(additionalData.asInstanceOf[js.Any], successC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setAppInviteOneLinkID(oneLinkID: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAppInviteOneLinkID")(oneLinkID.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setAppInviteOneLinkID(oneLinkID: String, successC: SuccessCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAppInviteOneLinkID")(oneLinkID.asInstanceOf[js.Any], successC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setCollectAndroidID(isCollect: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCollectAndroidID")(isCollect.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setCollectAndroidID(isCollect: Boolean, successC: SuccessCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCollectAndroidID")(isCollect.asInstanceOf[js.Any], successC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * For Android Only
      * */
    inline def setCollectIMEI(isCollect: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCollectIMEI")(isCollect.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setCollectIMEI(isCollect: Boolean, successC: SuccessCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCollectIMEI")(isCollect.asInstanceOf[js.Any], successC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setCurrencyCode(currencyCode: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCurrencyCode")(currencyCode.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setCurrencyCode(currencyCode: String, successC: SuccessCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCurrencyCode")(currencyCode.asInstanceOf[js.Any], successC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setCurrentDeviceLanguage(language: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentDeviceLanguage")(language.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setCustomerUserId(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCustomerUserId")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setCustomerUserId(userId: String, successC: SuccessCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomerUserId")(userId.asInstanceOf[js.Any], successC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setDisableNetworkData(disable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisableNetworkData")(disable.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setHost(hostPrefix: String, hostName: String, success: SuccessCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setHost")(hostPrefix.asInstanceOf[js.Any], hostName.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setOneLinkCustomDomains(domains: js.Array[String], successC: SuccessCB, errorC: ErrorCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setOneLinkCustomDomains")(domains.asInstanceOf[js.Any], successC.asInstanceOf[js.Any], errorC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setPartnerData(partnerId: String, partnerData: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPartnerData")(partnerId.asInstanceOf[js.Any], partnerData.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setResolveDeepLinkURLs(urls: js.Array[String], successC: SuccessCB, errorC: ErrorCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setResolveDeepLinkURLs")(urls.asInstanceOf[js.Any], successC.asInstanceOf[js.Any], errorC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setSharingFilter(partners: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSharingFilter")(partners.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setSharingFilter(partners: js.Array[String], successC: Unit, errorC: ErrorCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSharingFilter")(partners.asInstanceOf[js.Any], successC.asInstanceOf[js.Any], errorC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setSharingFilter(partners: js.Array[String], successC: SuccessCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSharingFilter")(partners.asInstanceOf[js.Any], successC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setSharingFilter(partners: js.Array[String], successC: SuccessCB, errorC: ErrorCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSharingFilter")(partners.asInstanceOf[js.Any], successC.asInstanceOf[js.Any], errorC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setSharingFilterForAllPartners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSharingFilterForAllPartners")().asInstanceOf[Unit]
    
    inline def setSharingFilterForPartners(partners: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSharingFilterForPartners")(partners.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setUseReceiptValidationSandbox(isSandbox: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseReceiptValidationSandbox")(isSandbox.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setUserEmails(options: SetEmailsOptions, successC: SuccessCB, errorC: ErrorCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserEmails")(options.asInstanceOf[js.Any], successC.asInstanceOf[js.Any], errorC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def startSdk(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startSdk")().asInstanceOf[Unit]
    
    inline def stop(isStopped: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(isStopped.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def stop(isStopped: Boolean, successC: SuccessCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stop")(isStopped.asInstanceOf[js.Any], successC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updateServerUninstallToken(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateServerUninstallToken")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def updateServerUninstallToken(token: String, successC: SuccessCB): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateServerUninstallToken")(token.asInstanceOf[js.Any], successC.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def validateAndLogInAppPurchase(purchaseInfo: InAppPurchase, successC: SuccessCB, errorC: ErrorCB): Response[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateAndLogInAppPurchase")(purchaseInfo.asInstanceOf[js.Any], successC.asInstanceOf[js.Any], errorC.asInstanceOf[js.Any])).asInstanceOf[Response[String]]
  }
  
  @js.native
  sealed trait AF_EMAIL_CRYPT_TYPE extends StObject
  @JSImport("react-native-appsflyer", "AF_EMAIL_CRYPT_TYPE")
  @js.native
  object AF_EMAIL_CRYPT_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AF_EMAIL_CRYPT_TYPE & Double] = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with AF_EMAIL_CRYPT_TYPE
    /* 0 */ val NONE: typings.reactNativeAppsflyer.mod.AF_EMAIL_CRYPT_TYPE.NONE & Double = js.native
    
    @js.native
    sealed trait SHA256
      extends StObject
         with AF_EMAIL_CRYPT_TYPE
    /* 1 */ val SHA256: typings.reactNativeAppsflyer.mod.AF_EMAIL_CRYPT_TYPE.SHA256 & Double = js.native
  }
  
  trait ConversionData extends StObject {
    
    var data: Dictkey
    
    var status: success | failure
    
    var `type`: onInstallConversionDataLoaded | onInstallConversionFailure
  }
  object ConversionData {
    
    inline def apply(
      data: Dictkey,
      status: success | failure,
      `type`: onInstallConversionDataLoaded | onInstallConversionFailure
    ): ConversionData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConversionData]
    }
    
    extension [Self <: ConversionData](x: Self) {
      
      inline def setData(value: Dictkey): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: success | failure): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: onInstallConversionDataLoaded | onInstallConversionFailure): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorCB = js.Function1[/* error */ js.UndefOr[Any], Any]
  
  trait GenerateInviteLinkParams
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var campaign: js.UndefOr[String] = js.undefined
    
    var channel: String
    
    var customerID: js.UndefOr[String] = js.undefined
    
    var userParams: js.UndefOr[js.Object] = js.undefined
  }
  object GenerateInviteLinkParams {
    
    inline def apply(channel: String): GenerateInviteLinkParams = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateInviteLinkParams]
    }
    
    extension [Self <: GenerateInviteLinkParams](x: Self) {
      
      inline def setCampaign(value: String): Self = StObject.set(x, "campaign", value.asInstanceOf[js.Any])
      
      inline def setCampaignUndefined: Self = StObject.set(x, "campaign", js.undefined)
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setCustomerID(value: String): Self = StObject.set(x, "customerID", value.asInstanceOf[js.Any])
      
      inline def setCustomerIDUndefined: Self = StObject.set(x, "customerID", js.undefined)
      
      inline def setUserParams(value: js.Object): Self = StObject.set(x, "userParams", value.asInstanceOf[js.Any])
      
      inline def setUserParamsUndefined: Self = StObject.set(x, "userParams", js.undefined)
    }
  }
  
  trait InAppPurchase extends StObject {
    
    var additionalParameters: js.UndefOr[js.Object] = js.undefined
    
    var currency: String
    
    var price: String
    
    var productIdentifier: String
    
    var publicKey: String
    
    var purchaseData: String
    
    var signature: String
    
    var transactionId: String
  }
  object InAppPurchase {
    
    inline def apply(
      currency: String,
      price: String,
      productIdentifier: String,
      publicKey: String,
      purchaseData: String,
      signature: String,
      transactionId: String
    ): InAppPurchase = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], productIdentifier = productIdentifier.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], purchaseData = purchaseData.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InAppPurchase]
    }
    
    extension [Self <: InAppPurchase](x: Self) {
      
      inline def setAdditionalParameters(value: js.Object): Self = StObject.set(x, "additionalParameters", value.asInstanceOf[js.Any])
      
      inline def setAdditionalParametersUndefined: Self = StObject.set(x, "additionalParameters", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setProductIdentifier(value: String): Self = StObject.set(x, "productIdentifier", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setPurchaseData(value: String): Self = StObject.set(x, "purchaseData", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitSDKOptions extends StObject {
    
    var appId: js.UndefOr[String] = js.undefined
    
    var devKey: String
    
    // iOS only
    var isDebug: js.UndefOr[Boolean] = js.undefined
    
    // iOS only
    var manualStart: js.UndefOr[Boolean] = js.undefined
    
    var onDeepLinkListener: js.UndefOr[Boolean] = js.undefined
    
    var onInstallConversionDataListener: js.UndefOr[Boolean] = js.undefined
    
    var timeToWaitForATTUserAuthorization: js.UndefOr[Double] = js.undefined
  }
  object InitSDKOptions {
    
    inline def apply(devKey: String): InitSDKOptions = {
      val __obj = js.Dynamic.literal(devKey = devKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitSDKOptions]
    }
    
    extension [Self <: InitSDKOptions](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
      
      inline def setDevKey(value: String): Self = StObject.set(x, "devKey", value.asInstanceOf[js.Any])
      
      inline def setIsDebug(value: Boolean): Self = StObject.set(x, "isDebug", value.asInstanceOf[js.Any])
      
      inline def setIsDebugUndefined: Self = StObject.set(x, "isDebug", js.undefined)
      
      inline def setManualStart(value: Boolean): Self = StObject.set(x, "manualStart", value.asInstanceOf[js.Any])
      
      inline def setManualStartUndefined: Self = StObject.set(x, "manualStart", js.undefined)
      
      inline def setOnDeepLinkListener(value: Boolean): Self = StObject.set(x, "onDeepLinkListener", value.asInstanceOf[js.Any])
      
      inline def setOnDeepLinkListenerUndefined: Self = StObject.set(x, "onDeepLinkListener", js.undefined)
      
      inline def setOnInstallConversionDataListener(value: Boolean): Self = StObject.set(x, "onInstallConversionDataListener", value.asInstanceOf[js.Any])
      
      inline def setOnInstallConversionDataListenerUndefined: Self = StObject.set(x, "onInstallConversionDataListener", js.undefined)
      
      inline def setTimeToWaitForATTUserAuthorization(value: Double): Self = StObject.set(x, "timeToWaitForATTUserAuthorization", value.asInstanceOf[js.Any])
      
      inline def setTimeToWaitForATTUserAuthorizationUndefined: Self = StObject.set(x, "timeToWaitForATTUserAuthorization", js.undefined)
    }
  }
  
  trait OnAppOpenAttributionData extends StObject {
    
    var data: Afadset
    
    var status: success | failure
    
    var `type`: onAppOpenAttribution | onAttributionFailure
  }
  object OnAppOpenAttributionData {
    
    inline def apply(data: Afadset, status: success | failure, `type`: onAppOpenAttribution | onAttributionFailure): OnAppOpenAttributionData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnAppOpenAttributionData]
    }
    
    extension [Self <: OnAppOpenAttributionData](x: Self) {
      
      inline def setData(value: Afadset): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: success | failure): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: onAppOpenAttribution | onAttributionFailure): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Response[T] = Unit | js.Promise[T]
  
  trait SetEmailsOptions extends StObject {
    
    var emails: js.UndefOr[js.Array[String]] = js.undefined
    
    var emailsCryptType: AF_EMAIL_CRYPT_TYPE | `0` | `3`
  }
  object SetEmailsOptions {
    
    inline def apply(emailsCryptType: AF_EMAIL_CRYPT_TYPE | `0` | `3`): SetEmailsOptions = {
      val __obj = js.Dynamic.literal(emailsCryptType = emailsCryptType.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetEmailsOptions]
    }
    
    extension [Self <: SetEmailsOptions](x: Self) {
      
      inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
      
      inline def setEmailsCryptType(value: AF_EMAIL_CRYPT_TYPE | `0` | `3`): Self = StObject.set(x, "emailsCryptType", value.asInstanceOf[js.Any])
      
      inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
      
      inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value*))
    }
  }
  
  type SuccessCB = js.Function1[/* result */ js.UndefOr[Any], Any]
  
  trait UnifiedDeepLinkData extends StObject {
    
    var data: Afsub1
    
    var deepLinkStatus: FOUND | NOT_FOUND | Error
    
    var isDeferred: Boolean
    
    var status: success | failure
    
    var `type`: onDeepLinking
  }
  object UnifiedDeepLinkData {
    
    inline def apply(
      data: Afsub1,
      deepLinkStatus: FOUND | NOT_FOUND | Error,
      isDeferred: Boolean,
      status: success | failure
    ): UnifiedDeepLinkData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], deepLinkStatus = deepLinkStatus.asInstanceOf[js.Any], isDeferred = isDeferred.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("onDeepLinking")
      __obj.asInstanceOf[UnifiedDeepLinkData]
    }
    
    extension [Self <: UnifiedDeepLinkData](x: Self) {
      
      inline def setData(value: Afsub1): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDeepLinkStatus(value: FOUND | NOT_FOUND | Error): Self = StObject.set(x, "deepLinkStatus", value.asInstanceOf[js.Any])
      
      inline def setIsDeferred(value: Boolean): Self = StObject.set(x, "isDeferred", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: success | failure): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: onDeepLinking): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
