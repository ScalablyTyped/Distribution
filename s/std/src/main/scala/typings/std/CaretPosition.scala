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
  
  @scala.inline
  def apply(getClientRect: () => DOMRect | Null, offset: Double, offsetNode: Node): CaretPosition = {
    val __obj = js.Dynamic.literal(getClientRect = js.Any.fromFunction0(getClientRect), offset = offset.asInstanceOf[js.Any], offsetNode = offsetNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaretPosition]
  }
  
  @scala.inline
  implicit class CaretPositionMutableBuilder[Self <: CaretPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetClientRect(value: () => DOMRect | Null): Self = StObject.set(x, "getClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetNode(value: Node): Self = StObject.set(x, "offsetNode", value.asInstanceOf[js.Any])
  }
}
