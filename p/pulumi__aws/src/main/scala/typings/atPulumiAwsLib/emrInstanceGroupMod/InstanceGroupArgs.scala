package typings
package atPulumiAwsLib.emrInstanceGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupArgs extends js.Object {
  /**
    * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
    */
  val clusterId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * One or more `ebs_config` blocks as defined below. Changing this forces a new resource to be created.
    */
  val ebsConfigs: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IopsSize]]]
  ] = js.undefined
  /**
    * Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
    */
  val ebsOptimized: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Target number of instances for the instance group. Defaults to 0.
    */
  val instanceCount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
    */
  val instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Human friendly name given to the instance group. Changing this forces a new resource to be created.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object InstanceGroupArgs {
  @scala.inline
  def apply(
    clusterId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    ebsConfigs: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IopsSize]]] = null,
    ebsOptimized: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    instanceCount: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): InstanceGroupArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (ebsConfigs != null) __obj.updateDynamic("ebsConfigs")(ebsConfigs.asInstanceOf[js.Any])
    if (ebsOptimized != null) __obj.updateDynamic("ebsOptimized")(ebsOptimized.asInstanceOf[js.Any])
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupArgs]
  }
}

