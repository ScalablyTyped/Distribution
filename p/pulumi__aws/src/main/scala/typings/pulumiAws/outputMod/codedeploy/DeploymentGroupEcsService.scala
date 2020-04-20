package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupEcsService extends js.Object {
  /**
    * The name of the ECS cluster.
    */
  var clusterName: String = js.native
  /**
    * The name of the ECS service.
    */
  var serviceName: String = js.native
}

object DeploymentGroupEcsService {
  @scala.inline
  def apply(clusterName: String, serviceName: String): DeploymentGroupEcsService = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupEcsService]
  }
}

