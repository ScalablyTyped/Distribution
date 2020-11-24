package typings.pulumiAws.outputMod.kinesisanalyticsv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationFlinkApplicationConfiguration extends js.Object {
  
  /**
    * Describes an application's checkpointing configuration.
    */
  var checkpointConfiguration: ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration = js.native
  
  /**
    * Describes configuration parameters for CloudWatch logging for an application.
    */
  var monitoringConfiguration: ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration = js.native
  
  /**
    * Describes parameters for how an application executes multiple tasks simultaneously.
    */
  var parallelismConfiguration: ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration = js.native
}
object ApplicationApplicationConfigurationFlinkApplicationConfiguration {
  
  @scala.inline
  def apply(
    checkpointConfiguration: ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration,
    monitoringConfiguration: ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration,
    parallelismConfiguration: ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration
  ): ApplicationApplicationConfigurationFlinkApplicationConfiguration = {
    val __obj = js.Dynamic.literal(checkpointConfiguration = checkpointConfiguration.asInstanceOf[js.Any], monitoringConfiguration = monitoringConfiguration.asInstanceOf[js.Any], parallelismConfiguration = parallelismConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationFlinkApplicationConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationFlinkApplicationConfigurationOps[Self <: ApplicationApplicationConfigurationFlinkApplicationConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCheckpointConfiguration(value: ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration): Self = this.set("checkpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringConfiguration(value: ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration): Self = this.set("monitoringConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelismConfiguration(value: ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration): Self = this.set("parallelismConfiguration", value.asInstanceOf[js.Any])
  }
}
