package typings.rotDashJs.rotDashJsMod

import typings.rotDashJs.rotDashJsMod.Global.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellularOptions extends js.Object {
  var born: js.UndefOr[Array[Double]] = js.undefined
  // Docs say this exists, even though it's never used:
  var connected: js.UndefOr[Boolean] = js.undefined
  var survive: js.UndefOr[Array[Double]] = js.undefined
  var topology: js.UndefOr[Double] = js.undefined
}

object CellularOptions {
  @scala.inline
  def apply(
    born: Array[Double] = null,
    connected: js.UndefOr[Boolean] = js.undefined,
    survive: Array[Double] = null,
    topology: Int | Double = null
  ): CellularOptions = {
    val __obj = js.Dynamic.literal()
    if (born != null) __obj.updateDynamic("born")(born)
    if (!js.isUndefined(connected)) __obj.updateDynamic("connected")(connected)
    if (survive != null) __obj.updateDynamic("survive")(survive)
    if (topology != null) __obj.updateDynamic("topology")(topology.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellularOptions]
  }
}

