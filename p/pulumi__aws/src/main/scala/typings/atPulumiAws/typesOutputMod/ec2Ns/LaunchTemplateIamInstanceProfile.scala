package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateIamInstanceProfile extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the launch template.
    */
  var arn: js.UndefOr[String] = js.undefined
  /**
    * The name of the launch template. If you leave this blank, this provider will auto-generate a unique name.
    */
  var name: js.UndefOr[String] = js.undefined
}

object LaunchTemplateIamInstanceProfile {
  @scala.inline
  def apply(arn: String = null, name: String = null): LaunchTemplateIamInstanceProfile = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[LaunchTemplateIamInstanceProfile]
  }
}

