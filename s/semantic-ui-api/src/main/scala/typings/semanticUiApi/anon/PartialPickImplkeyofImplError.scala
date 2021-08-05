package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.ClassNameSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplError extends StObject {
  
  var error: js.UndefOr[String] = js.undefined
  
  var loading: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplError {
  
  inline def apply(): PartialPickImplkeyofImplError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplError]
  }
  
  extension [Self <: PartialPickImplkeyofImplError](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
  }
}
