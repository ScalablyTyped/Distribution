package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError) */
trait RTCError
  extends StObject
     with DOMException {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/errorDetail) */
  /* standard dom */
  val errorDetail: RTCErrorDetailType
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/receivedAlert) */
  /* standard dom */
  val receivedAlert: Double | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sctpCauseCode) */
  /* standard dom */
  val sctpCauseCode: Double | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sdpLineNumber) */
  /* standard dom */
  val sdpLineNumber: Double | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCError/sentAlert) */
  /* standard dom */
  val sentAlert: Double | Null
}
object RTCError {
  
  inline def apply(code: Double, errorDetail: RTCErrorDetailType, message: java.lang.String, name: java.lang.String): RTCError = {
    val __obj = js.Dynamic.literal(ABORT_ERR = 20, DATA_CLONE_ERR = 25, DOMSTRING_SIZE_ERR = 2, HIERARCHY_REQUEST_ERR = 3, INDEX_SIZE_ERR = 1, INUSE_ATTRIBUTE_ERR = 10, INVALID_ACCESS_ERR = 15, INVALID_CHARACTER_ERR = 5, INVALID_MODIFICATION_ERR = 13, INVALID_NODE_TYPE_ERR = 24, INVALID_STATE_ERR = 11, NAMESPACE_ERR = 14, NETWORK_ERR = 19, NOT_FOUND_ERR = 8, NOT_SUPPORTED_ERR = 9, NO_DATA_ALLOWED_ERR = 6, NO_MODIFICATION_ALLOWED_ERR = 7, QUOTA_EXCEEDED_ERR = 22, SECURITY_ERR = 18, SYNTAX_ERR = 12, TIMEOUT_ERR = 23, TYPE_MISMATCH_ERR = 17, URL_MISMATCH_ERR = 21, VALIDATION_ERR = 16, WRONG_DOCUMENT_ERR = 4, code = code.asInstanceOf[js.Any], errorDetail = errorDetail.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], receivedAlert = null, sctpCauseCode = null, sdpLineNumber = null, sentAlert = null)
    __obj.asInstanceOf[RTCError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCError] (val x: Self) extends AnyVal {
    
    inline def setErrorDetail(value: RTCErrorDetailType): Self = StObject.set(x, "errorDetail", value.asInstanceOf[js.Any])
    
    inline def setReceivedAlert(value: Double): Self = StObject.set(x, "receivedAlert", value.asInstanceOf[js.Any])
    
    inline def setReceivedAlertNull: Self = StObject.set(x, "receivedAlert", null)
    
    inline def setSctpCauseCode(value: Double): Self = StObject.set(x, "sctpCauseCode", value.asInstanceOf[js.Any])
    
    inline def setSctpCauseCodeNull: Self = StObject.set(x, "sctpCauseCode", null)
    
    inline def setSdpLineNumber(value: Double): Self = StObject.set(x, "sdpLineNumber", value.asInstanceOf[js.Any])
    
    inline def setSdpLineNumberNull: Self = StObject.set(x, "sdpLineNumber", null)
    
    inline def setSentAlert(value: Double): Self = StObject.set(x, "sentAlert", value.asInstanceOf[js.Any])
    
    inline def setSentAlertNull: Self = StObject.set(x, "sentAlert", null)
  }
}
