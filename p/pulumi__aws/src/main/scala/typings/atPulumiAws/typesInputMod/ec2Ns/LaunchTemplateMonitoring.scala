package typings.atPulumiAws.typesInputMod.ec2Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateMonitoring extends js.Object {
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
}

object LaunchTemplateMonitoring {
  @scala.inline
  def apply(enabled: Input[Boolean] = null): LaunchTemplateMonitoring = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateMonitoring]
  }
}

