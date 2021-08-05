package typings.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Limit extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var orderIndex: Double
}
object Limit {
  
  inline def apply(orderIndex: Double): Limit = {
    val __obj = js.Dynamic.literal(orderIndex = orderIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
  
  extension [Self <: Limit](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOrderIndex(value: Double): Self = StObject.set(x, "orderIndex", value.asInstanceOf[js.Any])
  }
}
