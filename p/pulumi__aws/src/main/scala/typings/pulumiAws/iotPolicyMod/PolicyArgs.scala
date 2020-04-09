package typings.pulumiAws.iotPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyArgs extends js.Object {
  /**
    * The name of the policy.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The policy document. This is a JSON formatted string. Use the [IoT Developer Guide](http://docs.aws.amazon.com/iot/latest/developerguide/iot-policies.html) for more information on IoT Policies.
    */
  val policy: Input[String] = js.native
}

object PolicyArgs {
  @scala.inline
  def apply(policy: Input[String], name: Input[String] = null): PolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyArgs]
  }
}

