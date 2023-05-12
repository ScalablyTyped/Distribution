package typings.smallweiAvue.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataNode[T] extends StObject {
  
  var data: T
  
  var node: DataT[T]
}
object DataNode {
  
  inline def apply[T](data: T, node: DataT[T]): DataNode[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataNode[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataNode[?], T] (val x: Self & DataNode[T]) extends AnyVal {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setNode(value: DataT[T]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
