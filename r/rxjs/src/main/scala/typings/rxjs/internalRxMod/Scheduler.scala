package typings.rxjs.internalRxMod

import typings.rxjs.internalSchedulerAnimationFrameSchedulerMod.AnimationFrameScheduler
import typings.rxjs.internalSchedulerAsapSchedulerMod.AsapScheduler
import typings.rxjs.internalSchedulerAsyncSchedulerMod.AsyncScheduler
import typings.rxjs.internalSchedulerQueueSchedulerMod.QueueScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @typedef {Object} Rx.Scheduler
  * @property {SchedulerLike} asap Schedules on the micro task queue, which is the same
  * queue used for promises. Basically after the current job, but before the next job.
  * Use this for asynchronous conversions.
  * @property {SchedulerLike} queue Schedules on a queue in the current event frame
  * (trampoline scheduler). Use this for iteration operations.
  * @property {SchedulerLike} animationFrame Schedules work with `requestAnimationFrame`.
  * Use this for synchronizing with the platform's painting.
  * @property {SchedulerLike} async Schedules work with `setInterval`. Use this for
  * time-based operations.
  */
@JSImport("rxjs/internal/Rx", "Scheduler")
@js.native
object Scheduler extends js.Object {
  var animationFrame: AnimationFrameScheduler = js.native
  var asap: AsapScheduler = js.native
  var async: AsyncScheduler = js.native
  var queue: QueueScheduler = js.native
}

