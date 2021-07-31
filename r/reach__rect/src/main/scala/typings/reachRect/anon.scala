package typings.reachRect

import typings.react.mod.Ref
import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Rect extends StObject {
    
    var rect: DOMRect
    
    var ref: Ref[js.Any]
  }
  object Rect {
    
    @scala.inline
    def apply(rect: DOMRect): Rect = {
      val __obj = js.Dynamic.literal(rect = rect.asInstanceOf[js.Any], ref = null)
      __obj.asInstanceOf[Rect]
    }
    
    @scala.inline
    implicit class RectMutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRect(value: DOMRect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: Ref[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
}
