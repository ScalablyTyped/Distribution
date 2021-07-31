package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MetricValueStatus holds the current value for a metric
  */
trait MetricValueStatus extends StObject {
  
  /**
    * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
    */
  var averageUtilization: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
    */
  var averageValue: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * value is the current value of the metric (as a quantity).
    */
  var value: js.UndefOr[Input[String]] = js.undefined
}
object MetricValueStatus {
  
  @scala.inline
  def apply(): MetricValueStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricValueStatus]
  }
  
  @scala.inline
  implicit class MetricValueStatusMutableBuilder[Self <: MetricValueStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverageUtilization(value: Input[Double]): Self = StObject.set(x, "averageUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageUtilizationUndefined: Self = StObject.set(x, "averageUtilization", js.undefined)
    
    @scala.inline
    def setAverageValue(value: Input[String]): Self = StObject.set(x, "averageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageValueUndefined: Self = StObject.set(x, "averageValue", js.undefined)
    
    @scala.inline
    def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
