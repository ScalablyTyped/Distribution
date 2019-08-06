package typings.atPulumiAws.iotPolicyMod

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
    * The default version of this policy.
    */
  val defaultVersionId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the policy.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The policy document. This is a JSON formatted string. Use the [IoT Developer Guide](http://docs.aws.amazon.com/iot/latest/developerguide/iot-policies.html) for more information on IoT Policies.
    */
  val policy: js.UndefOr[Input[String]] = js.undefined
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

