package typings.atPulumiAws.typesInputMod.msk

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterConfigurationInfo extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
    */
  var arn: Input[String]
  /**
    * Revision of the MSK Configuration to use in the cluster.
    */
  var revision: Input[Double]
}

object ClusterConfigurationInfo {
  @scala.inline
  def apply(arn: Input[String], revision: Input[Double]): ClusterConfigurationInfo = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterConfigurationInfo]
  }
}

