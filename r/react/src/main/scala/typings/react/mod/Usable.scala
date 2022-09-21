package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.react.experimentalMod.reactAugmentingMod.Thenable[T]
  - typings.react.mod.Context[T]
*/
trait Usable[T] extends StObject
object Usable {
  
  inline def Context[T](Consumer: Consumer[T], Provider: Provider[T]): typings.react.mod.Context[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.react.mod.Context[T]]
  }
  
  inline def FulfilledThenable[T](
    `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | js.Thenable[Any],
    value: T
  ): typings.react.experimentalMod.reactAugmentingMod.FulfilledThenable[T] = {
    val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[typings.react.experimentalMod.reactAugmentingMod.FulfilledThenable[T]]
  }
  
  inline def PendingThenable[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | js.Thenable[Any]): typings.react.experimentalMod.reactAugmentingMod.PendingThenable[T] = {
    val __obj = js.Dynamic.literal(status = "pending")
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[typings.react.experimentalMod.reactAugmentingMod.PendingThenable[T]]
  }
  
  inline def RejectedThenable[T](
    reason: Any,
    `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | js.Thenable[Any]
  ): typings.react.experimentalMod.reactAugmentingMod.RejectedThenable[T] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[typings.react.experimentalMod.reactAugmentingMod.RejectedThenable[T]]
  }
  
  inline def UntrackedThenable[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | js.Thenable[Any]): typings.react.experimentalMod.reactAugmentingMod.UntrackedThenable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[typings.react.experimentalMod.reactAugmentingMod.UntrackedThenable[T]]
  }
}
