package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var state: Scale
}
object State {
  
  inline def apply(state: Scale): State = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setState(value: Scale): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
