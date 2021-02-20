package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCPeerConnectionIceErrorEventInit extends EventInit {
  
  var errorCode: Double = js.native
  
  var hostCandidate: js.UndefOr[java.lang.String] = js.native
  
  var statusText: js.UndefOr[java.lang.String] = js.native
  
  var url: js.UndefOr[java.lang.String] = js.native
}
object RTCPeerConnectionIceErrorEventInit {
  
  @scala.inline
  def apply(errorCode: Double): RTCPeerConnectionIceErrorEventInit = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionIceErrorEventInit]
  }
  
  @scala.inline
  implicit class RTCPeerConnectionIceErrorEventInitMutableBuilder[Self <: RTCPeerConnectionIceErrorEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostCandidate(value: java.lang.String): Self = StObject.set(x, "hostCandidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostCandidateUndefined: Self = StObject.set(x, "hostCandidate", js.undefined)
    
    @scala.inline
    def setStatusText(value: java.lang.String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
