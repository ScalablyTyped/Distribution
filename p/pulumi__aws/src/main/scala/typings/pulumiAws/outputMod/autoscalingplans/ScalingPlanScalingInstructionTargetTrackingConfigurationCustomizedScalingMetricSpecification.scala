package typings.pulumiAws.outputMod.autoscalingplans

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification extends js.Object {
  
  /**
    * The dimensions of the metric.
    */
  var dimensions: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The name of the metric.
    */
  var metricName: String = js.native
  
  /**
    * The namespace of the metric.
    */
  var namespace: String = js.native
  
  /**
    * The statistic of the metric. Valid values: `Average`, `Maximum`, `Minimum`, `SampleCount`, `Sum`.
    */
  var statistic: String = js.native
  
  /**
    * The unit of the metric.
    */
  var unit: js.UndefOr[String] = js.native
}
object ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification {
  
  @scala.inline
  def apply(metricName: String, namespace: String, statistic: String): ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], statistic = statistic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification]
  }
  
  @scala.inline
  implicit class ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationOps[Self <: ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecification] (val x: Self) extends AnyVal {
    
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
    def setMetricName(value: String): Self = this.set("metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatistic(value: String): Self = this.set("statistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensions(value: StringDictionary[String]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
