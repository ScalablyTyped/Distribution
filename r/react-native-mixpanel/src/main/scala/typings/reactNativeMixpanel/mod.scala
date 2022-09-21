package typings.reactNativeMixpanel

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-mixpanel", JSImport.Default)
  @js.native
  val default: MixpanelAPI = js.native
  
  @JSImport("react-native-mixpanel", "MixpanelInstance")
  @js.native
  open class MixpanelInstance () extends StObject {
    def this(apiToken: String) = this()
    def this(apiToken: String, optOutTrackingDefault: Boolean) = this()
    def this(apiToken: Unit, optOutTrackingDefault: Boolean) = this()
    def this(apiToken: String, optOutTrackingDefault: Boolean, trackCrashes: Boolean) = this()
    def this(apiToken: String, optOutTrackingDefault: Unit, trackCrashes: Boolean) = this()
    def this(apiToken: Unit, optOutTrackingDefault: Boolean, trackCrashes: Boolean) = this()
    def this(apiToken: Unit, optOutTrackingDefault: Unit, trackCrashes: Boolean) = this()
    def this(
      apiToken: String,
      optOutTrackingDefault: Boolean,
      trackCrashes: Boolean,
      automaticPushTracking: Boolean
    ) = this()
    def this(
      apiToken: String,
      optOutTrackingDefault: Boolean,
      trackCrashes: Unit,
      automaticPushTracking: Boolean
    ) = this()
    def this(
      apiToken: String,
      optOutTrackingDefault: Unit,
      trackCrashes: Boolean,
      automaticPushTracking: Boolean
    ) = this()
    def this(apiToken: String, optOutTrackingDefault: Unit, trackCrashes: Unit, automaticPushTracking: Boolean) = this()
    def this(
      apiToken: Unit,
      optOutTrackingDefault: Boolean,
      trackCrashes: Boolean,
      automaticPushTracking: Boolean
    ) = this()
    def this(apiToken: Unit, optOutTrackingDefault: Boolean, trackCrashes: Unit, automaticPushTracking: Boolean) = this()
    def this(apiToken: Unit, optOutTrackingDefault: Unit, trackCrashes: Boolean, automaticPushTracking: Boolean) = this()
    def this(apiToken: Unit, optOutTrackingDefault: Unit, trackCrashes: Unit, automaticPushTracking: Boolean) = this()
    def this(
      apiToken: String,
      optOutTrackingDefault: Boolean,
      trackCrashes: Boolean,
      automaticPushTracking: Boolean,
      launchOptions: js.Object
    ) = this()
    def this(
      apiToken: String,
      optOutTrackingDefault: Boolean,
      trackCrashes: Boolean,
      automaticPushTracking: Unit,
      launchOptions: js.Object
    ) = this()
    def this(
      apiToken: String,
      optOutTrackingDefault: Boolean,
      trackCrashes: Unit,
      automaticPushTracking: Boolean,
      launchOptions: js.Object
    ) = this()
    def this(
      apiToken: String,
      optOutTrackingDefault: Boolean,
      trackCrashes: Unit,
      automaticPushTracking: Unit,
      launchOptions: js.Object
    ) = this()
    def this(
      apiToken: String,
      optOutTrackingDefault: Unit,
      trackCrashes: Boolean,
      automaticPushTracking: Boolean,
      launchOptions: js.Object
    ) = this()
    def this(
      apiToken: String,
      optOutTrackingDefault: Unit,
      trackCrashes: Boolean,
      automaticPushTracking: Unit,
      launchOptions: js.Object
    ) = this()
    def this(
      apiToken: String,
      optOutTrackingDefault: Unit,
      trackCrashes: Unit,
      automaticPushTracking: Boolean,
      launchOptions: js.Object
    ) = this()
    def this(
      apiToken: String,
      optOutTrackingDefault: Unit,
      trackCrashes: Unit,
      automaticPushTracking: Unit,
      launchOptions: js.Object
    ) = this()
    def this(
      apiToken: Unit,
      optOutTrackingDefault: Boolean,
      trackCrashes: Boolean,
      automaticPushTracking: Boolean,
      launchOptions: js.Object
    ) = this()
    def this(
      apiToken: Unit,
      optOutTrackingDefault: Boolean,
      trackCrashes: Boolean,
      automaticPushTracking: Unit,
      launchOptions: js.Object
    ) = this()
    def this(
      apiToken: Unit,
      optOutTrackingDefault: Boolean,
      trackCrashes: Unit,
      automaticPushTracking: Boolean,
      launchOptions: js.Object
    ) = this()
    def this(
      apiToken: Unit,
      optOutTrackingDefault: Boolean,
      trackCrashes: Unit,
      automaticPushTracking: Unit,
      launchOptions: js.Object
    ) = this()
    def this(
      apiToken: Unit,
      optOutTrackingDefault: Unit,
      trackCrashes: Boolean,
      automaticPushTracking: Boolean,
      launchOptions: js.Object
    ) = this()
    def this(
      apiToken: Unit,
      optOutTrackingDefault: Unit,
      trackCrashes: Boolean,
      automaticPushTracking: Unit,
      launchOptions: js.Object
    ) = this()
    def this(
      apiToken: Unit,
      optOutTrackingDefault: Unit,
      trackCrashes: Unit,
      automaticPushTracking: Boolean,
      launchOptions: js.Object
    ) = this()
    def this(
      apiToken: Unit,
      optOutTrackingDefault: Unit,
      trackCrashes: Unit,
      automaticPushTracking: Unit,
      launchOptions: js.Object
    ) = this()
    
    def addGroup(groupKey: String, groupId: String): js.Promise[Unit] = js.native
    
    def addPushDeviceToken(token: String): js.Promise[Unit] = js.native
    
    def alias(alias: String): js.Promise[Unit] = js.native
    def alias(alias: String, oldDistinctID: String): js.Promise[Unit] = js.native
    
    def append(name: String, properties: js.Array[Any]): js.Promise[Unit] = js.native
    
    def clearPushRegistrationId(): js.Promise[Unit] = js.native
    def clearPushRegistrationId(token: String): js.Promise[Unit] = js.native
    
    def clearSuperProperties(): js.Promise[Unit] = js.native
    
    def disableIpAddressGeolocalization(): js.Promise[Unit] = js.native
    
    def flush(): js.Promise[Unit] = js.native
    
    def getDistinctId(): js.Promise[String] = js.native
    
    def getPushRegistrationId(): js.Promise[String] = js.native
    
    def getSuperProperty(propertyName: String): js.Promise[Any] = js.native
    
    def identify(userId: String): js.Promise[Unit] = js.native
    
    def increment(property: String, by: Double): js.Promise[Unit] = js.native
    
    def initPushHandling(token: String): js.Promise[Unit] = js.native
    
    def initialize(): js.Promise[Unit] = js.native
    
    def optInTracking(): js.Promise[Unit] = js.native
    
    def optOutTracking(): js.Promise[Unit] = js.native
    
    def registerSuperProperties(properties: js.Object): js.Promise[Unit] = js.native
    
    def registerSuperPropertiesOnce(properties: js.Object): js.Promise[Unit] = js.native
    
    def removeAllPushDeviceTokens(): js.Promise[Unit] = js.native
    
    def removePushDeviceToken(pushDeviceToken: String): js.Promise[Unit] = js.native
    
    def reset(): js.Promise[Unit] = js.native
    
    def set(properties: js.Object): js.Promise[Unit] = js.native
    
    // iOS only
    def setAppSessionPropertiesIOS(properties: js.Object): js.Promise[Unit] = js.native
    
    def setGroup(groupKey: String, groupId: String): js.Promise[Unit] = js.native
    
    def setOnce(properties: js.Object): js.Promise[Unit] = js.native
    
    // android only
    def setPushRegistrationId(token: String): js.Promise[Unit] = js.native
    
    def showInAppMessageIfAvailable(): js.Promise[Unit] = js.native
    
    def timeEvent(event: String): js.Promise[Unit] = js.native
    
    def track(event: String): js.Promise[Unit] = js.native
    def track(event: String, properties: js.Object): js.Promise[Unit] = js.native
    
    def trackCharge(charge: Double): js.Promise[Unit] = js.native
    
    def trackChargeWithProperties(charge: Double, properties: js.Object): js.Promise[Unit] = js.native
    
    def union(name: String, properties: js.Array[Any]): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait MixpanelAPI extends StObject {
    
    def addGroup(groupKey: String, groupId: String): Unit = js.native
    
    // iOS only
    def addPushDeviceToken(token: String): Unit = js.native
    
    def append(name: String, properties: js.Array[Any]): Unit = js.native
    
    def clearPushRegistrationId(): Unit = js.native
    def clearPushRegistrationId(token: String): Unit = js.native
    
    def clearSuperProperties(): Unit = js.native
    
    def createAlias(alias: String): Unit = js.native
    def createAlias(alias: String, oldDistinctID: String): Unit = js.native
    
    def disableIpAddressGeolocalization(): Unit = js.native
    
    def flush(): Unit = js.native
    
    def getDistinctId(callback: js.Function1[/* id */ js.UndefOr[String], Unit]): Unit = js.native
    
    def getPushRegistrationId(callback: js.Function1[/* token */ js.UndefOr[String], Unit]): Unit = js.native
    
    def getSuperProperty(propertyName: String, callback: js.Function1[/* value */ Any, Unit]): Unit = js.native
    
    def identify(userId: String): Unit = js.native
    
    def increment(property: String, by: Double): Unit = js.native
    
    def initPushHandling(token: String): Unit = js.native
    
    def optInTracking(): Unit = js.native
    
    def optOutTracking(): Unit = js.native
    
    def registerSuperProperties(properties: js.Object): Unit = js.native
    
    def registerSuperPropertiesOnce(properties: js.Object): Unit = js.native
    
    def removeAllPushDeviceTokens(): Unit = js.native
    
    def removePushDeviceToken(pushDeviceToken: String): Unit = js.native
    
    def reset(): Unit = js.native
    
    def set(properties: js.Object): Unit = js.native
    
    def setAppSessionPropertiesIOS(properties: js.Object): js.Promise[Unit] = js.native
    
    def setGroup(groupKey: String, groupId: String): Unit = js.native
    
    def setOnce(properties: js.Object): Unit = js.native
    
    // android only
    def setPushRegistrationId(token: String): Unit = js.native
    
    def sharedInstanceWithToken(apiToken: String): js.Promise[Unit] = js.native
    def sharedInstanceWithToken(apiToken: String, optOutTrackingDefault: Boolean): js.Promise[Unit] = js.native
    def sharedInstanceWithToken(apiToken: String, optOutTrackingDefault: Boolean, trackCrashes: Boolean): js.Promise[Unit] = js.native
    def sharedInstanceWithToken(
      apiToken: String,
      optOutTrackingDefault: Boolean,
      trackCrashes: Boolean,
      automaticPushTracking: Boolean
    ): js.Promise[Unit] = js.native
    def sharedInstanceWithToken(
      apiToken: String,
      optOutTrackingDefault: Boolean,
      trackCrashes: Boolean,
      automaticPushTracking: Boolean,
      launchOptions: js.Object
    ): js.Promise[Unit] = js.native
    def sharedInstanceWithToken(
      apiToken: String,
      optOutTrackingDefault: Boolean,
      trackCrashes: Boolean,
      automaticPushTracking: Unit,
      launchOptions: js.Object
    ): js.Promise[Unit] = js.native
    def sharedInstanceWithToken(
      apiToken: String,
      optOutTrackingDefault: Boolean,
      trackCrashes: Unit,
      automaticPushTracking: Boolean
    ): js.Promise[Unit] = js.native
    def sharedInstanceWithToken(
      apiToken: String,
      optOutTrackingDefault: Boolean,
      trackCrashes: Unit,
      automaticPushTracking: Boolean,
      launchOptions: js.Object
    ): js.Promise[Unit] = js.native
    def sharedInstanceWithToken(
      apiToken: String,
      optOutTrackingDefault: Boolean,
      trackCrashes: Unit,
      automaticPushTracking: Unit,
      launchOptions: js.Object
    ): js.Promise[Unit] = js.native
    def sharedInstanceWithToken(apiToken: String, optOutTrackingDefault: Unit, trackCrashes: Boolean): js.Promise[Unit] = js.native
    def sharedInstanceWithToken(
      apiToken: String,
      optOutTrackingDefault: Unit,
      trackCrashes: Boolean,
      automaticPushTracking: Boolean
    ): js.Promise[Unit] = js.native
    def sharedInstanceWithToken(
      apiToken: String,
      optOutTrackingDefault: Unit,
      trackCrashes: Boolean,
      automaticPushTracking: Boolean,
      launchOptions: js.Object
    ): js.Promise[Unit] = js.native
    def sharedInstanceWithToken(
      apiToken: String,
      optOutTrackingDefault: Unit,
      trackCrashes: Boolean,
      automaticPushTracking: Unit,
      launchOptions: js.Object
    ): js.Promise[Unit] = js.native
    def sharedInstanceWithToken(apiToken: String, optOutTrackingDefault: Unit, trackCrashes: Unit, automaticPushTracking: Boolean): js.Promise[Unit] = js.native
    def sharedInstanceWithToken(
      apiToken: String,
      optOutTrackingDefault: Unit,
      trackCrashes: Unit,
      automaticPushTracking: Boolean,
      launchOptions: js.Object
    ): js.Promise[Unit] = js.native
    def sharedInstanceWithToken(
      apiToken: String,
      optOutTrackingDefault: Unit,
      trackCrashes: Unit,
      automaticPushTracking: Unit,
      launchOptions: js.Object
    ): js.Promise[Unit] = js.native
    
    def showInAppMessageIfAvailable(): Unit = js.native
    
    def timeEvent(event: String): Unit = js.native
    
    def track(event: String): Unit = js.native
    
    def trackCharge(charge: Double): Unit = js.native
    
    def trackChargeWithProperties(charge: Double, properties: js.Object): Unit = js.native
    
    def trackWithProperties(event: String, properties: js.Object): Unit = js.native
    
    def union(name: String, properties: js.Array[Any]): Unit = js.native
  }
  
  type _To = MixpanelAPI
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: MixpanelAPI = default
}
