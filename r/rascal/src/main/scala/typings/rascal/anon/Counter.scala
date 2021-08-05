package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Counter extends StObject {
  
  var counter: String
  
  var limit: Double
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object Counter {
  
  inline def apply(counter: String, limit: Double): Counter = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counter]
  }
  
  extension [Self <: Counter](x: Self) {
    
    inline def setCounter(value: String): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
