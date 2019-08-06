package typings.atPulumiAws.iamRolePolicyMod

import typings.atPulumiAws.iamDocumentsMod.PolicyDocument
import typings.atPulumiAws.iamRoleMod.Role
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RolePolicyState extends js.Object {
  /**
    * The name of the role policy. If omitted, this provider will
    * assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * The policy document. This is a JSON formatted string.
    */
  val policy: js.UndefOr[Input[String | PolicyDocument]] = js.undefined
  /**
    * The IAM role to attach to the policy.
    */
  val role: js.UndefOr[Input[String | Role]] = js.undefined
}

object RolePolicyState {
  @scala.inline
  def apply(
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    policy: Input[String | PolicyDocument] = null,
    role: Input[String | Role] = null
  ): RolePolicyState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[RolePolicyState]
  }
}

