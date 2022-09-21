package typings.reactWidgets.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decrement extends StObject {
  
  var decrement: js.UndefOr[String] = js.undefined
  
  var increment: js.UndefOr[String] = js.undefined
}
object Decrement {
  
  inline def apply(): Decrement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Decrement]
  }
  
  extension [Self <: Decrement](x: Self) {
    
    inline def setDecrement(value: String): Self = StObject.set(x, "decrement", value.asInstanceOf[js.Any])
    
    inline def setDecrementUndefined: Self = StObject.set(x, "decrement", js.undefined)
    
    inline def setIncrement(value: String): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
  }
}
