package typings.reactDashAutosuggest.reactDashAutosuggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderSuggestionParams extends js.Object {
  var isHighlighted: Boolean
  var query: String
}

object RenderSuggestionParams {
  @scala.inline
  def apply(isHighlighted: Boolean, query: String): RenderSuggestionParams = {
    val __obj = js.Dynamic.literal(isHighlighted = isHighlighted, query = query)
  
    __obj.asInstanceOf[RenderSuggestionParams]
  }
}

