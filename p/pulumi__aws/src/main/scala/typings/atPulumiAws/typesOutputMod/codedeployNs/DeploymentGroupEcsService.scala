package typings.atPulumiAws.typesOutputMod.codedeployNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupEcsService extends js.Object {
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
    val __obj = js.Dynamic.literal(clusterName = clusterName, serviceName = serviceName)
  
    __obj.asInstanceOf[DeploymentGroupEcsService]
  }
}

