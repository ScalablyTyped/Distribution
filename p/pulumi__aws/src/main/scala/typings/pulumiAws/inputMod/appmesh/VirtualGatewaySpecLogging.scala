package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpecLogging extends js.Object {
  
  /**
    * The access log configuration for a virtual gateway.
    */
  var accessLog: js.UndefOr[Input[VirtualGatewaySpecLoggingAccessLog]] = js.native
}
object VirtualGatewaySpecLogging {
  
  @scala.inline
  def apply(): VirtualGatewaySpecLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewaySpecLogging]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecLoggingOps[Self <: VirtualGatewaySpecLogging] (val x: Self) extends AnyVal {
    
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
    def setAccessLog(value: Input[VirtualGatewaySpecLoggingAccessLog]): Self = this.set("accessLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessLog: Self = this.set("accessLog", js.undefined)
  }
}
