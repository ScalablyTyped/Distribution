package typings.reachDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveDescendant extends StObject {
  
  var activeDescendant: js.UndefOr[String] = js.undefined
  
  var triggerId: String | Null
}
object ActiveDescendant {
  
  inline def apply(): ActiveDescendant = {
    val __obj = js.Dynamic.literal(triggerId = null)
    __obj.asInstanceOf[ActiveDescendant]
  }
  
  extension [Self <: ActiveDescendant](x: Self) {
    
    inline def setActiveDescendant(value: String): Self = StObject.set(x, "activeDescendant", value.asInstanceOf[js.Any])
    
    inline def setActiveDescendantUndefined: Self = StObject.set(x, "activeDescendant", js.undefined)
    
    inline def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerIdNull: Self = StObject.set(x, "triggerId", null)
  }
}
