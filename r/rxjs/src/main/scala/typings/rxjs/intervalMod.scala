package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intervalMod {
  
  @JSImport("rxjs/internal/observable/interval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def interval(): Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")().asInstanceOf[Observable[Double]]
  @scala.inline
  def interval(period: Double): Observable[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")(period.asInstanceOf[js.Any]).asInstanceOf[Observable[Double]]
  @scala.inline
  def interval(period: Double, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
  @scala.inline
  def interval(period: Unit, scheduler: SchedulerLike): Observable[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[Double]]
}
