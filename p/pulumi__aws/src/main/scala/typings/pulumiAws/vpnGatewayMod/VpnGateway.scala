package typings.pulumiAws.vpnGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpnGateway", "VpnGateway")
@js.native
class VpnGateway protected () extends CustomResource {
  /**
    * Create a VpnGateway resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: VpnGatewayArgs) = this()
  def this(name: String, args: VpnGatewayArgs, opts: CustomResourceOptions) = this()
  /**
    * The Autonomous System Number (ASN) for the Amazon side of the gateway. If you don't specify an ASN, the virtual private gateway is created with the default ASN.
    */
  val amazonSideAsn: Output_[String] = js.native
  /**
    * The Availability Zone for the virtual private gateway.
    */
  val availabilityZone: Output_[js.UndefOr[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The VPC ID to create in.
    */
  val vpcId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/vpnGateway", "VpnGateway")
@js.native
object VpnGateway extends js.Object {
  /**
    * Get an existing VpnGateway resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): VpnGateway = js.native
  def get(name: String, id: Input[ID], state: VpnGatewayState): VpnGateway = js.native
  def get(name: String, id: Input[ID], state: VpnGatewayState, opts: CustomResourceOptions): VpnGateway = js.native
  /**
    * Returns true if the given object is an instance of VpnGateway.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnGateway.VpnGateway */ Boolean = js.native
}

