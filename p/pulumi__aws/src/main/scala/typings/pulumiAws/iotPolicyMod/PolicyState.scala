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
    * The policy document. This is a JSON formatted string. Use the [IoT Developer Guide](http://docs.aws.amazon.com/iot/latest/developerguide/iot-policies.html) for more information on IoT Policies.
    */
  val policy: js.UndefOr[Input[String]] = js.native
}

object PolicyState {
  @scala.inline
  def apply(): PolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyState]
  }
  @scala.inline
  implicit class PolicyStateOps[Self <: PolicyState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDefaultVersionId(value: Input[String]): Self = this.set("defaultVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultVersionId: Self = this.set("defaultVersionId", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
  
}

