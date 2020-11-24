package typings.pulumiAws.outputMod.globalaccelerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointGroupPortOverride extends js.Object {
  
  /**
    * The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2 instance.
    */
  var endpointPort: Double = js.native
  
  /**
    * The listener port that you want to map to a specific endpoint port. This is the port that user traffic arrives to the Global Accelerator on.
    */
  var listenerPort: Double = js.native
}
object EndpointGroupPortOverride {
  
  @scala.inline
  def apply(endpointPort: Double, listenerPort: Double): EndpointGroupPortOverride = {
    val __obj = js.Dynamic.literal(endpointPort = endpointPort.asInstanceOf[js.Any], listenerPort = listenerPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointGroupPortOverride]
  }
  
  @scala.inline
  implicit class EndpointGroupPortOverrideOps[Self <: EndpointGroupPortOverride] (val x: Self) extends AnyVal {
    
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
    def setEndpointPort(value: Double): Self = this.set("endpointPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerPort(value: Double): Self = this.set("listenerPort", value.asInstanceOf[js.Any])
  }
}
