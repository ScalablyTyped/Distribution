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
  
  @scala.inline
  def apply(subscribeKey: String): PubnubConfig = {
    val __obj = js.Dynamic.literal(subscribeKey = subscribeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubnubConfig]
  }
  
  @scala.inline
  implicit class PubnubConfigMutableBuilder[Self <: PubnubConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthKey(value: String): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
    
    @scala.inline
    def setAutoNetworkDetection(value: Boolean): Self = StObject.set(x, "autoNetworkDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoNetworkDetectionUndefined: Self = StObject.set(x, "autoNetworkDetection", js.undefined)
    
    @scala.inline
    def setCipherKey(value: String): Self = StObject.set(x, "cipherKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherKeyUndefined: Self = StObject.set(x, "cipherKey", js.undefined)
    
    @scala.inline
    def setHeartbeatInterval(value: Double): Self = StObject.set(x, "heartbeatInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeatIntervalUndefined: Self = StObject.set(x, "heartbeatInterval", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveSettings(value: FreeSocketKeepAliveTimeout): Self = StObject.set(x, "keepAliveSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveSettingsUndefined: Self = StObject.set(x, "keepAliveSettings", js.undefined)
    
    @scala.inline
    def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    @scala.inline
    def setListenToBrowserNetworkEvents(value: Boolean): Self = StObject.set(x, "listenToBrowserNetworkEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenToBrowserNetworkEventsUndefined: Self = StObject.set(x, "listenToBrowserNetworkEvents", js.undefined)
    
    @scala.inline
    def setLogVerbosity(value: Boolean): Self = StObject.set(x, "logVerbosity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogVerbosityUndefined: Self = StObject.set(x, "logVerbosity", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setPresenceTimeout(value: Double): Self = StObject.set(x, "presenceTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresenceTimeoutUndefined: Self = StObject.set(x, "presenceTimeout", js.undefined)
    
    @scala.inline
    def setPublishKey(value: String): Self = StObject.set(x, "publishKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishKeyUndefined: Self = StObject.set(x, "publishKey", js.undefined)
    
    @scala.inline
    def setRequestMessageCountThreshold(value: Double): Self = StObject.set(x, "requestMessageCountThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMessageCountThresholdUndefined: Self = StObject.set(x, "requestMessageCountThreshold", js.undefined)
    
    @scala.inline
    def setRestore(value: Boolean): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
    
    @scala.inline
    def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    @scala.inline
    def setSubscribeKey(value: String): Self = StObject.set(x, "subscribeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressLeaveEvents(value: Boolean): Self = StObject.set(x, "suppressLeaveEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressLeaveEventsUndefined: Self = StObject.set(x, "suppressLeaveEvents", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
