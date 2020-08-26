package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorFilterRuleSourcePortRange extends js.Object {
  /**
    * Starting port of the range
    */
  var fromPort: js.UndefOr[Input[Double]] = js.native
  /**
    * Ending port of the range
    */
  var toPort: js.UndefOr[Input[Double]] = js.native
}

object TrafficMirrorFilterRuleSourcePortRange {
  @scala.inline
  def apply(): TrafficMirrorFilterRuleSourcePortRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorFilterRuleSourcePortRange]
  }
  @scala.inline
  implicit class TrafficMirrorFilterRuleSourcePortRangeOps[Self <: TrafficMirrorFilterRuleSourcePortRange] (val x: Self) extends AnyVal {
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
    def setFromPort(value: Input[Double]): Self = this.set("fromPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromPort: Self = this.set("fromPort", js.undefined)
    @scala.inline
    def setToPort(value: Input[Double]): Self = this.set("toPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToPort: Self = this.set("toPort", js.undefined)
  }
  
}

