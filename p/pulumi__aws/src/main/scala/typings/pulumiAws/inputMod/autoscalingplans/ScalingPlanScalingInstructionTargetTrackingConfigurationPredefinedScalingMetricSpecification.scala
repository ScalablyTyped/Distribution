package typings.pulumiAws.inputMod.autoscalingplans

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification extends js.Object {
  
  /**
    * The metric type. Valid values: `ALBRequestCountPerTarget`, `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, `DynamoDBReadCapacityUtilization`, `DynamoDBWriteCapacityUtilization`, `ECSServiceAverageCPUUtilization`, `ECSServiceAverageMemoryUtilization`, `EC2SpotFleetRequestAverageCPUUtilization`, `EC2SpotFleetRequestAverageNetworkIn`, `EC2SpotFleetRequestAverageNetworkOut`, `RDSReaderAverageCPUUtilization`, `RDSReaderAverageDatabaseConnections`.
    */
  var predefinedScalingMetricType: Input[String] = js.native
  
  /**
    * Identifies the resource associated with the metric type.
    */
  var resourceLabel: js.UndefOr[Input[String]] = js.native
}
object ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification {
  
  @scala.inline
  def apply(predefinedScalingMetricType: Input[String]): ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification = {
    val __obj = js.Dynamic.literal(predefinedScalingMetricType = predefinedScalingMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification]
  }
  
  @scala.inline
  implicit class ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationOps[Self <: ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecification] (val x: Self) extends AnyVal {
    
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
    def setPredefinedScalingMetricType(value: Input[String]): Self = this.set("predefinedScalingMetricType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLabel(value: Input[String]): Self = this.set("resourceLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceLabel: Self = this.set("resourceLabel", js.undefined)
  }
}
