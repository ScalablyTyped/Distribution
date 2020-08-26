package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderAssumeRole extends js.Object {
  var externalId: js.UndefOr[Input[String]] = js.native
  var policy: js.UndefOr[Input[String]] = js.native
  var roleArn: js.UndefOr[Input[String]] = js.native
  var sessionName: js.UndefOr[Input[String]] = js.native
}

object ProviderAssumeRole {
  @scala.inline
  def apply(): ProviderAssumeRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderAssumeRole]
  }
  @scala.inline
  implicit class ProviderAssumeRoleOps[Self <: ProviderAssumeRole] (val x: Self) extends AnyVal {
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
    def setExternalId(value: Input[String]): Self = this.set("externalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    @scala.inline
    def setSessionName(value: Input[String]): Self = this.set("sessionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionName: Self = this.set("sessionName", js.undefined)
  }
  
}

