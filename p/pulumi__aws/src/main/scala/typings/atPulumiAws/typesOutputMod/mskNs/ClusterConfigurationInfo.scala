package typings.atPulumiAws.typesOutputMod.mskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterConfigurationInfo extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
    */
  var arn: String
  /**
    * Revision of the MSK Configuration to use in the cluster.
    */
  var revision: Double
}

object ClusterConfigurationInfo {
  @scala.inline
  def apply(arn: String, revision: Double): ClusterConfigurationInfo = {
    val __obj = js.Dynamic.literal(arn = arn, revision = revision)
  
    __obj.asInstanceOf[ClusterConfigurationInfo]
  }
}

