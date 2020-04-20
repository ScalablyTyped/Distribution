package typings.reactAutosuggest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlurEvent[TSuggestion] extends js.Object {
  var highlightedSuggestion: TSuggestion
}

object BlurEvent {
  @scala.inline
  def apply[TSuggestion](highlightedSuggestion: TSuggestion): BlurEvent[TSuggestion] = {
    val __obj = js.Dynamic.literal(highlightedSuggestion = highlightedSuggestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurEvent[TSuggestion]]
  }
}

