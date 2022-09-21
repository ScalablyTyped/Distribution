package typings.rxjs.anon

import typings.rxjs.internalTypesMod.ObservableInput
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
  
  extension [Self <: Selector[?], T](x: Self & Selector[T]) {
    
    inline def setSelector(value: Response => ObservableInput[T]): Self = StObject.set(x, "selector", js.Any.fromFunction1(value))
  }
}
