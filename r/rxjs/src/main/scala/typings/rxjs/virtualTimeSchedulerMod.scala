package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.asyncActionMod.AsyncAction
import typings.rxjs.asyncSchedulerMod.AsyncScheduler
import typings.rxjs.internalTypesMod.SchedulerAction
import typings.rxjs.timerHandleMod.TimerHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualTimeSchedulerMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/VirtualTimeScheduler", "VirtualAction")
  @js.native
  open class VirtualAction[T] protected () extends AsyncAction[T] {
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
    
    /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler): js.UndefOr[TimerHandle] = js.native
    /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler, id: Any): js.UndefOr[TimerHandle] = js.native
    /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler, id: Any, delay: Double): js.UndefOr[TimerHandle] = js.native
    /* protected */ def recycleAsyncId(scheduler: VirtualTimeScheduler, id: Unit, delay: Double): js.UndefOr[TimerHandle] = js.native
    
    /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler): TimerHandle = js.native
    /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler, id: Any): TimerHandle = js.native
    /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler, id: Any, delay: Double): TimerHandle = js.native
    /* protected */ def requestAsyncId(scheduler: VirtualTimeScheduler, id: Unit, delay: Double): TimerHandle = js.native
    
    /* protected */ @JSName("scheduler")
    var scheduler_VirtualAction: VirtualTimeScheduler = js.native
  }
  /* static members */
  object VirtualAction {
    
    @JSImport("rxjs/dist/types/internal/scheduler/VirtualTimeScheduler", "VirtualAction")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/dist/types/internal/scheduler/VirtualTimeScheduler", "VirtualAction.sortActions")
    @js.native
    def sortActions: Any = js.native
    inline def sortActions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sortActions")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs/dist/types/internal/scheduler/VirtualTimeScheduler", "VirtualTimeScheduler")
  @js.native
  /**
    * This creates an instance of a `VirtualTimeScheduler`. Experts only. The signature of
    * this constructor is likely to change in the long run.
    *
    * @param schedulerActionCtor The type of Action to initialize when initializing actions during scheduling.
    * @param maxFrames The maximum number of frames to process before stopping. Used to prevent endless flush cycles.
    */
  open class VirtualTimeScheduler () extends AsyncScheduler {
    def this(schedulerActionCtor: Instantiable2[
            /* scheduler */ AsyncScheduler, 
            /* work */ js.ThisFunction1[
              /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              Unit
            ], 
            AsyncAction[js.Object]
          ]) = this()
    def this(
      schedulerActionCtor: Instantiable2[
            /* scheduler */ AsyncScheduler, 
            /* work */ js.ThisFunction1[
              /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
              Unit
            ], 
            AsyncAction[js.Object]
          ],
      maxFrames: Double
    ) = this()
    def this(schedulerActionCtor: Unit, maxFrames: Double) = this()
    
    /**
      * Prompt the Scheduler to execute all of its queued actions, therefore
      * clearing its queue.
      * @return {void}
      */
    def flush(): Unit = js.native
    
    /**
      * The current frame for the state of the virtual scheduler instance. The difference
      * between two "frames" is synonymous with the passage of "virtual time units". So if
      * you record `scheduler.frame` to be `1`, then later, observe `scheduler.frame` to be at `11`,
      * that means `10` virtual time units have passed.
      */
    var frame: Double = js.native
    
    /**
      * Used internally to examine the current virtual action index being processed.
      * @deprecated Internal implementation detail, do not use directly. Will be made internal in v8.
      */
    var index: Double = js.native
    
    var maxFrames: Double = js.native
  }
  /* static members */
  object VirtualTimeScheduler {
    
    @JSImport("rxjs/dist/types/internal/scheduler/VirtualTimeScheduler", "VirtualTimeScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    /** @deprecated Not used in VirtualTimeScheduler directly. Will be removed in v8. */
    @JSImport("rxjs/dist/types/internal/scheduler/VirtualTimeScheduler", "VirtualTimeScheduler.frameTimeFactor")
    @js.native
    def frameTimeFactor: Double = js.native
    inline def frameTimeFactor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameTimeFactor")(x.asInstanceOf[js.Any])
  }
}
