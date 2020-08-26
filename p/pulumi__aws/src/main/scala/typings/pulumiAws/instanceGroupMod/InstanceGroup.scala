package typings.pulumiAws.instanceGroupMod

import typings.pulumiAws.outputMod.emr.InstanceGroupEbsConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/emr/instanceGroup", "InstanceGroup")
@js.native
class InstanceGroup protected () extends CustomResource {
  /**
    * Create a InstanceGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: InstanceGroupArgs) = this()
  def this(name: String, args: InstanceGroupArgs, opts: CustomResourceOptions) = this()
  /**
    * The autoscaling policy document. This is a JSON formatted string. See [EMR Auto Scaling](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-automatic-scaling.html)
    */
  val autoscalingPolicy: Output_[js.UndefOr[String]] = js.native
  /**
    * If set, the bid price for each EC2 instance in the instance group, expressed in USD. By setting this attribute, the instance group is being declared as a Spot Instance, and will implicitly create a Spot request. Leave this blank to use On-Demand Instances.
    */
  val bidPrice: Output_[js.UndefOr[String]] = js.native
  /**
    * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
    */
  val clusterId: Output_[String] = js.native
  /**
    * A JSON string for supplying list of configurations specific to the EMR instance group. Note that this can only be changed when using EMR release 5.21 or later.
    */
  val configurationsJson: Output_[js.UndefOr[String]] = js.native
  /**
    * One or more `ebsConfig` blocks as defined below. Changing this forces a new resource to be created.
    */
  val ebsConfigs: Output_[js.Array[InstanceGroupEbsConfig]] = js.native
  /**
    * Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
    */
  val ebsOptimized: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * target number of instances for the instance group. defaults to 0.
    */
  val instanceCount: Output_[js.UndefOr[Double]] = js.native
  /**
    * The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
    */
  val instanceType: Output_[String] = js.native
  /**
    * Human friendly name given to the instance group. Changing this forces a new resource to be created.
    */
  val name: Output_[String] = js.native
  val runningInstanceCount: Output_[Double] = js.native
  val status: Output_[String] = js.native
}

/* static members */
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): InstanceGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): InstanceGroup = js.native
  def get(name: String, id: Input[ID], state: InstanceGroupState): InstanceGroup = js.native
  def get(name: String, id: Input[ID], state: InstanceGroupState, opts: CustomResourceOptions): InstanceGroup = js.native
  /**
    * Returns true if the given object is an instance of InstanceGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/instanceGroup.InstanceGroup */ Boolean = js.native
}

