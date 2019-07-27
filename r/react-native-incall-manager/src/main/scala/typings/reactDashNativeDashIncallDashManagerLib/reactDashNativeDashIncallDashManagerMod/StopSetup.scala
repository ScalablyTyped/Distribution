package typings
package reactDashNativeDashIncallDashManagerLib.reactDashNativeDashIncallDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopSetup extends js.Object {
  var busytone: js.UndefOr[java.lang.String] = js.undefined
}

object StopSetup {
  @scala.inline
  def apply(busytone: java.lang.String = null): StopSetup = {
    val __obj = js.Dynamic.literal()
    if (busytone != null) __obj.updateDynamic("busytone")(busytone)
    __obj.asInstanceOf[StopSetup]
  }
}

