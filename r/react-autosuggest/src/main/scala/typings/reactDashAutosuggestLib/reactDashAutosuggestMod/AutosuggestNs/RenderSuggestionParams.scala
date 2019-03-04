package typings
package reactDashAutosuggestLib.reactDashAutosuggestMod.AutosuggestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderSuggestionParams extends js.Object {
  var isHighlighted: scala.Boolean
  var query: java.lang.String
}

object RenderSuggestionParams {
  @scala.inline
  def apply(isHighlighted: scala.Boolean, query: java.lang.String): RenderSuggestionParams = {
    val __obj = js.Dynamic.literal(isHighlighted = isHighlighted, query = query)
  
    __obj.asInstanceOf[RenderSuggestionParams]
  }
}

