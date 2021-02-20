package typings.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StObject
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
  implicit class ServiceArgumentsMutableBuilder[Self <: ServiceArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainers(value: Containers): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    @scala.inline
    def setHost(value: HostProperties): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setReplicas(value: Double): Self = StObject.set(x, "replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicasUndefined: Self = StObject.set(x, "replicas", js.undefined)
    
    @scala.inline
    def setWaitForSteadyState(value: Boolean): Self = StObject.set(x, "waitForSteadyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForSteadyStateUndefined: Self = StObject.set(x, "waitForSteadyState", js.undefined)
  }
}
