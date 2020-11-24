package typings.pulumiAws.inputMod.autoscalingplans

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingPlanScalingInstructionCustomizedLoadMetricSpecification extends js.Object {
  
  /**
    * The dimensions of the metric.
    */
  var dimensions: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The name of the metric.
    */
  var metricName: Input[String] = js.native
  
  /**
    * The namespace of the metric.
    */
  var namespace: Input[String] = js.native
  
  /**
    * The statistic of the metric. Currently, the value must always be `Sum`.
    */
  var statistic: Input[String] = js.native
  
  /**
    * The unit of the metric.
    */
  var unit: js.UndefOr[Input[String]] = js.native
}
object ScalingPlanScalingInstructionCustomizedLoadMetricSpecification {
  
  @scala.inline
  def apply(metricName: Input[String], namespace: Input[String], statistic: Input[String]): ScalingPlanScalingInstructionCustomizedLoadMetricSpecification = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPlanScalingInstructionCustomizedLoadMetricSpecification]
  }
  
  @scala.inline
  implicit class ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationOps[Self <: ScalingPlanScalingInstructionCustomizedLoadMetricSpecification] (val x: Self) extends AnyVal {
    
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
    def setMetricName(value: Input[String]): Self = this.set("metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Input[String]): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatistic(value: Input[String]): Self = this.set("statistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensions(value: Input[StringDictionary[Input[String]]]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setUnit(value: Input[String]): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
