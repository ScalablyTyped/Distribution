package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchSuggestionResult...
  */
@js.native
trait ISearchSuggestionResult extends js.Object {
  
  /**
    * List of field names that contain search hits.
    */
  var qFieldNames: js.Array[String] = js.native
  
  /**
    * List of suggestions.
    */
  var qSuggestions: js.Array[ISearchSuggestItem] = js.native
}
object ISearchSuggestionResult {
  
  @scala.inline
  def apply(qFieldNames: js.Array[String], qSuggestions: js.Array[ISearchSuggestItem]): ISearchSuggestionResult = {
    val __obj = js.Dynamic.literal(qFieldNames = qFieldNames.asInstanceOf[js.Any], qSuggestions = qSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchSuggestionResult]
  }
  
  @scala.inline
  implicit class ISearchSuggestionResultOps[Self <: ISearchSuggestionResult] (val x: Self) extends AnyVal {
    
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
    def setQFieldNamesVarargs(value: String*): Self = this.set("qFieldNames", js.Array(value :_*))
    
    @scala.inline
    def setQFieldNames(value: js.Array[String]): Self = this.set("qFieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSuggestionsVarargs(value: ISearchSuggestItem*): Self = this.set("qSuggestions", js.Array(value :_*))
    
    @scala.inline
    def setQSuggestions(value: js.Array[ISearchSuggestItem]): Self = this.set("qSuggestions", value.asInstanceOf[js.Any])
  }
}
