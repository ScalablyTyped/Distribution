package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration extends js.Object {
  
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
    def setConfigurationType(value: Input[String]): Self = this.set("configurationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingEnabled(value: Input[Boolean]): Self = this.set("autoScalingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingEnabled: Self = this.set("autoScalingEnabled", js.undefined)
    
    @scala.inline
    def setParallelism(value: Input[Double]): Self = this.set("parallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelism: Self = this.set("parallelism", js.undefined)
    
    @scala.inline
    def setParallelismPerKpu(value: Input[Double]): Self = this.set("parallelismPerKpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelismPerKpu: Self = this.set("parallelismPerKpu", js.undefined)
  }
}
