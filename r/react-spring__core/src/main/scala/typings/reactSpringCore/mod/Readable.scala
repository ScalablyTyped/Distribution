package typings.reactSpringCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
trait Readable[T] extends StObject {
  
  def get(): T
}
object Readable {
  
  inline def apply[T](get: () => T): Readable[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Readable[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readable[?], T] (val x: Self & Readable[T]) extends AnyVal {
    
    inline def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
  }
}
