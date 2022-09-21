package typings.redisSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Suggestions extends StObject {
  
  var suggestions: js.Array[Score]
  
  var term: String
}
object Suggestions {
  
  inline def apply(suggestions: js.Array[Score], term: String): Suggestions = {
    val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggestions]
  }
  
  extension [Self <: Suggestions](x: Self) {
    
    inline def setSuggestions(value: js.Array[Score]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsVarargs(value: Score*): Self = StObject.set(x, "suggestions", js.Array(value*))
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
  }
}
