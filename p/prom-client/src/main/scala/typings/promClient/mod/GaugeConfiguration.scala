package typings.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GaugeConfiguration[T /* <: String */]
  extends StObject
     with MetricConfiguration[T] {
  
  @JSName("collect")
  var collect_GaugeConfiguration: js.UndefOr[CollectFunction[Gauge[T]]] = js.undefined
}
object GaugeConfiguration {
  
  inline def apply[T /* <: String */](help: String, name: String): GaugeConfiguration[T] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeConfiguration[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GaugeConfiguration[?], T /* <: String */] (val x: Self & GaugeConfiguration[T]) extends AnyVal {
    
    inline def setCollect(value: CollectFunction[Gauge[T]]): Self = StObject.set(x, "collect", value.asInstanceOf[js.Any])
    
    inline def setCollectUndefined: Self = StObject.set(x, "collect", js.undefined)
  }
}
