package typings.reactNativeWebrtc.mod

import typings.reactNativeWebrtc.reactNativeWebrtcStrings.all
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.public
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.relay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCPeerConnectionConfiguration extends StObject {
  
  var iceServers: js.Array[ConfigurationParamWithUrl | ConfigurationParamWithUrls]
  
  var iceTransportPolicy: js.UndefOr[all | public | relay] = js.undefined
}
object RTCPeerConnectionConfiguration {
  
  @scala.inline
  def apply(iceServers: js.Array[ConfigurationParamWithUrl | ConfigurationParamWithUrls]): RTCPeerConnectionConfiguration = {
    val __obj = js.Dynamic.literal(iceServers = iceServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionConfiguration]
  }
  
  @scala.inline
  implicit class RTCPeerConnectionConfigurationMutableBuilder[Self <: RTCPeerConnectionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIceServers(value: js.Array[ConfigurationParamWithUrl | ConfigurationParamWithUrls]): Self = StObject.set(x, "iceServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceServersVarargs(value: (ConfigurationParamWithUrl | ConfigurationParamWithUrls)*): Self = StObject.set(x, "iceServers", js.Array(value :_*))
    
    @scala.inline
    def setIceTransportPolicy(value: all | public | relay): Self = StObject.set(x, "iceTransportPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceTransportPolicyUndefined: Self = StObject.set(x, "iceTransportPolicy", js.undefined)
  }
}
