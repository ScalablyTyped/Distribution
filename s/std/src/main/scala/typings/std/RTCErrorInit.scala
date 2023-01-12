package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCErrorInit extends StObject {
  
  /* standard dom */
  var errorDetail: RTCErrorDetailType
  
  /* standard dom */
  var httpRequestStatusCode: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var receivedAlert: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var sctpCauseCode: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var sdpLineNumber: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var sentAlert: js.UndefOr[Double] = js.undefined
}
object RTCErrorInit {
  
  inline def apply(errorDetail: RTCErrorDetailType): RTCErrorInit = {
    val __obj = js.Dynamic.literal(errorDetail = errorDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCErrorInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCErrorInit] (val x: Self) extends AnyVal {
    
    inline def setErrorDetail(value: RTCErrorDetailType): Self = StObject.set(x, "errorDetail", value.asInstanceOf[js.Any])
    
    inline def setHttpRequestStatusCode(value: Double): Self = StObject.set(x, "httpRequestStatusCode", value.asInstanceOf[js.Any])
    
    inline def setHttpRequestStatusCodeUndefined: Self = StObject.set(x, "httpRequestStatusCode", js.undefined)
    
    inline def setReceivedAlert(value: Double): Self = StObject.set(x, "receivedAlert", value.asInstanceOf[js.Any])
    
    inline def setReceivedAlertUndefined: Self = StObject.set(x, "receivedAlert", js.undefined)
    
    inline def setSctpCauseCode(value: Double): Self = StObject.set(x, "sctpCauseCode", value.asInstanceOf[js.Any])
    
    inline def setSctpCauseCodeUndefined: Self = StObject.set(x, "sctpCauseCode", js.undefined)
    
    inline def setSdpLineNumber(value: Double): Self = StObject.set(x, "sdpLineNumber", value.asInstanceOf[js.Any])
    
    inline def setSdpLineNumberUndefined: Self = StObject.set(x, "sdpLineNumber", js.undefined)
    
    inline def setSentAlert(value: Double): Self = StObject.set(x, "sentAlert", value.asInstanceOf[js.Any])
    
    inline def setSentAlertUndefined: Self = StObject.set(x, "sentAlert", js.undefined)
  }
}
