package typings.pulumiAws.outputMod.ecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceLoadBalancer extends StObject {
  
  /**
    * The name of the container to associate with the load balancer (as it appears in a container definition).
    */
  var containerName: String
  
  /**
    * The port on the container to associate with the load balancer.
    */
  var containerPort: Double
  
  /**
    * The name of the ELB (Classic) to associate with the service.
    */
  var elbName: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the Load Balancer target group to associate with the service.
    */
  var targetGroupArn: js.UndefOr[String] = js.undefined
}
object ServiceLoadBalancer {
  
  @scala.inline
  def apply(containerName: String, containerPort: Double): ServiceLoadBalancer = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], containerPort = containerPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceLoadBalancer]
  }
  
  @scala.inline
  implicit class ServiceLoadBalancerMutableBuilder[Self <: ServiceLoadBalancer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerPort(value: Double): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElbName(value: String): Self = StObject.set(x, "elbName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElbNameUndefined: Self = StObject.set(x, "elbName", js.undefined)
    
    @scala.inline
    def setTargetGroupArn(value: String): Self = StObject.set(x, "targetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupArnUndefined: Self = StObject.set(x, "targetGroupArn", js.undefined)
  }
}
