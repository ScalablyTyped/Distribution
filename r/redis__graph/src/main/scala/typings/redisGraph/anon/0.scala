package typings.redisGraph.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[T] extends StObject {
  
  var data: js.UndefOr[js.Array[T]] = js.undefined
}
object `0` {
  
  inline def apply[T](): `0`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[T]]
  }
  
  extension [Self <: `0`[?], T](x: Self & `0`[T]) {
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
