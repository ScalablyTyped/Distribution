package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timerMod {
  
  @JSImport("rxjs/internal/observable/timer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def timer(): Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")().asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Double): Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any]).asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Double, periodOrScheduler: Double): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Double, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Double, periodOrScheduler: Unit, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Double, periodOrScheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Double, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Unit, periodOrScheduler: Double): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Unit, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Unit, periodOrScheduler: Unit, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Unit, periodOrScheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Unit, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Date): Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any]).asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Date, periodOrScheduler: Double): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Date, periodOrScheduler: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Date, periodOrScheduler: Unit, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Date, periodOrScheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  @scala.inline
  def timer(dueTime: Date, periodOrScheduler: SchedulerLike, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], periodOrScheduler.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
}
