package typings.rxjs

import typings.rxjs.internalSchedulerMod.Scheduler
import typings.rxjs.internalSubscriptionMod.Subscription
import typings.rxjs.internalTypesMod.SchedulerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/Action", JSImport.Namespace)
@js.native
object internalSchedulerActionMod extends js.Object {
  @js.native
  class Action[T] protected () extends Subscription {
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
  }
  
}

