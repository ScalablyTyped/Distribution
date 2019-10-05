package typings.atPulumiAws.ec2PeeringConnectionOptionsMod

import typings.atPulumiAws.typesOutputMod.ec2.PeeringConnectionOptionsAccepter
import typings.atPulumiAws.typesOutputMod.ec2.PeeringConnectionOptionsRequester
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/peeringConnectionOptions", "PeeringConnectionOptions")
@js.native
class PeeringConnectionOptions protected () extends CustomResource {
  /**
    * Create a PeeringConnectionOptions resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PeeringConnectionOptionsArgs) = this()
  def this(name: String, args: PeeringConnectionOptionsArgs, opts: CustomResourceOptions) = this()
  /**
    * An optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that accepts
    * the peering connection (a maximum of one).
    */
  val accepter: Output[PeeringConnectionOptionsAccepter] = js.native
  /**
    * A optional configuration block that allows for [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options to be set for the VPC that requests
    * the peering connection (a maximum of one).
    */
  val requester: Output[PeeringConnectionOptionsRequester] = js.native
  /**
    * The ID of the requester VPC peering connection.
    */
  val vpcPeeringConnectionId: Output[String] = js.native
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
  def get(name: String, id: Input[ID]): PeeringConnectionOptions = js.native
  def get(name: String, id: Input[ID], state: PeeringConnectionOptionsState): PeeringConnectionOptions = js.native
  def get(name: String, id: Input[ID], state: PeeringConnectionOptionsState, opts: CustomResourceOptions): PeeringConnectionOptions = js.native
  /**
    * Returns true if the given object is an instance of PeeringConnectionOptions.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/peeringConnectionOptions.PeeringConnectionOptions */ Boolean = js.native
}

