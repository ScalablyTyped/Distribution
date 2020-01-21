package typings.pulumiAws.defaultSecurityGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.DefaultSecurityGroupEgress
import typings.pulumiAws.inputMod.ec2.DefaultSecurityGroupIngress
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultSecurityGroupState extends js.Object {
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Can be specified multiple times for each
    * egress rule. Each egress block supports fields documented below.
    */
  val egress: js.UndefOr[Input[js.Array[Input[DefaultSecurityGroupEgress]]]] = js.native
  /**
    * Can be specified multiple times for each
    * ingress rule. Each ingress block supports fields documented below.
    */
  val ingress: js.UndefOr[Input[js.Array[Input[DefaultSecurityGroupIngress]]]] = js.native
  /**
    * The name of the security group
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The owner ID.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  val revokeRulesOnDelete: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The VPC ID. **Note that changing
    * the `vpcId` will _not_ restore any default security group rules that were
    * modified, added, or removed.** It will be left in its current state
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object DefaultSecurityGroupState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    egress: Input[js.Array[Input[DefaultSecurityGroupEgress]]] = null,
    ingress: Input[js.Array[Input[DefaultSecurityGroupIngress]]] = null,
    name: Input[String] = null,
    ownerId: Input[String] = null,
    revokeRulesOnDelete: Input[Boolean] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcId: Input[String] = null
  ): DefaultSecurityGroupState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (egress != null) __obj.updateDynamic("egress")(egress.asInstanceOf[js.Any])
    if (ingress != null) __obj.updateDynamic("ingress")(ingress.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (revokeRulesOnDelete != null) __obj.updateDynamic("revokeRulesOnDelete")(revokeRulesOnDelete.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSecurityGroupState]
  }
}

