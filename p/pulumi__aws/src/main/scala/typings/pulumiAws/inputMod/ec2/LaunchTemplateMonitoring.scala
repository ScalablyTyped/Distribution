package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateMonitoring extends js.Object {
  /**
    * If `true`, the launched EC2 instance will have detailed monitoring enabled.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
}

object LaunchTemplateMonitoring {
  @scala.inline
  def apply(): LaunchTemplateMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateMonitoring]
  }
  @scala.inline
  implicit class LaunchTemplateMonitoringOps[Self <: LaunchTemplateMonitoring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

