package typings.pulumiAws.outputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterOpenMonitoringPrometheus extends js.Object {
  /**
    * Configuration block for JMX Exporter. See below.
    */
  var jmxExporter: js.UndefOr[ClusterOpenMonitoringPrometheusJmxExporter] = js.native
  /**
    * Configuration block for Node Exporter. See below.
    */
  var nodeExporter: js.UndefOr[ClusterOpenMonitoringPrometheusNodeExporter] = js.native
}

object ClusterOpenMonitoringPrometheus {
  @scala.inline
  def apply(
    jmxExporter: ClusterOpenMonitoringPrometheusJmxExporter = null,
    nodeExporter: ClusterOpenMonitoringPrometheusNodeExporter = null
  ): ClusterOpenMonitoringPrometheus = {
    val __obj = js.Dynamic.literal()
    if (jmxExporter != null) __obj.updateDynamic("jmxExporter")(jmxExporter.asInstanceOf[js.Any])
    if (nodeExporter != null) __obj.updateDynamic("nodeExporter")(nodeExporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOpenMonitoringPrometheus]
  }
}

