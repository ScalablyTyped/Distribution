package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchSuggestionResult...
  */
trait ISearchSuggestionResult extends js.Object {
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
  @scala.inline
  def apply(qFieldNames: js.Array[String], qSuggestions: js.Array[ISearchSuggestItem]): ISearchSuggestionResult = {
    val __obj = js.Dynamic.literal(qFieldNames = qFieldNames, qSuggestions = qSuggestions)
  
    __obj.asInstanceOf[ISearchSuggestionResult]
  }
}

