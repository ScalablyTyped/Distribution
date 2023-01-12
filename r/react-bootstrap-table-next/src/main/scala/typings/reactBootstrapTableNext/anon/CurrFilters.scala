package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrFilters extends StObject {
  
  var currFilters: Any
}
object CurrFilters {
  
  inline def apply(currFilters: Any): CurrFilters = {
    val __obj = js.Dynamic.literal(currFilters = currFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurrFilters] (val x: Self) extends AnyVal {
    
    inline def setCurrFilters(value: Any): Self = StObject.set(x, "currFilters", value.asInstanceOf[js.Any])
  }
}
