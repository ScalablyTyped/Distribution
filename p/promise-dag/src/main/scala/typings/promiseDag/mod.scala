package typings.promiseDag

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-dag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def implement[P /* <: js.Thenable[js.Any] */](implementation: PromiseImplementation[P]): Run_[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(implementation.asInstanceOf[js.Any]).asInstanceOf[Run_[P]]
  
  @JSImport("promise-dag", "run")
  @js.native
  val run: Run_[js.Promise[js.Any]] = js.native
  
  trait PromiseImplementation[P /* <: js.Thenable[js.Any] */] extends StObject {
    
    def all(values: js.Array[js.Any]): P
    
    def reject(value: js.Any): P
    
    def resolve(value: js.Any): P
  }
  object PromiseImplementation {
    
    @scala.inline
    def apply[P /* <: js.Thenable[js.Any] */](all: js.Array[js.Any] => P, reject: js.Any => P, resolve: js.Any => P): PromiseImplementation[P] = {
      val __obj = js.Dynamic.literal(all = js.Any.fromFunction1(all), reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[PromiseImplementation[P]]
    }
    
    @scala.inline
    implicit class PromiseImplementationMutableBuilder[Self <: PromiseImplementation[?], P /* <: js.Thenable[js.Any] */] (val x: Self & PromiseImplementation[P]) extends AnyVal {
      
      @scala.inline
      def setAll(value: js.Array[js.Any] => P): Self = StObject.set(x, "all", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReject(value: js.Any => P): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolve(value: js.Any => P): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  type Run_[P /* <: js.Thenable[js.Any] */] = js.Function2[
    /* steps */ StringDictionary[js.Array[Step]], 
    /* required */ js.UndefOr[js.Array[String]], 
    StringDictionary[P]
  ]
  
  type Step = String | (js.Function1[/* repeated */ js.Any, js.Thenable[js.Any]])
}
