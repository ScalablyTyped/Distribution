package typings.q.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("q", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Calling with nothing at all creates a void promise
    */
  def apply(): Promise[Unit] = js.native
  def apply[T](promise: T): Promise[T] = js.native
  /**
    * If value is a Q promise, returns the promise.
    * If value is a promise from another library it is coerced into a Q promise (where possible).
    * If value is not a promise, returns a promise that is fulfilled with value.
    */
  def apply[T](promise: js.Thenable[T]): Promise[T] = js.native
  
  var longStackSupport: Boolean = js.native
  
  var onerror: js.Function1[/* reason */ js.Any, Unit] = js.native
}
