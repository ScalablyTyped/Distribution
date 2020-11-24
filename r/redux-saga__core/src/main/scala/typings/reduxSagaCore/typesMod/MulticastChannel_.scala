package typings.reduxSagaCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MulticastChannel_[T] extends js.Object {
  
  def close(): Unit = js.native
  
  def put(message: T): Unit = js.native
  def put(message: END): Unit = js.native
  
  def take(cb: js.Function1[/* message */ T | END, Unit]): Unit = js.native
  def take(
    cb: js.Function1[/* message */ T | END, Unit],
    matcher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Predicate<T> */ js.Any
  ): Unit = js.native
}
