package typings.reactAutosuggest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlurEvent[TSuggestion] extends StObject {
  
  var highlightedSuggestion: TSuggestion
}
object BlurEvent {
  
  inline def apply[TSuggestion](highlightedSuggestion: TSuggestion): BlurEvent[TSuggestion] = {
    val __obj = js.Dynamic.literal(highlightedSuggestion = highlightedSuggestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurEvent[TSuggestion]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlurEvent[?], TSuggestion] (val x: Self & BlurEvent[TSuggestion]) extends AnyVal {
    
    inline def setHighlightedSuggestion(value: TSuggestion): Self = StObject.set(x, "highlightedSuggestion", value.asInstanceOf[js.Any])
  }
}
