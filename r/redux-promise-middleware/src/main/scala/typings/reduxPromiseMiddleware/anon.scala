package typings.reduxPromiseMiddleware

import typings.reduxPromiseMiddleware.mod.AsyncFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var promise: js.Promise[Any] | AsyncFunction
  }
  object Data {
    
    inline def apply(promise: js.Promise[Any] | AsyncFunction): Data = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPromise(value: js.Promise[Any] | AsyncFunction): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseFunction0(value: () => js.Promise[Any]): Self = StObject.set(x, "promise", js.Any.fromFunction0(value))
    }
  }
}
