package typings.atPulumiAws.iamServiceLinkedRoleMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceLinkedRoleState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the role.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
    */
  val awsServiceName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The creation date of the IAM role.
    */
  val createDate: js.UndefOr[Input[String]] = js.undefined
  /**
    * Additional string appended to the role name. Not all AWS services support custom suffixes.
    */
  val customSuffix: js.UndefOr[Input[String]] = js.undefined
  /**
    * The description of the role.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the role.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The path of the role.
    */
  val path: js.UndefOr[Input[String]] = js.undefined
  /**
    * The stable and unique string identifying the role.
    */
  val uniqueId: js.UndefOr[Input[String]] = js.undefined
}

object ServiceLinkedRoleState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    awsServiceName: Input[String] = null,
    createDate: Input[String] = null,
    customSuffix: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    path: Input[String] = null,
    uniqueId: Input[String] = null
  ): ServiceLinkedRoleState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (awsServiceName != null) __obj.updateDynamic("awsServiceName")(awsServiceName.asInstanceOf[js.Any])
    if (createDate != null) __obj.updateDynamic("createDate")(createDate.asInstanceOf[js.Any])
    if (customSuffix != null) __obj.updateDynamic("customSuffix")(customSuffix.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (uniqueId != null) __obj.updateDynamic("uniqueId")(uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceLinkedRoleState]
  }
}

