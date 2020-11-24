package typings.reactAutosuggest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestionHighlightedParams extends js.Object {
  
  var suggestion: js.Any = js.native
}
object SuggestionHighlightedParams {
  
  @scala.inline
  def apply(suggestion: js.Any): SuggestionHighlightedParams = {
    val __obj = js.Dynamic.literal(suggestion = suggestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionHighlightedParams]
  }
  
  @scala.inline
  implicit class SuggestionHighlightedParamsOps[Self <: SuggestionHighlightedParams] (val x: Self) extends AnyVal {
    
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
    def setSuggestion(value: js.Any): Self = this.set("suggestion", value.asInstanceOf[js.Any])
  }
}
