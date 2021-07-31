package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration extends StObject {
  
  /**
    * Describes whether to use the default CloudWatch logging configuration for an application. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `logLevel` or `metricsLevel` attribute values to be effective.
    */
  var configurationType: Input[String]
  
  /**
    * Describes the verbosity of the CloudWatch Logs for an application. Valid values: `DEBUG`, `ERROR`, `INFO`, `WARN`.
    */
  var logLevel: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Describes the granularity of the CloudWatch Logs for an application. Valid values: `APPLICATION`, `OPERATOR`, `PARALLELISM`, `TASK`.
    */
  var metricsLevel: js.UndefOr[Input[String]] = js.undefined
}
object ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration {
  
  @scala.inline
  def apply(configurationType: Input[String]): ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration = {
    val __obj = js.Dynamic.literal(configurationType = configurationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationMutableBuilder[Self <: ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationType(value: Input[String]): Self = StObject.set(x, "configurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevel(value: Input[String]): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setMetricsLevel(value: Input[String]): Self = StObject.set(x, "metricsLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsLevelUndefined: Self = StObject.set(x, "metricsLevel", js.undefined)
  }
}
