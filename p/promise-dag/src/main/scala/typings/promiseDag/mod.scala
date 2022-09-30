package typings.promiseDag

import org.scalablytyped.runtime.StringDictionary
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-dag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def implement[P /* <: PromiseLike[Any] */](implementation: PromiseImplementation[P]): Run_[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(implementation.asInstanceOf[js.Any]).asInstanceOf[Run_[P]]
  
  @JSImport("promise-dag", "run")
  @js.native
  val run: Run_[js.Promise[Any]] = js.native
  
  trait PromiseImplementation[P /* <: PromiseLike[Any] */] extends StObject {
    
    def all(values: js.Array[Any]): P
    
    def reject(value: Any): P
    
    def resolve(value: Any): P
  }
  object PromiseImplementation {
    
    inline def apply[P /* <: PromiseLike[Any] */](all: js.Array[Any] => P, reject: Any => P, resolve: Any => P): PromiseImplementation[P] = {
      val __obj = js.Dynamic.literal(all = js.Any.fromFunction1(all), reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[PromiseImplementation[P]]
    }
    
    extension [Self <: PromiseImplementation[?], P /* <: PromiseLike[Any] */](x: Self & PromiseImplementation[P]) {
      
      inline def setAll(value: js.Array[Any] => P): Self = StObject.set(x, "all", js.Any.fromFunction1(value))
      
      inline def setReject(value: Any => P): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setResolve(value: Any => P): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  type Run_[P /* <: PromiseLike[Any] */] = js.Function2[
    /* steps */ StringDictionary[js.Array[Step]], 
    /* required */ js.UndefOr[js.Array[String]], 
    StringDictionary[P]
  ]
  
  type Step = String | (js.Function1[/* repeated */ Any, PromiseLike[Any]])
}
