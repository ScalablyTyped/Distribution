package typings.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderIndexNumber extends StObject {
  
  var orderIndex: Double
}
object OrderIndexNumber {
  
  inline def apply(orderIndex: Double): OrderIndexNumber = {
    val __obj = js.Dynamic.literal(orderIndex = orderIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderIndexNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderIndexNumber] (val x: Self) extends AnyVal {
    
    inline def setOrderIndex(value: Double): Self = StObject.set(x, "orderIndex", value.asInstanceOf[js.Any])
  }
}
