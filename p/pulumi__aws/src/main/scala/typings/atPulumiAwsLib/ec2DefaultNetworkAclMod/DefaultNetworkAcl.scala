package typings
package atPulumiAwsLib.ec2DefaultNetworkAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/defaultNetworkAcl", "DefaultNetworkAcl")
@js.native
class DefaultNetworkAcl protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a DefaultNetworkAcl resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: DefaultNetworkAclArgs) = this()
  def this(name: java.lang.String, args: DefaultNetworkAclArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The Network ACL ID to manage. This
    * attribute is exported from `aws_vpc`, or manually found via the AWS Console.
    */
  val defaultNetworkAclId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Specifies an egress rule. Parameters defined below.
    */
  val egress: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_ActionCidrBlock]]] = js.native
  /**
    * Specifies an ingress rule. Parameters defined below.
    */
  val ingress: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_ActionCidrBlock]]] = js.native
  /**
    * The ID of the AWS account that owns the Default Network ACL
    */
  val ownerId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A list of Subnet IDs to apply the ACL to. See the
    * notes below on managing Subnets in the Default Network ACL
    */
  val subnetIds: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The ID of the associated VPC
    */
  val vpcId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/defaultNetworkAcl", "DefaultNetworkAcl")
@js.native
object DefaultNetworkAcl extends js.Object {
  /**
    * Get an existing DefaultNetworkAcl resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2DefaultNetworkAclMod.DefaultNetworkAcl = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2DefaultNetworkAclMod.DefaultNetworkAclState
  ): atPulumiAwsLib.ec2DefaultNetworkAclMod.DefaultNetworkAcl = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2DefaultNetworkAclMod.DefaultNetworkAclState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2DefaultNetworkAclMod.DefaultNetworkAcl = js.native
}

