package typings.atPulumiAws.iamGroupPolicyMod

import typings.atPulumiAws.iamDocumentsMod.PolicyDocument
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupPolicyArgs extends js.Object {
  /**
    * The IAM group to attach to the policy.
    */
  val group: Input[String]
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.undefined
  val policy: Input[String | PolicyDocument]
}

object GroupPolicyArgs {
  @scala.inline
  def apply(
    group: Input[String],
    policy: Input[String | PolicyDocument],
    name: Input[String] = null,
    namePrefix: Input[String] = null
  ): GroupPolicyArgs = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupPolicyArgs]
  }
}

