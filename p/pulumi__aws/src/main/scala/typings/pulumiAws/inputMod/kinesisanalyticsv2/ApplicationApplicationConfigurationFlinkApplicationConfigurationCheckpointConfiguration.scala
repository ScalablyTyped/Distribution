package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration extends StObject {
  
  /**
    * Describes the interval in milliseconds between checkpoint operations.
    */
  var checkpointInterval: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Describes whether checkpointing is enabled for a Flink-based Kinesis Data Analytics application.
    */
  var checkpointingEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Describes whether the application uses Kinesis Data Analytics' default checkpointing behavior. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `checkpointingEnabled`, `checkpointInterval`, or `minPauseBetweenCheckpoints` attribute values to be effective. If this attribute is set to `DEFAULT`, the application will always use the following values:
    * * `checkpointingEnabled = true`
    * * `checkpointInterval = 60000`
    * * `minPauseBetweenCheckpoints = 5000`
    */
  var configurationType: Input[String]
  
  /**
    * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.
    */
  var minPauseBetweenCheckpoints: js.UndefOr[Input[Double]] = js.undefined
}
object ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration {
  
  @scala.inline
  def apply(configurationType: Input[String]): ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration = {
    val __obj = js.Dynamic.literal(configurationType = configurationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationMutableBuilder[Self <: ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckpointInterval(value: Input[Double]): Self = StObject.set(x, "checkpointInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckpointIntervalUndefined: Self = StObject.set(x, "checkpointInterval", js.undefined)
    
    @scala.inline
    def setCheckpointingEnabled(value: Input[Boolean]): Self = StObject.set(x, "checkpointingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckpointingEnabledUndefined: Self = StObject.set(x, "checkpointingEnabled", js.undefined)
    
    @scala.inline
    def setConfigurationType(value: Input[String]): Self = StObject.set(x, "configurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPauseBetweenCheckpoints(value: Input[Double]): Self = StObject.set(x, "minPauseBetweenCheckpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPauseBetweenCheckpointsUndefined: Self = StObject.set(x, "minPauseBetweenCheckpoints", js.undefined)
  }
}
