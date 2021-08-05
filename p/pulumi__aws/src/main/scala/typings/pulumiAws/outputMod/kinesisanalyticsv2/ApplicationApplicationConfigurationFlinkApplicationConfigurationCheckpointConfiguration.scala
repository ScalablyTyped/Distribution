package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration extends StObject {
  
  /**
    * Describes the interval in milliseconds between checkpoint operations.
    */
  var checkpointInterval: Double
  
  /**
    * Describes whether checkpointing is enabled for a Flink-based Kinesis Data Analytics application.
    */
  var checkpointingEnabled: Boolean
  
  /**
    * Describes whether the application uses Kinesis Data Analytics' default checkpointing behavior. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `checkpointingEnabled`, `checkpointInterval`, or `minPauseBetweenCheckpoints` attribute values to be effective. If this attribute is set to `DEFAULT`, the application will always use the following values:
    * * `checkpointingEnabled = true`
    * * `checkpointInterval = 60000`
    * * `minPauseBetweenCheckpoints = 5000`
    */
  var configurationType: String
  
  /**
    * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.
    */
  var minPauseBetweenCheckpoints: Double
}
object ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration {
  
  inline def apply(
    checkpointInterval: Double,
    checkpointingEnabled: Boolean,
    configurationType: String,
    minPauseBetweenCheckpoints: Double
  ): ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration = {
    val __obj = js.Dynamic.literal(checkpointInterval = checkpointInterval.asInstanceOf[js.Any], checkpointingEnabled = checkpointingEnabled.asInstanceOf[js.Any], configurationType = configurationType.asInstanceOf[js.Any], minPauseBetweenCheckpoints = minPauseBetweenCheckpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration]
  }
  
  extension [Self <: ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration](x: Self) {
    
    inline def setCheckpointInterval(value: Double): Self = StObject.set(x, "checkpointInterval", value.asInstanceOf[js.Any])
    
    inline def setCheckpointingEnabled(value: Boolean): Self = StObject.set(x, "checkpointingEnabled", value.asInstanceOf[js.Any])
    
    inline def setConfigurationType(value: String): Self = StObject.set(x, "configurationType", value.asInstanceOf[js.Any])
    
    inline def setMinPauseBetweenCheckpoints(value: Double): Self = StObject.set(x, "minPauseBetweenCheckpoints", value.asInstanceOf[js.Any])
  }
}
