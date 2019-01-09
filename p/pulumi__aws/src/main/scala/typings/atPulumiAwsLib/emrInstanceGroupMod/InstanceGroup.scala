package typings
package atPulumiAwsLib.emrInstanceGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/emr/instanceGroup", "InstanceGroup")
@js.native
class InstanceGroup protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a InstanceGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: InstanceGroupArgs) = this()
  def this(name: java.lang.String, args: InstanceGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
    */
  val clusterId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * One or more `ebs_config` blocks as defined below. Changing this forces a new resource to be created.
    */
  val ebsConfigs: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_Iops]]] = js.native
  /**
    * Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
    */
  val ebsOptimized: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Target number of instances for the instance group. Defaults to 0.
    */
  val instanceCount: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
    */
  val instanceType: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Human friendly name given to the instance group. Changing this forces a new resource to be created.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val runningInstanceCount: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
  val status: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

@JSImport("@pulumi/aws/emr/instanceGroup", "InstanceGroup")
@js.native
object InstanceGroup extends js.Object {
  /**
    * Get an existing InstanceGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.emrInstanceGroupMod.InstanceGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.emrInstanceGroupMod.InstanceGroupState
  ): atPulumiAwsLib.emrInstanceGroupMod.InstanceGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.emrInstanceGroupMod.InstanceGroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.emrInstanceGroupMod.InstanceGroup = js.native
}

