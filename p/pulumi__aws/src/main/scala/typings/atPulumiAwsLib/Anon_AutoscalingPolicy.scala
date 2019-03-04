package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoscalingPolicy extends js.Object {
  var autoscalingPolicy: js.UndefOr[java.lang.String] = js.undefined
  var bidPrice: js.UndefOr[java.lang.String] = js.undefined
  var ebsConfigs: js.Array[Anon_Iops]
  var id: java.lang.String
  var instanceCount: js.UndefOr[scala.Double] = js.undefined
  var instanceRole: java.lang.String
  var instanceType: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AutoscalingPolicy {
  @scala.inline
  def apply(
    ebsConfigs: js.Array[Anon_Iops],
    id: java.lang.String,
    instanceRole: java.lang.String,
    instanceType: java.lang.String,
    autoscalingPolicy: java.lang.String = null,
    bidPrice: java.lang.String = null,
    instanceCount: scala.Int | scala.Double = null,
    name: java.lang.String = null
  ): Anon_AutoscalingPolicy = {
    val __obj = js.Dynamic.literal(ebsConfigs = ebsConfigs, id = id, instanceRole = instanceRole, instanceType = instanceType)
    if (autoscalingPolicy != null) __obj.updateDynamic("autoscalingPolicy")(autoscalingPolicy)
    if (bidPrice != null) __obj.updateDynamic("bidPrice")(bidPrice)
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_AutoscalingPolicy]
  }
}

