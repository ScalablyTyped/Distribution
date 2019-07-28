package typings.atPulumiAws.iamUserPolicyMod

import typings.atPulumiAws.iamDocumentsMod.PolicyDocument
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPolicyArgs extends js.Object {
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.undefined
  val policy: Input[String | PolicyDocument]
  /**
    * IAM user to which to attach this policy.
    */
  val user: Input[String]
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

