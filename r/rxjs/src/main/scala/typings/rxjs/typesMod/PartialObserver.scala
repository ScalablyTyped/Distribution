package typings.rxjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rxjs.typesMod.NextObserver[T]
  - typings.rxjs.typesMod.ErrorObserver[T]
  - typings.rxjs.typesMod.CompletionObserver[T]
*/
trait PartialObserver[T] extends js.Object
object PartialObserver {
  
  @scala.inline
  def NextObserver[T](next: T => Unit): PartialObserver[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[PartialObserver[T]]
  }
  
  @scala.inline
  def ErrorObserver[T](error: js.Any => Unit): PartialObserver[T] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
    __obj.asInstanceOf[PartialObserver[T]]
  }
  
  @scala.inline
  def CompletionObserver[T](complete: () => Unit): PartialObserver[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PartialObserver[T]]
  }
}
