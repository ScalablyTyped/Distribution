package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMQuad extends StObject {
  
  def getBounds(): DOMRect
  
  val p1: DOMPoint
  
  val p2: DOMPoint
  
  val p3: DOMPoint
  
  val p4: DOMPoint
  
  def toJSON(): js.Any
}
object DOMQuad {
  
  @scala.inline
  def apply(
    getBounds: () => DOMRect,
    p1: DOMPoint,
    p2: DOMPoint,
    p3: DOMPoint,
    p4: DOMPoint,
    toJSON: () => js.Any
  ): DOMQuad = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds), p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any], p4 = p4.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[DOMQuad]
  }
  
  @scala.inline
  implicit class DOMQuadMutableBuilder[Self <: DOMQuad] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBounds(value: () => DOMRect): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setP1(value: DOMPoint): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP2(value: DOMPoint): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP3(value: DOMPoint): Self = StObject.set(x, "p3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP4(value: DOMPoint): Self = StObject.set(x, "p4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
