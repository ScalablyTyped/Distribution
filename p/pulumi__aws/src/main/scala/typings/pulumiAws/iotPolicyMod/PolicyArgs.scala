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
  def apply(policy: Input[String]): PolicyArgs = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyArgs]
  }
  @scala.inline
  implicit class PolicyArgsOps[Self <: PolicyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

