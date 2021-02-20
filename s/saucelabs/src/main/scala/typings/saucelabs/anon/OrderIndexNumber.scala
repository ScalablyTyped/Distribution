package typings.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderIndexNumber extends StObject {
  
  var orderIndex: Double = js.native
}
object OrderIndexNumber {
  
  @scala.inline
  def apply(orderIndex: Double): OrderIndexNumber = {
    val __obj = js.Dynamic.literal(orderIndex = orderIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderIndexNumber]
  }
  
  @scala.inline
  implicit class OrderIndexNumberMutableBuilder[Self <: OrderIndexNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrderIndex(value: Double): Self = StObject.set(x, "orderIndex", value.asInstanceOf[js.Any])
  }
}
