package typings.rxjs.anon

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selector[T] extends StObject {
  
  def selector(response: Response): ObservableInput[T]
}
object Selector {
  
  inline def apply[T](selector: Response => ObservableInput[T]): Selector[T] = {
    val __obj = js.Dynamic.literal(selector = js.Any.fromFunction1(selector))
    __obj.asInstanceOf[Selector[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Selector[?], T] (val x: Self & Selector[T]) extends AnyVal {
    
    inline def setSelector(value: Response => ObservableInput[T]): Self = StObject.set(x, "selector", js.Any.fromFunction1(value))
  }
}
