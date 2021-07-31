package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOpenMonitoringPrometheus extends StObject {
  
  /**
    * Configuration block for JMX Exporter. See below.
    */
  var jmxExporter: js.UndefOr[Input[ClusterOpenMonitoringPrometheusJmxExporter]] = js.undefined
  
  /**
    * Configuration block for Node Exporter. See below.
    */
  var nodeExporter: js.UndefOr[Input[ClusterOpenMonitoringPrometheusNodeExporter]] = js.undefined
}
object ClusterOpenMonitoringPrometheus {
  
  @scala.inline
  def apply(): ClusterOpenMonitoringPrometheus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOpenMonitoringPrometheus]
  }
  
  @scala.inline
  implicit class ClusterOpenMonitoringPrometheusMutableBuilder[Self <: ClusterOpenMonitoringPrometheus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJmxExporter(value: Input[ClusterOpenMonitoringPrometheusJmxExporter]): Self = StObject.set(x, "jmxExporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJmxExporterUndefined: Self = StObject.set(x, "jmxExporter", js.undefined)
    
    @scala.inline
    def setNodeExporter(value: Input[ClusterOpenMonitoringPrometheusNodeExporter]): Self = StObject.set(x, "nodeExporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeExporterUndefined: Self = StObject.set(x, "nodeExporter", js.undefined)
  }
}
