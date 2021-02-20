package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.reactInstantsearchCoreStrings.full
import typings.reactInstantsearchCore.reactInstantsearchCoreStrings.none
import typings.reactInstantsearchCore.reactInstantsearchCoreStrings.partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightResultPrimitive extends StObject {
  
  var fullyHighlighted: js.UndefOr[Boolean] = js.native
  
  /** full, partial or none depending on how the query terms match */
  var matchLevel: none | partial | full = js.native
  
  var matchedWords: js.Array[String] = js.native
  
  /** the value of the facet highlighted (html) */
  var value: String = js.native
}
object HighlightResultPrimitive {
  
  @scala.inline
  def apply(matchLevel: none | partial | full, matchedWords: js.Array[String], value: String): HighlightResultPrimitive = {
    val __obj = js.Dynamic.literal(matchLevel = matchLevel.asInstanceOf[js.Any], matchedWords = matchedWords.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightResultPrimitive]
  }
  
  @scala.inline
  implicit class HighlightResultPrimitiveMutableBuilder[Self <: HighlightResultPrimitive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullyHighlighted(value: Boolean): Self = StObject.set(x, "fullyHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullyHighlightedUndefined: Self = StObject.set(x, "fullyHighlighted", js.undefined)
    
    @scala.inline
    def setMatchLevel(value: none | partial | full): Self = StObject.set(x, "matchLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedWords(value: js.Array[String]): Self = StObject.set(x, "matchedWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedWordsVarargs(value: String*): Self = StObject.set(x, "matchedWords", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
