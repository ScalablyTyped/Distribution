package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotInstanceRequestCreditSpecification extends js.Object {
  var cpuCredits: js.UndefOr[String] = js.undefined
}

object SpotInstanceRequestCreditSpecification {
  @scala.inline
  def apply(cpuCredits: String = null): SpotInstanceRequestCreditSpecification = {
    val __obj = js.Dynamic.literal()
    if (cpuCredits != null) __obj.updateDynamic("cpuCredits")(cpuCredits)
    __obj.asInstanceOf[SpotInstanceRequestCreditSpecification]
  }
}

