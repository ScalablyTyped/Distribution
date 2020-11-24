package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecListenerTimeoutHttp extends js.Object {
  
  /**
    * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
    */
  var idle: js.UndefOr[Input[VirtualNodeSpecListenerTimeoutHttpIdle]] = js.native
  
  /**
    * The per request timeout.
    */
  var perRequest: js.UndefOr[Input[VirtualNodeSpecListenerTimeoutHttpPerRequest]] = js.native
}
object VirtualNodeSpecListenerTimeoutHttp {
  
  @scala.inline
  def apply(): VirtualNodeSpecListenerTimeoutHttp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecListenerTimeoutHttp]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerTimeoutHttpOps[Self <: VirtualNodeSpecListenerTimeoutHttp] (val x: Self) extends AnyVal {
    
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
    def setIdle(value: Input[VirtualNodeSpecListenerTimeoutHttpIdle]): Self = this.set("idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdle: Self = this.set("idle", js.undefined)
    
    @scala.inline
    def setPerRequest(value: Input[VirtualNodeSpecListenerTimeoutHttpPerRequest]): Self = this.set("perRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerRequest: Self = this.set("perRequest", js.undefined)
  }
}
