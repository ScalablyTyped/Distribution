package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration extends js.Object {
  
  /**
    * Describes whether to use the default CloudWatch logging configuration for an application. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `logLevel` or `metricsLevel` attribute values to be effective.
    */
  var configurationType: Input[String] = js.native
  
  /**
    * Describes the verbosity of the CloudWatch Logs for an application. Valid values: `DEBUG`, `ERROR`, `INFO`, `WARN`.
    */
  var logLevel: js.UndefOr[Input[String]] = js.native
  
  /**
    * Describes the granularity of the CloudWatch Logs for an application. Valid values: `APPLICATION`, `OPERATOR`, `PARALLELISM`, `TASK`.
    */
  var metricsLevel: js.UndefOr[Input[String]] = js.native
}
object ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration {
  
  @scala.inline
  def apply(configurationType: Input[String]): ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration = {
    val __obj = js.Dynamic.literal(configurationType = configurationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfigurationOps[Self <: ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration] (val x: Self) extends AnyVal {
    
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
    def setConfigurationType(value: Input[String]): Self = this.set("configurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevel(value: Input[String]): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setMetricsLevel(value: Input[String]): Self = this.set("metricsLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricsLevel: Self = this.set("metricsLevel", js.undefined)
  }
}
