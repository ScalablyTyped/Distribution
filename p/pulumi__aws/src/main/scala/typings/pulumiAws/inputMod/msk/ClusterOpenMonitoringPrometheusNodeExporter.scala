package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOpenMonitoringPrometheusNodeExporter extends StObject {
  
  /**
    * Indicates whether you want to enable or disable the JMX Exporter.
    */
  var enabledInBroker: Input[Boolean]
}
object ClusterOpenMonitoringPrometheusNodeExporter {
  
  inline def apply(enabledInBroker: Input[Boolean]): ClusterOpenMonitoringPrometheusNodeExporter = {
    val __obj = js.Dynamic.literal(enabledInBroker = enabledInBroker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOpenMonitoringPrometheusNodeExporter]
  }
  
  extension [Self <: ClusterOpenMonitoringPrometheusNodeExporter](x: Self) {
    
    inline def setEnabledInBroker(value: Input[Boolean]): Self = StObject.set(x, "enabledInBroker", value.asInstanceOf[js.Any])
  }
}
