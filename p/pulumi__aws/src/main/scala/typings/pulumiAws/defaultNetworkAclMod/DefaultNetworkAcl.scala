package typings.pulumiAws.defaultNetworkAclMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.DefaultNetworkAclEgress
import typings.pulumiAws.outputMod.ec2.DefaultNetworkAclIngress
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
    * The ARN of the Default Network ACL
    */
  val arn: Output_[String] = js.native
  /**
    * The Network ACL ID to manage. This
    * attribute is exported from `aws.ec2.Vpc`, or manually found via the AWS Console.
    */
  val defaultNetworkAclId: Output_[String] = js.native
  /**
    * Specifies an egress rule. Parameters defined below.
    */
  val egress: Output_[js.UndefOr[js.Array[DefaultNetworkAclEgress]]] = js.native
  /**
    * Specifies an ingress rule. Parameters defined below.
    */
  val ingress: Output_[js.UndefOr[js.Array[DefaultNetworkAclIngress]]] = js.native
  /**
    * The ID of the AWS account that owns the Default Network ACL
    */
  val ownerId: Output_[String] = js.native
  /**
    * A list of Subnet IDs to apply the ACL to. See the
    * notes below on managing Subnets in the Default Network ACL
    */
  val subnetIds: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The ID of the associated VPC
    */
  val vpcId: Output_[String] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): DefaultNetworkAcl = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DefaultNetworkAcl = js.native
  def get(name: String, id: Input[ID], state: DefaultNetworkAclState): DefaultNetworkAcl = js.native
  def get(name: String, id: Input[ID], state: DefaultNetworkAclState, opts: CustomResourceOptions): DefaultNetworkAcl = js.native
  /**
    * Returns true if the given object is an instance of DefaultNetworkAcl.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultNetworkAcl.DefaultNetworkAcl */ Boolean = js.native
}

