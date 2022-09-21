package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchSuggestionResult...
  */
trait ISearchSuggestionResult extends StObject {
  
  /**
    * List of field names that contain search hits.
    */
  var qFieldNames: js.Array[String]
  
  /**
    * List of suggestions.
    */
  var qSuggestions: js.Array[ISearchSuggestItem]
}
object ISearchSuggestionResult {
  
  inline def apply(qFieldNames: js.Array[String], qSuggestions: js.Array[ISearchSuggestItem]): ISearchSuggestionResult = {
    val __obj = js.Dynamic.literal(qFieldNames = qFieldNames.asInstanceOf[js.Any], qSuggestions = qSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchSuggestionResult]
  }
  
  extension [Self <: ISearchSuggestionResult](x: Self) {
    
    inline def setQFieldNames(value: js.Array[String]): Self = StObject.set(x, "qFieldNames", value.asInstanceOf[js.Any])
    
    inline def setQFieldNamesVarargs(value: String*): Self = StObject.set(x, "qFieldNames", js.Array(value*))
    
    inline def setQSuggestions(value: js.Array[ISearchSuggestItem]): Self = StObject.set(x, "qSuggestions", value.asInstanceOf[js.Any])
    
    inline def setQSuggestionsVarargs(value: ISearchSuggestItem*): Self = StObject.set(x, "qSuggestions", js.Array(value*))
  }
}
