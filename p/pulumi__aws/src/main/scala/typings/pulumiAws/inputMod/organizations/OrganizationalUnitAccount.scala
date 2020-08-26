package typings.pulumiAws.inputMod.organizations

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationalUnitAccount extends js.Object {
  /**
    * ARN of the organizational unit
    */
  var arn: js.UndefOr[Input[String]] = js.native
  /**
    * Email of the account
    */
  var email: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of the organization unit
    */
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * The name for the organizational unit
    */
  var name: js.UndefOr[Input[String]] = js.native
}

object OrganizationalUnitAccount {
  @scala.inline
  def apply(): OrganizationalUnitAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationalUnitAccount]
  }
  @scala.inline
  implicit class OrganizationalUnitAccountOps[Self <: OrganizationalUnitAccount] (val x: Self) extends AnyVal {
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
    def setEmail(value: Input[String]): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

