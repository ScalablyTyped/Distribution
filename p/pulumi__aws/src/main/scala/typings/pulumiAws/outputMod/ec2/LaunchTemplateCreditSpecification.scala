package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateCreditSpecification extends js.Object {
  /**
    * The credit option for CPU usage. Can be `"standard"` or `"unlimited"`. T3 instances are launched as unlimited by default. T2 instances are launched as standard by default.
    */
  var cpuCredits: js.UndefOr[String] = js.native
}

object LaunchTemplateCreditSpecification {
  @scala.inline
  def apply(cpuCredits: String = null): LaunchTemplateCreditSpecification = {
    val __obj = js.Dynamic.literal()
    if (cpuCredits != null) __obj.updateDynamic("cpuCredits")(cpuCredits.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateCreditSpecification]
  }
}

