package typings
package atPulumiAwsLib.ec2DefaultSecurityGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/defaultSecurityGroup", "DefaultSecurityGroup")
@js.native
class DefaultSecurityGroup protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a DefaultSecurityGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: DefaultSecurityGroupArgs) = this()
  def this(name: java.lang.String, args: DefaultSecurityGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Can be specified multiple times for each
    * egress rule. Each egress block supports fields documented below.
    */
  val egress: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_CidrBlocks]]] = js.native
  /**
    * Can be specified multiple times for each
    * ingress rule. Each ingress block supports fields documented below.
    */
  val ingress: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_CidrBlocks]]] = js.native
  /**
    * The name of the security group
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The owner ID.
    */
  val ownerId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  val revokeRulesOnDelete: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The VPC ID. **Note that changing
    * the `vpc_id` will _not_ restore any default security group rules that were
    * modified, added, or removed.** It will be left in its current state
    */
  val vpcId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2DefaultSecurityGroupMod.DefaultSecurityGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2DefaultSecurityGroupMod.DefaultSecurityGroupState
  ): atPulumiAwsLib.ec2DefaultSecurityGroupMod.DefaultSecurityGroup = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2DefaultSecurityGroupMod.DefaultSecurityGroupState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2DefaultSecurityGroupMod.DefaultSecurityGroup = js.native
}

