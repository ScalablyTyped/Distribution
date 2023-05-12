package typings.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricValueWithName[T /* <: String */]
  extends StObject
     with MetricValue[T] {
  
  var metricName: js.UndefOr[String] = js.undefined
}
object MetricValueWithName {
  
  inline def apply[T /* <: String */](labels: LabelValues[T], value: Double): MetricValueWithName[T] = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricValueWithName[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricValueWithName[?], T /* <: String */] (val x: Self & MetricValueWithName[T]) extends AnyVal {
    
    inline def setMetricName(value: String): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
