package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellularOptions extends js.Object {
  var born: js.UndefOr[rotDashJsLib.rotDashJsMod.Global.Array[scala.Double]] = js.undefined
  // Docs say this exists, even though it's never used:
  var connected: js.UndefOr[scala.Boolean] = js.undefined
  var survive: js.UndefOr[rotDashJsLib.rotDashJsMod.Global.Array[scala.Double]] = js.undefined
  var topology: js.UndefOr[scala.Double] = js.undefined
}

object CellularOptions {
  @scala.inline
  def apply(
    born: rotDashJsLib.rotDashJsMod.Global.Array[scala.Double] = null,
    connected: js.UndefOr[scala.Boolean] = js.undefined,
    survive: rotDashJsLib.rotDashJsMod.Global.Array[scala.Double] = null,
    topology: scala.Int | scala.Double = null
  ): CellularOptions = {
    val __obj = js.Dynamic.literal()
    if (born != null) __obj.updateDynamic("born")(born)
    if (!js.isUndefined(connected)) __obj.updateDynamic("connected")(connected)
    if (survive != null) __obj.updateDynamic("survive")(survive)
    if (topology != null) __obj.updateDynamic("topology")(topology.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellularOptions]
  }
}

