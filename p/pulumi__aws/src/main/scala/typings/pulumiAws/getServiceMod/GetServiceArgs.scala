package typings.pulumiAws.getServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceArgs extends js.Object {
  /**
    * The arn of the ECS Cluster
    */
  val clusterArn: String = js.native
  /**
    * The name of the ECS Service
    */
  val serviceName: String = js.native
}

object GetServiceArgs {
  @scala.inline
  def apply(clusterArn: String, serviceName: String): GetServiceArgs = {
    val __obj = js.Dynamic.literal(clusterArn = clusterArn.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceArgs]
  }
}

