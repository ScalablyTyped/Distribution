package typings.atPulumiAws.typesOutputMod.emrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterCoreInstanceGroup extends js.Object {
  var autoscalingPolicy: js.UndefOr[String] = js.undefined
  var bidPrice: js.UndefOr[String] = js.undefined
  var ebsConfigs: js.Array[ClusterCoreInstanceGroupEbsConfig]
  /**
    * The ID of the EMR Cluster
    */
  var id: String
  var instanceCount: js.UndefOr[Double] = js.undefined
  var instanceType: String
  /**
    * The name of the job flow
    */
  var name: js.UndefOr[String] = js.undefined
}

object ClusterCoreInstanceGroup {
  @scala.inline
  def apply(
    ebsConfigs: js.Array[ClusterCoreInstanceGroupEbsConfig],
    id: String,
    instanceType: String,
    autoscalingPolicy: String = null,
    bidPrice: String = null,
    instanceCount: Int | Double = null,
    name: String = null
  ): ClusterCoreInstanceGroup = {
    val __obj = js.Dynamic.literal(ebsConfigs = ebsConfigs, id = id, instanceType = instanceType)
    if (autoscalingPolicy != null) __obj.updateDynamic("autoscalingPolicy")(autoscalingPolicy)
    if (bidPrice != null) __obj.updateDynamic("bidPrice")(bidPrice)
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ClusterCoreInstanceGroup]
  }
}

