package typings.atPulumiAws.ec2NetworkAclMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.NetworkAclEgress
import typings.atPulumiAws.typesOutputMod.ec2.NetworkAclIngress
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/networkAcl", "NetworkAcl")
@js.native
class NetworkAcl protected () extends CustomResource {
  /**
    * Create a NetworkAcl resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NetworkAclArgs) = this()
  def this(name: String, args: NetworkAclArgs, opts: CustomResourceOptions) = this()
  /**
    * Specifies an egress rule. Parameters defined below.
    * This argument is processed in [attribute-as-blocks mode](https://www.terraform.io/docs/configuration/attr-as-blocks.html).
    */
  val egress: Output[js.Array[NetworkAclEgress]] = js.native
  /**
    * Specifies an ingress rule. Parameters defined below.
    * This argument is processed in [attribute-as-blocks mode](https://www.terraform.io/docs/configuration/attr-as-blocks.html).
    */
  val ingress: Output[js.Array[NetworkAclIngress]] = js.native
  /**
    * The ID of the AWS account that owns the network ACL.
    */
  val ownerId: Output[String] = js.native
  /**
    * A list of Subnet IDs to apply the ACL to
    */
  val subnetIds: Output[js.Array[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The ID of the associated VPC.
    */
  val vpcId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/networkAcl", "NetworkAcl")
@js.native
object NetworkAcl extends js.Object {
  /**
    * Get an existing NetworkAcl resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): NetworkAcl = js.native
  def get(name: String, id: Input[ID], state: NetworkAclState): NetworkAcl = js.native
  def get(name: String, id: Input[ID], state: NetworkAclState, opts: CustomResourceOptions): NetworkAcl = js.native
  /**
    * Returns true if the given object is an instance of NetworkAcl.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkAcl.NetworkAcl */ Boolean = js.native
}

