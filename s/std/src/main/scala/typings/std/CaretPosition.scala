package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaretPosition extends StObject {
  
  def getClientRect(): DOMRect | Null
  
  val offset: Double
  
  val offsetNode: Node
}
object CaretPosition {
  
  inline def apply(getClientRect: () => DOMRect | Null, offset: Double, offsetNode: Node): CaretPosition = {
    val __obj = js.Dynamic.literal(getClientRect = js.Any.fromFunction0(getClientRect), offset = offset.asInstanceOf[js.Any], offsetNode = offsetNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaretPosition]
  }
  
  extension [Self <: CaretPosition](x: Self) {
    
    inline def setGetClientRect(value: () => DOMRect | Null): Self = StObject.set(x, "getClientRect", js.Any.fromFunction0(value))
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNode(value: Node): Self = StObject.set(x, "offsetNode", value.asInstanceOf[js.Any])
  }
}
