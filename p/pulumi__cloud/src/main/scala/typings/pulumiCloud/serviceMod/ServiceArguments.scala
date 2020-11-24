package typings.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceArguments extends Container {
  
  /**
    * A collection of containers that will be deployed as part of this Service, if there are multiple.
    */
  var containers: js.UndefOr[Containers] = js.native
  
  /**
    * The properties of the host where this service can run.
    */
  var host: js.UndefOr[HostProperties] = js.native
  
  /**
    * The number of copies of this Service's containers to deploy and maintain
    * as part of the running service.  Defaults to `1`.
    */
  var replicas: js.UndefOr[Double] = js.native
  
  /**
    *
    * Determines whether the service should wait to fully transition to a new steady state on creation and updates. If
    * set to false, the service may complete its deployment before it is fully ready to be used. Defaults to 'true'.
    */
  var waitForSteadyState: js.UndefOr[Boolean] = js.native
}
object ServiceArguments {
  
  @scala.inline
  def apply(): ServiceArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceArguments]
  }
  
  @scala.inline
  implicit class ServiceArgumentsOps[Self <: ServiceArguments] (val x: Self) extends AnyVal {
    
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
    def setContainers(value: Containers): Self = this.set("containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainers: Self = this.set("containers", js.undefined)
    
    @scala.inline
    def setHost(value: HostProperties): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setReplicas(value: Double): Self = this.set("replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicas: Self = this.set("replicas", js.undefined)
    
    @scala.inline
    def setWaitForSteadyState(value: Boolean): Self = this.set("waitForSteadyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForSteadyState: Self = this.set("waitForSteadyState", js.undefined)
  }
}
