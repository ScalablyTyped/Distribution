package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateIamInstanceProfile extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  var arn: js.UndefOr[String] = js.native
  /**
    * The name of the instance profile.
    */
  var name: js.UndefOr[String] = js.native
}

object LaunchTemplateIamInstanceProfile {
  @scala.inline
  def apply(arn: String = null, name: String = null): LaunchTemplateIamInstanceProfile = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateIamInstanceProfile]
  }
}

