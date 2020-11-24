package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecListenerTimeoutGrpcPerRequest extends js.Object {
  
  /**
    * The unit of time. Valid values: `ms`, `s`.
    */
  var unit: String = js.native
  
  /**
    * The number of time units. Minimum value of `0`.
    */
  var value: Double = js.native
}
object VirtualNodeSpecListenerTimeoutGrpcPerRequest {
  
  @scala.inline
  def apply(unit: String, value: Double): VirtualNodeSpecListenerTimeoutGrpcPerRequest = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListenerTimeoutGrpcPerRequest]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerTimeoutGrpcPerRequestOps[Self <: VirtualNodeSpecListenerTimeoutGrpcPerRequest] (val x: Self) extends AnyVal {
    
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
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
