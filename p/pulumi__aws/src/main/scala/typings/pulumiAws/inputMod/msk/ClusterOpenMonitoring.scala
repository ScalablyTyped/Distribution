package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterOpenMonitoring extends js.Object {
  /**
    * Configuration block for Prometheus settings for open monitoring. See below.
    */
  var prometheus: Input[ClusterOpenMonitoringPrometheus] = js.native
}

object ClusterOpenMonitoring {
  @scala.inline
  def apply(prometheus: Input[ClusterOpenMonitoringPrometheus]): ClusterOpenMonitoring = {
    val __obj = js.Dynamic.literal(prometheus = prometheus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOpenMonitoring]
  }
}

