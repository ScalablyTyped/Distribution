package typings.pulumiAws.userGroupMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserGroupState extends js.Object {
  /**
    * The description of the user group.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the user group.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The precedence of the user group.
    */
  val precedence: js.UndefOr[Input[Double]] = js.native
  /**
    * The ARN of the IAM role to be associated with the user group.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The user pool ID.
    */
  val userPoolId: js.UndefOr[Input[String]] = js.native
}

object UserGroupState {
  @scala.inline
  def apply(): UserGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserGroupState]
  }
  @scala.inline
  implicit class UserGroupStateOps[Self <: UserGroupState] (val x: Self) extends AnyVal {
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPrecedence(value: Input[Double]): Self = this.set("precedence", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecedence: Self = this.set("precedence", js.undefined)
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    @scala.inline
    def setUserPoolId(value: Input[String]): Self = this.set("userPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPoolId: Self = this.set("userPoolId", js.undefined)
  }
  
}

