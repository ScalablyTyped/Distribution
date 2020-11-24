package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpec extends js.Object {
  
  /**
    * The defaults for backends.
    */
  var backendDefaults: js.UndefOr[Input[VirtualNodeSpecBackendDefaults]] = js.native
  
  /**
    * The backends to which the virtual node is expected to send outbound traffic.
    */
  var backends: js.UndefOr[Input[js.Array[Input[VirtualNodeSpecBackend]]]] = js.native
  
  /**
    * The listeners from which the virtual node is expected to receive inbound traffic.
    */
  var listener: js.UndefOr[Input[VirtualNodeSpecListener]] = js.native
  
  /**
    * The inbound and outbound access logging information for the virtual node.
    */
  var logging: js.UndefOr[Input[VirtualNodeSpecLogging]] = js.native
  
  /**
    * The service discovery information for the virtual node.
    */
  var serviceDiscovery: js.UndefOr[Input[VirtualNodeSpecServiceDiscovery]] = js.native
}
object VirtualNodeSpec {
  
  @scala.inline
  def apply(): VirtualNodeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpec]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecOps[Self <: VirtualNodeSpec] (val x: Self) extends AnyVal {
    
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
    def setBackendDefaults(value: Input[VirtualNodeSpecBackendDefaults]): Self = this.set("backendDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendDefaults: Self = this.set("backendDefaults", js.undefined)
    
    @scala.inline
    def setBackendsVarargs(value: Input[VirtualNodeSpecBackend]*): Self = this.set("backends", js.Array(value :_*))
    
    @scala.inline
    def setBackends(value: Input[js.Array[Input[VirtualNodeSpecBackend]]]): Self = this.set("backends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackends: Self = this.set("backends", js.undefined)
    
    @scala.inline
    def setListener(value: Input[VirtualNodeSpecListener]): Self = this.set("listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListener: Self = this.set("listener", js.undefined)
    
    @scala.inline
    def setLogging(value: Input[VirtualNodeSpecLogging]): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setServiceDiscovery(value: Input[VirtualNodeSpecServiceDiscovery]): Self = this.set("serviceDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceDiscovery: Self = this.set("serviceDiscovery", js.undefined)
  }
}
