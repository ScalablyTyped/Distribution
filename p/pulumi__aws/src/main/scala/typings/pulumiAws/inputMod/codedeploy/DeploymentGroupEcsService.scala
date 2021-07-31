package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupEcsService extends StObject {
  
  /**
    * The name of the ECS cluster.
    */
  var clusterName: Input[String]
  
  /**
    * The name of the ECS service.
    */
  var serviceName: Input[String]
}
object DeploymentGroupEcsService {
  
  @scala.inline
  def apply(clusterName: Input[String], serviceName: Input[String]): DeploymentGroupEcsService = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupEcsService]
  }
  
  @scala.inline
  implicit class DeploymentGroupEcsServiceMutableBuilder[Self <: DeploymentGroupEcsService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterName(value: Input[String]): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: Input[String]): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
