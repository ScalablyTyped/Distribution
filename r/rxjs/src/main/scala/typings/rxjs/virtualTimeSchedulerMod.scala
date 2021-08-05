package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.asyncActionMod.AsyncAction
import typings.rxjs.asyncSchedulerMod.AsyncScheduler
import typings.rxjs.rxjsNumbers.`-1`
import typings.rxjs.rxjsNumbers.`0`
import typings.rxjs.rxjsNumbers.`1`
import typings.rxjs.typesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualTimeSchedulerMod {
  
  @JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualAction")
  @js.native
  class VirtualAction[T] protected () extends AsyncAction[T] {
    def this(
      scheduler: VirtualTimeScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    def this(
      scheduler: VirtualTimeScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
      index: Double
    ) = this()
    
    /* protected */ var active: Boolean = js.native
    
    /* protected */ var index: Double = js.native
    
    /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler, id: js.Any): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler, id: js.Any, delay: Double): js.Any = js.native
    /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler, id: Unit, delay: Double): js.Any = js.native
    
    /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler, id: js.Any): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler, id: js.Any, delay: Double): js.Any = js.native
    /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler, id: Unit, delay: Double): js.Any = js.native
    
    /* protected */ @JSName("scheduler")
    var scheduler_VirtualAction: VirtualTimeScheduler = js.native
  }
  /* static members */
  object VirtualAction {
    
    @JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualAction")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sortActions[T](a: VirtualAction[T], b: VirtualAction[T]): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("sortActions")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  }
  
  @JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualTimeScheduler")
  @js.native
  class VirtualTimeScheduler () extends AsyncScheduler {
    def this(SchedulerAction: Instantiable2[
            /* scheduler */ AsyncScheduler, 
            /* work */ js.ThisFunction1[
              /* this */ typings.rxjs.typesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              Unit
            ], 
            AsyncAction[js.Object]
          ]) = this()
    def this(
      SchedulerAction: Instantiable2[
            /* scheduler */ AsyncScheduler, 
            /* work */ js.ThisFunction1[
              /* this */ typings.rxjs.typesMod.SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
              Unit
            ], 
            AsyncAction[js.Object]
          ],
      maxFrames: Double
    ) = this()
    def this(SchedulerAction: Unit, maxFrames: Double) = this()
    
    /**
      * Prompt the Scheduler to execute all of its queued actions, therefore
      * clearing its queue.
      * @return {void}
      */
    def flush(): Unit = js.native
    
    var frame: Double = js.native
    
    var index: Double = js.native
    
    var maxFrames: Double = js.native
  }
  /* static members */
  object VirtualTimeScheduler {
    
    @JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualTimeScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualTimeScheduler.frameTimeFactor")
    @js.native
    def frameTimeFactor: Double = js.native
    inline def frameTimeFactor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameTimeFactor")(x.asInstanceOf[js.Any])
  }
}
