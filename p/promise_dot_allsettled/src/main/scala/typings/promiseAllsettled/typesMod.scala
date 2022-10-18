package typings.promiseAllsettled

import typings.promiseAllsettled.promiseAllsettledStrings.fulfilled
import typings.promiseAllsettled.promiseAllsettledStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait PromiseRejection[E]
    extends StObject
       with PromiseResult[Any, E] {
    
    var reason: E
    
    var status: rejected
  }
  object PromiseRejection {
    
    inline def apply[E](reason: E): PromiseRejection[E] = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
      __obj.asInstanceOf[PromiseRejection[E]]
    }
    
    extension [Self <: PromiseRejection[?], E](x: Self & PromiseRejection[E]) {
      
      inline def setReason(value: E): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromiseResolution[T]
    extends StObject
       with PromiseResult[T, Any] {
    
    var status: fulfilled
    
    var value: T
  }
  object PromiseResolution {
    
    inline def apply[T](value: T): PromiseResolution[T] = {
      val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseResolution[T]]
    }
    
    extension [Self <: PromiseResolution[?], T](x: Self & PromiseResolution[T]) {
      
      inline def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.promiseAllsettled.typesMod.PromiseResolution[T]
    - typings.promiseAllsettled.typesMod.PromiseRejection[E]
  */
  trait PromiseResult[T, E] extends StObject
  object PromiseResult {
    
    inline def PromiseRejection[E](reason: E): typings.promiseAllsettled.typesMod.PromiseRejection[E] = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
      __obj.asInstanceOf[typings.promiseAllsettled.typesMod.PromiseRejection[E]]
    }
    
    inline def PromiseResolution[T](value: T): typings.promiseAllsettled.typesMod.PromiseResolution[T] = {
      val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.promiseAllsettled.typesMod.PromiseResolution[T]]
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: promise.allsettled.promise.allsettled/types.PromiseResult<T[P], unknown>}
    }}}
    */
  @js.native
  trait PromiseResultTuple[T /* <: Array[Any] */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: std.Promise<T[P]>}
    }}}
    */
  @js.native
  trait PromiseTuple[T /* <: Array[Any] */] extends StObject
}
