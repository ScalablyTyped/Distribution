package typings.smallweiAvue.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node[T] extends StObject {
  
  var node: DataT[T]
}
object Node {
  
  inline def apply[T](node: DataT[T]): Node[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Node[?], T] (val x: Self & Node[T]) extends AnyVal {
    
    inline def setNode(value: DataT[T]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
