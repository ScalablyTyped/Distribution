package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxLayoutErrors...
  */
trait INxLayoutErrors extends StObject {
  
  /**
    * Error code  <Integer>
    */
  var ErrorCode: Double
}
object INxLayoutErrors {
  
  inline def apply(ErrorCode: Double): INxLayoutErrors = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxLayoutErrors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INxLayoutErrors] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
  }
}
