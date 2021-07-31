package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl, 'serverError'> */
trait PickImplserverError extends StObject {
  
  var serverError: String
}
object PickImplserverError {
  
  @scala.inline
  def apply(serverError: String): PickImplserverError = {
    val __obj = js.Dynamic.literal(serverError = serverError.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplserverError]
  }
  
  @scala.inline
  implicit class PickImplserverErrorMutableBuilder[Self <: PickImplserverError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerError(value: String): Self = StObject.set(x, "serverError", value.asInstanceOf[js.Any])
  }
}
