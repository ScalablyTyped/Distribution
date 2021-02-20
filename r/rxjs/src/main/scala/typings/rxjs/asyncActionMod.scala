package typings.rxjs

import typings.rxjs.actionMod.Action
import typings.rxjs.asyncSchedulerMod.AsyncScheduler
import typings.rxjs.typesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncActionMod {
  
  @JSImport("rxjs/internal/scheduler/AsyncAction", "AsyncAction")
  @js.native
  class AsyncAction[T] protected () extends Action[T] {
    def this(
      scheduler: AsyncScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    
    /* protected */ def _execute(state: T, delay: Double): js.Any = js.native
    
    /** @deprecated This is an internal implementation detail, do not use. */
    def _unsubscribe(): Unit = js.native
    
    var delay: Double = js.native
    
    /**
      * Immediately executes this action and the `work` it contains.
      * @return {any}
      */
    def execute(state: T, delay: Double): js.Any = js.native
    
    var id: js.Any = js.native
    
    var pending: Boolean = js.native
    
    /* protected */ def recycleAsyncId(scheduler: AsyncScheduler, id: js.Any): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AsyncScheduler, id: js.Any, delay: Double): js.Any = js.native
    
    /* protected */ def requestAsyncId(scheduler: AsyncScheduler): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsyncScheduler, id: js.UndefOr[scala.Nothing], delay: Double): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsyncScheduler, id: js.Any): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsyncScheduler, id: js.Any, delay: Double): js.Any = js.native
    
    var scheduler: AsyncScheduler = js.native
    
    var state: T = js.native
    
    /* protected */ def work(): Unit = js.native
    /* protected */ def work(state: T): Unit = js.native
  }
}
