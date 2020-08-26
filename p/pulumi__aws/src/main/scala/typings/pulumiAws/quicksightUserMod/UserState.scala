package typings.pulumiAws.quicksightUserMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the user
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  val awsAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * The email address of the user that you want to register.
    */
  val email: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the IAM user or role that you are registering with Amazon QuickSight.
    */
  val iamArn: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts either  `IAM` or `QUICKSIGHT`.
    */
  val identityType: js.UndefOr[Input[String]] = js.native
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
  val userRole: js.UndefOr[Input[String]] = js.native
}

object UserState {
  @scala.inline
  def apply(): UserState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserState]
  }
  @scala.inline
  implicit class UserStateOps[Self <: UserState] (val x: Self) extends AnyVal {
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
    def setAwsAccountId(value: Input[String]): Self = this.set("awsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsAccountId: Self = this.set("awsAccountId", js.undefined)
    @scala.inline
    def setEmail(value: Input[String]): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setIamArn(value: Input[String]): Self = this.set("iamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamArn: Self = this.set("iamArn", js.undefined)
    @scala.inline
    def setIdentityType(value: Input[String]): Self = this.set("identityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityType: Self = this.set("identityType", js.undefined)
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
    @scala.inline
    def setUserRole(value: Input[String]): Self = this.set("userRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserRole: Self = this.set("userRole", js.undefined)
  }
  
}

