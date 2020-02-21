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
  def apply(
    arn: Input[String] = null,
    awsAccountId: Input[String] = null,
    email: Input[String] = null,
    iamArn: Input[String] = null,
    identityType: Input[String] = null,
    namespace: Input[String] = null,
    sessionName: Input[String] = null,
    userName: Input[String] = null,
    userRole: Input[String] = null
  ): UserState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (awsAccountId != null) __obj.updateDynamic("awsAccountId")(awsAccountId.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (iamArn != null) __obj.updateDynamic("iamArn")(iamArn.asInstanceOf[js.Any])
    if (identityType != null) __obj.updateDynamic("identityType")(identityType.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (sessionName != null) __obj.updateDynamic("sessionName")(sessionName.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    if (userRole != null) __obj.updateDynamic("userRole")(userRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserState]
  }
}

