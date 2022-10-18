package typings.rxjs.distTypesInternalTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rxjs.distTypesInternalTypesMod.NextObserver[T]
  - typings.rxjs.distTypesInternalTypesMod.ErrorObserver[T]
  - typings.rxjs.distTypesInternalTypesMod.CompletionObserver[T]
*/
trait PartialObserver[T] extends StObject
object PartialObserver {
  
  inline def CompletionObserver[T](complete: () => Unit): typings.rxjs.distTypesInternalTypesMod.CompletionObserver[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[typings.rxjs.distTypesInternalTypesMod.CompletionObserver[T]]
  }
  
  inline def ErrorObserver[T](error: Any => Unit): typings.rxjs.distTypesInternalTypesMod.ErrorObserver[T] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
    __obj.asInstanceOf[typings.rxjs.distTypesInternalTypesMod.ErrorObserver[T]]
  }
  
  inline def NextObserver[T](next: T => Unit): typings.rxjs.distTypesInternalTypesMod.NextObserver[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[typings.rxjs.distTypesInternalTypesMod.NextObserver[T]]
  }
}
