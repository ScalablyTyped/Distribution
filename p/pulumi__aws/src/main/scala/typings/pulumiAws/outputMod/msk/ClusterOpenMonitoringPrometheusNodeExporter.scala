package typings.pulumiAws.outputMod.msk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterOpenMonitoringPrometheusNodeExporter extends StObject {
  
  /**
    * Indicates whether you want to enable or disable the JMX Exporter.
    */
  var enabledInBroker: Boolean = js.native
}
object ClusterOpenMonitoringPrometheusNodeExporter {
  
  @scala.inline
  def apply(enabledInBroker: Boolean): ClusterOpenMonitoringPrometheusNodeExporter = {
    val __obj = js.Dynamic.literal(enabledInBroker = enabledInBroker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOpenMonitoringPrometheusNodeExporter]
  }
  
  @scala.inline
  implicit class ClusterOpenMonitoringPrometheusNodeExporterMutableBuilder[Self <: ClusterOpenMonitoringPrometheusNodeExporter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabledInBroker(value: Boolean): Self = StObject.set(x, "enabledInBroker", value.asInstanceOf[js.Any])
  }
}
