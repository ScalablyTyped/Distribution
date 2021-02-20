package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceServiceRegistries extends StObject {
  
  /**
    * The container name value, already specified in the task definition, to be used for your service discovery service.
    */
  var containerName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The port value, already specified in the task definition, to be used for your service discovery service.
    */
  var containerPort: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The port value used if your Service Discovery service specified an SRV record.
    */
  var port: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The ARN of the Service Registry. The currently supported service registry is Amazon Route 53 Auto Naming Service(`aws.servicediscovery.Service`). For more information, see [Service](https://docs.aws.amazon.com/Route53/latest/APIReference/API_autonaming_Service.html)
    */
  var registryArn: Input[String] = js.native
}
object ServiceServiceRegistries {
  
  @scala.inline
  def apply(registryArn: Input[String]): ServiceServiceRegistries = {
    val __obj = js.Dynamic.literal(registryArn = registryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceServiceRegistries]
  }
  
  @scala.inline
  implicit class ServiceServiceRegistriesMutableBuilder[Self <: ServiceServiceRegistries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: Input[String]): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    @scala.inline
    def setContainerPort(value: Input[Double]): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    @scala.inline
    def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setRegistryArn(value: Input[String]): Self = StObject.set(x, "registryArn", value.asInstanceOf[js.Any])
  }
}
