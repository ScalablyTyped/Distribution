package typings.promisePool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResult extends js.Object {
  
  var fulfilled: Double = js.native
  
  var rejected: Double = js.native
  
  var total: Double = js.native
}
object IResult {
  
  @scala.inline
  def apply(fulfilled: Double, rejected: Double, total: Double): IResult = {
    val __obj = js.Dynamic.literal(fulfilled = fulfilled.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult]
  }
  
  @scala.inline
  implicit class IResultOps[Self <: IResult] (val x: Self) extends AnyVal {
    
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
    def setFulfilled(value: Double): Self = this.set("fulfilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejected(value: Double): Self = this.set("rejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
