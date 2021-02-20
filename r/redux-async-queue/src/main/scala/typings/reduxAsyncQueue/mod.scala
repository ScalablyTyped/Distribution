package typings.reduxAsyncQueue

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-async-queue", JSImport.Default)
  @js.native
  def default(): js.Function1[/* next */ js.Function1[/* action */ AnyAction, _], _] = js.native
  
  @js.native
  trait AsyncQueueAction[T /* <: Action[_] */] extends StObject {
    
    def callback(next: js.Function0[Unit], dispatch: Dispatch[T]): Unit = js.native
    
    var queue: String = js.native
  }
  object AsyncQueueAction {
    
    @scala.inline
    def apply[T /* <: Action[_] */](callback: (js.Function0[Unit], Dispatch[T]) => Unit, queue: String): AsyncQueueAction[T] = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), queue = queue.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncQueueAction[T]]
    }
    
    @scala.inline
    implicit class AsyncQueueActionMutableBuilder[Self <: AsyncQueueAction[_], T /* <: Action[_] */] (val x: Self with AsyncQueueAction[T]) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (js.Function0[Unit], Dispatch[T]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
}
