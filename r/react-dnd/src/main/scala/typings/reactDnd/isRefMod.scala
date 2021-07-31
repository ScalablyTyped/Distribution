package typings.reactDnd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isRefMod {
  
  @JSImport("react-dnd/lib/utils/isRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isRef(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRef")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Ref[T] extends StObject {
    
    var current: T
  }
  object Ref {
    
    @scala.inline
    def apply[T](current: T): Ref[T] = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ref[T]]
    }
    
    @scala.inline
    implicit class RefMutableBuilder[Self <: Ref[?], T] (val x: Self & Ref[T]) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
}
