package typings.pulumiAws.inputMod.autoscalingplans

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingPlanScalingInstructionPredefinedLoadMetricSpecification extends js.Object {
  
  /**
    * The metric type. Valid values: `ALBTargetGroupRequestCount`, `ASGTotalCPUUtilization`, `ASGTotalNetworkIn`, `ASGTotalNetworkOut`.
    */
  var predefinedLoadMetricType: Input[String] = js.native
  
  /**
    * Identifies the resource associated with the metric type.
    */
  var resourceLabel: js.UndefOr[Input[String]] = js.native
}
object ScalingPlanScalingInstructionPredefinedLoadMetricSpecification {
  
  @scala.inline
  def apply(predefinedLoadMetricType: Input[String]): ScalingPlanScalingInstructionPredefinedLoadMetricSpecification = {
    val __obj = js.Dynamic.literal(predefinedLoadMetricType = predefinedLoadMetricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPlanScalingInstructionPredefinedLoadMetricSpecification]
  }
  
  @scala.inline
  implicit class ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationOps[Self <: ScalingPlanScalingInstructionPredefinedLoadMetricSpecification] (val x: Self) extends AnyVal {
    
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
    def setPredefinedLoadMetricType(value: Input[String]): Self = this.set("predefinedLoadMetricType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLabel(value: Input[String]): Self = this.set("resourceLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceLabel: Self = this.set("resourceLabel", js.undefined)
  }
}
