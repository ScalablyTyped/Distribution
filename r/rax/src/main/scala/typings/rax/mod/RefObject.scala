package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefObject[T] extends StObject {
  
  val current: T | Null
}
object RefObject {
  
  inline def apply[T](): RefObject[T] = {
    val __obj = js.Dynamic.literal(current = null)
    __obj.asInstanceOf[RefObject[T]]
  }
  
  extension [Self <: RefObject[?], T](x: Self & RefObject[T]) {
    
    inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentNull: Self = StObject.set(x, "current", null)
  }
}
