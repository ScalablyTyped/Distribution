package typings.reduxPromiseMiddleware

import typings.reduxPromiseMiddleware.mod.AsyncFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var promise: js.Promise[js.Any] | AsyncFunction
  }
  object Data {
    
    @scala.inline
    def apply(promise: js.Promise[js.Any] | AsyncFunction): Data = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setPromise(value: js.Promise[js.Any] | AsyncFunction): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseFunction0(value: () => js.Promise[js.Any]): Self = StObject.set(x, "promise", js.Any.fromFunction0(value))
    }
  }
}
