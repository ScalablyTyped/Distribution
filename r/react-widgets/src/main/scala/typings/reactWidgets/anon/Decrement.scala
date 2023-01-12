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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Decrement] (val x: Self) extends AnyVal {
    
    inline def setDecrement(value: String): Self = StObject.set(x, "decrement", value.asInstanceOf[js.Any])
    
    inline def setDecrementUndefined: Self = StObject.set(x, "decrement", js.undefined)
    
    inline def setIncrement(value: String): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
  }
}
