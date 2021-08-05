package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrFilters extends StObject {
  
  var currFilters: js.Any
}
object CurrFilters {
  
  inline def apply(currFilters: js.Any): CurrFilters = {
    val __obj = js.Dynamic.literal(currFilters = currFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrFilters]
  }
  
  extension [Self <: CurrFilters](x: Self) {
    
    inline def setCurrFilters(value: js.Any): Self = StObject.set(x, "currFilters", value.asInstanceOf[js.Any])
  }
}
