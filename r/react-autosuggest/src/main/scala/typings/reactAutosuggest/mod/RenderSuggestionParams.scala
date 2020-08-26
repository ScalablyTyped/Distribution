package typings.reactAutosuggest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderSuggestionParams extends js.Object {
  var isHighlighted: Boolean = js.native
  var query: String = js.native
}

object RenderSuggestionParams {
  @scala.inline
  def apply(isHighlighted: Boolean, query: String): RenderSuggestionParams = {
    val __obj = js.Dynamic.literal(isHighlighted = isHighlighted.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderSuggestionParams]
  }
  @scala.inline
  implicit class RenderSuggestionParamsOps[Self <: RenderSuggestionParams] (val x: Self) extends AnyVal {
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
    def setIsHighlighted(value: Boolean): Self = this.set("isHighlighted", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
  }
  
}

