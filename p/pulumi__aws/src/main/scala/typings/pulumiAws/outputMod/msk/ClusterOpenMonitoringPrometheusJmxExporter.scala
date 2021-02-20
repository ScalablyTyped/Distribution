package typings.pulumiAws.outputMod.msk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterOpenMonitoringPrometheusJmxExporter extends StObject {
  
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
  implicit class ClusterOpenMonitoringPrometheusJmxExporterMutableBuilder[Self <: ClusterOpenMonitoringPrometheusJmxExporter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabledInBroker(value: Boolean): Self = StObject.set(x, "enabledInBroker", value.asInstanceOf[js.Any])
  }
}
