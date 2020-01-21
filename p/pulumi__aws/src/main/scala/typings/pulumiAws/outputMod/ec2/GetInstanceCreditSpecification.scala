package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceCreditSpecification extends js.Object {
  var cpuCredits: String = js.native
}

object GetInstanceCreditSpecification {
  @scala.inline
  def apply(cpuCredits: String): GetInstanceCreditSpecification = {
    val __obj = js.Dynamic.literal(cpuCredits = cpuCredits.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInstanceCreditSpecification]
  }
}

