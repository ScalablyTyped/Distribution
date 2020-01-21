package typings.pulumiAws.acceleratorMod

import typings.pulumiAws.outputMod.globalaccelerator.AcceleratorAttributes
import typings.pulumiAws.outputMod.globalaccelerator.AcceleratorIpSet
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/globalaccelerator/accelerator", "Accelerator")
@js.native
class Accelerator protected () extends CustomResource {
  /**
    * Create a Accelerator resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: AcceleratorArgs) = this()
  def this(name: String, args: AcceleratorArgs, opts: CustomResourceOptions) = this()
  /**
    * The attributes of the accelerator. Fields documented below.
    */
  val attributes: Output_[js.UndefOr[AcceleratorAttributes]] = js.native
  /**
    * Indicates whether the accelerator is enabled. The value is true or false. The default value is true.
    */
  val enabled: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The value for the address type must be `IPV4`.
    */
  val ipAddressType: Output_[js.UndefOr[String]] = js.native
  /**
    * IP address set associated with the accelerator.
    */
  val ipSets: Output_[js.Array[AcceleratorIpSet]] = js.native
  /**
    * The name of the accelerator.
    */
  val name: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/globalaccelerator/accelerator", "Accelerator")
@js.native
object Accelerator extends js.Object {
  /**
    * Get an existing Accelerator resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Accelerator = js.native
  def get(name: String, id: Input[ID], state: AcceleratorState): Accelerator = js.native
  def get(name: String, id: Input[ID], state: AcceleratorState, opts: CustomResourceOptions): Accelerator = js.native
  /**
    * Returns true if the given object is an instance of Accelerator.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/accelerator.Accelerator */ Boolean = js.native
}

