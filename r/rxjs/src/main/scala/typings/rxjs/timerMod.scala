package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/timer", JSImport.Namespace)
@js.native
object timerMod extends js.Object {
  def timer(): Observable[Double] = js.native
  def timer(
    dueTime: js.UndefOr[scala.Nothing],
    periodOrScheduler: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): Observable[Double] = js.native
  def timer(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: Double): Observable[Double] = js.native
  def timer(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: js.UndefOr[scala.Nothing], periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Double): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: Double): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Double, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Date): Observable[Double] = js.native
  def timer(dueTime: Date, periodOrScheduler: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Date, periodOrScheduler: Double): Observable[Double] = js.native
  def timer(dueTime: Date, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Date, periodOrScheduler: SchedulerLike): Observable[Double] = js.native
  def timer(dueTime: Date, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = js.native
}

