package typings.react

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Consumer
import typings.react.mod.Provider
import typings.react.reactStrings.fulfilled
import typings.react.reactStrings.pending
import typings.react.reactStrings.rejected
import typings.std.PromiseLike
import typings.std.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextMod {
  
  /* augmented module */
  object reactAugmentingMod {
    
    trait FulfilledThenable[T]
      extends StObject
         with ThenableImpl[T]
         with typings.react.mod.Thenable[T]
         with Thenable[T] {
      
      var status: fulfilled
      
      var value: T
    }
    object FulfilledThenable {
      
      inline def apply[T](
        `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any],
        value: T
      ): FulfilledThenable[T] = {
        val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[FulfilledThenable[T]]
      }
      
      extension [Self <: FulfilledThenable[?], T](x: Self & FulfilledThenable[T]) {
        
        inline def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    trait PendingThenable[T]
      extends StObject
         with ThenableImpl[T]
         with typings.react.mod.Thenable[T]
         with Thenable[T] {
      
      var status: pending
    }
    object PendingThenable {
      
      inline def apply[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): PendingThenable[T] = {
        val __obj = js.Dynamic.literal(status = "pending")
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[PendingThenable[T]]
      }
      
      extension [Self <: PendingThenable[?], T](x: Self & PendingThenable[T]) {
        
        inline def setStatus(value: pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    trait RejectedThenable[T]
      extends StObject
         with ThenableImpl[T]
         with typings.react.mod.Thenable[T]
         with Thenable[T] {
      
      var reason: Any
      
      var status: rejected
    }
    object RejectedThenable {
      
      inline def apply[T](
        reason: Any,
        `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
      ): RejectedThenable[T] = {
        val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[RejectedThenable[T]]
      }
      
      extension [Self <: RejectedThenable[?], T](x: Self & RejectedThenable[T]) {
        
        inline def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    trait ServerContext[T /* <: ServerContextJSONValue */] extends StObject {
      
      var Provider: typings.react.mod.Provider[T]
    }
    object ServerContext {
      
      inline def apply[T /* <: ServerContextJSONValue */](Provider: Provider[T]): ServerContext[T] = {
        val __obj = js.Dynamic.literal(Provider = Provider.asInstanceOf[js.Any])
        __obj.asInstanceOf[ServerContext[T]]
      }
      
      extension [Self <: ServerContext[?], T /* <: ServerContextJSONValue */](x: Self & ServerContext[T]) {
        
        inline def setProvider(value: Provider[T]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ServerContextJSONArray
      extends StObject
         with ReadonlyArray[ServerContextJSONArray]
    
    type ServerContextJSONValue = String | Boolean | Double | Null | Any | StringDictionary[Any]
    
    /* Rewritten from type alias, can be one of: 
      - typings.react.nextMod.reactAugmentingMod.UntrackedThenable[T]
      - typings.react.nextMod.reactAugmentingMod.PendingThenable[T]
      - typings.react.nextMod.reactAugmentingMod.FulfilledThenable[T]
      - typings.react.nextMod.reactAugmentingMod.RejectedThenable[T]
    */
    trait Thenable[T]
      extends StObject
         with typings.react.mod.Usable[T]
         with Usable[T]
    object Thenable {
      
      inline def FulfilledThenable[T](
        `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any],
        value: T
      ): typings.react.nextMod.reactAugmentingMod.FulfilledThenable[T] = {
        val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[typings.react.nextMod.reactAugmentingMod.FulfilledThenable[T]]
      }
      
      inline def PendingThenable[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): typings.react.nextMod.reactAugmentingMod.PendingThenable[T] = {
        val __obj = js.Dynamic.literal(status = "pending")
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[typings.react.nextMod.reactAugmentingMod.PendingThenable[T]]
      }
      
      inline def RejectedThenable[T](
        reason: Any,
        `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
      ): typings.react.nextMod.reactAugmentingMod.RejectedThenable[T] = {
        val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[typings.react.nextMod.reactAugmentingMod.RejectedThenable[T]]
      }
      
      inline def UntrackedThenable[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): typings.react.nextMod.reactAugmentingMod.UntrackedThenable[T] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[typings.react.nextMod.reactAugmentingMod.UntrackedThenable[T]]
      }
    }
    
    trait ThenableImpl[T] extends StObject {
      
      def `then`(onFulfill: js.Function1[/* value */ T, Any], onReject: js.Function1[/* error */ Any, Any]): Unit | PromiseLike[Any]
    }
    object ThenableImpl {
      
      inline def apply[T](
        `then`: (js.Function1[/* value */ T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
      ): ThenableImpl[T] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[ThenableImpl[T]]
      }
      
      extension [Self <: ThenableImpl[?], T](x: Self & ThenableImpl[T]) {
        
        inline def setThen(
          value: (js.Function1[/* value */ T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
        ): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
      }
    }
    
    trait UntrackedThenable[T]
      extends StObject
         with ThenableImpl[T]
         with typings.react.mod.Thenable[T]
         with Thenable[T] {
      
      var status: js.UndefOr[Unit] = js.undefined
    }
    object UntrackedThenable {
      
      inline def apply[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): UntrackedThenable[T] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[UntrackedThenable[T]]
      }
      
      extension [Self <: UntrackedThenable[?], T](x: Self & UntrackedThenable[T]) {
        
        inline def setStatus(value: Unit): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.react.nextMod.reactAugmentingMod.Thenable[T]
      - typings.react.mod.Context[T]
    */
    trait Usable[T] extends StObject
    object Usable {
      
      inline def Context[T](Consumer: Consumer[T], Provider: Provider[T]): typings.react.mod.Context[T] = {
        val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.react.mod.Context[T]]
      }
      
      inline def FulfilledThenable[T](
        `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any],
        value: T
      ): typings.react.nextMod.reactAugmentingMod.FulfilledThenable[T] = {
        val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[typings.react.nextMod.reactAugmentingMod.FulfilledThenable[T]]
      }
      
      inline def PendingThenable[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): typings.react.nextMod.reactAugmentingMod.PendingThenable[T] = {
        val __obj = js.Dynamic.literal(status = "pending")
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[typings.react.nextMod.reactAugmentingMod.PendingThenable[T]]
      }
      
      inline def RejectedThenable[T](
        reason: Any,
        `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
      ): typings.react.nextMod.reactAugmentingMod.RejectedThenable[T] = {
        val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[typings.react.nextMod.reactAugmentingMod.RejectedThenable[T]]
      }
      
      inline def UntrackedThenable[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): typings.react.nextMod.reactAugmentingMod.UntrackedThenable[T] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[typings.react.nextMod.reactAugmentingMod.UntrackedThenable[T]]
      }
    }
  }
}
