package typings.pulumiAws.outputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterCoreInstanceGroup extends js.Object {
  var autoscalingPolicy: js.UndefOr[String] = js.native
  var bidPrice: js.UndefOr[String] = js.native
  var ebsConfigs: js.Array[ClusterCoreInstanceGroupEbsConfig] = js.native
  /**
    * The ID of the EMR Cluster
    */
  var id: String = js.native
  var instanceCount: js.UndefOr[Double] = js.native
  var instanceType: String = js.native
  /**
    * The name of the job flow
    */
  var name: js.UndefOr[String] = js.native
}

object ClusterCoreInstanceGroup {
  @scala.inline
  def apply(
    ebsConfigs: js.Array[ClusterCoreInstanceGroupEbsConfig],
    id: String,
    instanceType: String,
    autoscalingPolicy: String = null,
    bidPrice: String = null,
    instanceCount: js.UndefOr[Double] = js.undefined,
    name: String = null
  ): ClusterCoreInstanceGroup = {
    val __obj = js.Dynamic.literal(ebsConfigs = ebsConfigs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    if (autoscalingPolicy != null) __obj.updateDynamic("autoscalingPolicy")(autoscalingPolicy.asInstanceOf[js.Any])
    if (bidPrice != null) __obj.updateDynamic("bidPrice")(bidPrice.asInstanceOf[js.Any])
    if (!js.isUndefined(instanceCount)) __obj.updateDynamic("instanceCount")(instanceCount.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCoreInstanceGroup]
  }
}

