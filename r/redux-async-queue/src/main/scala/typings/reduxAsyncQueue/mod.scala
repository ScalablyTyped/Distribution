package typings.reduxAsyncQueue

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-async-queue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[/* next */ js.Function1[/* action */ AnyAction, Any], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* next */ js.Function1[/* action */ AnyAction, Any], Any]]
  
  trait AsyncQueueAction[T /* <: Action[Any] */] extends StObject {
    
    def callback(next: js.Function0[Unit], dispatch: Dispatch[T]): Unit
    
    var queue: String
  }
  object AsyncQueueAction {
    
    inline def apply[T /* <: Action[Any] */](callback: (js.Function0[Unit], Dispatch[T]) => Unit, queue: String): AsyncQueueAction[T] = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncQueueAction[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncQueueAction[?], T /* <: Action[Any] */] (val x: Self & AsyncQueueAction[T]) extends AnyVal {
      
      inline def setCallback(value: (js.Function0[Unit], Dispatch[T]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
}
