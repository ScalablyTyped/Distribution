package typings.reduxSagaDeferred

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@redux-saga/deferred", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[R](): Deferred[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Deferred[R]]
  
  inline def arrayOfDeferred[R](length: Double): js.Array[Deferred[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayOfDeferred")(length.asInstanceOf[js.Any]).asInstanceOf[js.Array[Deferred[R]]]
  
  trait Deferred[R] extends StObject {
    
    var promise: js.Promise[R]
    
    def reject(error: js.Any): Unit
    
    def resolve(result: R): Unit
  }
  object Deferred {
    
    inline def apply[R](promise: js.Promise[R], reject: js.Any => Unit, resolve: R => Unit): Deferred[R] = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[Deferred[R]]
    }
    
    extension [Self <: Deferred[?], R](x: Self & Deferred[R]) {
      
      inline def setPromise(value: js.Promise[R]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setReject(value: js.Any => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setResolve(value: R => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
