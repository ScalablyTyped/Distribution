package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl>> */
trait PartialPickImplkeyofImplLogging extends StObject {
  
  var logging: js.UndefOr[String] = js.undefined
  
  var maxResults: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var noResults: js.UndefOr[String] = js.undefined
  
  var noTemplate: js.UndefOr[String] = js.undefined
  
  var serverError: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplLogging {
  
  inline def apply(): PartialPickImplkeyofImplLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplLogging]
  }
  
  extension [Self <: PartialPickImplkeyofImplLogging](x: Self) {
    
    inline def setLogging(value: String): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setMaxResults(value: String): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNoResults(value: String): Self = StObject.set(x, "noResults", value.asInstanceOf[js.Any])
    
    inline def setNoResultsUndefined: Self = StObject.set(x, "noResults", js.undefined)
    
    inline def setNoTemplate(value: String): Self = StObject.set(x, "noTemplate", value.asInstanceOf[js.Any])
    
    inline def setNoTemplateUndefined: Self = StObject.set(x, "noTemplate", js.undefined)
    
    inline def setServerError(value: String): Self = StObject.set(x, "serverError", value.asInstanceOf[js.Any])
    
    inline def setServerErrorUndefined: Self = StObject.set(x, "serverError", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
