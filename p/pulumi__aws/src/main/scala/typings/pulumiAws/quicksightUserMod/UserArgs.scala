package typings.pulumiAws.quicksightUserMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserArgs extends js.Object {
  /**
    * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  val awsAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * The email address of the user that you want to register.
    */
  val email: Input[String] = js.native
  /**
    * The ARN of the IAM user or role that you are registering with Amazon QuickSight.
    */
  val iamArn: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts either  `IAM` or `QUICKSIGHT`.
    */
  val identityType: Input[String] = js.native
  /**
    * The namespace. Currently, you should set this to `default`.
    */
  val namespace: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the IAM session to use when assuming roles that can embed QuickSight dashboards.
    */
  val sessionName: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon QuickSight user name that you want to create for the user you are registering.
    */
  val userName: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon QuickSight role of the user. The user role can be one of the following: `READER`, `AUTHOR`, or `ADMIN`
    */
  val userRole: Input[String] = js.native
}

object UserArgs {
  @scala.inline
  def apply(email: Input[String], identityType: Input[String], userRole: Input[String]): UserArgs = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], identityType = identityType.asInstanceOf[js.Any], userRole = userRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserArgs]
  }
  @scala.inline
  implicit class UserArgsOps[Self <: UserArgs] (val x: Self) extends AnyVal {
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
    def setEmail(value: Input[String]): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityType(value: Input[String]): Self = this.set("identityType", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserRole(value: Input[String]): Self = this.set("userRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setAwsAccountId(value: Input[String]): Self = this.set("awsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsAccountId: Self = this.set("awsAccountId", js.undefined)
    @scala.inline
    def setIamArn(value: Input[String]): Self = this.set("iamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamArn: Self = this.set("iamArn", js.undefined)
    @scala.inline
    def setNamespace(value: Input[String]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setSessionName(value: Input[String]): Self = this.set("sessionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionName: Self = this.set("sessionName", js.undefined)
    @scala.inline
    def setUserName(value: Input[String]): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
  
}

