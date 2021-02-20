package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MetricTarget defines the target value, average value, or average utilization of a specific metric
  */
@js.native
trait MetricTarget extends StObject {
  
  /**
    * averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type
    */
  var averageUtilization: js.UndefOr[Input[Double]] = js.native
  
  /**
    * averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
    */
  var averageValue: js.UndefOr[Input[String]] = js.native
  
  /**
    * type represents whether the metric type is Utilization, Value, or AverageValue
    */
  var `type`: Input[String] = js.native
  
  /**
    * value is the target value of the metric (as a quantity).
    */
  var value: js.UndefOr[Input[String]] = js.native
}
object MetricTarget {
  
  @scala.inline
  def apply(`type`: Input[String]): MetricTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricTarget]
  }
  
  @scala.inline
  implicit class MetricTargetMutableBuilder[Self <: MetricTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverageUtilization(value: Input[Double]): Self = StObject.set(x, "averageUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageUtilizationUndefined: Self = StObject.set(x, "averageUtilization", js.undefined)
    
    @scala.inline
    def setAverageValue(value: Input[String]): Self = StObject.set(x, "averageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageValueUndefined: Self = StObject.set(x, "averageValue", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
