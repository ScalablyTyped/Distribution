package typings.atPulumiAws.ecsGetServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceArgs extends js.Object {
  /**
    * The arn of the ECS Cluster
    */
  val clusterArn: String
  /**
    * The name of the ECS Service
    */
  val serviceName: String
}

object GetServiceArgs {
  @scala.inline
  def apply(clusterArn: String, serviceName: String): GetServiceArgs = {
    val __obj = js.Dynamic.literal(clusterArn = clusterArn, serviceName = serviceName)
  
    __obj.asInstanceOf[GetServiceArgs]
  }
}

