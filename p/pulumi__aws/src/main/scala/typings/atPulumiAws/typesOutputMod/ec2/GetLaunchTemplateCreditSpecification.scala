package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateCreditSpecification extends js.Object {
  var cpuCredits: String = js.native
}

object GetLaunchTemplateCreditSpecification {
  @scala.inline
  def apply(cpuCredits: String): GetLaunchTemplateCreditSpecification = {
    val __obj = js.Dynamic.literal(cpuCredits = cpuCredits.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLaunchTemplateCreditSpecification]
  }
}

