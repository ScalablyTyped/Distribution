package typings.pulumiAws.networkAclMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.NetworkAclEgress
import typings.pulumiAws.outputMod.ec2.NetworkAclIngress
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
    */
  val egress: Output_[js.Array[NetworkAclEgress]] = js.native
  /**
    * Specifies an ingress rule. Parameters defined below.
    */
  val ingress: Output_[js.Array[NetworkAclIngress]] = js.native
  /**
    * The ID of the AWS account that owns the network ACL.
    */
  val ownerId: Output_[String] = js.native
  /**
    * A list of Subnet IDs to apply the ACL to
    */
  val subnetIds: Output_[js.Array[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The ID of the associated VPC.
    */
  val vpcId: Output_[String] = js.native
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

