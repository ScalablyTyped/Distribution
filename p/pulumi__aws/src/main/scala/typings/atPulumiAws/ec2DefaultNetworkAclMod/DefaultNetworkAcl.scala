package typings.atPulumiAws.ec2DefaultNetworkAclMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.DefaultNetworkAclEgress
import typings.atPulumiAws.typesOutputMod.ec2.DefaultNetworkAclIngress
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/defaultNetworkAcl", "DefaultNetworkAcl")
@js.native
class DefaultNetworkAcl protected () extends CustomResource {
  /**
    * Create a DefaultNetworkAcl resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DefaultNetworkAclArgs) = this()
  def this(name: String, args: DefaultNetworkAclArgs, opts: CustomResourceOptions) = this()
  /**
    * The Network ACL ID to manage. This
    * attribute is exported from `aws.ec2.Vpc`, or manually found via the AWS Console.
    */
  val defaultNetworkAclId: Output[String] = js.native
  /**
    * Specifies an egress rule. Parameters defined below.
    */
  val egress: Output[js.UndefOr[js.Array[DefaultNetworkAclEgress]]] = js.native
  /**
    * Specifies an ingress rule. Parameters defined below.
    */
  val ingress: Output[js.UndefOr[js.Array[DefaultNetworkAclIngress]]] = js.native
  /**
    * The ID of the AWS account that owns the Default Network ACL
    */
  val ownerId: Output[String] = js.native
  /**
    * A list of Subnet IDs to apply the ACL to. See the
    * notes below on managing Subnets in the Default Network ACL
    */
  val subnetIds: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The ID of the associated VPC
    */
  val vpcId: Output[String] = js.native
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
  def get(name: String, id: Input[ID]): DefaultNetworkAcl = js.native
  def get(name: String, id: Input[ID], state: DefaultNetworkAclState): DefaultNetworkAcl = js.native
  def get(name: String, id: Input[ID], state: DefaultNetworkAclState, opts: CustomResourceOptions): DefaultNetworkAcl = js.native
  /**
    * Returns true if the given object is an instance of DefaultNetworkAcl.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultNetworkAcl.DefaultNetworkAcl */ Boolean = js.native
}

