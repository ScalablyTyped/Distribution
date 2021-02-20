package typings.promiseDag

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-dag", "implement")
  @js.native
  def implement[P /* <: js.Thenable[_] */](implementation: PromiseImplementation[P]): Run_[P] = js.native
  
  @JSImport("promise-dag", "run")
  @js.native
  val run: Run_[js.Promise[js.Any]] = js.native
  
  @js.native
  trait PromiseImplementation[P /* <: js.Thenable[_] */] extends StObject {
    
    def all(values: js.Array[_]): P = js.native
    
    def reject(value: js.Any): P = js.native
    
    def resolve(value: js.Any): P = js.native
  }
  object PromiseImplementation {
    
    @scala.inline
    def apply[P /* <: js.Thenable[_] */](all: js.Array[_] => P, reject: js.Any => P, resolve: js.Any => P): PromiseImplementation[P] = {
      val __obj = js.Dynamic.literal(all = js.Any.fromFunction1(all), reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[PromiseImplementation[P]]
    }
    
    @scala.inline
    implicit class PromiseImplementationMutableBuilder[Self <: PromiseImplementation[_], P /* <: js.Thenable[_] */] (val x: Self with PromiseImplementation[P]) extends AnyVal {
      
      @scala.inline
      def setAll(value: js.Array[_] => P): Self = StObject.set(x, "all", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReject(value: js.Any => P): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolve(value: js.Any => P): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  type Run_[P /* <: js.Thenable[_] */] = js.Function2[
    /* steps */ StringDictionary[js.Array[Step]], 
    /* required */ js.UndefOr[js.Array[String]], 
    StringDictionary[P]
  ]
  
  type Step = String | (js.Function1[/* repeated */ js.Any, js.Thenable[js.Any]])
}
