package typings.atPulumiAws.iamPolicyMod

import typings.atPulumiAws.iamDocumentsMod.PolicyDocument
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyState extends js.Object {
  /**
    * The ARN assigned by AWS to this policy.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Description of the IAM policy.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the policy. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * Path in which to create the policy.
    * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
    */
  val path: js.UndefOr[Input[String]] = js.undefined
  /**
    * The policy document. This is a JSON formatted string.
    */
  val policy: js.UndefOr[Input[String | PolicyDocument]] = js.undefined
}

object PolicyState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    path: Input[String] = null,
    policy: Input[String | PolicyDocument] = null
  ): PolicyState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyState]
  }
}

