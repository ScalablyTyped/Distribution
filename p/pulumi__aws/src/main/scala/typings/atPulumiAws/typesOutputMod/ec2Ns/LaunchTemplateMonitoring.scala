package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateMonitoring extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object LaunchTemplateMonitoring {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): LaunchTemplateMonitoring = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[LaunchTemplateMonitoring]
  }
}

