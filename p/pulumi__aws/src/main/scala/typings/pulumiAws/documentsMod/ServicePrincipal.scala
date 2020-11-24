package typings.pulumiAws.documentsMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicePrincipal extends Principal {
  
  var Service: Input[js.Array[Input[String]] | String] = js.native
}
object ServicePrincipal {
  
  @scala.inline
  def apply(Service: Input[js.Array[Input[String]] | String]): ServicePrincipal = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicePrincipal]
  }
  
  @scala.inline
  implicit class ServicePrincipalOps[Self <: ServicePrincipal] (val x: Self) extends AnyVal {
    
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
    def setServiceVarargs(value: Input[String]*): Self = this.set("Service", js.Array(value :_*))
    
    @scala.inline
    def setService(value: Input[js.Array[Input[String]] | String]): Self = this.set("Service", value.asInstanceOf[js.Any])
  }
}
