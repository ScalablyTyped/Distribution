package typings.reactAutosuggest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlurEvent[TSuggestion] extends StObject {
  
  var highlightedSuggestion: TSuggestion = js.native
}
object BlurEvent {
  
  @scala.inline
  def apply[TSuggestion](highlightedSuggestion: TSuggestion): BlurEvent[TSuggestion] = {
    val __obj = js.Dynamic.literal(highlightedSuggestion = highlightedSuggestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurEvent[TSuggestion]]
  }
  
  @scala.inline
  implicit class BlurEventMutableBuilder[Self <: BlurEvent[_], TSuggestion] (val x: Self with BlurEvent[TSuggestion]) extends AnyVal {
    
    @scala.inline
    def setHighlightedSuggestion(value: TSuggestion): Self = StObject.set(x, "highlightedSuggestion", value.asInstanceOf[js.Any])
  }
}
