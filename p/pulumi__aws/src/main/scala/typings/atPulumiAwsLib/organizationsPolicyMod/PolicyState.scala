package typings
package atPulumiAwsLib.organizationsPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the policy.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The policy content to add to the new policy. For example, if you create a [service control policy (SCP)](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html), this string must be JSON text that specifies the permissions that admins in attached accounts can delegate to their users, groups, and roles. For more information about the SCP syntax, see the [Service Control Policy Syntax documentation](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html).
    */
  val content: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A description to assign to the policy.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The friendly name to assign to the policy.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of policy to create. Currently, the only valid value is `SERVICE_CONTROL_POLICY` (SCP).
    */
  val `type`: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

