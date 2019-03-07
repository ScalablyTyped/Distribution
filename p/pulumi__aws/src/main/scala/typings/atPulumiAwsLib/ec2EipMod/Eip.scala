package typings
package atPulumiAwsLib.ec2EipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/eip", "Eip")
@js.native
class Eip protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Eip resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: EipArgs) = this()
  def this(name: java.lang.String, args: EipArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val allocationId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A user specified primary or secondary private IP address to
    * associate with the Elastic IP address. If no private IP address is specified,
    * the Elastic IP address is associated with the primary private IP address.
    */
  val associateWithPrivateIp: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  val associationId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val domain: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * EC2 instance ID.
    */
  val instance: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Network interface ID to associate with.
    */
  val networkInterface: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Contains the private IP address (if in VPC).
    */
  val privateIp: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Contains the public IP address.
    */
  val publicIp: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
    */
  val publicIpv4Pool: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Boolean if the EIP is in a VPC or not.
    */
  val vpc: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/eip", "Eip")
@js.native
object Eip extends js.Object {
  /**
    * Get an existing Eip resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2EipMod.Eip = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2EipMod.EipState
  ): atPulumiAwsLib.ec2EipMod.Eip = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2EipMod.EipState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2EipMod.Eip = js.native
}

