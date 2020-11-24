package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationFlinkApplicationConfiguration extends js.Object {
  
  /**
    * Describes an application's checkpointing configuration.
    */
  var checkpointConfiguration: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration
    ]
  ] = js.native
  
  /**
    * Describes configuration parameters for CloudWatch logging for an application.
    */
  var monitoringConfiguration: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration
    ]
  ] = js.native
  
  /**
    * Describes parameters for how an application executes multiple tasks simultaneously.
    */
  var parallelismConfiguration: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration
    ]
  ] = js.native
}
object ApplicationApplicationConfigurationFlinkApplicationConfiguration {
  
  @scala.inline
  def apply(): ApplicationApplicationConfigurationFlinkApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
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
    def setCheckpointConfiguration(
      value: Input[
          ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration
        ]
    ): Self = this.set("checkpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckpointConfiguration: Self = this.set("checkpointConfiguration", js.undefined)
    
    @scala.inline
    def setMonitoringConfiguration(
      value: Input[
          ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration
        ]
    ): Self = this.set("monitoringConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoringConfiguration: Self = this.set("monitoringConfiguration", js.undefined)
    
    @scala.inline
    def setParallelismConfiguration(
      value: Input[
          ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration
        ]
    ): Self = this.set("parallelismConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelismConfiguration: Self = this.set("parallelismConfiguration", js.undefined)
  }
}
