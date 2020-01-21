package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateMonitoring extends js.Object {
  var enabled: Boolean = js.native
}

object GetLaunchTemplateMonitoring {
  @scala.inline
  def apply(enabled: Boolean): GetLaunchTemplateMonitoring = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLaunchTemplateMonitoring]
  }
}

