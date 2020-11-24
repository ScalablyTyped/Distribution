package typings.redisInfo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calls extends js.Object {
  
  var calls: Double = js.native
  
  var usec: Double = js.native
  
  var usec_per_call: Double = js.native
}
object Calls {
  
  @scala.inline
  def apply(calls: Double, usec: Double, usec_per_call: Double): Calls = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], usec = usec.asInstanceOf[js.Any], usec_per_call = usec_per_call.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calls]
  }
  
  @scala.inline
  implicit class CallsOps[Self <: Calls] (val x: Self) extends AnyVal {
    
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
    def setCalls(value: Double): Self = this.set("calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsec(value: Double): Self = this.set("usec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsec_per_call(value: Double): Self = this.set("usec_per_call", value.asInstanceOf[js.Any])
  }
}
