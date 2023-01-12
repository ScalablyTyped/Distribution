package typings.raml1Parser.distParserHighLevelASTMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RamlParserError extends StObject {
  
  /**
    * Error identifier
    */
  var code: String
  
  /**
    * Whether the message is warning or not
    */
  var isWarning: Boolean
  
  /**
    * Messag text
    */
  var message: String
  
  /**
    * File path
    */
  var path: String
  
  /**
    * RangeObject describing start and end of error location
    */
  var range: RangeObject
  
  var trace: js.UndefOr[js.Array[RamlParserError]] = js.undefined
}
object RamlParserError {
  
  inline def apply(code: String, isWarning: Boolean, message: String, path: String, range: RangeObject): RamlParserError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], isWarning = isWarning.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[RamlParserError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RamlParserError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setIsWarning(value: Boolean): Self = StObject.set(x, "isWarning", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRange(value: RangeObject): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setTrace(value: js.Array[RamlParserError]): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    inline def setTraceVarargs(value: RamlParserError*): Self = StObject.set(x, "trace", js.Array(value*))
  }
}
