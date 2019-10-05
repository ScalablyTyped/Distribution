package typings.atPulumiAws.typesInputMod.ec2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceCreditSpecification extends js.Object {
  var cpuCredits: js.UndefOr[Input[String]] = js.undefined
}

object InstanceCreditSpecification {
  @scala.inline
  def apply(cpuCredits: Input[String] = null): InstanceCreditSpecification = {
    val __obj = js.Dynamic.literal()
    if (cpuCredits != null) __obj.updateDynamic("cpuCredits")(cpuCredits.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceCreditSpecification]
  }
}

