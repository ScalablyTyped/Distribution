package typings
package socketclusterLib.socketclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KillWorkersOptions extends js.Object {
  // Shut down the workers immediately without waiting for termination timeout.
  var immediate: js.UndefOr[scala.Boolean] = js.undefined
  // Shut down the cluster master (load balancer) as well as all the workers.
  var killClusterMaster: js.UndefOr[scala.Boolean] = js.undefined
}

object KillWorkersOptions {
  @scala.inline
  def apply(
    immediate: js.UndefOr[scala.Boolean] = js.undefined,
    killClusterMaster: js.UndefOr[scala.Boolean] = js.undefined
  ): KillWorkersOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (!js.isUndefined(killClusterMaster)) __obj.updateDynamic("killClusterMaster")(killClusterMaster)
    __obj.asInstanceOf[KillWorkersOptions]
  }
}

