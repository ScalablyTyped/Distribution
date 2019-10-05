package typings.atPulumiAws.typesInputMod.ec2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotInstanceRequestCreditSpecification extends js.Object {
  var cpuCredits: js.UndefOr[Input[String]] = js.undefined
}

object SpotInstanceRequestCreditSpecification {
  @scala.inline
  def apply(cpuCredits: Input[String] = null): SpotInstanceRequestCreditSpecification = {
    val __obj = js.Dynamic.literal()
    if (cpuCredits != null) __obj.updateDynamic("cpuCredits")(cpuCredits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceRequestCreditSpecification]
  }
}

