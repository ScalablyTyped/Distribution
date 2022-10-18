package typings.reactDnd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInternalsIsRefMod {
  
  @JSImport("react-dnd/dist/internals/isRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isRef(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRef")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Ref[T] extends StObject {
    
    var current: T
  }
  object Ref {
    
    inline def apply[T](current: T): Ref[T] = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ref[T]]
    }
    
    extension [Self <: Ref[?], T](x: Self & Ref[T]) {
      
      inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
}
