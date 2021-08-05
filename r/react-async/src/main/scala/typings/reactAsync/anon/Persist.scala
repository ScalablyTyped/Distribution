package typings.reactAsync.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Persist extends StObject {
  
  var children: js.Any
  
  var persist: js.Any
  
  var state: js.Any
}
object Persist {
  
  inline def apply(children: js.Any, persist: js.Any, state: js.Any): Persist = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], persist = persist.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Persist]
  }
  
  extension [Self <: Persist](x: Self) {
    
    inline def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setPersist(value: js.Any): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
