package typings.pulumiAws.serviceLinkedRoleMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceLinkedRoleArgs extends js.Object {
  /**
    * The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
    */
  val awsServiceName: Input[String] = js.native
  /**
    * Additional string appended to the role name. Not all AWS services support custom suffixes.
    */
  val customSuffix: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the role.
    */
  val description: js.UndefOr[Input[String]] = js.native
}

object ServiceLinkedRoleArgs {
  @scala.inline
  def apply(
    awsServiceName: Input[String],
    customSuffix: Input[String] = null,
    description: Input[String] = null
  ): ServiceLinkedRoleArgs = {
    val __obj = js.Dynamic.literal(awsServiceName = awsServiceName.asInstanceOf[js.Any])
    if (customSuffix != null) __obj.updateDynamic("customSuffix")(customSuffix.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceLinkedRoleArgs]
  }
}

