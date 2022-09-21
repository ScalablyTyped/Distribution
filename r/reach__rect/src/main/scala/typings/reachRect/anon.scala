package typings.reachRect

import typings.reachRect.srcMod.PRect
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Rect extends StObject {
    
    var rect: PRect | Null
    
    var ref: RefObject[Any]
  }
  object Rect {
    
    inline def apply(ref: RefObject[Any]): Rect = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], rect = null)
      __obj.asInstanceOf[Rect]
    }
    
    extension [Self <: Rect](x: Self) {
      
      inline def setRect(value: PRect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setRectNull: Self = StObject.set(x, "rect", null)
      
      inline def setRef(value: RefObject[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
}
