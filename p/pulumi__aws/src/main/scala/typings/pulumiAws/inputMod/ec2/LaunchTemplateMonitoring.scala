package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateMonitoring extends js.Object {
  var enabled: js.UndefOr[Input[Boolean]] = js.native
}

object LaunchTemplateMonitoring {
  @scala.inline
  def apply(enabled: Input[Boolean] = null): LaunchTemplateMonitoring = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateMonitoring]
  }
}

