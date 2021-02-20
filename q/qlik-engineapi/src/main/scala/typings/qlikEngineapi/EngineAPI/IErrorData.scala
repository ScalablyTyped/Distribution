package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ErrorData...
  */
@js.native
trait IErrorData extends StObject {
  
  /**
    * Type of the error messages.
    */
  var qErrorDataCode: ErrorDataCodeType = js.native
  
  /**
    * Detailed information about the error message.
    */
  var qErrorString: String = js.native
  
  /**
    * Script statement where the error occurs.
    */
  var qLine: String = js.native
  
  /**
    * Line termination characters.
    */
  var qLineEnd: String = js.native
}
object IErrorData {
  
  @scala.inline
  def apply(qErrorDataCode: ErrorDataCodeType, qErrorString: String, qLine: String, qLineEnd: String): IErrorData = {
    val __obj = js.Dynamic.literal(qErrorDataCode = qErrorDataCode.asInstanceOf[js.Any], qErrorString = qErrorString.asInstanceOf[js.Any], qLine = qLine.asInstanceOf[js.Any], qLineEnd = qLineEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorData]
  }
  
  @scala.inline
  implicit class IErrorDataMutableBuilder[Self <: IErrorData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQErrorDataCode(value: ErrorDataCodeType): Self = StObject.set(x, "qErrorDataCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQErrorString(value: String): Self = StObject.set(x, "qErrorString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLine(value: String): Self = StObject.set(x, "qLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLineEnd(value: String): Self = StObject.set(x, "qLineEnd", value.asInstanceOf[js.Any])
  }
}
