package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetOnDemandOptions extends js.Object {
  /**
    * How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
    */
  var allocationStrategy: js.UndefOr[Input[String]] = js.native
}

object FleetOnDemandOptions {
  @scala.inline
  def apply(): FleetOnDemandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetOnDemandOptions]
  }
  @scala.inline
  implicit class FleetOnDemandOptionsOps[Self <: FleetOnDemandOptions] (val x: Self) extends AnyVal {
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
    def setAllocationStrategy(value: Input[String]): Self = this.set("allocationStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocationStrategy: Self = this.set("allocationStrategy", js.undefined)
  }
  
}

