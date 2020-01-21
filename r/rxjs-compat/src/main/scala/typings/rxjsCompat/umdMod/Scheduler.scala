package typings.rxjsCompat.umdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @typedef {Object} Rx.Scheduler
  * @property {Scheduler} queue Schedules on a queue in the current event frame
  * (trampoline scheduler). Use this for iteration operations.
  * @property {Scheduler} asap Schedules on the micro task queue, which is the same
  * queue used for promises. Basically after the current job, but before the next
  * job. Use this for asynchronous conversions.
  * @property {Scheduler} async Schedules work with `setInterval`. Use this for
  * time-based operations.
  * @property {Scheduler} animationFrame Schedules work with `requestAnimationFrame`.
  * Use this for synchronizing with the platform's painting
  */
@JSImport("rxjs-compat/umd", "Scheduler")
@js.native
object Scheduler extends js.Object {
  var animationFrame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any = js.native
  var asap: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any = js.native
  var async: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any = js.native
  var queue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any = js.native
}

