package typings.rxjs.mod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "timer")
@js.native
object timer extends js.Object {
  def apply(): Observable[Double] = js.native
  def apply(
    dueTime: js.UndefOr[scala.Nothing],
    periodOrScheduler: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): Observable[Double] = js.native
  def apply(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: Double): Observable[Double] = js.native
  def apply(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: Double): Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: Double): Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: Double, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: Date): Observable[Double] = js.native
  def apply(dueTime: Date, periodOrScheduler: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: Date, periodOrScheduler: Double): Observable[Double] = js.native
  def apply(dueTime: Date, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: Date, periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  def apply(dueTime: Date, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
}

