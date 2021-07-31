package typings.reactAutosuggest.mod

import typings.reactAutosuggest.reactAutosuggestStrings.`type`
import typings.reactAutosuggest.reactAutosuggestStrings.click
import typings.reactAutosuggest.reactAutosuggestStrings.down
import typings.reactAutosuggest.reactAutosuggestStrings.enter
import typings.reactAutosuggest.reactAutosuggestStrings.escape
import typings.reactAutosuggest.reactAutosuggestStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeEvent extends StObject {
  
  var method: down | up | escape | enter | click | `type`
  
  var newValue: String
}
object ChangeEvent {
  
  @scala.inline
  def apply(method: down | up | escape | enter | click | `type`, newValue: String): ChangeEvent = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
  
  @scala.inline
  implicit class ChangeEventMutableBuilder[Self <: ChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: down | up | escape | enter | click | `type`): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
  }
}
