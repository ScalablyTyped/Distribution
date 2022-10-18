package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.rxjsInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalObservableTimerMod {
  
  @JSImport("rxjs/internal/observable/timer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timer(dueTime: js.Date, unused: Unit, scheduler: SchedulerLike): Observable[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], unused.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[`0`]]
  inline def timer(dueTime: Double, unused: Unit, scheduler: SchedulerLike): Observable[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(dueTime.asInstanceOf[js.Any], unused.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[`0`]]
  inline def timer(due: js.Date): Observable[`0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")(due.asInstanceOf[js.Any]).asInstanceOf[Observable[`0`]]
  inline def timer(due: js.Date, scheduler: SchedulerLike): Observable[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[`0`]]
  inline def timer(due: Double): Observable[`0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")(due.asInstanceOf[js.Any]).asInstanceOf[Observable[`0`]]
  inline def timer(due: Double, scheduler: SchedulerLike): Observable[`0`] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[`0`]]
  inline def timer(startDue: js.Date, intervalDuration: Double): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(startDue.asInstanceOf[js.Any], intervalDuration.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(startDue: js.Date, intervalDuration: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(startDue.asInstanceOf[js.Any], intervalDuration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(startDue: Double, intervalDuration: Double): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(startDue.asInstanceOf[js.Any], intervalDuration.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def timer(startDue: Double, intervalDuration: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(startDue.asInstanceOf[js.Any], intervalDuration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
}
