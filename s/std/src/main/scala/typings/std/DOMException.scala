package typings.std

import typings.std.stdInts.`10`
import typings.std.stdInts.`11`
import typings.std.stdInts.`12`
import typings.std.stdInts.`13`
import typings.std.stdInts.`14`
import typings.std.stdInts.`15`
import typings.std.stdInts.`16`
import typings.std.stdInts.`17`
import typings.std.stdInts.`18`
import typings.std.stdInts.`19`
import typings.std.stdInts.`1`
import typings.std.stdInts.`20`
import typings.std.stdInts.`21`
import typings.std.stdInts.`22`
import typings.std.stdInts.`23`
import typings.std.stdInts.`24`
import typings.std.stdInts.`25`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import typings.std.stdInts.`5`
import typings.std.stdInts.`6`
import typings.std.stdInts.`7`
import typings.std.stdInts.`8`
import typings.std.stdInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An abnormal event (called an exception) which occurs as a result of calling a method or accessing a property of a web API.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException)
  */
trait DOMException
  extends StObject
     with Error {
  
  /* standard dom */
  val ABORT_ERR: `20`
  
  /* standard dom */
  val DATA_CLONE_ERR: `25`
  
  /* standard dom */
  val DOMSTRING_SIZE_ERR: `2`
  
  /* standard dom */
  val HIERARCHY_REQUEST_ERR: `3`
  
  /* standard dom */
  val INDEX_SIZE_ERR: `1`
  
  /* standard dom */
  val INUSE_ATTRIBUTE_ERR: `10`
  
  /* standard dom */
  val INVALID_ACCESS_ERR: `15`
  
  /* standard dom */
  val INVALID_CHARACTER_ERR: `5`
  
  /* standard dom */
  val INVALID_MODIFICATION_ERR: `13`
  
  /* standard dom */
  val INVALID_NODE_TYPE_ERR: `24`
  
  /* standard dom */
  val INVALID_STATE_ERR: `11`
  
  /* standard dom */
  val NAMESPACE_ERR: `14`
  
  /* standard dom */
  val NETWORK_ERR: `19`
  
  /* standard dom */
  val NOT_FOUND_ERR: `8`
  
  /* standard dom */
  val NOT_SUPPORTED_ERR: `9`
  
  /* standard dom */
  val NO_DATA_ALLOWED_ERR: `6`
  
  /* standard dom */
  val NO_MODIFICATION_ALLOWED_ERR: `7`
  
  /* standard dom */
  val QUOTA_EXCEEDED_ERR: `22`
  
  /* standard dom */
  val SECURITY_ERR: `18`
  
  /* standard dom */
  val SYNTAX_ERR: `12`
  
  /* standard dom */
  val TIMEOUT_ERR: `23`
  
  /* standard dom */
  val TYPE_MISMATCH_ERR: `17`
  
  /* standard dom */
  val URL_MISMATCH_ERR: `21`
  
  /* standard dom */
  val VALIDATION_ERR: `16`
  
  /* standard dom */
  val WRONG_DOCUMENT_ERR: `4`
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException/code)
    */
  /* standard dom */
  val code: Double
}
object DOMException {
  
  inline def apply(code: Double, message: java.lang.String, name: java.lang.String): DOMException = {
    val __obj = js.Dynamic.literal(ABORT_ERR = 20, DATA_CLONE_ERR = 25, DOMSTRING_SIZE_ERR = 2, HIERARCHY_REQUEST_ERR = 3, INDEX_SIZE_ERR = 1, INUSE_ATTRIBUTE_ERR = 10, INVALID_ACCESS_ERR = 15, INVALID_CHARACTER_ERR = 5, INVALID_MODIFICATION_ERR = 13, INVALID_NODE_TYPE_ERR = 24, INVALID_STATE_ERR = 11, NAMESPACE_ERR = 14, NETWORK_ERR = 19, NOT_FOUND_ERR = 8, NOT_SUPPORTED_ERR = 9, NO_DATA_ALLOWED_ERR = 6, NO_MODIFICATION_ALLOWED_ERR = 7, QUOTA_EXCEEDED_ERR = 22, SECURITY_ERR = 18, SYNTAX_ERR = 12, TIMEOUT_ERR = 23, TYPE_MISMATCH_ERR = 17, URL_MISMATCH_ERR = 21, VALIDATION_ERR = 16, WRONG_DOCUMENT_ERR = 4, code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMException]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMException] (val x: Self) extends AnyVal {
    
    inline def setABORT_ERR(value: `20`): Self = StObject.set(x, "ABORT_ERR", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDATA_CLONE_ERR(value: `25`): Self = StObject.set(x, "DATA_CLONE_ERR", value.asInstanceOf[js.Any])
    
    inline def setDOMSTRING_SIZE_ERR(value: `2`): Self = StObject.set(x, "DOMSTRING_SIZE_ERR", value.asInstanceOf[js.Any])
    
    inline def setHIERARCHY_REQUEST_ERR(value: `3`): Self = StObject.set(x, "HIERARCHY_REQUEST_ERR", value.asInstanceOf[js.Any])
    
    inline def setINDEX_SIZE_ERR(value: `1`): Self = StObject.set(x, "INDEX_SIZE_ERR", value.asInstanceOf[js.Any])
    
    inline def setINUSE_ATTRIBUTE_ERR(value: `10`): Self = StObject.set(x, "INUSE_ATTRIBUTE_ERR", value.asInstanceOf[js.Any])
    
    inline def setINVALID_ACCESS_ERR(value: `15`): Self = StObject.set(x, "INVALID_ACCESS_ERR", value.asInstanceOf[js.Any])
    
    inline def setINVALID_CHARACTER_ERR(value: `5`): Self = StObject.set(x, "INVALID_CHARACTER_ERR", value.asInstanceOf[js.Any])
    
    inline def setINVALID_MODIFICATION_ERR(value: `13`): Self = StObject.set(x, "INVALID_MODIFICATION_ERR", value.asInstanceOf[js.Any])
    
    inline def setINVALID_NODE_TYPE_ERR(value: `24`): Self = StObject.set(x, "INVALID_NODE_TYPE_ERR", value.asInstanceOf[js.Any])
    
    inline def setINVALID_STATE_ERR(value: `11`): Self = StObject.set(x, "INVALID_STATE_ERR", value.asInstanceOf[js.Any])
    
    inline def setNAMESPACE_ERR(value: `14`): Self = StObject.set(x, "NAMESPACE_ERR", value.asInstanceOf[js.Any])
    
    inline def setNETWORK_ERR(value: `19`): Self = StObject.set(x, "NETWORK_ERR", value.asInstanceOf[js.Any])
    
    inline def setNOT_FOUND_ERR(value: `8`): Self = StObject.set(x, "NOT_FOUND_ERR", value.asInstanceOf[js.Any])
    
    inline def setNOT_SUPPORTED_ERR(value: `9`): Self = StObject.set(x, "NOT_SUPPORTED_ERR", value.asInstanceOf[js.Any])
    
    inline def setNO_DATA_ALLOWED_ERR(value: `6`): Self = StObject.set(x, "NO_DATA_ALLOWED_ERR", value.asInstanceOf[js.Any])
    
    inline def setNO_MODIFICATION_ALLOWED_ERR(value: `7`): Self = StObject.set(x, "NO_MODIFICATION_ALLOWED_ERR", value.asInstanceOf[js.Any])
    
    inline def setQUOTA_EXCEEDED_ERR(value: `22`): Self = StObject.set(x, "QUOTA_EXCEEDED_ERR", value.asInstanceOf[js.Any])
    
    inline def setSECURITY_ERR(value: `18`): Self = StObject.set(x, "SECURITY_ERR", value.asInstanceOf[js.Any])
    
    inline def setSYNTAX_ERR(value: `12`): Self = StObject.set(x, "SYNTAX_ERR", value.asInstanceOf[js.Any])
    
    inline def setTIMEOUT_ERR(value: `23`): Self = StObject.set(x, "TIMEOUT_ERR", value.asInstanceOf[js.Any])
    
    inline def setTYPE_MISMATCH_ERR(value: `17`): Self = StObject.set(x, "TYPE_MISMATCH_ERR", value.asInstanceOf[js.Any])
    
    inline def setURL_MISMATCH_ERR(value: `21`): Self = StObject.set(x, "URL_MISMATCH_ERR", value.asInstanceOf[js.Any])
    
    inline def setVALIDATION_ERR(value: `16`): Self = StObject.set(x, "VALIDATION_ERR", value.asInstanceOf[js.Any])
    
    inline def setWRONG_DOCUMENT_ERR(value: `4`): Self = StObject.set(x, "WRONG_DOCUMENT_ERR", value.asInstanceOf[js.Any])
  }
}
