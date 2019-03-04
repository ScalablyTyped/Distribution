package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoscalingPolicyBidPrice extends js.Object {
  var autoscalingPolicy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var bidPrice: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var ebsConfigs: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_IopsSize]]]
  ] = js.undefined
  var id: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var instanceCount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var instanceRole: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_AutoscalingPolicyBidPrice {
  @scala.inline
  def apply(
    instanceRole: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    autoscalingPolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    bidPrice: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ebsConfigs: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_IopsSize]]] = null,
    id: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    instanceCount: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_AutoscalingPolicyBidPrice = {
    val __obj = js.Dynamic.literal(instanceRole = instanceRole.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    if (autoscalingPolicy != null) __obj.updateDynamic("autoscalingPolicy")(autoscalingPolicy.asInstanceOf[js.Any])
    if (bidPrice != null) __obj.updateDynamic("bidPrice")(bidPrice.asInstanceOf[js.Any])
    if (ebsConfigs != null) __obj.updateDynamic("ebsConfigs")(ebsConfigs.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoscalingPolicyBidPrice]
  }
}

