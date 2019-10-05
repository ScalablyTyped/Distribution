package typings.rxjs.rxjsMod

import typings.rxjs.internalTypesMod.SchedulerLike
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "timer")
@js.native
object timer extends js.Object {
  def apply(): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Double): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: Double): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: Double, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Date): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Date, periodOrScheduler: Double): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Date, periodOrScheduler: Double, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Date, periodOrScheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[Double] = js.native
  def apply(dueTime: Date, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[Double] = js.native
}

