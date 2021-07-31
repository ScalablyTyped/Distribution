package typings.pulumiAws.outputMod.ecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceServiceRegistries extends StObject {
  
  /**
    * The container name value, already specified in the task definition, to be used for your service discovery service.
    */
  var containerName: js.UndefOr[String] = js.undefined
  
  /**
    * The port value, already specified in the task definition, to be used for your service discovery service.
    */
  var containerPort: js.UndefOr[Double] = js.undefined
  
  /**
    * The port value used if your Service Discovery service specified an SRV record.
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * The ARN of the Service Registry. The currently supported service registry is Amazon Route 53 Auto Naming Service(`aws.servicediscovery.Service`). For more information, see [Service](https://docs.aws.amazon.com/Route53/latest/APIReference/API_autonaming_Service.html)
    */
  var registryArn: String
}
object ServiceServiceRegistries {
  
  @scala.inline
  def apply(registryArn: String): ServiceServiceRegistries = {
    val __obj = js.Dynamic.literal(registryArn = registryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceServiceRegistries]
  }
  
  @scala.inline
  implicit class ServiceServiceRegistriesMutableBuilder[Self <: ServiceServiceRegistries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    @scala.inline
    def setContainerPort(value: Double): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setRegistryArn(value: String): Self = StObject.set(x, "registryArn", value.asInstanceOf[js.Any])
  }
}
