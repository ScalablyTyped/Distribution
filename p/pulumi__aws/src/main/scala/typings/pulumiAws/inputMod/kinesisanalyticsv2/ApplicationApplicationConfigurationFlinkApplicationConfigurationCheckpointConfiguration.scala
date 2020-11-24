package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration extends js.Object {
  
  /**
    * Describes the interval in milliseconds between checkpoint operations.
    */
  var checkpointInterval: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Describes whether checkpointing is enabled for a Flink-based Kinesis Data Analytics application.
    */
  var checkpointingEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Describes whether the application uses Kinesis Data Analytics' default checkpointing behavior. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `checkpointingEnabled`, `checkpointInterval`, or `minPauseBetweenCheckpoints` attribute values to be effective. If this attribute is set to `DEFAULT`, the application will always use the following values:
    * * `checkpointingEnabled = true`
    * * `checkpointInterval = 60000`
    * * `minPauseBetweenCheckpoints = 5000`
    */
  var configurationType: Input[String] = js.native
  
  /**
    * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.
    */
  var minPauseBetweenCheckpoints: js.UndefOr[Input[Double]] = js.native
}
object ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration {
  
  @scala.inline
  def apply(configurationType: Input[String]): ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration = {
    val __obj = js.Dynamic.literal(configurationType = configurationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationOps[Self <: ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCheckpointInterval(value: Input[Double]): Self = this.set("checkpointInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckpointInterval: Self = this.set("checkpointInterval", js.undefined)
    
    @scala.inline
    def setCheckpointingEnabled(value: Input[Boolean]): Self = this.set("checkpointingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckpointingEnabled: Self = this.set("checkpointingEnabled", js.undefined)
    
    @scala.inline
    def setMinPauseBetweenCheckpoints(value: Input[Double]): Self = this.set("minPauseBetweenCheckpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPauseBetweenCheckpoints: Self = this.set("minPauseBetweenCheckpoints", js.undefined)
  }
}
