package typings.atPulumiAws.typesInputMod.ec2Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateIamInstanceProfile extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the launch template.
    */
  var arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the launch template. If you leave this blank, this provider will auto-generate a unique name.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
}

object LaunchTemplateIamInstanceProfile {
  @scala.inline
  def apply(arn: Input[String] = null, name: Input[String] = null): LaunchTemplateIamInstanceProfile = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateIamInstanceProfile]
  }
}

