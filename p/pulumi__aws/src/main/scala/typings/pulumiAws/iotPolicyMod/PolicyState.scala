package typings.pulumiAws.iotPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyState extends js.Object {
  /**
    * The ARN assigned by AWS to this policy.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The default version of this policy.
    */
  val defaultVersionId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the policy.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The policy document.
    */
  val policy: js.UndefOr[Input[String]] = js.native
}

object PolicyState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    defaultVersionId: Input[String] = null,
    name: Input[String] = null,
    policy: Input[String] = null
  ): PolicyState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (defaultVersionId != null) __obj.updateDynamic("defaultVersionId")(defaultVersionId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyState]
  }
}

