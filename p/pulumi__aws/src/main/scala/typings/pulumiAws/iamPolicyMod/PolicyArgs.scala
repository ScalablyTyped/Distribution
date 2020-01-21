package typings.pulumiAws.iamPolicyMod

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyArgs extends js.Object {
  /**
    * Description of the IAM policy.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the policy. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Path in which to create the policy.
    * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
    */
  val path: js.UndefOr[Input[String]] = js.native
  val policy: Input[String | PolicyDocument] = js.native
}

object PolicyArgs {
  @scala.inline
  def apply(
    policy: Input[String | PolicyDocument],
    description: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    path: Input[String] = null
  ): PolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyArgs]
  }
}

