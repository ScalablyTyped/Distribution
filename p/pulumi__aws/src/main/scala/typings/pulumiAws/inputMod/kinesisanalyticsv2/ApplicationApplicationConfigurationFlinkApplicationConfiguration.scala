package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationFlinkApplicationConfiguration extends StObject {
  
  /**
    * Describes an application's checkpointing configuration.
    */
  var checkpointConfiguration: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration
    ]
  ] = js.undefined
  
  /**
    * Describes configuration parameters for CloudWatch logging for an application.
    */
  var monitoringConfiguration: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration
    ]
  ] = js.undefined
  
  /**
    * Describes parameters for how an application executes multiple tasks simultaneously.
    */
  var parallelismConfiguration: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration
    ]
  ] = js.undefined
}
object ApplicationApplicationConfigurationFlinkApplicationConfiguration {
  
  @scala.inline
  def apply(): ApplicationApplicationConfigurationFlinkApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationApplicationConfigurationFlinkApplicationConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationFlinkApplicationConfigurationMutableBuilder[Self <: ApplicationApplicationConfigurationFlinkApplicationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckpointConfiguration(
      value: Input[
          ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration
        ]
    ): Self = StObject.set(x, "checkpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckpointConfigurationUndefined: Self = StObject.set(x, "checkpointConfiguration", js.undefined)
    
    @scala.inline
    def setMonitoringConfiguration(
      value: Input[
          ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration
        ]
    ): Self = StObject.set(x, "monitoringConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringConfigurationUndefined: Self = StObject.set(x, "monitoringConfiguration", js.undefined)
    
    @scala.inline
    def setParallelismConfiguration(
      value: Input[
          ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration
        ]
    ): Self = StObject.set(x, "parallelismConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelismConfigurationUndefined: Self = StObject.set(x, "parallelismConfiguration", js.undefined)
  }
}
