package typings.atPulumiAws.organizationsPolicyMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the policy.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The policy content to add to the new policy. For example, if you create a [service control policy (SCP)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html), this string must be JSON text that specifies the permissions that admins in attached accounts can delegate to their users, groups, and roles. For more information about the SCP syntax, see the [Service Control Policy Syntax documentation](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html).
    */
  val content: js.UndefOr[Input[String]] = js.undefined
  /**
    * A description to assign to the policy.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The friendly name to assign to the policy.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of policy to create. Currently, the only valid value is `SERVICE_CONTROL_POLICY` (SCP).
    */
  val `type`: js.UndefOr[Input[String]] = js.undefined
}

object PolicyState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    content: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    `type`: Input[String] = null
  ): PolicyState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyState]
  }
}

