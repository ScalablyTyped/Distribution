package typings.rxjs

import typings.rxjs.distTypesInternalSchedulerMod.Scheduler
import typings.rxjs.distTypesInternalSubscriptionMod.Subscription
import typings.rxjs.distTypesInternalTypesMod.SchedulerAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalSchedulerActionMod {
  
  @JSImport("rxjs/dist/types/internal/scheduler/Action", "Action")
  @js.native
  open class Action[T] protected () extends Subscription {
    def this(
      scheduler: Scheduler,
      work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
    ) = this()
    
    /**
      * Schedules this action on its parent {@link SchedulerLike} for execution. May be passed
      * some context object, `state`. May happen at some point in the future,
      * according to the `delay` parameter, if specified.
      * @param {T} [state] Some contextual data that the `work` function uses when
      * called by the Scheduler.
      * @param {number} [delay] Time to wait before executing the work, where the
      * time unit is implicit and defined by the Scheduler.
      * @return {void}
      */
    def schedule(): Subscription = js.native
    def schedule(state: T): Subscription = js.native
    def schedule(state: T, delay: Double): Subscription = js.native
    def schedule(state: Unit, delay: Double): Subscription = js.native
  }
}
