package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorFilterRuleSourcePortRange extends js.Object {
  /**
    * Starting port of the range
    */
  var fromPort: js.UndefOr[Double] = js.native
  /**
    * Ending port of the range
    */
  var toPort: js.UndefOr[Double] = js.native
}

object TrafficMirrorFilterRuleSourcePortRange {
  @scala.inline
  def apply(fromPort: js.UndefOr[Double] = js.undefined, toPort: js.UndefOr[Double] = js.undefined): TrafficMirrorFilterRuleSourcePortRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fromPort)) __obj.updateDynamic("fromPort")(fromPort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toPort)) __obj.updateDynamic("toPort")(toPort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorFilterRuleSourcePortRange]
  }
}

