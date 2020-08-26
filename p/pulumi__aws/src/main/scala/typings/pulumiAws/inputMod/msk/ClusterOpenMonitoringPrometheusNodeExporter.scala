package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterOpenMonitoringPrometheusNodeExporter extends js.Object {
  /**
    * Indicates whether you want to enable or disable the JMX Exporter.
    */
  var enabledInBroker: Input[Boolean] = js.native
}

object ClusterOpenMonitoringPrometheusNodeExporter {
  @scala.inline
  def apply(enabledInBroker: Input[Boolean]): ClusterOpenMonitoringPrometheusNodeExporter = {
    val __obj = js.Dynamic.literal(enabledInBroker = enabledInBroker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOpenMonitoringPrometheusNodeExporter]
  }
  @scala.inline
  implicit class ClusterOpenMonitoringPrometheusNodeExporterOps[Self <: ClusterOpenMonitoringPrometheusNodeExporter] (val x: Self) extends AnyVal {
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
    def setEnabledInBroker(value: Input[Boolean]): Self = this.set("enabledInBroker", value.asInstanceOf[js.Any])
  }
  
}

