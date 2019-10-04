package typings.atPulumiAws.typesOutputMod.emrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterInstanceGroup extends js.Object {
  var autoscalingPolicy: js.UndefOr[String] = js.undefined
  var bidPrice: js.UndefOr[String] = js.undefined
  var ebsConfigs: js.Array[ClusterInstanceGroupEbsConfig]
  /**
    * The ID of the EMR Cluster
    */
  var id: String
  var instanceCount: js.UndefOr[Double] = js.undefined
  var instanceRole: String
  var instanceType: String
  /**
    * The name of the job flow
    */
  var name: js.UndefOr[String] = js.undefined
}

object ClusterInstanceGroup {
  @scala.inline
  def apply(
    ebsConfigs: js.Array[ClusterInstanceGroupEbsConfig],
    id: String,
    instanceRole: String,
    instanceType: String,
    autoscalingPolicy: String = null,
    bidPrice: String = null,
    instanceCount: Int | Double = null,
    name: String = null
  ): ClusterInstanceGroup = {
    val __obj = js.Dynamic.literal(ebsConfigs = ebsConfigs, id = id, instanceRole = instanceRole, instanceType = instanceType)
    if (autoscalingPolicy != null) __obj.updateDynamic("autoscalingPolicy")(autoscalingPolicy)
    if (bidPrice != null) __obj.updateDynamic("bidPrice")(bidPrice)
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ClusterInstanceGroup]
  }
}

