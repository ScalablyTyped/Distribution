package typings.reactNativeGoogleAnalyticsBridge

import typings.reactNative.mod.EventSubscriptionVendor
import typings.reactNativeGoogleAnalyticsBridge.analyticsMod.HitPayload
import typings.reactNativeGoogleAnalyticsBridge.dataLayerEventMod.DataLayerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeBridgesMod {
  
  @JSImport("react-native-google-analytics-bridge/dist/NativeBridges", "AnalyticsBridge")
  @js.native
  val AnalyticsBridge: IGoogleAnalyticsBridge = js.native
  
  @JSImport("react-native-google-analytics-bridge/dist/NativeBridges", "AnalyticsSettings")
  @js.native
  val AnalyticsSettings: IGoogleAnalyticsSettings = js.native
  
  @JSImport("react-native-google-analytics-bridge/dist/NativeBridges", "TagManagerBridge")
  @js.native
  val TagManagerBridge: IGoogleTagManagerBridge = js.native
  
  trait IGoogleAnalyticsBridge extends StObject {
    
    def allowIDFA(trackerId: String, enabled: Boolean): Unit
    
    def dispatch(): js.Promise[Boolean]
    
    def getClientId(trackerId: String): js.Promise[String]
    
    def setAnonymizeIp(trackerId: String, enabled: Boolean): Unit
    
    def setAppName(trackerId: String, appName: String): Unit
    
    def setAppVersion(trackerId: String, appVersion: String): Unit
    
    def setClient(trackerId: String, clientId: String): Unit
    
    def setCurrency(trackerId: String, currencyCode: String): Unit
    
    def setSamplingRate(trackerId: String, sampleRate: Double): Unit
    
    def setTrackUncaughtExceptions(trackerId: String, enabled: Boolean): Unit
    
    def setUser(trackerId: String, userId: String): Unit
    
    def trackEvent(
      trackerId: String,
      category: String,
      action: String,
      label: String,
      value: String,
      payload: HitPayload
    ): Unit
    
    def trackException(trackerId: String, error: String, fatal: Boolean, payload: HitPayload): Unit
    
    def trackScreenView(trackerId: String, screenName: String, payload: HitPayload): Unit
    
    def trackSocialInteraction(trackerId: String, network: String, action: String, targetUrl: String, payload: HitPayload): Unit
    
    def trackTiming(
      trackerId: String,
      category: String,
      interval: Double,
      name: String,
      label: String,
      payload: HitPayload
    ): Unit
  }
  object IGoogleAnalyticsBridge {
    
    inline def apply(
      allowIDFA: (String, Boolean) => Unit,
      dispatch: () => js.Promise[Boolean],
      getClientId: String => js.Promise[String],
      setAnonymizeIp: (String, Boolean) => Unit,
      setAppName: (String, String) => Unit,
      setAppVersion: (String, String) => Unit,
      setClient: (String, String) => Unit,
      setCurrency: (String, String) => Unit,
      setSamplingRate: (String, Double) => Unit,
      setTrackUncaughtExceptions: (String, Boolean) => Unit,
      setUser: (String, String) => Unit,
      trackEvent: (String, String, String, String, String, HitPayload) => Unit,
      trackException: (String, String, Boolean, HitPayload) => Unit,
      trackScreenView: (String, String, HitPayload) => Unit,
      trackSocialInteraction: (String, String, String, String, HitPayload) => Unit,
      trackTiming: (String, String, Double, String, String, HitPayload) => Unit
    ): IGoogleAnalyticsBridge = {
      val __obj = js.Dynamic.literal(allowIDFA = js.Any.fromFunction2(allowIDFA), dispatch = js.Any.fromFunction0(dispatch), getClientId = js.Any.fromFunction1(getClientId), setAnonymizeIp = js.Any.fromFunction2(setAnonymizeIp), setAppName = js.Any.fromFunction2(setAppName), setAppVersion = js.Any.fromFunction2(setAppVersion), setClient = js.Any.fromFunction2(setClient), setCurrency = js.Any.fromFunction2(setCurrency), setSamplingRate = js.Any.fromFunction2(setSamplingRate), setTrackUncaughtExceptions = js.Any.fromFunction2(setTrackUncaughtExceptions), setUser = js.Any.fromFunction2(setUser), trackEvent = js.Any.fromFunction6(trackEvent), trackException = js.Any.fromFunction4(trackException), trackScreenView = js.Any.fromFunction3(trackScreenView), trackSocialInteraction = js.Any.fromFunction5(trackSocialInteraction), trackTiming = js.Any.fromFunction6(trackTiming))
      __obj.asInstanceOf[IGoogleAnalyticsBridge]
    }
    
    extension [Self <: IGoogleAnalyticsBridge](x: Self) {
      
      inline def setAllowIDFA(value: (String, Boolean) => Unit): Self = StObject.set(x, "allowIDFA", js.Any.fromFunction2(value))
      
      inline def setDispatch(value: () => js.Promise[Boolean]): Self = StObject.set(x, "dispatch", js.Any.fromFunction0(value))
      
      inline def setGetClientId(value: String => js.Promise[String]): Self = StObject.set(x, "getClientId", js.Any.fromFunction1(value))
      
      inline def setSetAnonymizeIp(value: (String, Boolean) => Unit): Self = StObject.set(x, "setAnonymizeIp", js.Any.fromFunction2(value))
      
      inline def setSetAppName(value: (String, String) => Unit): Self = StObject.set(x, "setAppName", js.Any.fromFunction2(value))
      
      inline def setSetAppVersion(value: (String, String) => Unit): Self = StObject.set(x, "setAppVersion", js.Any.fromFunction2(value))
      
      inline def setSetClient(value: (String, String) => Unit): Self = StObject.set(x, "setClient", js.Any.fromFunction2(value))
      
      inline def setSetCurrency(value: (String, String) => Unit): Self = StObject.set(x, "setCurrency", js.Any.fromFunction2(value))
      
      inline def setSetSamplingRate(value: (String, Double) => Unit): Self = StObject.set(x, "setSamplingRate", js.Any.fromFunction2(value))
      
      inline def setSetTrackUncaughtExceptions(value: (String, Boolean) => Unit): Self = StObject.set(x, "setTrackUncaughtExceptions", js.Any.fromFunction2(value))
      
      inline def setSetUser(value: (String, String) => Unit): Self = StObject.set(x, "setUser", js.Any.fromFunction2(value))
      
      inline def setTrackEvent(value: (String, String, String, String, String, HitPayload) => Unit): Self = StObject.set(x, "trackEvent", js.Any.fromFunction6(value))
      
      inline def setTrackException(value: (String, String, Boolean, HitPayload) => Unit): Self = StObject.set(x, "trackException", js.Any.fromFunction4(value))
      
      inline def setTrackScreenView(value: (String, String, HitPayload) => Unit): Self = StObject.set(x, "trackScreenView", js.Any.fromFunction3(value))
      
      inline def setTrackSocialInteraction(value: (String, String, String, String, HitPayload) => Unit): Self = StObject.set(x, "trackSocialInteraction", js.Any.fromFunction5(value))
      
      inline def setTrackTiming(value: (String, String, Double, String, String, HitPayload) => Unit): Self = StObject.set(x, "trackTiming", js.Any.fromFunction6(value))
    }
  }
  
  trait IGoogleAnalyticsSettings extends StObject {
    
    def setDispatchInterval(intervalInSeconds: js.Any): Unit
    
    def setDryRun(enabled: js.Any): Unit
    
    def setOptOut(enabled: js.Any): Unit
  }
  object IGoogleAnalyticsSettings {
    
    inline def apply(setDispatchInterval: js.Any => Unit, setDryRun: js.Any => Unit, setOptOut: js.Any => Unit): IGoogleAnalyticsSettings = {
      val __obj = js.Dynamic.literal(setDispatchInterval = js.Any.fromFunction1(setDispatchInterval), setDryRun = js.Any.fromFunction1(setDryRun), setOptOut = js.Any.fromFunction1(setOptOut))
      __obj.asInstanceOf[IGoogleAnalyticsSettings]
    }
    
    extension [Self <: IGoogleAnalyticsSettings](x: Self) {
      
      inline def setSetDispatchInterval(value: js.Any => Unit): Self = StObject.set(x, "setDispatchInterval", js.Any.fromFunction1(value))
      
      inline def setSetDryRun(value: js.Any => Unit): Self = StObject.set(x, "setDryRun", js.Any.fromFunction1(value))
      
      inline def setSetOptOut(value: js.Any => Unit): Self = StObject.set(x, "setOptOut", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IGoogleTagManagerBridge
    extends StObject
       with EventSubscriptionVendor {
    
    def booleanForKey(key: String): js.Promise[Boolean] = js.native
    
    def doubleForKey(key: js.Any): js.Promise[Double] = js.native
    
    def openContainerWithId(containerId: String): js.Promise[Boolean] = js.native
    
    def pushDataLayerEvent(event: DataLayerEvent): js.Promise[Boolean] = js.native
    
    def refreshContainer(): js.Promise[Boolean] = js.native
    
    def registerFunctionCallTagHandler(functionName: String): js.Promise[Boolean] = js.native
    
    def setVerboseLoggingEnabled(enabled: Boolean): js.Promise[Boolean] = js.native
    
    def stringForKey(key: String): js.Promise[String] = js.native
  }
}
