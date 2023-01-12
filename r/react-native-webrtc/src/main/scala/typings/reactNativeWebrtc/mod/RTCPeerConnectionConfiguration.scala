package typings.reactNativeWebrtc.mod

import typings.reactNativeWebrtc.reactNativeWebrtcStrings.`max-bundle`
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.`max-compat`
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.all
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.balanced
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.negotiate
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.nohost
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.none
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.relay
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.require
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCPeerConnectionConfiguration extends StObject {
  
  var bundlePolicy: js.UndefOr[balanced | `max-compat` | `max-bundle`] = js.undefined
  
  var iceCandidatePoolSize: js.UndefOr[Double] = js.undefined
  
  var iceServers: js.Array[ConfigurationParamWithUrl | ConfigurationParamWithUrls]
  
  var iceTransportPolicy: js.UndefOr[all | relay | nohost | none] = js.undefined
  
  var rtcpMuxPolicy: js.UndefOr[negotiate | require] = js.undefined
}
object RTCPeerConnectionConfiguration {
  
  inline def apply(iceServers: js.Array[ConfigurationParamWithUrl | ConfigurationParamWithUrls]): RTCPeerConnectionConfiguration = {
    val __obj = js.Dynamic.literal(iceServers = iceServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCPeerConnectionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBundlePolicy(value: balanced | `max-compat` | `max-bundle`): Self = StObject.set(x, "bundlePolicy", value.asInstanceOf[js.Any])
    
    inline def setBundlePolicyUndefined: Self = StObject.set(x, "bundlePolicy", js.undefined)
    
    inline def setIceCandidatePoolSize(value: Double): Self = StObject.set(x, "iceCandidatePoolSize", value.asInstanceOf[js.Any])
    
    inline def setIceCandidatePoolSizeUndefined: Self = StObject.set(x, "iceCandidatePoolSize", js.undefined)
    
    inline def setIceServers(value: js.Array[ConfigurationParamWithUrl | ConfigurationParamWithUrls]): Self = StObject.set(x, "iceServers", value.asInstanceOf[js.Any])
    
    inline def setIceServersVarargs(value: (ConfigurationParamWithUrl | ConfigurationParamWithUrls)*): Self = StObject.set(x, "iceServers", js.Array(value*))
    
    inline def setIceTransportPolicy(value: all | relay | nohost | none): Self = StObject.set(x, "iceTransportPolicy", value.asInstanceOf[js.Any])
    
    inline def setIceTransportPolicyUndefined: Self = StObject.set(x, "iceTransportPolicy", js.undefined)
    
    inline def setRtcpMuxPolicy(value: negotiate | require): Self = StObject.set(x, "rtcpMuxPolicy", value.asInstanceOf[js.Any])
    
    inline def setRtcpMuxPolicyUndefined: Self = StObject.set(x, "rtcpMuxPolicy", js.undefined)
  }
}
