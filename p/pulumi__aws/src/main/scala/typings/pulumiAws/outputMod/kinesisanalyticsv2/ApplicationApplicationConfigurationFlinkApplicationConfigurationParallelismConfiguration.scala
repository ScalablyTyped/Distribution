package typings.pulumiAws.outputMod.kinesisanalyticsv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration extends js.Object {
  
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
  implicit class ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfigurationOps[Self <: ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAutoScalingEnabled(value: Boolean): Self = this.set("autoScalingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationType(value: String): Self = this.set("configurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelism(value: Double): Self = this.set("parallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelismPerKpu(value: Double): Self = this.set("parallelismPerKpu", value.asInstanceOf[js.Any])
  }
}
