package typings.pubnub.mod

import typings.pubnub.anon.FreeSocketKeepAliveTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubnubConfig extends StObject {
  
  var authKey: js.UndefOr[String] = js.undefined
  
  var autoNetworkDetection: js.UndefOr[Boolean] = js.undefined
  
  var cipherKey: js.UndefOr[String] = js.undefined
  
  var heartbeatInterval: js.UndefOr[Double] = js.undefined
  
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  
  var keepAliveSettings: js.UndefOr[FreeSocketKeepAliveTimeout] = js.undefined
  
  var listenToBrowserNetworkEvents: js.UndefOr[Boolean] = js.undefined
  
  var logVerbosity: js.UndefOr[Boolean] = js.undefined
  
  var origin: js.UndefOr[String] = js.undefined
  
  var presenceTimeout: js.UndefOr[Double] = js.undefined
  
  var publishKey: js.UndefOr[String] = js.undefined
  
  var requestMessageCountThreshold: js.UndefOr[Double] = js.undefined
  
  var restore: js.UndefOr[Boolean] = js.undefined
  
  var secretKey: js.UndefOr[String] = js.undefined
  
  var ssl: js.UndefOr[Boolean] = js.undefined
  
  var subscribeKey: String
  
  var suppressLeaveEvents: js.UndefOr[Boolean] = js.undefined
  
  var uuid: js.UndefOr[String] = js.undefined
}
object PubnubConfig {
  
  inline def apply(subscribeKey: String): PubnubConfig = {
    val __obj = js.Dynamic.literal(subscribeKey = subscribeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubnubConfig]
  }
  
  extension [Self <: PubnubConfig](x: Self) {
    
    inline def setAuthKey(value: String): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
    
    inline def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
    
    inline def setAutoNetworkDetection(value: Boolean): Self = StObject.set(x, "autoNetworkDetection", value.asInstanceOf[js.Any])
    
    inline def setAutoNetworkDetectionUndefined: Self = StObject.set(x, "autoNetworkDetection", js.undefined)
    
    inline def setCipherKey(value: String): Self = StObject.set(x, "cipherKey", value.asInstanceOf[js.Any])
    
    inline def setCipherKeyUndefined: Self = StObject.set(x, "cipherKey", js.undefined)
    
    inline def setHeartbeatInterval(value: Double): Self = StObject.set(x, "heartbeatInterval", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatIntervalUndefined: Self = StObject.set(x, "heartbeatInterval", js.undefined)
    
    inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveSettings(value: FreeSocketKeepAliveTimeout): Self = StObject.set(x, "keepAliveSettings", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveSettingsUndefined: Self = StObject.set(x, "keepAliveSettings", js.undefined)
    
    inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    inline def setListenToBrowserNetworkEvents(value: Boolean): Self = StObject.set(x, "listenToBrowserNetworkEvents", value.asInstanceOf[js.Any])
    
    inline def setListenToBrowserNetworkEventsUndefined: Self = StObject.set(x, "listenToBrowserNetworkEvents", js.undefined)
    
    inline def setLogVerbosity(value: Boolean): Self = StObject.set(x, "logVerbosity", value.asInstanceOf[js.Any])
    
    inline def setLogVerbosityUndefined: Self = StObject.set(x, "logVerbosity", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPresenceTimeout(value: Double): Self = StObject.set(x, "presenceTimeout", value.asInstanceOf[js.Any])
    
    inline def setPresenceTimeoutUndefined: Self = StObject.set(x, "presenceTimeout", js.undefined)
    
    inline def setPublishKey(value: String): Self = StObject.set(x, "publishKey", value.asInstanceOf[js.Any])
    
    inline def setPublishKeyUndefined: Self = StObject.set(x, "publishKey", js.undefined)
    
    inline def setRequestMessageCountThreshold(value: Double): Self = StObject.set(x, "requestMessageCountThreshold", value.asInstanceOf[js.Any])
    
    inline def setRequestMessageCountThresholdUndefined: Self = StObject.set(x, "requestMessageCountThreshold", js.undefined)
    
    inline def setRestore(value: Boolean): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
    
    inline def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
    
    inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    
    inline def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
    
    inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    inline def setSubscribeKey(value: String): Self = StObject.set(x, "subscribeKey", value.asInstanceOf[js.Any])
    
    inline def setSuppressLeaveEvents(value: Boolean): Self = StObject.set(x, "suppressLeaveEvents", value.asInstanceOf[js.Any])
    
    inline def setSuppressLeaveEventsUndefined: Self = StObject.set(x, "suppressLeaveEvents", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
