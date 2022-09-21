package typings.rxjs.internalTypesMod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectLike[T]
  extends StObject
     with Observer[T]
     with Subscribable[T]
object SubjectLike {
  
  inline def apply[T](
    complete: () => Unit,
    error: Any => Unit,
    next: T => Unit,
    subscribe: Partial[Observer[T]] => Unsubscribable
  ): SubjectLike[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[SubjectLike[T]]
  }
}
