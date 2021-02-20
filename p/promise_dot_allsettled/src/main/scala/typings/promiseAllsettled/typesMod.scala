package typings.promiseAllsettled

import org.scalablytyped.runtime.TopLevel
import typings.promiseAllsettled.promiseAllsettledStrings.fulfilled
import typings.promiseAllsettled.promiseAllsettledStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait PromiseRejection[E]
    extends PromiseResult[js.Any, E] {
    
    var reason: E = js.native
    
    var status: rejected = js.native
  }
  object PromiseRejection {
    
    @scala.inline
    def apply[E](reason: E, status: rejected): PromiseRejection[E] = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseRejection[E]]
    }
    
    @scala.inline
    implicit class PromiseRejectionMutableBuilder[Self <: PromiseRejection[_], E] (val x: Self with PromiseRejection[E]) extends AnyVal {
      
      @scala.inline
      def setReason(value: E): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PromiseResolution[T]
    extends PromiseResult[T, js.Any] {
    
    var status: fulfilled = js.native
    
    var value: T = js.native
  }
  object PromiseResolution {
    
    @scala.inline
    def apply[T](status: fulfilled, value: T): PromiseResolution[T] = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseResolution[T]]
    }
    
    @scala.inline
    implicit class PromiseResolutionMutableBuilder[Self <: PromiseResolution[_], T] (val x: Self with PromiseResolution[T]) extends AnyVal {
      
      @scala.inline
      def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.promiseAllsettled.typesMod.PromiseResolution[T]
    - typings.promiseAllsettled.typesMod.PromiseRejection[E]
  */
  trait PromiseResult[T, E] extends StObject
  object PromiseResult {
    
    @scala.inline
    def PromiseRejection[E](reason: E, status: rejected): typings.promiseAllsettled.typesMod.PromiseRejection[E] = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.promiseAllsettled.typesMod.PromiseRejection[E]]
    }
    
    @scala.inline
    def PromiseResolution[T](status: fulfilled, value: T): typings.promiseAllsettled.typesMod.PromiseResolution[T] = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.promiseAllsettled.typesMod.PromiseResolution[T]]
    }
  }
  
  type PromiseResultTuple[T /* <: Array[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: promise.allsettled.promise.allsettled/types.PromiseResult<T[P], unknown>}
    */ typings.promiseAllsettled.promiseAllsettledStrings.PromiseResultTuple with TopLevel[T]
  
  type PromiseTuple[T /* <: Array[js.Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.Promise<T[P]>}
    */ typings.promiseAllsettled.promiseAllsettledStrings.PromiseTuple with TopLevel[T]
}
