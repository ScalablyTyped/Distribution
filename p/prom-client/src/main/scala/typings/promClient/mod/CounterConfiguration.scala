package typings.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CounterConfiguration[T /* <: String */]
  extends StObject
     with MetricConfiguration[T] {
  
  @JSName("collect")
  var collect_CounterConfiguration: js.UndefOr[CollectFunction[Counter[T]]] = js.undefined
}
object CounterConfiguration {
  
  inline def apply[T /* <: String */](help: String, name: String): CounterConfiguration[T] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CounterConfiguration[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CounterConfiguration[?], T /* <: String */] (val x: Self & CounterConfiguration[T]) extends AnyVal {
    
    inline def setCollect(value: CollectFunction[Counter[T]]): Self = StObject.set(x, "collect", value.asInstanceOf[js.Any])
    
    inline def setCollectUndefined: Self = StObject.set(x, "collect", js.undefined)
  }
}
