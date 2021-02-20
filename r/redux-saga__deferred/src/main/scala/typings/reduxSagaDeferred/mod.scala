package typings.reduxSagaDeferred

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@redux-saga/deferred", JSImport.Default)
  @js.native
  def default[R](): Deferred[R] = js.native
  
  @JSImport("@redux-saga/deferred", "arrayOfDeferred")
  @js.native
  def arrayOfDeferred[R](length: Double): js.Array[Deferred[R]] = js.native
  
  @js.native
  trait Deferred[R] extends StObject {
    
    var promise: js.Promise[R] = js.native
    
    def reject(error: js.Any): Unit = js.native
    
    def resolve(result: R): Unit = js.native
  }
  object Deferred {
    
    @scala.inline
    def apply[R](promise: js.Promise[R], reject: js.Any => Unit, resolve: R => Unit): Deferred[R] = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[Deferred[R]]
    }
    
    @scala.inline
    implicit class DeferredMutableBuilder[Self <: Deferred[_], R] (val x: Self with Deferred[R]) extends AnyVal {
      
      @scala.inline
      def setPromise(value: js.Promise[R]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReject(value: js.Any => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolve(value: R => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
