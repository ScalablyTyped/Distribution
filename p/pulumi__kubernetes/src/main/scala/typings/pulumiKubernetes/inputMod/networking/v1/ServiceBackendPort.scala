package typings.pulumiKubernetes.inputMod.networking.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceBackendPort is the service port being referenced.
  */
@js.native
trait ServiceBackendPort extends js.Object {
  
  /**
    * Name is the name of the port on the Service. This is a mutually exclusive setting with "Number".
    */
  var name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Number is the numerical port number (e.g. 80) on the Service. This is a mutually exclusive setting with "Name".
    */
  var number: js.UndefOr[Input[Double]] = js.native
}
object ServiceBackendPort {
  
  @scala.inline
  def apply(): ServiceBackendPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceBackendPort]
  }
  
  @scala.inline
  implicit class ServiceBackendPortOps[Self <: ServiceBackendPort] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNumber(value: Input[Double]): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
  }
}
