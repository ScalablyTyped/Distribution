package typings.smallweiAvue.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataT[T] extends StObject {
  
  var data: T
}
object DataT {
  
  inline def apply[T](data: T): DataT[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataT[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataT[?], T] (val x: Self & DataT[T]) extends AnyVal {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
