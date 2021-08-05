package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactProviderType[T] extends StObject {
  
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol | Double
  
  var _context: ReactContext[T]
}
object ReactProviderType {
  
  inline def apply[T](DollarDollartypeof: js.Symbol | Double, _context: ReactContext[T]): ReactProviderType[T] = {
    val __obj = js.Dynamic.literal(_context = _context.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactProviderType[T]]
  }
  
  extension [Self <: ReactProviderType[?], T](x: Self & ReactProviderType[T]) {
    
    inline def setDollarDollartypeof(value: js.Symbol | Double): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
    
    inline def set_context(value: ReactContext[T]): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
  }
}
