package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationFlinkApplicationConfiguration extends StObject {
  
  /**
    * Describes an application's checkpointing configuration.
    */
  var checkpointConfiguration: ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration
  
  /**
    * Describes configuration parameters for CloudWatch logging for an application.
    */
  var monitoringConfiguration: ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration
  
  /**
    * Describes parameters for how an application executes multiple tasks simultaneously.
    */
  var parallelismConfiguration: ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration
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
  implicit class ApplicationApplicationConfigurationFlinkApplicationConfigurationMutableBuilder[Self <: ApplicationApplicationConfigurationFlinkApplicationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckpointConfiguration(value: ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration): Self = StObject.set(x, "checkpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringConfiguration(value: ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration): Self = StObject.set(x, "monitoringConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelismConfiguration(value: ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration): Self = StObject.set(x, "parallelismConfiguration", value.asInstanceOf[js.Any])
  }
}
