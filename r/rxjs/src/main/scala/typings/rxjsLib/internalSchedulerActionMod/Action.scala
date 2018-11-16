package typings
package rxjsLib.internalSchedulerActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/scheduler/Action", "Action")
@js.native
class Action[T] protected ()
  extends rxjsLib.internalSubscriptionMod.Subscription {
  def this(scheduler: rxjsLib.internalSchedulerMod.Scheduler, work: js.ThisFunction1[
      /* this */ rxjsLib.internalTypesMod.SchedulerAction[T], 
      /* state */ js.UndefOr[T], 
      scala.Unit
    ]) = this()
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
  def schedule(): rxjsLib.internalSubscriptionMod.Subscription = js.native
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
  def schedule(state: T): rxjsLib.internalSubscriptionMod.Subscription = js.native
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
  def schedule(state: T, delay: scala.Double): rxjsLib.internalSubscriptionMod.Subscription = js.native
}

