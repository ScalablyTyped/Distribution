package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.distTypesInternalSchedulerAsyncActionMod.AsyncAction
import typings.rxjs.distTypesInternalSchedulerAsyncSchedulerMod.AsyncScheduler
import typings.rxjs.distTypesInternalTypesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalSchedulerVirtualTimeSchedulerMod {
  
  @JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualAction")
  @js.native
  open class VirtualAction[T] protected ()
    extends typings.rxjs.distTypesInternalSchedulerVirtualTimeSchedulerMod.VirtualAction[T] {
    def this(
      scheduler: typings.rxjs.distTypesInternalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    def this(
      scheduler: typings.rxjs.distTypesInternalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
      index: Double
    ) = this()
  }
  /* static members */
  object VirtualAction {
    
    @JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualAction")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualAction.sortActions")
    @js.native
    def sortActions: Any = js.native
    inline def sortActions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sortActions")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualTimeScheduler")
  @js.native
  /**
    * This creates an instance of a `VirtualTimeScheduler`. Experts only. The signature of
    * this constructor is likely to change in the long run.
    *
    * @param schedulerActionCtor The type of Action to initialize when initializing actions during scheduling.
    * @param maxFrames The maximum number of frames to process before stopping. Used to prevent endless flush cycles.
    */
  open class VirtualTimeScheduler ()
    extends typings.rxjs.distTypesInternalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler {
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
  }
  /* static members */
  object VirtualTimeScheduler {
    
    @JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualTimeScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    /** @deprecated Not used in VirtualTimeScheduler directly. Will be removed in v8. */
    @JSImport("rxjs/internal/scheduler/VirtualTimeScheduler", "VirtualTimeScheduler.frameTimeFactor")
    @js.native
    def frameTimeFactor: Double = js.native
    inline def frameTimeFactor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameTimeFactor")(x.asInstanceOf[js.Any])
  }
}
