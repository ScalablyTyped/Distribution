package typings.atPulumiAws.ec2SecurityGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_CidrBlocksDescription
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroupState extends js.Object {
  /**
    * The ARN of the security group
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The security group description. Defaults to
    * "Managed by Pulumi". Cannot be "". __NOTE__: This field maps to the AWS
    * `GroupDescription` attribute, for which there is no Update API. If you'd like
    * to classify your security groups in a way that can be updated, use `tags`.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * Can be specified multiple times for each
    * egress rule. Each egress block supports fields documented below.
    * This argument is processed in [attribute-as-blocks mode](https://www.terraform.io/docs/configuration/attr-as-blocks.html).
    */
  val egress: js.UndefOr[Input[js.Array[Input[Anon_CidrBlocksDescription]]]] = js.undefined
  /**
    * Can be specified multiple times for each
    * ingress rule. Each ingress block supports fields documented below.
    * This argument is processed in [attribute-as-blocks mode](https://www.terraform.io/docs/configuration/attr-as-blocks.html).
    */
  val ingress: js.UndefOr[Input[js.Array[Input[Anon_CidrBlocksDescription]]]] = js.undefined
  /**
    * The name of the security group. If omitted, this provider will
    * assign a random, unique name
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * The owner ID.
    */
  val ownerId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Instruct this provider to revoke all of the
    * Security Groups attached ingress and egress rules before deleting the rule
    * itself. This is normally not needed, however certain AWS services such as
    * Elastic Map Reduce may automatically add required rules to security groups used
    * with the service, and those rules may contain a cyclic dependency that prevent
    * the security groups from being destroyed without removing the dependency first.
    * Default `false`
    */
  val revokeRulesOnDelete: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The VPC ID.
    */
  val vpcId: js.UndefOr[Input[String]] = js.undefined
}

object SecurityGroupState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    egress: Input[js.Array[Input[Anon_CidrBlocksDescription]]] = null,
    ingress: Input[js.Array[Input[Anon_CidrBlocksDescription]]] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    ownerId: Input[String] = null,
    revokeRulesOnDelete: Input[Boolean] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcId: Input[String] = null
  ): SecurityGroupState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (egress != null) __obj.updateDynamic("egress")(egress.asInstanceOf[js.Any])
    if (ingress != null) __obj.updateDynamic("ingress")(ingress.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (revokeRulesOnDelete != null) __obj.updateDynamic("revokeRulesOnDelete")(revokeRulesOnDelete.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGroupState]
  }
}

