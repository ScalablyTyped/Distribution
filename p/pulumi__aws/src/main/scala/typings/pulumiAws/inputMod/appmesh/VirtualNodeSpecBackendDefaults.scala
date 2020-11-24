package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecBackendDefaults extends js.Object {
  
  /**
    * The default client policy for virtual service backends. See above for details.
    */
  var clientPolicy: js.UndefOr[Input[VirtualNodeSpecBackendDefaultsClientPolicy]] = js.native
}
object VirtualNodeSpecBackendDefaults {
  
  @scala.inline
  def apply(): VirtualNodeSpecBackendDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecBackendDefaults]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecBackendDefaultsOps[Self <: VirtualNodeSpecBackendDefaults] (val x: Self) extends AnyVal {
    
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
    def setClientPolicy(value: Input[VirtualNodeSpecBackendDefaultsClientPolicy]): Self = this.set("clientPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientPolicy: Self = this.set("clientPolicy", js.undefined)
  }
}
