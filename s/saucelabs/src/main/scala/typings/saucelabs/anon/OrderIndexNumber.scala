package typings.saucelabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderIndexNumber extends js.Object {
  
  var orderIndex: Double = js.native
}
object OrderIndexNumber {
  
  @scala.inline
  def apply(orderIndex: Double): OrderIndexNumber = {
    val __obj = js.Dynamic.literal(orderIndex = orderIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderIndexNumber]
  }
  
  @scala.inline
  implicit class OrderIndexNumberOps[Self <: OrderIndexNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOrderIndex(value: Double): Self = this.set("orderIndex", value.asInstanceOf[js.Any])
  }
}
