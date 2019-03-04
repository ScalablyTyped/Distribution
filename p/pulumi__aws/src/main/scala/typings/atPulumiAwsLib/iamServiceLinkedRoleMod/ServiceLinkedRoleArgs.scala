package typings
package atPulumiAwsLib.iamServiceLinkedRoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceLinkedRoleArgs extends js.Object {
  /**
    * The AWS service to which this role is attached. You use a string similar to a URL but without the `http://` in front. For example: `elasticbeanstalk.amazonaws.com`. To find the full list of services that support service-linked roles, check [the docs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html).
    */
  val awsServiceName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Additional string appended to the role name. Not all AWS services support custom suffixes.
    */
  val customSuffix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The description of the role.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ServiceLinkedRoleArgs {
  @scala.inline
  def apply(
    awsServiceName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    customSuffix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ServiceLinkedRoleArgs = {
    val __obj = js.Dynamic.literal(awsServiceName = awsServiceName.asInstanceOf[js.Any])
    if (customSuffix != null) __obj.updateDynamic("customSuffix")(customSuffix.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceLinkedRoleArgs]
  }
}

