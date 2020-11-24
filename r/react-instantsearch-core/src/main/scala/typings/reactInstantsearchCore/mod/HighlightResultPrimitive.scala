package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.reactInstantsearchCoreStrings.full
import typings.reactInstantsearchCore.reactInstantsearchCoreStrings.none
import typings.reactInstantsearchCore.reactInstantsearchCoreStrings.partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightResultPrimitive extends js.Object {
  
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
  implicit class HighlightResultPrimitiveOps[Self <: HighlightResultPrimitive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMatchLevel(value: none | partial | full): Self = this.set("matchLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedWordsVarargs(value: String*): Self = this.set("matchedWords", js.Array(value :_*))
    
    @scala.inline
    def setMatchedWords(value: js.Array[String]): Self = this.set("matchedWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullyHighlighted(value: Boolean): Self = this.set("fullyHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullyHighlighted: Self = this.set("fullyHighlighted", js.undefined)
  }
}
