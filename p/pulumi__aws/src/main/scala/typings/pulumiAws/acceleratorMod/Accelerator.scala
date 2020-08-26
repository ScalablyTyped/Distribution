package typings.pulumiAws.acceleratorMod

import org.scalablytyped.runtime.StringDictionary
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
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: AcceleratorArgs, opts: CustomResourceOptions) = this()
  /**
    * The attributes of the accelerator. Fields documented below.
    */
  val attributes: Output_[js.UndefOr[AcceleratorAttributes]] = js.native
  /**
    * The DNS name of the accelerator. For example, `a5d53ff5ee6bca4ce.awsglobalaccelerator.com`.
    * * `hostedZoneId` --  The Global Accelerator Route 53 zone ID that can be used to
    * route an [Alias Resource Record Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html) to the Global Accelerator. This attribute
    * is simply an alias for the zone ID `Z2BJ6XQ5FK7U4H`.
    */
  val dnsName: Output_[String] = js.native
  /**
    * Indicates whether the accelerator is enabled. The value is true or false. The default value is true.
    */
  val enabled: Output_[js.UndefOr[Boolean]] = js.native
  val hostedZoneId: Output_[String] = js.native
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
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Accelerator = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Accelerator = js.native
  def get(name: String, id: Input[ID], state: AcceleratorState): Accelerator = js.native
  def get(name: String, id: Input[ID], state: AcceleratorState, opts: CustomResourceOptions): Accelerator = js.native
  /**
    * Returns true if the given object is an instance of Accelerator.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/accelerator.Accelerator */ Boolean = js.native
}

