package typings.atPulumiAws.typesInputMod.codedeploy

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupEcsService extends js.Object {
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
}

