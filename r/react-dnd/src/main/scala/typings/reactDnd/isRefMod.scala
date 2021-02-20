package typings.reactDnd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isRefMod {
  
  @JSImport("react-dnd/lib/utils/isRef", "isRef")
  @js.native
  def isRef(obj: js.Any): Boolean = js.native
  
  @js.native
  trait Ref[T] extends StObject {
    
    var current: T = js.native
  }
  object Ref {
    
    @scala.inline
    def apply[T](current: T): Ref[T] = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ref[T]]
    }
    
    @scala.inline
    implicit class RefMutableBuilder[Self <: Ref[_], T] (val x: Self with Ref[T]) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
}
