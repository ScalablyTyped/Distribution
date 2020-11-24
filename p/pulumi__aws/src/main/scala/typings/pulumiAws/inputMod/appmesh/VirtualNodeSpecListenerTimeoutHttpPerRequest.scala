package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecListenerTimeoutHttpPerRequest extends js.Object {
  
  /**
    * The unit of time. Valid values: `ms`, `s`.
    */
  var unit: Input[String] = js.native
  
  /**
    * The number of time units. Minimum value of `0`.
    */
  var value: Input[Double] = js.native
}
object VirtualNodeSpecListenerTimeoutHttpPerRequest {
  
  @scala.inline
  def apply(unit: Input[String], value: Input[Double]): VirtualNodeSpecListenerTimeoutHttpPerRequest = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListenerTimeoutHttpPerRequest]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerTimeoutHttpPerRequestOps[Self <: VirtualNodeSpecListenerTimeoutHttpPerRequest] (val x: Self) extends AnyVal {
    
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
    def setUnit(value: Input[String]): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Input[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
