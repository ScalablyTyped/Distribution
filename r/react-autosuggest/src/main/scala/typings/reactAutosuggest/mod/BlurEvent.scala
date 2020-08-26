package typings.reactAutosuggest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlurEvent[TSuggestion] extends js.Object {
  var highlightedSuggestion: TSuggestion = js.native
}

object BlurEvent {
  @scala.inline
  def apply[TSuggestion](highlightedSuggestion: TSuggestion): BlurEvent[TSuggestion] = {
    val __obj = js.Dynamic.literal(highlightedSuggestion = highlightedSuggestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurEvent[TSuggestion]]
  }
  @scala.inline
  implicit class BlurEventOps[Self <: BlurEvent[_], TSuggestion] (val x: Self with BlurEvent[TSuggestion]) extends AnyVal {
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
    def setHighlightedSuggestion(value: TSuggestion): Self = this.set("highlightedSuggestion", value.asInstanceOf[js.Any])
  }
  
}

