package typings.pulumiKubernetes.outputMod.apps.v1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Spec to control the desired behavior of daemon set rolling update.
  */
trait RollingUpdateDaemonSet extends StObject {
  
  /**
    * The maximum number of DaemonSet pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of total number of DaemonSet pods at the start of the update (ex: 10%). Absolute number is calculated from percentage by rounding up. This cannot be 0. Default value is 1. Example: when this is set to 30%, at most 30% of the total number of nodes that should be running the daemon pod (i.e. status.desiredNumberScheduled) can have their pods stopped for an update at any given time. The update starts by stopping at most 30% of those DaemonSet pods and then brings up new DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other DaemonSet pods, thus ensuring that at least 70% of original number of DaemonSet pods are available at all times during the update.
    */
  var maxUnavailable: Double | String
}
object RollingUpdateDaemonSet {
  
  @scala.inline
  def apply(maxUnavailable: Double | String): RollingUpdateDaemonSet = {
    val __obj = js.Dynamic.literal(maxUnavailable = maxUnavailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollingUpdateDaemonSet]
  }
  
  @scala.inline
  implicit class RollingUpdateDaemonSetMutableBuilder[Self <: RollingUpdateDaemonSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxUnavailable(value: Double | String): Self = StObject.set(x, "maxUnavailable", value.asInstanceOf[js.Any])
  }
}
