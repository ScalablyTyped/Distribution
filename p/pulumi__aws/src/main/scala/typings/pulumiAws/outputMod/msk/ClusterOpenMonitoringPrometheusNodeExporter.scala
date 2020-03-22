package typings.pulumiAws.outputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterOpenMonitoringPrometheusNodeExporter extends js.Object {
  /**
    * Indicates whether you want to enable or disable the Node Exporter.
    */
  var enabledInBroker: Boolean = js.native
}

object ClusterOpenMonitoringPrometheusNodeExporter {
  @scala.inline
  def apply(enabledInBroker: Boolean): ClusterOpenMonitoringPrometheusNodeExporter = {
    val __obj = js.Dynamic.literal(enabledInBroker = enabledInBroker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterOpenMonitoringPrometheusNodeExporter]
  }
}

