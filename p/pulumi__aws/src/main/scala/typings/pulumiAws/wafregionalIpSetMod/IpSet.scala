package typings.pulumiAws.wafregionalIpSetMod

import typings.pulumiAws.outputMod.wafregional.IpSetIpSetDescriptor
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/wafregional/ipSet", "IpSet")
@js.native
class IpSet protected () extends CustomResource {
  /**
    * Create a IpSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: IpSetArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: IpSetArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the WAF IPSet.
    */
  val arn: Output_[String] = js.native
  /**
    * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) from which web requests originate.
    */
  val ipSetDescriptors: Output_[js.UndefOr[js.Array[IpSetIpSetDescriptor]]] = js.native
  /**
    * The name or description of the IPSet.
    */
  val name: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/wafregional/ipSet", "IpSet")
@js.native
object IpSet extends js.Object {
  /**
    * Get an existing IpSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): IpSet = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): IpSet = js.native
  def get(name: String, id: Input[ID], state: IpSetState): IpSet = js.native
  def get(name: String, id: Input[ID], state: IpSetState, opts: CustomResourceOptions): IpSet = js.native
  /**
    * Returns true if the given object is an instance of IpSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/ipSet.IpSet */ Boolean = js.native
}

