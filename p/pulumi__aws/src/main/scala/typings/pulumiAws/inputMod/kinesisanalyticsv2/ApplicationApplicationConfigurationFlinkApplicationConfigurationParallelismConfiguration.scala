package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration extends StObject {
  
  /**
    * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response to increased throughput.
    */
  var autoScalingEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `autoScalingEnabled`, `parallelism`, or `parallelismPerKpu` attribute values to be effective.
    */
  var configurationType: Input[String] = js.native
  
  /**
    * Describes the initial number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform.
    */
  var parallelism: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Describes the number of parallel tasks that a Flink-based Kinesis Data Analytics application can perform per Kinesis Processing Unit (KPU) used by the application.
    */
  var parallelismPerKpu: js.UndefOr[Input[Double]] = js.native
}
object ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration {
  
  @scala.inline
  def apply(configurationType: Input[String]): ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration = {
    val __obj = js.Dynamic.literal(configurationType = configurationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationMutableBuilder[Self <: ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingEnabled(value: Input[Boolean]): Self = StObject.set(x, "autoScalingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingEnabledUndefined: Self = StObject.set(x, "autoScalingEnabled", js.undefined)
    
    @scala.inline
    def setConfigurationType(value: Input[String]): Self = StObject.set(x, "configurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelism(value: Input[Double]): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelismPerKpu(value: Input[Double]): Self = StObject.set(x, "parallelismPerKpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelismPerKpuUndefined: Self = StObject.set(x, "parallelismPerKpu", js.undefined)
    
    @scala.inline
    def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
  }
}
