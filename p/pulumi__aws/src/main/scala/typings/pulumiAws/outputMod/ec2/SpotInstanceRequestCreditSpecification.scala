package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotInstanceRequestCreditSpecification extends js.Object {
  var cpuCredits: js.UndefOr[String] = js.native
}

object SpotInstanceRequestCreditSpecification {
  @scala.inline
  def apply(cpuCredits: String = null): SpotInstanceRequestCreditSpecification = {
    val __obj = js.Dynamic.literal()
    if (cpuCredits != null) __obj.updateDynamic("cpuCredits")(cpuCredits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceRequestCreditSpecification]
  }
}

