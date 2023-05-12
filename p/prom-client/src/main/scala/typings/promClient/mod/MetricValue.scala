package typings.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricValue[T /* <: String */] extends StObject {
  
  var labels: LabelValues[T]
  
  var value: Double
}
object MetricValue {
  
  inline def apply[T /* <: String */](labels: LabelValues[T], value: Double): MetricValue[T] = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricValue[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricValue[?], T /* <: String */] (val x: Self & MetricValue[T]) extends AnyVal {
    
    inline def setLabels(value: LabelValues[T]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
