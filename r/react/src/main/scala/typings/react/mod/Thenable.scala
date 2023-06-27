package typings.react.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.react.canaryMod.reactAugmentingMod.UntrackedThenable[T]
  - typings.react.canaryMod.reactAugmentingMod.PendingThenable[T]
  - typings.react.canaryMod.reactAugmentingMod.FulfilledThenable[T]
  - typings.react.canaryMod.reactAugmentingMod.RejectedThenable[T]
*/
trait Thenable[T] extends StObject
object Thenable {
  
  inline def FulfilledThenable[T](
    `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any],
    value: T
  ): typings.react.canaryMod.reactAugmentingMod.FulfilledThenable[T] = {
    val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[typings.react.canaryMod.reactAugmentingMod.FulfilledThenable[T]]
  }
  
  inline def PendingThenable[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): typings.react.canaryMod.reactAugmentingMod.PendingThenable[T] = {
    val __obj = js.Dynamic.literal(status = "pending")
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[typings.react.canaryMod.reactAugmentingMod.PendingThenable[T]]
  }
  
  inline def RejectedThenable[T](
    reason: Any,
    `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
  ): typings.react.canaryMod.reactAugmentingMod.RejectedThenable[T] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[typings.react.canaryMod.reactAugmentingMod.RejectedThenable[T]]
  }
  
  inline def UntrackedThenable[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): typings.react.canaryMod.reactAugmentingMod.UntrackedThenable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[typings.react.canaryMod.reactAugmentingMod.UntrackedThenable[T]]
  }
}
