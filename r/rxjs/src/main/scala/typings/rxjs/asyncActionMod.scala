package typings.rxjs

import typings.rxjs.actionMod.Action
import typings.rxjs.asyncSchedulerMod.AsyncScheduler
import typings.rxjs.internalTypesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncActionMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/AsyncAction", "AsyncAction")
  @js.native
  open class AsyncAction[T] protected () extends Action[T] {
    def this(
      scheduler: AsyncScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    
    /* protected */ def _execute(state: T, _delay: Double): Any = js.native
    
    var delay: Double = js.native
    
    /**
      * Immediately executes this action and the `work` it contains.
      * @return {any}
      */
    def execute(state: T, delay: Double): Any = js.native
    
    var id: Any = js.native
    
    /* protected */ var pending: Boolean = js.native
    
    /* protected */ def recycleAsyncId(_scheduler: AsyncScheduler, id: Any): Any = js.native
    /* protected */ def recycleAsyncId(_scheduler: AsyncScheduler, id: Any, delay: Double): Any = js.native
    
    /* protected */ def requestAsyncId(scheduler: AsyncScheduler): Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsyncScheduler, _id: Any): Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsyncScheduler, _id: Any, delay: Double): Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsyncScheduler, _id: Unit, delay: Double): Any = js.native
    
    /* protected */ var scheduler: AsyncScheduler = js.native
    
    var state: js.UndefOr[T] = js.native
    
    /* protected */ def work(): Unit = js.native
    /* protected */ def work(state: T): Unit = js.native
  }
}
