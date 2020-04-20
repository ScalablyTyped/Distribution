package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateHibernationOptions extends js.Object {
  /**
    * If set to `true`, the launched EC2 instance will hibernation enabled.
    */
  var configured: Input[Boolean] = js.native
}

object LaunchTemplateHibernationOptions {
  @scala.inline
  def apply(configured: Input[Boolean]): LaunchTemplateHibernationOptions = {
    val __obj = js.Dynamic.literal(configured = configured.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateHibernationOptions]
  }
}

