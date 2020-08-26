package typings.pulumiKubernetes.inputMod.apps.v1beta2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Spec to control the desired behavior of daemon set rolling update.
  */
@js.native
trait RollingUpdateDaemonSet extends js.Object {
  /**
    * The maximum number of DaemonSet pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of total number of DaemonSet pods at the start of the update (ex: 10%). Absolute number is calculated from percentage by rounding up. This cannot be 0. Default value is 1. Example: when this is set to 30%, at most 30% of the total number of nodes that should be running the daemon pod (i.e. status.desiredNumberScheduled) can have their pods stopped for an update at any given time. The update starts by stopping at most 30% of those DaemonSet pods and then brings up new DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other DaemonSet pods, thus ensuring that at least 70% of original number of DaemonSet pods are available at all times during the update.
    */
  var maxUnavailable: js.UndefOr[Input[Double | String]] = js.native
}

object RollingUpdateDaemonSet {
  @scala.inline
  def apply(): RollingUpdateDaemonSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollingUpdateDaemonSet]
  }
  @scala.inline
  implicit class RollingUpdateDaemonSetOps[Self <: RollingUpdateDaemonSet] (val x: Self) extends AnyVal {
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
    def setMaxUnavailable(value: Input[Double | String]): Self = this.set("maxUnavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxUnavailable: Self = this.set("maxUnavailable", js.undefined)
  }
  
}

