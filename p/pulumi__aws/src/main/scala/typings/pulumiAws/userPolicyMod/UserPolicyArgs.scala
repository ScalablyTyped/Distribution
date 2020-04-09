package typings.pulumiAws.userPolicyMod

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPolicyArgs extends js.Object {
  /**
    * The name of the policy. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The policy document. This is a JSON formatted string.
    */
  val policy: Input[String | PolicyDocument] = js.native
  /**
    * IAM user to which to attach this policy.
    */
  val user: Input[String] = js.native
}

object UserPolicyArgs {
  @scala.inline
  def apply(
    policy: Input[String | PolicyDocument],
    user: Input[String],
    name: Input[String] = null,
    namePrefix: Input[String] = null
  ): UserPolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPolicyArgs]
  }
}

