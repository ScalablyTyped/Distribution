package typings.sipml.SIPml.Stack

import typings.sipml.anon.Audio
import typings.sipml.anon.Listener
import typings.sipml.anon.MaxHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  var bandwidth: js.UndefOr[Audio] = js.native
  
  var display_name: js.UndefOr[String] = js.native
  
  var enable_click2call: js.UndefOr[Boolean] = js.native
  
  var enable_early_ims: js.UndefOr[Boolean] = js.native
  
  var enable_media_stream_cache: js.UndefOr[Boolean] = js.native
  
  var enable_rtcweb_breaker: js.UndefOr[Boolean] = js.native
  
  var events_listener: js.UndefOr[Listener] = js.native
  
  var ice_servers: js.UndefOr[js.Array[js.Object]] = js.native
  
  var impi: js.UndefOr[String] = js.native
  
  var impu: js.UndefOr[String] = js.native
  
  var outbound_proxy_url: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var realm: js.UndefOr[String] = js.native
  
  var sip_headers: js.UndefOr[js.Array[js.Object]] = js.native
  
  var video_size: js.UndefOr[MaxHeight] = js.native
  
  var websocket_proxy_url: js.UndefOr[String] = js.native
}
object Configuration {
  
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
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
    def setBandwidth(value: Audio): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    
    @scala.inline
    def setDisplay_name(value: String): Self = this.set("display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay_name: Self = this.set("display_name", js.undefined)
    
    @scala.inline
    def setEnable_click2call(value: Boolean): Self = this.set("enable_click2call", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable_click2call: Self = this.set("enable_click2call", js.undefined)
    
    @scala.inline
    def setEnable_early_ims(value: Boolean): Self = this.set("enable_early_ims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable_early_ims: Self = this.set("enable_early_ims", js.undefined)
    
    @scala.inline
    def setEnable_media_stream_cache(value: Boolean): Self = this.set("enable_media_stream_cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable_media_stream_cache: Self = this.set("enable_media_stream_cache", js.undefined)
    
    @scala.inline
    def setEnable_rtcweb_breaker(value: Boolean): Self = this.set("enable_rtcweb_breaker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable_rtcweb_breaker: Self = this.set("enable_rtcweb_breaker", js.undefined)
    
    @scala.inline
    def setEvents_listener(value: Listener): Self = this.set("events_listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents_listener: Self = this.set("events_listener", js.undefined)
    
    @scala.inline
    def setIce_serversVarargs(value: js.Object*): Self = this.set("ice_servers", js.Array(value :_*))
    
    @scala.inline
    def setIce_servers(value: js.Array[js.Object]): Self = this.set("ice_servers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIce_servers: Self = this.set("ice_servers", js.undefined)
    
    @scala.inline
    def setImpi(value: String): Self = this.set("impi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpi: Self = this.set("impi", js.undefined)
    
    @scala.inline
    def setImpu(value: String): Self = this.set("impu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpu: Self = this.set("impu", js.undefined)
    
    @scala.inline
    def setOutbound_proxy_url(value: String): Self = this.set("outbound_proxy_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutbound_proxy_url: Self = this.set("outbound_proxy_url", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealm: Self = this.set("realm", js.undefined)
    
    @scala.inline
    def setSip_headersVarargs(value: js.Object*): Self = this.set("sip_headers", js.Array(value :_*))
    
    @scala.inline
    def setSip_headers(value: js.Array[js.Object]): Self = this.set("sip_headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSip_headers: Self = this.set("sip_headers", js.undefined)
    
    @scala.inline
    def setVideo_size(value: MaxHeight): Self = this.set("video_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_size: Self = this.set("video_size", js.undefined)
    
    @scala.inline
    def setWebsocket_proxy_url(value: String): Self = this.set("websocket_proxy_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsocket_proxy_url: Self = this.set("websocket_proxy_url", js.undefined)
  }
}
