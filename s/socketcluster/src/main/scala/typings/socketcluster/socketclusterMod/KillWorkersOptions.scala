package typings.socketcluster.socketclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KillWorkersOptions extends js.Object {
  // Shut down the workers immediately without waiting for termination timeout.
  var immediate: js.UndefOr[Boolean] = js.undefined
  // Shut down the cluster master (load balancer) as well as all the workers.
  var killClusterMaster: js.UndefOr[Boolean] = js.undefined
}

object KillWorkersOptions {
  @scala.inline
  def apply(
    immediate: js.UndefOr[Boolean] = js.undefined,
    killClusterMaster: js.UndefOr[Boolean] = js.undefined
  ): KillWorkersOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (!js.isUndefined(killClusterMaster)) __obj.updateDynamic("killClusterMaster")(killClusterMaster.asInstanceOf[js.Any])
    __obj.asInstanceOf[KillWorkersOptions]
  }
}

