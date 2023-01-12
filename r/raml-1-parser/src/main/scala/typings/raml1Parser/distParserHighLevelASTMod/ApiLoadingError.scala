package typings.raml1Parser.distParserHighLevelASTMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiLoadingError
  extends StObject
     with Error {
  
  var parserErrors: js.Array[RamlParserError]
}
object ApiLoadingError {
  
  inline def apply(message: String, name: String, parserErrors: js.Array[RamlParserError]): ApiLoadingError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parserErrors = parserErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiLoadingError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiLoadingError] (val x: Self) extends AnyVal {
    
    inline def setParserErrors(value: js.Array[RamlParserError]): Self = StObject.set(x, "parserErrors", value.asInstanceOf[js.Any])
    
    inline def setParserErrorsVarargs(value: RamlParserError*): Self = StObject.set(x, "parserErrors", js.Array(value*))
  }
}
