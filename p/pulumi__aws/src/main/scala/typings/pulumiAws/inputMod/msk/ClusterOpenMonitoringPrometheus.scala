package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterOpenMonitoringPrometheus extends js.Object {
  /**
    * Configuration block for JMX Exporter. See below.
    */
  var jmxExporter: js.UndefOr[Input[ClusterOpenMonitoringPrometheusJmxExporter]] = js.native
  /**
    * Configuration block for Node Exporter. See below.
    */
  var nodeExporter: js.UndefOr[Input[ClusterOpenMonitoringPrometheusNodeExporter]] = js.native
}

object ClusterOpenMonitoringPrometheus {
  @scala.inline
  def apply(): ClusterOpenMonitoringPrometheus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOpenMonitoringPrometheus]
  }
  @scala.inline
  implicit class ClusterOpenMonitoringPrometheusOps[Self <: ClusterOpenMonitoringPrometheus] (val x: Self) extends AnyVal {
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
    def setJmxExporter(value: Input[ClusterOpenMonitoringPrometheusJmxExporter]): Self = this.set("jmxExporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJmxExporter: Self = this.set("jmxExporter", js.undefined)
    @scala.inline
    def setNodeExporter(value: Input[ClusterOpenMonitoringPrometheusNodeExporter]): Self = this.set("nodeExporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeExporter: Self = this.set("nodeExporter", js.undefined)
  }
  
}

