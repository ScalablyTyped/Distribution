package typings.pulumiAws.outputMod.msk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOpenMonitoringPrometheusJmxExporter extends StObject {
  
  /**
    * Indicates whether you want to enable or disable the JMX Exporter.
    */
  var enabledInBroker: Boolean
}
object ClusterOpenMonitoringPrometheusJmxExporter {
  
  inline def apply(enabledInBroker: Boolean): ClusterOpenMonitoringPrometheusJmxExporter = {
    val __obj = js.Dynamic.literal(enabledInBroker = enabledInBroker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOpenMonitoringPrometheusJmxExporter]
  }
  
  extension [Self <: ClusterOpenMonitoringPrometheusJmxExporter](x: Self) {
    
    inline def setEnabledInBroker(value: Boolean): Self = StObject.set(x, "enabledInBroker", value.asInstanceOf[js.Any])
  }
}
