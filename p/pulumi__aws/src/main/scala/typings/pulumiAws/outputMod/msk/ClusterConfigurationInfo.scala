package typings.pulumiAws.outputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterConfigurationInfo extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
    */
  var arn: String = js.native
  /**
    * Revision of the MSK Configuration to use in the cluster.
    */
  var revision: Double = js.native
}

object ClusterConfigurationInfo {
  @scala.inline
  def apply(arn: String, revision: Double): ClusterConfigurationInfo = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterConfigurationInfo]
  }
}

