package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An abnormal event (called an exception) which occurs as a result of calling a method or accessing a property of a web API. */
trait DOMException
  extends StObject
     with Error {
  
  /* standard dom */
  val ABORT_ERR: Double
  
  /* standard dom */
  val DATA_CLONE_ERR: Double
  
  /* standard dom */
  val DOMSTRING_SIZE_ERR: Double
  
  /* standard dom */
  val HIERARCHY_REQUEST_ERR: Double
  
  /* standard dom */
  val INDEX_SIZE_ERR: Double
  
  /* standard dom */
  val INUSE_ATTRIBUTE_ERR: Double
  
  /* standard dom */
  val INVALID_ACCESS_ERR: Double
  
  /* standard dom */
  val INVALID_CHARACTER_ERR: Double
  
  /* standard dom */
  val INVALID_MODIFICATION_ERR: Double
  
  /* standard dom */
  val INVALID_NODE_TYPE_ERR: Double
  
  /* standard dom */
  val INVALID_STATE_ERR: Double
  
  /* standard dom */
  val NAMESPACE_ERR: Double
  
  /* standard dom */
  val NETWORK_ERR: Double
  
  /* standard dom */
  val NOT_FOUND_ERR: Double
  
  /* standard dom */
  val NOT_SUPPORTED_ERR: Double
  
  /* standard dom */
  val NO_DATA_ALLOWED_ERR: Double
  
  /* standard dom */
  val NO_MODIFICATION_ALLOWED_ERR: Double
  
  /* standard dom */
  val QUOTA_EXCEEDED_ERR: Double
  
  /* standard dom */
  val SECURITY_ERR: Double
  
  /* standard dom */
  val SYNTAX_ERR: Double
  
  /* standard dom */
  val TIMEOUT_ERR: Double
  
  /* standard dom */
  val TYPE_MISMATCH_ERR: Double
  
  /* standard dom */
  val URL_MISMATCH_ERR: Double
  
  /* standard dom */
  val VALIDATION_ERR: Double
  
  /* standard dom */
  val WRONG_DOCUMENT_ERR: Double
  
  /** @deprecated */
  /* standard dom */
  val code: Double
}
object DOMException {
  
  inline def apply(
    ABORT_ERR: Double,
    DATA_CLONE_ERR: Double,
    DOMSTRING_SIZE_ERR: Double,
    HIERARCHY_REQUEST_ERR: Double,
    INDEX_SIZE_ERR: Double,
    INUSE_ATTRIBUTE_ERR: Double,
    INVALID_ACCESS_ERR: Double,
    INVALID_CHARACTER_ERR: Double,
    INVALID_MODIFICATION_ERR: Double,
    INVALID_NODE_TYPE_ERR: Double,
    INVALID_STATE_ERR: Double,
    NAMESPACE_ERR: Double,
    NETWORK_ERR: Double,
    NOT_FOUND_ERR: Double,
    NOT_SUPPORTED_ERR: Double,
    NO_DATA_ALLOWED_ERR: Double,
    NO_MODIFICATION_ALLOWED_ERR: Double,
    QUOTA_EXCEEDED_ERR: Double,
    SECURITY_ERR: Double,
    SYNTAX_ERR: Double,
    TIMEOUT_ERR: Double,
    TYPE_MISMATCH_ERR: Double,
    URL_MISMATCH_ERR: Double,
    VALIDATION_ERR: Double,
    WRONG_DOCUMENT_ERR: Double,
    code: Double,
    message: java.lang.String,
    name: java.lang.String
  ): DOMException = {
    val __obj = js.Dynamic.literal(ABORT_ERR = ABORT_ERR.asInstanceOf[js.Any], DATA_CLONE_ERR = DATA_CLONE_ERR.asInstanceOf[js.Any], DOMSTRING_SIZE_ERR = DOMSTRING_SIZE_ERR.asInstanceOf[js.Any], HIERARCHY_REQUEST_ERR = HIERARCHY_REQUEST_ERR.asInstanceOf[js.Any], INDEX_SIZE_ERR = INDEX_SIZE_ERR.asInstanceOf[js.Any], INUSE_ATTRIBUTE_ERR = INUSE_ATTRIBUTE_ERR.asInstanceOf[js.Any], INVALID_ACCESS_ERR = INVALID_ACCESS_ERR.asInstanceOf[js.Any], INVALID_CHARACTER_ERR = INVALID_CHARACTER_ERR.asInstanceOf[js.Any], INVALID_MODIFICATION_ERR = INVALID_MODIFICATION_ERR.asInstanceOf[js.Any], INVALID_NODE_TYPE_ERR = INVALID_NODE_TYPE_ERR.asInstanceOf[js.Any], INVALID_STATE_ERR = INVALID_STATE_ERR.asInstanceOf[js.Any], NAMESPACE_ERR = NAMESPACE_ERR.asInstanceOf[js.Any], NETWORK_ERR = NETWORK_ERR.asInstanceOf[js.Any], NOT_FOUND_ERR = NOT_FOUND_ERR.asInstanceOf[js.Any], NOT_SUPPORTED_ERR = NOT_SUPPORTED_ERR.asInstanceOf[js.Any], NO_DATA_ALLOWED_ERR = NO_DATA_ALLOWED_ERR.asInstanceOf[js.Any], NO_MODIFICATION_ALLOWED_ERR = NO_MODIFICATION_ALLOWED_ERR.asInstanceOf[js.Any], QUOTA_EXCEEDED_ERR = QUOTA_EXCEEDED_ERR.asInstanceOf[js.Any], SECURITY_ERR = SECURITY_ERR.asInstanceOf[js.Any], SYNTAX_ERR = SYNTAX_ERR.asInstanceOf[js.Any], TIMEOUT_ERR = TIMEOUT_ERR.asInstanceOf[js.Any], TYPE_MISMATCH_ERR = TYPE_MISMATCH_ERR.asInstanceOf[js.Any], URL_MISMATCH_ERR = URL_MISMATCH_ERR.asInstanceOf[js.Any], VALIDATION_ERR = VALIDATION_ERR.asInstanceOf[js.Any], WRONG_DOCUMENT_ERR = WRONG_DOCUMENT_ERR.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMException]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMException] (val x: Self) extends AnyVal {
    
    inline def setABORT_ERR(value: Double): Self = StObject.set(x, "ABORT_ERR", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDATA_CLONE_ERR(value: Double): Self = StObject.set(x, "DATA_CLONE_ERR", value.asInstanceOf[js.Any])
    
    inline def setDOMSTRING_SIZE_ERR(value: Double): Self = StObject.set(x, "DOMSTRING_SIZE_ERR", value.asInstanceOf[js.Any])
    
    inline def setHIERARCHY_REQUEST_ERR(value: Double): Self = StObject.set(x, "HIERARCHY_REQUEST_ERR", value.asInstanceOf[js.Any])
    
    inline def setINDEX_SIZE_ERR(value: Double): Self = StObject.set(x, "INDEX_SIZE_ERR", value.asInstanceOf[js.Any])
    
    inline def setINUSE_ATTRIBUTE_ERR(value: Double): Self = StObject.set(x, "INUSE_ATTRIBUTE_ERR", value.asInstanceOf[js.Any])
    
    inline def setINVALID_ACCESS_ERR(value: Double): Self = StObject.set(x, "INVALID_ACCESS_ERR", value.asInstanceOf[js.Any])
    
    inline def setINVALID_CHARACTER_ERR(value: Double): Self = StObject.set(x, "INVALID_CHARACTER_ERR", value.asInstanceOf[js.Any])
    
    inline def setINVALID_MODIFICATION_ERR(value: Double): Self = StObject.set(x, "INVALID_MODIFICATION_ERR", value.asInstanceOf[js.Any])
    
    inline def setINVALID_NODE_TYPE_ERR(value: Double): Self = StObject.set(x, "INVALID_NODE_TYPE_ERR", value.asInstanceOf[js.Any])
    
    inline def setINVALID_STATE_ERR(value: Double): Self = StObject.set(x, "INVALID_STATE_ERR", value.asInstanceOf[js.Any])
    
    inline def setNAMESPACE_ERR(value: Double): Self = StObject.set(x, "NAMESPACE_ERR", value.asInstanceOf[js.Any])
    
    inline def setNETWORK_ERR(value: Double): Self = StObject.set(x, "NETWORK_ERR", value.asInstanceOf[js.Any])
    
    inline def setNOT_FOUND_ERR(value: Double): Self = StObject.set(x, "NOT_FOUND_ERR", value.asInstanceOf[js.Any])
    
    inline def setNOT_SUPPORTED_ERR(value: Double): Self = StObject.set(x, "NOT_SUPPORTED_ERR", value.asInstanceOf[js.Any])
    
    inline def setNO_DATA_ALLOWED_ERR(value: Double): Self = StObject.set(x, "NO_DATA_ALLOWED_ERR", value.asInstanceOf[js.Any])
    
    inline def setNO_MODIFICATION_ALLOWED_ERR(value: Double): Self = StObject.set(x, "NO_MODIFICATION_ALLOWED_ERR", value.asInstanceOf[js.Any])
    
    inline def setQUOTA_EXCEEDED_ERR(value: Double): Self = StObject.set(x, "QUOTA_EXCEEDED_ERR", value.asInstanceOf[js.Any])
    
    inline def setSECURITY_ERR(value: Double): Self = StObject.set(x, "SECURITY_ERR", value.asInstanceOf[js.Any])
    
    inline def setSYNTAX_ERR(value: Double): Self = StObject.set(x, "SYNTAX_ERR", value.asInstanceOf[js.Any])
    
    inline def setTIMEOUT_ERR(value: Double): Self = StObject.set(x, "TIMEOUT_ERR", value.asInstanceOf[js.Any])
    
    inline def setTYPE_MISMATCH_ERR(value: Double): Self = StObject.set(x, "TYPE_MISMATCH_ERR", value.asInstanceOf[js.Any])
    
    inline def setURL_MISMATCH_ERR(value: Double): Self = StObject.set(x, "URL_MISMATCH_ERR", value.asInstanceOf[js.Any])
    
    inline def setVALIDATION_ERR(value: Double): Self = StObject.set(x, "VALIDATION_ERR", value.asInstanceOf[js.Any])
    
    inline def setWRONG_DOCUMENT_ERR(value: Double): Self = StObject.set(x, "WRONG_DOCUMENT_ERR", value.asInstanceOf[js.Any])
  }
}
