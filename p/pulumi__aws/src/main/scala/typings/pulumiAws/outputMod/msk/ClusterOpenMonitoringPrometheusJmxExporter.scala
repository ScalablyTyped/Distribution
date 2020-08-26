package typings.pulumiAws.outputMod.msk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterOpenMonitoringPrometheusJmxExporter extends js.Object {
  /**
    * Indicates whether you want to enable or disable the JMX Exporter.
    */
  var enabledInBroker: Boolean = js.native
}

object ClusterOpenMonitoringPrometheusJmxExporter {
  @scala.inline
  def apply(enabledInBroker: Boolean): ClusterOpenMonitoringPrometheusJmxExporter = {
    val __obj = js.Dynamic.literal(enabledInBroker = enabledInBroker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOpenMonitoringPrometheusJmxExporter]
  }
  @scala.inline
  implicit class ClusterOpenMonitoringPrometheusJmxExporterOps[Self <: ClusterOpenMonitoringPrometheusJmxExporter] (val x: Self) extends AnyVal {
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
    def setEnabledInBroker(value: Boolean): Self = this.set("enabledInBroker", value.asInstanceOf[js.Any])
  }
  
}

