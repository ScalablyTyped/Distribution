package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.reactInstantsearchCoreStrings.full
import typings.reactInstantsearchCore.reactInstantsearchCoreStrings.none
import typings.reactInstantsearchCore.reactInstantsearchCoreStrings.partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightResultPrimitive extends StObject {
  
  var fullyHighlighted: js.UndefOr[Boolean] = js.undefined
  
  /** full, partial or none depending on how the query terms match */
  var matchLevel: none | partial | full
  
  var matchedWords: js.Array[String]
  
  /** the value of the facet highlighted (html) */
  var value: String
}
object HighlightResultPrimitive {
  
  inline def apply(matchLevel: none | partial | full, matchedWords: js.Array[String], value: String): HighlightResultPrimitive = {
    val __obj = js.Dynamic.literal(matchLevel = matchLevel.asInstanceOf[js.Any], matchedWords = matchedWords.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightResultPrimitive]
  }
  
  extension [Self <: HighlightResultPrimitive](x: Self) {
    
    inline def setFullyHighlighted(value: Boolean): Self = StObject.set(x, "fullyHighlighted", value.asInstanceOf[js.Any])
    
    inline def setFullyHighlightedUndefined: Self = StObject.set(x, "fullyHighlighted", js.undefined)
    
    inline def setMatchLevel(value: none | partial | full): Self = StObject.set(x, "matchLevel", value.asInstanceOf[js.Any])
    
    inline def setMatchedWords(value: js.Array[String]): Self = StObject.set(x, "matchedWords", value.asInstanceOf[js.Any])
    
    inline def setMatchedWordsVarargs(value: String*): Self = StObject.set(x, "matchedWords", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
