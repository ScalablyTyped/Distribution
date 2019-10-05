package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceCreditSpecification extends js.Object {
  var cpuCredits: js.UndefOr[String] = js.undefined
}

object InstanceCreditSpecification {
  @scala.inline
  def apply(cpuCredits: String = null): InstanceCreditSpecification = {
    val __obj = js.Dynamic.literal()
    if (cpuCredits != null) __obj.updateDynamic("cpuCredits")(cpuCredits)
    __obj.asInstanceOf[InstanceCreditSpecification]
  }
}

