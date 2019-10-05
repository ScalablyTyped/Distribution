package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceCreditSpecification extends js.Object {
  var cpuCredits: String
}

object GetInstanceCreditSpecification {
  @scala.inline
  def apply(cpuCredits: String): GetInstanceCreditSpecification = {
    val __obj = js.Dynamic.literal(cpuCredits = cpuCredits)
  
    __obj.asInstanceOf[GetInstanceCreditSpecification]
  }
}

