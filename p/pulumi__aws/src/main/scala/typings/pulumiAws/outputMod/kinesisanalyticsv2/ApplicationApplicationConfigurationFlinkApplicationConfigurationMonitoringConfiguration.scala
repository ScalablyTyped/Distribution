package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration extends StObject {
  
  /**
    * Describes whether to use the default CloudWatch logging configuration for an application. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `logLevel` or `metricsLevel` attribute values to be effective.
    */
  var configurationType: String = js.native
  
  /**
    * Describes the verbosity of the CloudWatch Logs for an application. Valid values: `DEBUG`, `ERROR`, `INFO`, `WARN`.
    */
  var logLevel: String = js.native
  
  /**
    * Describes the granularity of the CloudWatch Logs for an application. Valid values: `APPLICATION`, `OPERATOR`, `PARALLELISM`, `TASK`.
    */
  var metricsLevel: String = js.native
}
object ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration {
  
  @scala.inline
  def apply(configurationType: String, logLevel: String, metricsLevel: String): ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration = {
    val __obj = js.Dynamic.literal(configurationType = configurationType.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], metricsLevel = metricsLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationMutableBuilder[Self <: ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationType(value: String): Self = StObject.set(x, "configurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsLevel(value: String): Self = StObject.set(x, "metricsLevel", value.asInstanceOf[js.Any])
  }
}
