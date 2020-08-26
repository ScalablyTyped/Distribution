package typings.pulumiAws.identityPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPolicyState extends js.Object {
  /**
    * Name or Amazon Resource Name (ARN) of the SES Identity.
    */
  val identity: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the policy.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * JSON string of the policy.
    */
  val policy: js.UndefOr[Input[String]] = js.native
}

object IdentityPolicyState {
  @scala.inline
  def apply(): IdentityPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityPolicyState]
  }
  @scala.inline
  implicit class IdentityPolicyStateOps[Self <: IdentityPolicyState] (val x: Self) extends AnyVal {
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
    def setIdentity(value: Input[String]): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
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

