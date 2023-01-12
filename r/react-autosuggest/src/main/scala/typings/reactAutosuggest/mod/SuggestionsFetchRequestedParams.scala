package typings.reactAutosuggest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestionsFetchRequestedParams extends StObject {
  
  var reason: FetchRequestedReasons
  
  var value: String
}
object SuggestionsFetchRequestedParams {
  
  inline def apply(reason: FetchRequestedReasons, value: String): SuggestionsFetchRequestedParams = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionsFetchRequestedParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuggestionsFetchRequestedParams] (val x: Self) extends AnyVal {
    
    inline def setReason(value: FetchRequestedReasons): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
