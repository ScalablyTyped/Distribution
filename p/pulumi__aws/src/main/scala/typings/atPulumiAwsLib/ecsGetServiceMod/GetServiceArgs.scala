package typings
package atPulumiAwsLib.ecsGetServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceArgs extends js.Object {
  /**
    * The arn of the ECS Cluster
    */
  val clusterArn: java.lang.String
  /**
    * The name of the ECS Service
    */
  val serviceName: java.lang.String
}

object GetServiceArgs {
  @scala.inline
  def apply(clusterArn: java.lang.String, serviceName: java.lang.String): GetServiceArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clusterArn")(clusterArn)
    __obj.updateDynamic("serviceName")(serviceName)
    __obj.asInstanceOf[GetServiceArgs]
  }
}

