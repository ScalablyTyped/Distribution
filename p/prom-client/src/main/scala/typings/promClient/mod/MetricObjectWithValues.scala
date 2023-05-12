package typings.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricObjectWithValues[T /* <: MetricValue[String] */]
  extends StObject
     with MetricObject {
  
  var values: js.Array[T]
}
object MetricObjectWithValues {
  
  inline def apply[T /* <: MetricValue[String] */](
    aggregator: Aggregator,
    collect: CollectFunction[Any],
    help: String,
    name: String,
    `type`: MetricType,
    values: js.Array[T]
  ): MetricObjectWithValues[T] = {
    val __obj = js.Dynamic.literal(aggregator = aggregator.asInstanceOf[js.Any], collect = collect.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricObjectWithValues[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricObjectWithValues[?], T /* <: MetricValue[String] */] (val x: Self & MetricObjectWithValues[T]) extends AnyVal {
    
    inline def setValues(value: js.Array[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: T*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
