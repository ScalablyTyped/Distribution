package typings.react

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Context
import typings.react.mod.Provider
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
         with ThenableImpl[T] {
      
      var status: "fulfilled"
      
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
        
        inline def setStatus(value: "fulfilled"): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    trait PendingThenable[T]
      extends StObject
         with ThenableImpl[T] {
      
      var status: "pending"
    }
    object PendingThenable {
      
      inline def apply[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): PendingThenable[T] = {
        val __obj = js.Dynamic.literal(status = "pending")
        __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
        __obj.asInstanceOf[PendingThenable[T]]
      }
      
      extension [Self <: PendingThenable[?], T](x: Self & PendingThenable[T]) {
        
        inline def setStatus(value: "pending"): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    trait RejectedThenable[T]
      extends StObject
         with ThenableImpl[T] {
      
      var reason: Any
      
      var status: "rejected"
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
        
        inline def setStatus(value: "rejected"): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
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
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type ServerContextJSONArray = std.ReadonlyArray<react.react/next.react.ServerContextJSONArray>
    }}}
    to avoid circular code involving: 
    - react.react.ServerContextJSONArray
    - react.react.ServerContextJSONValue
    - react.react/next.react.ServerContextJSONArray
    */
    @js.native
    trait ServerContextJSONArray
      extends StObject
         with ReadonlyArray[ServerContextJSONArray]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type ServerContextJSONValue = string | boolean | number | null | react.react/next.react.ServerContextJSONArray | {[key: string] : react.react/next.react.ServerContextJSONValue}
    }}}
    to avoid circular code involving: 
    - react.react.ServerContextJSONValue
    - react.react/next.react.ServerContextJSONArray
    - react.react/next.react.ServerContextJSONValue
    */
    type ServerContextJSONValue = String | Boolean | Double | Null | Any | StringDictionary[Any]
    
    type Thenable[T] = UntrackedThenable[T] | PendingThenable[T] | FulfilledThenable[T] | RejectedThenable[T]
    
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
         with ThenableImpl[T] {
      
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
    
    type Usable[T] = Thenable[T] | Context[T]
  }
}
