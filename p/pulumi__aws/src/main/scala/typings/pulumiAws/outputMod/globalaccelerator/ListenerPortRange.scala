package typings.pulumiAws.outputMod.globalaccelerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerPortRange extends js.Object {
  /**
    * The first port in the range of ports, inclusive.
    */
  var fromPort: js.UndefOr[Double] = js.native
  /**
    * The last port in the range of ports, inclusive.
    */
  var toPort: js.UndefOr[Double] = js.native
}

object ListenerPortRange {
  @scala.inline
  def apply(fromPort: js.UndefOr[Double] = js.undefined, toPort: js.UndefOr[Double] = js.undefined): ListenerPortRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fromPort)) __obj.updateDynamic("fromPort")(fromPort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toPort)) __obj.updateDynamic("toPort")(toPort.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerPortRange]
  }
}

