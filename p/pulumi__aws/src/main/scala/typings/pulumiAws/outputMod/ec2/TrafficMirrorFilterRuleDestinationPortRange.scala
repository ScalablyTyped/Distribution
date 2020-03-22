package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorFilterRuleDestinationPortRange extends js.Object {
  /**
    * Starting port of the range
    */
  var fromPort: js.UndefOr[Double] = js.native
  /**
    * Ending port of the range
    */
  var toPort: js.UndefOr[Double] = js.native
}

object TrafficMirrorFilterRuleDestinationPortRange {
  @scala.inline
  def apply(fromPort: Int | Double = null, toPort: Int | Double = null): TrafficMirrorFilterRuleDestinationPortRange = {
    val __obj = js.Dynamic.literal()
    if (fromPort != null) __obj.updateDynamic("fromPort")(fromPort.asInstanceOf[js.Any])
    if (toPort != null) __obj.updateDynamic("toPort")(toPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorFilterRuleDestinationPortRange]
  }
}

