package typings.atPulumiAws.ec2DefaultSecurityGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.DefaultSecurityGroupEgress
import typings.atPulumiAws.typesOutputMod.ec2.DefaultSecurityGroupIngress
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/defaultSecurityGroup", "DefaultSecurityGroup")
@js.native
class DefaultSecurityGroup protected () extends CustomResource {
  /**
    * Create a DefaultSecurityGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: DefaultSecurityGroupArgs) = this()
  def this(name: String, args: DefaultSecurityGroupArgs, opts: CustomResourceOptions) = this()
  val arn: Output[String] = js.native
  /**
    * Can be specified multiple times for each
    * egress rule. Each egress block supports fields documented below.
    */
  val egress: Output[js.UndefOr[js.Array[DefaultSecurityGroupEgress]]] = js.native
  /**
    * Can be specified multiple times for each
    * ingress rule. Each ingress block supports fields documented below.
    */
  val ingress: Output[js.UndefOr[js.Array[DefaultSecurityGroupIngress]]] = js.native
  /**
    * The name of the security group
    */
  val name: Output[String] = js.native
  /**
    * The owner ID.
    */
  val ownerId: Output[String] = js.native
  val revokeRulesOnDelete: Output[js.UndefOr[Boolean]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The VPC ID. **Note that changing
    * the `vpcId` will _not_ restore any default security group rules that were
    * modified, added, or removed.** It will be left in its current state
    */
  val vpcId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/defaultSecurityGroup", "DefaultSecurityGroup")
@js.native
object DefaultSecurityGroup extends js.Object {
  /**
    * Get an existing DefaultSecurityGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): DefaultSecurityGroup = js.native
  def get(name: String, id: Input[ID], state: DefaultSecurityGroupState): DefaultSecurityGroup = js.native
  def get(name: String, id: Input[ID], state: DefaultSecurityGroupState, opts: CustomResourceOptions): DefaultSecurityGroup = js.native
  /**
    * Returns true if the given object is an instance of DefaultSecurityGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultSecurityGroup.DefaultSecurityGroup */ Boolean = js.native
}

