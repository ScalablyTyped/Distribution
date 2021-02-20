package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration extends StObject {
  
  /**
    * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
    */
  var autoScalingEnabled: Boolean = js.native
  
  /**
    * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `autoScalingEnabled`, `parallelism`, or `parallelismPerKpu` attribute values to be effective.
    */
  var configurationType: String = js.native
  
  /**
    * Describes the initial number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform.
    */
  var parallelism: Double = js.native
  
  /**
    * Describes the number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the application.
    */
  var parallelismPerKpu: Double = js.native
}
object ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration {
  
  @scala.inline
  def apply(
    autoScalingEnabled: Boolean,
    configurationType: String,
    parallelism: Double,
    parallelismPerKpu: Double
  ): ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration = {
    val __obj = js.Dynamic.literal(autoScalingEnabled = autoScalingEnabled.asInstanceOf[js.Any], configurationType = configurationType.asInstanceOf[js.Any], parallelism = parallelism.asInstanceOf[js.Any], parallelismPerKpu = parallelismPerKpu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationMutableBuilder[Self <: ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingEnabled(value: Boolean): Self = StObject.set(x, "autoScalingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationType(value: String): Self = StObject.set(x, "configurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelismPerKpu(value: Double): Self = StObject.set(x, "parallelismPerKpu", value.asInstanceOf[js.Any])
  }
}
