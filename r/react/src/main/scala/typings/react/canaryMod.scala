package typings.react

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Consumer
import typings.react.mod.Provider
import typings.react.reactStrings.fulfilled
import typings.react.reactStrings.pending
import typings.react.reactStrings.rejected
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canaryMod {
  
  /* augmented module */
  object reactAugmentingMod {
    
    @JSImport("react", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def cache[CachedFunction /* <: js.Function */](fn: CachedFunction): CachedFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")(fn.asInstanceOf[js.Any]).asInstanceOf[CachedFunction]
    
    inline def createServerContext[T /* <: ServerContextJSONValue */](globalName: String, defaultValue: T): ServerContext[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[ServerContext[T]]
    
    inline def unstableUseCacheRefresh(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useCacheRefresh")().asInstanceOf[js.Function0[Unit]]
    
    inline def use[T](usable: Usable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(usable.asInstanceOf[js.Any]).asInstanceOf[T]
    
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: FulfilledThenable[?], T] (val x: Self & FulfilledThenable[T]) extends AnyVal {
        
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PendingThenable[?], T] (val x: Self & PendingThenable[T]) extends AnyVal {
        
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RejectedThenable[?], T] (val x: Self & RejectedThenable[T]) extends AnyVal {
        
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ServerContext[?], T /* <: ServerContextJSONValue */] (val x: Self & ServerContext[T]) extends AnyVal {
        
        inline def setProvider(value: Provider[T]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
      }
    }
    
    type ServerContextJSONArray = js.Array[ServerContextJSONValue]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type ServerContextJSONValue = string | boolean | number | null | react.react/canary.react.ServerContextJSONArray | {[key: string] : react.react/canary.react.ServerContextJSONValue}
    }}}
    to avoid circular code involving: 
    - react.react.ServerContextJSONArray
    - react.react.ServerContextJSONValue
    - react.react/canary.react.ServerContextJSONArray
    - react.react/canary.react.ServerContextJSONValue
    */
    type ServerContextJSONValue = String | Boolean | Double | Null | Any | StringDictionary[Any]
    
    /* Rewritten from type alias, can be one of: 
      - typings.react.canaryMod.reactAugmentingMod.UntrackedThenable[T]
      - typings.react.canaryMod.reactAugmentingMod.PendingThenable[T]
      - typings.react.canaryMod.reactAugmentingMod.FulfilledThenable[T]
      - typings.react.canaryMod.reactAugmentingMod.RejectedThenable[T]
    */
    trait Thenable[T]
      extends StObject
         with typings.react.mod.Usable[T]
         with Usable[T]
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ThenableImpl[?], T] (val x: Self & ThenableImpl[T]) extends AnyVal {
        
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: UntrackedThenable[?], T] (val x: Self & UntrackedThenable[T]) extends AnyVal {
        
        inline def setStatus(value: Unit): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.react.canaryMod.reactAugmentingMod.Thenable[T]
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
  }
}
