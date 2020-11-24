package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpec extends js.Object {
  
  /**
    * The defaults for backends.
    */
  var backendDefaults: js.UndefOr[VirtualGatewaySpecBackendDefaults] = js.native
  
  /**
    * The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
    */
  var listener: VirtualGatewaySpecListener = js.native
  
  /**
    * The inbound and outbound access logging information for the virtual gateway.
    */
  var logging: js.UndefOr[VirtualGatewaySpecLogging] = js.native
}
object VirtualGatewaySpec {
  
  @scala.inline
  def apply(listener: VirtualGatewaySpecListener): VirtualGatewaySpec = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpec]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecOps[Self <: VirtualGatewaySpec] (val x: Self) extends AnyVal {
    
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
    def setListener(value: VirtualGatewaySpecListener): Self = this.set("listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendDefaults(value: VirtualGatewaySpecBackendDefaults): Self = this.set("backendDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendDefaults: Self = this.set("backendDefaults", js.undefined)
    
    @scala.inline
    def setLogging(value: VirtualGatewaySpecLogging): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
  }
}
