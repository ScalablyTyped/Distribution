package typings.pulumiAws.outputMod.msk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOpenMonitoringPrometheus extends StObject {
  
  /**
    * Configuration block for JMX Exporter. See below.
    */
  var jmxExporter: js.UndefOr[ClusterOpenMonitoringPrometheusJmxExporter] = js.undefined
  
  /**
    * Configuration block for Node Exporter. See below.
    */
  var nodeExporter: js.UndefOr[ClusterOpenMonitoringPrometheusNodeExporter] = js.undefined
}
object ClusterOpenMonitoringPrometheus {
  
  inline def apply(): ClusterOpenMonitoringPrometheus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOpenMonitoringPrometheus]
  }
  
  extension [Self <: ClusterOpenMonitoringPrometheus](x: Self) {
    
    inline def setJmxExporter(value: ClusterOpenMonitoringPrometheusJmxExporter): Self = StObject.set(x, "jmxExporter", value.asInstanceOf[js.Any])
    
    inline def setJmxExporterUndefined: Self = StObject.set(x, "jmxExporter", js.undefined)
    
    inline def setNodeExporter(value: ClusterOpenMonitoringPrometheusNodeExporter): Self = StObject.set(x, "nodeExporter", value.asInstanceOf[js.Any])
    
    inline def setNodeExporterUndefined: Self = StObject.set(x, "nodeExporter", js.undefined)
  }
}
