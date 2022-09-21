package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCConfiguration extends StObject {
  
  /* standard dom */
  var bundlePolicy: js.UndefOr[RTCBundlePolicy] = js.undefined
  
  /* standard dom */
  var certificates: js.UndefOr[js.Array[RTCCertificate]] = js.undefined
  
  /* standard dom */
  var iceCandidatePoolSize: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.undefined
  
  /* standard dom */
  var iceTransportPolicy: js.UndefOr[RTCIceTransportPolicy] = js.undefined
  
  /* standard dom */
  var rtcpMuxPolicy: js.UndefOr[RTCRtcpMuxPolicy] = js.undefined
}
object RTCConfiguration {
  
  inline def apply(): RTCConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCConfiguration]
  }
  
  extension [Self <: RTCConfiguration](x: Self) {
    
    inline def setBundlePolicy(value: RTCBundlePolicy): Self = StObject.set(x, "bundlePolicy", value.asInstanceOf[js.Any])
    
    inline def setBundlePolicyUndefined: Self = StObject.set(x, "bundlePolicy", js.undefined)
    
    inline def setCertificates(value: js.Array[RTCCertificate]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: RTCCertificate*): Self = StObject.set(x, "certificates", js.Array(value*))
    
    inline def setIceCandidatePoolSize(value: Double): Self = StObject.set(x, "iceCandidatePoolSize", value.asInstanceOf[js.Any])
    
    inline def setIceCandidatePoolSizeUndefined: Self = StObject.set(x, "iceCandidatePoolSize", js.undefined)
    
    inline def setIceServers(value: js.Array[RTCIceServer]): Self = StObject.set(x, "iceServers", value.asInstanceOf[js.Any])
    
    inline def setIceServersUndefined: Self = StObject.set(x, "iceServers", js.undefined)
    
    inline def setIceServersVarargs(value: RTCIceServer*): Self = StObject.set(x, "iceServers", js.Array(value*))
    
    inline def setIceTransportPolicy(value: RTCIceTransportPolicy): Self = StObject.set(x, "iceTransportPolicy", value.asInstanceOf[js.Any])
    
    inline def setIceTransportPolicyUndefined: Self = StObject.set(x, "iceTransportPolicy", js.undefined)
    
    inline def setRtcpMuxPolicy(value: RTCRtcpMuxPolicy): Self = StObject.set(x, "rtcpMuxPolicy", value.asInstanceOf[js.Any])
    
    inline def setRtcpMuxPolicyUndefined: Self = StObject.set(x, "rtcpMuxPolicy", js.undefined)
  }
}
