package typings.promiseAllsettled

import org.scalablytyped.runtime.TopLevel
import typings.promiseAllsettled.promiseAllsettledStrings.fulfilled
import typings.promiseAllsettled.promiseAllsettledStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait PromiseRejection[E]
    extends StObject
       with PromiseResult[js.Any, E] {
    
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
       with PromiseResult[T, js.Any] {
    
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
  
  type PromiseResultTuple[T /* <: Array[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: promise.allsettled.promise.allsettled/types.PromiseResult<T[P], unknown>}
    */ typings.promiseAllsettled.promiseAllsettledStrings.PromiseResultTuple & TopLevel[T]
  
  type PromiseTuple[T /* <: Array[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.Promise<T[P]>}
    */ typings.promiseAllsettled.promiseAllsettledStrings.PromiseTuple & TopLevel[T]
}
