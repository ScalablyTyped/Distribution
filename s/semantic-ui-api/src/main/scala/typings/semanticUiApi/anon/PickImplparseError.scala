package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'parseError'> */
trait PickImplparseError extends StObject {
  
  var parseError: String
}
object PickImplparseError {
  
  @scala.inline
  def apply(parseError: String): PickImplparseError = {
    val __obj = js.Dynamic.literal(parseError = parseError.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplparseError]
  }
  
  @scala.inline
  implicit class PickImplparseErrorMutableBuilder[Self <: PickImplparseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParseError(value: String): Self = StObject.set(x, "parseError", value.asInstanceOf[js.Any])
  }
}
