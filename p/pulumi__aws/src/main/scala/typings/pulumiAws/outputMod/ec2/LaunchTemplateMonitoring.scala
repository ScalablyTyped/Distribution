package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateMonitoring extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
}

object LaunchTemplateMonitoring {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): LaunchTemplateMonitoring = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateMonitoring]
  }
}

