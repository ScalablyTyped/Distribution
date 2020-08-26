package typings.pulumiAws.outputMod.ec2

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
  @scala.inline
  implicit class GetLaunchTemplateCreditSpecificationOps[Self <: GetLaunchTemplateCreditSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCpuCredits(value: String): Self = this.set("cpuCredits", value.asInstanceOf[js.Any])
  }
  
}

