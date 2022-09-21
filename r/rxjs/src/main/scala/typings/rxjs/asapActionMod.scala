package typings.rxjs

import typings.rxjs.asapSchedulerMod.AsapScheduler
import typings.rxjs.asyncActionMod.AsyncAction
import typings.rxjs.internalTypesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asapActionMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/AsapAction", "AsapAction")
  @js.native
  open class AsapAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: AsapScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler): Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler, id: Any): Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler, id: Any, delay: Double): Any = js.native
    /* protected */ def recycleAsyncId(scheduler: AsapScheduler, id: Unit, delay: Double): Any = js.native
    
    /* protected */ def requestAsyncId(scheduler: AsapScheduler): Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler, id: Any): Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler, id: Any, delay: Double): Any = js.native
    /* protected */ def requestAsyncId(scheduler: AsapScheduler, id: Unit, delay: Double): Any = js.native
    
    /* protected */ @JSName("scheduler")
    var scheduler_AsapAction: AsapScheduler = js.native
  }
}
