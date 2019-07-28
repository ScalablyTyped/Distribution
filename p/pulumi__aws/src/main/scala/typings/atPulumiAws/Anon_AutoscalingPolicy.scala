package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoscalingPolicy extends js.Object {
  var autoscalingPolicy: js.UndefOr[String] = js.undefined
  var bidPrice: js.UndefOr[String] = js.undefined
  var ebsConfigs: js.Array[Anon_Iops]
  var id: String
  var instanceCount: js.UndefOr[Double] = js.undefined
  var instanceType: String
  var name: js.UndefOr[String] = js.undefined
}

object Anon_AutoscalingPolicy {
  @scala.inline
  def apply(
    ebsConfigs: js.Array[Anon_Iops],
    id: String,
    instanceType: String,
    autoscalingPolicy: String = null,
    bidPrice: String = null,
    instanceCount: Int | Double = null,
    name: String = null
  ): Anon_AutoscalingPolicy = {
    val __obj = js.Dynamic.literal(ebsConfigs = ebsConfigs, id = id, instanceType = instanceType)
    if (autoscalingPolicy != null) __obj.updateDynamic("autoscalingPolicy")(autoscalingPolicy)
    if (bidPrice != null) __obj.updateDynamic("bidPrice")(bidPrice)
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_AutoscalingPolicy]
  }
}

