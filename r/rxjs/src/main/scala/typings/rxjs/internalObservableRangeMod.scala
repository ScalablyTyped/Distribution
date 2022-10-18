package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalObservableRangeMod {
  
  @JSImport("rxjs/internal/observable/range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def range(start: Double): Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any]).asInstanceOf[Observable[Double]]
  inline def range(start: Double, count: Double): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def range(start: Double, count: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  inline def range(start: Double, count: Unit, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], count.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
}
