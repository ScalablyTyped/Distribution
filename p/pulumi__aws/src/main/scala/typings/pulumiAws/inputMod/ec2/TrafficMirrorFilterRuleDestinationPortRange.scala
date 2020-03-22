package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorFilterRuleDestinationPortRange extends js.Object {
  /**
    * Starting port of the range
    */
  var fromPort: js.UndefOr[Input[Double]] = js.native
  /**
    * Ending port of the range
    */
  var toPort: js.UndefOr[Input[Double]] = js.native
}

object TrafficMirrorFilterRuleDestinationPortRange {
  @scala.inline
  def apply(fromPort: Input[Double] = null, toPort: Input[Double] = null): TrafficMirrorFilterRuleDestinationPortRange = {
    val __obj = js.Dynamic.literal()
    if (fromPort != null) __obj.updateDynamic("fromPort")(fromPort.asInstanceOf[js.Any])
    if (toPort != null) __obj.updateDynamic("toPort")(toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorFilterRuleDestinationPortRange]
  }
}

