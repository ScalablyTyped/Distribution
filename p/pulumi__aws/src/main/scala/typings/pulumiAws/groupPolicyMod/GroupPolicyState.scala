package typings.pulumiAws.groupPolicyMod

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupPolicyState extends js.Object {
  /**
    * The IAM group to attach to the policy.
    */
  val group: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the policy. If omitted, this provider will
    * assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified
    * prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  val policy: js.UndefOr[Input[String | PolicyDocument]] = js.native
}

object GroupPolicyState {
  @scala.inline
  def apply(
    group: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    policy: Input[String | PolicyDocument] = null
  ): GroupPolicyState = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupPolicyState]
  }
}

