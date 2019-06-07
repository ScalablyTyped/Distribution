package typings
package atPulumiAwsLib.ec2PeeringConnectionOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/peeringConnectionOptions", "PeeringConnectionOptions")
@js.native
class PeeringConnectionOptions protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a PeeringConnectionOptions resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: PeeringConnectionOptionsArgs) = this()
  def this(name: java.lang.String, args: PeeringConnectionOptionsArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * An optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that accepts
    * the peering connection (a maximum of one).
    */
  val accepter: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpc] = js.native
  /**
    * A optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that requests
    * the peering connection (a maximum of one).
    */
  val requester: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_AllowClassicLinkToRemoteVpc] = js.native
  /**
    * The ID of the requester VPC peering connection.
    */
  val vpcPeeringConnectionId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/peeringConnectionOptions", "PeeringConnectionOptions")
@js.native
object PeeringConnectionOptions extends js.Object {
  /**
    * Get an existing PeeringConnectionOptions resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2PeeringConnectionOptionsMod.PeeringConnectionOptions = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2PeeringConnectionOptionsMod.PeeringConnectionOptionsState
  ): atPulumiAwsLib.ec2PeeringConnectionOptionsMod.PeeringConnectionOptions = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2PeeringConnectionOptionsMod.PeeringConnectionOptionsState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2PeeringConnectionOptionsMod.PeeringConnectionOptions = js.native
  /**
    * Returns true if the given object is an instance of PeeringConnectionOptions.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/peeringConnectionOptions.PeeringConnectionOptions */ scala.Boolean = js.native
}

