package typings.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupEcsService extends StObject {
  
  /**
    * The name of the ECS cluster.
    */
  var clusterName: String
  
  /**
    * The name of the ECS service.
    */
  var serviceName: String
}
object DeploymentGroupEcsService {
  
  @scala.inline
  def apply(clusterName: String, serviceName: String): DeploymentGroupEcsService = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupEcsService]
  }
  
  @scala.inline
  implicit class DeploymentGroupEcsServiceMutableBuilder[Self <: DeploymentGroupEcsService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
