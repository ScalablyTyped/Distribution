package typings.redisSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalIdle extends StObject {
  
  var globalIdle: Double
  
  var globalTotal: Double
  
  var idnexTotal: Double
  
  var indexCapacity: Double
}
object GlobalIdle {
  
  inline def apply(globalIdle: Double, globalTotal: Double, idnexTotal: Double, indexCapacity: Double): GlobalIdle = {
    val __obj = js.Dynamic.literal(globalIdle = globalIdle.asInstanceOf[js.Any], globalTotal = globalTotal.asInstanceOf[js.Any], idnexTotal = idnexTotal.asInstanceOf[js.Any], indexCapacity = indexCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalIdle]
  }
  
  extension [Self <: GlobalIdle](x: Self) {
    
    inline def setGlobalIdle(value: Double): Self = StObject.set(x, "globalIdle", value.asInstanceOf[js.Any])
    
    inline def setGlobalTotal(value: Double): Self = StObject.set(x, "globalTotal", value.asInstanceOf[js.Any])
    
    inline def setIdnexTotal(value: Double): Self = StObject.set(x, "idnexTotal", value.asInstanceOf[js.Any])
    
    inline def setIndexCapacity(value: Double): Self = StObject.set(x, "indexCapacity", value.asInstanceOf[js.Any])
  }
}
