package typings.pulumiKubernetes.inputMod.discovery.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EndpointConditions represents the current condition of an endpoint.
  */
@js.native
trait EndpointConditions extends js.Object {
  
  /**
    * ready indicates that this endpoint is prepared to receive traffic, according to whatever system is managing the endpoint. A nil value indicates an unknown state. In most cases consumers should interpret this unknown state as ready.
    */
  var ready: js.UndefOr[Input[Boolean]] = js.native
}
object EndpointConditions {
  
  @scala.inline
  def apply(): EndpointConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointConditions]
  }
  
  @scala.inline
  implicit class EndpointConditionsOps[Self <: EndpointConditions] (val x: Self) extends AnyVal {
    
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
    def setReady(value: Input[Boolean]): Self = this.set("ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
  }
}
