package typings.pubnub.mod

import typings.pubnub.anon.FreeSocketKeepAliveTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubnubConfig extends js.Object {
  
  var authKey: js.UndefOr[String] = js.native
  
  var autoNetworkDetection: js.UndefOr[Boolean] = js.native
  
  var cipherKey: js.UndefOr[String] = js.native
  
  var heartbeatInterval: js.UndefOr[Double] = js.native
  
  var keepAlive: js.UndefOr[Boolean] = js.native
  
  var keepAliveSettings: js.UndefOr[FreeSocketKeepAliveTimeout] = js.native
  
  var listenToBrowserNetworkEvents: js.UndefOr[Boolean] = js.native
  
  var logVerbosity: js.UndefOr[Boolean] = js.native
  
  var origin: js.UndefOr[String] = js.native
  
  var presenceTimeout: js.UndefOr[Double] = js.native
  
  var publishKey: js.UndefOr[String] = js.native
  
  var requestMessageCountThreshold: js.UndefOr[Double] = js.native
  
  var restore: js.UndefOr[Boolean] = js.native
  
  var secretKey: js.UndefOr[String] = js.native
  
  var ssl: js.UndefOr[Boolean] = js.native
  
  var subscribeKey: String = js.native
  
  var suppressLeaveEvents: js.UndefOr[Boolean] = js.native
  
  var uuid: js.UndefOr[String] = js.native
}
object PubnubConfig {
  
  @scala.inline
  def apply(subscribeKey: String): PubnubConfig = {
    val __obj = js.Dynamic.literal(subscribeKey = subscribeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubnubConfig]
  }
  
  @scala.inline
  implicit class PubnubConfigOps[Self <: PubnubConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSubscribeKey(value: String): Self = this.set("subscribeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthKey(value: String): Self = this.set("authKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthKey: Self = this.set("authKey", js.undefined)
    
    @scala.inline
    def setAutoNetworkDetection(value: Boolean): Self = this.set("autoNetworkDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoNetworkDetection: Self = this.set("autoNetworkDetection", js.undefined)
    
    @scala.inline
    def setCipherKey(value: String): Self = this.set("cipherKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCipherKey: Self = this.set("cipherKey", js.undefined)
    
    @scala.inline
    def setHeartbeatInterval(value: Double): Self = this.set("heartbeatInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeatInterval: Self = this.set("heartbeatInterval", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: Boolean): Self = this.set("keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAlive: Self = this.set("keepAlive", js.undefined)
    
    @scala.inline
    def setKeepAliveSettings(value: FreeSocketKeepAliveTimeout): Self = this.set("keepAliveSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAliveSettings: Self = this.set("keepAliveSettings", js.undefined)
    
    @scala.inline
    def setListenToBrowserNetworkEvents(value: Boolean): Self = this.set("listenToBrowserNetworkEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListenToBrowserNetworkEvents: Self = this.set("listenToBrowserNetworkEvents", js.undefined)
    
    @scala.inline
    def setLogVerbosity(value: Boolean): Self = this.set("logVerbosity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogVerbosity: Self = this.set("logVerbosity", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setPresenceTimeout(value: Double): Self = this.set("presenceTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresenceTimeout: Self = this.set("presenceTimeout", js.undefined)
    
    @scala.inline
    def setPublishKey(value: String): Self = this.set("publishKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishKey: Self = this.set("publishKey", js.undefined)
    
    @scala.inline
    def setRequestMessageCountThreshold(value: Double): Self = this.set("requestMessageCountThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestMessageCountThreshold: Self = this.set("requestMessageCountThreshold", js.undefined)
    
    @scala.inline
    def setRestore(value: Boolean): Self = this.set("restore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestore: Self = this.set("restore", js.undefined)
    
    @scala.inline
    def setSecretKey(value: String): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretKey: Self = this.set("secretKey", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setSuppressLeaveEvents(value: Boolean): Self = this.set("suppressLeaveEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressLeaveEvents: Self = this.set("suppressLeaveEvents", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
