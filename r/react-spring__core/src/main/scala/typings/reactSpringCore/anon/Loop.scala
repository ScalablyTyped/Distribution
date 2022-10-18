package typings.reactSpringCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loop extends StObject {
  
  var from: js.UndefOr[Any] = js.undefined
  
  var loop: js.UndefOr[Any] = js.undefined
  
  var reverse: js.UndefOr[Any] = js.undefined
  
  var to: js.UndefOr[Any] = js.undefined
}
object Loop {
  
  inline def apply(): Loop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Loop]
  }
  
  extension [Self <: Loop](x: Self) {
    
    inline def setFrom(value: Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setLoop(value: Any): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setReverse(value: Any): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setTo(value: Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
