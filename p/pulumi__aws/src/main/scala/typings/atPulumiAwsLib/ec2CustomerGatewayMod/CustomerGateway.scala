package typings
package atPulumiAwsLib.ec2CustomerGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/customerGateway", "CustomerGateway")
@js.native
class CustomerGateway protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a CustomerGateway resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: CustomerGatewayArgs) = this()
  def this(name: java.lang.String, args: CustomerGatewayArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
    */
  val bgpAsn: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * The IP address of the gateway's Internet-routable external interface.
    */
  val ipAddress: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Tags to apply to the gateway.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The type of customer gateway. The only type AWS
    * supports at this time is "ipsec.1".
    */
  val `type`: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/customerGateway", "CustomerGateway")
@js.native
object CustomerGateway extends js.Object {
  /**
    * Get an existing CustomerGateway resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2CustomerGatewayMod.CustomerGateway = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2CustomerGatewayMod.CustomerGatewayState
  ): atPulumiAwsLib.ec2CustomerGatewayMod.CustomerGateway = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2CustomerGatewayMod.CustomerGatewayState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2CustomerGatewayMod.CustomerGateway = js.native
}

