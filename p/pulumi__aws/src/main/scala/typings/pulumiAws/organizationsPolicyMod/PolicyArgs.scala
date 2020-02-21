package typings.pulumiAws.organizationsPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyArgs extends js.Object {
  /**
    * The policy content to add to the new policy. For example, if you create a [service control policy (SCP)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html), this string must be JSON text that specifies the permissions that admins in attached accounts can delegate to their users, groups, and roles. For more information about the SCP syntax, see the [Service Control Policy Syntax documentation](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html) and for more information on the Tag Policy syntax, see the [Tag Policy Syntax documentation](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_example-tag-policies.html).
    */
  val content: Input[String] = js.native
  /**
    * A description to assign to the policy.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The friendly name to assign to the policy.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The type of policy to create. Currently, the only valid values are `SERVICE_CONTROL_POLICY` (SCP) and `TAG_POLICY`. Defaults to `SERVICE_CONTROL_POLICY`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object PolicyArgs {
  @scala.inline
  def apply(
    content: Input[String],
    description: Input[String] = null,
    name: Input[String] = null,
    `type`: Input[String] = null
  ): PolicyArgs = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyArgs]
  }
}

