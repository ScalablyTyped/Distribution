package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCErrorInit extends StObject {
  
  var errorDetail: RTCErrorDetailType = js.native
  
  var httpRequestStatusCode: js.UndefOr[Double] = js.native
  
  var receivedAlert: js.UndefOr[Double] = js.native
  
  var sctpCauseCode: js.UndefOr[Double] = js.native
  
  var sdpLineNumber: js.UndefOr[Double] = js.native
  
  var sentAlert: js.UndefOr[Double] = js.native
}
object RTCErrorInit {
  
  @scala.inline
  def apply(errorDetail: RTCErrorDetailType): RTCErrorInit = {
    val __obj = js.Dynamic.literal(errorDetail = errorDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCErrorInit]
  }
  
  @scala.inline
  implicit class RTCErrorInitMutableBuilder[Self <: RTCErrorInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetail(value: RTCErrorDetailType): Self = StObject.set(x, "errorDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRequestStatusCode(value: Double): Self = StObject.set(x, "httpRequestStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRequestStatusCodeUndefined: Self = StObject.set(x, "httpRequestStatusCode", js.undefined)
    
    @scala.inline
    def setReceivedAlert(value: Double): Self = StObject.set(x, "receivedAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedAlertUndefined: Self = StObject.set(x, "receivedAlert", js.undefined)
    
    @scala.inline
    def setSctpCauseCode(value: Double): Self = StObject.set(x, "sctpCauseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSctpCauseCodeUndefined: Self = StObject.set(x, "sctpCauseCode", js.undefined)
    
    @scala.inline
    def setSdpLineNumber(value: Double): Self = StObject.set(x, "sdpLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdpLineNumberUndefined: Self = StObject.set(x, "sdpLineNumber", js.undefined)
    
    @scala.inline
    def setSentAlert(value: Double): Self = StObject.set(x, "sentAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentAlertUndefined: Self = StObject.set(x, "sentAlert", js.undefined)
  }
}
