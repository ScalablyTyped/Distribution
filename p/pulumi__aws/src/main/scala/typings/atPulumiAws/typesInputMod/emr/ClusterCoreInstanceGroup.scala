package typings.atPulumiAws.typesInputMod.emr

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterCoreInstanceGroup extends js.Object {
  var autoscalingPolicy: js.UndefOr[Input[String]] = js.undefined
  var bidPrice: js.UndefOr[Input[String]] = js.undefined
  var ebsConfigs: js.UndefOr[Input[js.Array[Input[ClusterCoreInstanceGroupEbsConfig]]]] = js.undefined
  /**
    * The ID of the EMR Cluster
    */
  var id: js.UndefOr[Input[String]] = js.undefined
  var instanceCount: js.UndefOr[Input[Double]] = js.undefined
  var instanceType: Input[String]
  /**
    * The name of the job flow
    */
  var name: js.UndefOr[Input[String]] = js.undefined
}

object ClusterCoreInstanceGroup {
  @scala.inline
  def apply(
    instanceType: Input[String],
    autoscalingPolicy: Input[String] = null,
    bidPrice: Input[String] = null,
    ebsConfigs: Input[js.Array[Input[ClusterCoreInstanceGroupEbsConfig]]] = null,
    id: Input[String] = null,
    instanceCount: Input[Double] = null,
    name: Input[String] = null
  ): ClusterCoreInstanceGroup = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any])
    if (autoscalingPolicy != null) __obj.updateDynamic("autoscalingPolicy")(autoscalingPolicy.asInstanceOf[js.Any])
    if (bidPrice != null) __obj.updateDynamic("bidPrice")(bidPrice.asInstanceOf[js.Any])
    if (ebsConfigs != null) __obj.updateDynamic("ebsConfigs")(ebsConfigs.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCoreInstanceGroup]
  }
}

