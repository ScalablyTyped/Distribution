package typings.pulumiKubernetes.outputMod.autoscaling.v2beta1

import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
  */
@js.native
trait ExternalMetricStatus extends StObject {
  
  /**
    * currentAverageValue is the current value of metric averaged over autoscaled pods.
    */
  var currentAverageValue: String = js.native
  
  /**
    * currentValue is the current value of the metric (as a quantity)
    */
  var currentValue: String = js.native
  
  /**
    * metricName is the name of a metric used for autoscaling in metric system.
    */
  var metricName: String = js.native
  
  /**
    * metricSelector is used to identify a specific time series within a given metric.
    */
  var metricSelector: LabelSelector = js.native
}
object ExternalMetricStatus {
  
  @scala.inline
  def apply(
    currentAverageValue: String,
    currentValue: String,
    metricName: String,
    metricSelector: LabelSelector
  ): ExternalMetricStatus = {
    val __obj = js.Dynamic.literal(currentAverageValue = currentAverageValue.asInstanceOf[js.Any], currentValue = currentValue.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], metricSelector = metricSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricStatus]
  }
  
  @scala.inline
  implicit class ExternalMetricStatusMutableBuilder[Self <: ExternalMetricStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentAverageValue(value: String): Self = StObject.set(x, "currentAverageValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentValue(value: String): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricSelector(value: LabelSelector): Self = StObject.set(x, "metricSelector", value.asInstanceOf[js.Any])
  }
}
